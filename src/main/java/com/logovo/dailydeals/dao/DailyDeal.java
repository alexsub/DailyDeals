package com.logovo.dailydeals.dao;

/**
 * Created by vagrant on 10/22/15.
 */


import java.math.BigDecimal;

/**
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
public class DailyDeal {

    private String name;
    private BigDecimal price;
    private BigDecimal normalPrice;

    public DailyDeal(String inName, BigDecimal inPrice, BigDecimal inNormalPrice){
        if(inPrice == null || inPrice.compareTo(BigDecimal.ZERO) != 1) {
            throw new IllegalArgumentException("Discount price cannot be ZERO or less than ZERO");
        }
        if(inNormalPrice == null || inNormalPrice.compareTo(BigDecimal.ZERO) != 1) {
            throw new IllegalArgumentException("Normal price cannot be ZERO");
        }

        this.name = inName;
        this.price = inPrice;
        this.normalPrice = inNormalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(BigDecimal normalPrice) {
        this.normalPrice = normalPrice;
    }

    @Override
    public String toString() {
        return "DailyDeal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", normalPrice=" + normalPrice +
                '}';
    }
}
