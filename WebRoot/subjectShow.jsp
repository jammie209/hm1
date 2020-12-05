<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试题详细显示页面</title>
	<style type="text/css">
	<!--
	body {
		margin-left: 0px;
		margin-top: 0px;
		margin-right: 0px;
		margin-bottom: 0px;
		background-color: #EEF2FB;
	}
	#showSubject table  td{
		font-size:12px;
	}
	-->
	</style>
	<link href="images/skin.css" rel="stylesheet" type="text/css">
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
    <td valign="top" background="images/content-bg.gif"><table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
      <tr>
        <td height="31"><div class="titlebt">查看试题</div></td>
      </tr>
    </table></td>
    <td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16" height="29" /></td>
  </tr>
  <tr>
    <td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
    <td valign="top" bgcolor="#F7F8F9"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="53%" valign="top">&nbsp;</td>
        </tr>
      <tr>
        <td valign="middle"><span class="left_txt">
			<div id="showSubject" align="center"><!--显示试题-->
			<table border="0" cellspacing="10" cellpadding="0">
				  <c:forEach var="u" items="${list }">
				  <tr>
				    <td>试题编号:</td>
				    <td>${u.subjectID }</td>
			    </tr>
				  <tr>
					<td>试题题目:</td>
					<td>${u.subjectTitle }</td>
				  </tr>
				  <tr>
					<td>选项A:</td>
					<td>${u.subjectOptionA }</td>
				  </tr>
				   <tr>
					<td>选项B:</td>
					<td>${u.subjectOptionB }</td>
				  </tr>
				   <tr>
					<td>选项C:</td>
					<td>${u.subjectOptionC }</td>
				  </tr>
				   <tr>
					<td>选项D:</td>
					<td>${u.subjectOptionD }</td>
				  </tr>
				   <tr>
					<td>答案:</td>
					<td>${u.subjectAnswer }</td>
				  </tr>
				  <tr>
					<td valign="top">答案解析:</td>
					<td valign="top">${u.subjectParse }</td>
				  </tr>
				  </c:forEach>
			</table>
			</div>
		</td>
        </tr>
      
    </table></td>
    <td background="images/mail_rightbg.gif">&nbsp;</td>
  </tr>
  <tr>
    <td valign="bottom" background="images/mail_leftbg.gif"><img src="images/buttom_left2.gif" width="17" height="17" /></td>
    <td background="images/buttom_bgs.gif"><img src="images/buttom_bgs.gif" width="17" height="17"></td>
    <td valign="bottom" background="images/mail_rightbg.gif"><img src="images/buttom_right2.gif" width="16" height="17" /></td>
  </tr>
</table>
</body>
</html>