<%@ page  import="com.google.appengine.api.users.*"  
pageEncoding="utf-8" contentType="text/html;charset=utf-8" 
%> 
<% 
UserService userService = UserServiceFactory.getUserService(); 
User user = userService.getCurrentUser(); 
String msg; if( user != null ){  
	msg = "ようこそ! あなたは <b>" + user.getNickname() + "</b> という名前でログインしています。"     + " <a href='" + userService.createLogoutURL("/") + "'>サインアウト</a>";
	} else {  
	msg = "こんにちは! こちらから "     + "<a href='" + userService.createLoginURL("/index.html") + "'>サインイン</a> してください!"; 
	} System.out.println( msg ); 
	%> 
	<body background="./flowerbanner0036.jpg">
	<p class="round"><h1><font color="#C71585"><%= msg %></font></h1></p>