/*   */ package me.konsolas.aac;
/*   */ import javax.crypto.Cipher;
/*   */ 
/*   */ final class ao extends aR {
/*   */   ao(long paramLong, cZ paramcZ) {
/* 6 */     super(e, new Object[] { paramcZ.e });
/*   */   }
/*   */   
/*   */   final cZ a;
/*   */   private static final long d = nc.a(6788745531704700049L, 7518405408823391984L, MethodHandles.lookup().lookupClass()).a(257069451241949L);
/*   */   private static final String e;
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
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */   
/*   */   static {
/*   */     long l = d ^ 0x5DD90E5AB1D6L;
/*   */     "ྉ챦負⤬돠븴垔뇦븃覝鮜┱扄䜺?䚦傞὚持".toCharArray()[1] = (char)("ྉ챦負⤬돠븴垔뇦븃覝鮜┱扄䜺?䚦傞὚持".toCharArray()[1] ^ 0x1183);
/*   */     "챍킚䁷㻸".toCharArray()[1] = (char)("챍킚䁷㻸".toCharArray()[1] ^ 0x6C44);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(a0$cc.G("ྉ챦負⤬돠븴垔뇦븃覝鮜┱扄䜺?䚦傞὚持".toCharArray(), (short)2862, false, (byte)2))).init(2, SecretKeyFactory.getInstance(a0$cc.G("챍킚䁷㻸".toCharArray(), (short)23542, true, (byte)0)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "Ｇ믓ᩃｎ퍼ꇗ䕃Ⱅᐔ꾮뚣廮溃귝ꛞ⃓".toCharArray()[5] = (char)("Ｇ믓ᩃｎ퍼ꇗ䕃Ⱅᐔ꾮뚣廮溃귝ꛞ⃓".toCharArray()[5] ^ 0x1736);
/*   */   }
/*   */   
/*   */   public void b(long paramLong) {
/*   */     // Byte code:
/*   */     //   0: lload_1
/*   */     //   1: dup2
/*   */     //   2: ldc2_w 63785318052763
/*   */     //   5: lxor
/*   */     //   6: dup2
/*   */     //   7: bipush #32
/*   */     //   9: lushr
/*   */     //   10: lstore_3
/*   */     //   11: dup2
/*   */     //   12: bipush #32
/*   */     //   14: lshl
/*   */     //   15: bipush #32
/*   */     //   17: lushr
/*   */     //   18: l2i
/*   */     //   19: istore #5
/*   */     //   21: pop2
/*   */     //   22: dup2
/*   */     //   23: ldc2_w 75177886162458
/*   */     //   26: lxor
/*   */     //   27: dup2
/*   */     //   28: bipush #48
/*   */     //   30: lushr
/*   */     //   31: l2i
/*   */     //   32: istore #6
/*   */     //   34: dup2
/*   */     //   35: bipush #16
/*   */     //   37: lshl
/*   */     //   38: bipush #48
/*   */     //   40: lushr
/*   */     //   41: l2i
/*   */     //   42: istore #7
/*   */     //   44: dup2
/*   */     //   45: bipush #32
/*   */     //   47: lshl
/*   */     //   48: bipush #32
/*   */     //   50: lushr
/*   */     //   51: l2i
/*   */     //   52: istore #8
/*   */     //   54: pop2
/*   */     //   55: pop2
/*   */     //   56: ldc2_w -1520133367558107423
/*   */     //   59: lload_1
/*   */     //   60: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   65: aload_0
/*   */     //   66: getfield a : Lme/konsolas/aac/cZ;
/*   */     //   69: dup
/*   */     //   70: astore #11
/*   */     //   72: monitorenter
/*   */     //   73: astore #9
/*   */     //   75: aload_0
/*   */     //   76: getfield a : Lme/konsolas/aac/cZ;
/*   */     //   79: invokestatic a : (Lme/konsolas/aac/cZ;)J
/*   */     //   82: aload_0
/*   */     //   83: getfield a : Lme/konsolas/aac/cZ;
/*   */     //   86: invokestatic b : (Lme/konsolas/aac/cZ;)J
/*   */     //   89: lcmp
/*   */     //   90: aload #9
/*   */     //   92: ifnull -> 147
/*   */     //   95: ifge -> 125
/*   */     //   98: goto -> 111
/*   */     //   101: ldc2_w -1584114306847144554
/*   */     //   104: lload_1
/*   */     //   105: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   110: athrow
/*   */     //   111: iconst_1
/*   */     //   112: istore #10
/*   */     //   114: lload_1
/*   */     //   115: lconst_0
/*   */     //   116: lcmp
/*   */     //   117: iflt -> 152
/*   */     //   120: aload #9
/*   */     //   122: ifnonnull -> 149
/*   */     //   125: aload_0
/*   */     //   126: getfield a : Lme/konsolas/aac/cZ;
/*   */     //   129: invokestatic c : (Lme/konsolas/aac/cZ;)J
/*   */     //   132: pop2
/*   */     //   133: iconst_0
/*   */     //   134: goto -> 147
/*   */     //   137: ldc2_w -1584114306847144554
/*   */     //   140: lload_1
/*   */     //   141: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   146: athrow
/*   */     //   147: istore #10
/*   */     //   149: aload #11
/*   */     //   151: monitorexit
/*   */     //   152: goto -> 163
/*   */     //   155: astore #12
/*   */     //   157: aload #11
/*   */     //   159: monitorexit
/*   */     //   160: aload #12
/*   */     //   162: athrow
/*   */     //   163: lload_1
/*   */     //   164: lconst_0
/*   */     //   165: lcmp
/*   */     //   166: iflt -> 221
/*   */     //   169: iload #10
/*   */     //   171: ifeq -> 203
/*   */     //   174: aload_0
/*   */     //   175: getfield a : Lme/konsolas/aac/cZ;
/*   */     //   178: lload_3
/*   */     //   179: iload #5
/*   */     //   181: aconst_null
/*   */     //   182: invokestatic a : (Lme/konsolas/aac/cZ;JILjava/io/IOException;)V
/*   */     //   185: aload #9
/*   */     //   187: ifnonnull -> 234
/*   */     //   190: goto -> 203
/*   */     //   193: ldc2_w -1584114306847144554
/*   */     //   196: lload_1
/*   */     //   197: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   202: athrow
/*   */     //   203: aload_0
/*   */     //   204: getfield a : Lme/konsolas/aac/cZ;
/*   */     //   207: iconst_0
/*   */     //   208: iconst_1
/*   */     //   209: iconst_0
/*   */     //   210: iload #6
/*   */     //   212: i2c
/*   */     //   213: iload #7
/*   */     //   215: i2s
/*   */     //   216: iload #8
/*   */     //   218: invokevirtual a : (ZIICSI)V
/*   */     //   221: goto -> 234
/*   */     //   224: ldc2_w -1584114306847144554
/*   */     //   227: lload_1
/*   */     //   228: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   233: athrow
/*   */     //   234: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #9	-> 65
/*   */     //   #10	-> 75
/*   */     //   #8	-> 111
/*   */     //   #5	-> 125
/*   */     //   #13	-> 133
/*   */     //   #1	-> 149
/*   */     //   #11	-> 163
/*   */     //   #3	-> 174
/*   */     //   #7	-> 203
/*   */     //   #2	-> 234
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   75	98	101	aacinternal/v
/*   */     //   75	152	155	finally
/*   */     //   114	134	137	aacinternal/v
/*   */     //   155	160	155	finally
/*   */     //   163	190	193	aacinternal/v
/*   */     //   174	221	224	aacinternal/v
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */