package Exercise03;

public class Exercise03_4 {
    public static void main(String[] args) {
        Employee03_4.setCompanyName("Java商事株式会社");
        System.out.println("会社名：" + Employee03_4.companyName);
        Employee03_4 emp1 = new Employee03_4("田中太郎",30);
        System.out.println(emp1.getInfo());
    }
}
