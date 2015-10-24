class Test {
	public static void main (String[] args) {

		Sorting sort = new Sorting(3);
		sort.getValue(0,"Jean Arlha", "Rodrin", 17, "Naic, Cavite");
		sort.getValue(1,"Ma. Giselle", "Dionisio", 17, "Bacoor, Cavite");
		sort.getValue(2,"Jan Michael", "Agamin", 19, "Calamba, Laguna");

		System.out.println("\n**** ORIGINAL ****");
		sort.display();

		System.out.println("\n **** Sorted By AGE ****");
		sort.bubbleSort();
		sort.display();
	}
}

