package thisex;


class Person{
    String name;
    int age;

    Person(){
        this("이름 없음", 1);
    } //this를 사용해 생성자 호출.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person returnItSelf(){
        return this; 
    } //반환형은 클래스형
}
public class CallAnotherConst {
    public static void main(String[] args){
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);
    }

}
