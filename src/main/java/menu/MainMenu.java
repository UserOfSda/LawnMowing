package menu;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SubMenu subMenu = new SubMenu();
        subMenu.menuChoice(input);
    }
}
