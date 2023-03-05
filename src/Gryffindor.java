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

    public int sumPointsOfGryffindor(){
        int sumPoints = this.getWizardSkills() +
                this.getTransgressionSkills() +
                this.getGenerosity() +
                this.getHonor() +
                this.getBravery();
        return sumPoints;
    }

    public void compareGryffindors(Gryffindor gryffindor){
        if (this.sumPointsOfGryffindor() > gryffindor.sumPointsOfGryffindor()){
            System.out.println(this.getFullName() + " лучший гриффиндорец, чем " + gryffindor.getFullName());
        } else if (this.sumPointsOfGryffindor() < gryffindor.sumPointsOfGryffindor()){
            System.out.println(gryffindor.getFullName() + " лучший гриффиндорец, чем " + this.getFullName());
        } else if (this.sumPointsOfGryffindor() == gryffindor.sumPointsOfGryffindor()){
            System.out.println(this.getFullName() + " и " + gryffindor.getFullName() + "равные гриффиндорцы.");
        }
    }
}
