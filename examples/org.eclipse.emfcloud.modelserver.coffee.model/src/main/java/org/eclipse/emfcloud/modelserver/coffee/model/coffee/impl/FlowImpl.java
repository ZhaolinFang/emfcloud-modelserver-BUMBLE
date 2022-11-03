/**
 * Copyright (c) 2019 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
package org.eclipse.emfcloud.modelserver.coffee.model.coffee.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emfcloud.modelserver.coffee.model.coffee.CoffeePackage;
import org.eclipse.emfcloud.modelserver.coffee.model.coffee.Flow;
import org.eclipse.emfcloud.modelserver.coffee.model.coffee.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.impl.FlowImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.impl.FlowImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected Node source;

   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected Node target;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   protected FlowImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return CoffeePackage.Literals.FLOW;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Node getSource() {
      if (source != null && source.eIsProxy()) {
         InternalEObject oldSource = (InternalEObject) source;
         source = (Node) eResolveProxy(oldSource);
         if (source != oldSource) {
            if (eNotificationRequired()) {
               eNotify(
                  new ENotificationImpl(this, Notification.RESOLVE, CoffeePackage.FLOW__SOURCE, oldSource, source));
            }
         }
      }
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   public Node basicGetSource() {
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setSource(final Node newSource) {
      Node oldSource = source;
      source = newSource;
      if (eNotificationRequired()) {
         eNotify(new ENotificationImpl(this, Notification.SET, CoffeePackage.FLOW__SOURCE, oldSource, source));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Node getTarget() {
      if (target != null && target.eIsProxy()) {
         InternalEObject oldTarget = (InternalEObject) target;
         target = (Node) eResolveProxy(oldTarget);
         if (target != oldTarget) {
            if (eNotificationRequired()) {
               eNotify(
                  new ENotificationImpl(this, Notification.RESOLVE, CoffeePackage.FLOW__TARGET, oldTarget, target));
            }
         }
      }
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   public Node basicGetTarget() {
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setTarget(final Node newTarget) {
      Node oldTarget = target;
      target = newTarget;
      if (eNotificationRequired()) {
         eNotify(new ENotificationImpl(this, Notification.SET, CoffeePackage.FLOW__TARGET, oldTarget, target));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
      switch (featureID) {
         case CoffeePackage.FLOW__SOURCE:
            if (resolve) {
               return getSource();
            }
            return basicGetSource();
         case CoffeePackage.FLOW__TARGET:
            if (resolve) {
               return getTarget();
            }
            return basicGetTarget();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eSet(final int featureID, final Object newValue) {
      switch (featureID) {
         case CoffeePackage.FLOW__SOURCE:
            setSource((Node) newValue);
            return;
         case CoffeePackage.FLOW__TARGET:
            setTarget((Node) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eUnset(final int featureID) {
      switch (featureID) {
         case CoffeePackage.FLOW__SOURCE:
            setSource((Node) null);
            return;
         case CoffeePackage.FLOW__TARGET:
            setTarget((Node) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public boolean eIsSet(final int featureID) {
      switch (featureID) {
         case CoffeePackage.FLOW__SOURCE:
            return source != null;
         case CoffeePackage.FLOW__TARGET:
            return target != null;
      }
      return super.eIsSet(featureID);
   }

} // FlowImpl
