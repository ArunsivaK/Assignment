package AccessModifier;

public class AccessMain {
    public static void main(String[] args) {
        AccessMain am=new AccessMain();
        am.privatemethod();
        am.publicmethod();
        am.defaultmethod();
    }
        private void privatemethod () {
            System.out.println("Private Modifier is accessible within class");
        }
        public void publicmethod () {
            System.out.println("Public Modifier is accessible in everywhere");
        }
        protected void protectedmethod () {
            System.out.println("protected modifier is within the package and outside the package through child class.");
        }
        void defaultmethod(){
            System.out.println("Default modifier is accessible only within package");
        }
}

