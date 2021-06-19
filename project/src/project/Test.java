package project;

public class Test {
	   //instance variable
    String firstName;
    String lastName;
     int marks;

     //constructors
    Test(String first, String last, int score) {
        firstName = first;
        lastName = last;
        marks = score;
    }

    public String getFullName() {
        return firstName +" "+lastName;
        
    }
}
