package com.shortlinkx.dto;
import java.time.LocalDateTime;
import java.util.List;
public record AnalyticsResponse(String shortCode,long totalClicks,List<ClickSummary> recentClicks){public record ClickSummary(LocalDateTime clickedAt,String device,String browser,String operatingSystem){}}
