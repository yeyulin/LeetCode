package com.string;

/**
 * @Function 数数并说
 * @author yeyulin
 * @data 2018/06/19
 *
 */
public class Eight {
	public String countAndSay(int n) {
		//当是 1 的时候，则直接返回 1
        if(n == 1){
            return "1";
        }
        //为了str末尾的标记，方便后面循环读数
        String str = countAndSay(n-1) + "*";
        //转化成char数组
        char[] c = str.toCharArray();
        int count = 1;
        StringBuilder builder=new StringBuilder();
        for(int i = 0; i < c.length - 1;i++){
          //上面的*标记这里方便统一处理（最后一个不用特殊处理了）
            if(c[i] == c[i+1]){
            //计数增加，算重复
                count++;
            }else{
               //添加字符串并把count置1
                //s = s + count + c[i];
                builder.append(count).append(c[i]);
                count = 1;//初始化
            }
        }
        return builder.toString();
	}
	public static void main(String[] args) {
		Eight eight=new Eight();
		String countAndSay = eight.countAndSay(4);
		System.out.println(countAndSay);
	}
}
