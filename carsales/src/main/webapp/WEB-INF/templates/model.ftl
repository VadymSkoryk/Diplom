<html>
<head>
    <title>Модель</title>
</head>
<body>
<#if model?has_content>
<ul>
    <#list model as ft>
    <li>${ft.idCarModel} ${ft.carModelName} </li>
</#list>
</ul>
<#else>
<p>SMTH WRONG!!!</p>
</#if>
</body>
</html>