public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindorStudents = {
                new Gryffindor("Harry Potter", 70, 55, 80, 85, 95),
                new Gryffindor("Hermione Granger", 80, 70, 60, 90, 70),
                new Gryffindor("Ron Weasley", 60, 45, 90, 80, 80),
       };

        Slytherin[] slytherinStudents = {
                new Slytherin("Draco Malfoy",75,80,80,70,60,85,99),
                new Slytherin("Grachem Montegu",40,30,55,40,30,20,50),
                new Slytherin("Gregory Goil",30,30,30,40,40,45,40)
        };

        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Zaharia Smith",60,50,80,80,75),
                new Hufflepuff("Segrik Diggory",80,70,60,50,60),
                new Hufflepuff("Jastin Finch-Fletchi",65,65,90,80,80)
        };

        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Chjou Chang",80,80,80,80,90,80),
                new Ravenclaw("Padma Patil",65,55,60,70,40,55),
                new Ravenclaw("Markus Belbi",75,60,75,75,60,60)
        };

        gryffindorStudents[1].printStudent();
        slytherinStudents[0].printStudent();
        ravenclawStudents[2].printStudent();
        hufflepuffStudents[1].printStudent();

        System.out.println();

        gryffindorStudents[0].comparePersonalAttributes(gryffindorStudents[1]);
        gryffindorStudents[1].comparePersonalAttributes(gryffindorStudents[2]);
        slytherinStudents[1].comparePersonalAttributes(slytherinStudents[2]);
        ravenclawStudents[2].comparePersonalAttributes(ravenclawStudents[1]);
        hufflepuffStudents[1].comparePersonalAttributes(hufflepuffStudents[0]);
        gryffindorStudents[1].compareBasicAttributes(slytherinStudents[0]);
    }
}