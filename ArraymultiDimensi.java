
/******

	array multi dimensi
	or array dalam array
	wow


******/

public class ArraymultiDimensi {
	public static void main(String[] args) {

		//membuat array multi dimensi
		String[][] id = {
			{"patrik william", " Indonesia"},
			{"yui", " jepang"},
			{"bill gates", " USA"},
			{"jack ma", " china"}
		};

		//menampilkan array
		System.out.println(id[0][1]);


		
		for( int i = 0; i < id.length; i++) {
			for ( int j = 0; j < id[i].length; j++) {
				System.out.print(id[i][j]);
			}
			System.out.println(" ");
		}

	}
}