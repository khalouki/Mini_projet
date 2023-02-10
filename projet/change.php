<?php
      $ms=$ms2=$MS='';
      $conn=mysqli_connect('localhost','root','','information');
      if(isset($_POST['valide'])){
         $nm=$_GET['name'];
         $nov=$_POST['nov'];
         $conf=$_POST['confirm'];
         $anc=$_POST['anc'];
         $requ="SELECT *FROM users where nom='$nm'";
         $res=mysqli_query($conn,$requ);
         $et=mysqli_fetch_array($res);
         if($et['password']==$anc){
            if($conf==$nov){
                $requ="UPDATE users SET password='$nov' where nom='$nm'";
                mysqli_query($conn,$requ);
                $MS="<script  src='jquery-3.6.0.min.js'></script>
                     <script src='sweetalert2.all.min.js'></script>
                     <script language=javascript>
                   Swal.fire(
                  'bien!',
                  'le mot de pass a etait changer',
                  'success'
            )
               </script>";
            }
            else{
                $ms='<p>mot de pass incorect!</p>';
            }
         }
         else{
            $ms2='<p>mot de pass incorect!</p>';
         }
      }

?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>changer le mot pass</title>
</head>
<style>
     body{
       background:linear-gradient(89deg, #afe1ed, transparent);
     }
     p{
        margin: 0;
    position: relative;
    left: 75px;
    color: red;
     }
     form{
         position: fixed;
         width:469px;
         height:318px;
         left:420px;
         top:185px;
         background:#738d8d4f;
        border-radius:10px;
        box-shadow:0 0 20px; 
     }
     input{
          width:300px;
          height:32px;
          margin-left:72px;
          font-size:10px;
     }
     h3{
        margin:12PX;
        margin-left:72px;
     }
     h1{
          position: fixed;
         left:380px;
     }
     button{
        width:120px;
        height:45px;
        position: relative;
        left:160px;
        margin-top:16px;
        font-size:18;
        cursor: pointer;
     }
     button:hover{
        background:blue;
        color:white;
     }
     h1{
    position: fixed;
    left: 34%;
    top: 4px;
    font-size: 35px;
    color: black;
  }
  nav{
    height: 111px;
    background-color: #77c9c9;
    position: relative;
    top: 1px;
    box-shadow: 0 0 20px black;
}
a{
   margin-right: 36px;
    margin-top: 13px;
    float: right;
    font-size: 22px;
}
</style>
<body>
     <nav>
      <h1>modification de mot de pass</h1>
      <a href="GESTIONCLIENT.php">Accueille</a>
   </nav>
      <?php echo $MS;?>
       <form method="POST">
            <h3>ancienne mot de pass</h3>
            <input type="password" name="anc"><br>
            <?php echo $ms2 ?>
            <h3>noveaux mot de pass</h3>
            <input type="password" name="confirm">
            <h3>confirmer le mot de pass</h3>
            <input type="password" name="nov"><br>
            <?php echo $ms ?>
            <button name="valide" >valider</button>
     </form>
</body>
</html>