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

    public int sumPointsOfHufflepuff(){
        int sumPoints = this.getWizardSkills() +
                this.getTransgressionSkills() +
                this.getIndustriousness() +
                this.getLoyalty() +
                this.getHonesty();
        return sumPoints;
    }

    public void compareHufflepuffs(Hufflepuff hufflepuff){
        if (this.sumPointsOfHufflepuff() > hufflepuff.sumPointsOfHufflepuff()){
            System.out.println(this.getFullName() + " лучший хаффлпафец, чем " + hufflepuff.getFullName());
        } else if (this.sumPointsOfHufflepuff() < hufflepuff.sumPointsOfHufflepuff()){
            System.out.println(hufflepuff.getFullName() + " лучший хаффлпафец, чем " + this.getFullName());
        } else if (this.sumPointsOfHufflepuff() == hufflepuff.sumPointsOfHufflepuff()){
            System.out.println(this.getFullName() + " и " + hufflepuff.getFullName() + "равные хаффлпафцы.");
        }
    }
}
