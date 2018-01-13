package com.template;

import java.util.Date;

public abstract class Worker {

	protected String name;

	public Worker(String name) {
		this.name = name;
	}

	/**
	 * 记录一天的工作
	 */
	public final void workOneDay() {
		System.out.println("-----------------work start ---------------");
		enterCompany();
		work();
		exitCompany();
		System.out.println("-----------------work end ---------------");
	}

	/**
	 * 工作
	 */
	public abstract void work();

	/**
	 * 进入公司
	 */
	public void enterCompany() {
		System.out.println(name + "进入公司");
	}

	public boolean isNeedPrintDate() {
		return false;
	}

	/**
	 * 离开公司
	 */
	public void exitCompany() {
		if (isNeedPrintDate()) {
			System.out.print(new Date().toLocaleString() + "-->");
		}
		System.out.println(name + "离开公司");
	}
}
