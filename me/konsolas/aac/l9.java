/*  1 */ package me.konsolas.aac;public abstract class l9 implements gp { private final gp a; public final gp a() { return this.a; } private static final long h = nc.a(674358379536385930L, 7519129116681449932L, MethodHandles.lookup().lookupClass()).a(163554290162975L); private static final String i; public String toString() {
/*  2 */     "齖⃺".toCharArray()[0] = (char)("齖⃺".toCharArray()[0] ^ 0x290A); "㻀⍈".toCharArray()[0] = (char)("㻀⍈".toCharArray()[0] ^ 0x7E4B); return getClass().getSimpleName() + dP$dt.X("齖⃺".toCharArray(), (short)8065, false, true) + this.a.toString() + dP$dt.X("㻀⍈".toCharArray(), (short)28204, false, true); } public l9(gp paramgp, long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/l9.h : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 2786450649883090659
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: invokespecial <init> : ()V
/*    */     //   19: istore #4
/*    */     //   21: iload #4
/*    */     //   23: ifeq -> 69
/*    */     //   26: aload_1
/*    */     //   27: ifnonnull -> 64
/*    */     //   30: goto -> 43
/*    */     //   33: ldc2_w 2804471950917831442
/*    */     //   36: lload_2
/*    */     //   37: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   42: athrow
/*    */     //   43: new java/lang/IllegalArgumentException
/*    */     //   46: dup
/*    */     //   47: getstatic me/konsolas/aac/l9.i : Ljava/lang/String;
/*    */     //   50: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   53: athrow
/*    */     //   54: ldc2_w 2804471950917831442
/*    */     //   57: lload_2
/*    */     //   58: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   63: athrow
/*    */     //   64: aload_0
/*    */     //   65: aload_1
/*    */     //   66: putfield a : Lme/konsolas/aac/gp;
/*    */     //   69: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 15
/*    */     //   #7	-> 21
/*    */     //   #13	-> 64
/*    */     //   #5	-> 69
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   21	30	33	java/lang/IllegalArgumentException
/*    */     //   26	54	54	java/lang/IllegalArgumentException }
/*    */   public li a() {
/*  4 */     return this.a.a();
/*    */   } public void b(long paramLong1, fw paramfw, long paramLong2) {
/*  6 */     long l = paramLong1 ^ 0x0L; this.a.b(l, paramfw, paramLong2);
/*    */   }
/*    */   
/*    */   public void close() {
/* 10 */     this.a.close();
/*    */   } public void flush() {
/* 12 */     this.a.flush();
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = h ^ 0xAB5DB30BDAL;
/*    */     "疳즽凶㓮Ꮆ䵫臆?녆羡｟顣潤讷췄얪嫾".toCharArray()[11] = (char)("疳즽凶㓮Ꮆ䵫臆?녆羡｟顣潤讷췄얪嫾".toCharArray()[11] ^ 0x45C8);
/*    */     "әꥥ享ဈ".toCharArray()[0] = (char)("әꥥ享ဈ".toCharArray()[0] ^ 0x32EF);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("疳즽凶㓮Ꮆ䵫臆?녆羡｟顣潤讷췄얪嫾".toCharArray(), (short)27611, false, (byte)3))).init(2, SecretKeyFactory.getInstance(a0$cc.G("әꥥ享ဈ".toCharArray(), (short)22185, true, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "앱౭ລ隳웯ゆ័兂?컳㴞躊埞妮ຈ晳鑖疰杲蛯ކ맥灥ϓ".toCharArray()[5] = (char)("앱౭ລ隳웯ゆ័兂?컳㴞躊埞妮ຈ晳鑖疰杲蛯ކ맥灥ϓ".toCharArray()[5] ^ 0x6A71);
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l9.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */