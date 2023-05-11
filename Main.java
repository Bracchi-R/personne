import outils.Personne;

public class Main {
    public static void main(String[] args) {
        /*
        Lorsqu'on déclare une variable de type objet, on dit que l'on fait une INSTANCIATION.
        Un objet est une INSTANCE d'une classe.
         */
        Personne p = new Personne("Onyme", "Anne", 50);
        // p.prenom = "Anne";
        // p.nom = "Onyme";
        // p.age = 50;

        System.out.println("Nom : " + p.getNom());
        System.out.println("Prenom : " + p.getPrenom());
        System.out.println("Age : " + p.getAge());
        System.out.println(p.identite());

        Personne p1 = new Personne();
        p1.setPrenom("Jean");
        p1.setNom("Cérien");
        p1.setAge(25);

        System.out.println("Identité de p1 est : " + p1.identite());

        /* 
         * EXERCICES : 
         * 1. Déclarer un tableau d'objets Personne.
         * 2. Remplir le tableau avec les données utilisées dans exempleArray.java (cf. ci-dessous)
         * 3. Affichez toutes les identités des personnes (en utilisant la méthode identite()).
         * 4. ajoutez un constructeur qui permet d'instancier 
         *      une personne en définissant directement son prénom, 
         *      son nom et son âge. (Cherchez sur internet ce qu'est un constructeur
         		et comment le déclarer)
         */
        // String[][] personnes = new String[10][3];
        // personnes[0] = new String[] { "Menfin", "Gérad", "35" };
        // personnes[1] = new String[] { "Ateur", "Nordine", "20" };
        // personnes[2] = new String[] { "Onyme", "Anne", "50" };
        // personnes[3] = new String[] { "Mentor", "Gérard", "61" };
        // personnes[4] = new String[] { "Neymar", "Jean", "15" };
        // personnes[5] = new String[] { "Cérien", "Jean", "42" };
        // personnes[6] = new String[] { "Mal", "Roger", "70" };
        // personnes[7] = new String[] { "Kiafessa", "Estelle", "22" };
        // personnes[8] = new String[] { "Salah", "Mo", "30" };
        // personnes[9] = new String[] { "Bar", "Laurent", "47" };
        
        Personne[] array = new Personne[10];
        
        array[0] = new Personne();
        array[0].setNom("Menfin");
        array[0].setPrenom("Gérad");
        array[0].setAge(35);

        array[1] = new Personne();
        array[1].setNom("Ateur");
        array[1].setPrenom("Nordine"); 
        array[1].setAge(35);

        array[2] = new Personne();
        array[2].setNom("Onyme");
        array[2].setPrenom("Anne");    
        array[2].setAge(50);

        array[3] = new Personne();
        array[3].setNom("Mentor");
        array[3].setPrenom("Gérard");
        array[3].setAge(61);

        array[4] = new Personne();
        array[4].setNom("Neymar");
        array[4].setPrenom("Jean");
        array[4].setAge(15);

        array[5] = new Personne();
        array[5].setNom("Cérien");
        array[5].setPrenom("Jean");
        array[5].setAge(42);

        array[6] = new Personne();
        array[6].setNom("Mal");
        array[6].setPrenom("Roger");
        array[6].setAge(70);

        array[7] = new Personne();
        array[7].setNom("Kiafessa");
        array[7].setPrenom("Estelle");
        array[7].setAge(22);

        array[8] = new Personne();
        array[8].setNom("Salah");
        array[8].setPrenom("Mo");
        array[8].setAge(30);

        array[9] = new Personne();
        array[9].setNom("Bar");
        array[9].setPrenom("Laurent");
        array[9].setAge(47);
        
        for (Personne personne : array) {
            System.out.println(personne.identite() + ", " + personne.getAge());
        }
        /*
        NULL est un type de donnes particulier (qu'on peut considérer comme une valeur particuliere).
        Une variable de type objet qui n'a pas ete initialisée est consideré comme etant NULL.
         */

        
       








        

        
    }   
}
