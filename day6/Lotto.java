import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
//        0 * 45 + 1 <= Math.random() < 1 * 45 + 1
//        1<= number < 46
//        6개 중복 x
//        Math.random() * 45 + 1 double -> int
//        set 의 사이즈가 6이 될때까지
//        number 를 만들자
//        그 다음 출력하자
        Set<Integer> set = new HashSet<>();
        while ((set.size() != 6)) {
            set.add((int) (Math.random() * 45) + 1);
        }
        for (int i : set)
            System.out.println(i);

    }
}



