package monitoringTask;

import java.io.IOException;

import org.json.JSONException;

import config.Utility;

public class Monitor {
	public void monitoringApp(String globalPath) throws IOException, JSONException {

		Utility.scriptShellCall(globalPath + "Init_Deploy_Undeploy_Tasks/monitor.sh", "" , "", "");
	}

}
