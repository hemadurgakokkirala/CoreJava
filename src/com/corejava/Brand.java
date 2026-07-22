package com.corejava;

public class Brand {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");
	}
	
	void hello() {
		System.out.println("Hello !!");
	}

	public static void main(String[] args) {
		
		Brand chanel = new Brand();
		System.out.println(chanel);
		
		Brand LV = new Brand();
		System.out.println(LV);
		
		Brand Puma = new Brand();
		System.out.println(Puma);
		
		Brand one8 = new Brand();
		System.out.println(one8);
		
		chanel = null;
		LV = null;
		
//		Brand Zara = new Brand();
//		Zara = one8;
		new Brand().hello();
		
		System.gc();
		System.out.println("----------------");
		System.out.println(chanel);
		System.out.println(LV);
		System.out.println(Puma);
		System.out.println(one8);

	}

}
