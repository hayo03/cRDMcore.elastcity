package dockerConnectorDockerMachine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import config.Utility;

public class DockerfileGeneratorJson_Input {

	public static void parser(String globalPath) throws IOException, JSONException {

		String content, DockerImage;
		Boolean error_result;

		System.out
				.println("************ Step 2 : Create docker images (Dockerfile - Docker HUB ***********************");

		content = Utility.fileContent(globalPath + "DSM_voting.json");
		// Convert JSON string to JSONObject
		JSONObject json = new JSONObject(content);
		JSONObject values = json.getJSONObject("Entities");
		JSONObject services = values.getJSONObject("Services");
		JSONArray keys = services.names();

		for (int i = 0; i < keys.length(); ++i) {

			// Here's your key
			String key = keys.getString(i);

			// Here's your value
		    //String value = services.getString (key); 
			JSONObject value = services.getJSONObject(key);

			/**************** Test *****************/
			System.out.println(key);
			System.out.println(value.getString("image"));

			DockerImage = value.getString("image");

			error_result = Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/PullImagesDockerHub.sh",
					"docker", DockerImage, "");

			// read any errors from the attempted command
			if (error_result == true) {
				System.out.println("Image doesn't exist in Docker Hub  =>  Generate dockerfile");

				System.out.println("********* Image name for which we will create dockerfile *************");
				System.out.println(DockerImage);

				JSONObject images = values.getJSONObject("Images");
				JSONArray keys2 = images.names();

				for (int j = 0; j < keys2.length(); ++j) {

					String key2 = keys2.getString(j);
					JSONObject value2 = images.getJSONObject(key2);

					if (key2.equals(DockerImage)) {

						// Registry will be used to create image
						String registry = value2.getString("registry");

						try {
							File dockerfile = new File(globalPath + "Dockerfile");
							/*
							 * If file gets created then the createNewFile()
							 * method would return true or if the file is
							 * already present it would return false
							 */
							boolean fvar = dockerfile.createNewFile();
							if (fvar) {

								System.out.println("File has been created successfully");

							} else {
								System.out.println("File already present at the specified location");
							}

							// Write Content
							// Set the second parameter of FileWriter to "true"
							// to append to file.
							FileWriter writer = new FileWriter(dockerfile, true);
							writer.write("FROM " + registry + "\n" + "RUN apt-get install -y " + registry + "\n");

							// writer.write("FROM debian:jessie");
							writer.close();
							
							// Execute docker Build
							Utility.scriptShellCall(globalPath + "Scripts/DockerMachineScripts/BuildImages.sh", "", "",
									"");


						} catch (IOException e) {
							System.out.println("Exception Occurred:");
							e.printStackTrace();
						}
					}
				}

			}

		}

	}

}