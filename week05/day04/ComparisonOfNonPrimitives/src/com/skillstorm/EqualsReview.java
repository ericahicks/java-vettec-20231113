package com.skillstorm;

import java.util.Objects;

public class EqualsReview {

}

class Animal {
	String domain;
	String kingdom;
	String phylum;
	String clazz;
	String order;
	String family;
	String genus;
	String species;

	public Animal() {
		super();
	}

	public Animal(String domain, String kingdom, String phylum, String clazz, String order, String family, String genus,
			String species) {
		super();
		this.domain = domain;
		this.kingdom = kingdom;
		this.phylum = phylum;
		this.clazz = clazz;
		this.order = order;
		this.family = family;
		this.genus = genus;
		this.species = species;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clazz, domain, family, genus, kingdom, order, phylum, species);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(clazz, other.clazz) && Objects.equals(domain, other.domain)
				&& Objects.equals(family, other.family) && Objects.equals(genus, other.genus)
				&& Objects.equals(kingdom, other.kingdom) && Objects.equals(order, other.order)
				&& Objects.equals(phylum, other.phylum) && Objects.equals(species, other.species);
	}
	
	

}

class Dog extends Animal {
	String name;
	int age;
	String color;

	public Dog() {
		this("unknown", 0, "unknown");
	}

	public Dog(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
}

class GoldenRetriever extends Dog {
	public GoldenRetriever() {
		super("unknown", 0, "golden");
	}
}