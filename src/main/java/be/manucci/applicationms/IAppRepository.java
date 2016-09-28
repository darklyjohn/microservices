package be.manucci.applicationms;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by Utilisateur on 26-09-16.
 */
public interface IAppRepository extends JpaRepository<App, Long> {
}
