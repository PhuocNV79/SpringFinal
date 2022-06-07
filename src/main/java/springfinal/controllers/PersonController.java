package springfinal.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springfinal.entities.Person;
import springfinal.services.PersonService;
import springfinal.validators.PersonValidator;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping(value = { "/them-moi-nguoi-dang-ky" }, method = RequestMethod.GET)
	public String themMoiDangKyTiemChung(Model model) {
		model.addAttribute("person", new Person());
		System.out.println("themMoiDangKyTiemChung GET");

		return "them-moi-nguoi-dang-ky";
	}

	@RequestMapping(value = "/them-moi-nguoi-dang-ky", method = RequestMethod.POST)
	public String luuThongTinDangKy(@ModelAttribute("person") Person person, BindingResult result, Model model) {
		System.out.println("luuThongTinDangKy");
		person.setTrangThaiTiem("1");
		System.out.println(person);
		person.setNgayDangKy(LocalDate.now());
		new PersonValidator().validate(person, result);
		new PersonValidator().checkSDT(personService.list(), person.getSoDienThoai(), result);
		if (result.hasErrors()) {
			return "them-moi-nguoi-dang-ky";
		}
		personService.save(person);

		List<Person> listPerson = personService.list();
		model.addAttribute("listPerson", listPerson);
		return "redirect:/danh-sach-tiem-chung";
	}
}
