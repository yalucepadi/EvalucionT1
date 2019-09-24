package pe.upn.HRSN00064095.service.imlp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.HRSN00064095.model.entity.Regions;
import pe.edu.upn.HRSN00064095.model.repository.RegionsRepository;
import pe.upn.HRSN00064095.service.RegionsService;

@Service
public class RegionsServiceImlp  implements RegionsService{
	@Autowired
	private RegionsRepository regionsRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Regions> findAll() throws Exception {
		
		return regionsRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Regions> findById(Integer id) throws Exception {
		
		return regionsRepository.findById(id);
	}
	@Transactional
	@Override
	public Regions save(Regions entity) throws Exception {
		
		return regionsRepository.save(entity);
	}
	@Transactional
	@Override
	public Regions update(Regions entity) throws Exception {
		
		return regionsRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		regionsRepository.deleteById(id);
		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		regionsRepository.deleteAll();
		
	}

}
