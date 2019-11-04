package cloudStudy.MudGame;

import java.util.Scanner;
public class PlayStation {
    Character hero;
    int menuNum = 0;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        PlayStation ps = new PlayStation();
        ps.play();
    }
    private void play() {
        while (true) {
            switch (menuNum) {
                case 0:
                    greetingMenu();
                    break;
                case 10:
                    creationMenu();
                    break;
                case 20:
                    choiceMenu();
                    break;
                case 1:
                    hunting();
                    break;
                case 2:
                    rest();
                    break;
                case 3:
                    hero.status();
                    menuNum = 20;
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }
    private void rest() {
        System.out.println("체력을 회복합니다!!");
        hero.heal();
        menuNum = 20;
    }
    private void hunting() {
        Character monster = new Character("오크", 1, 30, 30, 100);
        monster.status();
        System.out.println("[1]: 전투");
        System.out.println("[2]: 도망");
        System.out.print("> ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                hero.hunt(monster);
                break;
            case 2:
                System.out.println("도망칩니다..");
                break;
            default:
                break;
        }
        menuNum = 20;
    }
    private void choiceMenu() {
        System.out.println("[1]: 사냥");
        System.out.println("[2]: 휴식");
        System.out.println("[3]: 상태");
        System.out.println("[4]: 종료");
        System.out.print("> ");
        int choice = input.nextInt();
        menuNum = choice;
    }
    private void creationMenu() {
        System.out.print("캐릭터 이름을 정해주세요: ");
        String name = input.next();
        System.out.printf("[%s] 캐릭터가 생성되었습니다!!\n", name);
        hero = new Character(name, 1, 50, 50);
        hero.status();
        menuNum = 20;
    }
    private void greetingMenu() {
        System.out.println("============================");
        System.out.println("판타지 게임에 오신 것을 환영합니다..");
        System.out.println("============================");
        menuNum = 10;
    }
}