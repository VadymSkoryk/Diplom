<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>Add City</title>
</head>
<body>
<@sf.form action="/car/add_carm" method = "post" modelAttribute = "carm">
    <div>
        <@sf.label path = "idCarManufacture">ID</@sf.label>
        <@sf.input path="idCarManufacture"/>
        <@sf.errors path = "idCarManufacture"/>
    </div>

    <div>
        <@sf.label path = "carManufactureName">С</@sf.label>
        <@sf.input path="carManufactureName"/>
        <@sf.errors path = "carManufactureName"/>
    </div>
    <input type="submit">
</@sf.form>
</body>
</html>