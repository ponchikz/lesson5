package lesson5;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст

public class Sotrydnik {
    public String fio;
    public String doljnost;
    public String email;
    public String telefon;
    public double zarplata;
    public int vozrost;

    //Конструктор класса должен заполнять эти поля при создании объекта

    public Sotrydnik(String fio, String doljnost, String email, String telefon, double zarplata, int vozrost) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrost = vozrost;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль

    public void Info1() {
        System.out.println(" " + fio + " " + doljnost + " " + email + " " +  telefon + " " + zarplata + " " + vozrost);
    }

    public int getVozrost() {
        return vozrost;
    }
}
