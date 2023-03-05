import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        //School 1
        DSchoolList dl = new DSchoolList();
        School sch1 = new School();
        Address address1 = new Address("Kidurong", "Sarawak", "97000", "Bintulu");
        Marks marks1 = new Marks(3);

        sch1.setName("SMK Kidurong Bintulu");
        sch1.setAddress(address1);
        sch1.setPrincipal("Encik Rosli Saleh");

        for(int i=0; i<3; i++){
            System.out.print("Mark of participant No." + (i+1) +": ");
            int mark = sc.nextInt();
            try {
                marks1.setMark(mark, i);
            }
            catch (Exception ex) {
                System.out.print("Marks must be positive");
                ex.printStackTrace();
            }
        }
        sch1.setMarks(marks1);
        dl.addSchool(sch1);
        System.out.println();

        //School 2
        School sch2 = new School();
        Address address2 = new Address("Bandar", "Sarawak", "97000", "Bintulu");
        Marks marks2 = new Marks(3);

        sch2.setName("SMK Bandar Bintulu");
        sch2.setAddress(address2);
        sch2.setPrincipal("Puan Rubiah binti Haji Taip");

        for(int i=0; i<3; i++){
            System.out.print("Mark of participant No." + (i+1) +": ");
            int mark = sc.nextInt();
            try {
                marks2.setMark(mark, i);
            }
            catch (Exception ex) {
                System.out.print("Marks must be positive");
                ex.printStackTrace();
            }
        }
        sch2.setMarks(marks2);
        dl.addSchool(sch2);
        System.out.println();

        dl.display();
    }
}
