package main.beans;

public class SubmarineBean {
    private String name;
    private int depth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDepth() {
        return depth;
    }
    public void dive(){
        depth -= 50;
    }
    public void rise(){
        depth += 50;
        if (depth>=0) {
            depth =0;
        }
    }

    public static void main(String[] args) {
        SubmarineBean sousmarin = new SubmarineBean();
        sousmarin.name = "Squall";
        sousmarin.dive();
        sousmarin.dive();
        sousmarin.rise();
        sousmarin.rise();
        sousmarin.rise();
        System.out.println(sousmarin.getName()+" "+sousmarin.getDepth());
    }

}
