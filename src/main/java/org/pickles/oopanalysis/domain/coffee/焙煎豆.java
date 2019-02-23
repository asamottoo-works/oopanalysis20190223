package org.pickles.oopanalysis.domain.coffee;

public class 焙煎豆 {

	private 焙煎日 date;
	private ローストレベル level;
	private 生豆 base;

	public 焙煎豆(焙煎日 date, ローストレベル level, 生豆 base) {
		this.date = date;
		this.level = level;
		this.base = base;
	}

	private boolean isより苦い(焙煎豆 other) {
		return this.level.isより深煎り(other.level);
	}
}
