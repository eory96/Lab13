package edu.handong.csee.java.lab13.prob1;//prob1 package

public class Prob1 {//this class is main class

	public static void main(String[] args) {//this method is main method
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();//instanciation Friend class to friend1
		SchoolFriend friend2 = new SchoolFriend();//instanciation SchoolFriend class to friend2
		ClassFriend friend3 = new ClassFriend();//instanciation ClassFriend class to friend3

		InstanceOf.WhatFriend(friend1);//print out "just friend" this call method of Friend class
		InstanceOf.WhatFriend(friend2);//print out "School friend" this call method of schoolFriend class
		InstanceOf.WhatFriend(friend3);//print out "Class friend" this call method of classFriend class

	}

}
