package com.shortlinkx.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="short_urls", indexes=@Index(name="idx_short_code", columnList="shortCode", unique=true))
public class ShortUrl {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false, length=2048) private String longUrl;
    @Column(nullable=false, unique=true, length=32) private String shortCode;
    private LocalDateTime expiresAt;
    @Column(nullable=false) private long clickCount=0;
    private LocalDateTime createdAt;
    public ShortUrl() {}
    public ShortUrl(String longUrl,String shortCode,LocalDateTime expiresAt){this.longUrl=longUrl;this.shortCode=shortCode;this.expiresAt=expiresAt;this.createdAt=LocalDateTime.now();}
    public String getLongUrl(){return longUrl;} public String getShortCode(){return shortCode;} public LocalDateTime getExpiresAt(){return expiresAt;} public long getClickCount(){return clickCount;} public LocalDateTime getCreatedAt(){return createdAt;}
    public void incrementClicks(){clickCount++;}
}
