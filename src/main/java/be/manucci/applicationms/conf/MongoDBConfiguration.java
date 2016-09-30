package be.manucci.applicationms.conf;

import com.github.mongobee.Mongobee;
import com.mongodb.Mongo;
import org.hibernate.service.spi.InjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.inject.Inject;

/**
 * Created by jnn on 30/09/2016.
 */
@EnableMongoRepositories("be.manucci.applicationms.repository")
@Import(value = MongoAutoConfiguration.class)
public class MongoDBConfiguration extends AbstractMongoConfiguration
{
    final static Logger LOGGER = LoggerFactory.getLogger(MongoDBConfiguration.class);

    @Inject
    Mongo mongo;

    @Inject
    MongoProperties mongoProperties;


    @Override
    protected String getDatabaseName() {
        return mongoProperties.getDatabase();
    }

    @Override
    public Mongo mongo() throws Exception {
        return mongo;
    }

    @Bean
    public Mongobee mongobee() {
        LOGGER.debug("Configuring Mongobee");
        Mongobee mongobee = new Mongobee(mongo);
        mongobee.setDbName(mongoProperties.getDatabase());
        // package to scan for migrations
        mongobee.setChangeLogsScanPackage("be.fgov.famhp.app.config.dbmigrations");
        mongobee.setEnabled(true);
        return mongobee;
    }
}
