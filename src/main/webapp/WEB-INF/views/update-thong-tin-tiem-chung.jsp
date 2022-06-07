<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/all.css">
<title>update-thong-tin-tiem-chung</title>
</head>
<body>

	<h2>update-thong-tin-tiem-chung</h2>
	<form:form method="POST" action="update-thong-tin-tiem-chung"
		modelAttribute="person">
		<table>
			<fieldset disabled>
			<tr class="form-group">
				<td><form:label path="cccd">cccd:</form:label></td> <!--cccd: ${person.cccd }  -->
				<td><form:input class="form-control" id="cccd"
						path="cccd" readonly="readonly"/></td>
				<td class="text-danger"><form:errors path="cccd"></form:errors>
				</td>
			</tr>
			</fieldset>

			<tr class="form-group">
				<td><form:label path="hoTen" >hoTen: </form:label></td>
				<td><form:input class="form-control" id="hoTen" path="hoTen" /></td>
				<td class="text-danger"><form:errors path="hoTen"></form:errors>
				</td>
			</tr>

			<tr class="form-group">
				<td><form:label path="ngaySinh">ngaySinh: </form:label></td>
				<td><form:input type="date" class="form-control" id="ngaySinh"
						path="ngaySinh" /></td>
				<td class="text-danger"><form:errors path="ngaySinh"></form:errors>
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
				<td><form:input class="form-control" id="soDienThoai"
						path="soDienThoai" /></td>
				<td class="text-danger"><form:errors path="soDienThoai"></form:errors>
				</td>
			</tr>


			<fieldset disabled>
				<tr class="form-group">
					<td><form:label path="soTheBHYT">soTheBHYT: </form:label></td>
					<td><form:input class="form-control" id="soTheBHYT"
							path="soTheBHYT" /></td>
					<td class="text-danger"><form:errors path="soTheBHYT"></form:errors>
					</td>
				</tr>
			</fieldset>


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

			<tr class="form-group">
				<td><form:label path="ngayDangKy">ngayDangKy: </form:label></td>
				<td><form:input type="date" class="form-control"
						id="ngayDangKy" path="ngayDangKy" /></td>
				<td class="text-danger"><form:errors path="ngayDangKy"></form:errors>
				</td>
			</tr>
			
			<tr class="form-group">
				<td><form:label path="trangThaiTiem">trangThaiTiem: </form:label></td>
				<%-- <!--  --><td><form:input class="form-control" id="trangThaiTiem" path="trangThaiTiem" /></td> --%>
				
				<td><form:select class="form-control" path="trangThaiTiem">
							<form:option value="NONE" label="Select" />
								<form:option value="1" label="Trạng thái chờ" />
								<form:option value="2" label="Trạng thái cho phép" />
								<form:option value="3" label="Trạng thái huỷ" />
								<form:option value="4" label="Đã tiêm" />
						</form:select></td>
				
				<td class="text-danger"><form:errors path="trangThaiTiem"></form:errors>
				</td>
			</tr>

			<tr>
				<td><button type="submit" class="btn btn-success mb-3">Submit</button></td>
			</tr>
		</table>
		<%-- <form:hidden path="cccd"/> --%>
		<form:hidden path="soTheBHYT" />
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