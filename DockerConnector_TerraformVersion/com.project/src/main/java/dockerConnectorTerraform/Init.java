package dockerConnectorTerraform;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import config.Utility;
import model.AccessCredential;

public class Init {


	public void createInfrastructure(String globalPath) throws IOException, JSONException {

		Utility.scriptShellCall(globalPath + "Init_Deploy_Undeploy_Tasks/init.sh", "", "", "");

	}

}
