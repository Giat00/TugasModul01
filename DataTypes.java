import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		String namaDepan;
		String namaTengah;
		String namaBelakang;
		int usia ;
		double ipk ;
		char nilaiAbjad ;
		boolean tampan = true;

	System.out.println("Masukkan Nama Depan      : ");
	namaDepan = scanner.nextLine();
	System.out.println("Masukkan Nama Tengah     : ");
	namaTengah = scanner.nextLine();
	System.out.println("Masukkan Nama Tengah     : ");
	namaBelakang = scanner.nextLine();;
	System.out.println("Masukkan Usia            : ");
	usia = scanner.nextInt();
	System.out.println("Masukkan IPK             : ");
	ipk = scanner.nextDouble();
	System.out.println("Masukkan Nilai Abjad     : ");
	nilaiAbjad = scanner.next().charAt(0);
	System.out.println("Tampan ?                   : ");
	tampan = scanner.nextBoolean();


	System.out.println("Nama Depan    : "+namaDepan);
	System.out.println("Nama Tengah   : "+namaTengah);
	System.out.println("Nama Belakang : "+namaBelakang);
	System.out.println("Usia	  : "+usia);
	System.out.println("IPK		  : "+ipk);
	System.out.println("Nilai PBO	  : "+nilaiAbjad);
	System.err.println("Tampan	  : "+tampan);

	JOptionPane.showMessageDialog(null, "Hai, "+ namaDepan + namaTengah + namaBelakang);


 }
}