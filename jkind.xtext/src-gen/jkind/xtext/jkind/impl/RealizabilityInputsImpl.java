/**
 */
package jkind.xtext.jkind.impl;

import java.util.Collection;

import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.RealizabilityInputs;
import jkind.xtext.jkind.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realizability Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.RealizabilityInputsImpl#getIds <em>Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizabilityInputsImpl extends MinimalEObjectImpl.Container implements RealizabilityInputs
{
  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected EList<Variable> ids;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealizabilityInputsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JkindPackage.Literals.REALIZABILITY_INPUTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getIds()
  {
    if (ids == null)
    {
      ids = new EObjectResolvingEList<Variable>(Variable.class, this, JkindPackage.REALIZABILITY_INPUTS__IDS);
    }
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JkindPackage.REALIZABILITY_INPUTS__IDS:
        return getIds();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JkindPackage.REALIZABILITY_INPUTS__IDS:
        getIds().clear();
        getIds().addAll((Collection<? extends Variable>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JkindPackage.REALIZABILITY_INPUTS__IDS:
        getIds().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JkindPackage.REALIZABILITY_INPUTS__IDS:
        return ids != null && !ids.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RealizabilityInputsImpl
