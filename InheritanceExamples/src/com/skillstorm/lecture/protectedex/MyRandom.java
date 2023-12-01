package com.skillstorm.lecture.protectedex;

import java.util.Random;

public class MyRandom extends Random {
	
	public int get2RandomBits() {
		return this.next(3);
	}
	
	@Override
	public int next(int bits) {
		return super.next(bits);
	}

}
