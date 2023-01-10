package org.ncu.greeting_app;

public class MainApp {
	public static void main(String[] args) {
		// EnglishGreetingService eng = new EnglishGreetingService();
		// eng.greet("Sid");
		//
		// FrenchGreetingService fre = new FrenchGreetingService();
		// fre.greet("Sid");
		//
		// SpanishGreetingService spa = new SpanishGreetingService();
		// spa.greet("Sid");

		FactoryGreetingService factory = new FactoryGreetingService();
		GreetingService service = factory.greeting("fre");

		FactoryFortuneService factory1 = new FactoryFortuneService();
		FortuneService fortune = factory1.fortune("fre");

		service.greet("Sid");
		fortune.fortune("Sid");
	}
}
