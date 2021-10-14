<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h1><a href="main.php">Practice</a><h1>
    <ol>
      <?php
      $list = scandir('./Modification');
      $i = 2;
      while($i < count($list)){
        echo "<li><a href=\"main.php?id=$list[$i]\">$list[$i]</a></li>";
      $i = $i + 1;
      }
       ?>
    </ol>
    <h2>
    <?php
    if(isset($_GET['id'])){
    echo $_GET['id'];
  } else {
    echo "Welcome";
  }
     ?>
    </h2>
    <?php
    if(isset($_GET['id'])){
    echo file_get_contents("Modification/".$_GET['id']);
  } else {
    echo "Hello";
  }
     ?>
    <hr>
    <ol>
    <input type="button" value="night" onclick="
     document.querySelector('body').style.backgroundColor='black';
     document.querySelector('body').style.color='white';
    ">
    <input type="button" value="day" onclick="
     document.querySelector('body').style.backgroundColor='white';
     document.querySelector('body').style.color='black';
    ">
  </ol>
  </body>
</html>
