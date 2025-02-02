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

import java.io.File;

import com.ibm.watson.developer_cloud.speech_to_text.v1.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;


/**
 * Recognize a sample wav file and print the transcript into the console output. Make sure you are
 * using UTF-8 to print messages; otherwise, you will see question marks.
 */
public class SpeechToTextExample {

  public static void main(String[] args) {
	  SpeechToText service = new SpeechToText();
	  service.setUsernameAndPassword("d2334b1a-4c18-41df-8dab-3659c0dbfb3d", "dRGqpp6tvCXD");
	  service.setEndPoint("https://stream.watsonplatform.net/speech-to-text/api");
	  RecognizeOptions options = new RecognizeOptions();
	  options.contentType("audio/wav");
	  options.continuous(true);
	  options.interimResults(true);

    File audio = new File("input/Q2.wav");
    SpeechResults transcript = service.recognize(audio, options);

    System.out.println(transcript);
    
  }
  
}
