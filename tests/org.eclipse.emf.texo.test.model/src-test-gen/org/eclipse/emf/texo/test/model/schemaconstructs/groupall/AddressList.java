package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>AddressList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "AddressList")
public class AddressList {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String groupName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<AddressListAddrsFeatureGroup> addrs = new ArrayList<AddressListAddrsFeatureGroup>();

  /**
   * Returns the value of '<em><b>groupName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupName</b></em>' feature
   * @generated
   */
  public String getGroupName() {
    return groupName;
  }

  /**
   * Sets the '{@link AddressList#getGroupName() <em>groupName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressList#getGroupName() groupName}' feature.
   * @generated
   */
  public void setGroupName(String newGroupName) {
    groupName = newGroupName;
  }

  /**
   * Returns the value of '<em><b>addrs</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>addrs</b></em>' feature
   * @generated
   */
  public List<AddressListAddrsFeatureGroup> getAddrs() {
    return addrs;
  }

  /**
   * Sets the '{@link AddressList#getAddrs() <em>addrs</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressList#getAddrs() addrs}' feature.
   * @generated
   */
  public void setAddrs(List<AddressListAddrsFeatureGroup> newAddrs) {
    addrs = newAddrs;
  }

  /**
   * Returns the value of '<em><b>shipTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shipTo</b></em>' feature
   * @generated
   */
  public List<AddressType> getShipTo() {
    return AddressListAddrsFeatureGroup.createUnmodifiableValueList(getAddrs(),
        AddressListAddrsFeatureGroup.Feature.SHIPTO);
  }

  /**
   * Sets the '{@link AddressList#getShipTo() <em>shipTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressList#getShipTo() shipTo}' feature.
   * @generated
   */
  public void setShipTo(List<AddressType> newShipTo) {
    setAddrs(AddressListAddrsFeatureGroup
        .createFeatureGroupList(AddressListAddrsFeatureGroup.Feature.SHIPTO, newShipTo));
  }

  /**
   * Returns the value of '<em><b>billTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>billTo</b></em>' feature
   * @generated
   */
  public List<AddressType> getBillTo() {
    return AddressListAddrsFeatureGroup.createUnmodifiableValueList(getAddrs(),
        AddressListAddrsFeatureGroup.Feature.BILLTO);
  }

  /**
   * Sets the '{@link AddressList#getBillTo() <em>billTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressList#getBillTo() billTo}' feature.
   * @generated
   */
  public void setBillTo(List<AddressType> newBillTo) {
    setAddrs(AddressListAddrsFeatureGroup
        .createFeatureGroupList(AddressListAddrsFeatureGroup.Feature.BILLTO, newBillTo));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AddressList " + " [groupName: " + getGroupName() + "]";
  }
}
