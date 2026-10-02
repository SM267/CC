package com.shortlinkx.service;
public final class Base62{private static final char[] A="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();private Base62(){}public static String encode(long n){if(n==0)return"0";StringBuilder s=new StringBuilder();while(n>0){s.append(A[(int)(n%62)]);n/=62;}return s.reverse().toString();}}
