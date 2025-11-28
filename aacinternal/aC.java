/*   */ package aacinternal;
/*   */ 
/*   */ public enum ac {
/*   */   static {
/*   */     byte b1;
/*   */     long l;
/* 7 */     for (l = nc.a(3082935264534200700L, -5970935490279925322L, MethodHandles.lookup().lookupClass()).a(75592563266244L) ^ 0x74D1B9832D3AL, "聿ଷ嵎⪥儜캹︭⏅Ⴏ?븑醰釟ᶄ?삣؉ഀ灆坞".toCharArray()[17] = (char)("聿ଷ嵎⪥儜캹︭⏅Ⴏ?븑醰釟ᶄ?삣؉ഀ灆坞".toCharArray()[17] ^ 0x358D), "䩒儴ꍰ㍡".toCharArray()[1] = (char)("䩒儴ꍰ㍡".toCharArray()[1] ^ 0x1FC7), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(D$X.L("聿ଷ嵎⪥儜캹︭⏅Ⴏ?븑醰釟ᶄ?삣؉ഀ灆坞".toCharArray(), (short)2817, (byte)5, false))).init(2, SecretKeyFactory.getInstance(D$X.L("䩒儴ꍰ㍡".toCharArray(), (short)10691, (byte)5, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[5]; boolean bool = false; "梼Ꚍ쩖輈ಪ杵꡼䢟趴㏰꧛繡⼁㘝Ⰺ挌?逮죪楚㞾쁏뢛܅鋖㮖劒㚻ꣽ䬝酪껜짵ಲ㣀羼恊膄佭升ᾢﯛ犀".toCharArray()[19] = (char)("梼Ꚍ쩖輈ಪ杵꡼䢟趴㏰꧛繡⼁㘝Ⰺ挌?逮죪楚㞾쁏뢛܅鋖㮖劒㚻ꣽ䬝酪껜짵ಲ㣀羼恊膄佭升ᾢﯛ犀".toCharArray()[19] ^ 0x688C); String str; int i = (str = D$X.L("梼Ꚍ쩖輈ಪ杵꡼䢟趴㏰꧛繡⼁㘝Ⰺ挌?逮죪楚㞾쁏뢛܅鋖㮖劒㚻ꣽ䬝酪껜짵ಲ㣀羼恊膄佭升ᾢﯛ犀".toCharArray(), (short)25366, (byte)0, false)).length(); byte b2 = 16; byte b = -1;
/*   */     while (true);
/*   */   }
/*   */   
/*   */   public static final ac ANY_SIDE;
/*   */   public static final ac LEFT_SIDE;
/*   */   public static final ac RIGHT_SIDE;
/*   */   public static final ac BELOW_SIDE;
/*   */   public static final ac ABOVE_SIDE;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */