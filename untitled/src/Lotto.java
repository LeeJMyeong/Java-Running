public class Lotto {
    public static void main(String[] args) {
//        0 * 45 + 1 <= Math.random() < 1 * 45 + 1
//        1<= number < 46
//        6개 중복 x
//        Math.random() * 45 + 1 double -> int
//        set 의 사이즈가 6이 될때까지
//        number 를 만들자
//        그 다음 출력하자
        System.out.println(Math.random()*45+1);
    }
}
