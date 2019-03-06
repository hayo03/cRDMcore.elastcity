package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;

//import config.YamlToJson;
//import dockerConnectorDockerMachine.Deploy;
//import dockerConnectorDockerMachine.DockerfileGeneratorJson_Input;
//import dockerConnectorDockerMachine.Undeploy;
import dockerConnectorTerraform.*;
import monitoringTask.Monitor;

public class Test {

	private static String InputGloballFilePath = "/home/hayetto/Desktop/DockerConnector_MonitoringTask/";
	//private static DockerfileGeneratorJson_Input dockerfile_Generator = new DockerfileGeneratorJson_Input();
	//private static YamlToJson yamlToJson = new YamlToJson();
	//private static Deploy deployment_App = new Deploy();
	//private static Undeploy undeploy = new Undeploy();
	
	
	
	private static AwsCredentialsParser awsCredentialsParser = new AwsCredentialsParser();
	private static Init init = new Init();
	private static Deploy deploy = new Deploy();
	private static Undeploy undeploy = new Undeploy();
	private static DisplayBrowser display = new DisplayBrowser();
	
	
	private static Monitor monitor = new Monitor();
	

	public static void main(String[] args) throws IOException, JSONException {

		/*************************** Version1: Docker Machine ************************/
		
		
		/***************************
		 * Generate Json file "Docker_DSM.json" from yml file "dokcer_DSM.yml"
		 * to recuperate data
		 ****************************/
		//yamlToJson.generateJsonFile(InputGloballFilePath + "docker-compose.yml");

		/******************************************
		 * Parsing Docker_DSM.json file
		 ********************************/
		//dockerfile_Generator.parser(InputGloballFilePath);
		
		/******************************************
		 * Deploy task: Deployment
		 ********************************/
		//deployment_App.deployment(InputGloballFilePath);
		
		
		/******************************************
		 * Undeploy task: Undeployment
		 ********************************/
		//undeploy.undeploy(InputGloballFilePath);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/****************** version2: Terraform ***************************************/
		
		/******************************************
		 * Init task (Create infrastructure - Terraform): Initialization
		 ********************************/
		
		//awsCredentialsParser.generateTerraformCredentialsFile(InputGloballFilePath);
		//init.createInfrastructure(InputGloballFilePath);

		
		
		/******************************************
		 * Deploy task: Deployment
		 ********************************/
		//deploy.deployment(InputGloballFilePath);
		
		
		
		
		/******************************************
		 * display application in the browser 
		 ********************************/
		//display.displayBrowser(InputGloballFilePath);
		
		

		
		/******************************************
		 * Monitoring task: Monitoring
		 ********************************/
	
		//monitor.monitoringApp(InputGloballFilePath);
		
		

		/******************************************
		 * Undeploy task: Undeployment
		 ********************************/
	
		undeploy.undeployTerraform(InputGloballFilePath);


	}

}
