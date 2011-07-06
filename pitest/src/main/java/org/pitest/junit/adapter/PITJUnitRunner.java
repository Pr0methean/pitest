/*
 * Copyright 2010 Henry Coles
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and limitations under the License. 
 */
package org.pitest.junit.adapter;

import org.pitest.DefaultStaticConfig;
import org.pitest.extension.Configuration;
import org.pitest.extension.StaticConfiguration;
import org.pitest.junit.JUnitCompatibleConfiguration;

/**
 * Custom runner to run tests with Pit but report back to junit.
 * 
 * @author henry
 * 
 */
public class PITJUnitRunner extends AbstractPITJUnitRunner {

  public PITJUnitRunner(final Class<?> clazz) { // NO_UCD
    super(clazz);
  }

  @Override
  protected Configuration getConfiguration() {
    return new JUnitCompatibleConfiguration();
  }

  @Override
  protected StaticConfiguration getStaticConfig() {
    return new DefaultStaticConfig();
  }

}