<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/all.css">
<title>Them Nguoi Dang Ky</title>
</head>
<body>

	<h2>Them Nguoi Dang Ky</h2>
	<form:form method="POST" action="them-moi-nguoi-dang-ky"
		modelAttribute="person">
		<table>
			<tr class="form-group">
				<td><form:label path="cccd">cccd: </form:label></td>
				<td><form:input class="form-control batbuoc" id="cccd" path="cccd" /></td>
				<td class="text-danger"><form:errors path="cccd"></form:errors>
				<small id="cccderr"></small>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="hoTen">hoTen: </form:label></td>
				<td><form:input class="form-control batbuoc" id="hoTen" path="hoTen" /></td>
				<td class="text-danger"><form:errors path="hoTen"></form:errors>
				<small id="hoTenerr"></small>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="ngaySinh">ngaySinh: </form:label></td>
				<td><form:input type="date" class="form-control batbuoc" id="ngaySinh"
						path="ngaySinh" /></td>
				<td class="text-danger"><form:errors path="ngaySinh"></form:errors>
				<small id="ngaySinherr"></small>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="gioiTinh">gioiTinh</form:label></td>
				<td><form:select class="form-control" path="gioiTinh">
						<form:option value="Nam" label="Nam" />
						<form:option value="Nu" label="Nu" />
						<form:option value="Khac" label="Khac" />
					</form:select></td>
			</tr>

			<tr class="form-group">
				<td><form:label path="soDienThoai">soDienThoai: </form:label></td>
				<td><form:input class="form-control batbuoc" id="soDienThoai"
						path="soDienThoai" /></td>
				<td class="text-danger"><form:errors path="soDienThoai"></form:errors>
				<small id="soDienThoaierr"></small>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="soTheBHYT">soTheBHYT: </form:label></td>
				<td><form:input class="form-control" id="soTheBHYT"
						path="soTheBHYT" /></td>
				<td class="text-danger"><form:errors path="soTheBHYT"></form:errors>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="ngheNghiep">ngheNghiep: </form:label></td>
				<td><form:input class="form-control" id="ngheNghiep"
						path="ngheNghiep" /></td>
				<td class="text-danger"><form:errors path="ngheNghiep"></form:errors>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="diaChi">diaChi: </form:label></td>
				<td><form:input class="form-control" id="diaChi" path="diaChi" /></td>
				<td class="text-danger"><form:errors path="diaChi"></form:errors>
				</td>
			</tr>

			<%-- <tr class="form-group">
				<td><form:label path="ngayDangKy">ngayDangKy: </form:label></td>
				<td><form:input type="date" class="form-control"
						id="ngayDangKy" path="ngayDangKy" /></td>
				<td class="text-danger"><form:errors path="ngayDangKy"></form:errors>
				</td>
			</tr> --%>

			<tr>
				<td><button id="btn" type="submit" class="btn btn-success mb-3">Submit</button></td>
			</tr>
		</table>
	</form:form>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/jquery-3.6.0.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/all.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/js-for-final.js"></script>
</body>
</html>