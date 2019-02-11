package com.auth0.samples.authapi.springbootauthupdated.institute.model;

import javax.persistence.*;

@Entity
@Table(name = "PlayerPositionDataSet")
public class PlayerPositionDataSet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long field1;
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
