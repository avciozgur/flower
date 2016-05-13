package org.avci.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlowerUtil {

	public static <E> List<E> makeList(Iterable<E> iter) {
	    List<E> list = new ArrayList<E>();
	    for (E item : iter) {
	        list.add(item);
	    }
	    return list;
	}
}
