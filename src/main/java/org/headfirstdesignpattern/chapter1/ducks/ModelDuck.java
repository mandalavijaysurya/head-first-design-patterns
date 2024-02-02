package org.headfirstdesignpattern.chapter1.ducks;

import org.headfirstdesignpattern.chapter1.behaviours.fly.NoFly;
import org.headfirstdesignpattern.chapter1.behaviours.quack.Mute;
import org.headfirstdesignpattern.chapter1.behaviours.swim.NoSwim;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehaviour = new Mute();
        flyBehaviour = new NoFly();
        swimBehaviour = new NoSwim();
    }


    @Override
    public void display() {
        System.out.println("This is a Model Duck");
    }
}