package com.logovo.dailydeals.application;

import com.logovo.dailydeals.dao.DailyDeal;
import com.logovo.dailydeals.dao.Restaurant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 10/28/15.
 */
class Main {

    public static void main(String... args) {
        Restaurant restik1 = new Restaurant();
        Restaurant restik2 = new Restaurant();
        Restaurant restik3 = new Restaurant();
        DailyDeal dl1 = new DailyDeal("Fisha", BigDecimal.valueOf(5), BigDecimal.valueOf(10));
        DailyDeal dl2 = new DailyDeal("Hrjuwa", BigDecimal.valueOf(2), BigDecimal.valueOf(7));
        DailyDeal dl3 = new DailyDeal("Kartowa", BigDecimal.valueOf(6), BigDecimal.valueOf(12));
        DailyDeal dl4 = new DailyDeal("Hlebuwa", BigDecimal.valueOf(8), BigDecimal.valueOf(10));
        DailyDeal dl5 = new DailyDeal("Kelbas", BigDecimal.valueOf(5), BigDecimal.valueOf(9));
        DailyDeal dl6 = new DailyDeal("Zhuljen", BigDecimal.valueOf(4), BigDecimal.valueOf(13));
        List<DailyDeal> dailyDealList = new ArrayList<DailyDeal>();
            dailyDealList.add(dl1);
            dailyDealList.add(dl2 = new DailyDeal("Hrjuwa", BigDecimal.valueOf(2), BigDecimal.valueOf(7)));
        System.out.println(dailyDealList.size());
        dailyDealList.size();


        dailyDealList.size();
        dailyDealList.size();

    }

}
