package loop;

import java.util.Scanner;

public class uts_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nm_mhs, grade = null;
        double avg, ipk = 0, gradeIPK = 0;
        int jml_matkul, option, n, p, nim;

        do {
            System.out.println("------Menu------");
            System.out.println("0. Keluar");
            System.out.println("1. Hitung IPK");
            System.out.println("----------------------");
            System.out.println();
            System.out.print("Masukkan pilihan menu Anda : ");
            option = input.nextInt();
            input.nextLine();

            if (option != 0) {
                System.out.print("Masukkan nama mahasiswa : ");
                nm_mhs = input.nextLine();
                System.out.print("Masukkan NIM mahasiswa : ");
                nim = input.nextInt();
                System.out.print("Masukkan jumlah mata kuliah : ");
                jml_matkul = input.nextInt();
                Double[] uts = new Double[jml_matkul];
                Double[] ukk = new Double[jml_matkul];
                Double[] uas = new Double[jml_matkul];
                Double[] rata = new Double[jml_matkul];
                String[] nm_matkul = new String[jml_matkul];
                int[] sks = new int[jml_matkul];
                System.out.println("");
                for (n = 0; n < jml_matkul; n++) {
                    int no = n + 1;
                    input.nextLine();
                    System.out.print("Masukkan nama mata kuliah ke-" + no + ": ");
                    nm_matkul[n] = input.nextLine();
                    System.out.print("Masukkan sks " + nm_matkul[n] + ": ");
                    sks[n] = input.nextInt();
                    System.out.print("Masukkan nilai uts " + nm_matkul[n] + ": ");
                    uts[n] = input.nextDouble();
                    System.out.print("Masukkan nilai uas " + nm_matkul[n] + ": ");
                    uas[n] = input.nextDouble();
                    System.out.print("Masukkan nilai ukk " + nm_matkul[n] + ": ");
                    ukk[n] = input.nextDouble();
                    rata[n] = (uts[n] + uas[n] + ukk[n]) / 3;

                    if (rata[n] >= 85) {
                        grade = "A";
                    } else if (rata[n] >= 80) {
                        grade = "B+";
                    } else if (rata[n] >= 75) {
                        grade = "B";
                    } else if (rata[n] >= 70) {
                        grade = "C+";
                    } else if (rata[n] >= 65) {
                        grade = "C";
                    } else if (rata[n] >= 60) {
                        grade = "D+";
                    } else if (rata[n] >= 55) {
                        grade = "D";
                    } else if (rata[n] < 55) {
                        grade = "F";
                    }

                    System.out.println("Mata kuliah ke-" + no + " " + nm_matkul[n] + " (" + sks[n] + ".0 sks) nilai : " + rata[n] + " (" + grade + ")");
                    System.out.println();
                }

                System.out.println("-------------KHS-------------");
                System.out.println("Nama    : " + nm_mhs);
                System.out.println("NIM     : " + nim);
                System.out.println("----------Nilai IPK----------");
                System.out.println();
                for (n = 0; n < jml_matkul; n++) {
                    ipk = ipk + rata[n];
                }
                ipk = ipk / 3;
                if (ipk >= 85) {
                    gradeIPK = 4;
                } else if (ipk >= 80) {
                    gradeIPK = 3.5;
                } else if (ipk >= 75) {
                    gradeIPK = 3;
                } else if (ipk >= 70) {
                    gradeIPK = 2.5;
                } else if (ipk >= 65) {
                    gradeIPK = 2;
                } else if (ipk >= 60) {
                    gradeIPK = 1.5;
                } else if (ipk >= 55) {
                    gradeIPK = 1;
                } else if (ipk < 55) {
                    gradeIPK = 0.5;
                }
                System.out.println("IPK bagi 3 : " + ipk);
                System.out.println("IPK asli : " + gradeIPK);

            } else {
                System.out.println("Anda keluar dari aplikasi, Terimakasih");
            }
        } while (option != 0);
        System.out.println();
    }

}
