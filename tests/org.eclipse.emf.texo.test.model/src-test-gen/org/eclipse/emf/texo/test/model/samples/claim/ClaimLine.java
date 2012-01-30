package org.eclipse.emf.texo.test.model.samples.claim;

import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>ClaimLine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Claim Line Information <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "ClaimLine")
public class ClaimLine {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = Claim.class)
  @JoinColumns({ @JoinColumn() })
  private Claim claim = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = ClaimLineCompositeKey.class)
  @JoinColumns({ @JoinColumn() })
  private ClaimLineCompositeKey claimLineCompositeKey = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim.
   * 
   * <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private BigDecimal claimLineBilledAmount = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim.
   * 
   * <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String serviceCode = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String claimLineStatus = "";

  /**
   * Returns the value of '<em><b>claim</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToClaim(org.eclipse.emf.texo.test.model.samples.claim.Claim value)} and {@link #removeFromClaim(Claim value)}
   * methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>claim</b></em>' feature
   * @generated
   */
  public Claim getClaim() {
    return claim;
  }

  /**
   * Sets the '{@link ClaimLine#getClaim() <em>claim</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
   * end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ClaimLine#getClaim() claim}' feature.
   * @generated
   */
  public void setClaim(Claim newClaim) {
    claim = newClaim;
  }

  /**
   * Returns the value of '<em><b>claimLineCompositeKey</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>claimLineCompositeKey</b></em>' feature
   * @generated
   */
  public ClaimLineCompositeKey getClaimLineCompositeKey() {
    return claimLineCompositeKey;
  }

  /**
   * Sets the '{@link ClaimLine#getClaimLineCompositeKey() <em>claimLineCompositeKey</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ClaimLine#getClaimLineCompositeKey() claimLineCompositeKey}' feature.
   * @generated
   */
  public void setClaimLineCompositeKey(ClaimLineCompositeKey newClaimLineCompositeKey) {
    claimLineCompositeKey = newClaimLineCompositeKey;
  }

  /**
   * Returns the value of '<em><b>claimLineBilledAmount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim.
   * 
   * <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimLineBilledAmount</b></em>' feature
   * @generated
   */
  public BigDecimal getClaimLineBilledAmount() {
    return claimLineBilledAmount;
  }

  /**
   * Sets the '{@link ClaimLine#getClaimLineBilledAmount() <em>claimLineBilledAmount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim.
   * 
   * <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ClaimLine#getClaimLineBilledAmount() claimLineBilledAmount}' feature.
   * @generated
   */
  public void setClaimLineBilledAmount(BigDecimal newClaimLineBilledAmount) {
    claimLineBilledAmount = newClaimLineBilledAmount;
  }

  /**
   * Returns the value of '<em><b>serviceCode</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim.
   * 
   * <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>serviceCode</b></em>' feature
   * @generated
   */
  public String getServiceCode() {
    return serviceCode;
  }

  /**
   * Sets the '{@link ClaimLine#getServiceCode() <em>serviceCode</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim.
   * 
   * <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ClaimLine#getServiceCode() serviceCode}' feature.
   * @generated
   */
  public void setServiceCode(String newServiceCode) {
    serviceCode = newServiceCode;
  }

  /**
   * Returns the value of '<em><b>claimLineStatus</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimLineStatus</b></em>' feature
   * @generated
   */
  public String getClaimLineStatus() {
    return claimLineStatus;
  }

  /**
   * Sets the '{@link ClaimLine#getClaimLineStatus() <em>claimLineStatus</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ClaimLine#getClaimLineStatus() claimLineStatus}' feature.
   * @generated
   */
  public void setClaimLineStatus(String newClaimLineStatus) {
    claimLineStatus = newClaimLineStatus;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ClaimLine " + " [claimLineBilledAmount: " + getClaimLineBilledAmount() + "]" + " [serviceCode: "
        + getServiceCode() + "]" + " [claimLineStatus: " + getClaimLineStatus() + "]";
  }
}
