package com.logovo.dailydeals.application;

import com.logovo.dailydeals.dao.DailyDeal;
import com.logovo.dailydeals.dao.Day;
import com.logovo.dailydeals.dao.Restaurant;
import com.logovo.dailydeals.service.DailyDealService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 10/28/15.
 * test
 */
class Main {

    public static void main(String... args) {
        Restaurant restik1 = new Restaurant();
        Restaurant restik2 = new Restaurant();
        Restaurant restik3 = new Restaurant();
        DailyDeal dl1 = new DailyDeal("Fisha", BigDecimal.valueOf(9), BigDecimal.valueOf(10));
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


//            restik1.getDailyDeals();
        System.out.println(dailyDealList.size());
        dailyDealList.size();

        BigDecimal bg = dl1.getCallculatePrice1(dl1.getPrice(), dl1.getNormalPrice());

        System.out.println(bg);
        for(DailyDeal item : dailyDealList){
            System.out.println(item);
        }
        Day d = Day.FRIDAY;

//        Map dailyDeals = new HashMap<Day,List <DailyDeal>>();
//            dailyDeals.put(d.getDay(),dailyDealList);
//
//        System.out.println(dailyDeals.entrySet());

        DailyDealService service = new DailyDealService();
//        service.callculatePrice1(dl1);
        System.out.println(service.callculatePrice1(dailyDealList.get(0)));

//        service.callculateBest(dailyDealList);
        System.out.println(service.callculateBest(dailyDealList));
//        service.bestDeal();

    }

}
