<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>Add Model</title>
</head>
<body>
<@sf.form action="/model/add_model" method = "post" modelAttribute = "model">
<div>
    <@sf.label path = "idCarModel">ID</@sf.label>
<@sf.input path="idCarModel"/>
<@sf.errors path = "idCarModel"/>
</div>

<div>
    <@sf.label path = "carModelName">С</@sf.label>
<@sf.input path="carModelName"/>
<@sf.errors path = "carModelName"/>
</div>
<input type="submit">
</@sf.form>
</body>
</html>