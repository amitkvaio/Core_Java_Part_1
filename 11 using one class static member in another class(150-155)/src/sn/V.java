package sn;

import java.time.LocalDate;

public class V {
	static {
		System.out.println("v-sib");
	}

	public static void main(String[] args) {
		System.out.println("v main begin");
		U.main(args);
		System.out.println("...........");
		U.main(null);
		System.out.println("v main end ");
		LocalDate localDate = LocalDate.ofEpochDay(System.currentTimeMillis());
		System.out.println(localDate);
	}

}
