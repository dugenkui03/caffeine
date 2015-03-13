/*
 * Copyright 2015 Ben Manes. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.benmanes.caffeine.cache;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Guava testlib map tests for the unbounded {@link Cache#asMap()} view.
 *
 * @author ben.manes@gmail.com (Ben Manes)
 */
public final class UnboundedMapTests extends TestCase {

  public static Test suite() throws NoSuchMethodException, SecurityException {
    TestSuite suite = new TestSuite();
    suite.addTest(MapTestFactory.suite("UnoundedLocalCache", Caffeine.newBuilder(), false));
    suite.addTest(MapTestFactory.suite("UnoundedLocalAsyncCache", Caffeine.newBuilder(), true));
    return suite;
  }
}
