package springfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springfinal.entities.Person;
import springfinal.repositories.PersonRepository;

@Service
@Transactional
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public void save(Person obj) {
		personRepository.save(obj);
	}
	
	public List<Person> list() {
		
		return personRepository.findAll();
	}
	
	public List<Person> searchDanhSach(String tuKhoa){
		return personRepository.findByNgheNghiepContains(tuKhoa);
	}
	
	public Person findByID(String cccd) {
		return personRepository.findById(cccd).get();
	}
	
	public void updatePerSon(Person obj) {
		personRepository.saveAndFlush(obj);
	}
}

