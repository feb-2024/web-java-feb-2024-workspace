package creationaldesignpattern.singletonpattern;

public class Translator {

	// 2 forms of singleton pattern
		// 1. Early Instantiation: The object creation happens at the class load time
		// 2. Lazy Instantiation: The object creation is done according to the requirement
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
