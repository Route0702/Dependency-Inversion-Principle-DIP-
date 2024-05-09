package SolidPrinciple_DIP;

public class TestProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Manalili, James I.");
        Book book = new Book("Software Engineer 2");
        Student student2 = new Student("Troy Victor Pardillo");
        Journal journal = new Journal("Solid Principle");
        BorrowResource borrower = new BorrowResource();

        borrower.borrowResource(student1, book);
        borrower.borrowResource(student2, journal);
    }
}
