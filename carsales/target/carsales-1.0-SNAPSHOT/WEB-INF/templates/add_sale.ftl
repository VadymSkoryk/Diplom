<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title>New Sale</title>
</head>
<body>
<@sf.form action="/sale/add_sale" method = "post" modelAttribute = "sale">
<div>
    <@sf.label path = "idCarForSale">ID Ro</@sf.label>
<@sf.input path="idCarForSale"/>
<@sf.errors path = "idCarForSale"/>
</div>

<div>
    <@sf.label path = "price">Surname</@sf.label>
<@sf.input path="price"/>
<@sf.errors path = "price"/>
</div>

<div>
    <@sf.label path = "registrationYear">Surname</@sf.label>
<@sf.input path="registrationYear"/>
<@sf.errors path = "registrationYear"/>
</div>



<input type="submit">
</@sf.form>

</body>
</html>