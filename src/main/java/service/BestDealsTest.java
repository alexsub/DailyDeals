package service;

import com.logovo.dailydeals.dao.Restaurant;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 10/22/15.
 */
public class BestDealsTest {


    @Test
    public void testBestDeal(){
        Service service = new Service();
        List restuarants = new ArrayList<Restaurant>();
        service.bestDeal(restuarants);
        System.out.println(service.bestDeal(restuarants));



    }
}
