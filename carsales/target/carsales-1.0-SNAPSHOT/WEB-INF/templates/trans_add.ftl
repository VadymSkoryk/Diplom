<#assign sf = JspTaglibs["http://www.springframework.org/tags/form"]>

    <html>
<head>
    <title>AddNewTransmissionType</title>
</head>
<body>
<@sf.form action="/trans/trans_add" method = "post" modelAttribute = "tt">
    <div>
        <@sf.label path = "idTransmissionType">ID Transmission Type</@sf.label>
        <@sf.input path="idTransmissionType"/>
        <@sf.errors path = "idTransmissionType"/>
    </div>

    <div>
        <@sf.label path = "transmissionTypeName">Surname</@sf.label>
        <@sf.input path="transmissionTypeName"/>
        <@sf.errors path = "transmissionTypeName"/>
    </div>


    <input type="submit">
</@sf.form>