<?php
 $con=mysqli_connect('localhost','root','','information') or die('impossible de connection');
 $n=$_GET['id'];
 $requ="DELETE FROM client where id='$n'";
 $res=mysqli_query($con,$requ);
        header("location:operation sortie.php");
?>