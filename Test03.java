package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// �ӿ���̨�õ�һ�����������������ӡ
		List list=new ArrayList();
		 List list2=new ArrayList(list.size());
		 list2.add("aa");
         list2.add("hello");
         
         Scanner  sc=new Scanner(System.in);
         while(true){
            System.out.println("��������,-1ֹͣ����");
            int x=sc.nextInt();
            if(x==-1){
            	break;
            }else{
            	list.add(x);  
            	list2.add(x*100);
            }
         }
         //����
         Collections.sort(list);
         //��ת
         Collections.reverse(list);
         //��ӡ
       /*  for (Object object : list) {
			System.out.println(object);
		}
       */
         
        //������list���Ƶ�list2��
        Collections.copy(list2, list);
        for (Object object : list2) {
			System.err.println(object);
		}
         
	}

}
