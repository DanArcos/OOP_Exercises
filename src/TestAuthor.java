//This is will create an Author object and print out info on the object
public class TestAuthor {
    public static void main (String[] args){
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }
}
