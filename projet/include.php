<?php session_start();?>
<style>
  body{
    background: #f0f2f5;
    position: fixed;
  }
*{
  margin: 0 0 15px 0; 
  padding: 0;
  user-select: none;
  box-sizing: border-box;
  font-family: 'Poppins', sans-serif;
}
.sidebar{
  position: fixed;
  width: 250px;
  height: 100%;
  left: 0;
  background-color: #1b1b1b;
  overflow: auto;
}
.sidebar .text{
  color: white;
  font-size: 25px;
  font-weight: 600;
  line-height: 65px;
  text-align: center;
  background: #1e1e1e ;
  letter-spacing: 1px;
}
.ull{
  position: relative;
  bottom: 20px;
  width: 100%;
  height: 100%;
  background-color: #1b1b1b;
  list-style: none;
}
hr{
    position: relative;
    bottom: 20px;
}
nav ul li{
  cursor: pointer;
  line-height: 60px;
  border-bottom: 1px solid rgba(255,255,255,0.1);
}
nav ul li a{
  color: white;
  text-decoration: none;
  font-size: 18px;
  padding-left: 40px;
  font-weight: 500;
  display: block;
  width: 100%;
  border-left: 3px solide transparent;
}
nav ul li a:hover{
  color: cyan;
  background: #1e1e1e;
  border-left: 1px solid cyan;
}
nav ul ul{
  position: static;
  display: none;
}
.show{
  display:block;
}
nav ul ul li{
  line-height: 42px;
  border-bottom:none;
}
nav ul ul li a{
  font-size: 17px;
  color: #e6e6e6;
  padding-left: 56px;
}
.hide{
  display: none;
}
.dex{
    background: #87878;
    width: 68%;
    height: 45px;
    font-size: 17px;
    position: relative;
    left: 25px;
    top: 42px;
    border:1px silver solid;
    color:black;
    border-radius:14px; 
}
.dex:hover {
    background: blue;
    cursor: pointer;
    color:white;
}
header{
  position: stacky;
    width: 388%;
    background: linear-gradient(362deg, #63a9b9, transparent);
    float: left;
    text-align: center;
    height: 82px;
    z-index: 2;
}
.h11{
  position: relative;
    top: 14px;
    right: 13%;
    margin: 0;
}
/************************************************** */
.navbar_logo-link.w--current {
    width: 16rem;
}

.navbar_logo-link {
    width: 10rem;
    padding-left: 0;
}
.w-nav-brand {
    position: fixed;
    text-decoration: none;
    color: #333;
    left: 77%;
    top: 14px;
}
a {
    color: inherit;
    text-decoration: inherit;
    font-size: inherit;
}
a {
    background-color: transparent;
}
img {
    border: 0;
    vertical-align: middle;
    display: inline-block;
    max-width: 100%;
}
.image{
  position: relative;
    left: 75%;
    margin: 0;
    bottom: 60px;
    width: 244px;
}
</style>
<script>
        function fun1(){
            document.getElementById("m1").classList.toggle("show");
      }
      function fun2(){
        document.getElementById("m2").classList.toggle("show");
  }
  function fun3(){
    document.getElementById("m3").classList.toggle("show");
}
    </script>
</head>
<body>
   <header>
          <h1 class="h11"><?php echo '<span class="sp">'. date("d/m/Y").'&emsp;'.date("h:i:sa").'</span>' ?></h1>
          <div class="image">
            <img src="cashplus.png" alt="">
          </div>
   </header>
    <nav class="sidebar">
        <div class="text">Bienvenu MR <?php echo $_SESSION['nm'] ?></div><hr>
        <ul class="ull">
            <li><a href="GESTIONCLIENT.php">Page Accueil</a></li>
             <li>
                <a  style="corsur:pointer;" onclick="fun1()" > Transaction</a>
                <ul class="menu" id="m1">
                    <li><a href="sortie.php">Nouvelle transaction</a></li>
                    <li><a href="render-vous.php">Render-vous</a></li>
                </ul>
             </li>
             <li>
                <a  onclick="fun2()"> Historiques</a>
               <ul  id="m2">
                  <li><a href="operation sortie.php"> Operations envoi</a></li>
                  <li><a href="operation entrer.php"> Operations reception</a></li>
               </ul>
            </li>
            <li>
                <a href="#" onclick="fun3()">  Moyens</a>
            <ul id="m3">
                <li><a href="riya.php">riya</a></li>
                <li><a href="monygram.php">wistern</a></li>
                <li><a href="#">monygram</a></li>
            </ul>
            </li>
            <form action="deconection.php">
                 <button class="dex" type="submit">Deconnexion</button>
             </form>
        </ul>
    </nav>
</body>