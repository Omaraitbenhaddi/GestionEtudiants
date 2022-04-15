import java.util.ArrayList;

public class ListeEtudiant extends ArrayList<Etudiant>{
    @Override
    public boolean add(Etudiant e) {
        if(this.contains(e)){
            this.get(this.indexOf(e)).nom=e.nom;
            this.get(this.indexOf(e)).note=e.note;
        }
        return super.add(e);
    }
    
}
