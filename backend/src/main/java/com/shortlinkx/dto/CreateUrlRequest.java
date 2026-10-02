package com.shortlinkx.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDateTime;
public record CreateUrlRequest(@NotBlank @Pattern(regexp="https?://.+",message="longUrl must be a valid HTTP(S) URL") String longUrl,String customAlias,LocalDateTime expiresAt) {}
