package view;

import controller.OrdenarVetorController;

public class Principal {

	public static void main(String[] args) {
		OrdenarVetorController vetorController = new OrdenarVetorController();
		int[] vet1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] vet2 = { 44, 43, 42, 41, 40, 39, 38 };

		int[] vet1BubbleSort = vetorController.bubbleSort(vet1);
		int[] vet2BubbleSort = vetorController.bubbleSort(vet2);
		int[] vet1MergeSort = vetorController.mergeSort(vet1);
		int[] vet2MergeSort = vetorController.mergeSort(vet2);

		System.out.println("Vetor 1 em Bubble Sort:");
		for (int value : vet1BubbleSort) {
			System.out.print(value + "\t");
		}
		
		System.out.println("");
		System.out.println("Vetor 1 em Merge Sort:");
		for (int value : vet1MergeSort) {
			System.out.print(value + "\t");
		}
		
		System.out.println("");
		System.out.println("Vetor 2 em Bubble Sort:");
		for (int value : vet2BubbleSort) {
			System.out.print(value + "\t");
		}

		System.out.println("");
		System.out.println("Vetor 2 em Merge Sort:");
		for (int value : vet2MergeSort) {
			System.out.print(value + "\t");
		}

	}

}
