public class Cow extends Animal {
    public Cow(String say, int teeth, int leg) {
        setTeeth(teeth);
        setSay(say);
        setLeg(leg);;
    }

    public String getSay() {
        String say = super.getSay();
        return say + "ZXCSSSWW";
    }

    public int getLeg() {
        int leg = super.getLeg();
        return leg = 8;
    }

    void moo(){
        System.out.println(getSay()+ " say " + getTeeth() + " teeth " + getLeg() + " legs ");
    }
}
