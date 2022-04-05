
package loop;

import java.util.Scanner;
public class uts_7 {

    public static void main(String[] args) {

        int jenis_pegawai, nik_pegawai, jenis_jabatan, jumlah_harikerja;
        double gaji, gaji_pokok, honor, tunjangan;
        double pajak, gaji_bersih, gaji_kotor;
        String nama_pegawai;

        Scanner input = new Scanner(System.in);

        //input
        do {
            System.out.println("------Jenis Pegawai------");
            System.out.println("0. Keluar");
            System.out.println("1. PNS");
            System.out.println("2. Tetap Non PNS");
            System.out.println("3. Kontrak");
            System.out.println("-------------------------");
            System.out.print("Masukkan jenis pagawai  : ");
            jenis_pegawai = input.nextInt();

            //proses + output
            switch (jenis_pegawai) {
                case 0:
                    System.out.println("Anda keluar dari aplikasi, Terimakasih");
                    break;

                case 1:
                    input.nextLine();
                    System.out.print("Masukkan nama pegawai   : ");
                    nama_pegawai = input.nextLine();
                    System.out.print("Masukkan nik pegawai    : ");
                    nik_pegawai = input.nextInt();

                    System.out.println("------Jenis Jabatan------");
                    System.out.println("1. Kepala Bagian");
                    System.out.println("2. Wakil Kepala Bagian");
                    System.out.println("3. Staff");
                    System.out.println("-------------------------");
                    System.out.print("Masukkan jenis jabatan        : ");
                    jenis_jabatan = input.nextInt();
                    System.out.print("Masukkan jumlah hari kerja    : ");
                    jumlah_harikerja = input.nextInt();

                    switch (jenis_jabatan) {
                        case 1:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Kepala Bagian");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 30000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 4500000;
                            } else {
                                gaji = 4500000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        case 2:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Wakil Kepala Bagian");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 25000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 4000000;
                            } else {
                                gaji = 4000000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        case 3:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Staff");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 20000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 3500000;
                            } else {
                                gaji = 3500000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        default:
                            System.out.println("-");
                            break;
                    }
                    break;

                case 2:
                    input.nextLine();
                    System.out.print("Masukkan nama pegawai   : ");
                    nama_pegawai = input.nextLine();
                    System.out.print("Masukkan nik pegawai    : ");
                    nik_pegawai = input.nextInt();

                    System.out.println("------Jenis Jabatan------");
                    System.out.println("1. Kepala Bagian");
                    System.out.println("2. Wakil Kepala Bagian");
                    System.out.println("3. Staff");
                    System.out.println("-------------------------");
                    System.out.print("Masukkan jenis jabatan        : ");
                    jenis_jabatan = input.nextInt();
                    System.out.print("Masukkan jumlah hari kerja    : ");
                    jumlah_harikerja = input.nextInt();

                    switch (jenis_jabatan) {
                        case 1:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Kepala Bagian");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 30000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 4500000;
                            } else {
                                gaji = 4500000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        case 2:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Wakil Kepala Bagian");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 25000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 4000000;
                            } else {
                                gaji = 4000000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        case 3:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Staff");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 20000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 3500000;
                            } else {
                                gaji = 3500000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        default:
                            System.out.println("-");
                            break;
                    }

                    break;

                case 3:
                    input.nextLine();
                    System.out.print("Masukkan nama pegawai   : ");
                    nama_pegawai = input.nextLine();
                    System.out.print("Masukkan nik pegawai    : ");
                    nik_pegawai = input.nextInt();

                    System.out.println("------Jenis Jabatan------");
                    System.out.println("1. Kepala Bagian");
                    System.out.println("2. Wakil Kepala Bagian");
                    System.out.println("3. Staff");
                    System.out.println("-------------------------");
                    System.out.print("Masukkan jenis jabatan        : ");
                    jenis_jabatan = input.nextInt();
                    System.out.print("Masukkan jumlah hari kerja    : ");
                    jumlah_harikerja = input.nextInt();

                    switch (jenis_jabatan) {
                        case 1:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Kepala Bagian");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 30000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 4500000;
                            } else {
                                gaji = 4500000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        case 2:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Wakil Kepala Bagian");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 25000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 4000000;
                            } else {
                                gaji = 4000000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        case 3:
                            System.out.println("-------Rincian Gaji-------");
                            System.out.println("Nama       : " + nama_pegawai);
                            System.out.println("NIK        : " + nik_pegawai);
                            System.out.println("Status     : PNS ");

                            System.out.println("Jabatan    : Staff");
                            System.out.println("--------------------------");
                            tunjangan = 800000;
                            honor = 20000 * jumlah_harikerja;
                            if (jumlah_harikerja >= 25) {
                                gaji_pokok = 3500000;
                            } else {
                                gaji = 3500000 / 25;
                                gaji_pokok = gaji * jumlah_harikerja;
                            }

                            System.out.println("Gaji Pokok  : " + gaji_pokok);
                            System.out.println("Tunjangan   : " + tunjangan);
                            System.out.println("Honor       : " + honor);

                            gaji_kotor = gaji_pokok + tunjangan + honor;
                            pajak = 0.05 * gaji_kotor;
                            gaji_bersih = gaji_kotor - pajak;

                            System.out.println("Pajak       : -" + pajak);
                            System.out.println("-----------------------");
                            System.out.println("Gaji Bersih : " + gaji_bersih);
                            break;

                        default:
                            System.out.println("-");
                            break;
                    }
                    break;

                default:
                    System.out.println("Menu tidak ditemukan");
                    break;
            }
        } while (jenis_pegawai != 0);

    }
}
