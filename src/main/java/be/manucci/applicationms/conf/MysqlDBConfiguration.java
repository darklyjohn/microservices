package be.manucci.applicationms.conf;

import be.manucci.applicationms.conf.settings.ApplicationSettings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Created by Jonathan on 28/09/2016.
 */
@EnableJpaRepositories("be.manucci.applicationms.repository")
@org.springframework.context.annotation.Configuration
public class MysqlDBConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(MysqlDBConfiguration.class);

//    @Autowired
//    ApplicationSettings applicationSettings;
//
//
//    @Bean
//    public Connection mysqlDataBase(){
//       return createMySQLConnection(applicationSettings).orElseThrow(() -> new IllegalStateException("Could not configure mysql connection"));
//    }
//
//    public static Optional<Connection> createMySQLConnection(ApplicationSettings applicationSettings){
//        String serverAdress = applicationSettings.getServerAdress();
//        String dbName = applicationSettings.getDbName();
//        String user = applicationSettings.getUser();
//        String pwd = applicationSettings.getPassword();
//
//        try {
//            return Optional.of(DriverManager.getConnection("jdbc:mysql://" + serverAdress + "/"+ dbName + "?user=" + user + "&password=" + pwd));
//        } catch (SQLException e) {
//            LOGGER.error(e.getMessage());
//        }
//        return Optional.empty();
//    }

    }
