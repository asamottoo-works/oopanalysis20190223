package org.pickles.oopanalysis.application.coffee;

import org.pickles.oopanalysis.domain.coffee.*;

import java.util.ArrayList;
import java.util.List;

public class ローストUseCase {

	public 焙煎豆 execute(注文明細 order) {
		ロースター roaster = new ロースター();
		roaster.setローストレベル(order.getLevel());
		return roaster.ロースト(order.getFresh());
	}

	public List<焙煎豆> executeAll(List<注文明細> orders) {
		List<焙煎豆> delivery = new ArrayList<>();

		ロースター roaster = new ロースター();
		for (注文明細 order : orders) {
			roaster.setローストレベル(order.getLevel());
			delivery.add(roaster.ロースト(order.getFresh()));
		}

		// UseCaseの意図とは違う(一回の注文で毎回)
//		for (注文明細 order : orders) {
//			delivery.add(execute(order));
//		}

		return delivery;
	}
}
