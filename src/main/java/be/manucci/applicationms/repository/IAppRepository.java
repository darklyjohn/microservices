package be.manucci.applicationms.repository;

import be.manucci.applicationms.domain.App;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Utilisateur on 26-09-16.
 */
public interface IAppRepository extends JpaRepository<App, Long> {
}
