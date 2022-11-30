package main.beans;
import main.beans.PlaneBean;

public class AirportBean {

    //Créer une classe AirportBean, ajouter 2 attributs place1, place2 de type PlaneBean,
    //sans accesseurs (pas de getter ou setter)
    private PlaneBean place1;
    private PlaneBean place2;

    //Ajouter une méthode main dans AirportBean
    public static void main(String[] args) {
        //créer un Aéroport
        AirportBean airportBean = new AirportBean();
        //et 2 avions nommés A1 et A2
        PlaneBean a1 = new PlaneBean();
        a1.setName("A1");
        PlaneBean a2 = new PlaneBean();
        a1.setName("A2");

        //Appeler la méthode nextFreePlace d'aéroport et garder le numéro reçu
        int pos = airportBean.nextFreePlace();
        //Appeler la méthode park avec ce numéro et le 2ᵉ avion. Afficher le résultat (normalement ok)
        System.out.println(airportBean.park(a2, pos));
        //Rappeler la méthode park avec le même numéro et le 2ᵉ avion. Afficher le résultat (normalement La place1 est occupée)
        System.out.println(airportBean.park(a2, pos));

        //Appeler la méthode nextFreePlace d'aéroport et garder le numéro
        pos = airportBean.nextFreePlace();
        //Appeler la méthode park avec ce numéro et le 1er avion. Afficher le résultat (normalement ok)
        System.out.println(airportBean.park(a1, pos));

        //Appeler la méthode state d'aéroport qui devrait normalement afficher Place1=A2 Place2=A1
        airportBean.state();
        //Appeler la méthode nextFreePlace et afficher son résultat qui devrait normalement être -1
        System.out.println(airportBean.nextFreePlace());
    }

    //Ajouter une méthode nextFreePlace retournant un entier
    public int nextFreePlace() {
        //Tester si la place1 est null et si c'est le cas retourner la valeur 1
        if (place1 == null) {
            return 1;
        }
        //Sinon faire de même avec place2 qui retourne la valeur 2
        else if (place2 == null) {
            return 2;
        }
        //Si les 2 places sont prises (non null) retourner la valeur -1
        return -1;
    }

    //Ajouter une méthode park retournant un String avec un paramètre
    //plane de type PlaneBean et un paramètre position de type int
    public String park(PlaneBean avion, int position) {
        //Si position vaut 1
        if (position == 1) {
            // et que la place1 est libre
            if (place1 == null) {
                //placer le paramètre plane dans l'attribut place1 et retourner le message ok
                place1 = avion;
                return "ok";
            } else {
                //si la place est occupée retourner le message "La place 1 est occupée"
                return "La place 1 est occupée";
            }
        }
        //Faire de même avec la place 2
        else if (position == 2) {
            if (place2 == null) {
                place2 = avion;
                return "ok";
            } else {
                return "La place 2 est occupée";
            }
        }
        //Si position est différente de 1 ou 2, retourner le message "Position incorrecte"
        else {
            return "Position incorrecte";
        }
    }

    //Ajouter une méthode state
    public void state() {
        //affiche dans la console "Place1=" et
        System.out.print("Place1=");
        if (place1 != null) {
            //soit le nom de l'avion
            System.out.println(place1.getName());
        } else {
            //soit "vide"
            System.out.println("vide");
        }

        //idem pour la place2
        System.out.print("Place2=");
        if (place2 != null) {
            System.out.println(place2.getName());
        } else {
            System.out.println("vide");
        }
    }
}


