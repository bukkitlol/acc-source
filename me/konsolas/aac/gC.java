/*   */ package me.konsolas.aac;
/*   */ 
/*   */ 
/*   */ public final class gc {
/* 5 */   public mG a() { return new mG(new LinkedHashSet(this.a), null); } public gc a(String paramString, int paramInt1, short paramShort, String[] paramArrayOfString, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: i2l
/*   */     //   2: bipush #32
/*   */     //   4: lshl
/*   */     //   5: iload_3
/*   */     //   6: i2l
/*   */     //   7: bipush #48
/*   */     //   9: lshl
/*   */     //   10: bipush #32
/*   */     //   12: lushr
/*   */     //   13: lor
/*   */     //   14: iload #5
/*   */     //   16: i2l
/*   */     //   17: bipush #48
/*   */     //   19: lshl
/*   */     //   20: bipush #48
/*   */     //   22: lushr
/*   */     //   23: lor
/*   */     //   24: getstatic me/konsolas/aac/gc.b : J
/*   */     //   27: lxor
/*   */     //   28: lstore #6
/*   */     //   30: lload #6
/*   */     //   32: dup2
/*   */     //   33: ldc2_w 51370877470612
/*   */     //   36: lxor
/*   */     //   37: lstore #8
/*   */     //   39: pop2
/*   */     //   40: ldc2_w -6170262052080866660
/*   */     //   43: lload #6
/*   */     //   45: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   50: astore #10
/*   */     //   52: aload_1
/*   */     //   53: ifnonnull -> 78
/*   */     //   56: new java/lang/NullPointerException
/*   */     //   59: dup
/*   */     //   60: getstatic me/konsolas/aac/gc.c : Ljava/lang/String;
/*   */     //   63: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   66: athrow
/*   */     //   67: ldc2_w -6124747918823843690
/*   */     //   70: lload #6
/*   */     //   72: <illegal opcode> w : (Ljava/lang/NullPointerException;JJ)Ljava/lang/NullPointerException;
/*   */     //   77: athrow
/*   */     //   78: aload #4
/*   */     //   80: astore #11
/*   */     //   82: aload #11
/*   */     //   84: arraylength
/*   */     //   85: istore #12
/*   */     //   87: iconst_0
/*   */     //   88: istore #13
/*   */     //   90: iload #13
/*   */     //   92: iload #12
/*   */     //   94: if_icmpge -> 161
/*   */     //   97: aload #11
/*   */     //   99: iload #13
/*   */     //   101: aaload
/*   */     //   102: astore #14
/*   */     //   104: iload_3
/*   */     //   105: ifle -> 138
/*   */     //   108: aload_0
/*   */     //   109: aload #10
/*   */     //   111: ifnonnull -> 162
/*   */     //   114: getfield a : Ljava/util/List;
/*   */     //   117: new me/konsolas/aac/e2
/*   */     //   120: dup
/*   */     //   121: aload_1
/*   */     //   122: lload #8
/*   */     //   124: aload #14
/*   */     //   126: invokespecial <init> : (Ljava/lang/String;JLjava/lang/String;)V
/*   */     //   129: invokeinterface add : (Ljava/lang/Object;)Z
/*   */     //   134: pop
/*   */     //   135: iinc #13, 1
/*   */     //   138: aload #10
/*   */     //   140: ifnull -> 90
/*   */     //   143: iload_3
/*   */     //   144: iflt -> 104
/*   */     //   147: goto -> 161
/*   */     //   150: ldc2_w -6124747918823843690
/*   */     //   153: lload #6
/*   */     //   155: <illegal opcode> w : (Ljava/lang/NullPointerException;JJ)Ljava/lang/NullPointerException;
/*   */     //   160: athrow
/*   */     //   161: aload_0
/*   */     //   162: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #3	-> 52
/*   */     //   #2	-> 78
/*   */     //   #6	-> 104
/*   */     //   #8	-> 135
/*   */     //   #1	-> 161
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   52	67	67	java/lang/NullPointerException
/*   */     //   104	143	150	java/lang/NullPointerException
/* 7 */   } private final List a = new ArrayList();
/*   */   private static final long b = nc.a(6448199376617188028L, -301798436126050602L, MethodHandles.lookup().lookupClass()).a(181123411125222L);
/*   */   private static final String c;
/*   */   
/*   */   static {
/*   */     long l = b ^ 0x6931C7B60ADAL;
/*   */     "㕑㦌Ɒ劄糍뀓墥㹮伋텚뽼뾆ᅂ푀㨹쌼鉳쾁쒺䌪Ɵ".toCharArray()[1] = (char)("㕑㦌Ɒ劄糍뀓墥㹮伋텚뽼뾆ᅂ푀㨹쌼鉳쾁쒺䌪Ɵ".toCharArray()[1] ^ 0x46EC);
/*   */     "蠣ⵓ袓㰝".toCharArray()[2] = (char)("蠣ⵓ袓㰝".toCharArray()[2] ^ 0x540D);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(hY$g6.H("㕑㦌Ɒ劄糍뀓墥㹮伋텚뽼뾆ᅂ푀㨹쌼鉳쾁쒺䌪Ɵ".toCharArray(), (short)26524, (byte)2, (byte)2))).init(2, SecretKeyFactory.getInstance(hY$g6.H("蠣ⵓ袓㰝".toCharArray(), (short)15678, (byte)2, (byte)3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "暉䍂옞ﺥ?ﳻ슈衼哻❋谸揳⯂劝箈".toCharArray()[3] = (char)("暉䍂옞ﺥ?ﳻ슈衼哻❋谸揳⯂劝箈".toCharArray()[3] ^ 0x724E);
/*   */   }
/*   */   
/*   */   private static NullPointerException a(NullPointerException paramNullPointerException) {
/*   */     return paramNullPointerException;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */