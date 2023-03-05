public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int wizardSkills, int transgressionSkills, int industriousness, int loyalty, int honesty) {
        super(fullName, wizardSkills, transgressionSkills);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void printStudent(){
        System.out.println(
                "Fullname: " + getFullName() +
                        ", wizard skills: "+ getWizardSkills() +
                        ", transgression skills: " + getTransgressionSkills() +
                        ", industriousness: " + industriousness +
                        ", loyalty: " + loyalty +
                        ", honesty: " + honesty);
    }

    @Override
    public int sumPersonalAttributes() {
        return industriousness + loyalty + honesty;
    }
}
