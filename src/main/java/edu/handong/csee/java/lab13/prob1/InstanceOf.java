package edu.handong.csee.java.lab13.prob1;//prob1 package

public class InstanceOf {//this class divide kind of friend
	public static void whatFriend(Friend friend){//this method is for divide kind of friend
		if(friend instanceof ClassFriend)//This is to make sure that the parameters of the former are the objects created by the Class
			((ClassFriend) friend).classFriend();//invoke classFriend method
		else if(friend instanceof SchoolFriend)//This is to make sure that the parameters of the former are the objects created by the Class
			((SchoolFriend) friend).schoolFriend();//invoke schoolFriend method
		else//parameter is not the object of SchoolFriend and ClassFriend class
			friend.justFriend();//invoke justFriend method
	}
}
