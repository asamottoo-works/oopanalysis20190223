package org.pickles.oopanalysis.domain.coffee;

public class 注文明細 {
	private 生豆 fresh;
	private ローストレベル level;
	public 注文明細(生豆 fresh, ローストレベル level) {
		this.fresh = fresh;
		this.level = level;
	}

	public 生豆 getFresh() {
		return fresh;
	}

	public ローストレベル getLevel() {
		return level;
	}
}
