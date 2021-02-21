package org.example;

public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Model ...");
    }

}
