/*
Le namespace pour une classe est l'equivalent du chemin du dossier du chemin du dossier pour un fichier.
En JAVA, on utilise le mot package. Le package
 */
package outils;

public class Personne {
    /*
    Les propriété (ou attributs) définits dans une classe correspondent aux caractéristiques des objets qui vont etre créés a partir de
     */
    private String prenom;
    private String nom;
    private int age;

    /*
    CONSTRUCTEUR
    Un constructeur est une methode qui est exécuter quand un objet est instancié.
    Toute les classes ont un construcyeur par defaut dans Java. Ce constructeur a le MEME nom de la classe. 
    Exemple : Personne p = new Personne();

    On peut definir un nouveau constructeur.
    Un constructeur ne DOIT PAS retourner une valeur. Donc il n'y a pas de type avant le nom de la méthode lors de la déclaration.
    En general, les constructeurs sont utilisés pour initiliser la valeur des propriétés de l'objet. 
     */
    public Personne(String name, String firstname, int old){
        nom = name;
        prenom = firstname;
        age = old;
    }

    /*
    Quand on definit un constructeur, le constructeur par defaut n'est plus accessible.
    Si on veut l'utiliser a nouveau, il faut declarer un constructeur sans argument.
    NB : on peut laisser les () vides si aucune instruction ne doit etre exécutée.
    PS : on peut déclarer autant de constructeur que l'on veut
     */
    public Personne(){};

    public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    /*
    Une fontion dans une classe appelée une METHODE
     */
    public String identite(){
        return this.prenom + ", " + this.nom;
    }

    public String identite(boolean vrai){
        return this.prenom + ", " + this.nom + ", " + this.age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public static void test(){
        System.out.println("Methode statique test de la classe Personne");
    }
}