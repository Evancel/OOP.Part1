public abstract class Hogwarts {
    private String fullName;
    private int wizardSkills;
    private int transgressionSkills;

    public Hogwarts(String fullName, int wizardSkills, int transgressionSkills){
        this.fullName = fullName;
        this.wizardSkills = wizardSkills;
        this.transgressionSkills = transgressionSkills;
    }

    public String getFullName() {
        return fullName;
    }

    public int getWizardSkills() {
        return wizardSkills;
    }

    public int getTransgressionSkills() {
        return transgressionSkills;
    }

    public abstract void printStudent();

    public int sumPointsOfStudent(){
        int sumPoints = this.getWizardSkills() +
                this.getTransgressionSkills();
        return sumPoints;
    }

    public void compareStudents(Hogwarts hogwarts){
        if (this.sumPointsOfStudent() > hogwarts.sumPointsOfStudent()){
            System.out.println(this.getFullName() + " лучший студент, чем " + hogwarts.getFullName());
        } else if (this.sumPointsOfStudent() < hogwarts.sumPointsOfStudent()){
            System.out.println(hogwarts.getFullName() + " лучший студент, чем " + this.getFullName());
        } else if (this.sumPointsOfStudent() == hogwarts.sumPointsOfStudent()){
            System.out.println(this.getFullName() + " и " + hogwarts.getFullName() + "равные студенты.");
        }
    }
}
