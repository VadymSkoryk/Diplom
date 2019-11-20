<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<html>
<head>
    <title>Sign up</title>
</head>
<body>
<@sf.form action="/bill/new" method="post" modelAttribute="bill">
<#--    <div>-->
<#--        <@sf.label path="username">Введіть ім'я: </@sf.label>-->
<#--        <@sf.label path = "idcountry"></@sf.label>-->
<#--    </div>-->
    <div>
     
    </div>
    <div>
        <@sf.select itemLabel="Оберіть тип палива:" path = "idfuel" id="idfuel">
            <option value=2>Бензин</option>
            <option value=3>Дизель</option>
            <option value=4>Газ</option>
            <option value=5>Газ/Бензин</option>
            <option value=6>Гибрид</option>
            <option value=7>Електро</option>
            <option value=8>Інше</option>
        </@sf.select>
    </div>
    <div>
        <@sf.select itemLabel="Оберіть тип КПП:" path = "idtransmission" id="idtransmission">
            <option value=1>Ручна/Механіка</option>
            <option value=2>Автомат</option>
            <option value=3>Типтронік</option>
            <option value=4>Адаптивна</option>
            <option value=5>Варіатор</option>
        </@sf.select>
    </div>

    <input type="submit">
</@sf.form>
</body>
</html>