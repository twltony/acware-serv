<c:import url="/WEB-INF/template/layout.jsp" charEncoding="UTF-8">
	<c:param name="title" value="IT消息管理平台" />
	<c:param name="body">
		<h2>欢迎使用集团信息管理平台!</h2>
		<p>
			服务器时间:${f:h(serverTime)}<br>
		</p>
		<ul>
			<%--<li><a href='${pageContext.request.contextPath}/person/list/'>PERSON LIST</a></li>--%>
			<%--<li><a href='${pageContext.request.contextPath}/person/form/'>PERSON CREATE</a></li>--%>
		</ul>
	</c:param>
</c:import>

