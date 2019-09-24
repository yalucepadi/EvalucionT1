package pe.upn.HRSN00064095.service.imlp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.HRSN00064095.model.entity.Locations;
import pe.edu.upn.HRSN00064095.model.repository.LocationsRepository;
import pe.upn.HRSN00064095.service.LocationsSevices;

@Service
public class LocationsServiceImlp  implements LocationsSevices{
	@Autowired
	private LocationsRepository locationsRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Locations> findAll() throws Exception {
		
		return locationsRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Locations> findById(Integer id) throws Exception {
		
		return locationsRepository.findById(id);
	}
	@Transactional
	@Override
	public Locations save(Locations entity) throws Exception {
		
		return locationsRepository.save(entity);
	}
	@Transactional
	@Override
	public Locations update(Locations entity) throws Exception {
		
		return locationsRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		locationsRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		locationsRepository.deleteAll();
		
	}

}
