public class StudentRegistration {

    public void register(String nama, int umur) 
            throws InvalidNameException, InvalidAgeException {

        // Validasi nama kosong
        if (nama.isEmpty()) {
            // throw error karena nama tidak boleh kosong (data tidak valid)
            throw new InvalidNameException("Nama tidak boleh kosong!");
        }

        // Validasi umur
        if (umur < 16 || umur > 60) {
            // throw error karena umur tidak sesuai syarat universitas
            throw new InvalidAgeException("Umur tidak memenuhi syarat Universitas!");
        }

        // Jika lolos validasi
        System.out.println("Pendaftaran Mahasiswa " + nama + " Berhasil!");
    }
}