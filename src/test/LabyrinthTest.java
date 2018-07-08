package test;

import bin.Labyrinth;

public class LabyrinthTest {

    public static void main(String args[]) {


        char [][] einLab = {
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', 'X', ' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X'},
                {'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', ' ', 'X'},
                {'X', 'X', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', 'X', ' ', ' ', ' ', 'X', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

        char [][] mehrereLab = {
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', 'X', ' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X'},
                {'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', ' ', 'X'},
                {'X', 'X', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', 'X', ' ', ' ', ' ', 'X', ' ', ' '},
                {'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X', ' ', 'X'}};

        char [][] keinLab = {
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', 'X', ' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X'},
                {'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', ' ', 'X'},
                {'X', 'X', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', 'X', ' ', ' ', ' ', 'X', ' ', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};


        System.out.println("Chris' Labyrinth-Algorythmus");
        System.out.println("Legende der mgl. Ausgabewerte:");
        System.out.println("'true': Es gibt einen bzw. mehrere Ausgänge.");
        System.out.println("Chris' Labyrinth-Algorythmus");
        System.out.println();

        System.out.println("Labyrinth 1 (vorher):");
        Labyrinth.printLabyrinth(einLab);
        Labyrinth lab1 = new Labyrinth(einLab);
        System.out.println();
        System.out.println(lab1.existsWeg(4,4));
        System.out.println();
        System.out.println("Labyrinth 1 (nachher):");
        Labyrinth.printLabyrinth(einLab);
        System.out.println();


        System.out.println("Labyrinth 2 (vorher):");
        Labyrinth.printLabyrinth(mehrereLab);
        Labyrinth lab2 = new Labyrinth(mehrereLab);
        System.out.println();
        System.out.println(lab2.existsWeg(4,4));
        System.out.println();
        System.out.println("Labyrinth 2 (nachher):");
        Labyrinth.printLabyrinth(mehrereLab);
        System.out.println();


        System.out.println("Labyrinth 3 (vorher):");
        Labyrinth.printLabyrinth(keinLab);
        Labyrinth lab3 = new Labyrinth(keinLab);
        System.out.println();
        System.out.println(lab3.existsWeg(4,4));
        System.out.println();
        System.out.println("Labyrinth 3 (nachher):");
        Labyrinth.printLabyrinth(keinLab);
        System.out.println();





    }

}
