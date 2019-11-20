<html>
<head>
    <title>RoleList</title>
</head>
<body>

<#if roles?has_content>
    <ul>
        <#list roles as role>
            <li>${role.idrole} ${role.rolename} </li>
        </#list>
    </ul>
<#else>
    <p>No roles</p>
</#if>

</body>
</html>