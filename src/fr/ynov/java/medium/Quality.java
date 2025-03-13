package fr.ynov.java.medium;

public class Quality {
    private int id;
    private String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quality quality = (Quality) obj;
        return id == quality.id ;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Quality q1 = new Quality(1, "Quality1");
        Quality q2 = new Quality(1, "Quality2");

        System.out.println(q1.equals(q2));
    }
}