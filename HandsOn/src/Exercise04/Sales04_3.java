package Exercise04;

// Sales04_3.java

// 営業を表現するクラス
public class Sales04_3 extends Employee04_3 {
    // Sales固有の属性の定義
    private int customerCount;        // 顧客数

    //コンストラクタ
    Sales04_3(String id,String ename,int count){
        super(id, ename);
        customerCount = count;
    }

    // 顧客数を取得する
    public int getCustomerCount() {
        return customerCount;
    }

    // 顧客数を設定する
    public void setCustomerCount(int count) {
        customerCount = count;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("customerCount:"+ customerCount);
    }
}
