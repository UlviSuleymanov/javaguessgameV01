package service.menu;

import bean.Config;
import bean.User;
import service.menu.inter.MenuStartGameServiceInter;

import java.util.Random;
import java.util.Scanner;

public class MenuStartGameService implements MenuStartGameServiceInter {
    @Override
    public void process() {
        Random random = new Random();
        int randomNumber = random.nextInt(Config.getInstance().getUsers().length);
        System.out.println(randomNumber);
        User[] users=Config.getInstance().getUsers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Who won?");
        String answer = sc.nextLine();
        if(users[randomNumber].getUserName().equalsIgnoreCase(answer)||users[randomNumber].getSurname().equalsIgnoreCase(answer)){
            System.out.println("You won");
        }else {
            System.out.println("You lost. better luck next time");
        }
    }
}
