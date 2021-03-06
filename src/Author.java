
public class Author {
    private String name;
    private String email;
    private char gender;

    //Add constructor
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Add appropriate getters and setters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    //Overriding our own toString() allows us to control what happens when the object is directly referenced.
    public String toString(){
        return name + " (" + gender + ") "+ email;
    }
}
