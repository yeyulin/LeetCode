package com.string;

/**
 * @Function ������˵
 * @author yeyulin
 * @data 2018/06/19
 *
 */
public class Eight {
	public String countAndSay(int n) {
		//���� 1 ��ʱ����ֱ�ӷ��� 1
        if(n == 1){
            return "1";
        }
        //Ϊ��strĩβ�ı�ǣ��������ѭ������
        String str = countAndSay(n-1) + "*";
        //ת����char����
        char[] c = str.toCharArray();
        int count = 1;
        StringBuilder builder=new StringBuilder();
        for(int i = 0; i < c.length - 1;i++){
          //�����*������﷽��ͳһ�������һ���������⴦���ˣ�
            if(c[i] == c[i+1]){
            //�������ӣ����ظ�
                count++;
            }else{
               //����ַ�������count��1
                //s = s + count + c[i];
                builder.append(count).append(c[i]);
                count = 1;//��ʼ��
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
