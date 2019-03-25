package cloudStudy.MudGame;

public class Character {
    String name;
    int level;
    int hp;
    int maxHp;
    int gold;


    public Character(String name, int level, int hp, int maxHp,int gold) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
        this.gold=gold;
    }

    public Character(String name, int level, int hp, int maxHp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
    }
    public void attack(Character target) {
        target.hp -= 10;
        System.out.printf("[%s]의 공격!!\n", this.name);
        System.out.printf("\t%s: %d/%d\n", target.name, target.hp, target.maxHp);
    }
    public void status() {
        System.out.printf("[%s] Lv: %d  HP: %d/%d  gold : %d\n", name, level, hp, maxHp, gold);
    }
    public void hunt(Character monster) {
        // 둘다 살아있으면 계쏙 싸움!!
        while (this.hp > 0 && monster.hp > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Math.random() > 0.5)
                this.attack(monster);
            else
                monster.attack(this);
        }
        if (this.hp > 0) {
            System.out.println("승리하였습니다!! 몬스터를 처치하고 몬스터 골드를 획득함 " + monster.getGold());
            this.gold = gold + monster.getGold();
        }else
            System.out.println("패배하였습니다..");
    }
    public void heal() {
        hp = maxHp;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getGold() {
        return gold;
    }
}