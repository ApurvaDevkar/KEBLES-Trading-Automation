package KeblesTrading.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import com.google.common.reflect.TypeToken;

import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.GsonBuilder;
import gherkin.deps.com.google.gson.JsonIOException;
import gherkin.deps.com.google.gson.internal.LinkedTreeMap;

public class JsonDataReader {
	static GsonBuilder builder = new GsonBuilder();
	static Gson gson = builder.setPrettyPrinting().create();
  

	// Receives file path, object name  and returns Map of the data
 	@SuppressWarnings({ "unchecked", "rawtypes" })
	public
	static LinkedTreeMap<String,String> getMapfromJson(String filePath, String testDataName )  {
 		Reader reader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath));

		Type type = new TypeToken<Map<String, ?>>() {
		}.getType();

		Map<String, ?> fromJson = gson.fromJson(reader, type);

		return (LinkedTreeMap) fromJson.get(testDataName);
 			
		}
 	
 	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Map<String, String>> getListfromJson(String filePath, String testDataName) {
		Reader reader = new InputStreamReader(
				Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath));

		Type type = new TypeToken<Map<String, ?>>() {
		}.getType();

		Map<String, ?> fromJson = gson.fromJson(reader, type);

		return (List<Map<String, String>>) fromJson.get(testDataName);

	}
	static void generateJsonTemplate(Object object, String ClassName) {

		try {
			File file = new File(JsonDataReader.class.getResource("/testdata/" + ClassName + ".json").toURI());
			FileWriter writer = new FileWriter(file);

			gson.toJson(object, writer);

			writer.flush();
			writer.close();

		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
