import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//      set Queue Stack final
//        String str = "";
//        final float pie = 3.14f;
//        final Integer i = 0;
//        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
//        순서 x , 중복 x
        set.add(1);
        set.add(2);
        System.out.println(set.size());

        for (Integer i : set) {
            System.out.printf("%4.2f 입니다. %d %s\n", (float) i * 8000, i, "uuuu");
        }
    }
}
// 파이널은 최종으로 수정이 안됨 추가로 상속을 한다거나 하는 추가 작업도 안됨
//final class Person{
//    private Integer num;
//    private String name;
//
//    public Person(Integer num, String name) {
//        this.num = num;
//        this.name = name;
//
//    }

