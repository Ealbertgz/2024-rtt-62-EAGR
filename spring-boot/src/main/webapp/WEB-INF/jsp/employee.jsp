<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp" />

<!-- a page header -->
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Search Page</h1>
        </div>
    </div>
</section>


<!-- a search form -->
<section>
    <div class="container">
        <div class="row justify-content-center pt-5 pb-3">
            <div class="col-8 text-center">
                <form action="/employee/search" >
                    <div class="mb-3">
                        <label for="search" class="form-label"><h4>Employee Name Search</h4></label>
                        <input type="text" value="${search}" class="form-control" id="search" name="search" placeholder="Enter search term"/>
                    </div>
                    <button type="submit" class="btn btn-primary">Search</button>
                </form>
            </div>
        </div>
    </div>
</section>


<section>
    <div class="container">
        <div class="row pt-5">
            <div class="col-12">
                <h2 class="text-center">Employees Found (${employees.size()})</h2>
            </div>
        </div>
        <div class="row pt-3">
            <div class="col-12">
                <table class="table">
                    <tr>
                        <th>id</th>

                        <th>first name</th>
                        <th>last name</th>
                        <th>edit</th>
                    </tr>
                    <c:forEach items="${employees}" var="employee">
                        <tr>
                            <td><a href="/?id=${employee.id}">${employee.id}</a></td>

                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td><a href="/?id=${employee.id}">Edit</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</section>





<jsp:include page="include/footer.jsp" />