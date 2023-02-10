<?php
   $ms=$ss=$messa="";
   static $id=0;
  $con=mysqli_connect('localhost','root','','information');
  ////////////////////////inscrire//////////////////////////////////
  if(isset($_POST['sign'])){
    $n=$_POST['nom'];
    $p=$_POST['prenom'];
    $g=$_POST['gmail'];
    $m=$_POST['mot']; 
    $im=$_POST['img'];
      if(empty($p) or empty($n) or empty($g) or empty($m) or empty($im)){
          $messa="<script  src='jquery-3.6.0.min.js'></script>
          <script src='sweetalert2.all.min.js'></script>
        <script language=javascript>
          Swal.fire(
          'EREUR!',
          'les champs est vide!',
          'error'
         )
      </script>";
      }
      else{
    $requ="INSERT INTO users values ('$n','$p','$g','$m','$id','$im')";
    if(mysqli_query($con,$requ)){
          $ss="<script  src='jquery-3.6.0.min.js'></script>
          <script src='sweetalert2.all.min.js'></script>
        <script language=javascript>
          Swal.fire(
          'bien!',
          'le compte a etait cree! click pour conextion',
          'success'
      )
         </script>";
         $id++;
    };
  }
} 
  //////////////////////connection///////////////////////////////////////
  if(isset($_POST['login'])){
    $name=$_POST['gmail'];
    $m=$_POST['mot'];
    if(empty($m) || empty($name)){
      $ms="<script  src='jquery-3.6.0.min.js'></script>
          <script src='sweetalert2.all.min.js'></script>
    <script language=javascript>
      Swal.fire(
      'EREUR!',
      'les champs est vide!',
      'error'
     )
  </script>";
    }
    else{
      $req="SELECT *FROM users where gmail='$name' and password='$m'";
      $res=mysqli_query($con,$req);
      $et=mysqli_fetch_array($res);
      if(empty($et)){
         $ms="<script  src='jquery-3.6.0.min.js'></script>
              <script src='sweetalert2.all.min.js'></script>
              <script language=javascript>
                Swal.fire(
                'EREUR!',
                'mot de pass ou gmail incorret!',
                'error'
               )
            </script>";
        }
      else{
          session_start();
          $g=$_POST['gmail'];
          $m=$_POST['mot'];
          $req="SELECT *FROM users where gmail='$g' and password='$m'";
          $res=mysqli_query($con,$req);
          $et=mysqli_fetch_array($res);
          $_SESSION['nm']=$et['nom'];
          $_SESSION['pre']=$et['prenom'];
          $_SESSION['gm']=$et['gmail'];
          $_SESSION['id']=$et['id'];
          $_SESSION['im']=$et['ima'];
          header('location:GESTIONCLIENT.php');
      }
    }
   
  }
?>
<html lang="ar">
<head>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="logcon.css">
    <link rel="stylesheet" href="fontawesome.min.css">
    <link rel="stylesheet" href="all.min.css">
</head>
<body>
  <div class="title">
       <img src="cashplus.png" width="40">

      <ul>
            <li><p>transfer National d'argent</p></li>
            <li><p>transfert international d'argent</p></li>
            <li><p>Paiement taxes et impots</p></li>
            <li><p>Recharge rapide et paiment des facture</p></li>
       
         </ul>
  </div>
    <!------------------LOG IN----------------------------------------------!-->
    <div class="div1" id="div1">
        <?php echo $ms.$ss.$messa; ?>
        <form method="POST">
          <h1>Connexion</h1>
            <input type="text" name="gmail" placeholder="Adress e-eamil ou mot de pass"><br><br>
              <input type="password" name="mot" placeholder="Mot de pass">
              <button name="login" class="btn1">Se connecter</button>
              <a href="oublier.php">Mot de pass oublier ?</a><hr>
          </form>
          <button onclick="show1()" class="btn2">Cree un compte</button>
    </div> 
    <!------------------Sing up-----------------------------------------------!-->
    <div class="div2" id="div2">
      <form method="POST" class="cree">
           <h1 style="font-size:36px;">Cree un compte</h1>
            <hr>
            <h3> Prenom<span style="color:red;">*</span></h3>
             <input type="text" name="nom" placeholder="Entre le prenom"><br>
             <h3> Nom<span style="color:red;">*</span></h3>
             <input type="text" name="prenom" placeholder="Entre le nom"><br>
             <h3>Gmail <span style="color:red;">*</span></h3>
             <input type="email" name="gmail" placeholder="exemple@gmail.com"><br>
              <h3>Mot d pass <span style="color:red;">*</span></h3>
              <input  type="Password"  name="mot" placeholder="Entre youre Password"><br>
                <h3>(image doit etre dans le Dossier test)<span style="color:red;">*</span></h3>
                <input type="file" name="img">
                 <button  style="background:green;" name="sign">sauvgarder</button><br><br><hr>
</form>
</div>
         <script>
             let a=document.getElementById("div1");
             let a1=document.getElementById("div2");
             function show1(){
                 a.classList.add("open2");
                 a1.classList.add("open1");
             }
             function show2(){
              a.classList.remove("open2");
              a1.classList.remove("open1");
             }
           
         </script>
</body>
</html>