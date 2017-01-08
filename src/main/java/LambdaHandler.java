import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.MarketNews;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MarketNewsService;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * Created by syang5 on 1/4/2017.
 */
public class LambdaHandler {

    public static class RequestClass {
        String queryName;
        String parameters;

        public String getQueryName() {
            return queryName;
        }

        public void setQueryName(String queryName) {
            this.queryName = queryName;
        }

        public String getParameters() {
            return parameters;
        }

        public void setParameters(String parameters) {
            this.parameters = parameters;
        }

    }

    public static List<?> myHandler(RequestClass request, Context context) {
        LambdaLogger logger = context.getLogger();

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MarketNewsService service = appContext.getBean(MarketNewsService.class);
        String queryName = request.getQueryName();
        logger.log("queryName received %s".format(queryName));

        String result = "No query found to return data";
        List<?> news = new ArrayList<Object>();
        switch (queryName) {
            case "findAll":
                logger.log("calling service.findAll...");
                news = service.findAll();
                break;
            case "findByEvent":
                logger.log("calling service.findByEvent...");
                news = service.findByEvent(request.getParameters());
                break;
            case "findOptionNews":
                logger.log("calling service.findOptionNews...");
                news = service.findOptionNews();
                break;
            case "findEarningBeat":
                logger.log("calling service.findOptionNews...");
                news = service.findEarningBeat();
                break;
            case "findTargetEstimate":
                logger.log("calling service.findTargetEstimate...");
                news = service.findTargetEstimate();
                break;
            case "findInsiderBuy":
                logger.log("calling service.findInsiderBuy...");
                news = service.findInsiderBuy();
                break;
        }
        return news;
    }

}
