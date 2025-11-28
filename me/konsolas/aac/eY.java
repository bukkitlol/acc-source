/*    */ package me.konsolas.aac;
/*    */ final class ey implements gp {
/*    */   private final l3 c;
/*    */   private boolean a;
/*    */   final iL b;
/*    */   private static final long d = nc.a(7233077381266056238L, -5613201660115126464L, MethodHandles.lookup().lookupClass()).a(119037820946754L);
/*    */   private static final String e;
/*    */   
/*  9 */   private ey(iL paramiL, long paramLong) { this.c = new l3(l, iL.a(this.b).a()); }
/*    */   public void b(long paramLong1, fw paramfw, long paramLong2) { // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 46294074899191
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 0
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 377067484129325715
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)Z
/*    */     //   25: istore #10
/*    */     //   27: aload_0
/*    */     //   28: iload #10
/*    */     //   30: ifne -> 86
/*    */     //   33: getfield a : Z
/*    */     //   36: ifeq -> 73
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 326163741530662295
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: getstatic me/konsolas/aac/ey.e : Ljava/lang/String;
/*    */     //   59: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   62: athrow
/*    */     //   63: ldc2_w 326163741530662295
/*    */     //   66: lload_1
/*    */     //   67: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   72: athrow
/*    */     //   73: aload_3
/*    */     //   74: invokevirtual f : ()J
/*    */     //   77: lconst_0
/*    */     //   78: lload #4
/*    */     //   80: lload #6
/*    */     //   82: invokestatic a : (JJJJ)V
/*    */     //   85: aload_0
/*    */     //   86: getfield b : Lme/konsolas/aac/iL;
/*    */     //   89: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/gi;
/*    */     //   92: lload #8
/*    */     //   94: aload_3
/*    */     //   95: lload #4
/*    */     //   97: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*    */     //   102: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 27
/*    */     //   #4	-> 73
/*    */     //   #12	-> 85
/*    */     //   #15	-> 102
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	63	63	java/io/IOException }
/* 11 */   public li a() { return this.c; }
/*    */   public void close() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ey.d : J
/*    */     //   3: ldc2_w 74802807854565
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 128388987635309
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -9054026474498591247
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)Z
/*    */     //   25: istore #5
/*    */     //   27: aload_0
/*    */     //   28: getfield a : Z
/*    */     //   31: iload #5
/*    */     //   33: ifne -> 78
/*    */     //   36: ifeq -> 53
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -8942747855854263563
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   51: athrow
/*    */     //   52: return
/*    */     //   53: aload_0
/*    */     //   54: iconst_1
/*    */     //   55: putfield a : Z
/*    */     //   58: aload_0
/*    */     //   59: getfield b : Lme/konsolas/aac/iL;
/*    */     //   62: aload_0
/*    */     //   63: getfield c : Lme/konsolas/aac/l3;
/*    */     //   66: lload_3
/*    */     //   67: invokestatic a : (Lme/konsolas/aac/iL;Lme/konsolas/aac/l3;J)V
/*    */     //   70: aload_0
/*    */     //   71: getfield b : Lme/konsolas/aac/iL;
/*    */     //   74: iconst_3
/*    */     //   75: invokestatic a : (Lme/konsolas/aac/iL;I)I
/*    */     //   78: pop
/*    */     //   79: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 27
/*    */     //   #6	-> 53
/*    */     //   #5	-> 58
/*    */     //   #8	-> 70
/*    */     //   #16	-> 79
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException }
/*    */   public void flush() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ey.d : J
/*    */     //   3: ldc2_w 78824878789517
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w -8903816674813530213
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)Z
/*    */     //   17: istore_3
/*    */     //   18: aload_0
/*    */     //   19: iload_3
/*    */     //   20: ifeq -> 54
/*    */     //   23: getfield a : Z
/*    */     //   26: ifeq -> 53
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -8823403189869501283
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   41: athrow
/*    */     //   42: return
/*    */     //   43: ldc2_w -8823403189869501283
/*    */     //   46: lload_1
/*    */     //   47: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   52: athrow
/*    */     //   53: aload_0
/*    */     //   54: getfield b : Lme/konsolas/aac/iL;
/*    */     //   57: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/gi;
/*    */     //   60: invokeinterface flush : ()V
/*    */     //   65: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 18
/*    */     //   #2	-> 53
/*    */     //   #13	-> 65
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	29	32	java/io/IOException
/*    */     //   23	43	43	java/io/IOException } ey(iL paramiL, long paramLong, cL paramcL) {
/* 14 */     this(paramiL, l);
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = d ^ 0x6A1E2E6FE823L;
/*    */     "层ꇮ丆섢횕ใ쏴⩿銟䩳푆疛ᕃ浂畖碘ᢸ䯬廍".toCharArray()[5] = (char)("层ꇮ丆섢횕ใ쏴⩿銟䩳푆疛ᕃ浂畖碘ᢸ䯬廍".toCharArray()[5] ^ 0x6E6C);
/*    */     "舴Ί嗒痺".toCharArray()[2] = (char)("舴Ί嗒痺".toCharArray()[2] ^ 0x670);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("层ꇮ丆섢횕ใ쏴⩿銟䩳푆疛ᕃ浂畖碘ᢸ䯬廍".toCharArray(), (short)7838, false, (byte)4))).init(2, SecretKeyFactory.getInstance(a0$cc.G("舴Ί嗒痺".toCharArray(), (short)3367, false, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "染샎뢉ꦍ苕汥펓ྡྷጫ".toCharArray()[7] = (char)("染샎뢉ꦍ苕汥펓ྡྷጫ".toCharArray()[7] ^ 0x5C70);
/*    */   }
/*    */   
/*    */   private static IOException a(IOException paramIOException) {
/*    */     return paramIOException;
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
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */