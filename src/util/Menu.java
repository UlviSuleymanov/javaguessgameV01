package util;

import bean.Config;
import service.menu.*;
import service.menu.inter.MenuService;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_USER(3, "Add user", new MenuAddUserService()),
    START_GAME(4, "Start game", new MenuStartGameService()),
    LOG_OUT(5, "Log out", new MenuLogOutService()),
    EXIT(6, "Exit", new MenuExitService()),
    UNKOWN;
    private String label;
    private int number;
    private MenuService service;

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    Menu() {

    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                }else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}
