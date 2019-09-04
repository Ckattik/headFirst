<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="beatModel" scope="request" class="headFirstPatternMVCWeb.BeatModel" />



<html>
<head>
<meta charset="ISO-8859-1">
<title>DJ View</title>
</head>
<body>
<h1>DJ View</h1>
Beats per minutes = <jsp: getProperty name = "beatModel" property = "BPM"/>
<br />
<hr>
<br />

<form method="post" action="/djview/servlet/DJView">
BPM: <input type=text name="bpm"
             value="jsp:getProperty name="beatModel"
             property="BPM"/>">
&nbsp;             

<input type="submit" name="set" value="set"><br />
<input type="submit" name="decrease" value="<<">
<input type="submit" name="increase" value=">>"><br />
<input type="submit" name="on" value="on">
<input type="submit" name="off" value="off"><br />
</form>
</body>
</html>