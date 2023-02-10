<?php 
   $con=mysqli_connect('localhost','root','','information') or die('impossible de connection');
   $nn=$_GET['id'];
    $requ="SELECT *from client where id='$nn'";
    $res=mysqli_query($con,$requ);
    $et=mysqli_fetch_array($res);
    if(isset($_POST['save'])){
        $n=$_POST['nom'];
        $p=$_POST['prenom'];
        $b=$_POST['montant'];
        $m=$_POST['moyen'];
        $c=$_POST['cne'];
        $requ2="UPDATE client SET nom='$n',prenom='$p',montant='$b',moyen='$m',cne='$c' where id='$nn';";
        mysqli_query($con,$requ2);
       header("location:operation entrer.php");
    }
   ?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>changer les information</title>
    <style>
        body{
            background: linear-gradient(30deg, #6dc6cf, transparent);
        }
         form{
            position: fixed;
    width: 541px;
    height: 496px;
    left: 420px;
    top: 76px;
    background: #738d8d4f;
    border-radius: 10px;
    box-shadow: 0 0 20px; 
     }
    input{ 
        width: 398px;
    height: 43px;
    margin-left: 72px;
    font-size: 28px;
    margin-top: 41px;
     }
     .bot{
        width: 208px;
    height: 45px;
    position: relative;
    left: 104px;
    margin-top: 16px;
    font-size: 18;
    cursor: pointer;
     }
     .bot:hover{
        background:blue;
        color:white;
     }
     a{
   margin-right: 36px;
    margin-top: 13px;
    float: right;
    font-size: 22px;
}
    </style>
</head>
<body>
      <a href="GESTIONCLIENT.php">Accueille</a>
      <form method="POST">
            <input type="text" name="nom" value="<?php echo $et['nom'] ?>"><br>
            <input type="text" name="prenom"  value="<?php echo $et['prenom'] ?>">
            <input type="text" name="montant"  value="<?php echo $et['montant'] ?>" >
            <input type="text" name="moyen"  value="<?php echo $et['moyen'] ?>">
            <input type="text" name="cne"  value="<?php echo $et['cne'] ?>"><br>
            <input type="submit" class="bot" value="valider" name="save">
     </form>
</body>
</html>