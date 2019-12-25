<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- 
    JSP Name : jspName.jsp
    Description : 설명을 기술합니다.
    author 6791481
    since 2019. 12. 22.
    version 1.0
    Modification Information
       since          author              description
    ===========    =============    ===========================
    2019. 12. 22.     6791481     	최초 생성
--%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javaScript" language="javascript">

</script>
</head>
<body>	
    <h1>lotto generator</h1>
    <br>
    <h2>몇 개를 뽑을까?</h2>
    <form action="/lotto-project/lotto-gen" method="GET">
        <input name="count" type="text"/><br><br>
        <input value="이동" type="submit"/>
    </form>
</body>
</html>