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

package org.apache.hadoop.hive.ql.plan;

import java.io.Serializable;

/**
 * unionDesc is a empty class currently. However, union has more than one input
 * (as compared with forward), and therefore, we need a separate class.
 **/
@Explain(displayName = "Union")
public class UnionDesc implements Serializable {
  private static final long serialVersionUID = 1L;

  private transient int numInputs;

  @SuppressWarnings("nls")
  public UnionDesc() {
    numInputs = 2;
  }

  /**
   * @return the numInputs
   */
  public int getNumInputs() {
    return numInputs;
  }

  /**
   * @param numInputs
   *          the numInputs to set
   */
  public void setNumInputs(int numInputs) {
    this.numInputs = numInputs;
  }
}
