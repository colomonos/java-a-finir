import java.util.List;
import java.util.ArrayList;


public class CaseIntelligente extends Case {


    private List<Case> lesVoisine;
//private Plateau lesPlateau;
    
public CaseIntelligente(){

}

public void ajouteVoisine(Case uneCase ){
    this.lesVoisine.add(uneCase);

}

public int nombreBombesVoisines(){
    int bombe = 0;
    for (Case voisine :lesVoisine){
        if (voisine.contientUneBombe()==true) {
            bombe = bombe +1;
        }
    }
    return bombe;
}



@Override
public String toString(){
    if (estDecouverte()==true) {
        if (contientUneBombe()==true) {
                return "@";
            }

        }
        elif(estMarquee()==true){
            return "?" ;
        }
return " " ; 

}


}
