package com.shortlinkx.analytics;
public record ClickEventPayload(String shortCode,String ipAddress,String userAgent,String referrer,String device,String browser,String operatingSystem){}
