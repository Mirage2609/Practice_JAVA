import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char repeat;

        do {
            System.out.println("==== Pilih operasi: ====");
            System.out.println("[1] Penjumlahan");
            System.out.println("[2] Pengurangan");
            System.out.println("[3] Perkalian");
            System.out.println("[4] Pembagian");
            System.out.println("[5] Akar Kuadrat");

            System.out.println("Pilih Operasi: ");
            int operasi = input.nextInt();

            double hasil = 0;

            // Jika user memilih operasi akar kuadrat
            if (operasi == 5) {
                System.out.println("Masukkan Angka: ");
                double angka = input.nextDouble();

                if (angka >= 0) {
                    hasil = Math.sqrt(angka);
                    System.out.println("Hasil = " + hasil);
                } else {
                    System.out.println("Tidak bisa menghitung akar dari bilangan negatif!");
                }
            } else {
                // Jika user memilih operasi dari 1 - 4
                System.out.print("Masukkan Angka Pertama: ");
                double angka1 = input.nextDouble();

                System.out.print("Masukkan Angka Kedua: ");
                double angka2 = input.nextDouble();

                switch (operasi) {
                    case 1:
                        hasil = angka1 + angka2;
                        break;
                    case 2:
                        hasil = angka1 - angka2;
                        break;
                    case 3:
                        hasil = angka1 * angka2;
                        break;
                    case 4:
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                        } else {
                            System.out.println("Tidak bisa membagi dengan nol!");
                        }
                        break;
                    case 5:
                        if (angka1 >= 0) {
                            hasil = Math.sqrt(angka1);
                        } else {
                            System.out.println("Akar kuadrat tidak bisa untuk bilangan negatif!");
                        }
                        break;
                    default:
                        System.out.println("Tidak ada operasi yang tersedia!");
                        break;
                }
                System.out.println("Hasil = " + hasil);
            }

            System.out.print("Lanjut? (y/n): ");
            repeat = input.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        input.close();
    }
}