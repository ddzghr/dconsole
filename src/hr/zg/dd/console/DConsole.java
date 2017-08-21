/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.zg.dd.console;

import hr.zg.dd.helper.DStack;

/**
 *
 * @author ddukic
 */
public class DConsole {
    
    private DAbstractWindow runningWindow;
    
    private DStack<DAbstractWindow> windows = new DStack<>();
    
    public void openWindow(DAbstractWindow window){
        windows.push(window);
        runningWindow = window;
        runningWindow.start();
    }
    
    public void closeWindow(){
        DAbstractWindow windowToClose = windows.pop();
        runningWindow = windows.peek();
        windowToClose.close(); 
    }
    
    
}
