import java.util.ArrayList;

public class ListeEtudiant extends ArrayList<Etudiant>{
    @Override
    public boolean add(Etudiant e) {
        if(this.contains(e)) this.set(this.indexOf(e),e);
        return super.add(e);
    }
    
    
}
