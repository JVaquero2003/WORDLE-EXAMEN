<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Wordle</title>
            </head>

            <body>
                <h1>Wordle</h1>
                <form:form action="ranking" method="post">
                    <input type="number" name="intento" />
                    <button>Enviar</button>
                </form:form>
                ${listPalabraPorIntento}
                <table>
                    <tr>
                        <th>Palabra</th>
                        <th>Intentos</th>
                    </tr>
                    <c:forEach items="${listPalabra}" var="palabra" varStatus="loop">
                        <tr>
                            <td>${palabra}</td>
                            <td>${loop.index + 1}</td>
                        </tr>
                    </c:forEach>
                </table>
                <table>
                    <c:forEach items="${resultado}" var="letra">
                        <c:if test="${letra.color == 'verde'}">
                            <td style="color: green">${letra.letra}</td>
                        </c:if>
                        <c:if test="${letra.color == 'rojo'}">
                            <td style="color: red">${letra.letra}</td>
                        </c:if>
                        <c:if test="${letra.color == 'amarillo'}">
                            <td style="color: yellow">${letra.letra}</td>
                        </c:if>
                    </c:forEach>
                </table>
                <a href="/">Volver al inicio</a>
            </body>

            </html>