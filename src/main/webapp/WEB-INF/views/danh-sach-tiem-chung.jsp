<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/all.css">
<title>danh-sach-tiem-chung</title>
</head>
<body>

	<div class="container-fluid border border-dark mt-3">

		<div class="row mt-3">
			<div class="col text-center">
				<h2>danh-sach-tiem-chung</h2>
			</div>
		</div>

		<table class="table table-striped text-center">
			<thead>
				<th>CCCD</th>
				<th>Ho Ten</th>
				<th>Ngay Sinh</th>
				<th>Gioi Tinh</th>
				<th>SDT</th>
				<th>So The BHYT</th>
				<th>Nghe Nghiep</th>
				<th>Dia Chi</th>
				<th>Ngày đăng ký Tiêm</th>
				<th>Trạng thái tiêm</th>
				<th>Ngày tiêm mới nhất</th>
				<th>Số lần tiêm</th>
				<th>Ghi chú</th>
				<th class="text-center">Action</th>
			</thead>
			<tbody>
				<form:form method="POST" action="danh-sach-tiem-chung">
					<div class="col-12 text-center input-group mb-3">
						<input type="text" class="form-control" name="tuKhoa"
							placeholder="Search...">
						<div class="input-group-append">
							<button class="btn btn-primary form-control" type="submit">Seach</button>
						</div>
					</div>
				</form:form>

				<c:forEach items="${listPerson }" var="obj">
					<c:choose>
						<c:when test="${not empty obj.setTiemChung}">
							<c:forEach items="${obj.setTiemChung }" var="obj2">
								<tr>
									<td>${obj.cccd }</td>
									<td>${obj.hoTen }</td>
									<td>${obj.ngaySinh }</td>
									<td>${obj.gioiTinh }</td>
									<td>${obj.soDienThoai }</td>
									<td>${obj.soTheBHYT }</td>
									<td>${obj.ngheNghiep }</td>
									<td>${obj.diaChi }</td>
									<td>${obj.ngayDangKy }</td>
									<td>${obj.trangThaiTiem }</td>
									<td>${obj2.ngayTiem }</td>
									<td>${obj.setTiemChung.size() }</td>
									<td>---</td>
									<td><a
										href="${pageContext.request.contextPath}/editPerson/${obj.cccd }"><i
											class="fas fa-edit"></i></a></td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td>${obj.cccd }</td>
								<td>${obj.hoTen }</td>
								<td>${obj.ngaySinh }</td>
								<td>${obj.gioiTinh }</td>
								<td>${obj.soDienThoai }</td>
								<td>${obj.soTheBHYT }</td>
								<td>${obj.ngheNghiep }</td>
								<td>${obj.diaChi }</td>
								<td>${obj.ngayDangKy }</td>
								<td>${obj.trangThaiTiem }</td>
								<td>----</td>
								<td>----</td>
								<td>----</td>
								<td><a
										href="${pageContext.request.contextPath}/editPerson/${obj.cccd }"><i
											class="fas fa-edit"></i></a></td>
							</tr>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</tbody>
		</table>
	</div>


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
		src="${pageContext.request.contextPath}/resources/js/xe.js"></script>
</body>
</html>