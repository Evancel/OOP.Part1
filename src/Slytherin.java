public class Slytherin extends Hogwarts{
    private int cunning;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String fullName, int wizardSkills, int transgressionSkills, int cunning, int resolve, int ambition, int resourcefulness,
                     int power){
        super(fullName, wizardSkills, transgressionSkills);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void printStudent(){
        System.out.println(
                "Fullname: " + getFullName() +
                        ", wizard skills: "+ getWizardSkills() +
                        ", transgression skills: " + getTransgressionSkills() +
                        ", cunning: " + cunning +
                        ", resolve: " + resolve +
                        ", ambition: " + ambition +
                        ", resourcefulness: " + resourcefulness +
                        ", power: " + power);
    }

    @Override
    public int sumPersonalAttributes() {
        return cunning + resolve + ambition+ resourcefulness + power;
    }
}
