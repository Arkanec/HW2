
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var BoxerWeight1 = 78.2;
        System.out.println(BoxerWeight1);
        var BoxerWeight2 = 82.7;
        System.out.println(BoxerWeight2);
        var TotalWeight = BoxerWeight1 + BoxerWeight2;
        System.out.println("Общий вес бойцов " + TotalWeight + " кг ");
        var WeightDifference = BoxerWeight2 - BoxerWeight1;
        System.out.println("Разница в весе " + WeightDifference + " кг ");

        System.out.println("Задача 7");
        var WeightDefference = BoxerWeight2 - BoxerWeight1;
        System.out.println(WeightDefference);
        WeightDefference = BoxerWeight2 % BoxerWeight1;
        System.out.println(WeightDefference);

        System.out.println("Задача 8");
        var TotalTime = 640;
        var PeopleTime = 8;
        var PeopleWork = TotalTime / PeopleTime;
        System.out.println("Всего работников в компании " + PeopleWork + " человек ");
        PeopleWork = PeopleWork + 94;
        System.out.println(PeopleWork);
        TotalTime = PeopleWork * PeopleTime;
        System.out.println("Если в компании работает " + PeopleWork + " человек, то всего " + TotalTime + " часов " +
                "работы может быть поделено между сотрудниками");

    }
}