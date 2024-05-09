package SolidPrinciple_DIP;

public class Journal implements ResourcesInfo{
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Journal";
    }

    @Override
    public String borrowItem() {
        return getTitle();
    }
}
