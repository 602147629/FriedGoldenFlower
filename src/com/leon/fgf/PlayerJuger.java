package com.leon.fgf;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �����жϱȽ����������������ҵ��ƴ�С���м��������
 * 
 * @author Leon
 *
 */
public class PlayerJuger implements Comparator<Player> {

	private ValueCalculator calculator = new ValueCalculator();

	public void judgePlayer(Player player) {
		calculator.setupPlayer(player);
	}

	public void sort(List<Player> playersInput) {
		for (Player player : playersInput) {
			calculator.setupPlayer(player);
		}
		Collections.sort(playersInput, this);
		Collections.reverse(playersInput);
	}

	@Override
	public int compare(Player player1, Player player2) {
		return Integer.valueOf(player1.getValue()).compareTo(Integer.valueOf(player2.getValue()));
	}

}
