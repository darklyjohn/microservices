package be.manucci.applicationms.conf.dbmigrations;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by jnn on 30/09/2016.
 */
@ChangeLog(order = "001")
public class InitialSetupMigration {

    @ChangeSet(order = "001", id="01-addusers", author = "initiator")
    public void addUsers(MongoDatabase db) {
        MongoCollection<Document> dbCollection = db.getCollection("ms-users");
        dbCollection.insertOne(
                new Document("username","john")
                .append("role","ADMIN")
        );
    }
}
