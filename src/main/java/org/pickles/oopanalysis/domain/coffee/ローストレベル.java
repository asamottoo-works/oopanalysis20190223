package org.pickles.oopanalysis.domain.coffee;

public enum ローストレベル {
	ライト(1, 分類.浅煎り),
	シナモン(2, 分類.浅煎り),
	ミディアム(3, 分類.中煎り),
	ハイ(4, 分類.中煎り),
	シティ(5, 分類.中深煎り),
	フルシティ(6, 分類.中深煎り),
	フレンチ(7, 分類.深煎り),
	イタリアン(8, 分類.深煎り);

	private int level;
	private 分類 type;

	ローストレベル(int level, 分類 type) {
		this.level = level;
		this.type = type;
	}

	public int asNumber() {
		return this.level;
	}

	public 分類 get分類() {
		return this.type;
	}

	public boolean isより深煎り(ローストレベル other) {
		return this.level > other.level;
	}

	public enum 分類 {
		浅煎り, 中煎り, 中深煎り, 深煎り;
	}
}
