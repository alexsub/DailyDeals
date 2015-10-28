package com.logovo.dailydeals.service;

import com.logovo.dailydeals.dao.Restaurant;

import java.util.List;

/**
 * Created by vagrant on 10/22/15.

 Создайте мавен проект в вашей среде разработки.
 1.Добавьте зависимости JUnit, Apache commons lang
 2.Создайте пакет: com.logovo.dailydeals
 3.В вышеуказанном пакете создайте пакет dao и в нём:
 4.Создайте класс Restaraunt с полями лист Administrator-ов, имя и коллекцией DailyDeal
 5.Создайте класс DailyDeal с конструктором (String name, BigDecimal price, BigDecimal normalPrice)
 6.Создайте класс User с полями имя, фамилия, э-почта
 7.Создайте класс Administrator наследованным от класса User
 8.Создайте enum Day(String name): MONDAY, TUESDAY … SUNDAY и метод который будет возвращать имя в удобном человеку виде
 9.Видимость всех полей вышеуказанных классов для других классов должна отсутствовать
 10.Для изменения полей или получения их значений создайте необходимые методы
 11.В пакете com.logovo.dailydeals создайте пакет service
 12.В нём создайте метод который находит лучшую сделку из всех ресторанов в листе и выводит её методом в формате: “Only on ”
 Создайте тест для этого метода.
 Запуште ваш проект в новый репозиторий на гитхабе.
 */


public class Service {


//    Restaurant restik1 = new Restaurant();
//    Restaurant restik2 = new Restaurant();
//    Restaurant restik3 = new Restaurant();
//    DailyDeal dl1 = new DailyDeal("Fisha", BigDecimal.valueOf(5), BigDecimal.valueOf(10));
//    DailyDeal dl2 = new DailyDeal("Hrjuwa", BigDecimal.valueOf(2), BigDecimal.valueOf(7));
//    DailyDeal dl3 = new DailyDeal("Kartowa", BigDecimal.valueOf(6), BigDecimal.valueOf(12));
//    DailyDeal dl4 = new DailyDeal("Hlebuwa", BigDecimal.valueOf(8), BigDecimal.valueOf(10));
//    DailyDeal dl5 = new DailyDeal("Kelbas", BigDecimal.valueOf(5), BigDecimal.valueOf(9));
//    DailyDeal dl6 = new DailyDeal("Zhuljen", BigDecimal.valueOf(4), BigDecimal.valueOf(13));




    public String bestDeal(List<Restaurant> restaurants){


        return "slha";

    }


}
