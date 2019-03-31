package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}
			System.out.println("");
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		for (int i = 0; i < 100; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " even, ");
			}
			else {
				System.out.print(i + " odd, ");
			}
		}
		System.out.println("");
		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.print(1 + " ");
			}
		}
		System.out.println("");
		int age = 0;
		for (int i = 2005; i < 2019; i++) {
			System.out.print(i + " " + age + ", ");
			age = age + 1;
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("");
		for (int i = 0; i < 9; i+=3) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j+i + " ");
			}
		System.out.println(" ");
		}
		System.out.println(" ");
		for (int i = 0; i < 100; i+=10) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j+i + " ");
			}
		System.out.println(" ");
		}
	}
}
