/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.menu.inter.MenuLoginServiceInter;

/**
 *
 * @author Perfect
 */
public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void process() {
        System.out.println("Login");
    }
    
}