<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>AddFuelType</title>
</head>
<body>
<@sf.form action="/fuel/add_newfuel" method = "post" modelAttribute = "fuel">
    <div>
        <@sf.label path = "idFuelType">ID</@sf.label>
        <@sf.input path="idFuelType"/>
        <@sf.errors path = "idFuelType"/>
    </div>

    <div>
        <@sf.label path = "fuelTypeName">Fuel</@sf.label>
        <@sf.input path="fuelTypeName"/>
        <@sf.errors path = "fuelTypeName"/>
    </div>
    <input type="submit">
</@sf.form>
