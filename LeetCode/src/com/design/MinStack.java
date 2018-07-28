package com.design;

import java.util.*;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 */
public class MinStack {
    private LinkedList<Integer>linkedList;
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        linkedList=new LinkedList<>();
    }

    public void push(int x) {
        linkedList.push(x);

    }

    public void pop() {
         linkedList.pop();
    }

    public int top() {
        return linkedList.getFirst();
    }

    public int getMin() {
        int min=linkedList.get(0);
        for (Integer a:linkedList) {
            min=a>min?min:a;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
