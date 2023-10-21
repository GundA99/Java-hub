package com.tester;

import com.code.Box;

public class BoxEqual {

	public static void main(String[] args) {
		Box box1 = new Box(30, 30, 30);

		System.out.println(box1);
		System.out.println();

		Box box2 = new Box(50, 40, 60);
		System.out.println(box2);

		Box box3 = new Box(50, 40, 60);
		System.out.println(box3);

		if (box1 == box2)
			System.out.println("box1==box2");

		if (box2 == box3) {
			System.out.println("box2==box3");
		} else {
			System.out.println("box2!=box3");
		}
		System.out.println("Box2-----" + box2.hashCode() + "     Box3:" + box3.hashCode());
	boolean result = box2.isSame(box3);
	if (result == true)
		System.out.println("box2==box3");
	else
		System.out.println("box2!=box3");
	}

}
