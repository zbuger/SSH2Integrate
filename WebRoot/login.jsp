<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>    
    <title>��¼��</title>
  </head>
  
  <body>
    <s:form action="doLogin.action" >
   <table>
     <tr>	       
      <s:textfield name="loginName" label="�û���"  /> 
     </tr>
     <tr>
       <s:textfield name="loginPwd" label="����"  /> 
     </tr>
     <tr>
       <s:submit value="ȷ��"  /> 
     </tr>	     
   </table>
</s:form>
    
  </body>
</html>
