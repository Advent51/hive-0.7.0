/*!
* Copyright 2010 - 2013 Pentaho Corporation.  All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.hive.serde2.io.DoubleWritable;

/**
 * UDFOPDivide.
 *
 */
@Description(name = "/", value = "a _FUNC_ b - Divide a by b", extended = "Example:\n"
    + "  > SELECT 3 _FUNC_ 2 FROM src LIMIT 1;\n" + "  1.5")
/**
 * Note that in SQL, the return type of divide is not necessarily the same 
 * as the parameters. For example, 3 / 2 = 1.5, not 1. To follow SQL, we always
 * return a double for divide.
 */
public class UDFOPDivide extends UDF {
  private DoubleWritable doubleWritable = new DoubleWritable();

  public DoubleWritable evaluate(DoubleWritable a, DoubleWritable b) {
    // LOG.info("Get input " + a.getClass() + ":" + a + " " + b.getClass() + ":"
    // + b);
    if ((a == null) || (b == null)) {
      return null;
    }

    doubleWritable.set(a.get() / b.get());
    return doubleWritable;
  }
}
