<?php
  include 'include.php';
  $id= $_SESSION['id'];
  $conn=mysqli_connect('localhost','root','','information');
  $requ="SELECT *FROM client where genre='ex' and id_users='$id'";
  $requ2="SELECT *FROM client where genre='in' and id_users='$id'";
  $requ3="SELECT *FROM render where id_users='$id'";
  $res=mysqli_query($conn,$requ);
  $res2=mysqli_query($conn,$requ2);
  $res3=mysqli_query($conn,$requ3);
  $et=mysqli_num_rowS($res);
  $et2=mysqli_num_rowS($res2);
  $et3=mysqli_num_rows($res3);
?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page Accueil</title>
    <style>
        .div1{
          background: azure;
          position: relative;
          left: 84%;
          top: 121px;
          width: 245%;
          height: 467px;
          box-shadow:0 0 20px rgb(0 0 0 / 15%);
        }
        .div2{
          background: beige;
          width: 29%;
          HEIGHT: 431px;
        }
        .div3{
          background: #2828ff82;
    width: 100%;
    height: 38px;
    margin: 0;
    border: 18px;
        }
        h3{
          position: absolute;
         top: 8px;
         left: 34%;
         text-decoration:underline;
        }
        .div4{
          height: 179px;
          background: whitesmoke;
          width: 80%;
          margin: 0px 37px 49px 28px;
          position: relative;
          top: 16px;
        }
        .div4 img{
          width: 299PX;
          height: 177px;
          position: relative;
          top: -57px;
        }
        .div1 h4{
          position: relative;
          bottom: 399px;
          left: 308px;
          margin-bottom: 84px;
        }
        .mod{
          position: fixed;
          top: 86%;
          left: 23%;
    width: 180px;
    height: 37px;
    cursor: pointer;
    border-radius: 15px;
    font-size: 14px;
    color: blue;
     }
   .div1 p{
    margin-left:52px;
    font-size:19px;
   }
    </style>
</head>
  
<body>
    <div class="div1">
      <div class="div3"><h3>informations personnel</h3></div>
        <div class="div2">
           <div class="div4">
               <img src="http://localhost/test/image/<?php echo $_SESSION['im']?>" alt="">
           </div>
           <p><?php echo $_SESSION['nm'].'&emsp;'.$_SESSION['pre'] ?></p>
           <a href="change.php?name=<?php echo $_SESSION['nm'] ?>" class="mod">changer le mot de pass</a>
        </div>
          <h4>Nombre  operations de l'envoi :<?php echo '&emsp;'.$et ?></h4>
          <h4>Nombre operations de Reception :<?php echo '&emsp;'.$et2 ?></h4>
          <h4>Nombre de demande de la carte national:<?php echo '&emsp;'.$et3 ?></h4>
          <h4> Gmail:<?php echo '&emsp;'.$_SESSION['gm'] ?></h4>
    </div>
</body>
</html>