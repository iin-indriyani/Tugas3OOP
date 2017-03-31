import java.util.Scanner;

public class CallConstructorMahasiswa {
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		int nomorInduk;
		char jenisKelamin;
		int tinggiBadan;
		int beratBadan;
		boolean menikah;

		System.out.print("Masukkan Nomor Induk :  ");
		nomorInduk = input.nextInt();

		System.out.print("Masukan Jenis Kelamin : ");
		jenisKelamin = input.next().charAt(0);

		System.out.print("Masukkan Tinggi Badan : " );
		tinggiBadan = input.nextInt();

		System.out.print("Masukkan Berat Badan : " );
		beratBadan = input.nextInt();

		System.out.print("Masukkan Status Menikah : ");
		menikah = input.nextBoolean();

		System.out.println("");
		System.out.println("*******************************");
		Mahasiswa mhs = new Mahasiswa("Iin Indriyani");
		System.out.println("Nama Mahasiswa    : " +mhs.nama);
		System.out.println("Nomor Induk       : " +nomorInduk);
		System.out.println("Jenis Kelamin     : " +jenisKelamin);
		System.out.println("Tinggi Badan      : " +tinggiBadan);
		System.out.println("Berat Badan       : " +beratBadan);
		System.out.println("Status Perkawinan : " +menikah);
		System.out.println("*******************************");
	}
}