package pe.edu.upn.HRSN00064095.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.HRSN00064095.model.entity.Locations;
@Repository
public interface LocationsRepository extends JpaRepository<Locations, Integer> {

}
