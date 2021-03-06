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
package org.bedework.util.jms.listeners;

import org.bedework.util.jms.NotificationException;
import org.bedework.util.jms.events.SysEvent;

/** This is the implementation of a notifications action class which logs
 * system events.
 *
 * @author Mike Douglass
 */
public class SysEventLoggerAction extends SysEventActionClass {
  /**
   */
  public SysEventLoggerAction() {
  }

  @Override
  public void action(final SysEvent ev) throws NotificationException {
    trace(ev.toString());
  }
}
