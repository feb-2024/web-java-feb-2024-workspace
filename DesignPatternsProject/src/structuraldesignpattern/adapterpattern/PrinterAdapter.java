package structuraldesignpattern.adapterpattern;

public class PrinterAdapter implements Printer{
	
	private LegacyPrinter oldPrinter;
	
	
	public PrinterAdapter() {
		oldPrinter = new LegacyPrinter();
	}
	
	@Override
	public void print() {
		oldPrinter.printDocument();		
	}

}
