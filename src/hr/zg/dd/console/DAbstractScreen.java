package hr.zg.dd.console;

import java.util.Stack;

public abstract class DAbstractScreen extends DAbstractComponent{

    public Stack<DAbstractWindow> windows = new Stack();
}
