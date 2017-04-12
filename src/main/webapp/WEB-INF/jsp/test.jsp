<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:templetepage>

	<jsp:attribute name="header">     
    </jsp:attribute>
    <jsp:attribute name="footer">     
    </jsp:attribute>
	<jsp:body>
 <script src="//cdn.ckeditor.com/4.6.2/standard/ckeditor.js"></script>
	
 <textarea name="txtnoidung" id="txtnoidung" value="${user.content}"></textarea>
<script type="text/javascript" language="javascript">
	CKEDITOR.replace('txtnoidung');
</script>

	
	</jsp:body>
</t:templetepage>