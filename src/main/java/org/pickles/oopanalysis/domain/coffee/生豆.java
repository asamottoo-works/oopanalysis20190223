package org.pickles.oopanalysis.domain.coffee;

public class 生豆 {

	private 産地 area;
	private 精選方法 method;
	private 豆種 type;

	public 生豆(産地 area, 精選方法 method, 豆種 type) {
		this.area = area;
		this.method = method;
		this.type = type;
	}
}
