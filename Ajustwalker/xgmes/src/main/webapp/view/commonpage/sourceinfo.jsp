<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@ taglib prefix="t" uri="http://www.talent.com/jsp/anyonelse"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>
<t:html>
<head>
<jsp:include page="/view/common.jsp" flush="true" />
</head>
<body class="section container-fluid">
<div class="row-fluid">
		<div class="col-sm-12">	
			<table id="SourceinfoGrid" data-toggle="table"
				data-pagination="true" 
				data-page-list="[10,40]"
				data-row-style="rowStyle" 
				data-search="true"
				data-show-refresh="true"
				data-page-size="10"
				data-url="<c:url value='/bcommon/querySourceinfo.do'/>">
				<thead>
					<tr>
						<th data-field="sourcecode" data-halign="center" data-align="center"
							data-searchable="true">供货编码</th>
						<th data-field="sourcename" data-halign="center"
							data-searchable="true">供货名称</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</body>
</t:html>