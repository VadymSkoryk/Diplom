<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>AddFuelType</title>
</head>
<body>
<@sf.form action="/country/add_country" method = "post" modelAttribute = "country">
    <div>
        <@sf.label path = "idcountry">ID</@sf.label>
        <@sf.input path="idcountry"/>
        <@sf.errors path = "idcountry"/>
    </div>

    <div>
        <@sf.label path = "countryName">Країна</@sf.label>
        <@sf.input path="countryName"/>
        <@sf.errors path = "countryName"/>
    </div>
    <input type="submit">
</@sf.form>
</body>
</html>