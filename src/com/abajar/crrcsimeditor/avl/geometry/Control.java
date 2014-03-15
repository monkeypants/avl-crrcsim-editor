/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abajar.crrcsimeditor.avl.geometry;

import javax.xml.bind.annotation.XmlElementWrapper;
import com.abajar.crrcsimeditor.avl.mass.MassObject;
import com.abajar.crrcsimeditor.avl.AVLSerializable;
import java.io.OutputStream;
import java.io.PrintStream;
import static com.abajar.crrcsimeditor.avl.AVLGeometry.formatFloat;

/**
 *
 * @author hfreire
 */
public class Control extends MassObject implements AVLSerializable {
    public static final int AILERON = 0;
    public static final int ELEVATOR = 1;
    public static final int RUDDER = 2;

    private String name;
    private float gain;
    private float Xhinge;
    private float Xhvec;
    private float Yhvec;
    private float Zhvec;
    private float SgnDup;
    private int type;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gain
     */
    public float getGain() {
        return gain;
    }

    /**
     * @param gain the gain to set
     */
    public void setGain(float gain) {
        this.gain = gain;
    }

    /**
     * @return the Xhinge
     */
    public float getXhinge() {
        return Xhinge;
    }

    /**
     * @param Xhinge the Xhinge to set
     */
    public void setXhinge(float Xhinge) {
        this.Xhinge = Xhinge;
    }

    /**
     * @return the SgnDup
     */
    public float getSgnDup() {
        return SgnDup;
    }

    /**
     * @param SgnDup the SgnDup to set
     */
    public void setSgnDup(float SgnDup) {
        this.SgnDup = SgnDup;
    }

    @Override
    public void writeAVLData(OutputStream out) {
        PrintStream ps = new PrintStream(out);
        ps.print("CONTROL\n");                                                          //        CONTROL                              | (keyword)
        ps.printf(locale, "#name,     gain,    Xhinge,  XYZhvec, SgnDup\n%1$-10s " + formatFloat(6, 2)  + "\n",
                this.getName(), this.getGain(), this.getXhinge(),
                this.getXhvec(), this.getYhvec(),
                this.getZhvec(), this.getSgnDup()) ;                                                                   //elevator  1.0  0.6   0. 1. 0.   1.0  | name, gain,  Xhinge,  XYZhvec,  SgnDup
    }

    @Override
    public String toString() {
        return this.getName();
    }

    /**
     * @return the Xhvec
     */
    public float getXhvec() {
        return Xhvec;
    }

    /**
     * @param Xhvec the Xhvec to set
     */
    public void setXhvec(float Xhvec) {
        this.Xhvec = Xhvec;
    }

    /**
     * @return the Yhvec
     */
    public float getYhvec() {
        return Yhvec;
    }

    /**
     * @param Yhvec the Yhvec to set
     */
    public void setYhvec(float Yhvec) {
        this.Yhvec = Yhvec;
    }

    /**
     * @return the Zhvec
     */
    public float getZhvec() {
        return Zhvec;
    }

    /**
     * @param Zhvec the Zhvec to set
     */
    public void setZhvec(float Zhvec) {
        this.Zhvec = Zhvec;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }


}
