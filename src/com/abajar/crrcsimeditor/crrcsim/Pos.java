/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abajar.crrcsimeditor.crrcsim;

import com.abajar.crrcsimeditor.view.annotations.CRRCSimEditorField;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Hugo
 */
public class Pos implements Serializable{

    @Override
    public String toString() {
        return "Position";
    }

    @CRRCSimEditorField(text="X",
        help="X position\r\n"
    )
    private float x;

    @CRRCSimEditorField(text="Y",
        help="Y position\r\n"
    )
    private float y;

    @CRRCSimEditorField(text="Z",
        help="Z position\r\n"
    )
    private float z;

    /**
     * @return the x
     */
    @XmlAttribute
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    @XmlAttribute
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    @XmlAttribute
    public float getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(float z) {
        this.z = z;
    }
}
