import java.util.Scanner;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai = sc.nextInt();

        try {
            cekNilai(nilai);
            System.out.println("Nilai: " + nilai);
        } catch (InvalidScoreException e) {
            // Tampilkan pesan error
            System.out.println(e.getMessage());
        }
    }

    public static void cekNilai(int nilai) throws InvalidScoreException {
        // Lempar exception jika nilai di luar 0–100
        if (nilai < 0 || nilai > 100) {
            throw new InvalidScoreException("Nilai tidak valid");
        }
    }
}