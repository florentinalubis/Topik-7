public class Main {
    public static void main(String[] args) {

        StudentRegistration sr = new StudentRegistration();

        // 1. Sukses
        try {
            sr.register("Florentina", 20);
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Nama kosong
        try {
            sr.register("", 20);
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. Umur tidak valid
        try {
            sr.register("Florentina", 15);
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}