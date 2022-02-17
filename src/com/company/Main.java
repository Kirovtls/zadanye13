package com.company;

public class Main {

    public static void main(String[] args) {
        Fysh fysh = new Fysh();
        fysh.setName("bakyt");
        fysh.setBreed("karp");
        fysh.setAge((byte) 5);
        fysh.setVes(5.35);
        System.out.println("Riba info: " + fysh.getName() + " " + fysh.getVes() + " " + fysh.getAge() + " " + fysh.getBreed() + "");

        System.out.println();


        Parrot par = new Parrot();
        par.setName("kewa");
        par.setBreed(" korolewskyi");
        par.setAge((byte) 10);
        par.setVes(3.43);
        System.out.println("Ptica info: " + par.getName() + " " + par.getAge() + " " + par.getBreed() + " " + par.getVes() + "");

        System.out.println();

        Cet ce = new Cet();
        ce.setName(" musya ");
        ce.setBreed(" myaka ");
        ce.setAge((byte) 13);
        ce.setVes(4.22);
        System.out.println("Koshak info: " + ce.getName() + " " + ce.getAge() + " " + ce.getBreed() + " " + ce.getVes() + "");

        System.out.println();


        Dog dog = new Dog();
        dog.setName(" boron ");
        dog.setBreed(" av4arka");
        dog.setAge((byte) 23);
        dog.setVes(30);
        System.out.println("Pes info: " + dog.getName() + " " + dog.getAge() + " " + dog.getBreed() + " " + dog.getVes() + "");

    }
}

