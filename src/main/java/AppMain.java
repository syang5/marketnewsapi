import model.MarketNews;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.MarketNewsRepository;
import service.MarketNewsService;
import java.util.List;

/**
 * Created by syang5 on 1/1/2017.
 */


public class AppMain {

    public static void main(String[] args) {


        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MarketNewsService service = appContext.getBean(MarketNewsService.class);

        List<?> news = service.findByEvent("target-estimate");

        System.out.println(news.get(0));
        System.out.println("Length of news list " + news.size());
        System.out.println(news);

        System.out.println(news.get(0));

        news = service.findOptionNews();
        System.out.println(news);

        news = service.findEarningBeat();
        System.out.println(news);

        news = service.findTargetEstimate();
        System.out.println(news);

    }
}
