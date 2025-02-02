/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.ecod.watson;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import com.ibm.watson.developer_cloud.concept_insights.v2.ConceptInsights;
import com.ibm.watson.developer_cloud.concept_insights.v2.model.Annotations;
import com.ibm.watson.developer_cloud.concept_insights.v2.model.Graph;

public class ConceptInsightsTest
{
	public static void main(String[] args) throws URISyntaxException, FileNotFoundException
	{
		final ConceptInsights service = new ConceptInsights();
		service.setEndPoint
		(
				"https://gateway.watsonplatform.net/concept-insights/api"
		);
		service.setUsernameAndPassword
		(
				// Bluemix Watson Content Insights service account username from env variables
				"a425694b-f06a-4956-886d-e2e9e66d7c65",
				// Bluemix Watson Content Insights service account password from env variables
				"FPhRNXvLnJ9m"
		);

		final Annotations annotations =
				service.annotateText
				(
						Graph.WIKIPEDIA,
						"NY JUG session is on Cognitive Computing using Java"
				);

		System.out.println(annotations);
		
	}

}

