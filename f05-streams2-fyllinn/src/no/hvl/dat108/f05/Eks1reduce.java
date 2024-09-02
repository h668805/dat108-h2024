package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks1reduce {
	
	public static void main(String[] args) {
		
		/* Summen av aldrene til personene i people-listen */
		int summen = people.stream().mapToInt(Person::age).sum();
		System.out.println(summen);
		
		/* En streng med alle initialene, "CD LC TC CB MA" */
		String s = people.stream().map(p -> "" + p.firstName().charAt(0)
				+ p.lastName().charAt(0))
				.reduce("", (akk, x) -> akk + x + " ");
		System.out.println(s);
	}	
}
