public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var fstWeight = 78.2;
        var sndWeight = 82.7;
        var commonWeight = fstWeight + sndWeight;
        System.out.println("Общий вес двух боксеров " + commonWeight + "кг ");
        var difWeight = sndWeight - fstWeight;
        System.out.println("Разница в весе двух боксеров " + difWeight + "кг ");
        var diffWeight = sndWeight % fstWeight;
        System.out.println("Разница в весе двух боксеров " + diffWeight + "кг ");
        var totalTime = 640;
        var countEmpl = totalTime / 8;
        System.out.println("Всего работников в компании - " + countEmpl + " человек");
        var newCountEmpl = countEmpl + 94;
        var time= totalTime / newCountEmpl;
        System.out.println("Если в компании работает " + newCountEmpl + " человек, то всего " + time + " часа работы может быть поделено между сотрудниками");

    }

}