package com.leon.fgf;

/**
 * �����ͷ��࣬���ṩ�ƴ�Сֵ���㷨�����Ѿ�����õ��������ֵ
 * 
 * @author Leon
 *
 */
public class PlayerType {
	// ը��
	public static final int BOMB = 5;
	// ���ֵAAA=14������ͬ��˳6867=7881
	public static final int BOMB_MAX_VALUE = 7881;
	// ��Сֵ222=2������ͬ��˳6867=7869
	public static final int BOMB_MIN_VALUE = 7869;

	// ͬ��˳
	public static final int STRAIGHT_FLUSH = 4;
	// ���ֵAKQ=12������ͬ��7855=7867
	public static final int STRAIGHT_FLUSH_MAX_VALUE = 7867;
	// ��Сֵ432=2�� ����ͬ��7855=7857
	public static final int STRAIGHT_FLUSH_MIN_VALUE = 7857;

	// ͬ��
	public static final int FLUSH = 3;
	// ���ֵAKJ��14*16*16+13*16+11=3803������˳��4052=7855
	public static final int FLUSH_MAX_VALUE = 7855;
	// ��Сֵ532��5*16*16+3*16+2=1330������˳��4052=5382
	public static final int FLUSH_MIN_VALUE = 5382;

	// ˳��
	public static final int STRAIGHT = 2;
	// ���ֵAKQ=12�����϶��ӵ����ֵ����4040=4052
	public static final int STRAIGHT_MAX_VALUE = 4052;
	// ��Сֵ432=2�����϶��ӵ�������4040=4042
	public static final int STRAIGHT_MIN_VALUE = 4042;

	// ����
	public static final int DOUBLE = 1;
	// ���ֵAAK=14*16+13=237,������ͨ�ƵĻ���3803=4040
	public static final int DOUBLE_MAX_VALUE = 4040;
	// ��Сֵ223=2*16+3=35��������ͨ�ƵĻ���3803=3838
	public static final int DOUBLE_MIN_VALUE = 3838;

	// ��ͨ�ƣ��������һ��������532��ͬ��ɫ
	public static final int NORMAL = 0;
	// ���ֵAKJ=14*16*16+13*16+11=3803
	public static final int NORMAL_MAX_VALUE = 3803;
	// ��Сֵ532=5*16*16+3*16+2=1330
	public static final int NORMAL_MIN_VALUE = 1330;

}
