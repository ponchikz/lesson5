package lesson5;

//������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������

public class Sotrydnik {
    public String fio;
    public String doljnost;
    public String email;
    public String telefon;
    public double zarplata;
    public int vozrost;

    //����������� ������ ������ ��������� ��� ���� ��� �������� �������

    public Sotrydnik(String fio, String doljnost, String email, String telefon, double zarplata, int vozrost) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrost = vozrost;
    }

    //������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������

    public void Info1() {
        System.out.println(" " + fio + " " + doljnost + " " + email + " " +  telefon + " " + zarplata + " " + vozrost);
    }

    public int getVozrost() {
        return vozrost;
    }
}
