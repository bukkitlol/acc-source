/* 1 */ package aacinternal;public enum h { static { byte b1; long l; for (l = nc.a(9029855010472561976L, 2548825988904647620L, MethodHandles.lookup().lookupClass()).a(33476171522211L) ^ 0x19E097DDCDB7L, "ꋡͱ⊆?﻽긔ꇯ荇ۄ롭퉦ܖဵ렴ᄃ㘻셼벢䖾罤".toCharArray()[10] = (char)("ꋡͱ⊆?﻽긔ꇯ荇ۄ롭퉦ܖဵ렴ᄃ㘻셼벢䖾罤".toCharArray()[10] ^ 0x13A0), "ḙ죧⫻".toCharArray()[2] = (char)("ḙ죧⫻".toCharArray()[2] ^ 0x7BA9), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(a9$aP.w("ꋡͱ⊆?﻽긔ꇯ荇ۄ롭퉦ܖဵ렴ᄃ㘻셼벢䖾罤".toCharArray(), (short)2354, false, false))).init(2, SecretKeyFactory.getInstance(a9$aP.w("ḙ죧⫻".toCharArray(), (short)12987, false, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "㕻淊凌彝疛㒕듍ｺ䶕뿸쳬Ⅸ衶?岓켄ᬼ僚憮梁ꛎ铥좴?颃筀븋אּ㡡鬗ヵ".toCharArray()[1] = (char)("㕻淊凌彝疛㒕듍ｺ䶕뿸쳬Ⅸ衶?岓켄ᬼ僚憮梁ꛎ铥좴?颃筀븋אּ㡡鬗ヵ".toCharArray()[1] ^ 0x69CC); String str; int i = (str = a9$aP.w("㕻淊凌彝疛㒕듍ｺ䶕뿸쳬Ⅸ衶?岓켄ᬼ僚憮梁ꛎ铥좴?颃筀븋אּ㡡鬗ヵ".toCharArray(), (short)12282, true, true)).length(); byte b2 = 16; byte b = -1;
/*   */     while (true); }
/*   */ 
/*   */   
/*   */   public static final h INCREASING;
/*   */   public static final h DECREASING;
/*   */   private static final h[] a;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */