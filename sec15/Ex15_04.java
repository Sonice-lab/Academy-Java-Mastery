package sec15;

import java.util.HashSet;
import java.util.Set;

//hash 코드는 논리적 주소<>물리적 주소(아이덴티티 해시코드 > 바뀌지 않는 것)

class Member {
    private int memberId;
    private String memberName;

    int getMemberId() {
        return memberId;
    }

    void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    String getMemberName() {
        return memberName;
    }

    void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override // 첫번째 관문(hashcode 비교)
    public int hashCode() {
        return memberId;
    }

    @Override // 두번째 관문(equals 비교) > mem1과 mem2는 같은 객체이다. > 회원 관리시스템을 생성시 활용할 수 있는 코드
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member compare = (Member) obj;

            if (this.memberId == compare.memberId) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

public class Ex15_04 {
    public static void main(String[] args) {
        Member mem1 = new Member();
        Member mem2 = new Member();

        mem1.setMemberId(1);
        mem2.setMemberId(1);

        mem1.setMemberName("김일남");
        mem2.setMemberName("김일남");

        System.out.println(mem1.hashCode());
        System.out.println(mem2.hashCode());

        System.out.println(mem1.equals(mem2));

        Set<Member> list = new HashSet<>();
        list.add(mem1);
        list.add(mem2);

        System.out.println(list.size());

    }
}
