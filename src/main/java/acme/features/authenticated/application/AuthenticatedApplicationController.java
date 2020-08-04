
package acme.features.authenticated.application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.applications.Application;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/application/")
public class AuthenticatedApplicationController extends AbstractController<Authenticated, Application> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedApplicationShowService	showService;

	@Autowired
	private AuthenticatedApplicationListService	listService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.LIST, this.listService);
	}

}
