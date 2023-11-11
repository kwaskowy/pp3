public class TestBooks {
    public static void main(String[] args) {
        
    
    Book b = new Book();
    Book b1 = new Book();

    b.title="The Lord of the Rings";
    b.author="John Ronald Reuel Tolkien";
    b.year=1954;
    b.pages= 1000;
    b1.title="The Hobbit or There and Back Again";
    b1.author="John Ronald Reuel Tolkien";
    b1.year=1937;
    b1.pages=342;

    b.details();
    b.openBook();
    b.nextPage();
    b.nextPage();
    b.nextPage();
    b.prevPage();
    b.closeBook();
    b1.details();
    b1.openBook();
    b1.nextPage();
    b1.nextPage();
    b1.nextPage();
    b1.prevPage();
    b1.closeBook();
    }
}
