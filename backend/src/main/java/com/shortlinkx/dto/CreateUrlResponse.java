package com.shortlinkx.dto;
import java.time.LocalDateTime;
public record CreateUrlResponse(String shortCode,String shortUrl,String longUrl,LocalDateTime expiresAt) {}
