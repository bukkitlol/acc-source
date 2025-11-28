/*    */ package me.konsolas.aac;
/*  2 */ abstract class mf implements hp { protected final l3 b; protected boolean a; public li a() { return this.b; } final iL c; private static final long i = nc.a(2770543442063702500L, -8758733494483256410L, MethodHandles.lookup().lookupClass()).a(224964080487741L); private static final String k; mf(long paramLong, iL paramiL, cL paramcL) {
/*  3 */     this((char)i, paramiL, j, (char)k); } private mf(char paramChar1, iL paramiL, int paramInt, char paramChar2) {
/*  4 */     this.b = new l3(l2, iL.a(this.c).a());
/*    */   }
/*    */ 
/*    */   
/*    */   final void a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mf.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 7870638130262
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: ldc2_w -4583871637714094134
/*    */     //   17: lload_1
/*    */     //   18: <illegal opcode> w : (JJ)Z
/*    */     //   23: istore #5
/*    */     //   25: aload_0
/*    */     //   26: getfield c : Lme/konsolas/aac/iL;
/*    */     //   29: invokestatic a : (Lme/konsolas/aac/iL;)I
/*    */     //   32: bipush #6
/*    */     //   34: iload #5
/*    */     //   36: ifne -> 88
/*    */     //   39: if_icmpne -> 56
/*    */     //   42: goto -> 55
/*    */     //   45: ldc2_w -4594437818747200631
/*    */     //   48: lload_1
/*    */     //   49: <illegal opcode> w : (Ljava/lang/IllegalStateException;JJ)Ljava/lang/IllegalStateException;
/*    */     //   54: athrow
/*    */     //   55: return
/*    */     //   56: lload_1
/*    */     //   57: lconst_0
/*    */     //   58: lcmp
/*    */     //   59: ifle -> 157
/*    */     //   62: aload_0
/*    */     //   63: getfield c : Lme/konsolas/aac/iL;
/*    */     //   66: invokestatic a : (Lme/konsolas/aac/iL;)I
/*    */     //   69: iload #5
/*    */     //   71: ifne -> 156
/*    */     //   74: iconst_5
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w -4594437818747200631
/*    */     //   81: lload_1
/*    */     //   82: <illegal opcode> w : (Ljava/lang/IllegalStateException;JJ)Ljava/lang/IllegalStateException;
/*    */     //   87: athrow
/*    */     //   88: if_icmpeq -> 135
/*    */     //   91: new java/lang/IllegalStateException
/*    */     //   94: dup
/*    */     //   95: new java/lang/StringBuilder
/*    */     //   98: dup
/*    */     //   99: invokespecial <init> : ()V
/*    */     //   102: getstatic me/konsolas/aac/mf.k : Ljava/lang/String;
/*    */     //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   108: aload_0
/*    */     //   109: getfield c : Lme/konsolas/aac/iL;
/*    */     //   112: invokestatic a : (Lme/konsolas/aac/iL;)I
/*    */     //   115: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   118: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   121: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   124: athrow
/*    */     //   125: ldc2_w -4594437818747200631
/*    */     //   128: lload_1
/*    */     //   129: <illegal opcode> w : (Ljava/lang/IllegalStateException;JJ)Ljava/lang/IllegalStateException;
/*    */     //   134: athrow
/*    */     //   135: aload_0
/*    */     //   136: getfield c : Lme/konsolas/aac/iL;
/*    */     //   139: aload_0
/*    */     //   140: getfield b : Lme/konsolas/aac/l3;
/*    */     //   143: lload_3
/*    */     //   144: invokestatic a : (Lme/konsolas/aac/iL;Lme/konsolas/aac/l3;J)V
/*    */     //   147: aload_0
/*    */     //   148: getfield c : Lme/konsolas/aac/iL;
/*    */     //   151: bipush #6
/*    */     //   153: invokestatic a : (Lme/konsolas/aac/iL;I)I
/*    */     //   156: pop
/*    */     //   157: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 25
/*    */     //   #14	-> 56
/*    */     //   #8	-> 135
/*    */     //   #11	-> 147
/*    */     //   #1	-> 157
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	42	45	java/lang/IllegalStateException
/*    */     //   56	75	78	java/lang/IllegalStateException
/*    */     //   88	125	125	java/lang/IllegalStateException
/*    */   }
/*    */   
/*    */   public long a(long paramLong1, fw paramfw, long paramLong2) {
/* 13 */     long l1 = paramLong1 ^ 0x3639B1896233L, l2 = paramLong1 ^ 0x0L, l4 = paramLong1 ^ 0x64121CBDF301L; try { return iL.a(this.c).a(l2, paramfw, paramLong2); }
/*    */     catch (IOException iOException)
/*    */     { iL.a(this.c).a(l4); }
/*    */     
/*    */     a(l1);
/*    */     throw iOException;
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = i ^ 0x4038B040F348L;
/*    */     "舺ꀰଢ蝾䴞咁ꞎ䱌钿?伎૷盿ꕢ㑂⁣ᒄ䛶躗惥".toCharArray()[19] = (char)("舺ꀰଢ蝾䴞咁ꞎ䱌钿?伎૷盿ꕢ㑂⁣ᒄ䛶躗惥".toCharArray()[19] ^ 0x1A0);
/*    */     "⮖쿘埋〴".toCharArray()[0] = (char)("⮖쿘埋〴".toCharArray()[0] ^ 0x72E2);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("舺ꀰଢ蝾䴞咁ꞎ䱌钿?伎૷盿ꕢ㑂⁣ᒄ䛶躗惥".toCharArray(), (short)14803, true, (byte)1))).init(2, SecretKeyFactory.getInstance(a0$cc.G("⮖쿘埋〴".toCharArray(), (short)9636, true, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ꌅ픩⫭毐a㙮ﾀ죈櫴".toCharArray()[4] = (char)("ꌅ픩⫭毐a㙮ﾀ죈櫴".toCharArray()[4] ^ 0x152F);
/*    */   }
/*    */   
/*    */   private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */