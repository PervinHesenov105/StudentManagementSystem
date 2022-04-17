/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

/**
 *
 * @author Perfect
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        Scanner sc= new Scanner(System.in);
        System.out.print("username:");
        String username = sc.next();
        sc= new Scanner(System.in);
        System.out.print("password:");
        String password=sc.next();
        
        if(!(username.equals("perfect")&&password.equals("123"))){
            throw new IllegalArgumentException("Username or password is invalid");
        }
        
        Config.setLoggedIn(true);
    }

}
