/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.android.barcodescanner;

import com.google.zxing.Result;
import com.google.zxing.ResultPoint;

/**
 * 条码扫描监听器
 */
public interface BarcodeScanListener {
	/**
	 * 当启动扫描
	 */
	public void onStartScan();
	
	/**
	 * 当找到可能的结果点
	 * @param resultPoint
	 */
	public void onFoundPossibleResultPoint(ResultPoint resultPoint);
	
	/**
	 * 当找到条码
	 * @param result
	 * @param bitmapByteArray
	 * @param scaleFactor
	 * @return 是否继续扫描
	 */
	public boolean onFoundBarcode(Result result, byte[] bitmapByteArray, float scaleFactor);
	
	/**
	 * 当没有找到条码
	 */
	public void onUnfoundBarcode();
	
	/**
	 * 当停止扫描，当扫描到条码时会在调用onFoundBarcode()之前调用此方法
	 */
	public void onStopScan();
	
	/**
	 * 当释放
	 */
	public void onRelease();
}
