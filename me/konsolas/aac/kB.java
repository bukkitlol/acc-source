/*    */ package me.konsolas.aac;final class kb extends Reader { kb(bX parambX, Charset paramCharset) {
/*  2 */     this.a = parambX;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.b = paramCharset;
/*    */   }
/*    */   
/*    */   private final bX a;
/*    */   private final Charset b;
/*    */   private boolean c;
/*    */   @Nullable
/*    */   private Reader d;
/*    */   private static final long e = nc.a(-4406431981015596342L, 9152054117921314110L, MethodHandles.lookup().lookupClass()).a(225460165693139L);
/*    */   private static final String f;
/*    */   
/*    */   public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kb.e : J
/*    */     //   3: ldc2_w 128645755842150
/*    */     //   6: lxor
/*    */     //   7: lstore #4
/*    */     //   9: lload #4
/*    */     //   11: dup2
/*    */     //   12: ldc2_w 102294752541912
/*    */     //   15: lxor
/*    */     //   16: lstore #6
/*    */     //   18: pop2
/*    */     //   19: ldc2_w -7164754197201970093
/*    */     //   22: lload #4
/*    */     //   24: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   29: astore #8
/*    */     //   31: aload_0
/*    */     //   32: aload #8
/*    */     //   34: ifnonnull -> 83
/*    */     //   37: getfield c : Z
/*    */     //   40: ifeq -> 79
/*    */     //   43: goto -> 57
/*    */     //   46: ldc2_w -7155681780767908874
/*    */     //   49: lload #4
/*    */     //   51: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   56: athrow
/*    */     //   57: new java/io/IOException
/*    */     //   60: dup
/*    */     //   61: getstatic me/konsolas/aac/kb.f : Ljava/lang/String;
/*    */     //   64: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   67: athrow
/*    */     //   68: ldc2_w -7155681780767908874
/*    */     //   71: lload #4
/*    */     //   73: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   78: athrow
/*    */     //   79: aload_0
/*    */     //   80: getfield d : Ljava/io/Reader;
/*    */     //   83: astore #9
/*    */     //   85: aload #9
/*    */     //   87: aload #8
/*    */     //   89: ifnonnull -> 151
/*    */     //   92: ifnonnull -> 149
/*    */     //   95: goto -> 109
/*    */     //   98: ldc2_w -7155681780767908874
/*    */     //   101: lload #4
/*    */     //   103: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   108: athrow
/*    */     //   109: aload_0
/*    */     //   110: getfield a : Lme/konsolas/aac/bX;
/*    */     //   113: aload_0
/*    */     //   114: getfield b : Ljava/nio/charset/Charset;
/*    */     //   117: lload #6
/*    */     //   119: invokestatic a : (Lme/konsolas/aac/bX;Ljava/nio/charset/Charset;J)Ljava/nio/charset/Charset;
/*    */     //   122: astore #10
/*    */     //   124: aload_0
/*    */     //   125: new java/io/InputStreamReader
/*    */     //   128: dup
/*    */     //   129: aload_0
/*    */     //   130: getfield a : Lme/konsolas/aac/bX;
/*    */     //   133: invokeinterface a : ()Ljava/io/InputStream;
/*    */     //   138: aload #10
/*    */     //   140: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
/*    */     //   143: dup_x1
/*    */     //   144: putfield d : Ljava/io/Reader;
/*    */     //   147: astore #9
/*    */     //   149: aload #9
/*    */     //   151: aload_1
/*    */     //   152: iload_2
/*    */     //   153: iload_3
/*    */     //   154: invokevirtual read : ([CII)I
/*    */     //   157: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #4	-> 31
/*    */     //   #11	-> 79
/*    */     //   #9	-> 85
/*    */     //   #12	-> 109
/*    */     //   #3	-> 124
/*    */     //   #7	-> 149
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   31	43	46	java/io/IOException
/*    */     //   37	68	68	java/io/IOException
/*    */     //   85	95	98	java/io/IOException
/*    */   }
/*    */   
/*    */   public void close() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kb.e : J
/*    */     //   3: ldc2_w 32093911030183
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w 3121212470462983058
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   17: aload_0
/*    */     //   18: iconst_1
/*    */     //   19: putfield c : Z
/*    */     //   22: astore_3
/*    */     //   23: aload_0
/*    */     //   24: aload_3
/*    */     //   25: ifnonnull -> 85
/*    */     //   28: getfield d : Ljava/io/Reader;
/*    */     //   31: ifnull -> 71
/*    */     //   34: goto -> 47
/*    */     //   37: ldc2_w 3130144015792909367
/*    */     //   40: lload_1
/*    */     //   41: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   46: athrow
/*    */     //   47: aload_0
/*    */     //   48: getfield d : Ljava/io/Reader;
/*    */     //   51: invokevirtual close : ()V
/*    */     //   54: aload_3
/*    */     //   55: ifnull -> 93
/*    */     //   58: goto -> 71
/*    */     //   61: ldc2_w 3130144015792909367
/*    */     //   64: lload_1
/*    */     //   65: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: goto -> 85
/*    */     //   75: ldc2_w 3130144015792909367
/*    */     //   78: lload_1
/*    */     //   79: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   84: athrow
/*    */     //   85: getfield a : Lme/konsolas/aac/bX;
/*    */     //   88: invokeinterface close : ()V
/*    */     //   93: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 17
/*    */     //   #6	-> 23
/*    */     //   #1	-> 47
/*    */     //   #5	-> 71
/*    */     //   #13	-> 93
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   23	34	37	java/io/IOException
/*    */     //   28	58	61	java/io/IOException
/*    */     //   47	72	75	java/io/IOException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = e ^ 0xF7C50501C58L;
/*    */     "棧벋䃛뷇큒꫸氏㳒ₙ巈竫櫃窿蚻ꉗᕺꓫ얥틿⽇僜".toCharArray()[4] = (char)("棧벋䃛뷇큒꫸氏㳒ₙ巈竫櫃窿蚻ꉗᕺꓫ얥틿⽇僜".toCharArray()[4] ^ 0x413D);
/*    */     "灷Ẁ压䍎".toCharArray()[1] = (char)("灷Ẁ压䍎".toCharArray()[1] ^ 0x1D9B);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(fW$gy.A("棧벋䃛뷇큒꫸氏㳒ₙ巈竫櫃窿蚻ꉗᕺꓫ얥틿⽇僜".toCharArray(), (short)15216, false, 0))).init(2, SecretKeyFactory.getInstance(fW$gy.A("灷Ẁ压䍎".toCharArray(), (short)24626, false, 1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "柢睜ꭜ桑ĺ䨶Ⴥ䆽摙揟햠웉嫵坑".toCharArray()[4] = (char)("柢睜ꭜ桑ĺ䨶Ⴥ䆽摙揟햠웉嫵坑".toCharArray()[4] ^ 0x1114);
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
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */