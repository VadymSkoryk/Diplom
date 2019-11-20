<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>Sign up</title>
</head>
<body>
<@sf.form action="/user/new" method="post" modelAttribute="user">
    <div>
        <@sf.label path="username">Введіть ім'я: </@sf.label>
        <@sf.input path="username"/>
        <@sf.errors path="username"/>
    </div>
    <div>
    <@sf.label path="userSurname">Введіть прізвище:</@sf.label>
    <@sf.input path="userSurname"/>
    <@sf.errors path="userSurname"/>
    </div>
    <div>
        <@sf.label path="email">Введіть ел.почту:</@sf.label>
        <@sf.input path="email"/>
        <@sf.errors path="email"/>
    </div>
    <div>
        <@sf.label path="password">Задайте ваш пароль:</@sf.label>
        <@sf.input path="password"/>
        <@sf.errors path="password"/>
    </div>
<#--    <div>-->
<#--        <@sf.label path="idrole">Роль:</@sf.label>-->
<#--        <@sf.input path="idrole"/>-->
<#--        <@sf.errors path="idrole"/>-->
<#--    </div>-->

    <input type="submit">
</@sf.form>
</body>
</html>