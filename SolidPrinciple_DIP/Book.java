package SolidPrinciple_DIP;

public class Book implements ResourcesInfo{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Book";
    }

    @Override
    public String borrowItem() {
        return getTitle();
    }
}
