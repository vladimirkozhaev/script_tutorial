package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.expressions.ExpressionsInjectorProvider
import org.example.expressions.expressions.BoolConstant
import org.example.expressions.expressions.Expression
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.expressions.IntConstant
import org.example.expressions.expressions.Plus
import org.example.expressions.expressions.StringConstant
import org.example.expressions.expressions.Variable
import org.example.expressions.expressions.VariableRef
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.assertSame
import static org.junit.Assert.assertEquals

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsParserTest {
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper

	@Test def void testSimpleExpression() {
		'''10'''.parse.assertNoErrors
	}

	@Test def void testVariableExpression() {
		'''i = 10'''.parse.assertNoErrors
	}

	@Test def void testVariableReference() {
		val e = '''
i = 10
i
'''.parse
		e.assertNoErrors;
		assertSame((e.elements.get(1) as VariableRef).variable, e.elements.get(0) as Variable)
	}

	def stringRepr(Expression e) {
		switch (e) {
			Plus: '''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			IntConstant: '''«e.value»'''
			StringConstant: '''«e.value»'''
			BoolConstant: '''«e.value»'''
			VariableRef: '''«e.variable.name»'''
		}.toString
	}

	def assertRepr(CharSequence input, CharSequence expected) {
		input.parse => [
			assertNoErrors;
			assertEquals(
				expected,
				(elements.last as Expression).stringRepr
			)
		]
	}

	@Test def void testPlus() {
		'''10 + 5 + 1 + 2'''.assertRepr("(((10 + 5) + 1) + 2)")
	}
}
