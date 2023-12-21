
public class ComparisonOfAnimalAndDog {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d instanceof Alive);
	}
}

interface Alive {
	void die();
}

class Animal implements Alive {
	String name;

	public void die() {
		System.out.println("died");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}

class Dog extends Animal {
	String breed;

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		}
		if (!breed.equals(other.breed))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		if (!name.equals(other.name))
			return false;
		return true;
	}
}
