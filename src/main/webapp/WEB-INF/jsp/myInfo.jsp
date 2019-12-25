<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="able.cmm.lotto.service.vo.LottoNumberVO"%>
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
<h1> My Lotto Number</h1>
<table>
<tr>
    <th>1번째</th>
    <th>2번째</th>
    <th>3번째</th>
    <th>4번째</th>
    <th>5번째</th>
    <th>6번째</th>
  </tr>
<% List<LottoNumberVO> lottoNumberList = (ArrayList<LottoNumberVO>)request.getAttribute("lottoNumberList");
 for (LottoNumberVO vo: lottoNumberList){
     out.println("<tr>");
     out.println("<td>" + vo.getNumber1() + "</td>");
     out.println("<td>" + vo.getNumber2() + "</td>");
     out.println("<td>" + vo.getNumber3() + "</td>");
     out.println("<td>" + vo.getNumber4() + "</td>");
     out.println("<td>" + vo.getNumber5() + "</td>");
     out.println("<td>" + vo.getNumber6() + "</td>");
     out.println("</tr>");    
 }
   
%>
</table>

</body>
</html>