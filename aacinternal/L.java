/*   */ package aacinternal;public enum l {
/*   */   static {
/*   */     byte b1;
/*   */     long l1;
/* 5 */     for (l1 = nc.a(8633552488022733484L, 7966280714071806892L, MethodHandles.lookup().lookupClass()).a(217213258799562L) ^ 0x534806C05B76L, "㟓騿䷟䶶禐糨먤?ꥯ䓡鴙覬睍騱䋎騑䌽鵍⟀".toCharArray()[14] = (char)("㟓騿䷟䶶禐糨먤?ꥯ䓡鴙覬睍騱䋎騑䌽鵍⟀".toCharArray()[14] ^ 0x52AE), "頋ᅒ䃦".toCharArray()[0] = (char)("頋ᅒ䃦".toCharArray()[0] ^ 0xD00), (new byte[8])[0] = (byte)(int)(l1 >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l1 << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(aB$aG.q("㟓騿䷟䶶禐糨먤?ꥯ䓡鴙覬睍騱䋎騑䌽鵍⟀".toCharArray(), (short)26038, (byte)1, (byte)5))).init(2, SecretKeyFactory.getInstance(aB$aG.q("頋ᅒ䃦".toCharArray(), (short)6862, (byte)5, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "䉽鋁߃䒻?홸뽓ⱎ样퇫僡ꣻᮔ㉥ꡘ쓎⃹쭠晉唲凸捐".toCharArray()[16] = (char)("䉽鋁߃䒻?홸뽓ⱎ样퇫僡ꣻᮔ㉥ꡘ쓎⃹쭠晉唲凸捐".toCharArray()[16] ^ 0x2B7D); String str; int i = (str = aB$aG.q("䉽鋁߃䒻?홸뽓ⱎ样퇫僡ꣻᮔ㉥ꡘ쓎⃹쭠晉唲凸捐".toCharArray(), (short)30986, (byte)4, (byte)4)).length(); byte b2 = 16; byte b = -1;
/*   */     while (true);
/*   */   }
/*   */   
/*   */   public static final l CENTRAL;
/*   */   public static final l MEDIAN_OF_3;
/*   */   
/*   */   public abstract int a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */