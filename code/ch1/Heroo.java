/**
 * @ClassName Heroo
 * @Description TODO
 * @Author wangkai
 * @Date 2020/10/8
 **/
public class Heroo {

    String name;

    float hp;

    float armor;

    float moveSpeed;
    int killed;
    int kill;
    int protect;
    int money;
    int attackSpeed;
    String wordAfterkill;
    String wordAfterkilled;

    public static void main (String[] args){
        Heroo xiaoji  = new Heroo();
        xiaoji .name = "小吉";
        xiaoji. hp = 20.5f;
        xiaoji.armor = 30.5f;
        xiaoji.moveSpeed = 40.5f;
        xiaoji.killed = 20;
        xiaoji.kill = 60;
        xiaoji.protect = 10;
        xiaoji.money =100000;
        xiaoji.attackSpeed=20000;
        xiaoji.wordAfterkill= "我一定会回来的";
        xiaoji.wordAfterkilled="勇者不惧";

    }
}
