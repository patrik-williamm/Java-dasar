

/*
	perulangan
	for
	while
	do while

	oke
	lets'go code
*/

public class Perulangan {

	public static void main(String[] args) {
		
		//for

		String nama = "patrik william";
		//menampilkan nama : pattrik william 10x

		System.out.println("\nfor\n");
		for ( int i = 0; i < 10; i++) {
			System.out.println(nama+" "+i);
		}

		//while
		System.out.println("\nwhile\n");
		Integer j = null;
		Integer i = 0;
		while(i < 10) {
			System.out.println(nama+" "+i);
			i++;

		}

		//do while
		System.out.println("\ndo while\n");
		do{
			System.out.println(nama);
			i++;

		}while(i < 0);

	}
}