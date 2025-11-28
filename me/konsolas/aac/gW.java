/*    */ package me.konsolas.aac;final class gw extends gK { private final Object c; public int hashCode() {
/*  2 */     return 0;
/*    */   }
/*    */   private final Method a; private static final String d;
/*    */   public boolean equals(Object paramObject) {
/*  6 */     return paramObject instanceof gw;
/*    */   }
/*    */   
/*    */   gw(Object paramObject, Method paramMethod) {
/*    */     this.c = paramObject;
/* 11 */     this.a = paramMethod; } public List a(List paramList, String paramString, long paramLong) {
/*    */     
/* 13 */     try { X509Certificate[] arrayOfX509Certificate = (X509Certificate[])paramList.toArray((Object[])new X509Certificate[paramList.size()]); return (List)this.a.invoke(this.c, new Object[] { arrayOfX509Certificate, d, paramString }); } catch (InvocationTargetException invocationTargetException) { SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(invocationTargetException.getMessage()); sSLPeerUnverifiedException.initCause(invocationTargetException); throw sSLPeerUnverifiedException; }
/* 14 */     catch (IllegalAccessException illegalAccessException) { throw new AssertionError(illegalAccessException); }
/*    */   
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = nc.a(-3294312606125337283L, 1644481581713961294L, MethodHandles.lookup().lookupClass()).a(166506180942429L) ^ 0x6E1DE9DF4315L;
/*    */     "幋ԍ崞햳쓽膹⋨?菩铑ﯺᒴ跘䤑䛸䶞⾱㥑".toCharArray()[9] = (char)("幋ԍ崞햳쓽膹⋨?菩铑ﯺᒴ跘䤑䛸䶞⾱㥑".toCharArray()[9] ^ 0x433C);
/*    */     "ꨲ쒇혓㴌".toCharArray()[1] = (char)("ꨲ쒇혓㴌".toCharArray()[1] ^ 0x3E72);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(da$gx.U("幋ԍ崞햳쓽膹⋨?菩铑ﯺᒴ跘䤑䛸䶞⾱㥑".toCharArray(), (short)18844, true, false))).init(2, SecretKeyFactory.getInstance(da$gx.U("ꨲ쒇혓㴌".toCharArray(), (short)10850, false, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ʡ茙徭?⋻퓬揖楮".toCharArray()[5] = (char)("ʡ茙徭?⋻퓬揖楮".toCharArray()[5] ^ 0x7D4C);
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */