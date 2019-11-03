
package acme.features.authenticated.solicitude;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.solicitudes.Solicitude;
import acme.framework.repositories.AbstractRepository;

public interface AuthenticatedSolicitudeRepository extends AbstractRepository {

	@Query("select a from Solicitude a")
	Collection<Solicitude> findManyAll();

	@Query("select a from Solicitude a where a.id = ?1")
	Solicitude findOneById(int id);
}
