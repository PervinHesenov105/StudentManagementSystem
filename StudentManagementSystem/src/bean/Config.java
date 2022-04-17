package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class Config implements Serializable {
    private static boolean loggedIn;
    ArrayList<Teacher> teachers = new ArrayList();
    ArrayList<Student> students = new ArrayList();
    public static Config config = null;

    public Teacher[] getTeachers() {
        Teacher[] t = new Teacher[students.size()];
        for (int i = 0; i < t.length; i++) {
            t[i] = teachers.get(i);
        }
        return t;
    }

    public void setTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public Student[] getStudents() {
        Student[] s = new Student[students.size()];
        for (int i = 0; i < s.length; i++) {
            s[i] = students.get(i);
        }
        return s;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    
}
