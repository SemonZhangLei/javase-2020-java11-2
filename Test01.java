package lesson16;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// ʹ��Set���ϣ�����1-25֮�ڲ��ظ���7���������
		//Set���� ���� ���ظ�
        Collection con=new HashSet();
     /*   while(true){
        	int x=(int)Math.ceil(Math.random()*25);  // 1-25    0-1   0-25
        	con.add(x);
        	
        	if(con.size()==7){
        		break;
        	}
        }*/
        for(;con.size()<7;){
        	int x=(int)Math.ceil(Math.random()*25);  // 1-25    0-1   0-25
        	con.add(x);
        }
        
        for (Object object : con) {
			System.out.println(object);
		}
        

	}

}
