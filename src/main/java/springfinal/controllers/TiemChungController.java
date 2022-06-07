package springfinal.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springfinal.entities.Person;
import springfinal.services.PersonService;
import springfinal.validators.PersonValidator;

@Controller
public class TiemChungController {
//	@Autowired
//	private TiemChungService tiemChungService;
	
	@Autowired
	private PersonService personService;

	@RequestMapping(value = { "/danh-sach-tiem-chung" }, method = RequestMethod.GET)
	public String danhSachTiemChung(Model model) {
		System.out.println("danhSachTiemChung");

		List<Person> listPerson = personService.list();
		model.addAttribute("listPerson", listPerson);

		return "danh-sach-tiem-chung";
	}
	
	// Tìm kiếm dịch vụ theo tên
		@RequestMapping(value = { "/danh-sach-tiem-chung" }, method = RequestMethod.POST)
		public String searchDanhSach(Model model, HttpServletRequest req) {
			System.out.println("searchDanhSach POST");
			System.out.println(req.getParameter("tuKhoa"));
			List<Person> listPerson = personService.searchDanhSach(req.getParameter("tuKhoa"));
			System.out.println(listPerson.size());
//			System.out.println(listDV.get(0));
			model.addAttribute("listPerson", listPerson);
			return "danh-sach-tiem-chung";
		}
		
		@RequestMapping(value = { "/editPerson/{cccd}" }, method = RequestMethod.GET)
		public String editPerson(@PathVariable("cccd") String cccd, Model model) {
			System.out.println("editPerson GET");
			Person person = personService.findByID(cccd);
			System.out.println(person);
			model.addAttribute("person", person);
			return "update-thong-tin-tiem-chung";
		}

		@RequestMapping(value = { "/editPerson/{cccd}" }, method = RequestMethod.POST) //"/editDichVu/them-dich-vu"
		public String editPerson(@ModelAttribute("cccd") Person person,BindingResult result, ModelMap modelMap) {
			System.out.println("editPerson POST");
			System.out.println(person);
//			new PersonValidator().validate(person, result);
			personService.updatePerSon(person);
			List<Person> listPerson = personService.list();
			modelMap.addAttribute("listPerson", listPerson);
			return "redirect:/danh-sach-tiem-chung";
		}
}
