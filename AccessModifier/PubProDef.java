package AccessModifier;

public class PubProDef {
    public static void main(String[] args) {
        AccessMain am=new AccessMain();
        am.protectedmethod();
        am.publicmethod();
        am.defaultmethod();

    }
}
