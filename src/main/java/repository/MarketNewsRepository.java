package repository;
import model.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by syang5 on 12/31/2016.
 */

public interface MarketNewsRepository extends MongoRepository<MarketNews, String>{

    List<MarketNews> findAll();
    @Query("{ 'event' : ?0 }")
    List<MarketNews> findByEvent(@Param("event") String event);

    @Query("{ 'event' : 'option' }")
    List<OptionNews> findOptionNews();

    @Query("{ 'event' : 'earning-beat' }")
    List<EarningBeat> findEarningBeat();

    @Query("{ 'event' : 'target-estimate' }")
    List<TargetEstimate> findTargetEstimate();

    @Query("{ 'event' : 'insider-buy' }")
    List<InsiderBuy> findInsiderBuy();
}

