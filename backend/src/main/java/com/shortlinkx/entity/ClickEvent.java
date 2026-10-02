package com.shortlinkx.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="click_events", indexes=@Index(name="idx_click_code", columnList="shortCode"))
public class ClickEvent {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false,length=32) private String shortCode;
    private String ipAddress,userAgent,referrer,device,browser,operatingSystem;
    @Column(nullable=false) private LocalDateTime clickedAt;
    public ClickEvent() {}
    public ClickEvent(String code,String ip,String ua,String ref,String device,String browser,String os){shortCode=code;ipAddress=ip;userAgent=ua;referrer=ref;this.device=device;this.browser=browser;operatingSystem=os;clickedAt=LocalDateTime.now();}
    public String getShortCode(){return shortCode;} public LocalDateTime getClickedAt(){return clickedAt;} public String getDevice(){return device;} public String getBrowser(){return browser;} public String getOperatingSystem(){return operatingSystem;}
}
