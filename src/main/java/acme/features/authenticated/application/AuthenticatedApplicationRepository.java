
package acme.features.authenticated.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.applications.Application;
import acme.framework.repositories.AbstractRepository;

public interface AuthenticatedApplicationRepository extends AbstractRepository {

	@Query("select i from Application i where i.id = ?1")
	Application findOneById(int id);

	@Query("select i from Application i where i.id = ?1")
	Collection<Application> findApplicationToInvestmentRound(int id);
}
