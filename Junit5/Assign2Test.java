package io.junit5assign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.junit5assign.Assign2;

class Assign2Test {
Assign2 a;

@BeforeEach

void init() {
	a=new Assign2();
}
	@Test
	void test1() {
	int s[]	=new int[]{56, 34, 7,3, 54, 3, 34, 34, 53};
	String st="[3, 56]";
	assertEquals(st,a.findMinMax(s) );
	}
	@Test
	void test2() {
	int s[]	=new int[]{56, 34, 7,2, 54, 3, 96, 34, 53};
	String st="[2, 96]";
	assertEquals(st,a.findMinMax(s) );
	}
	@Test
	void test3() {
	int s[]	=new int[]{96, 34, 7,3, 54, 1, 34, 34, 53};
	String st="[1, 96]";
	assertEquals(st,a.findMinMax(s) );
	}

}
