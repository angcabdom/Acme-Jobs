
package acme.features.authenticated.solicitude;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.solicitudes.Solicitude;
import acme.framework.repositories.AbstractRepository;

public interface AuthenticatedSolicitudeRepository extends AbstractRepository {

	@Query("select s from Solicitude s")
	Collection<Solicitude> findManyAll();

	@Query("select s from Solicitude s where s.id = ?1")
	Solicitude findOneById(int id);
}
