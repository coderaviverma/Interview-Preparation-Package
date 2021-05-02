package language.java.corebasic.designpatterns.observer;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}