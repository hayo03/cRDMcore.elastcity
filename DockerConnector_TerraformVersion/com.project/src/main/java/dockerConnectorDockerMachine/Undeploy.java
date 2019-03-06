package dockerConnectorDockerMachine;

import java.io.IOException;

import config.Utility;

public class Undeploy {

	public void undeploy(String globalPath) throws IOException {

		Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/Undeploy.sh", "", "", "");

	}


}
