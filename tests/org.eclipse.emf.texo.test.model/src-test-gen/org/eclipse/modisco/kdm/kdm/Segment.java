package org.eclipse.modisco.kdm.kdm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;

/** 
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Segment")
public class Segment extends KDMFramework {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Segment.class)
  @JoinColumns({ @JoinColumn() })
  private Set<Segment> segment = new HashSet<Segment>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = KDMModel.class)
  @JoinColumns({ @JoinColumn() })
  private Set<KDMModel> model = new HashSet<KDMModel>();

  /**
   * Returns the value of '<em><b>segment</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>segment</b></em>' feature
   * @generated
   */
  public Set<Segment> getSegment() {
    return segment;
  }

  /**
   * Adds to the <em>segment</em> feature.
   * @generated
   */
  public void addToSegment(Segment segmentValue) {
    if (!segment.contains(segmentValue)) {

      segment.add(segmentValue);
    }

  }

  /**			
   * Removes from the <em>segment</em> feature.
   * @generated
   */
  public void removeFromSegment(Segment segmentValue) {
    if (segment.contains(segmentValue)) {
      segment.remove(segmentValue);
    }
  }

  /**			
   * Clears the <em>segment</em> feature.
   * @generated
   */
  public void clearSegment() {
    while (!segment.isEmpty()) {
      removeFromSegment(segment.iterator().next());
    }
  }

  /**
   * Sets the '{@link Segment#getSegment() <em>segment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Segment#getSegment() segment}' feature.
   * @generated
   */
  public void setSegment(Set<Segment> newSegment) {
    segment = newSegment;
  }

  /**
   * Returns the value of '<em><b>model</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>model</b></em>' feature
   * @generated
   */
  public Set<KDMModel> getModel() {
    return model;
  }

  /**
   * Adds to the <em>model</em> feature.
   * @generated
   */
  public void addToModel(KDMModel modelValue) {
    if (!model.contains(modelValue)) {

      model.add(modelValue);
    }

  }

  /**			
   * Removes from the <em>model</em> feature.
   * @generated
   */
  public void removeFromModel(KDMModel modelValue) {
    if (model.contains(modelValue)) {
      model.remove(modelValue);
    }
  }

  /**			
   * Clears the <em>model</em> feature.
   * @generated
   */
  public void clearModel() {
    while (!model.isEmpty()) {
      removeFromModel(model.iterator().next());
    }
  }

  /**
   * Sets the '{@link Segment#getModel() <em>model</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Segment#getModel() model}' feature.
   * @generated
   */
  public void setModel(Set<KDMModel> newModel) {
    model = newModel;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Segment ";
  }
}
