import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test3 {


    public static void main(String[] args) {
//        Set(순서가없고 중복이안된다, 순서가 보정이안된다 1.2.3 에 넣엇다해도 1.2.3. 이 된다는 보장이안된단 뜻이다)
//        Queue
//        Stack(후입선출 나중에 들어온것이 먼저 나간다)
//        final(값이 담기거나 주소값이 담길경우 할당된 값이 바뀔수가없다.)
//
//        final float pie = 3.14f;
//        final Integer i = 0;
//        List<Integer> list = new ArrayList<>();
        Set<Member> set = new HashSet<>();
//        순서 x , 중복 x
//        에러 종류  error warning
        set.add(new Member("1", "1"));
        set.add(new Member("1", "2"));
        set.add(new Member("1", "3"));
        for (Member p : set) {
            System.out.println(p);
        }
//        set.add(1);
//        set.add(2);
        System.out.println(set.size());
//
//        for (Integer i : set) {
//            System.out.printf("%4.2f 입니다. %d %s\n",
//                    (float) i * 8000, i, "ㅛㅛㅛㅛ");
//        }
    }
}

final class Person {
    private final Integer num;
    private final String name;

    public Person(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(num, person.num) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}

class Member extends Object {
    private String id;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Member(String id, String password) {

        this.id = id;
        this.password = password;

    }

}
