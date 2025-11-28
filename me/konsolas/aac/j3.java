/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ class j3
/*    */   implements lR {
/*    */   final s a;
/*    */   final dw b;
/*    */   
/*    */   public void a(gC paramgC, short paramShort, IOException paramIOException, int paramInt, char paramChar) {
/* 16 */     long l1 = paramShort << 48L | paramInt << 32L >>> 16L | paramChar << 48L >>> 48L, l2 = (l1 ^ 0x4CEA4D1E2870L) >>> 16L; int i = (int)((l1 ^ 0x4CEA4D1E2870L) << 48L >>> 48L); l1 ^ 0x4CEA4D1E2870L; this.b.a(paramIOException, l2, (H)null, (short)i);
/*    */   }
/*    */   
/*    */   private static final String c;
/*    */   
/*    */   j3(dw paramdw, s params) {}
/*    */   
/*    */   public void a(gC paramgC, long paramLong, H paramH) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 36461853119769
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 70951704928671
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #16
/*    */     //   16: lushr
/*    */     //   17: lstore #7
/*    */     //   19: dup2
/*    */     //   20: bipush #48
/*    */     //   22: lshl
/*    */     //   23: bipush #48
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #9
/*    */     //   29: pop2
/*    */     //   30: dup2
/*    */     //   31: ldc2_w 50528372441882
/*    */     //   34: lxor
/*    */     //   35: lstore #10
/*    */     //   37: dup2
/*    */     //   38: ldc2_w 65403891086004
/*    */     //   41: lxor
/*    */     //   42: lstore #12
/*    */     //   44: dup2
/*    */     //   45: ldc2_w 72002202540686
/*    */     //   48: lxor
/*    */     //   49: lstore #14
/*    */     //   51: dup2
/*    */     //   52: ldc2_w 66070882046599
/*    */     //   55: lxor
/*    */     //   56: dup2
/*    */     //   57: bipush #48
/*    */     //   59: lushr
/*    */     //   60: l2i
/*    */     //   61: istore #16
/*    */     //   63: dup2
/*    */     //   64: bipush #16
/*    */     //   66: lshl
/*    */     //   67: bipush #48
/*    */     //   69: lushr
/*    */     //   70: l2i
/*    */     //   71: istore #17
/*    */     //   73: dup2
/*    */     //   74: bipush #32
/*    */     //   76: lshl
/*    */     //   77: bipush #32
/*    */     //   79: lushr
/*    */     //   80: l2i
/*    */     //   81: istore #18
/*    */     //   83: pop2
/*    */     //   84: dup2
/*    */     //   85: ldc2_w 104851586061989
/*    */     //   88: lxor
/*    */     //   89: lstore #19
/*    */     //   91: dup2
/*    */     //   92: ldc2_w 36498920332229
/*    */     //   95: lxor
/*    */     //   96: lstore #21
/*    */     //   98: pop2
/*    */     //   99: ldc2_w -969666545595103517
/*    */     //   102: lload_2
/*    */     //   103: <illegal opcode> w : (JJ)[I
/*    */     //   108: getstatic me/konsolas/aac/dJ.a : Lme/konsolas/aac/dJ;
/*    */     //   111: aload #4
/*    */     //   113: invokevirtual a : (Lme/konsolas/aac/H;)Lme/konsolas/aac/ec;
/*    */     //   116: astore #24
/*    */     //   118: astore #23
/*    */     //   120: aload_0
/*    */     //   121: getfield b : Lme/konsolas/aac/dw;
/*    */     //   124: aload #4
/*    */     //   126: iload #16
/*    */     //   128: i2s
/*    */     //   129: iload #17
/*    */     //   131: i2c
/*    */     //   132: iload #18
/*    */     //   134: aload #24
/*    */     //   136: invokevirtual a : (Lme/konsolas/aac/H;SCILme/konsolas/aac/ec;)V
/*    */     //   139: aload #24
/*    */     //   141: lload #10
/*    */     //   143: invokevirtual a : (J)Lme/konsolas/aac/fr;
/*    */     //   146: astore #25
/*    */     //   148: goto -> 220
/*    */     //   151: astore #26
/*    */     //   153: aload #23
/*    */     //   155: ifnonnull -> 219
/*    */     //   158: aload #24
/*    */     //   160: ifnull -> 196
/*    */     //   163: goto -> 176
/*    */     //   166: ldc2_w -940567578377451782
/*    */     //   169: lload_2
/*    */     //   170: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   175: athrow
/*    */     //   176: aload #24
/*    */     //   178: lload #21
/*    */     //   180: invokevirtual f : (J)V
/*    */     //   183: goto -> 196
/*    */     //   186: ldc2_w -940567578377451782
/*    */     //   189: lload_2
/*    */     //   190: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   195: athrow
/*    */     //   196: aload_0
/*    */     //   197: getfield b : Lme/konsolas/aac/dw;
/*    */     //   200: aload #26
/*    */     //   202: lload #7
/*    */     //   204: aload #4
/*    */     //   206: iload #9
/*    */     //   208: i2s
/*    */     //   209: invokevirtual a : (Ljava/lang/Exception;JLme/konsolas/aac/H;S)V
/*    */     //   212: lload #19
/*    */     //   214: aload #4
/*    */     //   216: invokestatic a : (JLjava/io/Closeable;)V
/*    */     //   219: return
/*    */     //   220: new java/lang/StringBuilder
/*    */     //   223: dup
/*    */     //   224: invokespecial <init> : ()V
/*    */     //   227: getstatic me/konsolas/aac/j3.c : Ljava/lang/String;
/*    */     //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   233: aload_0
/*    */     //   234: getfield a : Lme/konsolas/aac/s;
/*    */     //   237: invokevirtual a : ()Lme/konsolas/aac/l6;
/*    */     //   240: lload #12
/*    */     //   242: invokevirtual h : (J)Ljava/lang/String;
/*    */     //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   248: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   251: astore #26
/*    */     //   253: aload_0
/*    */     //   254: getfield b : Lme/konsolas/aac/dw;
/*    */     //   257: aload #26
/*    */     //   259: lload #5
/*    */     //   261: aload #25
/*    */     //   263: invokevirtual a : (Ljava/lang/String;JLme/konsolas/aac/fr;)V
/*    */     //   266: aload_0
/*    */     //   267: getfield b : Lme/konsolas/aac/dw;
/*    */     //   270: getfield l : Lme/konsolas/aac/jn;
/*    */     //   273: aload_0
/*    */     //   274: getfield b : Lme/konsolas/aac/dw;
/*    */     //   277: aload #4
/*    */     //   279: invokevirtual a : (Lme/konsolas/aac/k3;Lme/konsolas/aac/H;)V
/*    */     //   282: aload_0
/*    */     //   283: getfield b : Lme/konsolas/aac/dw;
/*    */     //   286: lload #14
/*    */     //   288: invokevirtual e : (J)V
/*    */     //   291: goto -> 311
/*    */     //   294: astore #26
/*    */     //   296: aload_0
/*    */     //   297: getfield b : Lme/konsolas/aac/dw;
/*    */     //   300: aload #26
/*    */     //   302: lload #7
/*    */     //   304: aconst_null
/*    */     //   305: iload #9
/*    */     //   307: i2s
/*    */     //   308: invokevirtual a : (Ljava/lang/Exception;JLme/konsolas/aac/H;S)V
/*    */     //   311: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 108
/*    */     //   #2	-> 120
/*    */     //   #10	-> 139
/*    */     //   #12	-> 148
/*    */     //   #5	-> 151
/*    */     //   #6	-> 153
/*    */     //   #15	-> 196
/*    */     //   #14	-> 212
/*    */     //   #7	-> 219
/*    */     //   #19	-> 220
/*    */     //   #18	-> 253
/*    */     //   #20	-> 266
/*    */     //   #4	-> 282
/*    */     //   #8	-> 291
/*    */     //   #3	-> 294
/*    */     //   #17	-> 296
/*    */     //   #11	-> 311
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   120	148	151	java/io/IOException
/*    */     //   153	163	166	java/io/IOException
/*    */     //   158	183	186	java/io/IOException
/*    */     //   220	291	294	java/lang/Exception
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = nc.a(3886860571183965487L, -6597217141973782692L, MethodHandles.lookup().lookupClass()).a(172344771207888L) ^ 0xDCB344C4BEL;
/*    */     "軐鞠ꇽ橫攆⏯㈬邅骅쑗焁昦\007啑앂眏低䯖濹㑥".toCharArray()[9] = (char)("軐鞠ꇽ橫攆⏯㈬邅骅쑗焁昦\007啑앂眏低䯖濹㑥".toCharArray()[9] ^ 0x582E);
/*    */     "ຉ䈤ᔒ".toCharArray()[0] = (char)("ຉ䈤ᔒ".toCharArray()[0] ^ 0x5D3F);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("軐鞠ꇽ橫攆⏯㈬邅骅쑗焁昦\007啑앂眏低䯖濹㑥".toCharArray(), (short)26875, false, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("ຉ䈤ᔒ".toCharArray(), (short)12962, false, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "쁔ৎ⼲ᴦ횋╉걽쳏̩혇繥쟂哸ꘐ⫺卛泂հ鱾恉ຂ䰶鯡征".toCharArray()[3] = (char)("쁔ৎ⼲ᴦ횋╉걽쳏̩혇繥쟂哸ꘐ⫺卛泂հ鱾恉ຂ䰶鯡征".toCharArray()[3] ^ 0x3C34);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\j3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */