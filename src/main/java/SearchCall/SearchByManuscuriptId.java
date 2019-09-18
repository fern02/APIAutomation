package SearchCall;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import com.sntps.acdc.post.JsonCreator;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;

import java.io.InputStream;

import org.testng.annotations.Test;

import com.sntps.acdc.post.TestProperties;
import com.sntps.acdc.utils.Utility;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SearchByManuscuriptId {
	
	static String Search_Article=null;

	@Test
	public void Search() throws IOException {
		
		String param = "APPABeta150-D-18-00102REG1";
		final URL url = new URL("http://cms-services-qa.dev.cf.private.springer.com/search?secondary_id=" + param);
				final HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
				final InputStream in = (InputStream) httpConnection.getInputStream();
				String encoding = httpConnection.getContentEncoding();
				encoding = encoding == null ? "UTF-8" : encoding;
				final String body = IOUtils.toString(in, encoding);
				
				System.out.println(body);
				
				
				
				JSONObject jsonObject = new JSONObject();
				
				
				
				//int Enrich_Article_Get = org.apache.commons.lang3.StringUtils.countMatches(routesConcatenation, "enrich_article");
				
				

				
				
				//String stringArrayArticles = body.;
				
				//System.out.println(stringArrayArticles);
		
		
		
		/*String manuscriptId="APPABeta150-D-18-00102REG1";
		// TODO Auto-generated method stub
		
		
		RestAssured.baseURI = Utility.HTTP_CMS_SERVICES_QA + "search?secondary_id=APPABeta150-D-18-00102REG1";
		
System.out.println("GET Call URL :"+RestAssured.baseURI);
		
		
		RequestSpecification httpRequest = RestAssured.given();
		
		/*----------Search GET call--------------*/
		//Response response = httpRequest.request(Method.GET);	
		//String extractResponseSearch = responseSearch.getBody().jsonpath().asString();
		
		//ResponseBody responseBody = response.getBody();
		//List<String> stringArrayArticles = responseBody.jsonPath().get("_links.rel");
		//Search_Article = stringArrayArticles.toString();
		//System.out.println("Response Body is =>  " +Search_Article);
		//List<String> stringArrayArticles = extractResponseSearch.jsonPath().get("_links.rel");
				//.jsonPath().toString();
		//Search_Article = stringArrayArticles.toString();
		//System.out.println("Search" +  extractResponseSearch); */
	}

}
