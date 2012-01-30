package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Supplier</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Supplier")
public class Supplier extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Customer.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Customer> customers = new ArrayList<Customer>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = PurchaseOrder.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Supplier#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Supplier#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>customers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>customers</b></em>' feature
   * @generated
   */
  public List<Customer> getCustomers() {
    return customers;
  }

  /**
   * Adds to the <em>customers</em> feature.
   * 
   * @generated
   */
  public void addToCustomers(Customer customersValue) {
    if (!customers.contains(customersValue)) {

      customers.add(customersValue);
    }

  }

  /**
   * Removes from the <em>customers</em> feature.
   * 
   * @generated
   */
  public void removeFromCustomers(Customer customersValue) {
    if (customers.contains(customersValue)) {
      customers.remove(customersValue);
    }
  }

  /**
   * Clears the <em>customers</em> feature.
   * 
   * @generated
   */
  public void clearCustomers() {
    while (!customers.isEmpty()) {
      removeFromCustomers(customers.iterator().next());
    }
  }

  /**
   * Sets the '{@link Supplier#getCustomers() <em>customers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Supplier#getCustomers() customers}' feature.
   * @generated
   */
  public void setCustomers(List<Customer> newCustomers) {
    customers = newCustomers;
  }

  /**
   * Returns the value of '<em><b>orders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>orders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getOrders() {
    return orders;
  }

  /**
   * Adds to the <em>orders</em> feature.
   * 
   * @generated
   */
  public void addToOrders(PurchaseOrder ordersValue) {
    if (!orders.contains(ordersValue)) {

      orders.add(ordersValue);
    }

  }

  /**
   * Removes from the <em>orders</em> feature.
   * 
   * @generated
   */
  public void removeFromOrders(PurchaseOrder ordersValue) {
    if (orders.contains(ordersValue)) {
      orders.remove(ordersValue);
    }
  }

  /**
   * Clears the <em>orders</em> feature.
   * 
   * @generated
   */
  public void clearOrders() {
    while (!orders.isEmpty()) {
      removeFromOrders(orders.iterator().next());
    }
  }

  /**
   * Sets the '{@link Supplier#getOrders() <em>orders</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Supplier#getOrders() orders}' feature.
   * @generated
   */
  public void setOrders(List<PurchaseOrder> newOrders) {
    orders = newOrders;
  }

  /**
   * Returns the value of '<em><b>pendingOrders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pendingOrders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getPendingOrders() {
    // Volatile feature
    // TODO: implement this method to return the 'pendingOrders'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * Returns the value of '<em><b>shippedOrders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shippedOrders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getShippedOrders() {
    // Volatile feature
    // TODO: implement this method to return the 'shippedOrders'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Supplier " + " [name: " + getName() + "]";
  }
}
