<%@page contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>教师点评</title>
    <link href="../resource/css/showTeacher.css" rel="stylesheet">
</head>
<body>
<div>

<!--#begineditable name="个人资料" viewid="67314"-->
    <table width="100%">
    <tbody>
    <tr>
        <td><table width="740" cellspacing="0" cellpadding="0" border="0" align="center">
            <tbody>
            <tr>
                <td width="215" height="27">&nbsp;</td>
                <td colspan="2" style="border-bottom: #666 1px solid"><font size="3" color="#000000"><b>&nbsp;&nbsp;&nbsp;${teacher.academe.academe_name}</b></font></td>
            </tr>
            <tr>
                <td rowspan="7" align="center">
                    <table width="140" height="153" cellspacing="2" border="0" bgcolor="#ffffff">
                        <tbody>
                        <tr>
                            <td bgcolor="#ffffff"><img src="../resource/image/1.jpg" style="height: 182px;width: 142px" width="130" hspace="0" height="182" border="2"> </td>
                        </tr>
                        </tbody>
                    </table></td>
                <td colspan="2">
                    <table width="494" cellspacing="0" cellpadding="0" border="0" align="left">
                        <tbody>
                        <h1>${teacher.teacher_name} </h1>
                        <tr>
                            <td width="84" height="28" align="right"><font style="font-size: 10.5pt;color: #000000">职 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</font></td>
                            <td width="410" height="28"><font style="font-size: 10.5pt;color: #000000">${teacher.academic_title}</font></td>
                        </tr>
                        <tr>
                            <td width="84" height="28" align="right"><font style="font-size: 10.5pt;color: #000000">电 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：</font></td>
                            <td width="410" height="28"><font style="font-size: 10.5pt;color: #000000">${teacher.phone_number}</font></td>
                        </tr>
                        <tr>
                            <td width="84" height="28" align="right"><font style="font-size: 10.5pt;color: #000000">邮 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：</font></td>
                            <td width="410" height="28"><font style="font-size: 10.5pt;color: #000000">${teacher.teacher_mail}</font></td>
                        </tr>
                        <tr>
                            <td width="84" height="28" align="right"><font style="font-size: 10.5pt;color: #000000">研究 方向：</font></td>
                            <td width="410" height="28"><font style="font-size: 10.5pt;color: #000000">${teacher.research_area}</font></td>
                        </tr>
                        </tbody>
                    </table></td>
            </tr>
            </tbody>
        </table></td>
    </tr>
    </tbody></table><!--#endeditable-->








<table width="720" cellspacing="0" cellpadding="0" border="0" align="center" >
    <tbody> <tr>
        <td height="25" colspan="2" style="border-bottom: black 1px solid">
        </td>
    </tr>
    </tbody></table>


<table width="720" cellspacing="0" cellpadding="0" border="0" align="center">
    <tbody><tr>
        <td height="20">
        </td>
    </tr>
    <tr>
        <td valign="top" height="155" align="left">



            <!--#begineditable name="介绍" viewid="67309"--><table  width="100%">
            <tbody><tr>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.teacher_introduce} 
            </tr>
            </tbody></table><!--#endeditable-->
        </td>
    </tr>
    <tr>
        <td height="25" colspan="2" style="border-bottom: black 1px solid">
        </td>
    </tr>
    </tbody></table>
    </div>
   <div class="comment">
    <div class="clearfix_line">

        <ul class="clearfix">
            <span class="comment_num">200个评论</span>
            <li class="clear">
                                <span>
                                    <a  class="clearline" href="">
                                        人气评论
                                    </a>
                                </span>
            </li>
            <li class="clear">
                                 <span>
                                    <a class="clearline" href="">
                                        最新评论
                                    </a>
            </li>
        </ul>
    </div>
    <ul class="commentline">
    <c:forEach items="${commentList}" var="comment" varStatus="i">
     <li class="content">
        <div class="context">
            ${comment.comment_desc}
        </div>
        <div class="thumbs">
            <span class="times">发布于：${comment.comment_time}</span>
            <a class="view_comment" href="">查看评论</a>
            <c:choose>
            <c:when test="${comment.comment_Thumbs_Size==0}">
            <a class="thumb" href="">点赞</a>
            </c:when>
            <c:otherwise>
               <a class="thumb" href="">点赞(${comment.comment_Thumbs_Size})</a>
            </c:otherwise>
            </c:choose>
        </div>
    </li>
    </c:forEach>
      <span class="mores">
           <a class="more_text" href=""> 加载更多。。。</a>
        </span>	
    </ul>
</div>
    </body>
    </html>