
package org.mule.module.facebook.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.module.facebook.FacebookConnector;


/**
 * A <code>FacebookConnectorCapabilitiesAdapter</code> is a wrapper around {@link FacebookConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-24T12:40:55-05:00", comments = "Build master.1920.518defc")
public class FacebookConnectorCapabilitiesAdapter
    extends FacebookConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == ModuleCapability.OAUTH2_CAPABLE) {
            return true;
        }
        return false;
    }

}