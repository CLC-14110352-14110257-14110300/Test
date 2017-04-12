<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CK editor test </title>
  
<!-- <script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="/resources/ckfinder/ckfinder.js"></script>
 -->
 <script src="//cdn.ckeditor.com/4.6.2/standard/ckeditor.js"></script>

</head>

<body>
  <textarea name="txtnoidung" id="txtnoidung" value="${user.content}"></textarea>
<script type="text/javascript" language="javascript">
	CKEDITOR.replace('txtnoidung');
</script>

<!-- 	<textarea id="content"  name="content"></textarea>
	<script type="text/javascript">
		CKEDITOR.replace("content",{
			filebrowserBrowseUrl : 'ckfinder/ckfinder.html',
			filebrowserImageBrowseUrl : 'ckfinder/ckfinder.html?type=Images',
			filebrowserFlashBrowseUrl : 'ckfinder/ckfinder.html?type=Flash',
			filebrowserUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files',
			filebrowserImageUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images',
			filebrowserFlashUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash'
		});
	</script>
	 -->
</body>
</html>