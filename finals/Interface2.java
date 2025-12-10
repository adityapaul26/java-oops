import java.util.*;

interface department {
    String deptname = "";
    String depthead = "";

    void printdeptdata();
}

class hostel {
    String hostelname;
    String hostellocation;
    int roomnum;

    hostel(String hostelname, String hostellocation, int roomnum) {
        this.hostelname = hostelname;
        this.hostellocation = hostellocation;
        this.roomnum = roomnum;
    }

    void printhosteldata() {
        System.out.println("the name of the hostel:" + hostelname);
        System.out.println("the location of the hostel:" + hostellocation);
        System.out.println("the room number of the hostel:" + roomnum);
    }
}

class Student extends hostel implements department {
    String name;
    String regno;
    String deptname;
    String depthead;
    String electivesub;
    int avgnum;

    Student(String name, String regno, String deptname, String depthead, String electivesub, int avgnum,
            String hostelname, String hostellocation, int roomnum) {
        super(hostelname, hostellocation, roomnum);
        this.name = name;
        this.regno = regno;
        this.deptname = deptname;
        this.depthead = depthead;
        this.electivesub = electivesub;
        this.avgnum = avgnum;
    }

    @Override
    public void printdeptdata() {
        System.out.println("the name of the department:" + deptname);
        System.out.println("the head of the department:" + depthead);
    }

    void printdata() {
        System.out.println("the name of the student:" + name);
        System.out.println("the registration of the student:" + regno);
        System.out.println("the elective subject is:" + electivesub);
        System.out.println("the name of the student:" + avgnum);
        printdeptdata();
        printhosteldata();
    }
}

class Interface2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int ch;

        do {
            System.out.println("1.admit a student");
            System.out.println("2.migrate a student");
            System.out.println("3.display details");
            System.out.println("4.exit");
            ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.println("enter the name of the student:");
                String sn = sc.nextLine();
                System.out.println("enter the registration number of the student:");
                String regs = sc.nextLine();
                System.out.println("enter the  department name of the student:");
                String deptn = sc.nextLine();
                System.out.println("enter the department head of the student:");
                String depthd = sc.nextLine();
                System.out.println("enter the elective subjects of the student:");
                String es = sc.nextLine();
                System.out.println("enter the average number of the student:");
                int avgn = sc.nextInt();
                sc.nextLine();
                System.out.println("enter the hostel name of the student:");
                String hosn = sc.nextLine();
                System.out.println("enter the   hostel location of the student:");
                String hosloc = sc.nextLine();
                System.out.println("enter the room number of the student:");
                int roomn = sc.nextInt();
                sc.nextLine();
                Student s = new Student(sn, regs, deptn, depthd, es, avgn, hosn, hosloc, roomn);
                list.add(s);
            }
            if (ch == 2) {
                System.out.println("enter the registration number of the student to be migrated:");
                String regs = sc.nextLine();
                for (Student s : list) {
                    if (s.regno.equals(regs)) {
                        System.out.println("enter the new hostel name of the student:");
                        s.hostelname = sc.nextLine();
                        System.out.println("enter the  new hostel location of the student:");
                        s.hostellocation = sc.nextLine();
                        System.out.println("enter the new room number of the student:");
                        s.roomnum = sc.nextInt();
                        sc.nextLine();
                        break;
                    }
                }
            }
            if (ch == 3) {
                System.out.println("enter the registration number of the student:");
                String regs = sc.nextLine();
                for (Student s : list) {
                    if (s.regno.equals(regs)) {
                        s.printdata();
                        break;
                    }
                }
            }
        } while (ch != 4);
    }
}
