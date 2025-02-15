import java.util.Arrays;

public class Family {
    private final Human mother;
    private final Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("Loading class: Family");
    }

    {
        System.out.println("Creating new Family object");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        mother.setFamily(this);
        father.setFamily(this);
    }

    public void addChild(Human child) {
        Human[] temp = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) temp[i] = children[i];
        temp[children.length] = child;
        children = temp;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        if (this.pet == null) return 2 + children.length;
        return 3 + children.length;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null) return false;
        Family fam = (Family) obj;
        return this.mother.equals(fam.mother) && this.father.equals(fam.father) && Arrays.equals(children, fam.children);
    }
    @Override
    public String toString() {
        return "Family{mother=" + mother + ", father=" + father + ", children=" + Arrays.toString(children) + ", pet=" + pet + "}";
    }
}