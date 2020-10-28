<%-- 
    Document   : index
    Created on : 27/10/2020, 01:38:00 PM
    Author     : JR
--%>
<%
 
if (session.getAttribute("name") != null) {
        
%><%@include file="view/panel.jsp" %> 
<%} else {
%><%@include file="login.jsp" %> 
<%
    }
%>
