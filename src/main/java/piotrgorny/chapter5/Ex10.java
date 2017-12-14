package piotrgorny.chapter5;

public class Ex10 {
    private String gear;

    public Ex10(String gear) {
        this.go(gear);
    }

    private void go(String gear){
        this.gear = gear;
    }

    protected void finalize() {
        if(!gear.equals("Park")){
            System.out.println("Still driving!");
        }
    }
}
