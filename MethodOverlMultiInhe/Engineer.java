package MethodOverlMultiInhe;
public class Engineer extends Human {
    private String engineerType;

    public String getEngineerType() {
        return engineerType;
    }
    public void setEngineerType(String engineerType) {
        this.engineerType = engineerType;
    }
    @Override
    public String toString() {
        return "Engineer{" +
                "\n engineerType='" + engineerType + '\'' +
                "\n name=" + getName() +
                "\n age=" +getAge() +
                "\n location=" +getLocation() +
                "\n experience=" +getExperience() +
                '}';

    }


    }


