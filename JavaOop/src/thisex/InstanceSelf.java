package thisex;

class BirthDay{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public void printThis(){
        System.out.println(this); //인스턴스 출력
    }
}

public class InstanceSelf {
    public static void main(String[] args){
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }
}
