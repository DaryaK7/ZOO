package org.my;
import org.my.All.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add(" Cat");
        names.add(" Dog ");
        names.add(" Lion");
        names.add(" Parrot");
        names.add(" Owl");
        names.add(" Cuckoo");
        names.add(" Catfish");
        names.add(" Balloonfish");
        names.add(" Electric eels");
        Animals allAnimals = new Animals("move on the ground", "breathe the air");
        Birds allBirds = new Birds("move in the air","breathe the air");
        Fish allFish = new Fish("move in the water", "breathe the water");
        Balloonfish balloonfish = new Balloonfish();
        Cat cat = new Cat();
        Catfish catfish = new Catfish();
        Cuckoo cuckoo = new Cuckoo();
        Dog dog = new Dog();
        ElectricEels electricEels = new ElectricEels();
        Lion lion = new Lion();
        Owl owl = new Owl();
        Parrot parrot = new Parrot();
        int i;
        System.out.print("Choose a number for more information:\n");
        for (i = 0; i < 8; i++) {
            System.out.println((i + 1) + names.get(i));
        }
        do {
            i = new Scanner(System.in).nextInt();
            if  (i > 0 && i <= 3) {
                System.out.print(names.get(i - 1));
                allAnimals.actions();
                switch (i) {
                    case 1:
                        cat.Cat();
                        break;
                    case 2:
                        dog.Dog();
                        break;
                    case 3:
                        lion.Lion();
                        break;
                }
            } else if (i > 3 && i <= 6) {
                System.out.print(names.get(i - 1));
                allBirds.actions();
                switch (i) {
                    case 4:
                        parrot.Parrot();
                        break;
                    case 5:
                        owl.Owl();
                        break;
                    case 6:
                        cuckoo.Cuckoo();
                        break;
                }
            } else if (i > 6 && i <= 9) {
                System.out.print(names.get(i - 1));
                allFish.actions();
                switch (i) {
                    case 7:
                        catfish.Catfish();
                        break;
                    case 8:
                        balloonfish.Balloonfish();
                        break;
                    case 9:
                        electricEels.ElectricEels();
                        break;
                }
            } else if (i == 0)
                break;
            else {
                System.out.println("Try another number");
            }
        } while (true);
    }
}