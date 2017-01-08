package service;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import repository.MarketNewsRepository;

import java.util.List;

/**
 * Created by syang5 on 1/4/2017.
 */
public class MarketNewsService {

    @Autowired
    MarketNewsRepository marketNewsRepository;

    public List<MarketNews> findAll() {
        return marketNewsRepository.findAll();
    }

    public List<MarketNews> findByEvent(String event){
        return marketNewsRepository.findByEvent(event);
    }

    public List<OptionNews> findOptionNews(){
        return marketNewsRepository.findOptionNews();
    }

    public List<EarningBeat> findEarningBeat(){
        return marketNewsRepository.findEarningBeat();
    }
    public List<TargetEstimate> findTargetEstimate(){
        return marketNewsRepository.findTargetEstimate();
    }

    public List<InsiderBuy> findInsiderBuy() {
        return marketNewsRepository.findInsiderBuy();
    }
}
