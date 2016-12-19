package com.leon.fgf;

import java.util.List;

/**
 * ׯ�ң�����ϴ�ƣ����ƣ��Ƚ���
 * 
 * @author Leon
 *
 */
public class Dealer {

	// ���Խ����
	// ����1000���ƺ�ʱ3���룬�����ƴ�С�������ʱ5����
	// ����10000���ƺ�ʱ10���룬�����ƴ�С�������ʱ19����
	// ����100000���ƺ�ʱ39���룬�����ƴ�С�������ʱ85����
	// ������Ҫ�����в���
	private static final int PlayerNumber = 1000;

	public static void main(String args[]) {
		testOnePlayer();
		System.out.println("\n=================================");
		testManyPlayers();
	}

	private static void testOnePlayer() {
		PlayerJuger juger = new PlayerJuger();
		Card card0 = new Card(Card.FLOWER_SPADE, Card.NUM_A);
		printCard(card0);
		Card card1 = new Card(Card.FLOWER_SPADE, Card.NUM_Q);
		printCard(card1);
		Card card2 = new Card(Card.FLOWER_CLUB, Card.NUM_Q);
		printCard(card2);
		Player player = new Player(card0, card1, card2);
		juger.judgePlayer(player);
		printTypeValue(player);
	}

	private static void testManyPlayers() {
		PlayerGenerator generator = new PlayerGenerator();
		PlayerJuger juger = new PlayerJuger();
		System.out.println("start generate..." + System.currentTimeMillis());
		List<Player> players = generator.generatePlayers(PlayerNumber);
		System.out.println("end generate..." + System.currentTimeMillis());
		juger.sort(players);
		System.out.println("finish sort..." + System.currentTimeMillis());

		 printPlayers(players);
	}

	private static void printPlayers(List<Player> players) {
		for (int i = 0; i < PlayerNumber; i++) {
			System.out.print("���_" + i + "_���ƣ�");
			for (int j = 0; j < 3; j++) {
				printCard(players.get(i).cards[j]);
			}
			printTypeValue(players.get(i));
			System.out.println();
		}
	}

	private static void printCard(Card card) {
		int flower = card.getFlower();
		int number = card.getNumber();
		switch (flower) {
		case Card.FLOWER_SPADE:
			System.out.print("����" + getCardStringNumber(number));
			break;
		case Card.FLOWER_HEART:
			System.out.print("����" + getCardStringNumber(number));
			break;
		case Card.FLOWER_CLUB:
			System.out.print("÷��" + getCardStringNumber(number));
			break;
		default:
			System.out.print("��Ƭ" + getCardStringNumber(number));
			break;
		}
		System.out.print(", ");
	}

	private static String getCardStringNumber(int number) {
		if (number <= 10) {
			return "" + number;
		} else if (number == 11) {
			return "J";
		} else if (number == 12) {
			return "Q";
		} else if (number == 13) {
			return "K";
		} else {
			return "A";
		}

	}

	private static void printTypeValue(Player player) {
		int type = player.getType();
		int value = player.getValue();
		switch (type) {
		case PlayerType.BOMB:
			System.out.print("ը��," + value);
			break;
		case PlayerType.STRAIGHT_FLUSH:
			System.out.print("ͬ��˳," + value);
			break;
		case PlayerType.FLUSH:
			System.out.print("ͬ����" + value);
			break;
		case PlayerType.STRAIGHT:
			System.out.print("˳��," + value);
			break;
		case PlayerType.DOUBLE:
			System.out.print("����," + value);
			break;
		default:
			if (player.isSpecial()) {
				System.out.print("������," + value);
			} else {
				System.out.print("��ͨ��," + value);
			}
			break;
		}
	}

}
