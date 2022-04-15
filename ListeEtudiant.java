import java.util.ArrayList;
import java.util.List;

public class ListeEtudiant extends ArrayList<Etudiant>{
    @Override
    public boolean add(Etudiant e) {
        if(this.contains(e)) this.set(this.indexOf(e),e);
        return super.add(e);
    }
    public List<Etudiant> filtrer(Condition c){
        List<Etudiant> l = new ListeEtudiant();
        for(Etudiant elem:this){
            if(c.estVrai(elem)){
                l.add(elem);
            }

        }
        return l;
    }
    
    
}
