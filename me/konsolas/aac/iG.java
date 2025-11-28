/* 1 */ package me.konsolas.aac;public enum ig { public static final ig MAIN_HAND; public static final ig OFF_HAND; static ig a(EnumWrappers.Hand paramHand) { return b.get(paramHand.ordinal()); } private static final List b; private static final ig[] a; static { byte b1; long l;
/* 2 */     for (l = nc.a(1429923959434969814L, 700587860075418946L, MethodHandles.lookup().lookupClass()).a(97266924877249L) ^ 0xAFB58117371L, "昬閷筮돥㢖옄㼍幊诵䀫灳븉봈쟢휀㤵瓾".toCharArray()[4] = (char)("昬閷筮돥㢖옄㼍幊诵䀫灳븉봈쟢휀㤵瓾".toCharArray()[4] ^ 0x29F8), "鹉⑦朿".toCharArray()[0] = (char)("鹉⑦朿".toCharArray()[0] ^ 0x1ACB), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(dP$dt.X("昬閷筮돥㢖옄㼍幊诵䀫灳븉봈쟢휀㤵瓾".toCharArray(), (short)16001, true, false))).init(2, SecretKeyFactory.getInstance(dP$dt.X("鹉⑦朿".toCharArray(), (short)5464, false, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "穅二۩㍃ݺ户ⲱ⥷懲訨짦綋ë鼝䄡귱셧剺슟냎ছ䱖梿ℽ❁錽骨ഊ".toCharArray()[20] = (char)("穅二۩㍃ݺ户ⲱ⥷懲訨짦綋ë鼝䄡귱셧剺슟냎ছ䱖梿ℽ❁錽骨ഊ".toCharArray()[20] ^ 0x24B); String str; int i = (str = dP$dt.X("穅二۩㍃ݺ户ⲱ⥷懲訨짦綋ë鼝䄡귱셧剺슟냎ছ䱖梿ℽ❁錽骨ഊ".toCharArray(), (short)28326, true, true)).length(); byte b2 = 16; byte b = -1;
/*   */     while (true); }
/*   */   
/*   */   private static ig[] a() {
/* 6 */     return new ig[] { MAIN_HAND, OFF_HAND };
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */