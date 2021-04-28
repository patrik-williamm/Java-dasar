

import java.util.Scanner;
import java.util.Date;

public class DurasiKL {
	private static int jam() {
		
		int _jam = 0;
		Scanner inp = new Scanner(System.in);

		System.out.print("masukkan Jam mulai 	: ");
		int x = inp.nextInt();
		System.out.print("masukkan Jam selesai 	: ");
		int y = inp.nextInt();


		if (x < y) {
			_jam = y - x;
		}else if (y <= x) {
			_jam = x - y;
		}
	 return _jam;
	} 
	private static int menit() {
		
		int _jam = 0;
		Scanner inp = new Scanner(System.in);

		System.out.print("masukkan Menit mulai 	: ");
		int x = inp.nextInt();
		System.out.print("masukkan Menit selesai 	: ");
		int y = inp.nextInt();


		if (x < y) {
			_jam = y - x;
		}else if (y <= x) {
			_jam = x - y;
		}
	 return _jam;
	} 
	private static int detik() {
		
		int _jam = 0;
		Scanner inp = new Scanner(System.in);

		System.out.print("masukkan Detik mulai 	: ");
		int x = inp.nextInt();
		System.out.print("masukkan Detik selesai 	: ");
		int y = inp.nextInt();

		if (x < y) {
			_jam = y - x;
		}else if (y <= x) {
			_jam = x - y;
		}
	 return _jam;
	} 
	private static void input() {
	
		System.out.print("\nDurasi Jam : "+jam()+"\n\n");
		System.out.print("\nDurasi Menit : "+menit()+"\n\n");
		System.out.print("\nDurasi Detik : "+detik()+"\n\n");


	}

	public static void clearScreen() {
		try{
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/C","cls");
			}else{
				System.out.println("\033\134");
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		boolean isNext = true;

		while(isNext){
			clearScreen();
			System.out.println(new Date());
			input();

			System.out.print("ulangi program  [y/t]: ");
			String ulangi = inp.nextLine();

			if (ulangi == "y") {
				isNext = true;
			}else{
				isNext = false;
			}

		}
	}
}