/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.zg.dd.helper;

import java.util.ArrayDeque;

/**
 *
 * @author ddukic
 */
public class DStack<T> implements DIStack<T>{
    
    private final ArrayDeque<T> dek = new ArrayDeque<T>();

    @Override
    public void push(T object) {        
        dek.push(object);
    }

    @Override
    public T pop() {
       return dek.pop();
    }

    @Override
    public T peek() {
        return dek.peek();
    }
    
}
