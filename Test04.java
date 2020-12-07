package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04 {

	public static void main(String[] args) {
		// 在一个列表中存储以下元素：apple,grape,banana,pear
		//3.1 返回集合中的最大的和最小的元素
		//3.2 将集合进行排序，并将排序后的结果打印在控制台上 [必做题]
      
		List list=new ArrayList();
		list.add("apple");
		list.add("applea");
		list.add("appleb");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		
		Object obj=Collections.max(list);
		Object obj2=Collections.min(list);
		System.out.println("最大元素是"+obj);
		System.out.println("最小元素"+obj2);
		
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
		}
		
      //控制台输入学生姓名，年龄，成绩，将学生存放在集合中
		//1.遍历集合 显示学生的姓名年龄成绩的信息
		//2.按照成绩排序，打印出学生姓名和成绩（降序）
		//3.求出班级平均分，最高分，最低分
	}

}
