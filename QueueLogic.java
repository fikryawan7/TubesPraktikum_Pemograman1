package TUBES;

public class QueueLogic extends AntrianAkademik {
    // Menambahkan mahasiswa ke dalam antrian

    public void tambahMahasiswa(String nama) {
        queue.add(nama);
        System.out.println(nama + " telah ditambahkan ke dalam antrian.");
    }

    // Memanggil mahasiswa dari antrian
  
    public void panggilMahasiswa() {
        if (queue.isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam antrian.");
            
        } else {
            String nama = queue.poll();
            System.out.println(nama + " telah dipanggil dari antrian.");
            
        }
    }

    // Melihat daftar mahasiswa dalam antrian
    
    public void lihatAntrian() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar mahasiswa dalam antrian: " + queue);
        }
    }

    // Melihat mahasiswa di depan antrian
    public void mahasiswaDepan() {
        if (queue.isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam antrian.");
        } else {
            System.out.println("Mahasiswa di depan antrian: " + queue.peek());
        }
    }
}