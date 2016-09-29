package be.manucci.applicationms.conf;

import be.manucci.applicationms.conf.settings.ApplicationSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by Jonathan on 28/09/2016.
 */
@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
@ConfigurationProperties
@ComponentScan(basePackages = {"be.manucci.applicationms"})
public class Configuration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);

//    @Bean
//    public ApplicationSettings applicationSettings() {
//        final String yamlPath = "/application.yml";
//        final ApplicationSettings applicationSettings = loadYamalAs(yamlPath, ApplicationSettings.class)
//                .orElseThrow(() -> new IllegalStateException("Could not configure application from " + yamlPath));
//        return applicationSettings;
//    }
//
//    public static <T> Optional<T> loadYamalAs(String yamalPath, Class<T> type){
//        if(!StringUtils.isEmpty(yamalPath)){
//            final ClassPathResource resource = new ClassPathResource(yamalPath);
//            try{
//                return Optional.of(new Yaml().loadAs(resource.getInputStream(), (Class<T>)type));
//            }catch(IOException e){
//                LOGGER.error(e.getMessage());
//            }
//        }
//        return Optional.empty();
//
//    }

}
