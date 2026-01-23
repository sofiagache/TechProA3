class  Minion {
    String name;
    
    void displayName() {
        System.out.println("Minion Name: " + name);
    }
}

public class Sw6 {
    public static void main(String[] args) {
        
        Minion m1 = new Minion();
        m1.name = "Otto";
        
        try {
            m1.displayName();
        } catch (Exception e) {
            System.out.println("Error: Minion object is not created");
        }
    }
}