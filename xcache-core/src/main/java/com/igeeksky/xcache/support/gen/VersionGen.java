/*
 * Copyright 2017 Tony.lau All rights reserved.
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

package com.igeeksky.xcache.support.gen;

import com.igeeksky.xcache.util.BeanUtils;
import com.igeeksky.xcache.util.NumUtils;

/**
 * @author Tony.Lau
 * @blog: https://my.oschina.net/xcafe
 * @createTime 2017-03-01 04:30:46
 */
public class VersionGen {
	
	public static Long gen(Object value) {
		Object temp = BeanUtils.getBeanProperty(value, "version");
		return NumUtils.getLong(temp);
	}
	
	private VersionGen(){}

}
