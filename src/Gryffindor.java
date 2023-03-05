public class Gryffindor extends Hogwarts{
    private int generosity;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int wizardSkills, int transgressionSkills, int generosity, int honor, int bravery){
        super(fullName,wizardSkills, transgressionSkills);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getGenerosity() {
        return generosity;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void printStudent(){
        System.out.println(
                "Fullname: " + getFullName() +
                ", wizard skills: "+ getWizardSkills() +
                ", transgression skills: " + getTransgressionSkills() +
                ", generosity: " + generosity +
                ", honor: " + honor +
                ", bravery: " + bravery);
    }

    @Override
    public int sumPersonalAttributes() {
        return generosity + honor + bravery;
    }
}
