package step01_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex03TimePackage {

	public static void main(String[] args) {
		// LocalDate Ŭ���� : ���� ��¥
		LocalDate currentData = LocalDate.now();
		System.out.println(currentData);
		System.out.println(currentData.getYear());
		System.out.println(currentData.getMonth());
		System.out.println(currentData.getMonthValue());
		System.out.println(currentData.getDayOfWeek());
		System.out.println(currentData.getDayOfMonth());
		System.out.println(currentData.getDayOfYear());
		System.out.println(currentData.isLeapYear());
//				
		System.out.println();

		// LocalTime Ŭ���� : ���� �ð�
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		System.out.println(currentTime.getHour());
		System.out.println(currentTime.getMinute());
		System.out.println(currentTime.getSecond());
//				
//				System.out.println();

		// LocalDateTime Ŭ���� : ���� ��¥ + �ð�
		LocalDateTime localDataTime1 = LocalDateTime.now();
		System.out.println(localDataTime1);
		System.out.println(localDataTime1.plusYears(1));
		System.out.println(localDataTime1.minusDays(1));

		System.out.println();

		// with() : ����� ���� ���� - ��, ��, ��, ��, ��, ��
		LocalDateTime localDataTime2 = LocalDateTime.now();
		System.out.println(localDataTime2);

		// �ʱ�ȭ �� ����
		LocalDateTime localDataTime3 = null;
		System.out.println(localDataTime3);

		localDataTime3 = localDataTime2.withYear(2024).withMonth(2).withDayOfMonth(22).withHour(14).withMinute(22);
		System.out.println(localDataTime3);

		// ZonedDateTime Ŭ���� : Ư�� zone�� ��¥, �ð�
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDateTime);
	}

}
