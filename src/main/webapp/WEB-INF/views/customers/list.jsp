<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    table { border: 1px solid #000; }
    th, td { border: 1px dotted #555; padding: 5px; }
</style>

<h2>Customer List</h2>
There are ${customers.size()} customer(s) in the list.

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${customers}">
        <tr>
            <td>${c.id}</td>
            <td><a href="/customers/${c.id}">${c.name}</a></td>
            <td>${c.email}</td>
            <td>${c.address}</td>
        </tr>
    </c:forEach>
    </tbody>

</table>

