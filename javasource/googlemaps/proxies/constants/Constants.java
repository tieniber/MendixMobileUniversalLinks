// This file was generated by Mendix Modeler 7.18.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlemaps.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the GoogleMaps module

	/**
	* A key is your application's Google API key. This key identifies your application for purposes of quota management.
	*/
	public static java.lang.String getAPI_Key()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("GoogleMaps.API_Key");
	}
}