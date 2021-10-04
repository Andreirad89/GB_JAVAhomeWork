package home5;

public class Master {
    public static void main(String[] args) {
        Worker mainWorker = new Worker("Радчиков Андрей Александрович", "Начальник УЭМПТ", 1989);

        mainWorker.infoWorker();

        Worker[] office = {mainWorker,
                new Worker("Жук Виталий Петрович", "Инженер системотехник", 1981),
                new Worker("Каверин Евгений Георгиевич", "Администратор системный", 1980),
                new Worker("Зуева Александра Петровна", "Специалист", 1961),
                new Worker("Мартынов Евгений Юрьевич", "Инженер", 1978),
        };
        getOldPerson(office,40);
    }
        public static void getOldPerson(Worker[] office, int year){
            for (int i = 0; i < office.length; i++)
                if (office[i].getAge() > year) {
                    System.out.println(office[i].infoWorker());
                }
        }
    }
