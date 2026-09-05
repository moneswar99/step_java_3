public class StudentRecordParser {
    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        System.out.println("Name: " + fields[0].trim());
        System.out.println("Roll No: " + fields[1].trim());
        System.out.println("Dept: " + fields[2].trim());
    }

    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma, RA2211003010123,CSE");
    }
}