package com.practice.test;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashSet;
import java.util.Set;
import com.practice.onlineQuiz.DuplicateList;;

public class DuplicateListTest {

	public static void main(String[] args) {
		CopyOnWriteArrayList<DuplicateList> list = new CopyOnWriteArrayList<DuplicateList>();

		DuplicateList object1 = new DuplicateList();
		object1.setAge("OLD");
		object1.setName("push");
		object1.setBalance(10);
		DuplicateList object2 = new DuplicateList();
		object2.setAge("YOUNG");
		object2.setName("push");
		object2.setBalance(20);
		DuplicateList object3 = new DuplicateList();
		object3.setAge("OLD");
		object3.setName("nik");
		object3.setBalance(30);

		list.add(object1);
		list.add(object2);
		list.add(object3);

		ArrayList<DuplicateList> tempList = new ArrayList<>(list);
		Set<DuplicateList> set = new HashSet<>();

		for (DuplicateList addset : list) {
			set.add(addset);

		}

		ArrayList<DuplicateList> result = new ArrayList<>();
		for (DuplicateList listObj : set) {
			int i = 0;
			System.out.println(set.size());
			for (DuplicateList tempListObj : tempList) {
				if (listObj.equals(tempListObj)) {
					if (i == 0) {
						listObj.setBalance(100);
						result.add(listObj);
						tempListObj.setBalance(100);
						result.add(tempListObj);
						// System.out.println(result);
						// System.out.println("equal");
					} else {
						tempListObj.setBalance(100);
						result.add(tempListObj);
						// System.out.println(result);
						// System.out.println("equal");
					}
					i++;

				}
			}
		}

		for (DuplicateList ls : result) {
			System.out.println(ls.getBalance());
		}
	}

}
