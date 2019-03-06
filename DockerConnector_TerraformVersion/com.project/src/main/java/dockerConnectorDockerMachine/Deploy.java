package dockerConnectorDockerMachine;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import config.Utility;

public class Deploy {

	public void deployment(String globalPath) throws IOException, JSONException {

		// Variables contain characteristics of hostmachines
		String VM_Name = null, VM_CPU, VM_Memory, VM_host1, VM_host1_Name = null, Nb_Machine_str = null;

		// Variable contain number of hostmachines
		int NB_Machine = 0;

		// Variable contain input json file content
		String content;

		/**********************
		 * Application deployment
		 ****************************/

		content = Utility.fileContent(globalPath + "DSM_voting.json");
		// Convert JSON string to JSONObject
		JSONObject json = new JSONObject(content);
		JSONObject values = json.getJSONObject("Entities");
		JSONObject hostmachines = values.getJSONObject("Hostmachines");
		JSONArray keys = hostmachines.names();

		for (int i = 0; i < keys.length(); ++i) {

			String key = keys.getString(i); // Here's the key
			// each key
			JSONObject value = hostmachines.getJSONObject(key);
			VM_Name = value.getString("name");
			VM_CPU = value.getString("CPU");
			VM_Memory = value.getString("memory");
			
			System.out.println(VM_Name);
			System.out.println(VM_CPU);
			System.out.println(VM_Memory);

			Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/MachineCreate.sh", VM_Name, VM_CPU, VM_Memory);

			// Manager node = the first hostmachine
			VM_host1 = keys.getString(0);
			VM_host1_Name = hostmachines.getJSONObject(VM_host1).getString("name");
			NB_Machine = keys.length();
			Nb_Machine_str = Integer.toString(NB_Machine);

		}

		Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/SwarmCreate.sh", VM_host1_Name, Nb_Machine_str, "");
		Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/Deploy.sh", VM_host1_Name, "", "");

	}
}
