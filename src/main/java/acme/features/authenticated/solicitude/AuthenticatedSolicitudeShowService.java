
package acme.features.authenticated.solicitude;

import org.springframework.beans.factory.annotation.Autowired;

import acme.entities.solicitudes.Solicitude;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

public class AuthenticatedSolicitudeShowService implements AbstractShowService<Authenticated, Solicitude> {
	// Internal State ------------------------------------------------------

	@Autowired
	AuthenticatedSolicitudeRepository repository;


	// AbstractListService<Authenticated, Solicitude> interface ------------

	@Override
	public boolean authorise(final Request<Solicitude> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Solicitude> request, final Solicitude entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "moment", "dateLimit", "text", "money", "titker");

	}

	@Override
	public Solicitude findOne(final Request<Solicitude> request) {
		assert request != null;

		Solicitude result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
