package lesson5;

public class lesson5_0 {
    public static void main(String[] args) {

        //Создать массив из 5 сотрудников

        Sotrydnik sotrydnik1 = new Sotrydnik("Ivan.Y.R.", "slesar4r", "ivan@mai.ru",
                "+79999112233", 40000, 41);
        Sotrydnik sotrydnik2 = new Sotrydnik("Dima.D.M.", "slesar3r", "dima@mai.ru",
                "+79999112244", 35000, 28);
        Sotrydnik sotrydnik3 = new Sotrydnik("Pasha.A.O.", "slesar3r", "pasha@mai.ru",
                "+79999118833", 35000, 32);
        Sotrydnik sotrydnik4 = new Sotrydnik("Igor.K.A.", "slesar4r", "igor@mai.ru",
                "+79999112288", 40000, 38);
        Sotrydnik sotrydnik5 = new Sotrydnik("Vlad.V.V.", "slesar5r", "vlad@mai.ru",
                "+79999112299", 45000, 48);

        Sotrydnik[] sotrydnik = new Sotrydnik[]{

                sotrydnik1, sotrydnik2, sotrydnik3, sotrydnik4, sotrydnik5

        };

        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет

        for (int i = 0; i < sotrydnik.length; i++) {
            if (sotrydnik[i].getVozrost() > 40) {
                sotrydnik[i].Info1();
            }
        }
    }
}

