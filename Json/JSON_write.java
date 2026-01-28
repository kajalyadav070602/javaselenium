package Json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;

public class JSON_write {

	public static void main(String[] args) {
		JSONObject JsRoot = new JSONObject();
		JsRoot.put("firstname", "Kajal");
		JsRoot.put("last", "Yadav");
		JSONObject personalObject = new JSONObject();
		personalObject.put("mother", "Savita");
		personalObject.put("father", "Jay prakash");
		personalObject.put("DOB", "07/06/2002");
		JsRoot.put("personal", personalObject);
		JSONArray hobbiesArr = new JSONArray();
		hobbiesArr.put("travelling");
		hobbiesArr.put("cricket");
		JsRoot.put("hobbies",hobbiesArr);
		JSONObject personalObject1 = new JSONObject();
		personalObject1.put("Grandmother", "Gulabi");
		personalObject1.put("Grandfather", "Birju ");
		personalObject1.put("Email id", "kajal070602@gmail.com");
		JsRoot.put("", personalObject1);
		
		
		System.out.println(JsRoot);
	
	
	
	
	
	}

}
