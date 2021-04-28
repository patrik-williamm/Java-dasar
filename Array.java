
//array

public class Array {

	public static void main(String[] args) {

		//membuat array
		String[] _nama = {
			"patrik william",
			"yui",
			"naruto",
			"sasuke",
			"saitama",
			"eren"
		};

		int[] umur = new int[] {
			19, 20, 32, 13, 22, 12
		};

		//memanggil array
		System.out.println(_nama[0] +" "+ umur[0]);
		System.out.println(_nama[1] +" "+ umur[1]);
		System.out.println(_nama[2] +" "+ umur[2]);
		System.out.println(_nama[3] +" "+ umur[3]);
		System.out.println(_nama[4] +" "+ umur[4]);
		System.out.println(_nama[5] +" "+ umur[5]);

		//memanggil array dengan foreach
		for (String i : _nama) {
			System.out.println(i);
		}

	}
}