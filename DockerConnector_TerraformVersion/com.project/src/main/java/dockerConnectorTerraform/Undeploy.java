package dockerConnectorTerraform;

import java.io.IOException;

import config.Utility;

public class Undeploy {

	public void undeployTerraform(String globalPath) throws IOException {

		Utility.scriptShellCall(globalPath + "Init_Deploy_Undeploy_Tasks/undeploy.sh", "", "", "");

	}

}
