package creationaldesignpattern.singletonpattern;

public class TranslatorLazy {
	// 1. create a constructor and make it private
	private TranslatorLazy() {}
	
	// 2. create a reference of the current class and make it static
	static TranslatorLazy translator;
	
	// 3. create a getInstance method which creates and returns the object if not created
	public static TranslatorLazy getInstance() {
		if(translator == null) {
			translator = new TranslatorLazy();
		}
		return translator;
	}
	public String translate(String message) {
		System.out.println("Object hashcode: " + hashCode());
		String output = "I don't understand the word!";
		if(message.equalsIgnoreCase("Good Morning")) {
			output = "It is morning!";
		}else if(message.equalsIgnoreCase("Good Afternoon")) {
			output = "It is afternoon!";
		}else if(message.equalsIgnoreCase("Good Evening")) {
			output = "It is evening or night!";
		}
		return output;
	}
}
