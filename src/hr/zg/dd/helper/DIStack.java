/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.zg.dd.helper;

/**
 *
 * @author ddukic
 */
public interface DIStack<T>{
    void push(T object);
    T pop();
    T peek();
}
