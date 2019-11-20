<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>Create Role</title>
</head>
<body>
<@sf.form action="/role/new" method="post" modelAttribute="role">
    <div>
        <@sf.label path="rolename">Name</@sf.label>
        <@sf.input path="rolename"/>
        <@sf.errors path="rolename"/>
    </div>

    <input type="submit">
</@sf.form>
</body>
</html>