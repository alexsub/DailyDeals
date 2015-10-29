package com.logovo.dailydeals.service;

import com.logovo.dailydeals.dao.DailyDeal;
import com.logovo.dailydeals.dao.Restaurant;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by vagrant on 10/22/15.
 * <p>
 * Создайте мавен проект в вашей среде разработки.
 * 1.Добавьте зависимости JUnit, Apache commons lang
 * 2.Создайте пакет: com.logovo.dailydeals
 * 3.В вышеуказанном пакете создайте пакет dao и в нём:
 * 4.Создайте класс Restaraunt с полями лист Administrator-ов, имя и коллекцией DailyDeal
 * 5.Создайте класс DailyDeal с конструктором (String name, BigDecimal price, BigDecimal normalPrice)
 * 6.Создайте класс User с полями имя, фамилия, э-почта
 * 7.Создайте класс Administrator наследованным от класса User
 * 8.Создайте enum Day(String name): MONDAY, TUESDAY … SUNDAY и метод который будет возвращать имя в удобном человеку виде
 * 9.Видимость всех полей вышеуказанных классов для других классов должна отсутствовать
 * 10.Для изменения полей или получения их значений создайте необходимые методы
 * 11.В пакете com.logovo.dailydeals создайте пакет service
 * 12.В нём создайте метод который находит лучшую сделку из всех ресторанов в листе и выводит её методом в формате: “Only on ”
 * Создайте тест для этого метода.
 * Запуште ваш проект в новый репозиторий на гитхабе.
 */


public class DailyDealService {

    public String bestDeal(List<Restaurant> restaurants) {

        return "slha";
    }

    public BigDecimal callculatePrice1(DailyDeal dl) {
        BigDecimal price = dl.getPrice();
        BigDecimal normalPrice = dl.getNormalPrice();
        BigDecimal result = BigDecimal.valueOf(100).subtract(price.divide(normalPrice, 2,
                BigDecimal.ROUND_HALF_EVEN).multiply(BigDecimal.valueOf(100)));

        return result;
    }

    public BigDecimal callculateBest(List<DailyDeal> dailyDeals) {
        DailyDealService dailyDealService = new DailyDealService();
        BigDecimal check = BigDecimal.valueOf(0);
        BigDecimal bg = null;
        DailyDeal dl = null;

        for (DailyDeal deal : dailyDeals) {

            bg = dailyDealService.callculatePrice1(deal);
            int res = bg.compareTo(check);
            if (res == 1) {
                check = bg;
                dl = deal;
            }
            System.out.println(dailyDealService.callculatePrice1(deal) + "% Dlja deal " + deal);

        }
        System.out.println(dl + " " + check);
        return check;
    }

    public DailyDeal callculateBestDeal(List<DailyDeal> dailyDeals) {
        DailyDealService dailyDealService = new DailyDealService();
        BigDecimal check = BigDecimal.valueOf(0);
        BigDecimal bg = null;
        DailyDeal dl = null;

        for (DailyDeal deal : dailyDeals) {
            bg = dailyDealService.callculatePrice1(deal);
            int res = bg.compareTo(check);
            if (res == 1) {
                check = bg;
                dl = deal;
            }

            System.out.println(dailyDealService.callculatePrice1(deal) + "% Dlja deal " + deal);

        }
        System.out.println(dl + " " + check);

        return dl;
    }

}
