package com.leon.fgf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ��������������ָ����������������������ﲻ������ҵ������������ǲ�ͬ����ҳ�����ȫͬ������
 * 
 * @author Leon
 *
 */
public class PlayerGenerator {

	public List<Player> generatePlayers(int number) {
		List<Player> players = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < number; i++) {
			Player player = new Player();
			for (int j = 0; j < 3; j++) {
				Card card = new Card();
				// ���·�ֹͬһ�����г��ֻ�ɫ�ʹ�С����ͬ����
				int cardFlower = getRandomFlower(random);
				int cardNumber = getRandomNumber(random);
				if (j == 0) {
					card.setFlower(cardFlower);
					card.setNumber(cardNumber);
				} else if (j == 1) {
					while (cardFlower == player.cards[0].getFlower() && cardNumber == player.cards[0].getNumber()) {
						cardFlower = getRandomFlower(random);
						cardNumber = getRandomNumber(random);
					}
					card.setFlower(cardFlower);
					card.setNumber(cardNumber);
				} else {
					while ((cardFlower == player.cards[0].getFlower() && cardNumber == player.cards[0].getNumber())
							|| (cardFlower == player.cards[1].getFlower()
									&& cardNumber == player.cards[1].getNumber())) {
						cardFlower = getRandomFlower(random);
						cardNumber = getRandomNumber(random);
					}
					card.setFlower(cardFlower);
					card.setNumber(cardNumber);
				}
				player.cards[j] = card;
			}
			sort(player);
			players.add(player);
		}
		return players;
	}

	private int getRandomFlower(Random random) {
		return random.nextInt(4);
	}

	private int getRandomNumber(Random random) {
		return 2 + random.nextInt(13);
	}

	private void sort(Player player) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 - i - 1; j++) {
				if (player.cards[j].getNumber() < player.cards[j + 1].getNumber()) {
					int temp = player.cards[j].getNumber();
					player.cards[j].setNumber(player.cards[j + 1].getNumber());
					player.cards[j + 1].setNumber(temp);
				}
			}
		}
	}

}
