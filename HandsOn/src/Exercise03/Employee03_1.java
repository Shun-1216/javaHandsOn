package Exercise03;

public class Employee03_1 {
    String name;
    int age;

    void setName(String n){
        name = n;
    }
    void addAge(){
        age++;
    }
    String getInfo(){
        return "氏名：" + name + "、年齢：" + age;
    }
}
