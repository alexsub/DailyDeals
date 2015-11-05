package com.logovo.dailydeals.service;

import com.logovo.dailydeals.dao.DailyDeal;
import com.logovo.dailydeals.dao.Day;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vagrant on 11/4/15.
 */
public class RestaurantService
{

    public Map<Day, List<DailyDeal>> dailyDeals = new HashMap<Day,List <DailyDeal>>();


    public Map setDayMenu(Day day, List<DailyDeal> dayDeals){


    return dailyDeals;
    }



}

