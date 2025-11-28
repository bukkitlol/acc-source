/*   */ package me.konsolas.aac;class ai extends aR { final cQ a; ai(aY paramaY, String paramString, Object[] paramArrayOfObject, cQ paramcQ) {
/* 2 */     super(paramString, paramArrayOfObject);
/*   */   }
/*   */   final aY d; private static final String e;
/*   */   public void b(long paramLong) {
/* 6 */     long l1 = paramLong ^ 0x105D71F6E2CDL; int i = (int)((paramLong ^ 0x713346C9E1EAL) >>> 32L), j = (int)((paramLong ^ 0x713346C9E1EAL) << 32L >>> 48L), k = (int)((paramLong ^ 0x713346C9E1EAL) << 48L >>> 48L); paramLong ^ 0x713346C9E1EAL; long l2 = paramLong ^ 0xDC58C610F1DL; try { this.d.a.z.a(this.a, l2); }
/*   */     catch (IOException iOException)
/*   */     
/* 9 */     { io.c().a(4, i, (char)j, e + this.d.a.e, (short)k, iOException);
/*   */       try {
/*   */         this.a.a(eb.PROTOCOL_ERROR, iOException, l1);
/*   */       } catch (IOException iOException1) {} }
/*   */   
/*   */   }
/*   */   
/*   */   static {
/*   */     long l = nc.a(2616674881772032180L, -6319911902064742310L, MethodHandles.lookup().lookupClass()).a(192451662107876L) ^ 0x4340C0674159L;
/*   */     "㣍텩ﻚ䮾膖?帡얙ᔭ组鬬붖胢貯嬽ﾸ탪諬䦍擾".toCharArray()[12] = (char)("㣍텩ﻚ䮾膖?帡얙ᔭ组鬬붖胢貯嬽ﾸ탪諬䦍擾".toCharArray()[12] ^ 0x704C);
/*   */     "?鷓᫃⑯".toCharArray()[0] = (char)("?鷓᫃⑯".toCharArray()[0] ^ 0xA1D);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(dP$dt.X("㣍텩ﻚ䮾膖?帡얙ᔭ组鬬붖胢貯嬽ﾸ탪諬䦍擾".toCharArray(), (short)8234, false, true))).init(2, SecretKeyFactory.getInstance(dP$dt.X("?鷓᫃⑯".toCharArray(), (short)17102, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "⽊躒⡸䵾릎攫⛋⮝䶰ꧡꏦ訊ἲᆀ?無➼勾푲吡盶껢㉴ꇘむ頞㤞ཥ储໑Ღ㦱餘ḹ靶ꘙ땡彪".toCharArray()[20] = (char)("⽊躒⡸䵾릎攫⛋⮝䶰ꧡꏦ訊ἲᆀ?無➼勾푲吡盶껢㉴ꇘむ頞㤞ཥ储໑Ღ㦱餘ḹ靶ꘙ땡彪".toCharArray()[20] ^ 0x79C7);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */