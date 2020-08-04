
package acme.features.authenticated.entrepreneur.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.applications.Application;
import acme.framework.repositories.AbstractRepository;

public interface EntrepreneurApplicationRepository extends AbstractRepository {

	@Query("select i from Application i where i.id = ?1")
	Application findOneById(int id);

	@Query("select i from Application i where i.investmentRound = (select a.investmentRound from Entrepreneur a where a.id = ?1)")
	Collection<Application> findApplicationToInvestmentRound(int id);
}
