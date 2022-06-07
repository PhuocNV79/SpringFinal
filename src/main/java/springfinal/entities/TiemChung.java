package springfinal.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class TiemChung {
	@Id
	private String maTC;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CCCD", nullable = false, insertable = true, updatable = true)
	private Person cccd;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayTiem;
	
	private int lanTiem;
	
	private String tenVacXin;
	
	private String ghiChu;

	public String getMaTC() {
		return maTC;
	}

	public void setMaTC(String maTC) {
		this.maTC = maTC;
	}

	public Person getCccd() {
		return cccd;
	}

	public void setCccd(Person cccd) {
		this.cccd = cccd;
	}

	public LocalDate getNgayTiem() {
		return ngayTiem;
	}

	public void setNgayTiem(LocalDate ngayTiem) {
		this.ngayTiem = ngayTiem;
	}

	public int getLanTiem() {
		return lanTiem;
	}

	public void setLanTiem(int lanTiem) {
		this.lanTiem = lanTiem;
	}

	public String getTenVacXin() {
		return tenVacXin;
	}

	public void setTenVacXin(String tenVacXin) {
		this.tenVacXin = tenVacXin;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public TiemChung(String maTC, Person cccd, LocalDate ngayTiem, int lanTiem, String tenVacXin, String ghiChu) {
		super();
		this.maTC = maTC;
		this.cccd = cccd;
		this.ngayTiem = ngayTiem;
		this.lanTiem = lanTiem;
		this.tenVacXin = tenVacXin;
		this.ghiChu = ghiChu;
	}

	public TiemChung() {
		super();
	}

	@Override
	public String toString() {
		return "TiemChung [maTC=" + maTC + ", cccd=" + cccd + ", ngayTiem=" + ngayTiem + ", lanTiem=" + lanTiem
				+ ", tenVacXin=" + tenVacXin + ", ghiChu=" + ghiChu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maTC == null) ? 0 : maTC.hashCode());
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
		TiemChung other = (TiemChung) obj;
		if (maTC == null) {
			if (other.maTC != null)
				return false;
		} else if (!maTC.equals(other.maTC))
			return false;
		return true;
	}
	
	
}
