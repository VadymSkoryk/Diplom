<html>
    <head>
        <title>Users</title>
    </head>
    <body>
        <#if roles?has_content>
            <ul>
             <#list roles as role>
                <li>${role.idroles} ${role.roleName} </li>
            </#list>
            </ul>
        <#else>
            <p>No roles</p>
        </#if>
    </body>
</html>

