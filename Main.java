import java.util.Collection;

import numberrangesummarizer.MyNumberRangeSummarizer;
import numberrangesummarizer.NumberRangeSummarizer;

public class Main {

	public static void main(String[] args) {
		NumberRangeSummarizer summarizer = new MyNumberRangeSummarizer();
	    Collection<Integer> nums = summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
	    String summary = summarizer.summarizeCollection(nums);
	    System.out.println(summary);
	}

}
