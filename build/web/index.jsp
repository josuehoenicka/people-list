<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h2>People data:</h2>
        <form action="SvPeople" method="POST">
            <p><label>DNI:</label><input type="text" name="dni"></p>
            <p><label>Name:</label><input type="text" name="mame"></p>
            <p><label>Surname:</label><input type="text" name="surname"></p>
            <p><label>Number:</label><input type="text" name="number"></p>
            <button type="submit">SEND</button>
        </form>
        
        <h2>Watch List of People</h2>
        <p>If you want to watch the list of people, please clic on the button</p>
        <form action="" method="">
            <button type="submit">WATCH LIST</button>   
        </form>
        
        <h2>Delete People</h2>
        <p>Enter People's DNI to delete</p>
        <form action="" method="">
            <p><label>DNI:</label><input type="text" name="dni_delete"></p>
            <button type="submit">DELETE</button>   
        </form>
        
    </body>
</html>
