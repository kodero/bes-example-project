package org.acme.hibernate.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;

import com.corvid.bes.model.AbstractModelBase;

@Entity
@Table(name = "balls")
@Filter(name = "filterByDeleted")
//@EntityCallbackClass(BallCallback.class)
public class Ball extends AbstractModelBase{

    public enum Size{SMALL,MEDIUM,LARGE}

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private Ball.Size size;

    @Column(name ="weight")
    private Double weight;

    @Column(name ="texture")
    private Double texture;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ball.Size getSize() {
        return this.size;
    }

    public void setSize(Ball.Size size) {
        this.size = size;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getTexture() {
        return this.texture;
    }

    public void setTexture(Double texture) {
        this.texture = texture;
    }
}
