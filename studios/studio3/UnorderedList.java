package studio3;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public List<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		//
		if(list.size()==0) {
			return true;
		}else {
			return false;
		}
		//
		//return list.isEmpty();
	}

	@Override
	public void insert(T thing) {
		//
		list.add(thing);
		//
	}

	@Override
	public T extractMin() {
	//	if(!this.isEmpty()) {
			T min=list.get(0);
			int index=0;
			for(int i=0;i<list.size();i++) {
				if(min.compareTo(list.get(i))>0) {
					min=list.get(i);
					index=i;
				}
			}
			list.remove(index);
			return min;	
		}
//		else {
//			return null;
//		}
//	}

}
