package com.adapter;

public class Test {

	public static void main(String[] args) {
		Ps2 p = new Adapter();
		p.isPs2();
		
		
		Ps2 p2 = new Adapter2(new UsbImpl());
		p2.isPs2();
	}

}
