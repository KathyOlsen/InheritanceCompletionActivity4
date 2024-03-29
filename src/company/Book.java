package company;

public final class Book extends Product {

    private String author = "";
    private int pages = 0;

    public Book(){}

    public Book(String author, int pages, String code, String description, double price) {
        this.author = author;
        this.pages = pages;
        setCode(code);
        setDescription(description);
        setPrice(price);
    }

    public String toStringBook(){
        String s = super.toString() +
                "Author:\t\t\t\t\t" + author + "\n" +
                "Number of Pages:\t\t" + pages + "\n";
        return s;
    }

    @Override
    public boolean equals(Object o){
        Book b = new Book();
        if(this.getCode().equals(b.getCode())){
            return true;
        }else{
            return false;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}