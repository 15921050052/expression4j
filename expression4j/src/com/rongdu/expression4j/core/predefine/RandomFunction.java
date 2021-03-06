//Copyright 2006 Stephane GINER
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.rongdu.expression4j.core.predefine;

import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.OperatorManager;
import com.rongdu.expression4j.core.Catalog;
import com.rongdu.expression4j.core.Parameters;
import com.rongdu.expression4j.core.exception.EvalException;
import com.rongdu.expression4j.factory.NumberFactory;

public class RandomFunction extends AbstractFunction {
	

	/* (non-Javadoc)
	 * @see fr.expression4j.core.Expression#getCatalog()
	 */
	public Catalog getCatalog() {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.core.Expression#evaluate(fr.expression4j.core.Parameters)
	 */
	public MathematicalElement evaluate(OperatorManager operatorManager, Parameters parameters) throws EvalException {
		return NumberFactory.createReal(new BigDecimal(Math.random(),mc));
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.core.Expression#getParameters()
	 */
	public List getParameters() {
		return new Vector();
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.core.Expression#getName()
	 */
	public String getName() {
		return "random";
	}

	public MathematicalElement evaluate(Parameters parameters) throws EvalException {
		return evaluate(null,parameters);
	}

}
