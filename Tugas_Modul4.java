import java.util.Scanner;

public class Tugas_Modul4 {
    public static int hitungBMI(double berat, double tinggiM) {
        double bmi = berat / (tinggiM * tinggiM);
        return (int) bmi;
    }
    public static void main(String[] args) {
        System.out.println("--------------KELOMPOK 26-------------");
        System.out.println("---------------SHIFT 04---------------");
        System.out.println("Gina Nabila 21120122130055");
        System.out.println("Alia Niswah 21120122130063");
        System.out.println("Annisa Charisma 21120122140086");
        System.out.println("Melisa Novpriyanti H. 21120122140125\n");

        Scanner input = new Scanner(System.in);
        double berat, tinggi, tinggiM;

        System.out.println("=================================================");
        System.out.println("            Body Mass Index Calculator           ");
        System.out.println("=================================================");

        while (true) {
            try {
                System.out.print("Masukkan berat badan Anda (kg): ");
                berat = input.nextDouble();

                System.out.print("Masukkan tinggi badan Anda (cm): ");
                tinggi = input.nextDouble();
                tinggiM = tinggi / 100.0;
                break;
            } catch (Exception e) {
                System.out.print("Input yang anda masukkan salah. Silahkan coba lagi.");
                input.nextLine();
            }
        }

        int bmi = hitungBMI(berat, tinggiM);
        System.out.println("BMI Anda adalah: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Anda termasuk dalam kategori kurus.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Anda termasuk dalam kategori ideal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Anda termasuk dalam kategori gemuk.");
        } else {
            System.out.println("Anda termasuk dalam kategori obesitas.");
        }

        System.exit(0);

    }
}
