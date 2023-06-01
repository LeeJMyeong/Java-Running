package Starcrft;
import java.util.Scanner;

public class Building {
    public int check = 0;
    Game gm = new Game();

    public int isBulid(int x) {
        if (x == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int build() {
        check++;
        return 1;
    }

    public void destroy() {
        check--;
    }

    public class SupplyDepot extends Building {
        public int supply_check = 0;
        public int supply = 0;

        @Override
        public int build() {
            if (gm.people_limit >= 200) // 인구수 200 제한
                System.out.println("서플라이 건설 불가");
            return 0;
        }else

        {
            supply_check++;
            gm.people_limit += 10;
            return 1;
        }

        public void destroy() {
            if (supply_check =<0){
                System.out.println("파괴할거 없음");
            }else{
                supply_check--:
                gm.people_limit -= 10;
                System.out.println("서플라이 한개 파괴");
                System.out.println("인구 :" + gm.people + "/" + gm.people_limit);
            }
        }
    }

    class Barrack extends Building {

        public int barrack_check = 0;
        public static int marine = 0;
        public static int firebat = 0;

        @Override
        public int build() {
            if (barrack_check >= 1) {
                System.out.println("더이상 배럭을 건설할 수 없음");
                return 0;
            } else {
                barrack_check++;
                return 1;
            }
        }

        public void destroy() {
            if (barrack_check =< 0){
                System.out.println("파괴할 배럭이 존재하지 않음");
            } else{
                barrack_check--;
                System.out.println("배럭을 한 개 파괴하였습니다");
            }
            public void marine () {
                if (gm.people >= gm.people_limit) {
                    System.out.println("인구수 부족");
                    System.out.println("인구수 : " + gm.people + " / " + gm.people_limit);
                } else {
                    marine++;
                    gm.people++;
                    System.out.println("marine 생산 완료");
                    System.out.println("인구수 : " + gm.people + " / " + gm.people_limit);
                }
            }
            public void firebat () {
                if (gm.people >= gm.people_limit) {
                    System.out.println("인구수 부족");
                    System.out.println("인구수 : " + gm.people + " / " + gm.people_limit);
                } else {
                    firebat++;
                    gm.people++;
                    System.out.println("firebat 생산 완료");
                    System.out.println("인구수 : " + gm.people + " / " + gm.people_limit)
                }
            }
        }
    }
}


