/*

   Derby - Class org.apache.derbyTesting.functionTests.tests.compatibility._SuiteOld

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to you under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.derbyTesting.functionTests.tests.compatibility;

import junit.framework.Test;

/**
 * Tests all the newest branch releases and trunk against each other.
 * <p>
 * This suite is limited in that only the latest releases of old branches
 * are included in the test set. It is still testing old releases against
 * each other, which is somewhat uninteresting since they the old releases
 * don't change.
 */
public class _SuiteOld
        extends _Suite {

    public _SuiteOld(String name) {
        super(name);
        throw new IllegalStateException("invoke suite() instead");
    }

    /**
     * Returns an extended suite of compatibility tests.
     *
     * @return A test suite.
     */
    public static Test suite() {
        configurator = VersionCombinationConfigurator.getInstanceOld();
        return _Suite.suite();
    }
}
