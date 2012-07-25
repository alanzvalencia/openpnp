/*
 	Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 	
 	This file is part of OpenPnP.
 	
	OpenPnP is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpenPnP is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpenPnP.  If not, see <http://www.gnu.org/licenses/>.
 	
 	For more information about OpenPnP visit http://openpnp.org
*/

package org.openpnp.spi;

import org.openpnp.gui.support.Wizard;
import org.openpnp.model.Location;

/**
 * Defines a simple interface to some type of device that can be actuated
 * on the machine or on a head. This is a minimal interface and it is
 * expected that concrete implementations may have many other capabilities
 * exposed in their specific implementations. 
 */
public interface Actuator {
	/**
	 * The unique id of the Actuator. This id should be unique for a given
	 * head if the Actuator is attached to a head, or unique within machine
	 * Actuators.
	 * @return
	 */
	public String getId();
	
	/**
	 * Turns the Actuator on or off.
	 * @param on
	 * @throws Exception
	 */
	public void actuate(boolean on) throws Exception;
	
	/**
	 * Gets a Wizard that can be used to confgure this Actuator.
	 * @return
	 */
	public Wizard getConfigurationWizard();
	
	public Location getLocation();
	
	public void setLocation(Location location);
}