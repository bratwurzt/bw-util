/* ********************************************************************
    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.
*/
package org.bedework.util.servlet.io;

import org.bedework.util.jmx.ConfBaseMBean;
import org.bedework.util.jmx.MBeanInfo;

/** Allow monitoring and manipulation of the pooled buffer settings..
 *
 * @author Mike Douglass
 */
public interface PooledBuffersMBean extends ConfBaseMBean,
        PooledBuffersProperties {
  /**
   * @return buffer usage stats
   */
  @MBeanInfo("Small buffer statistics")
  String getSmallBufferPoolStats();

  /**
   * @return buffer usage stats
   */
  @MBeanInfo("Medium buffer statistics")
  String getMediumBufferPoolStats();

  /**
   * @return buffer usage stats
   */
  @MBeanInfo("Large buffer statistics")
  String getLargeBufferPoolStats();
}
