package numberrangesummarizer;

import java.util.Collection;

import java.util.*;

public class MyNumberRangeSummarizer implements NumberRangeSummarizer{

	@Override
	public Collection<Integer> collect(String input) {
		 List<Integer> nums = new ArrayList<>();
	        for (String s : input.split(",")) {
	            nums.add(Integer.parseInt(s.trim()));
	        }
	        return nums;
	}

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		List<Integer> sorted = new ArrayList<>(input);
        Collections.sort(sorted);
        StringBuilder sb = new StringBuilder();
        int start = sorted.get(0);
        int end = start;
        for (int i = 1; i < sorted.size(); i++) {
            int num = sorted.get(i);
            if (num == end + 1) {
                end = num;
            } else {
                if (start == end) {
                    sb.append(start).append(", ");
                } else {
                    sb.append(start).append("-").append(end).append(", ");
                }
                start = num;
                end = num;
            }
        }
        if (start == end) {
            sb.append(start);
        } else {
            sb.append(start).append("-").append(end);
        }
        return sb.toString();
        }
	}
