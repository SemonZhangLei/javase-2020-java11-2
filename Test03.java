package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 从控制台得到一组整数，按照升序打印
		List list=new ArrayList();
		 List list2=new ArrayList(list.size());
		 list2.add("aa");
         list2.add("hello");
         
         Scanner  sc=new Scanner(System.in);
         while(true){
            System.out.println("请输入数,-1停止输入");
            int x=sc.nextInt();
            if(x==-1){
            	break;
            }else{
            	list.add(x);  
            	list2.add(x*100);
            }
         }
         //排序
         Collections.sort(list);
         //反转
         Collections.reverse(list);
         //打印
       /*  for (Object object : list) {
			System.out.println(object);
		}
       */
         
        //将集合list复制到list2中
        Collections.copy(list2, list);
        for (Object object : list2) {
			System.err.println(object);
		}
         
	}

}
