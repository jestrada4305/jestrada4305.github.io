<?php 
	//test | rfollman | 2.27.18
	//from book -- pp 235 -- connects to database
	require_once 'login.php';
	$conn = new mysqli($hostname, $user, $pword, $database, 3305, '/Applications/MAMP/tmp/mysql/mysql.sock');
	if ($conn->connect_error) die($conn->connect_error);
	echo "Hello world. We have connected to the database (I think). ";

	$q = " INSERT INTO `music`(`Songs`, `Artist`, `Album`, `Length`) VALUES ([value=Happy],[value=Pharrell],[value-PHP],[value-3:20]);
	$result = $conn->query($q);
	$q = "select * from users";
	$result = $conn->query($q);
	if (!$result) die($conn->error);
	$rows = $result->num_rows;
	echo "There are " . $rows . " rows in the Users table."
 



 INSERT INTO `music`(`Songs`, `Artist`, `Album`, `Length`) VALUES ([value=Happy],[value=Pharrell],[value-PHP],[value-3:20])