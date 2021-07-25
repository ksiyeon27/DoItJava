package collection.treeset;
import collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args){
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        //comparator 사용 시
        //TreeSet<Member> treeSet = new TreeSet<Member>(new Member());

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");


        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
