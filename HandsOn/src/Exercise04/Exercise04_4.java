package Exercise04;

public class Exercise04_4 {
    public static void main(String[] args) {
        Employee04_4[] emp = new Employee04_4[3];
        emp[0] = new Sales04_4("100200", "豊洲太郎", 5);
        emp[1] = new SE04_4("300100", "田中次郎", "DB");
        emp[2] = new Staff04_4("500600", "船場三郎", "経理");

        for (Employee04_4 employee : emp){
            System.out.println("---------------------");
            employee.printInfo();
        }
    }
}
