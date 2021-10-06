<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Array</title>
  </head>
  <body>
    <h1>Array</h1>
    <?php
     $coworkers = array('Dio','Ria','Jennie','Ganji');
      echo $coworkers[1].'<br>';
      echo $coworkers[3].'<br>';
      var_dump(count($coworkers));
      array_push($coworkers, 'Minju');
      echo '<br>';
      var_dump($coworkers);
      echo $coworkers[4];
     ?>
  </body>
</html>
