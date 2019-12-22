package com.testUtils;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.apache.commons.lang3.time.DateUtils;

public class DateFunctions {
	
	public String convertDate(int unixDate,String location)
	{
		java.util.Date time=new java.util.Date((long)unixDate*1000);
		time = DateUtils.addDays(time,1);
		// Conversion
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		sdf.setTimeZone(TimeZone.getTimeZone(location));
		return sdf.format(time);
	}

}
