<html>
<head>
    <title>Users</title>
</head>
    <body>
    <#if users?has_content>
        <ul>
            <#list users as user>
                <li>${user.iduser} ${user.name} ${user.surname}
                    ${user.password} ${user.email} </li>
            </#list>
        </ul>
        <#else>
        <p>No users</p>
    </#if>

    </body>
</html>