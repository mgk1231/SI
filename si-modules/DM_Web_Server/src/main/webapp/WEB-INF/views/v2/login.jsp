<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="true"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>OASIS SI Admin - Login</title>
<%@ include file="/WEB-INF/views/v2/common/common_head.jsp"%>

	<script type="text/javaScript" language="javascript">

		/* ********************************************************
		 * 로그인 처리
		 **********************************************************/	
		function fnLogin(){
			var myForm				 = document.getElementById("myForm");
			myForm.action           = "${pageContext.request.contextPath}/security/authenticate.do";
		   	myForm.submit();
		}
	
		/* ********************************************************
		 * 최초 실행
		 ******************************************************** */
		/* $(function() {
			
			//대메뉴 활성화 
			$("#01").removeClass("gnb_active");
			$("#02").removeClass("gnb_active");
			$("#03").removeClass("gnb_active");
			$("#04").removeClass("gnb_active");
			//서브메뉴 활성화
			$("#00_01").addClass("snb_active");

			// validate signup form on keyup and submit
			$("#myForm").validate({
				rules : {
					loginId : {
						required : true
					},
					loginPassword : {
						required : true
					}
				},
				messages : {
					loginId : {
						required : ""
					},
					loginPassword : {
						required : ""
					}
				}
			});

			
			//처리 결과 
			if("${result}" != "" && "${retCod}" == "0"){
				alert("${message}");
				fnDetail();
			}else if("${retCod}" == "1"){
				alert("${message}");
				fnDetail();
			}			
			
		}); */
	</script>
</head>

<body class="gray-bg">
	<!-- #wrapper -->
	<div id="wrapper">

		<!-- .header_wrap -->
		<%-- <%@ include file="/WEB-INF/views/common/include/hdm_menu.jsp"%> --%>
		<!-- /.header_wrap -->
		
		<div class="middle-box text-center animated fadeInDown">
			<div>
				<div>
					<h1 class="logo-name" style="font-size: 100px;">OASIS SI</h1>
				</div>
	          	<h3>Welcome to OASIS</h3>
	          	<p>Login in. To see it in action</p>
		<!-- #container -->
			<form id="myForm" name="myForm" class="m-t" role="form" action="${pageContext.request.contextPath}/security/authenticate.do" method="post">
				<div class="form-group">
					<input type="text" class="form-control" name="loginId" id="loginId" placeholder="ID" />
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="loginPassword" id="loginPassword" placeholder="Password"/>
				</div>
				
				<input type="submit" class="btn btn-primary block full-width m-b" value="Login" onclick="javascript:fnLogin();"/>
			</form>
			<p class="m-t">
				<small>Copyright HERIT Co.,Ltd. © 2015</small>
			</p>
		<!-- /#container -->
			</div>
		</div>
			<%-- <%@ include file="/WEB-INF/views/common/include/hdm_footer.jsp"%> --%>
		</div>
	<!-- /#wrapper -->
</body>
</html>