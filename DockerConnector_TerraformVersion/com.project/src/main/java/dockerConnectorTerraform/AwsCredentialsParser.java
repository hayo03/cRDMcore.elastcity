package dockerConnectorTerraform;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import config.Utility;

public class AwsCredentialsParser{
	
	String content, access_key, secret_key;
	JSONObject json, credentialsValues;
	JSONObject nb_Instances;
	String nb_Worker,nb_Manager;
	
	public void generateTerraformCredentialsFile (String globalPath) throws IOException, JSONException {
		
		
		
		/****************** Extract data (AWS credentials) ******************************/
		content = Utility.fileContent(globalPath + "input_files/awsCredentials.json");
		// Convert JSON string to JSONObject
		 json = new JSONObject(content);
		 credentialsValues = json.getJSONObject("accesscredentials");
		 access_key = credentialsValues.getString("access-key");
		 secret_key = credentialsValues.getString("secret-key");
		 
		 nb_Instances = json.getJSONObject("nb_Instances");
		 nb_Worker = nb_Instances.getString("nb_Worker");
		 //nb_Manager = nb_Instances.getString("nb_Manager");
		 
		 
		 System.out.println(access_key);
		 System.out.println(secret_key);
		 System.out.println(nb_Worker);
		 //System.out.println(nb_Manager);

		 

			
			/****************** Save in Terraform file (terraform.tfvars) ******************************/
		 try {
			 File terraformCredentialFile = new File(globalPath + "Init_Deploy_Undeploy_Tasks/terraform.tfvars");
			 System.out.println("File has been created successfully");	/*
				 * If file gets created then the createNewFile() method
				 * would return true or if the file is already present it
				 * would return false
				 */
				//boolean VerifyFileCreation = terraformCredentialFile.createNewFile();
				//if (VerifyFileCreation) {

					//System.out.println("File has been created successfully");

				//} else {
				//	System.out.println("File already present at the specified location");
				//}

		     // Write Content
			// Set the second parameter of FileWriter to "true"
			// to append to file.
			FileWriter writer = new FileWriter(terraformCredentialFile);
			writer.write("access_key = \"" + access_key + "\"\n" + "secret_key =\"" + secret_key + "\"\n"+"nb_Worker = \"" + nb_Worker+"\"\n" );
			writer.close();

			} catch (IOException e) {
				System.out.println("Exception Occurred:");
			}
			
}


}
