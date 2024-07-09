package creationaldesignpattern.singletonpattern;

public class TranslatorEarly {
	// 1. create a constructor and make it private
	private TranslatorEarly() {};
	
	// 2. create a reference of the current class and make it static
	static TranslatorEarly translator;
	
	// 3. create a static block and initialize the class reference
	static {
		translator = new TranslatorEarly();
	}
	
	//4. create a static method that return this object
	public static TranslatorEarly getInstance() {
		return translator;
	}
	
	public String translate(String message) {
		System.out.println("Object hashcode : " + hashCode());
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
