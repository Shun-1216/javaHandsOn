package Exercise03;

public class Exercise03_2 {
    public static void main(String[] args){
        /*インスタンス生成 */
        Employee03_1 emp1 = new Employee03_1();
        
        /*処理 */
        System.out.println(emp1.getInfo());
        emp1.setName("豊洲太郎");
        emp1.addAge();
        System.out.println(emp1.getInfo());
    }
}
