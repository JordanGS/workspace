/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
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
 * This file is based on the Paros code file ReportLastScan.java
 */
package org.zaproxy.zap.extension.exportreport.FileChooser;

import javax.swing.ImageIcon;

/*
 * AUTHOR		:	GORAN SARENKAPA - JordanGS
 * SPONSOR		:	RYERSON UNIVERSITY
 */

class FileType
{
	private int		index;
	private String	search;
	private String	type;
	private String	extension;
	private String	description;
	ImageIcon		icon;

	public FileType(int index, String search, String type, String extension, String description, String icon)
	{
		this.index = index;
		this.search = search;
		this.type = type;
		this.extension = extension;
		this.description = description;
		this.icon = Utils.createImageIcon(icon);
	}

	public int getIndex()
	{
		return index;
	}

	public String getSearch()
	{
		return search;
	}

	public String getType()
	{
		return type;
	}

	public String getExtension()
	{
		return extension;
	}

	public String getDescription()
	{
		return description;
	}

	public ImageIcon getIcon()
	{
		return icon;
	}
}