
//convert type data 

public class Konversi {
	public static void main(String[] args) {

		//convert type data primitif dengan primitif
		byte anilaibyte = 100;
		int anilaiInt = (byte) anilaibyte;

		double anilaiDouble = (double) anilaiInt;

		int anilaiInt2 = (int) anilaiDouble;


		System.out.println(anilaiInt);
		System.out.println(anilaiDouble);
		System.out.println(anilaiInt2);

		//convert type data primitif dengan non primitif

		Integer anilaiInteger = Integer.valueOf(anilaiInt2);
		System.out.println(anilaiInteger);

		String _nilai = String.valueOf(anilaiInt2);
		System.out.println(_nilai);

		//convert type data non primitif dengan primitif
		String id_number = "191289";
		int anilaiInt3 = Integer.parseInt(id_number);//string ke int
		double anilaiDouble2 = Double.parseDouble(id_number);

		System.out.println(id_number);
		System.out.println(anilaiInt3);
		System.out.println(anilaiDouble2);

		//convert type data non primitif ke non primitif
		Integer a = 1000;
		String _a = String.valueOf(a);
		Double aD = Double.valueOf(_a);

		System.out.println(a);
		System.out.println(_a); 
		System.out.println(aD);
 	}
}