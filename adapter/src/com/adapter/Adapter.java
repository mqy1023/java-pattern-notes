package com.adapter;

public class Adapter extends UsbImpl implements Ps2 {

	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
		isUsb();
	}

}
