package Exercise04;

public class Exercise04_2 {
    public static void main(String[] args) {
        Sales04_2 sales1 = new Sales04_2();

        sales1.setEmpId("112233");
        sales1.setEmpName("豊洲太郎");
        sales1.setCustomerCount(5);
        sales1.printInfo();
        System.out.println("customerCount:"+sales1.getCustomerCount());
    }
}
