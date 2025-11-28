/*   */ package me.konsolas.aac;class eg extends OutputStream { final fw a;
/*   */   private static final long b = nc.a(8284744948805787576L, 6480438912595470484L, MethodHandles.lookup().lookupClass()).a(185464166145517L);
/*   */   
/*   */   public void write(int paramInt) {
/* 5 */     long l1 = b ^ 0x19FEF85C9CC0L, l2 = l1 ^ 0x2232E28D0C37L; this.a.a((byte)paramInt, l2);
/*   */   } private static final String c; eg(fw paramfw) {} public void flush() {} public void close() {} public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 7 */     long l1 = b ^ 0x11B60CF369CAL, l2 = l1 ^ 0x63D56611961BL; this.a.a(paramArrayOfbyte, l2, paramInt1, paramInt2); } public String toString() {
/* 8 */     long l = b ^ 0x253CBC94DB1DL; return this.a + c;
/*   */   }
/*   */   
/*   */   static {
/*   */     long l = b ^ 0x4B39788E089FL;
/*   */     "볺ⴥ힄窸▬㣿揮ઇ៬㋜ﴰ㮍木㜔㗱훩?ꪚ쭜挙".toCharArray()[13] = (char)("볺ⴥ힄窸▬㣿揮ઇ៬㋜ﴰ㮍木㜔㗱훩?ꪚ쭜挙".toCharArray()[13] ^ 0x6489);
/*   */     "鑰鸙䌯ᨎ".toCharArray()[2] = (char)("鑰鸙䌯ᨎ".toCharArray()[2] ^ 0x3A9);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(a0$cc.G("볺ⴥ힄窸▬㣿揮ઇ៬㋜ﴰ㮍木㜔㗱훩?ꪚ쭜挙".toCharArray(), (short)16271, true, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("鑰鸙䌯ᨎ".toCharArray(), (short)6145, true, (byte)0)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "鮌룵⃈嫩蟨첸粮ᦟ㍞쉖䶖쵳㭠ᡏ㎠桁".toCharArray()[1] = (char)("鮌룵⃈嫩蟨첸粮ᦟ㍞쉖䶖쵳㭠ᡏ㎠桁".toCharArray()[1] ^ 0x7F32);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\eg.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */