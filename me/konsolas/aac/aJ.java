/*   */ package me.konsolas.aac;public final class aj {
/*   */   public static String a(short paramShort, int paramInt, char paramChar) {
/* 3 */     long l = (paramShort << 48L | paramInt << 32L >>> 16L | paramChar << 48L >>> 48L) ^ a; return b;
/*   */   }
/*   */   
/*   */   private static final long a = nc.a(4421619770296309758L, -4455931774262167710L, MethodHandles.lookup().lookupClass()).a(240073469035555L);
/*   */   private static final String b;
/*   */   
/*   */   static {
/*   */     long l = a ^ 0x106B9FE24604L;
/*   */     "꯺開牃릅뭵厺鎑낙᛫ᣬᶖ蓬哮䴛셴盧ﵗ稘".toCharArray()[2] = (char)("꯺開牃릅뭵厺鎑낙᛫ᣬᶖ蓬哮䴛셴盧ﵗ稘".toCharArray()[2] ^ 0x19B4);
/*   */     "骑䉯㠝".toCharArray()[1] = (char)("骑䉯㠝".toCharArray()[1] ^ 0x1B9A);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(hY$g6.H("꯺開牃릅뭵厺鎑낙᛫ᣬᶖ蓬哮䴛셴盧ﵗ稘".toCharArray(), (short)8371, (byte)4, (byte)5))).init(2, SecretKeyFactory.getInstance(hY$g6.H("骑䉯㠝".toCharArray(), (short)18071, (byte)3, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "⋓猔牋献狂䀻埩ꮁ壇拹窵ṻ১盱溆飿တ".toCharArray()[3] = (char)("⋓猔牋献狂䀻埩ꮁ壇拹窵ṻ১盱溆飿တ".toCharArray()[3] ^ 0x7A4E);
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
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */