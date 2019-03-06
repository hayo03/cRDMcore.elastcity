package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class YamlToJson {

	public static String readYamlFile(String pathname) throws IOException {

		File file = new File(pathname);
		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);
		String lineSeparator = System.getProperty("line.separator");

		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}

	public static String getSourceFilePath(String YamlFilePath) {

		String inFile = null;
		if (YamlFilePath.length() != 0) {
			inFile = YamlFilePath;

		}
		return inFile;
	}

	public static String convertYamlToJson(String yaml) throws IOException {

		ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
		Object obj = yamlReader.readValue(yaml, Object.class);

		ObjectMapper jsonWriter = new ObjectMapper();
		return jsonWriter.writeValueAsString(obj);
	}

	public void generateJsonFile(String YamlFilePath) {

		// Get File Path
		String sourceFilePath = getSourceFilePath(YamlFilePath);

		// Load File content
		AtomicReference<String> content = new AtomicReference<String>();
		try {
			content.set(readYamlFile(sourceFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Json string
		String jsonStr = null;
		try {
			jsonStr = convertYamlToJson(content.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Print json file
		sourceFilePath = sourceFilePath.substring(0, sourceFilePath.length() - 3);
		sourceFilePath = sourceFilePath + "json";

		try {
			FileWriter fileWriter = new FileWriter(sourceFilePath);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(jsonStr);
			bufferedWriter.close();
			System.out.println(
					"\n\n**************************************************************** Step 1 : Generate Json file Docker_DSM.json from yml file dokcer_DSM.yml to recuperate data ****************************************************************");
			System.out.println("\nSucces: " + sourceFilePath + " File successfuly created!\n");
		} catch (IOException err) {
			System.out.println("Error writing to file: " + err);
		}
	}

}