package com.template;

public class ITWorker extends Worker {

	public ITWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "打dota...");
	}

	@Override
	public boolean isNeedPrintDate() {
		return true;
	}

}
