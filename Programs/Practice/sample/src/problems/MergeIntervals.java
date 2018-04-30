package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public List<Interval> mergeOverlappingIntervals(List<Interval> intervals){
		int n = intervals.size();
		
		int start[] = new int[n];
		int end[] = new int[n];
		for(int i=0;i<n;i++){
			
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		
		List<Interval> res = new ArrayList<Interval>();
		int j=0;
		for(int i=0;i<n;i++){
			if(i == n-1 || start[i+1] > end[i]){
				res.add(new Interval(start[j],end[i]));
				j=i+1;
			}
		}
		
		return res;
	}
	
	
	public static void main(String args[]){
		MergeIntervals m = new MergeIntervals();
		List<Interval> intervals = new ArrayList<Interval>();
		
		/*intervals.add(new Interval(1,3));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(15,18));*/
		
		intervals.add(new Interval(6,8));
		intervals.add(new Interval(1,9));
		intervals.add(new Interval(2,4));
		intervals.add(new Interval(4,7));
		List<Interval> res  = m.mergeOverlappingIntervals(intervals);
		for(int i=0;i<res.size();i++){
		System.out.println("Start =" + res.get(i).start + " " + "End = "+res.get(i).end);
		}

		
	}
}
