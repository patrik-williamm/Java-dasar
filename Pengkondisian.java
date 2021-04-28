
/*
	if else
	else if else

	switch case
	lest'go to code

*/

import java.util.Scanner;

public class Pengkondisian {
	public static void main(String[] args) {

		//if
		String nilai = "1000";
		Integer _nilai = Integer.valueOf(nilai);

		//jika _nilai tidak sama dengan 999 maka print salah!!!
		if( _nilai != 999) {
			System.out.println("salah!!!");
		}

		//if else
		Integer anilaiInteger = 1220;
		double anilaiDouble = Double.valueOf(anilaiInteger);

		if( anilaiDouble == 1220) {
			System.out.println("benar$$$$");
		}else{
			System.out.println("salah!!!");
		}

		//else if

		int anilaiInt = 1222;
		double _anilaiDouble = (double) anilaiInt;

		if( _anilaiDouble != 1222) {
			System.out.println("salah!!!");
		}else if( _anilaiDouble == 1222) {
			System.out.println("Benar###");
		}else{
			System.out.println("error!!!");
		}


		//which case
		Scanner inp = new Scanner(System.in);
		
		System.out.print("masukkan Nilai final 	: ");
		int $nilai = inp.nextInt();
		switch($nilai) {
			case 1:
				System.out.println("anda belum berhasil!!!");
				break;
			case 2:
				System.out.println("selamat anda lulus***");
				break;
			default:
				System.out.println("salah!!!");
		}



	}
}