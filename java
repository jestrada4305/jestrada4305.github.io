<!DOCTYPE html>
<html>
<head>
	<title>Javascript </title>
	<link rel="stylesheet" href="https://jestrada4305.github.io/main-php.css">
	<style type="text/css">
		#square {
			margin-top: 20px;
			margin-left: 100px;
			height: 200px;
			width: 200px;
			background: pink;
		}

		div {
			margin-bottom: 20px;
		}

		.round {
			border-radius: 20px;
		}

		#square:hover{
			cursor: pointer;
		}
		
	</style>
</head>
<body>

<div id="test" class="t_class"></div>

<script>

document.getElementById("test").innerHTML = "Hello by ID";
// document.getElementsByTagName("div")[0].innerHTML = "Hello by Tag";
// document.getElementsByClassName("t_class")[0].innerHTML = "Hello by Class";

</script>
	<div id="circle" onclick="show_sentence()"></div>

	<div>
		<p> Hello, this is inside a PPPPP tag. </p>
	</div>

	<!-- for your exercise, comment this line out.  -->
	<!-- <button onclick="show_sentence()">Put the Sentence</button> -->

<script>

function show_sentence(){
	document.getElementById("square").innerHTML = document.getElementsByTagName("p")[0].innerHTML;
}

</script>

</body>
</html>
</body>
</html>
