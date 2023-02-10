
<?php
    $con=mysqli_connect('localhost','root','','information') or die('impossible de connection');
    $requ=("SELECT  *FROM client where genre='ex' ");
    $res=mysqli_query($con,$requ);
?>
<!DOCTYPE html>
<html>
    <head>
        <title>les operation sortie</title>
        <link rel="stylesheet" href="historique.css"/>
    </head>
    <body>
    <?php include 'include.php' ?>
    <form class="tous" method="POST">
            <input type="text" placeholder="donner le nom" name="nom">
            <input type="text" placeholder="donner le prenom" name="prenom">
            <input type="date" placeholder="donner la date" name="date"><br> 
            <input style="margin-left: 313px;" type="text" placeholder="donner le CNE" name="cne"><br>
               <input type="submit" value="chercher" class="find" name="find">
</form>
    <table class="style">
        <thead>
            <tr>
                <th> NOM</th>
                <th> PRENOM</th>
                <th> montant</th>
                <th> DATE</th>
                <th> MOYEN</th>
                <th> CNE</th>
                <th>MODIFIER</th>
                <th>suprimer</th>
            </tr>
            <tbody>
            <?php
       $con=mysqli_connect('localhost','root','','information') or die('impossible de connection');
       if(isset($_POST['find'])){
          $n=$_POST['nom'];
          $p=$_POST['prenom'];
          $c=$_POST['cne'];
          $idd=$_SESSION['id'];
          $requ=("SELECT  *FROM client where nom='$n' AND prenom='$p' AND cne='$c' and genre='ex' and id_users='$idd'");
          $res=mysqli_query($con,$requ);
          $et=mysqli_fetch_array($res);
          if(empty($et)){
              echo '<h1 class="message">il y aucun client  !!!</h1>';
           }
         else{
        do{
          $n=$et['nom'];
          $p=$et['prenom'];
          $m=$et['montant'];
          $d=$et['la_date'];
          $y=$et['moyen'];
          $c=$et['cne'];
          $id=$et['id'];

          ?>
          <tr>
              <td><?php echo $n?></td>
              <td><?php echo $p?></td>
             <td><?php echo $m?></td>
             <td><?php echo $d?></td>
             <td><?php echo $y?></td>
             <td><?php echo $c?></td>
             <td><button  class="mod"><a href="modifier.php?id=<?= $id?>">modifer</a></button></td>
             <td><button class="sup" ><a href="suprimer.php?id=<?= $id?>">suprimer</a></button></td>
        </tr>
    <?php
        }while( $et=mysqli_fetch_array($res));
       }
    }
    else{
        $idd=$_SESSION['id'];
        $requ="SELECT *FROM client where genre='ex'and id_users='$idd'";
        $res=mysqli_query($con,$requ);
        $et=mysqli_fetch_array($res);
          if(empty($et)){
             echo '<h1 class="message">il y aucun client  !!!</h1>';
          }
          else{
            do{
                $n=$et['nom'];
                $p=$et['prenom'];
                $m=$et['montant'];
                $d=$et['la_date'];
                $y=$et['moyen'];
                $c=$et['cne'];
                $id=$et['id'];
                ?>
                    <tr>
                        <td><?php echo $n?></td>
                        <td><?php echo $p?></td>
                       <td><?php echo $m?></td>
                       <td><?php echo $d?></td>
                       <td><?php echo $y?></td>
                       <td><?php echo $c?></td>
                       <td><button  class="mod"><a href="modifier.php?id=<?= $id?>">modifer</a></button></td>
                       <td><button class="sup" ><a href="suprimer.php?id=<?= $id?>">suprimer</a></button></td>
                  </tr>
              <?php
              }while($et=mysqli_fetch_array($res));
          }
      
    }
    ?>
            </tbody>
        </thead>
    </table>
    </body>
</html>