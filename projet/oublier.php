<?php
   $ms="";
   if(isset($_POST['annuler'])){
      header("location:logcon.php");
   }
   if(isset($_POST['valider'])){
    $personne=$_POST['gmail'];
    $from="abdelkhalkessaid1@gmail.com";
    $to=$personne;
    $subjet="recupuration de mot pass";
    $message="votre code recupuration est:123456fa";
    $header="From:".$from;
    if(mail($to,$subjet,$message,$header)){
        $ms="<script  src='jquery-3.6.0.min.js'></script>
            <script src='sweetalert2.all.min.js'></script>
            <script language=javascript>
            Swal.fire(
                'valider!',
                'un message a etait envoyer a votre boite email',
               'success'
               )
            ";
    }
 else{
    $ms="<script  src='jquery-3.6.0.min.js'></script>
    <script src='sweetalert2.all.min.js'></script>
    <script language=javascript>
    Swal.fire(
        'valider!',
        'un message a etait envoyer a votre boite email',
       'error'
       )
    ";
 }
   }

?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>mot de pass</title>
    <link rel="stylesheet" href="ouble.css">
</head>
<body>
      <?php echo $ms ?>
       <nav>
       <h1>Recupuration de mot de pass</h1>
       </nav>
        <form class="block" method="POST">
        <h3>trouver votre compte</h3><hr>
        <p>Veuillez entrer votre adresse e-mail ou votre numéro de mobile pour recupurer votre compte</p>
        <input type="email" name="gmail" class="mail" placeholder="Adress email ou votre numero"> 
        <hr><button class="valider" name="valider">valider</button>
          <input type="submit" class="annuler" value="annuler"  name="annuler"></a>
        
</form>
</body>
</html>