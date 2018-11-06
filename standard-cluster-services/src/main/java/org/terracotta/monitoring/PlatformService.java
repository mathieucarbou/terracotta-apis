/*
 *
 *  The contents of this file are subject to the Terracotta Public License Version
 *  2.0 (the "License"); You may not use this file except in compliance with the
 *  License. You may obtain a copy of the License at
 *
 *  http://terracotta.org/legal/terracotta-public-license.
 *
 *  Software distributed under the License is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 *  the specific language governing rights and limitations under the License.
 *
 *  The Covered Software is Entity API.
 *
 *  The Initial Developer of the Covered Software is
 *  Terracotta, Inc., a Software AG company
 *
 */
package org.terracotta.monitoring;

import com.tc.classloader.CommonComponent;
import java.io.InputStream;


/**
 * A Service for entities to interact with Platform
 */
@CommonComponent
public interface PlatformService {
  /**
   * Dumps platform state into logs
   */
  void dumpPlatformState();

  /**
   * Stops the server
   */
  void stopPlatform();
  
  /**
   * A Fatal error has occurred.Server will exit.
   * 
   * @param description of the error
   */
  void fatalError(String description);
  /**
   * Server uptime.
   * 
   * @return the milliseconds that have passed since the server process was started
   */
  long uptime();

  /**
   * Provides the raw config file from server startup
   */
  InputStream getPlatformConfiguration();
}
