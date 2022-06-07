package springfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springfinal.entities.TiemChung;
import springfinal.repositories.TiemChungRepository;

@Service
@Transactional
public class TiemChungService {
	@Autowired 
	private TiemChungRepository tiemChungRepository;
	
	public void save(TiemChung obj) {
		tiemChungRepository.save(obj);
	}
	
	public List<TiemChung> list() {
		
		return tiemChungRepository.findAll();
	}
	

}
