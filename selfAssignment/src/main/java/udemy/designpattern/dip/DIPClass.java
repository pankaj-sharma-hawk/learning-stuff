package udemy.designpattern.dip;

import org.apache.commons.lang3.tuple.Triple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 01,2019
 */
public class DIPClass {
    public static void main(String[] args) {
        RelationShips relationShips = new RelationShips();
        Person parent=new Person("Dil");
        Person child1=new Person("Jeet");
        Person child2=new Person("Jassi");
        relationShips.addRelation(parent,RelationshipConstant.PARENT, child1);
        relationShips.addRelation(child2,RelationshipConstant.CHILD, parent);
        relationShips.addRelation(child1,RelationshipConstant.SIBLING,child2);

        ResearchRelationship researchRelationship = new ResearchRelationship();
        System.out.println(researchRelationship.getAllChild(relationShips,parent));
    }
}
enum RelationshipConstant{
    PARENT,
    CHILD,
    SIBLING
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class RelationShips{
    private List<Triplet<Person,RelationshipConstant,Person>> relation = new ArrayList();

    public List<Triplet<Person, RelationshipConstant, Person>> getRelation() {
        return relation;
    }

    public void addRelation(Person first, RelationshipConstant relationshipConstant, Person second){
       relation.add(new Triplet<>(first,relationshipConstant,second));
       relation.add(new Triplet<>(second,relationshipConstant,first));
    }
}
class Triplet<T,U,V>{
    private T first;
    private U second;
    private V third;

    public Triplet(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }
}

class ResearchRelationship{
    List<Person> result = new ArrayList();
    public List getAllChild(RelationShips relationShips,Person person){
        for(Triplet<Person, RelationshipConstant, Person> row:relationShips.getRelation()){
            if(row.getFirst().equals(person) && row.getSecond().equals(RelationshipConstant.PARENT)){
                result.add(row.getThird());
            }
        }
        return result;
    }
}