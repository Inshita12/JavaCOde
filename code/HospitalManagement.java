
package code;
import java.util.*;

class user {
    String uid;
    String fname, lname, gender, email;

    void new_user() {
        Scanner input = new Scanner(System.in);
        System.out.print("userid:-");
        uid = input.nextLine();
        System.out.print("fname:-");
        fname = input.nextLine();
        System.out.print("lname:-");
        lname = input.nextLine();
        System.out.print("gender:-");
        gender = input.nextLine();
        System.out.print("email:-");
        email = input.nextLine();
    }

    void find_user() {
        System.out.println(uid + "  \t" + fname + "  \t" + lname + "    \t" + gender + "     \t" + email);
    }
}

class patient extends user {
    String pid;
    Boolean insured;

    void new_patient() {
        Scanner input = new Scanner(System.in);
        new_user();
        System.out.print("patientid:-");
        pid = input.nextLine();
        System.out.print("insured:-");
        insured = input.nextBoolean();
    }

    void patient_info() {
        find_user();
        System.out.println(pid + "\t" + insured);
    }
}

class staff extends user {
    String sid;
    int yoe;
    String desc;
    double salary;

    void new_staff() {
        Scanner input = new Scanner(System.in);
        new_user();
        System.out.print("staffid:-");
        sid = input.nextLine();
        System.out.print("yearsofexperience:-");
        yoe = input.nextInt();
        System.out.print("Description:-");
        desc = input.nextLine();
        System.out.print("Salary:-");
        salary = input.nextDouble();

    }

    void staff_info() {
        find_user();
        System.out.println(sid + "\t" + yoe + "\t" + desc + "\t" + salary);
    }
}

class doctor extends staff {
    String did;
    String specialization;

    void new_doctor() {
        Scanner input = new Scanner(System.in);
        new_staff();
        System.out.print("doctorid:-");
        did = input.nextLine();
        System.out.print("insured:-");
        specialization = input.nextLine();
    }

    void doctor_info() {
        staff_info();
        System.out.println(did + "\t" + specialization);
    }
}

class nurse extends staff {
    String nid;

    void new_nurse() {
        Scanner input = new Scanner(System.in);
        new_staff();
        System.out.print("nurseid:-");
        nid = input.nextLine();
    }

    void nurse_info() {
        staff_info();
        System.out.println(nid);
    }
}

class HospitalManagement {
    public static void main(String args[]) {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        user[] u = new user[10];
        patient[] p = new patient[10];
        staff[] s = new staff[10];
        doctor[] d = new doctor[10];
        nurse[] n = new nurse[10];
        int i;
        for (i = 0; i < 10; i++) {
            u[i] = new user();
            p[i] = new patient();
            s[i] = new staff();
            d[i] = new doctor();
            n[i] = new nurse();
        }
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1;
        while (status == 1) {
            System.out.println("1.User  2. Patients  3.Staff  4.Doctor  5. Nurse");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("USER SECTION");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing User List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                u[count1].new_user();
                                count1++;
                                break;
                            }
                            case 2: {
                                for (j = 0; j < count1; j++) {
                                    u[j].find_user();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("PATIENT SECTION");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patient List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                p[count2].new_patient();
                                count2++;
                                break;
                            }
                            case 2: {
                                for (j = 0; j < count2; j++) {
                                    p[j].patient_info();
                                    ;
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    System.out.println("STAFF SECTION");
                    s3 = 1;
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Staff List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                s[count3].new_staff();
                                count3++;
                                break;
                            }
                            case 2: {
                                for (j = 0; j < count3; j++) {
                                    s[j].staff_info();
                                    ;
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4: {
                    System.out.println("DOCTOR SECTION");
                    s4 = 1;
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctor List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                d[count4].new_doctor();
                                count4++;
                                break;
                            }
                            case 2: {
                                for (j = 0; j < count4; j++) {
                                    d[j].doctor_info();
                                    ;
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5: {
                    System.out.println("NURSE SECTION");
                    s5 = 1;
                    while (s5 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Nurse List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                n[count5].new_nurse();
                                count5++;
                                break;
                            }
                            case 2: {
                                for (j = 0; j < count5; j++) {
                                    n[j].nurse_info();
                                    ;
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }

    }
}