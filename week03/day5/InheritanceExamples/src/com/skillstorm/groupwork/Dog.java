package com.skillstorm.groupwork;

public class Dog /* Make Dog inherit from Animal */ extends Animal {
	
	@Override
	public String toString() {
		return "Dog [canSwim=" + canSwim + ", howGoodOutOfTen=" + howGoodOutOfTen + ", getName()=" + getName()
				+ ", isAlive=" + isAlive() + ", isExtinct=" + isExtinct() + "]";
	}

	private boolean canSwim;
	
	private int howGoodOutOfTen;

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public int getHowGoodOutOfTen() {
		return howGoodOutOfTen;
	}

	public void setHowGoodOutOfTen(int howGoodOutOfTen) {
		this.howGoodOutOfTen = howGoodOutOfTen;
	}
	
	
	
	/* Add some properties */
	
	/* Override the talk toString and equals methods*/
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null) 
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Dog other = (Dog) obj;
		return super.equals(other) && other.canSwim == this.canSwim && other.howGoodOutOfTen == this.howGoodOutOfTen;
	}

}
