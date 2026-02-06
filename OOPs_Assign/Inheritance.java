package OOPs_Assign;
class User {
	
    void login() {
        System.out.println("User logged in");
    }

    void logout() {
        System.out.println("User logged out");
    }

    void updateProfile() {
        System.out.println("Profile updated");
    }
}
class Student extends User {
	
    void registerCourse(int count) {
        System.out.println(count + " courses successfully registered");
    }

    void viewGrades() {
        System.out.println("Grades displayed");
    }

    void payFees() {
        System.out.println("Fees paid successfully");
    }
}

class TeachingStaff extends User {

    void uploadMarks() {
        System.out.println("Marks uploaded successfully");
    }

    void createAssignments() {
        System.out.println("Assignment created");
    }

    void takeAttendance() {
        System.out.println("Attendance taken");
    }
}

class NonTeachingStaff extends User {

    void managePayroll() {
        System.out.println("Payroll managed");
    }

    void approveLeave() {
        System.out.println("Leave approved successfully");
    }

    void maintainRecords() {
        System.out.println("Records maintained");
    }
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
        student.login();
        student.registerCourse(3);

        TeachingStaff teacher = new TeachingStaff();
        teacher.login();
        teacher.uploadMarks();

        NonTeachingStaff staff = new NonTeachingStaff();
        staff.login();
        staff.approveLeave();
	}

}
