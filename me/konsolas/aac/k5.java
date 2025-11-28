/*   */ package me.konsolas.aac;public enum k5 {
/*   */   static {
/*   */     byte b1;
/*   */     long l;
/* 5 */     for (l = nc.a(-8147457273384898096L, -6456340911203457744L, MethodHandles.lookup().lookupClass()).a(273183274114762L) ^ 0x7C49E3A559EBL, "潒ਛ?䶟葹濊釠ᗯ댭﹏⠲醤폕瑀Ꟑꁆᗭ쀻咭".toCharArray()[19] = (char)("潒ਛ?䶟葹濊釠ᗯ댭﹏⠲醤폕瑀Ꟑꁆᗭ쀻咭".toCharArray()[19] ^ 0x7AEE), "営쥵嬀契".toCharArray()[2] = (char)("営쥵嬀契".toCharArray()[2] ^ 0x1466), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(hY$g6.H("潒ਛ?䶟葹濊釠ᗯ댭﹏⠲醤폕瑀Ꟑꁆᗭ쀻咭".toCharArray(), (short)12387, (byte)1, (byte)5))).init(2, SecretKeyFactory.getInstance(hY$g6.H("営쥵嬀契".toCharArray(), (short)2036, (byte)2, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "笑ꠄ寶遵ᐬ岆鶌辄攇㯭Ṫᓥ趘灹ꚰﺦ᠏㐸".toCharArray()[12] = (char)("笑ꠄ寶遵ᐬ岆鶌辄攇㯭Ṫᓥ趘灹ꚰﺦ᠏㐸".toCharArray()[12] ^ 0x6F43); String str; int i = (str = hY$g6.H("笑ꠄ寶遵ᐬ岆鶌辄攇㯭Ṫᓥ趘灹ꚰﺦ᠏㐸".toCharArray(), (short)212, (byte)3, (byte)0)).length(); byte b2 = 8; byte b = -1;
/*   */     while (true);
/*   */   }
/*   */   
/*   */   public static final k5 WATER;
/*   */   public static final k5 LAVA;
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
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */