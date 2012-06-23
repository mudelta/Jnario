package org.jnario.suite.jvmmodel

import com.google.inject.Inject
import org.jnario.Specification
import org.jnario.feature.feature.Feature
import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.ExampleGroup
import org.jnario.suite.suite.Suite

import static org.jnario.suite.jvmmodel.SuiteClassNameProvider.*

import static extension com.google.common.base.Strings.*
import static extension org.eclipse.xtext.util.Strings.*
import static extension org.jnario.util.Strings.*
class SuiteClassNameProvider {
	
	ExampleNameProvider exampleNameProvider
	FeatureClassNameProvider featureNameProvider
	
	@Inject
	new(ExampleNameProvider exampleNameProvider, 
		FeatureClassNameProvider featureNameProvider
	){
		this.exampleNameProvider = exampleNameProvider
		this.featureNameProvider = featureNameProvider
	}
	
	static val POSTFIX = "Suite"
	
	def removePrefix(Suite suite){
		var name = suite.name.firstLine
		if(name.nullOrEmpty) return null
		name = name.substring(name.lastIndexOf('#')+1).trim
		if(name.nullOrEmpty) return null else name
	}
	
	def dispatch describe(Suite suite){
		suite.removePrefix?.convertToJavaString(true)
	}
	
	def dispatch describe(ExampleGroup element){
		exampleNameProvider.describe(element)
	}
	
	def dispatch describe(Feature element){
		element.name
	}
	
	def getQualifiedClassName(Specification spec){
		spec.packageName + "." + spec.className
	}
	
	def dispatch getClassName(Suite suite){
		val name = suite.removePrefix
		if(name == null) return null
		name.toClassName + POSTFIX
	}
	
	def dispatch getClassName(ExampleGroup element){
		exampleNameProvider.toJavaClassName(element)
	}

	def dispatch getClassName(Feature element){
		featureNameProvider.getClassName(element)
	}	
}