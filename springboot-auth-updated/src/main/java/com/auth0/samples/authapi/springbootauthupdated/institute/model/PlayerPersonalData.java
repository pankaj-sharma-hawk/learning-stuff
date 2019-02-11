package com.auth0.samples.authapi.springbootauthupdated.institute.model;

import javax.persistence.*;

@Entity
@Table(name = "PlayerPersonalData")
public class PlayerPersonalData {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long field1;
  private long unnamed0;
  private long id;
  private String name;
  private long age;
  private String photo;
  private String nationality;
  private String flag;
  private long overall;
  private long potential;
  private String club;
  private String clubLogo;
  private String value;
  private String wage;
  private long special;


  public long getField1() {
    return field1;
  }

  public void setField1(long field1) {
    this.field1 = field1;
  }


  public long getUnnamed0() {
    return unnamed0;
  }

  public void setUnnamed0(long unnamed0) {
    this.unnamed0 = unnamed0;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }


  public long getOverall() {
    return overall;
  }

  public void setOverall(long overall) {
    this.overall = overall;
  }


  public long getPotential() {
    return potential;
  }

  public void setPotential(long potential) {
    this.potential = potential;
  }


  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }


  public String getClubLogo() {
    return clubLogo;
  }

  public void setClubLogo(String clubLogo) {
    this.clubLogo = clubLogo;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public String getWage() {
    return wage;
  }

  public void setWage(String wage) {
    this.wage = wage;
  }


  public long getSpecial() {
    return special;
  }

  public void setSpecial(long special) {
    this.special = special;
  }

}
