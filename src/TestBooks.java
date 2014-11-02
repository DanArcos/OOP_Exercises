//This file will create a Books object, which also uses a created Author object
//Book methods will be displayed the console.
public class TestBooks {
    public static void main(String[] args){
        Author anAuthor = new Author("DANIEL ARCOS", "NAME@EMAIL>COM", 'm');
        Books book = new Books("Java for dummy", anAuthor, 19.95, 1000);
        Books anotherBook = new Books("more Java for dummy", new Author("ARCOS", "NAME123@EMAIL>COM", 'f'), 29.95, 888);
        System.out.println(book.getAuthor().getName());
        System.out.println(book.getAuthor().getEmail());
        System.out.println();
        System.out.println(book.getAuthorEmail());
        System.out.println(book.getAuthorName());
        System.out.println(book.getAuthorGender());
    }
}
