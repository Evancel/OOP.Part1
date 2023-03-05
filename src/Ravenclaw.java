public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int wizardSkills, int transgressionSkills, int intelligence, int wisdom, int wit, int creativity) {
        super(fullName, wizardSkills, transgressionSkills);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public void printStudent(){
        System.out.println(
                "Fullname: " + getFullName() +
                        ", wizard skills: "+ getWizardSkills() +
                        ", transgression skills: " + getTransgressionSkills() +
                        ", intelligence: " + intelligence +
                        ", wisdom: " + wisdom +
                        ", wit: " + wit +
                        ", creativity: " + creativity);
    }

    public int sumPointsOfRavenclaw(){
        int sumPoints = this.getWizardSkills() +
                this.getTransgressionSkills() +
                this.getIntelligence() +
                this.getWisdom() +
                this.getWit() +
                this.getCreativity();
        return sumPoints;
    }

    public void compareRavenclaws(Ravenclaw ravenclaw){
        if (this.sumPointsOfRavenclaw() > ravenclaw.sumPointsOfRavenclaw()){
            System.out.println(this.getFullName() + " лучший равенкловец, чем " + ravenclaw.getFullName());
        } else if (this.sumPointsOfRavenclaw() < ravenclaw.sumPointsOfRavenclaw()){
            System.out.println(ravenclaw.getFullName() + " лучший равенкловец, чем " + this.getFullName());
        } else if (this.sumPointsOfRavenclaw() == ravenclaw.sumPointsOfRavenclaw()){
            System.out.println(this.getFullName() + " и " + ravenclaw.getFullName() + "равные равенкловцы.");
        }
    }
}
