
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentServiceInter;
import service.menu.inter.MenuAddTeacherServiceInter;


public class MenuAddStudentService implements MenuAddStudentServiceInter{

    @Override
    public void process() {
     Scanner sc= new Scanner(System.in);
        System.out.print("name:");
        String name = sc.next();
        sc= new Scanner(System.in);
        System.out.print("surname:");
        String surname=sc.next();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        
        Config.instance().setStudents(s);
        
    }
    
}
