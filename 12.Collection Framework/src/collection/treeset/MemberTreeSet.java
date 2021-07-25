package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;
    
    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
        //comparator 사용 시 - TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달해야 함. 
        //TreeSet<Member2> treeSet = new TreeSet<Member>(new Member2());
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember() {
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
