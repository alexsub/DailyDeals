package test;

import com.logovo.dailydeals.dao.DailyDeal;
import com.logovo.dailydeals.service.DailyDealService;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 10/29/15.
 */
public class DailyDealDailyDealServiceTest {

    final DailyDealService dailyDealService = new DailyDealService();

    @Test
    public void bestDealCallculateTest(){

        DailyDeal dl1 = new DailyDeal("Fisha", BigDecimal.valueOf(0), BigDecimal.valueOf(10));
        DailyDeal dl2 = new DailyDeal("Hrjuwa", BigDecimal.valueOf(2), BigDecimal.valueOf(8));
        DailyDeal dl3 = new DailyDeal("Kartowa", BigDecimal.valueOf(6), BigDecimal.valueOf(12));
        DailyDeal dl4 = new DailyDeal("Hlebuwa", BigDecimal.valueOf(8), BigDecimal.valueOf(10));
        DailyDeal dl5 = new DailyDeal("Kelbas", BigDecimal.valueOf(5), BigDecimal.valueOf(9));
        DailyDeal dl6 = new DailyDeal("Zhuljen", BigDecimal.valueOf(4), BigDecimal.valueOf(13));
        List<DailyDeal> dailyDealList = new ArrayList<DailyDeal>();
        dailyDealList.add(dl1);
        dailyDealList.add(dl2);
        dailyDealList.add(dl3);
        dailyDealList.add(dl4);
        dailyDealList.add(dl5);
        dailyDealList.add(dl6);
        Assert.assertEquals(dl1, dailyDealService.callculateBestDeal(dailyDealList));



    }
}
