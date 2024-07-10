package structuraldesignpattern.adapterpattern;

public class Demo {

	public static void main(String[] args) {
		PrinterAdapter printerAdapter = new PrinterAdapter();
		printerAdapter.print();
	}

}
