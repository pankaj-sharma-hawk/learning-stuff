package com.auth0.samples.authapi.springbootauthupdated.institute.model;

import javax.persistence.*;

@Entity
@Table(name = "CompleteDataSet  ")
public class CompleteDataSet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long field1;
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
  private String acceleration;
  private String aggression;
  private String agility;
  private String balance;
  private String ballControl;
  private String composure;
  private String crossing;
  private String curve;
  private String dribbling;
  private String finishing;
  private String freeKickAccuracy;
  private String gkDiving;
  private String gkHandling;
  private String gkKicking;
  private String gkPositioning;
  private String gkReflexes;
  private String headingAccuracy;
  private String interceptions;
  private String jumping;
  private String longPassing;
  private String longShots;
  private String marking;
  private String penalties;
  private String positioning;
  private String reactions;
  private String shortPassing;
  private String shotPower;
  private String slidingTackle;
  private String sprintSpeed;
  private String stamina;
  private String standingTackle;
  private String strength;
  private String vision;
  private String volleys;
  private double cam;
  private double cb;
  private double cdm;
  private double cf;
  private double cm;
  private long id;
  private double lam;
  private double lb;
  private double lcb;
  private double lcm;
  private double ldm;
  private double lf;
  private double lm;
  private double ls;
  private double lw;
  private double lwb;
  private String preferredPositions;
  private double ram;
  private double rb;
  private double rcb;
  private double rcm;
  private double rdm;
  private double rf;
  private double rm;
  private double rs;
  private double rw;
  private double rwb;
  private double st;


  public long getField1() {
    return field1;
  }

  public void setField1(long field1) {
    this.field1 = field1;
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


  public String getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(String acceleration) {
    this.acceleration = acceleration;
  }


  public String getAggression() {
    return aggression;
  }

  public void setAggression(String aggression) {
    this.aggression = aggression;
  }


  public String getAgility() {
    return agility;
  }

  public void setAgility(String agility) {
    this.agility = agility;
  }


  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  public String getBallControl() {
    return ballControl;
  }

  public void setBallControl(String ballControl) {
    this.ballControl = ballControl;
  }


  public String getComposure() {
    return composure;
  }

  public void setComposure(String composure) {
    this.composure = composure;
  }


  public String getCrossing() {
    return crossing;
  }

  public void setCrossing(String crossing) {
    this.crossing = crossing;
  }


  public String getCurve() {
    return curve;
  }

  public void setCurve(String curve) {
    this.curve = curve;
  }


  public String getDribbling() {
    return dribbling;
  }

  public void setDribbling(String dribbling) {
    this.dribbling = dribbling;
  }


  public String getFinishing() {
    return finishing;
  }

  public void setFinishing(String finishing) {
    this.finishing = finishing;
  }


  public String getFreeKickAccuracy() {
    return freeKickAccuracy;
  }

  public void setFreeKickAccuracy(String freeKickAccuracy) {
    this.freeKickAccuracy = freeKickAccuracy;
  }


  public String getGkDiving() {
    return gkDiving;
  }

  public void setGkDiving(String gkDiving) {
    this.gkDiving = gkDiving;
  }


  public String getGkHandling() {
    return gkHandling;
  }

  public void setGkHandling(String gkHandling) {
    this.gkHandling = gkHandling;
  }


  public String getGkKicking() {
    return gkKicking;
  }

  public void setGkKicking(String gkKicking) {
    this.gkKicking = gkKicking;
  }


  public String getGkPositioning() {
    return gkPositioning;
  }

  public void setGkPositioning(String gkPositioning) {
    this.gkPositioning = gkPositioning;
  }


  public String getGkReflexes() {
    return gkReflexes;
  }

  public void setGkReflexes(String gkReflexes) {
    this.gkReflexes = gkReflexes;
  }


  public String getHeadingAccuracy() {
    return headingAccuracy;
  }

  public void setHeadingAccuracy(String headingAccuracy) {
    this.headingAccuracy = headingAccuracy;
  }


  public String getInterceptions() {
    return interceptions;
  }

  public void setInterceptions(String interceptions) {
    this.interceptions = interceptions;
  }


  public String getJumping() {
    return jumping;
  }

  public void setJumping(String jumping) {
    this.jumping = jumping;
  }


  public String getLongPassing() {
    return longPassing;
  }

  public void setLongPassing(String longPassing) {
    this.longPassing = longPassing;
  }


  public String getLongShots() {
    return longShots;
  }

  public void setLongShots(String longShots) {
    this.longShots = longShots;
  }


  public String getMarking() {
    return marking;
  }

  public void setMarking(String marking) {
    this.marking = marking;
  }


  public String getPenalties() {
    return penalties;
  }

  public void setPenalties(String penalties) {
    this.penalties = penalties;
  }


  public String getPositioning() {
    return positioning;
  }

  public void setPositioning(String positioning) {
    this.positioning = positioning;
  }


  public String getReactions() {
    return reactions;
  }

  public void setReactions(String reactions) {
    this.reactions = reactions;
  }


  public String getShortPassing() {
    return shortPassing;
  }

  public void setShortPassing(String shortPassing) {
    this.shortPassing = shortPassing;
  }


  public String getShotPower() {
    return shotPower;
  }

  public void setShotPower(String shotPower) {
    this.shotPower = shotPower;
  }


  public String getSlidingTackle() {
    return slidingTackle;
  }

  public void setSlidingTackle(String slidingTackle) {
    this.slidingTackle = slidingTackle;
  }


  public String getSprintSpeed() {
    return sprintSpeed;
  }

  public void setSprintSpeed(String sprintSpeed) {
    this.sprintSpeed = sprintSpeed;
  }


  public String getStamina() {
    return stamina;
  }

  public void setStamina(String stamina) {
    this.stamina = stamina;
  }


  public String getStandingTackle() {
    return standingTackle;
  }

  public void setStandingTackle(String standingTackle) {
    this.standingTackle = standingTackle;
  }


  public String getStrength() {
    return strength;
  }

  public void setStrength(String strength) {
    this.strength = strength;
  }


  public String getVision() {
    return vision;
  }

  public void setVision(String vision) {
    this.vision = vision;
  }


  public String getVolleys() {
    return volleys;
  }

  public void setVolleys(String volleys) {
    this.volleys = volleys;
  }


  public double getCam() {
    return cam;
  }

  public void setCam(double cam) {
    this.cam = cam;
  }


  public double getCb() {
    return cb;
  }

  public void setCb(double cb) {
    this.cb = cb;
  }


  public double getCdm() {
    return cdm;
  }

  public void setCdm(double cdm) {
    this.cdm = cdm;
  }


  public double getCf() {
    return cf;
  }

  public void setCf(double cf) {
    this.cf = cf;
  }


  public double getCm() {
    return cm;
  }

  public void setCm(double cm) {
    this.cm = cm;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getLam() {
    return lam;
  }

  public void setLam(double lam) {
    this.lam = lam;
  }


  public double getLb() {
    return lb;
  }

  public void setLb(double lb) {
    this.lb = lb;
  }


  public double getLcb() {
    return lcb;
  }

  public void setLcb(double lcb) {
    this.lcb = lcb;
  }


  public double getLcm() {
    return lcm;
  }

  public void setLcm(double lcm) {
    this.lcm = lcm;
  }


  public double getLdm() {
    return ldm;
  }

  public void setLdm(double ldm) {
    this.ldm = ldm;
  }


  public double getLf() {
    return lf;
  }

  public void setLf(double lf) {
    this.lf = lf;
  }


  public double getLm() {
    return lm;
  }

  public void setLm(double lm) {
    this.lm = lm;
  }


  public double getLs() {
    return ls;
  }

  public void setLs(double ls) {
    this.ls = ls;
  }


  public double getLw() {
    return lw;
  }

  public void setLw(double lw) {
    this.lw = lw;
  }


  public double getLwb() {
    return lwb;
  }

  public void setLwb(double lwb) {
    this.lwb = lwb;
  }


  public String getPreferredPositions() {
    return preferredPositions;
  }

  public void setPreferredPositions(String preferredPositions) {
    this.preferredPositions = preferredPositions;
  }


  public double getRam() {
    return ram;
  }

  public void setRam(double ram) {
    this.ram = ram;
  }


  public double getRb() {
    return rb;
  }

  public void setRb(double rb) {
    this.rb = rb;
  }


  public double getRcb() {
    return rcb;
  }

  public void setRcb(double rcb) {
    this.rcb = rcb;
  }


  public double getRcm() {
    return rcm;
  }

  public void setRcm(double rcm) {
    this.rcm = rcm;
  }


  public double getRdm() {
    return rdm;
  }

  public void setRdm(double rdm) {
    this.rdm = rdm;
  }


  public double getRf() {
    return rf;
  }

  public void setRf(double rf) {
    this.rf = rf;
  }


  public double getRm() {
    return rm;
  }

  public void setRm(double rm) {
    this.rm = rm;
  }


  public double getRs() {
    return rs;
  }

  public void setRs(double rs) {
    this.rs = rs;
  }


  public double getRw() {
    return rw;
  }

  public void setRw(double rw) {
    this.rw = rw;
  }


  public double getRwb() {
    return rwb;
  }

  public void setRwb(double rwb) {
    this.rwb = rwb;
  }


  public double getSt() {
    return st;
  }

  public void setSt(double st) {
    this.st = st;
  }

}
