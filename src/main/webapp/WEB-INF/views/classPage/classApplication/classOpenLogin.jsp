<%@page import="java.io.Console"%>
<%@page import="com.dto.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	MemberDTO loginDto=(MemberDTO)session.getAttribute("login");
	System.out.println(loginDto);
	String userId=null;
	if(loginDto != null){
		userId=loginDto.getUserId();
		System.out.println("classOpenLogin.jsp userId:"+userId);
	} 
%>
<script type="text/javascript">
<% String classMesg = (String)session.getAttribute("classMesg");
	if(classMesg != null){%>
	  alert("<%=classMesg%>");
<%	System.out.print(classMesg);
	session.removeAttribute("classMesg");
	}
%>
</script>	

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		//클래스 등록버튼 클릭
		$(".more2").on("click", function(event) {
			<%-- if ("<%= userId%>" == "null") {
				alert("로그인 후 이용해주세요");
				event.preventDefault();
			}else{ --%>
			if("<%= userId%>" != "null"){
				//ajax로 튜터등록 여부 검사하고 돌아오기
				$.ajax({
					type: "post",
					url: "tutorSearch",
					dataType: "text",
					async: false,
					data: //서버에 넘겨줄 데이터 
						{ userId: "<%= userId%>" }
					,
					success: function(data, status, xhr) {
						console.log("TutorSearch success");
						console.log(data);
						if (data == 0) { //튜터등록이 되어있지 않을 경우 
							alert("튜터등록 후 이용해주세요");
							event.preventDefault();
						}
					},
					error: function(xhr, status, e) {
						console.log("TutorSearch error");
						console.log(e, status);
					}
				})//ajax end
			}//if end
		})
	})	

</script>