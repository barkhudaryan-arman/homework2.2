public class Main {
    public static void main(String[] args) {
        Hogwarts dambledore = new Hogwarts("Альбус", 100,100);

        Hogwarts harry = new Gryffindor("Гарри Поттер", 100,100, 85, 75,65 );
        Hogwarts ron = new Gryffindor("Рон Уизли", 60,80, 70, 60,80 );
        Hogwarts hermione = new Gryffindor("Гермиона Грейнджер", 90,100, 70, 70,80 );
        Slytherin draco = new Slytherin("Драко Малфой", 80, 90, 75, 55,45,85,90);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 65, 55, 60, 80,80,40,90);
        Slytherin gregory = new Slytherin("Грегори Гойл", 90, 90, 75, 55,45,85,90);
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 75,80, 80, 75,65 );
        Hufflepuff sadrick = new Hufflepuff("Седрик Диггори", 75,85, 90, 75,65 );
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 55,60, 55, 75,65);
        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 85,55, 90, 75,65,80);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 70,70, 70, 75,65,60);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 55,90, 50, 75,65,55);

        // Сравнение учеников одного факультета
        System.out.println("Сравнение учеников Гриффиндора:");
        harry.compare(ron);
        System.out.println("-------------------");

        System.out.println("Сравнение учеников Пуффендуй:");
        zacharias.compare(justin);
        System.out.println("-------------------");

        System.out.println("Сравнение учеников Когтевран:");
        cho.compare(padma);
        System.out.println("-------------------");

        System.out.println("Сравнение учеников Слизерин:");
        draco.compare(graham);
        System.out.println("-------------------");

        // Сравнение учеников по силе магии и расстоянию трансгрессии
        System.out.println("Сравнение учеников по силе магии и расстоянию трансгрессии:");
        harry.compare(draco);
    }
    // Метод для сравнения двух учеников по силе магии и расстоянию трансгрессии
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int magic1 = student1.getMagicPower();
        int magic2 = student2.getMagicPower();

        int trans1 = student1.getApparitionDistance();
        int trans2 = student2.getApparitionDistance();

        // Вычисляем разницу между силой магии и расстоянием трансгрессии
        int diffMagic = magic1 - magic2;
        int diffTrans = trans1 - trans2;

        // Выводим результат сравнения
        if (diffMagic > 0 && diffTrans > 0) {
            System.out.println("Первый ученик сильнее и может трансгредировать дальше, чем второй.");
        } else if (diffMagic < 0 && diffTrans < 0) {
            System.out.println("Второй ученик сильнее и может трансгредировать дальше, чем первый.");
        } else {
            System.out.println("У обоих учеников одинаковая магия и расстояние трансгрессии.");
        }
    }
}
