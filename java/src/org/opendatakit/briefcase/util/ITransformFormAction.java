/*
 * Copyright (C) 2011 University of Washington.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.briefcase.util;

import org.opendatakit.briefcase.model.BriefcaseFormDefinition;

/**
 * Interface for actions that export different file formats.
 * These all work only on forms within the Briefcase storage area.
 *
 * E.g., CSV exports.
 * 
 * @author mitchellsundt@gmail.com
 *
 */
interface ITransformFormAction {
  /**
   * 
   * @return true if successful, false if there were one or more problems
   */
  boolean doAction();

  /**
   *
   * @return the total number of bad files skipped during the export process
   */
  FilesSkipped totalFilesSkipped();

  BriefcaseFormDefinition getFormDefinition();
}

enum FilesSkipped {
  NONE, SOME, ALL;
}