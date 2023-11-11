public class Book {
    String title;
    String author;
    int year;
    int pages;
    int page = 0;
    public void openBook(){
        page = 1;
        System.out.println("Book opened, page:"+page);
    }
    public void closeBook(){
        page = 0;
        System.out.println("Book closed, page:"+page);
    }
    public void nextPage(){
        page+=1;
        System.out.println("Page:"+page);
    }
    public void prevPage(){
        page-=1;
        System.out.println("Page:"+page);
    }

    public void details(){
        System.out.println('"'+title+'"'+" by "+author+"\nwritten in "+year+" with "+pages+" of pages");
    }
}
