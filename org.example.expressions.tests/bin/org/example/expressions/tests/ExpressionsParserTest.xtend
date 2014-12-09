package org.example.expressions.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.expressions.ExpressionsInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.example.expressions.expressions.ExpressionsModel

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
}
