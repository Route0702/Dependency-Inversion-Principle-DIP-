package SolidPrinciple_DIP;

public class BorrowResource {
    public void borrowResource(Student student, ResourcesInfo resource) {
        System.out.println("Student name: " + student.getName() + "\nBorrowing a " + resource.getResourceType() + ": " + resource.borrowItem() + "\n");
    }
}
