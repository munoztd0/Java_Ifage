public class Personne {

    public String nom;
    public String prenom;
    public void marcher(){
        System.out.println(" avance !");
    }

   @Override
    public String toString(){
       return prenom + " " + nom;
    }

}

