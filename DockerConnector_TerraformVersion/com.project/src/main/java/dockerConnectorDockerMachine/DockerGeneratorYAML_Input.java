package dockerConnectorDockerMachine;

import java.io.File;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import config.Utility;

public class DockerGeneratorYAML_Input {

	static void parser(String globalPath) throws IOException, JSONException {

		String content, DockerImage, Dockerfile_Image_Path;
		Boolean error_result;

		System.out.println(
				"************ Step 2 : Create dokcer images (Dockerfile - Docker HUB **************");

		content = Utility.fileContent(globalPath + "docker-compose.json");
		// Convert JSON string to JSONObject
		JSONObject json = new JSONObject(content);
		JSONObject services = json.getJSONObject("Services");
		JSONArray keys = services.names();

		for (int i = 0; i < keys.length(); ++i) {

			String key = keys.getString(i); // Here's your key

			// String value = services.getString (key); // Here's your value
			JSONObject value = services.getJSONObject(key);
			DockerImage = value.getString("image");
			Dockerfile_Image_Path = value.getString("build");

			error_result = Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/PullDockerHubImages.sh",
					"docker", DockerImage, "");

			// read any errors from the attempted command
			if (error_result == true || !(Dockerfile_Image_Path.equals(null))) {
				System.out.println("Image doesn't exist in Docker Hub  =>  Generate dockerfile");

				try {
					File dockerfile = new File(globalPath + "Dockerfile");
					/*
					 * If file gets created then the createNewFile() method
					 * would return true or if the file is already present it
					 * would return false
					 */
					boolean fvar = dockerfile.createNewFile();
					if (fvar) {

						System.out.println("File has been created successfully");

					} else {
						System.out.println("File already present at the specified location");
					}

					// Execute docker Build
					Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/BuildImages.sh", "", "", "");

				} catch (IOException e) {
					System.out.println("Exception Occurred:");
					e.printStackTrace();
				}
			}
		}

	}

}
