package springfinal.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Person {
	@Id
	private String cccd;
	
	private String hoTen;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySinh;
	
	private String gioiTinh;
	
	private String soDienThoai;
	
	private String soTheBHYT;
	
	public String getSoTheBHYT() {
		return soTheBHYT;
	}

	public void setSoTheBHYT(String soTheBHYT) {
		this.soTheBHYT = soTheBHYT;
	}

	private String ngheNghiep;
	
	private String diaChi;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayDangKy;
	
	private String trangThaiTiem;
	
	@OneToMany(mappedBy = "cccd", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<TiemChung> setTiemChung;

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public LocalDate getNgayDangKy() {
		return ngayDangKy;
	}

	public void setNgayDangKy(LocalDate ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}

	public String getTrangThaiTiem() {
		return trangThaiTiem;
	}

	public void setTrangThaiTiem(String trangThaiTiem) {
		this.trangThaiTiem = trangThaiTiem;
	}

	public Set<TiemChung> getSetTiemChung() {
		return setTiemChung;
	}

	public void setSetTiemChung(Set<TiemChung> setTiemChung) {
		this.setTiemChung = setTiemChung;
	}

	public Person(String cccd, String hoTen, LocalDate ngaySinh, String gioiTinh, String soDienThoai, String ngheNghiep,
			String diaChi, LocalDate ngayDangKy, String trangThaiTiem) {
		super();
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.ngheNghiep = ngheNghiep;
		this.diaChi = diaChi;
		this.ngayDangKy = ngayDangKy;
		this.trangThaiTiem = trangThaiTiem;
	}

	public Person() {
		super();
	}
	
	

	public Person(String cccd, String hoTen, LocalDate ngaySinh, String gioiTinh, String soDienThoai, String soTheBHYT,
			String ngheNghiep, String diaChi, LocalDate ngayDangKy, String trangThaiTiem) {
		super();
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.soTheBHYT = soTheBHYT;
		this.ngheNghiep = ngheNghiep;
		this.diaChi = diaChi;
		this.ngayDangKy = ngayDangKy;
		this.trangThaiTiem = trangThaiTiem;
	}

	public Person(String cccd, String hoTen, LocalDate ngaySinh, String gioiTinh, String soDienThoai, String soTheBHYT,
			String ngheNghiep, String diaChi, LocalDate ngayDangKy, String trangThaiTiem, Set<TiemChung> setTiemChung) {
		super();
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.soTheBHYT = soTheBHYT;
		this.ngheNghiep = ngheNghiep;
		this.diaChi = diaChi;
		this.ngayDangKy = ngayDangKy;
		this.trangThaiTiem = trangThaiTiem;
		this.setTiemChung = setTiemChung;
	}

	@Override
	public String toString() {
		return "Person [cccd=" + cccd + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
				+ ", soDienThoai=" + soDienThoai + ", soTheBHYT=" + soTheBHYT + ", ngheNghiep=" + ngheNghiep
				+ ", diaChi=" + diaChi + ", ngayDangKy=" + ngayDangKy + ", trangThaiTiem=" + trangThaiTiem + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cccd == null) ? 0 : cccd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (cccd == null) {
			if (other.cccd != null)
				return false;
		} else if (!cccd.equals(other.cccd))
			return false;
		return true;
	}

	
	
	
}
