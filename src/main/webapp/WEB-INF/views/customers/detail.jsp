<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Customer Details</h2>

<table>
    <tr>
        <th>ID:</th>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <th>Name:</th>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <th>Email:</th>
        <td>${customer.email}</td>
    </tr>
    <tr>
        <th>Address:</th>
        <td>${customer.address}</td>
    </tr>
</table>

<a href="/customers">Back to Customer List</a>

