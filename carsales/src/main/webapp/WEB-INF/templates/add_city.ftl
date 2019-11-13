<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>Add City</title>
</head>
<body>
<@sf.form action="/city/add_city" method = "post" modelAttribute = "city">
    <div>
        <@sf.label path = "idcity">ID</@sf.label>
        <@sf.input path="idcity"/>
        <@sf.errors path = "idcity"/>
    </div>

    <div>
        <@sf.label path = "city">С</@sf.label>
        <@sf.input path="city"/>
        <@sf.errors path = "city"/>
    </div>
    <input type="submit">
</@sf.form>
</body>
</html>