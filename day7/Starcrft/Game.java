package Starcrft;

import java.util.Scanner;

;

public class Game {
    static int people = 0;
    static int people_limit = 10;


    //static List<Marine> marines = new ArrayList<Marine>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        int build;
        SupplyDepot s = mew SupplyDepto();
        Barrack b = new Barrack();
        Marine marine = new Marine();
        Firebat firebat = new Firebat();

        while (true) {

            System.out.println("동작하고 싶은 기능의 번호를 입력");
            System.out.print("1.건물건설 2.유닛조회 3.유닛생성 4.건물파괴");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("건설할 건물의 번호 입력");
                    System.out.print("1.배럭 2.서플라이 ( 그 외 : 처음으로) : ");
                    build = sc.nextInt();
                    if (build == 1) {
                        if (b.isBulid(b.build()) == 1) {
                            System.out.println("배럭 건설 완료");
                        }else {
                            System.out.println("배럭 건설 실패");
                        }
                    }else if (build == 2) {
                        if (s.isBulid(s.build()) == 1) {
                            System.out.println("서플라이 건설 완료");
                            System.out.println("인구수 : " +people+ " / " +people_limit);
                        }else {
                            System.out.println("서플라이 건설 실패");
                        }
                    }

            }else{
                continue;
            }
            case 2:
                System.out.println("유닛 조회");
                marine.prinUnitPopulation();
                firebat.prinUnitPopulation();
                break;
            case 3:
                System.out.println("생산 가능한 유닛");
                if (b.barrack_check > 1) {
                    System.out.printf("Marine Firebat");
                }
                System.out.println("\n생산할 유닛 골라");
                System.out.println("1.Marine 2.Firebat (그 외 : 메뉴 처음으)");
                int unit_buy;
                unit_buy = sc.nextInt();
                if (unit_buy == 1) {
                    if (b.barrack_check >= 1){
                    marine.prinUnitInfo();
                    b.marine();
                } else {
                    System.out.println("배럭이 없어 마린 생성 불가");
                }else if (unit_buy == 2) {
                if (b.barrack_chek > 1) {
                    firebat.prinUnitInfo();
                    b.firebat();
                } else {
                    System.out.println("배럭이 없어 파벳 생성 불가");
                }
            } else {
                        continue;
                    }
                System.out.println("생성가능한 유닛 없음");
            }
                break;
            case 4:
                System.out.println("파괴할 건물 선택");
                System.out.println("1.Barrack 2.Supply (그외 : 처음으로)");
                int building_del;
                building_del = sc.nextInt();
                if (building_del == 1) {
                    b.destroy();
                } else if (building_del == 2){
                    s.destroy();
                }
                else {
                    continue;
                }
                break;
                default;
            System.out.println("잘못 입력");
        }
    }
}






//        for (int i=0;i<5;i++){
//            Marine marine = new Marine();
//            marine.prinUnitInfo();
//            marine.prinUnitPopulation();
//            marines.add(marine);
//        }
//        for (int i=0; i<3; i++){
//            marines.get(i).Sucsse();
//        }
//        System.out.println("생산가능한 유닛");{
//
//        }
//        Marine marine = new Marine();
//        marine.prinUnitInfo();
//        marine.prinUnitPopulation();
//        marines.add(marine);
//        marines.get(0).prinUnitPopulation();
////        marines.get(0).Sucsse();
//        marine.prinUnitPopulation();
//        marines.get(0).prinUnitPopulation();
////        while (true) {
////            System.out.println("생성하고 싶은 기능의 번호를 입력");
////            System.out.print("1.Marine,2. 취소");
////        }
//
//    }
//}




