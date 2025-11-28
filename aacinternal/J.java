/*   */ package aacinternal;public enum j { static { byte b1; long l;
/* 2 */     for (l = nc.a(-182728833650394814L, -1951513753015136750L, MethodHandles.lookup().lookupClass()).a(120233690901569L) ^ 0x639278C3BB71L, "ꕌ觗豥䌦角鹡縁抴審ℙⴣ贾뺼鐻龍⠆壌".toCharArray()[0] = (char)("ꕌ觗豥䌦角鹡縁抴審ℙⴣ贾뺼鐻龍⠆壌".toCharArray()[0] ^ 0x11E), "ㄳ?ŕ㎝".toCharArray()[2] = (char)("ㄳ?ŕ㎝".toCharArray()[2] ^ 0x18C3), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(D$X.L("ꕌ觗豥䌦角鹡縁抴審ℙⴣ贾뺼鐻龍⠆壌".toCharArray(), (short)6764, (byte)2, false))).init(2, SecretKeyFactory.getInstance(D$X.L("ㄳ?ŕ㎝".toCharArray(), (short)15021, (byte)3, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "컒䲑믢ꎄ曐雏୓෿䟭⚉셧䥠ﰓ鿁徜ឪ萦좧孀㣿ᑋ䡉Ꞌ杸錤ᛦﯜíが맢⒜".toCharArray()[24] = (char)("컒䲑믢ꎄ曐雏୓෿䟭⚉셧䥠ﰓ鿁徜ឪ萦좧孀㣿ᑋ䡉Ꞌ杸錤ᛦﯜíが맢⒜".toCharArray()[24] ^ 0x385D); String str; int i = (str = D$X.L("컒䲑믢ꎄ曐雏୓෿䟭⚉셧䥠ﰓ鿁徜ឪ萦좧孀㣿ᑋ䡉Ꞌ杸錤ᛦﯜíが맢⒜".toCharArray(), (short)29736, (byte)0, true)).length(); byte b2 = 16; byte b = -1;
/*   */     while (true); }
/*   */ 
/*   */   
/*   */   public static final j MULTIPLICATIVE;
/*   */   public static final j ADDITIVE;
/*   */   private static final j[] a;
/*   */   
/*   */   private static String a(byte[] paramArrayOfbyte) {
/*   */     byte b1 = 0;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*   */     for (byte b2 = 0; b2 < i; b2++) {
/*   */       int k;
/*   */       if ((k = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*   */         arrayOfChar[b1++] = (char)k;
/*   */       } else if (k < 224) {
/*   */         char c = (char)((char)(k & 0x1F) << 6);
/*   */         k = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(k & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } else if (b2 < i - 2) {
/*   */         char c = (char)((char)(k & 0xF) << 12);
/*   */         k = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(k & 0x3F) << 6);
/*   */         k = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(k & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } 
/*   */     } 
/*   */     return new String(arrayOfChar, 0, b1);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */