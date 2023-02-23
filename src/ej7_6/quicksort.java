package ej7_6;
import java.util.Scanner;
public class quicksort {

	static Scanner l = new Scanner(System.in);
	static int[] arrayEnt = new int[7];
	public static void main(String[] args) {
		System.out.println("Introduce valores");
		for(int i =0; i<arrayEnt.length;i++) {
			System.out.print("Numero "+ (i+1)+": ");
			arrayEnt[i] = l.nextInt();
			l.nextLine();
		}
		System.out.print("ARRAY ORIGINAL: [");
		for(int i =0; i<arrayEnt.length;i++) {
			System.out.print(arrayEnt[i]);
			if(i!=arrayEnt.length-1) {
				System.out.print(", ");

			}
			
		}
		System.out.println("]");
		
		quicksortMetodo(arrayEnt, 0, arrayEnt.length-1);
		System.out.print("ARRAY ORDENADO: [");
		for(int i =0; i<arrayEnt.length;i++) {
			System.out.print(arrayEnt[i]);
			if(i!=arrayEnt.length-1) {
				System.out.print(", ");

			}
			
		}
		System.out.println("]");


	}

	public static void quicksortMetodo(int[] array, int first, int last){
		if (last-first>1){
			int pivot = array[(last-first)/2];
			int left = first;
			int right = last;
			while(left<=right) {
				while(array[left]<pivot) {
					left++;
				}
				while(array[right]>pivot) {
					right--;
				}
				if(left<=right) {
					int leftOriginal = array[left];
					int rightOriginal = array[right];
					array[left] =rightOriginal;
					array[right]=leftOriginal;
					left++;
					right--;
				}
			}
			quicksortMetodo(array, first, right);
			quicksortMetodo(array, left, last);

		}
	}
}
