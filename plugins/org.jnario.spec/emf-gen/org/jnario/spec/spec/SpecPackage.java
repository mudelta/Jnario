/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.spec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtend.core.xtend.XtendPackage;

import org.jnario.JnarioPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jnario.spec.spec.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012 BMW Car IT and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org/jnario/spec/Spec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecPackage eINSTANCE = org.jnario.spec.spec.impl.SpecPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.spec.spec.impl.SpecFileImpl
	 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
	 * @generated
	 */
	int SPEC_FILE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__IMPORTS = XtendPackage.XTEND_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Xtend Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__XTEND_CLASSES = XtendPackage.XTEND_FILE__XTEND_CLASSES;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__PACKAGE = XtendPackage.XTEND_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE_FEATURE_COUNT = XtendPackage.XTEND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.spec.spec.impl.ExampleGroupImpl
	 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
	 * @generated
	 */
	int EXAMPLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ANNOTATIONS = JnarioPackage.SPECIFICATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__NAME = JnarioPackage.SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ABSTRACT = JnarioPackage.SPECIFICATION__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__EXTENDS = JnarioPackage.SPECIFICATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__IMPLEMENTS = JnarioPackage.SPECIFICATION__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__SUPER_TYPES = JnarioPackage.SPECIFICATION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__MEMBERS = JnarioPackage.SPECIFICATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TYPE_PARAMETERS = JnarioPackage.SPECIFICATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ANNOTATION_INFO = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__PREAMBLE = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TARGET_TYPE = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TARGET_OPERATION = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Example Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP_FEATURE_COUNT = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.jnario.spec.spec.impl.TestFunctionImpl <em>Test Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.spec.spec.impl.TestFunctionImpl
	 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getTestFunction()
	 * @generated
	 */
	int TEST_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__ANNOTATIONS = XtendPackage.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__ANNOTATION_INFO = XtendPackage.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__NAME = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__BODY = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION_FEATURE_COUNT = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.spec.spec.impl.ExampleImpl
	 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ANNOTATIONS = TEST_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ANNOTATION_INFO = TEST_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__NAME = TEST_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__BODY = TEST_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__EXPR = TEST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__PENDING = TEST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = TEST_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jnario.spec.spec.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.spec.spec.impl.BeforeImpl
	 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__ANNOTATIONS = TEST_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__ANNOTATION_INFO = TEST_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__NAME = TEST_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__BODY = TEST_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Before All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__BEFORE_ALL = TEST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = TEST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.spec.spec.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.spec.spec.impl.AfterImpl
	 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ANNOTATIONS = TEST_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ANNOTATION_INFO = TEST_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__NAME = TEST_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__BODY = TEST_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>After All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__AFTER_ALL = TEST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = TEST_FUNCTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.jnario.spec.spec.SpecFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.jnario.spec.spec.SpecFile
	 * @generated
	 */
	EClass getSpecFile();

	/**
	 * Returns the meta object for class '{@link org.jnario.spec.spec.ExampleGroup <em>Example Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Group</em>'.
	 * @see org.jnario.spec.spec.ExampleGroup
	 * @generated
	 */
	EClass getExampleGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamble</em>'.
	 * @see org.jnario.spec.spec.ExampleGroup#getPreamble()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EAttribute getExampleGroup_Preamble();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Type</em>'.
	 * @see org.jnario.spec.spec.ExampleGroup#getTargetType()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EReference getExampleGroup_TargetType();

	/**
	 * Returns the meta object for the reference '{@link org.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Operation</em>'.
	 * @see org.jnario.spec.spec.ExampleGroup#getTargetOperation()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EReference getExampleGroup_TargetOperation();

	/**
	 * Returns the meta object for class '{@link org.jnario.spec.spec.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see org.jnario.spec.spec.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.spec.spec.Example#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.jnario.spec.spec.Example#getExpr()
	 * @see #getExample()
	 * @generated
	 */
	EReference getExample_Expr();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.spec.spec.Example#isPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pending</em>'.
	 * @see org.jnario.spec.spec.Example#isPending()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Pending();

	/**
	 * Returns the meta object for class '{@link org.jnario.spec.spec.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see org.jnario.spec.spec.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.spec.spec.Before#isBeforeAll <em>Before All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before All</em>'.
	 * @see org.jnario.spec.spec.Before#isBeforeAll()
	 * @see #getBefore()
	 * @generated
	 */
	EAttribute getBefore_BeforeAll();

	/**
	 * Returns the meta object for class '{@link org.jnario.spec.spec.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see org.jnario.spec.spec.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.spec.spec.After#isAfterAll <em>After All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After All</em>'.
	 * @see org.jnario.spec.spec.After#isAfterAll()
	 * @see #getAfter()
	 * @generated
	 */
	EAttribute getAfter_AfterAll();

	/**
	 * Returns the meta object for class '{@link org.jnario.spec.spec.TestFunction <em>Test Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Function</em>'.
	 * @see org.jnario.spec.spec.TestFunction
	 * @generated
	 */
	EClass getTestFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.spec.spec.TestFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.spec.spec.TestFunction#getName()
	 * @see #getTestFunction()
	 * @generated
	 */
	EAttribute getTestFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.spec.spec.TestFunction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.jnario.spec.spec.TestFunction#getBody()
	 * @see #getTestFunction()
	 * @generated
	 */
	EReference getTestFunction_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecFactory getSpecFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.spec.spec.impl.SpecFileImpl
		 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
		 * @generated
		 */
		EClass SPEC_FILE = eINSTANCE.getSpecFile();

		/**
		 * The meta object literal for the '{@link org.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.spec.spec.impl.ExampleGroupImpl
		 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
		 * @generated
		 */
		EClass EXAMPLE_GROUP = eINSTANCE.getExampleGroup();

		/**
		 * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_GROUP__PREAMBLE = eINSTANCE.getExampleGroup_Preamble();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_GROUP__TARGET_TYPE = eINSTANCE.getExampleGroup_TargetType();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_GROUP__TARGET_OPERATION = eINSTANCE.getExampleGroup_TargetOperation();

		/**
		 * The meta object literal for the '{@link org.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.spec.spec.impl.ExampleImpl
		 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE__EXPR = eINSTANCE.getExample_Expr();

		/**
		 * The meta object literal for the '<em><b>Pending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__PENDING = eINSTANCE.getExample_Pending();

		/**
		 * The meta object literal for the '{@link org.jnario.spec.spec.impl.BeforeImpl <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.spec.spec.impl.BeforeImpl
		 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

		/**
		 * The meta object literal for the '<em><b>Before All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEFORE__BEFORE_ALL = eINSTANCE.getBefore_BeforeAll();

		/**
		 * The meta object literal for the '{@link org.jnario.spec.spec.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.spec.spec.impl.AfterImpl
		 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '<em><b>After All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER__AFTER_ALL = eINSTANCE.getAfter_AfterAll();

		/**
		 * The meta object literal for the '{@link org.jnario.spec.spec.impl.TestFunctionImpl <em>Test Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.spec.spec.impl.TestFunctionImpl
		 * @see org.jnario.spec.spec.impl.SpecPackageImpl#getTestFunction()
		 * @generated
		 */
		EClass TEST_FUNCTION = eINSTANCE.getTestFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FUNCTION__NAME = eINSTANCE.getTestFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_FUNCTION__BODY = eINSTANCE.getTestFunction_Body();

	}

} //SpecPackage
