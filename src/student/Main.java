package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student aluno = new Student();
        System.out.print("Nome: ");
        aluno.name = scan.next();

        System.out.print("Nota 1° Bimestre: ");
        aluno.notaPrimeiroBimestre = scan.nextDouble();

        System.out.print("Nota 2° Bimestre: ");
        aluno.notaSegundoBimestre = scan.nextDouble();

        System.out.print("Nota 3° Bimestre: ");
        aluno.notaTerceiroBimestre = scan.nextDouble();

        System.out.println(aluno.calcAverage());
        scan.close();
    }
}
