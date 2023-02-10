package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort2 {
	public String solution(String my_string) {
        String answer = "";
		String[] my_ArrString = my_string.split("");
		List<String> my_ListString = Arrays.asList(my_ArrString);
		List my_ResultString = my_ListString.stream().map(c -> c.toLowerCase()).sorted().collect(Collectors.toList());
		answer = String.join("",my_ResultString);
        return answer;
    }
}
