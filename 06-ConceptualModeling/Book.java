public class Book {
    private String author;
    private String title;
    private int year;
    private String type;
    private int pages;
    private String language;
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getType() {
        return type;
    }
    public int getPages() {
        return pages;
    }
    public String getLanguage() {
        return language;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = "'"+title+"'";
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    

    public static void main(String[] args) {
        Book b1= new Book();
        b1.setTitle("Hobbit");
        System.out.println(b1.getTitle());
    }
}
