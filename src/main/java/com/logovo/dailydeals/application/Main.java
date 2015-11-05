package com.logovo.dailydeals.application;

import com.logovo.dailydeals.dao.DailyDeal;
import com.logovo.dailydeals.dao.Day;
import com.logovo.dailydeals.dao.Restaurant;
import com.logovo.dailydeals.service.DailyDealService;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by vagrant on 10/28/15.
 * test
 */
class Main {

    public static void main(String... args) {


        Restaurant restik1 = new Restaurant("Restik1");
        Restaurant restik2 = new Restaurant("Restik2");
        Restaurant restik3 = new Restaurant();
        DailyDeal dl1 = new DailyDeal("Fisha", BigDecimal.valueOf(9), BigDecimal.valueOf(10));
        DailyDeal dl2 = new DailyDeal("Hrjuwa", BigDecimal.valueOf(2), BigDecimal.valueOf(8));
        DailyDeal dl3 = new DailyDeal("Kartowa", BigDecimal.valueOf(6), BigDecimal.valueOf(12));
        DailyDeal dl4 = new DailyDeal("Hlebuwa", BigDecimal.valueOf(8), BigDecimal.valueOf(10));
        DailyDeal dl5 = new DailyDeal("Kelbas", BigDecimal.valueOf(5), BigDecimal.valueOf(9));
        DailyDeal dl6 = new DailyDeal("Zhuljen", BigDecimal.valueOf(4), BigDecimal.valueOf(13));
        DailyDeal dl7 = new DailyDeal("Fisha2", BigDecimal.valueOf(9), BigDecimal.valueOf(10));
//        DailyDeal dl8 = new DailyDeal("Hrjuwa2", BigDecimal.valueOf(2), BigDecimal.valueOf(8));
        DailyDeal dl9 = new DailyDeal("BestEverKartowa2", BigDecimal.valueOf(1), BigDecimal.valueOf(50));
//        DailyDeal dl10 = new DailyDeal("Hlebuwa2", BigDecimal.valueOf(5), BigDecimal.valueOf(20));
//        DailyDeal dl11 = new DailyDeal("Kelbas2", BigDecimal.valueOf(6), BigDecimal.valueOf(20));
//        DailyDeal dl13 = new DailyDeal("Zhuljen2", BigDecimal.valueOf(4), BigDecimal.valueOf(15));
//        DailyDeal dl14 = new DailyDeal("Fisha3", BigDecimal.valueOf(7), BigDecimal.valueOf(11));
//        DailyDeal dl15 = new DailyDeal("Hrjuwa3", BigDecimal.valueOf(4), BigDecimal.valueOf(5));
//        DailyDeal dl16 = new DailyDeal("Kartowa3", BigDecimal.valueOf(11), BigDecimal.valueOf(12));
//        DailyDeal dl17 = new DailyDeal("Hlebuwa3", BigDecimal.valueOf(4), BigDecimal.valueOf(10));
//        DailyDeal dl18 = new DailyDeal("Kelbas3", BigDecimal.valueOf(6), BigDecimal.valueOf(9));
//        DailyDeal dl19 = new DailyDeal("Zhuljen3", BigDecimal.valueOf(7), BigDecimal.valueOf(13));
//        DailyDeal d20 = new DailyDeal("Fisha4", BigDecimal.valueOf(9), BigDecimal.valueOf(10));
//        DailyDeal d21 = new DailyDeal("Hrjuwa4", BigDecimal.valueOf(2), BigDecimal.valueOf(8));
//        DailyDeal d22 = new DailyDeal("Kartowa4", BigDecimal.valueOf(5), BigDecimal.valueOf(12));
//        DailyDeal d23 = new DailyDeal("Hlebuwa4", BigDecimal.valueOf(3), BigDecimal.valueOf(10));
//        DailyDeal d24 = new DailyDeal("Kelbas4", BigDecimal.valueOf(5), BigDecimal.valueOf(9));
//        DailyDeal d25 = new DailyDeal("Zhuljen4", BigDecimal.valueOf(5), BigDecimal.valueOf(13));
//        DailyDeal d26 = new DailyDeal("Fisha5", BigDecimal.valueOf(9), BigDecimal.valueOf(10));
//        DailyDeal d27 = new DailyDeal("Hrjuwa5", BigDecimal.valueOf(6), BigDecimal.valueOf(8));
//        DailyDeal d28 = new DailyDeal("Kartowa5", BigDecimal.valueOf(6), BigDecimal.valueOf(9));
//        DailyDeal dl4 = new DailyDeal("Hlebuwa5", BigDecimal.valueOf(8), BigDecimal.valueOf(10));
//        DailyDeal dl5 = new DailyDeal("Kelbas", BigDecimal.valueOf(5), BigDecimal.valueOf(9));
//        DailyDeal dl6 = new DailyDeal("Zhuljen", BigDecimal.valueOf(4), BigDecimal.valueOf(13));

        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        Map dailyDeals = new HashMap<Day,List <DailyDeal>>();
        List<DailyDeal> dailyDealList = new ArrayList<DailyDeal>();

        dailyDealList.add(dl1);
        dailyDealList.add(dl2);
        dailyDeals.put(Day.MONDAY, dailyDealList);
        dailyDealList = new ArrayList<DailyDeal>();
//        System.out.println(dailyDeals.entrySet());
       // dailyDealList.clear();
//        System.out.println(dailyDealList);
        dailyDealList.add(dl3);
        dailyDealList.add(dl4);
        dailyDeals.put(Day.TUESDAY, dailyDealList);
        dailyDealList = new ArrayList<DailyDeal>();
//        System.out.println(dailyDeals.entrySet());
      //  dailyDealList.clear();
//        System.out.println(dailyDealList);
        restik1.setDailyDeals(dailyDeals);
//        System.out.println("Iz restika 1" + restik1.getDailyDeals());
//        System.out.println(restik1);

        dailyDeals = new HashMap<Day,List <DailyDeal>>();
//        System.out.println(restik1);
        dailyDealList.add(dl5);
        dailyDealList.add(dl6);
        dailyDeals.put(Day.MONDAY, dailyDealList);
        dailyDealList = new ArrayList<DailyDeal>();
//        System.out.println(dailyDeals.entrySet());
        dailyDealList.add(dl7);
        dailyDealList.add(dl9);
        dailyDeals.put(Day.TUESDAY, dailyDealList);
        restik2.setDailyDeals(dailyDeals);
//        System.out.println("Iz restika 2" + restik2.getDailyDeals());

//        restaurants.add(restik1);
        restaurants.add(restik1);
        restaurants.add(restik2);
        DailyDealService service = new DailyDealService();
//        System.out.println(restik1);
//        System.out.println(restik2);
//        System.out.println(restaurants);
        service.findBestDeal(restaurants);
        System.out.println(service.findBestDeal(restaurants));
//        System.out.println(dailyDeals.entrySet());

//        System.out.println(dailyDeals.values().size());
//        Collection allDeals ;
//        allDeals = dailyDeals.values();
//        System.out.println(allDeals);
//      //  dailyDealList.clear();
//        System.out.println(dailyDealList);
//        dailyDealList.add(dl7);
//        dailyDealList.add(dl8);
//        dailyDeals.put(thursday, dailyDealList);
//        System.out.println(dailyDeals.entrySet());
//        dailyDealList.clear();
//        System.out.println(dailyDealList);
//        dailyDealList.add(dl9);
//        dailyDealList.add(dl10);
//        dailyDeals.put(friday, dailyDealList);
//        System.out.println(dailyDeals.entrySet());
//        dailyDealList.clear();
//        System.out.println(dailyDealList);





////            restik1.getDailyDeals();
//        System.out.println(dailyDealList.size());
//        dailyDealList.size();
//
////        BigDecimal bg = dl1.getCallculatePrice1(dl1.getPrice(), dl1.getNormalPrice());
//
////        System.out.println(bg);
//        for(DailyDeal item : dailyDealList){
//            System.out.println(item);
//        }
//
//
//

////
////        System.out.println(dailyDeals.entrySet());
//
//        DailyDealService service = new DailyDealService();
////        service.callculatePrice1(dl1);
//        System.out.println(service.callculatePrice1(dailyDealList.get(0)));
//
////        service.callculateBest(dailyDealList);
//        System.out.println(service.callculateBest(dailyDealList));
//        service.bestDeal();

    }

}
