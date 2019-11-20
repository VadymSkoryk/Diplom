<html>
<head>
    <title>UserList</title>
</head>
<body>

<#if users?has_content>
    <ul>
        <#list users as user>
            <li>${user.username}${user.userSurname} ${user.roleByIdrole.rolename} </li>
        </#list>
    </ul>
<#else>
    <p>No roles</p>
</#if>

</body>
</html>