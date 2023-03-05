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

    public int sumBasicAttributes(){
        int sumPoints = this.getWizardSkills() +
                this.getTransgressionSkills();
        return sumPoints;
    }

    public void compareBasicAttributes(Hogwarts hogwarts){
        if (this.sumBasicAttributes() > hogwarts.sumBasicAttributes()){
            System.out.println(this.getFullName() + " лучший студент, чем " + hogwarts.getFullName());
        } else if (this.sumBasicAttributes() < hogwarts.sumBasicAttributes()){
            System.out.println(hogwarts.getFullName() + " лучший студент, чем " + this.getFullName());
        } else if (this.sumBasicAttributes() == hogwarts.sumBasicAttributes()){
            System.out.println(this.getFullName() + " и " + hogwarts.getFullName() + "равные студенты.");
        }
    }

    public abstract int sumPersonalAttributes();

    public void comparePersonalAttributes(Hogwarts hogwarts){
        if (this.sumPersonalAttributes() > hogwarts.sumPersonalAttributes()){
            System.out.println(this.getFullName() + " лучший гриффиндорец, чем " + hogwarts.getFullName());
        } else if (this.sumPersonalAttributes() < hogwarts.sumPersonalAttributes()){
            System.out.println(hogwarts.getFullName() + " лучший гриффиндорец, чем " + this.getFullName());
        } else if (this.sumPersonalAttributes() == hogwarts.sumPersonalAttributes()){
            System.out.println(this.getFullName() + " и " + hogwarts.getFullName() + "равные гриффиндорцы.");
        }
    }
}
