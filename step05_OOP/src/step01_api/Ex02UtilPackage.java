package step01_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02UtilPackage {

	public static void main(String[] args) {
		// Date Ŭ����
		Date date = new Date();
		System.out.println(date);

		// SimpleDateFormat() : Ư�� ���ڿ� �������� ��ȯ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
		System.out.println(simpleDateFormat.format(date));

		// "yyyy�� MM�� dd��"
		simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(simpleDateFormat.format(date));

		// "yyyy-MM-dd"
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(date));

		// "yyyy:MM:dd HH:mm:ss"
		simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));

		// Calendar Ŭ����
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
	}

}
