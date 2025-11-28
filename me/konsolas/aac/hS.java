/* 1 */ package me.konsolas.aac;class hs extends ThreadLocal { protected DateFormat a(long paramLong) { paramLong = a ^ paramLong; SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b, Locale.US);
/*   */ 
/*   */ 
/*   */     
/* 5 */     simpleDateFormat.setLenient(false);
/* 6 */     simpleDateFormat.setTimeZone(eO.e);
/*   */     return simpleDateFormat; }
/*   */ 
/*   */   
/*   */   private static final long a = nc.a(-7158714377263416080L, -4254593445510524432L, MethodHandles.lookup().lookupClass()).a(37554848377731L);
/*   */   private static final String b;
/*   */   
/*   */   protected Object initialValue() {
/*   */     long l1 = a ^ 0x32E90EEF87BL, l2 = l1 ^ 0x23B67FA25F4FL;
/*   */     return a(l2);
/*   */   }
/*   */   
/*   */   static {
/*   */     long l = a ^ 0x60A901203973L;
/*   */     "씍̏剚嫾⼢詚얊줄蠔ᇴ令퓒웶㉃ᓚỨ⁗㮩⯮".toCharArray()[16] = (char)("씍̏剚嫾⼢詚얊줄蠔ᇴ令퓒웶㉃ᓚỨ⁗㮩⯮".toCharArray()[16] ^ 0x15BC);
/*   */     "㴧\031奘㓧".toCharArray()[1] = (char)("㴧\031奘㓧".toCharArray()[1] ^ 0x720A);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(hY$g6.H("씍̏剚嫾⼢詚얊줄蠔ᇴ令퓒웶㉃ᓚỨ⁗㮩⯮".toCharArray(), (short)10939, (byte)5, (byte)4))).init(2, SecretKeyFactory.getInstance(hY$g6.H("㴧\031奘㓧".toCharArray(), (short)7657, (byte)2, (byte)2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "믎朩擦Ⴈ?葛ꄞ겅읖⮋Ꟁ힉₉墸ﱍ脝캗✻ﺗ툝꧕뀈ᇺ蝩?畀◯".toCharArray()[16] = (char)("믎朩擦Ⴈ?葛ꄞ겅읖⮋Ꟁ힉₉墸ﱍ脝캗✻ﺗ툝꧕뀈ᇺ蝩?畀◯".toCharArray()[16] ^ 0x70EB);
/*   */   }
/*   */   
/*   */   private static String a(byte[] paramArrayOfbyte) {
/*   */     byte b1 = 0;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*   */     for (byte b2 = 0; b2 < i; b2++) {
/*   */       int j;
/*   */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*   */         arrayOfChar[b1++] = (char)j;
/*   */       } else if (j < 224) {
/*   */         char c = (char)((char)(j & 0x1F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } else if (b2 < i - 2) {
/*   */         char c = (char)((char)(j & 0xF) << 12);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } 
/*   */     } 
/*   */     return new String(arrayOfChar, 0, b1);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */