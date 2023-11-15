package KeblesTrading.testDataObject;

import gherkin.deps.com.google.gson.internal.LinkedTreeMap;

public class keblesTrading {
	public String SearchDetails;
	

	public keblesTrading(LinkedTreeMap<String, ?> map) {
		this.SearchDetails = (String) map.get("SearchDetails");
	}

	public String getSearchDetails() {
		return SearchDetails;
	}

}