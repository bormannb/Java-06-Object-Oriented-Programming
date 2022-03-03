public class Classroom{
    public static void main(String[] args){

    // 7.)  Add references to several instances of the Wilder class
    // inside the main() method of Classroom.  
    Wilder Streber = new Wilder ("Streber", true);
    // Streber.whoAmI(); // My name is Streber and I'm present

    Wilder Schlafmuetze = new Wilder ("Schlafmuetze", false);
    // Schlafmuetze.whoAmI(); // My name is Schlafmuetze and I'm not present
        
    System.out.println(Streber.whoAmI());
    System.out.println(Schlafmuetze.whoAmI());

    }
}