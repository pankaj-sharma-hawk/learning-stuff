package rahul;

import java.util.Objects;

/**
 * Created by pankaj on 07,2019
 */

public class MishraClass {

  private long id;
  private int age;
  private String name;

  public MishraClass(long id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MishraClass that = (MishraClass) o;
    return id == that.id &&
        age == that.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, age);
  }

  @Override
  public String toString() {
    return "MishraClass{" +
        "id=" + id +
        ", age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}
