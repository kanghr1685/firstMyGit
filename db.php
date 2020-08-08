 <?php
  session_start();
  //세션 초기화 
  
  $db = new mysqli("localhost","root","root","web_text");
  //db 연결
  $db->set_charset("utf8");

  function mq($sql){
    global $db;
    return $db->query($sql);
  }

  ?>