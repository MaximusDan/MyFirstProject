
/** Класс матриц и массивов*/
public class Matrix {
	
	/** Метод создания и заполнения массива*/
	public static int[] createMass(int a) {
		int [] mass = new int[a];	
		for(int i=0;i<mass.length;i++) {
			mass[i]=(int)(Math.random() * 100) + 1;
			
		}
		return mass;
	}
	/** Метод вывода массива*/
	public static void showMass(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
