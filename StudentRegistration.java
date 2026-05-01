public class StudentRegistration {

    public void register(String nama, int umur) 
            throws InvalidNameException, InvalidAgeException {

        // Jika nama kosong
        if (nama == null || nama.isEmpty()) {
            throw new InvalidNameException("Nama tidak boleh kosong!");
            // alasan: nama wajib diisi untuk identitas mahasiswa
        }

        // Jika umur tidak valid
        if (umur < 16 || umur > 60) {
            throw new InvalidAgeException("Umur tidak memenuhi syarat Universitas!");
            // alasan: batas umur mahasiswa minimal 16 dan maksimal 60
        }

        // Jika valid
        System.out.println("Pendaftaran Mahasiswa " + nama + " Berhasil!");
    }
}