package be.manucci.applicationms;

import be.manucci.applicationms.domain.App;
import be.manucci.applicationms.repository.IAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Utilisateur on 26-09-16.
 */
@RestController
public class AppController {
    @Autowired
    private IAppRepository appRepository;

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/save")
    public App saveApp(App app){
        appRepository.save(app);
        return app;
    }

    @RequestMapping("/all")
    public List<App> getApps(){
        return appRepository.findAll();
    }
}
