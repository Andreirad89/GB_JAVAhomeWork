package home5;

public class Worker {
    static int CURRENT_YEAR = 2021;
    String Fullname;
    int birthyear;
    String mail;
    String position;
    String numberphone;
    String money;

    public Worker(String Fullname, String position, int birthyear) {
        this.Fullname = Fullname;
        this.birthyear = birthyear;
        this.position = position;
    }

    int getAge() {
        return CURRENT_YEAR - birthyear;
    }

    String infoWorker() {
        return "ФИО :" + Fullname + "; " +"Год рождения : " +  birthyear + "; "+ "Занимаемая должность :" + position;
    }
}


