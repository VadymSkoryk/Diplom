<html>
<head>
    <title>Users</title>
</head>
<body>
<#if transmissiontype?has_content>
    <ul>
        <#list transmissiontype as tt>
            <li>${tt.idTransmissionType} ${tt.transmissionTypeName} </li>
        </#list>
    </ul>
<#else>
    <p>No roles</p>
</#if>
</body>
</html>