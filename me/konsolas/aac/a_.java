/*   */ package me.konsolas.aac;
/*   */ import javax.crypto.Cipher;
/*   */ import javax.crypto.spec.IvParameterSpec;
/*   */ 
/*   */ final class a_ extends aR {
/*   */   a_(short paramShort, cZ paramcZ, boolean paramBoolean, int paramInt1, int paramInt2, char paramChar, int paramInt3) {
/* 7 */     super(i, new Object[] { paramcZ.e, Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) }); this.d = paramBoolean; this.a = paramInt1;
/* 8 */     this.e = paramInt3;
/*   */   }
/*   */   
/*   */   final boolean d;
/*   */   final int a;
/*   */   final int e;
/*   */   final cZ f;
/*   */   private static final long g = nc.a(-5899866899962221251L, -5591917055827935838L, MethodHandles.lookup().lookupClass()).a(162449344925038L);
/*   */   private static final String i;
/*   */   
/*   */   public void b(long paramLong) {
/*   */     int i = (int)((paramLong ^ 0x445FB7331E1AL) >>> 48L), j = (int)((paramLong ^ 0x445FB7331E1AL) << 16L >>> 48L), k = (int)((paramLong ^ 0x445FB7331E1AL) << 32L >>> 32L);
/*   */     paramLong ^ 0x445FB7331E1AL;
/*   */     this.f.a(this.d, this.a, this.e, (char)i, (short)j, k);
/*   */   }
/*   */   
/*   */   static {
/*   */     long l = g ^ 0x41BB575F728AL;
/*   */     "큃ජ?䍊ֻ꽿畢婸鉃挬㇑푄ญ໏ﾘ䞒ꍦ좵ᕁ⍘".toCharArray()[4] = (char)("큃ජ?䍊ֻ꽿畢婸鉃挬㇑푄ญ໏ﾘ䞒ꍦ좵ᕁ⍘".toCharArray()[4] ^ 0x3928);
/*   */     "苣벗ಒṢ".toCharArray()[0] = (char)("苣벗ಒṢ".toCharArray()[0] ^ 0x51EC);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(hY$g6.H("큃ජ?䍊ֻ꽿畢婸鉃挬㇑푄ญ໏ﾘ䞒ꍦ좵ᕁ⍘".toCharArray(), (short)5677, (byte)3, (byte)3))).init(2, SecretKeyFactory.getInstance(hY$g6.H("苣벗ಒṢ".toCharArray(), (short)26616, (byte)0, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "㛂苺ቭ撕䙫ボ茐웮抚읾䶖Ⳙ㹀壭豦兑㙮㏌ﯡ늺Ꞿ싁⩵".toCharArray()[13] = (char)("㛂苺ቭ撕䙫ボ茐웮抚읾䶖Ⳙ㹀壭豦兑㙮㏌ﯡ늺Ꞿ싁⩵".toCharArray()[13] ^ 0x7D4B);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */