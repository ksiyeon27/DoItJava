package thisex;

//Person 클래스는 다른 파일에.

public class ReturnMyAddress {
    public static void main(String[] args){
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf(); 
        System.out.println(p);
        System.out.println(noName); //결과는 둘이 같게 주소값이 나오지.
    }
}
