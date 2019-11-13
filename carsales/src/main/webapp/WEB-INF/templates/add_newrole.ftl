<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>AddNewRole</title>
</head>
<body>
<@sf.form action="/roles/add_newrole" method = "post" modelAttribute = "roles">
    <div>
    <@sf.label path = "idroles">ID Ro</@sf.label>
    <@sf.input path="idroles"/>
    <@sf.errors path = "idroles"/>
    </div>

    <div>
        <@sf.label path = "roleName">Surname</@sf.label>
        <@sf.input path="roleName"/>
        <@sf.errors path = "roleName"/>
    </div>


    <input type="submit">
</@sf.form>

</body>
</html>
