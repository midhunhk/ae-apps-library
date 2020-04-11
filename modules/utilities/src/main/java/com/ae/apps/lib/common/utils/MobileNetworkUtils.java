/*
 * Copyright (c) 2015 Midhun Harikumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ae.apps.lib.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;

/**
 *  Some utility methods that work on mobile networks
 */
public class MobileNetworkUtils {

	/**
	 * Call a contact
	 * Declare the permission "android.permission.CALL_PHONE" in the Manifest to use this method
	 *
	 * @param contactNo the contact no
	 */
	@SuppressLint("MissingPermission")
	public static void callContact(Context context, String contactNo) {
		try {
			String uri = "tel:" + contactNo;
			Intent intent = new Intent(Intent.ACTION_CALL);
			intent.setData(Uri.parse(uri));
			context.startActivity(intent);
		} catch (Exception e) {
			// Report no exception
		}
	}

	/**
	 * Text a contact
	 * 
	 * @param contactNo contact number
	 */
	public static void textContact(Context context, String contactNo) {
		try {
			String uri = "smsto:" + contactNo;
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.putExtra("address", contactNo);
			intent.setData(Uri.parse(uri));
			context.startActivity(intent);
		} catch (Exception e) {
			// Report no exception
		}
	}

	/**
	 * This method checks whether Internet connectivity is available on the device
	 * 
	 * @param context the context
	 * @return true if internet connection available
	 */
	public static boolean isInternetAvailable(Context context) {
		// Request the Connectivity service to the OS
		ConnectivityManager connectivityManager = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);

		NetworkInfo networkInfo = connectivityManager != null ?
				connectivityManager.getActiveNetworkInfo() : null;

		// Check the current state of the Network Information
		if (networkInfo == null)
			return false;
		if (!networkInfo.isConnected())
			return false;
		return networkInfo.isAvailable();
	}

	/**
	 * Launches an Intent to open a web page
	 * 
	 * @param context the context
	 * @param url url
	 */
	public static void launchWebPage(Context context, String url) {
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		context.startActivity(i);
	}

}