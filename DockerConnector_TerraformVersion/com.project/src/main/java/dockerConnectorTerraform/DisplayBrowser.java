package dockerConnectorTerraform;

import java.io.IOException;

import config.Utility;

public class DisplayBrowser {
	
	public void displayBrowser(String globalPath) throws IOException{
		
		Utility.scriptShellCall(globalPath + "Init_Deploy_Undeploy_Tasks/launchBrowser.sh", "" , "", "");
		
	}

}
