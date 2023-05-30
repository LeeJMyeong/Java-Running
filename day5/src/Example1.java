
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//		객체 : person {name, age}
//		dict 사전처럼 만들어 보자
        Map<String, String> map= new HashMap<String, String>();
//		사전 1대1 매치해준거임
        System.out.println(map.put("banana", "바나나"));
        System.out.println(map.get("banana"));
        System.out.println(map.put("banana", "노란바나나"));
        System.out.println(map.get("banana"));
        map.put("kim", "20 서울시 취업준비생");
        //		키 알수있냐 ok
        for(String key:map.keySet())System.out.println(key);

        String person = map.get("kim");
//		String ss = ""; // isemty 존재하지않는것 0
        String[] sp = person.split(" ");
        for(String str: sp ) System.out.println(str);
//

//		map.put("banana", "바나나");
//		map.get("banana");
//		map.put("banana", "노란바나나");
        // 이렇게 하면 위에 바나나는 무시하고 아래 노란바나나가 된다
    }

}
