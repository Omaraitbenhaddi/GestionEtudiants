public class Etudiant implements Comparable<Etudiant>{
    int id;
    String nom;
    double note;
    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.note=10.0;
    }
    @Override
    public String toString() {
        return "(" + nom + " : " + note + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Etudiant)) return false;
        return ((Etudiant)obj).id==id;
    }
    @Override
    public int compareTo(Etudiant e) {
        if(e.note==note) return 0;
        if(e.note>note) return 1;
        return -1;

    }
}