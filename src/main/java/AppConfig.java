import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import service.MarketNewsService;

/**
 * Created by syang5 on 12/31/2016.
 */

@Configuration
@PropertySource("classpath:application.properties")
@EnableMongoRepositories(basePackages = "repository")
public class AppConfig extends AbstractMongoConfiguration {

    @Bean
    static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name="marketNewsService")
    public MarketNewsService getMarketNewsService() {
        return new MarketNewsService();
    }

    @Value("${spring.data.mongodb.uri}")
    private String mongoDB_URI;

    @Bean(name="mongoClientURI")
    public MongoClientURI getMongoDB_URI(){
        return new MongoClientURI(mongoDB_URI);
    }

    @Override
    protected String getDatabaseName() {
        return "mydev";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(getMongoDB_URI());
    }
}
