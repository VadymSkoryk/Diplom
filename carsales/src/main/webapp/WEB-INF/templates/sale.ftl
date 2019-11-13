<html>
<head>
    <title>Місто</title>
</head>
<body>
<#if sale?has_content>
<ul>
    <#list sale as ft>
    <li>${ft.idCarForSale} ${ft.price} ${ft.registrationYear}</li>
</#list>
</ul>
<#else>
<p>SMTH WRONG!!!</p>
</#if>
</body>
</html>