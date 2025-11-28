/*    */ package me.konsolas.aac;
/*    */ import java.io.IOException;
/*    */ 
/*    */ class e4 implements gp {
/*    */   public void flush() {
/*  6 */     long l1 = c ^ 0x4F1E79377EC6L, l2 = l1 ^ 0x3E5ECA1B0641L, l3 = l1 ^ 0x734E64E5CD03L, l4 = l1 ^ 0x597BB250C337L; boolean bool = false;
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
/* 28 */     this.a.b(l3);
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
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 44 */       this.b.flush();
/*    */       bool = true;
/*    */     } catch (IOException iOException) {
/*    */       throw this.a.b(l2, iOException);
/*    */     } finally {
/*    */       this.a.a(bool, l4);
/*    */     } 
/*    */   }
/*    */   
/*    */   final gp b;
/*    */   final lH a;
/*    */   private static final long c = nc.a(4200772987153413822L, -4266681588326003242L, MethodHandles.lookup().lookupClass()).a(181295873940348L);
/*    */   private static final String d;
/*    */   
/*    */   public void b(long paramLong1, fw paramfw, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 6498009824681
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 42611201279049
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: dup2
/*    */     //   16: ldc2_w 118548067962635
/*    */     //   19: lxor
/*    */     //   20: lstore #10
/*    */     //   22: dup2
/*    */     //   23: ldc2_w 0
/*    */     //   26: lxor
/*    */     //   27: lstore #12
/*    */     //   29: dup2
/*    */     //   30: ldc2_w 72448746701119
/*    */     //   33: lxor
/*    */     //   34: lstore #14
/*    */     //   36: pop2
/*    */     //   37: ldc2_w 416726477447123952
/*    */     //   40: lload_1
/*    */     //   41: <illegal opcode> w : (JJ)I
/*    */     //   46: aload_3
/*    */     //   47: getfield a : J
/*    */     //   50: lconst_0
/*    */     //   51: lload #4
/*    */     //   53: lload #6
/*    */     //   55: invokestatic a : (JJJJ)V
/*    */     //   58: istore #16
/*    */     //   60: lload #4
/*    */     //   62: lconst_0
/*    */     //   63: lcmp
/*    */     //   64: ifle -> 268
/*    */     //   67: lconst_0
/*    */     //   68: lstore #17
/*    */     //   70: aload_3
/*    */     //   71: getfield b : Lme/konsolas/aac/eV;
/*    */     //   74: astore #19
/*    */     //   76: lload #17
/*    */     //   78: ldc2_w 65536
/*    */     //   81: lcmp
/*    */     //   82: ifge -> 177
/*    */     //   85: aload #19
/*    */     //   87: getfield c : I
/*    */     //   90: aload #19
/*    */     //   92: getfield d : I
/*    */     //   95: isub
/*    */     //   96: istore #20
/*    */     //   98: lload #17
/*    */     //   100: iload #20
/*    */     //   102: i2l
/*    */     //   103: ladd
/*    */     //   104: lstore #17
/*    */     //   106: iload #16
/*    */     //   108: lload_1
/*    */     //   109: lconst_0
/*    */     //   110: lcmp
/*    */     //   111: iflt -> 174
/*    */     //   114: ifne -> 172
/*    */     //   117: lload #17
/*    */     //   119: lload #4
/*    */     //   121: lcmp
/*    */     //   122: iload #16
/*    */     //   124: ifne -> 184
/*    */     //   127: goto -> 140
/*    */     //   130: ldc2_w 428254890613504126
/*    */     //   133: lload_1
/*    */     //   134: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   139: athrow
/*    */     //   140: iflt -> 165
/*    */     //   143: goto -> 156
/*    */     //   146: ldc2_w 428254890613504126
/*    */     //   149: lload_1
/*    */     //   150: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   155: athrow
/*    */     //   156: lload #4
/*    */     //   158: lstore #17
/*    */     //   160: iload #16
/*    */     //   162: ifeq -> 177
/*    */     //   165: aload #19
/*    */     //   167: getfield b : Lme/konsolas/aac/eV;
/*    */     //   170: astore #19
/*    */     //   172: iload #16
/*    */     //   174: ifeq -> 76
/*    */     //   177: lload_1
/*    */     //   178: lconst_0
/*    */     //   179: lcmp
/*    */     //   180: iflt -> 60
/*    */     //   183: iconst_0
/*    */     //   184: istore #19
/*    */     //   186: aload_0
/*    */     //   187: getfield a : Lme/konsolas/aac/lH;
/*    */     //   190: lload #10
/*    */     //   192: invokevirtual b : (J)V
/*    */     //   195: aload_0
/*    */     //   196: getfield b : Lme/konsolas/aac/gp;
/*    */     //   199: lload #12
/*    */     //   201: aload_3
/*    */     //   202: lload #17
/*    */     //   204: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*    */     //   209: lload #4
/*    */     //   211: lload #17
/*    */     //   213: lsub
/*    */     //   214: lstore #4
/*    */     //   216: iconst_1
/*    */     //   217: istore #19
/*    */     //   219: aload_0
/*    */     //   220: getfield a : Lme/konsolas/aac/lH;
/*    */     //   223: iload #19
/*    */     //   225: lload #14
/*    */     //   227: invokevirtual a : (ZJ)V
/*    */     //   230: goto -> 263
/*    */     //   233: astore #20
/*    */     //   235: aload_0
/*    */     //   236: getfield a : Lme/konsolas/aac/lH;
/*    */     //   239: lload #8
/*    */     //   241: aload #20
/*    */     //   243: invokevirtual b : (JLjava/io/IOException;)Ljava/io/IOException;
/*    */     //   246: athrow
/*    */     //   247: astore #21
/*    */     //   249: aload_0
/*    */     //   250: getfield a : Lme/konsolas/aac/lH;
/*    */     //   253: iload #19
/*    */     //   255: lload #14
/*    */     //   257: invokevirtual a : (ZJ)V
/*    */     //   260: aload #21
/*    */     //   262: athrow
/*    */     //   263: iload #16
/*    */     //   265: ifeq -> 60
/*    */     //   268: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 46
/*    */     //   #4	-> 60
/*    */     //   #30	-> 67
/*    */     //   #33	-> 70
/*    */     //   #38	-> 85
/*    */     //   #16	-> 98
/*    */     //   #26	-> 106
/*    */     //   #2	-> 156
/*    */     //   #8	-> 160
/*    */     //   #17	-> 165
/*    */     //   #20	-> 177
/*    */     //   #45	-> 186
/*    */     //   #15	-> 195
/*    */     //   #35	-> 209
/*    */     //   #11	-> 216
/*    */     //   #18	-> 219
/*    */     //   #12	-> 230
/*    */     //   #13	-> 233
/*    */     //   #3	-> 235
/*    */     //   #9	-> 247
/*    */     //   #24	-> 263
/*    */     //   #5	-> 268
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   106	127	130	java/io/IOException
/*    */     //   117	143	146	java/io/IOException
/*    */     //   195	219	233	java/io/IOException
/*    */     //   195	219	247	finally
/*    */     //   233	249	247	finally
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     long l = c ^ 0xDAADD841911L;
/*    */     "᣹䴄".toCharArray()[0] = (char)("᣹䴄".toCharArray()[0] ^ 0x590E);
/*    */     return d + this.b + fW$gy.A("᣹䴄".toCharArray(), (short)11294, false, 5);
/*    */   }
/*    */   
/*    */   public void close() {
/*    */     long l1 = c ^ 0x10CDB403F4B2L, l2 = l1 ^ 0x618D072F8C35L, l3 = l1 ^ 0x2C9DA9D14777L, l4 = l1 ^ 0x6A87F644943L;
/*    */     boolean bool = false;
/*    */     this.a.b(l3);
/*    */     try {
/*    */       this.b.close();
/*    */       bool = true;
/*    */     } catch (IOException iOException) {
/*    */       throw this.a.b(l2, iOException);
/*    */     } finally {
/*    */       this.a.a(bool, l4);
/*    */     } 
/*    */   }
/*    */   
/*    */   e4(lH paramlH, gp paramgp) {}
/*    */   
/*    */   public li a() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = c ^ 0x375B7894E67FL;
/*    */     "憯ࣦ졗醟ꔂ⛵ג㟱컴际⛱괩贛⑂溔⡆榐".toCharArray()[14] = (char)("憯ࣦ졗醟ꔂ⛵ג㟱컴际⛱괩贛⑂溔⡆榐".toCharArray()[14] ^ 0x3466);
/*    */     "輍綞컑ៈ".toCharArray()[0] = (char)("輍綞컑ៈ".toCharArray()[0] ^ 0x2789);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("憯ࣦ졗醟ꔂ⛵ג㟱컴际⛱괩贛⑂溔⡆榐".toCharArray(), (short)25122, (byte)1, (byte)3))).init(2, SecretKeyFactory.getInstance(hY$g6.H("輍綞컑ៈ".toCharArray(), (short)6210, (byte)5, (byte)0)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ꪨ㢊ᒜᶱ쎝↑薄?넫嬉Ḕʹႈ챁᠇찆븫㌌姗餡ᎌ士㋅叽".toCharArray()[14] = (char)("ꪨ㢊ᒜᶱ쎝↑薄?넫嬉Ḕʹႈ챁᠇찆븫㌌姗餡ᎌ士㋅叽".toCharArray()[14] ^ 0x7559);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\e4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */