package oops;

public class writeaprogramgenerateapattern {

	public static void main(String[] args) {
		// input :- aabbbc output : a2b3c1 a square , b cube , c 1
		//screenshot 

		//concatinate 2 strings 
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "PQR";
		System.out.println("concatination of 3 strings "+ s1 + s2 + s3);
		//concatination of 3 strings ABCXYZPQR
		
		System.out.println("it consist duplicates " + s1.concat(s2) + s2.concat(s3));
		//ABCXYZXYZPQR
		
		StringBuilder concat = new StringBuilder();
		concat.append(s1);
		concat.append(s2);
		concat.append(s3);
		String result = concat.toString();
		System.out.println("no duplicate" + result);//no duplicateABCXYZPQR
		
		
		
		
		String str[] = { "java", "selenium", "maven", "testng", "jenkins" };
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);

		for(String loop1:str) {
			System.out.println("list of technical course" + loop1);
		}
		/*
list of technical coursejava
list of technical courseselenium
list of technical coursemaven
list of technical coursetestng
list of technical coursejenkins*/

		String t[] = { "Apple", "mango", "banana", "orange", "grapes" };
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		System.out.println(t[4]);

		for(String loop :t) {
			System.out.println("this is list of fruits are :" + loop);
			/*
this is list of fruits are :Apple
this is list of fruits are :mango
this is list of fruits are :banana
this is list of fruits are :orange
this is list of fruits are :grapes*/
		}


		int[] num = {2,34,5,7,78,98};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println(num[5]);

		for(int loop2:num) {
			System.out.println("list of numbers are :" + loop2);
		}

		/*list of numbers are :2
list of numbers are :34
list of numbers are :5
list of numbers are :7
list of numbers are :78
list of numbers are :98
		 * */

	}
}
