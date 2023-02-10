<!DOCTYPE html>
<html>
    <head>
        <title>nouvelle transaction</title>
        <link rel="stylesheet" href="formular.css">
    </head>
    <body>
      <?php include 'include.php'?>
<?php
   $m= $MS=$nn=$pp=$bb=$cc="";
$con=mysqli_connect('localhost','root','','information') or die("echec");
   if(isset($_POST['save'])){
    $nn=$_POST['nm'];
    $pp=$_POST['prenom'];
    $bb=$_POST['budger'];
    $cc=$_POST['cne'];
    if(empty($_POST['nm']) || empty($_POST['prenom']) || empty($_POST['budger']) || empty($_POST['date'])){
        $MS="<script  src='jquery-3.6.0.min.js'></script>
               <script src='sweetalert2.all.min.js'></script>
                <script language=javascript>
                Swal.fire(
                    'champs vide?',
                    'remplir tout les chapms?',
                    'question'
      )    
      </script>";
    }
    else{
        $idd=$_SESSION['id'];
        $n=$_POST['nm'];
        $p=$_POST['prenom'];
        $b=$_POST['budger'];
        $d=$_POST['date'];
        $m=$_POST['moyen'];
        $c=$_POST['cne'];
        $check=$_POST['genre'];
        $requ="INSERT INTO client(nom,prenom,montant,la_date,moyen,cne,genre,id_users) VALUES ('$n','$p','$b','$d','$m','$c','$check','$idd')";
        if(mysqli_query($con,$requ)){
          $m="<script  src='jquery-3.6.0.min.js'></script>
                <script src='sweetalert2.all.min.js'></script>
                <script language=javascript>
                Swal.fire(
                'succed!',
                'operation  effectuer!',
                'success'
              )
              
              </script>";
              }
       }
    }
?>
      <?php  echo $m.$MS;?>
      
      <form class="formulair" method="POST" action="">
      <h1>Informations de client</h1><hr>
             <label for=""> Prenom<span style="color:red;">*</span></label>
             <label for=""> Nom<span style="color:red;">*</span></label>
             <label for="" style="margin-left:49px"> CNE<span style="color:red;">*</span></label><BR>
             <input type="text" value="<?php echo $nn; ?>" name="nm">
             <input type="text" value="<?php echo $pp ?>" name="prenom">
             <input type="text" value="<?php echo $cc ?>" name="cne"><br>
             <label for=""> Montant<span style="color:red;">*</span></label>
             <label for=""> Moyen<span style="color:red;">*</span></label>
             <label for="" style="margin-left:38px"> Date<span style="color:red;">*</span></label><br>
             <input type="text" value="<?php echo $bb ?>" name="budger">
           <select name="moyen" id="">
                 <option value="riya">Riya</option>
                 <option value="monygram">Monygram</option>
                 <option value="westren">westren-union</option>
           </select>
            <input type="date" name="date"><br>
            <div class="radio">
           <input type="radio" class="rad" name="genre" value="in">
           <label for="">reception</label>
             <input type="radio" class="rad" name="genre" value="ex">
             <label for="">envoi</label>
           </div>
             <button class="bot" name="save">sauvgarder</button>
           </form>

         
    </body>
</html> 