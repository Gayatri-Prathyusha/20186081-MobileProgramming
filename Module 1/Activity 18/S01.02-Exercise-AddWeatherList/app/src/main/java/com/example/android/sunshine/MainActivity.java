/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weatherfake ={"Achalpur        Fri 09:59       Scattered clouds.       Mild.       25 °C",	"Haldwani       Fri 09:59       Sunny.      Mild.       8 °C" ,"New Okhla Industrial Development Authority        Fri 09:59	Fog. Cool.	13 °C",
        "Adoni	Fri 09:59	Sunny. Pleasantly warm.	29 °C"	,"Hamirpur	Fri 09:59	Partly sunny. Mild.	22 °C	","Nizamabad	Fri 09:59	Sunny. Pleasantly warm.	28 °C",
        "Agartala	Fri 09:59	Fog. Warm.	28 °C" , " Hanumangarh	Fri 09:59	Fog. Cool.	14 °C","Nohar	Fri 09:59	Fog. Cool.	14 °C"};

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String fakeweather: weatherfake) {
            mWeatherTextView.append(fakeweather + "\n\n\n");
        }
    }
}