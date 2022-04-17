/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuShowTeacherServiceInter;

/**
 *
 * @author Perfect
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter{

    @Override
    public void process() {
    Teacher[] allteachers =Config.instance().getTeachers();
        for (int i = 0; i < allteachers.length; i++) {
            System.out.println(allteachers[i]);
        } }
    
}
