package student;

public class Student {
    public String name;
    public double notaPrimeiroBimestre;
    public double notaSegundoBimestre;
    public double notaTerceiroBimestre;

    public double calcAverage() {
        double average = 0;
        return average = ((notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre) / 3);
    }

    public void PassedOrFailed() {
        if (calcAverage() > 100) {

        } else {

        }
    }
}
