package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Babbling1 {
    public int solution(String[] babbling) {
        int answer = 0;
		List<String> babblingList = Arrays.asList(babbling);
		answer = (int)babblingList.stream().map(c -> c.replace("aya", "1")).map(c -> c.replace("ye", "1")).map(c -> c.replace("woo", "1")).map(c -> c.replace("ma", "1")).map(c -> c.replace("1","")).filter(c -> c.isEmpty()).count();
        
        return answer;
    }
}