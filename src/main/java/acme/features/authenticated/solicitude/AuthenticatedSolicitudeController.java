
package acme.features.authenticated.solicitude;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.solicitudes.Solicitude;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/solicitude/")
public class AuthenticatedSolicitudeController extends AbstractController<Authenticated, Solicitude> {
	//	Internal state ------------

	@Autowired
	private AuthenticatedSolicitudeListService	listService;

	@Autowired
	private AuthenticatedSolicitudeShowService	showService;


	//	Constructors -------------

	@PostConstruct
	private void initalise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
