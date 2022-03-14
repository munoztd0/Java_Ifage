public class HelloWorld{

    public static void main(String[] args){
        System.out.println("Hello World");
        for (String s: args) {
            System.out.println("Param: " + s);
        }

        Employe john = new Employe();


        john.nom = "Dupont";
        john.prenom = "John";
        john.titre = "Directeur";
        System.out.print(john);
        john.marcher();

        Stagiaire bob = new Stagiaire();

        bob.nom = "Alice";
        bob.prenom = "Bob";
        bob.dateDebut = "11mars";
        System.out.print(bob);
        bob.marcher();

    }
}