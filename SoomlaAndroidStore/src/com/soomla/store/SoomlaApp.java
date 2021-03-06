/*
 * Copyright (C) 2012-2014 Soomla Inc.
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

package com.soomla.store;

import android.app.Application;
import android.content.Context;

public class SoomlaApp extends Application{

	protected static SoomlaApp mInstance = null;

	public static SoomlaApp instance() {
    	return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        context = getApplicationContext();
    }


    /** Setters and Getters */

    public static void setExternalContext(Context oContext) {
        context = oContext;
    }

    public static Context getAppContext() {
        return context;
    }


    /** Private Members */

    private static Context context;
}
