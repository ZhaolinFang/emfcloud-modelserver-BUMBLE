/********************************************************************************
 * Copyright (c) 2019-2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.modelserver.common;

public interface ModelServerPathsV2 {
   String BASE_PATH = "api/v2";

   String MODEL_BASE_PATH = "models"; // accepts query parameter "modeluri"
   String MODEL_ELEMENT = "modelelement"; // accepts query parameters "modeluri" and either "elementId" or "elementname"

   String MODEL_URIS = "modeluris";

   String SUBSCRIPTION = "subscribe"; // accepts query parameter "modeluri"
   String CLOSE = "close"; // accepts query parameter "modeluri"

   String SAVE = "save"; // accepts query parameter "modeluri"
   String SAVE_ALL = "saveall";
   String UNDO = "undo"; // accepts query parameter "modeluri"
   String REDO = "redo"; // accepts query parameter "modeluri"

   String VALIDATION = "validation"; // accepts query parameter "modeluri"
   String VALIDATION_CONSTRAINTS = "validation/constraints"; // accepts the query parameter "modeluri"

   String TYPE_SCHEMA = "typeschema"; // accepts query parameter "modeluri"
   String UI_SCHEMA = "uischema"; // accepts query parameter "schemaname"

   String SERVER_CONFIGURE = "server/configure";
   String SERVER_PING = "server/ping";

   String FETCH = "fetch"; // accepts query parameter "location" and "modeluri"
   String FETCH_ALL = "fetchall";

   String SAVE2 = "save2"; // accepts query parameter "location" and "modeluri"
   String SAVE2_ALL = "save2all";

}
