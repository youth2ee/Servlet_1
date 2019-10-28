<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formTest</title>
</head>
<body>
	<h1>Form Test</h1>
	<form action="./go2.do" method="post">
	<!-- form에서는 파라미터 따로 action에서 안써준다. 알아서 폼내의 값이 따라간다. -->
		<!-- input 속성 중 파라미터명은 name / 값은 value -->		
		<input type="text" name="search" value="">
		<input type="password" name="pw" >
		<input type="text" name="age">

		<button>click</button>
	</form>

</body>
</html>