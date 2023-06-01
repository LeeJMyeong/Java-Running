package Starcrft;
import java.util.Scanner;
public class Unit {
    Game gm = new Game();
    Barrack b = new Barrack();

    int people = 0;
    static int unit = 0;
    static int unit_point = 1;
    int hp, attack, defend = 0;

    public void prinUnitInfo() {
        System.out.println("체력 " + hp + ",공격력 : " + attack + ", 방어력 : " + defend + ", 인구수 " + unit_point);
    }

    public void prinUnitPopulation() {
        System.out.println("유닛 수 : " + unit + ", 사용중인 인구 수 : " + (unit * unit_point));
    }
}

class Marine extends Unit {
        int marine_hp, marine_attack, marine_defend, marine_point;

        Marine() {

            marine_hp = 50;
            marine_attack = 6;
            marine_defend = 0;
            marine_point = 1;
        }

        @Override
        public void prinUnitInfo() {
            super.prinUnitInfo("체력 " + marine_hp + ",공격력 : " + marine_attack + ", 방어력 : " + marine_defend + ", 인구수 " + marine_point);
        }

        public void prinUnitPopulation() {
            super.prinUnitPopulation("마린 수 :  + " + b.marine + ", 사용중인 인구 수 : " + (b.marine * marine_point));
        }
}

class Firebat extends Unit {
    int firebat_hp, firebat_attack, firebat_defend, firebat_point;


    public Firebat() {
        firebat_hp = 50;
        firebat_attack = 16;
        firebat_defend = 1;
        firebat_point = 1;
    }

    public void prinUnitInfo() {
        System.out.println("파벳체력 " + firebat_hp + ",공격력 : " + firebat_attack + ", 방어력 : " + firebat_defend + ", 인구수 " + firebat_point);
    }
    public void prinUnitPopulation() {
        System.out.println("파벳 수 :  + " + b.firebat + ", 사용중인 인구 수 : " + (b.firebat * firebat_point));
    }
}
//
//    @Override
//    public void prinUnitInfo() {
//        super.prinUnitInfo();
//    }
//
//    @Override
//    public void prinUnitPopulation() {
//        super.prinUnitPopulation();
//    }
//    public void Sucsse(){
//        Unit.unit++;
//        Unit.unit_point++;
//    }
//}
