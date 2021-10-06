<?php
require('lib/print.php');
require('view/top.php');
?>
   <a href="create.php">create</a>
   <form action="create_process.php" method="post">
     <p><input type="text" name="title" placeholder="제목"></p>
     <p>
       <textarea name="description" placeholder="설명"></textarea>
     </p>
     <p>
       <input type="submit" placeholder="제출">
     </p>
     <?php
     require('view/bottom.php');
     ?>
