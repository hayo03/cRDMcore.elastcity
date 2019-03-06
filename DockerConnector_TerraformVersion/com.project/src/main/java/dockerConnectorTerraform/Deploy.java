package dockerConnectorTerraform;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import config.Utility;

public class Deploy {

	public void deployment(String globalPath) throws IOException, JSONException {

		Utility.scriptShellCall(globalPath + "Init_Deploy_Undeploy_Tasks/deploy.sh", "" , "", "");
	}
}