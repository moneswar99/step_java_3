package src.main.java.session6.assigment_6;

class Placement {
    String studentName;
    String company;
    double packageLpa;

    Placement(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class PlacementRecord {
    public static void main(String[] args) {

        Placement p1 = new Placement("Ravi", "TCS", 4.5);
        Placement p2 = new Placement("Anitha", "Zoho", 6.2);
        Placement p3 = new Placement("Karthik", "Infosys", 4.0);

        Placement[] records = { p1, p2, p3 };

        for (Placement record : records) {
            record.printRecord();
        }
    }
}