<html>
<head>
    <title>Users</title>
</head>
<body>
<#if country?has_content>
    <ul>
        <#list country as ft>
            <li>${ft.idcountry} ${ft.countryName} </li>
        </#list>
    </ul>
<#else>
    <p>SMTH WRONG!!!</p>
</#if>
</body>
</html>