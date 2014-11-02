
public class Books {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Books(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Books(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public int getQtyInStock(){
        return qtyInStock;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAuthor (Author author){
        this.author = author;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQtyInStock (int qtyInStock){
        this.qtyInStock = qtyInStock;
    }

    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
}
