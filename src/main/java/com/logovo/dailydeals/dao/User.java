package com.logovo.dailydeals.dao;

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
public class User {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String Name;
    private String Surname;
    private String email;
}
