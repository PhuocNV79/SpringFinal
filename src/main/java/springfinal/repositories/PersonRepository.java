

package springfinal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springfinal.entities.Person;

public interface PersonRepository extends JpaRepository<Person, String>{
	List<Person> findByNgheNghiepContains(String tuKhoa);
	
	
	
}
