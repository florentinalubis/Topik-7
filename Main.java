public class Main {
    public static void main(String[] args) {

        StudentRegistration reg = new StudentRegistration();

        try {
            // 1. Data valid (sukses)
            reg.register("Florentina", 19);

            // 2. Nama kosong (error)
            reg.register("", 20);

            // 3. Umur tidak valid (error)
            reg.register("Siti", 15);

        } catch (InvalidNameException e) {
            System.out.println("Error Nama: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error Umur: " + e.getMessage());
        }
    }
}