/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author ntpsm
 */
public class Senior implements PropertyChangeListener {
    

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("(Senior) headquater is updateed to " + 
                evt.getNewValue());
    }
}
