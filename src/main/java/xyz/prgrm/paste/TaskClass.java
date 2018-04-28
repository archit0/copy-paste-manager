package xyz.prgrm.paste;

public abstract class TaskClass {
    public abstract void run();
    public void startThread(){
        this.run();
    }
}
