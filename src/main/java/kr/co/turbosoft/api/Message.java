package kr.co.turbosoft.api;

import kr.co.turbosoft.dao.DataDao;
import kr.co.turbosoft.dao.UserDao;

public class Message {
	public static String code100 = "����ó�� �Ǿ����ϴ�.";
	public static String code101 = "������ �� �ִ� ���̵��Դϴ�.";
	public static String code102 = "�̹� ���Ե� ���̵��Դϴ�.";
	public static String code103 = "������ �� �ִ� �̸����Դϴ�.";
	public static String code104 = "�̹� ���Ե� �̸����Դϴ�.";
	public static String code105 = "ȸ�� ������ �������� �ʽ��ϴ�.";
	public static String code106 = "�̹� ���Ե� ���̵�� �̸��� �Դϴ�.";
	public static String code107 = "ȸ�������� �Ϸ� �Ǿ����ϴ�.";
	public static String code200 = "�����Ͱ� �������� �ʽ��ϴ�.";
	public static String code201 = "��й�ȣ�� �ٸ��ϴ�.";
	
	public static String code202 = "Session Token ó�� �����Դϴ�.";
	public static String code203 = "Session Token�� ����Ǿ����ϴ�.";
	public static String code204 = "Session Token ������ �����ϴ�.";
	public static String code205 = "Session Token ������ �α��� ������ ��ġ���� �ʽ��ϴ�.";
	
	public static String code300 = "�����ͺ��̽� ó�� �����Դϴ�.";
	public static String code400 = "���� ó�� �����Դϴ�.";
	public static String code500 = "�����ڸ� ��밡���� �޴��Դϴ�.";
	public static String code600 = "���ǿ� ���� �ʴ� �����Ͱ� �ֽ��ϴ�.";
	public static String code700 = "�ش� �����Ϳ� ���� ������ �����ϴ�.";
	
	
	public static String code800 = "�ý��� �����Դϴ�. �����޽����� Ȯ���� �ּ���.";
	public static String code900 = "���� ���� ������Դϴ�. ���� ������Ʈ �����ñ� �ٶ��ϴ�.";
	
	//��ϵ� �ǻ� ���� Ȯ�� message
	public static String code801 = "�̹� ��ϵ� �ǻ�����Դϴ�.";
	public static String code802 = "�������� �������� �ʾҽ��ϴ�.";
	public static String code803 = "�������� �������ϴ�.";
	
	public static String code901 = "�������� ���� ������Դϴ�.";
	
	static DataDao dataDao = null;
	static UserDao userDao = null;
}
