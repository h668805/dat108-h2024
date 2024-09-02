package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks2countmatch {

	public static void main(String[] args) {

		//Alle forbokstavene i fornavnene i en streng "CLTCM" - reduce() 
		String forbokstaver = people.stream().map(Person::firstName).reduce("", (akku, s) -> akku + s.charAt(0));
		System.out.println(forbokstaver);
		
		//Antall personer over 50 år - count()
		long antall = people.stream().filter(p -> p.age() > 50).count();
		System.out.println(antall);
				
		//Om vi har data som matcher - anyMatch(), allMatch(), noneMatch()
		//Er alle over 30 år?
		boolean over30 = people.stream().allMatch(p -> p.age() > 30);
		System.out.println(over30);
		//Er noen over 60 år?
		boolean over60 = people.stream().anyMatch(p -> p.age() > 60);
		System.out.println(over60);

	}

}




