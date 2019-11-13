<html>
<head>
    <title>Users</title>
</head>
<body>
<#if fueltype?has_content>
    <ul>
        <#list fueltype as ft>
            <li>${ft.idFuelType} ${ft.fuelTypeName} </li>
        </#list>
    </ul>
<#else>
    <p>SMTH WRONG!!!</p>
</#if>
</body>
</html>