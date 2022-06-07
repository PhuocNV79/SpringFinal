package springfinal.validators;

import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import springfinal.entities.Person;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Person.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Person obj = (Person) target;
		checkBHYT(obj, errors);
		checkTrangThai(obj, errors);
	}

	public void checkBHYT(Person obj, Errors errors) {
		String bhyt = obj.getSoTheBHYT();
		String pattern = "[0-9]{10}[A-Z]{4}";
		if (!bhyt.matches(pattern)) {
			errors.rejectValue("soTheBHYT", "soTheBHYT.format", null, "soTheBHYT không đúng định dạng: 1234567890ABCD");
		}
	}

	public void checkTrangThai(Person obj, Errors errors) {
		String tt = obj.getTrangThaiTiem();
		if ("4".equals(tt)) {
			errors.rejectValue("trangThaiTiem", "trangThaiTiem.format", null,
					"Ban da tiem nen khong the\r\n" + "update thong tin");
		}

		if ("3".equals(tt)) {
			errors.rejectValue("trangThaiTiem", "trangThaiTiem.format", null, "Ban can lien he voi nhan vien y te");
		}
	}
	
 	public void checkSDT(List<Person> obj,String SDT, Errors errors) {
 		for (Person person : obj) {
			if(SDT.equalsIgnoreCase(person.getSoDienThoai())) {
				errors.rejectValue("soDienThoai", "soDienThoai.format", null, "SDT nay da trung");
			}
		}
	}

}
