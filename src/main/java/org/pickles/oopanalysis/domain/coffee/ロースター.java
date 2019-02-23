package org.pickles.oopanalysis.domain.coffee;

import java.time.LocalDate;

public class ロースター {

	// あとでロースターの中身をいじって別のローストを行うのでconstructorでのlevel設定は不可。
//	private ローストレベル setting;
//
//	public ロースター(ローストレベル setting) {
//		this.setting = setting;
//	}
//
//	private 焙煎豆 ロースト(生豆 fresh) {
//		return null;
//	}

	private ローストレベル setLevel;

	public void setローストレベル(ローストレベル level) {
		this.setLevel = level;
	}

	public 焙煎豆 ロースト(生豆 fresh) {
		return new 焙煎豆(new 焙煎日(LocalDate.now()), this.setLevel, fresh);
	}

	// ロースターはローストレベルを設定するノブがある。かつ、店員はロースターに対してローストレベルの設定を行う。
	// よって、引数にローストレベルをいれる実装は不可。
//	private 焙煎豆 ロースト(生豆 fresh, ローストレベル level) {
//		return null;
//	}
}
