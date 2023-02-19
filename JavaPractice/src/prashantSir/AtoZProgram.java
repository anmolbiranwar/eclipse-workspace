package prashantSir;

public class AtoZProgram {
	static void aTOz() {
		char alp;
		for (alp = 'A'; alp <= 'Z'; alp++) {
			System.out.print(alp + " ");
		}
	}

	void zTOa() {
		char alp1;
		for (alp1 = 'Z'; alp1 >= 'A'; alp1--) {
			System.out.print(alp1 + " ");
		}
	}

	public static void main(String[] args) {
		AtoZProgram obj = new AtoZProgram();
		aTOz();
		System.out.println();
		obj.zTOa();

	}

}
