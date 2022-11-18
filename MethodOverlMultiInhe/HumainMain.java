package MethodOverlMultiInhe;

public class HumainMain {
    public static void main(String[] args) {
        Doctors dr = new Doctors();
        dr.setName("Arun");
        dr.setAge(30);
        dr.setNoOfSurgery(43);
        dr.setExperience(18);
        dr.setLocation("Anna Nagar");
        System.out.println(dr);
        System.out.println("-------------------------------------");

        Engineer er=new Engineer();
        er.setName("Siva");
        er.setAge(23);
        er.setEngineerType("Software Engineer");
        er.setExperience(1);
        er.setLocation("Taramani");
        System.out.println(er);
    }
}
