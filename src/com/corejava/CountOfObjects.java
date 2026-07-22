package com.corejava;

public class CountOfObjects {
	
	static int count;
	String hobbiesName;
	
	{
		count++;
	}

	
	public static void main(String[] args) {
		
		
		CountOfObjects cob1 = new CountOfObjects();
		cob1.hobbiesName = "Mandala Art";
		System.out.println("Hobby 1 : "+cob1.hobbiesName);
		
		CountOfObjects cob2 = new CountOfObjects();
		cob2.hobbiesName = "Painting";
		System.out.println("Hobby 2 : "+cob2.hobbiesName);
		
		CountOfObjects cob3 = new CountOfObjects();
		cob3.hobbiesName = "Pottery";
		System.out.println("Hobby 3 : "+cob3.hobbiesName);
		
		System.out.println("\nCount of Objects created : "+count);

	}

}
