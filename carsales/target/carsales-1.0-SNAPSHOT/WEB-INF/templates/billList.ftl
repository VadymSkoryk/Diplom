<html>
<head>
    <title>UserList</title>
</head>
<body>

<#if bills?has_content>
    <ul>
        <#list bills as b>
            <li>${b.carManufactureByIdmanufacture.manufacturename} ${b.vEngine} ${b.distance} ${b.price} ${b.year}</li>
        </#list>
    </ul>
<#else>
    <p>Оголошення відсутні</p>
</#if>

</body>
</html>