import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("Family class is loaded.");
    }
    {
        System.out.println("A new Family object is created.");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = null;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Family(Human mother, Human father, Pet pet) {
        this(mother, father);
        this.pet = pet;
    }

    public Human getMother() { return mother; }
    public Human getFather() { return father; }
    public Human[] getChildren() { return children; }
    public Pet getPet() { return pet; }

    public void setMother(Human mother) { this.mother = mother; }
    public void setFather(Human father) { this.father = father; }
    public void setChildren(Human[] children) { this.children = children; }
    public void setPet(Pet pet) { this.pet = pet; }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(Human human) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(human)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        return deleteChild(index);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        children[index].setFamily(null);
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) newChildren[j++] = children[i];
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return children.length + 2 + (pet != null ? 1 : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family object is being garbage collected: " + this);
    }
}
