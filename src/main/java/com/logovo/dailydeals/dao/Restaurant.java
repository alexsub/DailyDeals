package com.logovo.dailydeals.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vagrant on 10/22/15.
 */

/**
 Создайте мавен проект в вашей среде разработки.
 Добавьте зависимости JUnit, Apache commons lang
 Создайте пакет: com.logovo.dailydeals
 В вышеуказанном пакете создайте пакет dao и в нём:
 Создайте класс Restaraunt с полями лист Administrator-ов, имя и коллекцией DailyDeal
 Создайте класс DailyDeal с конструктором (String name, BigDecimal price, BigDecimal normalPrice)
 Создайте класс User с полями имя, фамилия, э-почта
 Создайте класс Administrator наследованным от класса User
 Создайте enum Day(String name): MONDAY, TUESDAY … SUNDAY и метод который будет возвращать имя в удобном человеку виде
 Видимость всех полей вышеуказанных классов для других классов должна отсутствовать
 Для изменения полей или получения их значений создайте необходимые методы
 В пакете com.logovo.dailydeals создайте пакет service
 В нём создайте метод который находит лучшую сделку из всех ресторанов в листе и выводит её методом в формате: “Only on ”
 Создайте тест для этого метода.
 Запуште ваш проект в новый репозиторий на гитхабе.
 */
public class Restaurant {
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", dailyDeals=" + dailyDeals +
                '}';
    }

    public Restaurant(){

    }
    public Restaurant(String name){
        this.name = name;
    }
    public Restaurant(String name, HashMap<Day, List <DailyDeal>> dayListHashMap ){
        this.name = name;
        this.dailyDeals = dayListHashMap;

    }

    public List getAdministrator() {
        return administrator;
    }

    public void setAdministrator(List administrator) {
        administrator = administrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private List administrator;
    private String name;

    public void setDayDeals(Day d, List<DailyDeal> dailyDeals){

    }

    public Map getDailyDeals() {
        return dailyDeals;
    }

    public void setDailyDeals(Map dailyDeals) {
        this.dailyDeals = dailyDeals;
    }

    private Map dailyDeals = new HashMap<Day,List <DailyDeal>>();

}
