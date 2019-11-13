<html>
<head>
    <title>Місто</title>
</head>
<body>
<#if car?has_content>
    <ul>
        <#list car as ft>
            <li>${ft.idCarManufacture} ${ft.carManufactureName} </li>
        </#list>
    </ul>
<#else>
    <p>SMTH WRONG!!!</p>
</#if>
</body>
</html>