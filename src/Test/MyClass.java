package Test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
		String format = now.format(dateTimeFormatter);
		System.out.println(format.toString());
		
		List<String> errorList= List.of("SSM","AD","CD");
		System.out.println(errorList);

	}

}
