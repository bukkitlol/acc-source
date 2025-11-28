/*   */ package me.konsolas.aac;
/*   */ public enum g8 { public static final g8 SQLITE; public static final g8 MYSQL;
/*   */   static { byte b1;
/*   */     long l;
/* 5 */     for (b = nc.a(-6317137662815048096L, 6793850125469145754L, MethodHandles.lookup().lookupClass()).a(14782763788767L), l = b ^ 0x7E73E271F205L, "Ʃằ윹緋贫㨚齖ቝ瞳仗骟쨙겧䥌ῦ䷸榢䂋撵".toCharArray()[0] = (char)("Ʃằ윹緋贫㨚齖ቝ瞳仗骟쨙겧䥌ῦ䷸榢䂋撵".toCharArray()[0] ^ 0x6B2), "토궿࢓".toCharArray()[0] = (char)("토궿࢓".toCharArray()[0] ^ 0x3550), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(hY$g6.H("Ʃằ윹緋贫㨚齖ቝ瞳仗骟쨙겧䥌ῦ䷸榢䂋撵".toCharArray(), (short)29398, (byte)5, (byte)1))).init(2, SecretKeyFactory.getInstance(hY$g6.H("토궿࢓".toCharArray(), (short)25199, (byte)0, (byte)1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "ヒ疎懊?醉し췶駾ⵀŨ㚫蟀တ삺賲ⴳ?ቨ".toCharArray()[4] = (char)("ヒ疎懊?醉し췶駾ⵀŨ㚫蟀တ삺賲ⴳ?ቨ".toCharArray()[4] ^ 0x6CBD); String str; int i = (str = hY$g6.H("ヒ疎懊?醉し췶駾ⵀŨ㚫蟀တ삺賲ⴳ?ቨ".toCharArray(), (short)28888, (byte)0, (byte)5)).length(); byte b2 = 8; byte b = -1;
/* 6 */     while (true); } private static final g8[] a; private static final long b; private static g8[] a() { return new g8[] { SQLITE, MYSQL }; }
/*   */ 
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */