<html>
<head>
    <title>Місто</title>
</head>
<body>
<#if city?has_content>
    <ul>
        <#list city as ft>
            <li>${ft.idcity} ${ft.city} </li>
        </#list>
    </ul>
<#else>
    <p>SMTH WRONG!!!</p>
</#if>
</body>
</html>