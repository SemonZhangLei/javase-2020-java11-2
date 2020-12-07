package lesson16;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// 使用Set集合，生成1-25之内不重复的7个随机整数
		//Set集合 无序 不重复
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
