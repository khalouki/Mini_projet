<?php 
  include "include.php"
  ?>
  <?php
     $m=$MS="";
     $con=mysqli_connect('localhost','root','','information') or die("echec");
        if(isset($_POST['save'])){
         $nn=$_POST['nm'];
         $pp=$_POST['prenom'];
         $cc=$_POST['date'];
         if(empty($_POST['nm']) || empty($_POST['prenom']) ||  empty($_POST['date'])){
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
             $d=$_POST['date'];
             $requ="INSERT INTO render(nom,prenom,date,id_users) VALUES ('$n','$p','$d','$idd')";
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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>render-vous</title>
    <link rel="stylesheet" href="render-vous.css">
</head>
<body>
         <div class="block">
            <div class="block2"><h3>render vous de la carte CNE</h3></div>
            <form method="POST">
             <input type="text" placeholder="donner le nom" name="nm"><BR>
             <input type="text" placeholder="donner le prenom" name="prenom"><br>
             <input type="date" placeholder="donner la date" name="date"><br>
              <input type="submit" value="suavgarder" name="save">  
            </form>
         </div>
</body>
</html>