<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Insert title here</title>
</head>
<body>
 <form method="post" enctype="multipart/form-data"  action="/mvc/demo/upload">
     <input name="username"> <br/>
     <input type="file" name="fileUpload"> <br/>
     <input type="submit" value="Upload File">
 </form>
</body>
</html>
