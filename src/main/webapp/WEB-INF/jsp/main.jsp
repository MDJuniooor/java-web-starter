<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- 
    JSP Name : main.jsp
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
	<form action="/lotto-project/" method="POST">
        <select name="mode">
            <option value="0">메뉴선택</option>
            <option value="1">로또 뽑기</option>
            <option value="2">내 번호 보기</option>
        </select>
        <input value="이동" type="submit">
    </form>
</body>
</html>