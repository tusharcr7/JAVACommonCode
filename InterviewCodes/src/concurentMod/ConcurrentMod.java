package concurentMod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentMod {

	public static void main(String[] args) {
		/**
		 * Fail Fast Iterator ArrayList,hashSet,hashMAp
		 * 
		 * 
		 * 
		 * Output: 1 Exception in thread "main"
		 * java.util.ConcurrentModificationException at
		 * java.util.ArrayList$Itr.checkForComodification(Unknown Source) at
		 * java.util.ArrayList$Itr.next(Unknown Source) at
		 * concurentMod.ConcurrentMod.main(ConcurrentMod.java:23)
		 */

		List<String> obj = Arrays.asList("1", "45", "78", "54", "90", "4353", "6767");
		ArrayList<String> objk = new ArrayList<String>(obj);
		Iterator<String> objs = objk.iterator();
		while (objs.hasNext()) {

			System.out.println(objs.next());
			/* objk.add("dsds"); */
		}

		/**
		 * Fail Safe Iterator CopyOnWriteArayList,ConcurrentHAshMap
		 * 
		 * dsds ius not added in iterator as Fail Safe creates a copy of DS So any
		 * modification on original Ds will not be reflected on Iterator copy
		 * 
		 * Output: 1 45 78 54 90 4353 6767
		 */

		List<String> obj1 = Arrays.asList("1", "45", "78", "54", "90", "4353", "6767");
		CopyOnWriteArrayList<String> objkl = new CopyOnWriteArrayList<String>(obj);
		Iterator<String> objss = objk.iterator();
		while (objss.hasNext()) {

			System.out.println(objss.next());
			objkl.add("dsds");
		}

		ConcurrentHashMap<Integer, Integer> objCHM = new ConcurrentHashMap<Integer, Integer>();
		objCHM.put(1, 1);
		objCHM.put(2, 6);
		objCHM.put(3, 5);
		objCHM.put(4, 4);
		objCHM.put(5, 3);
		objCHM.put(6, 2);

		Iterator<Integer> i = objCHM.keySet().iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
			objCHM.put(1212, 1233);

		}

	}

}
