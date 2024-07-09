package creationaldesignpattern.singletonpattern;

public class Demo {

	public static void main(String[] args) {
		Translator trans = new Translator();
		System.out.println(trans.translate("Good Morning"));

		Translator trans1 = new Translator();
		System.out.println(trans1.translate("Good Evening"));
		
		//TranslatorEarly trans3 = new TranslatorEarly();
		
		System.out.println("Early Instantiation Singleton pattern...");
		TranslatorEarly trans4 = TranslatorEarly.getInstance();
		System.out.println(trans4.translate("Good Morning"));
		
		TranslatorEarly trans5 = TranslatorEarly.getInstance();
		System.out.println(trans5.translate("Good Evening"));
		
		System.out.println("Lazy Instantiation Singleton pattern...");
		TranslatorLazy trans6 = TranslatorLazy.getInstance();
		System.out.println(trans6.translate("Good Morning"));
		
		TranslatorLazy trans7 = TranslatorLazy.getInstance();
		System.out.println(trans7.translate("Good Evening"));
	}

}
