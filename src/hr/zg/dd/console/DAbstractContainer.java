/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.zg.dd.console;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 *
 * @author ddukic
 */
public abstract class DAbstractContainer extends DAbstractComponent {
    
    private ArrayList<DAbstractComponent> components;

    public static final String PROP_COMPONENTS = "components";

    public DAbstractContainer(DAbstractComponent parent) {
        super(parent);
    }

    /**
     * Get the value of components
     *
     * @return the value of components
     */
    public ArrayList<DAbstractComponent> getComponents() {
        return components;
    }

    /**
     * Set the value of components
     *
     * @param components new value of components
     */
    public void setComponents(ArrayList<DAbstractComponent> components) {
        ArrayList<DAbstractComponent> oldComponents = this.components;
        this.components = components;
        propertyChangeSupport.firePropertyChange(PROP_COMPONENTS, oldComponents, components);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
