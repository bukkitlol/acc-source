/*    */ package me.konsolas.aac;public enum e6 { public static final e6 IGNORED; public static final e6 NEUTRAL; public static final e6 SUSPICIOUS;
/*    */   public ChatColor a() {
/*  3 */     return this.a;
/*    */   } public static final e6 HIGH; private final ChatColor a; private static final long c; static {
/*    */     byte b1;
/*    */     long l;
/*  7 */     for (c = nc.a(2503520538160914172L, 6180968403551462588L, MethodHandles.lookup().lookupClass()).a(60665940932259L), l = c ^ 0x3DA243304AA3L, "蜘郀₡靑짎㌁擄诠䐁ﴺⓟ琂Ɡ愪厩⨈秦셈쨫卐劺".toCharArray()[2] = (char)("蜘郀₡靑짎㌁擄诠䐁ﴺⓟ琂Ɡ愪厩⨈秦셈쨫卐劺".toCharArray()[2] ^ 0x6204), "毜⸵뵅㚀".toCharArray()[2] = (char)("毜⸵뵅㚀".toCharArray()[2] ^ 0x5145), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(fW$gy.A("蜘郀₡靑짎㌁擄诠䐁ﴺⓟ琂Ɡ愪厩⨈秦셈쨫卐劺".toCharArray(), (short)1992, false, 1))).init(2, SecretKeyFactory.getInstance(fW$gy.A("毜⸵뵅㚀".toCharArray(), (short)1790, false, 1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[4]; boolean bool = false; "댞豢鄅厗䰟禵쪖㩗鍺ﱻｑ贪㺖谁㮢쎓뮹䡩灯ʩ岫㛿潈".toCharArray()[8] = (char)("댞豢鄅厗䰟禵쪖㩗鍺ﱻｑ贪㺖谁㮢쎓뮹䡩灯ʩ岫㛿潈".toCharArray()[8] ^ 0x4172); String str; int i = (str = fW$gy.A("댞豢鄅厗䰟禵쪖㩗鍺ﱻｑ贪㺖谁㮢쎓뮹䡩灯ʩ岫㛿潈".toCharArray(), (short)21556, false, 4)).length(); byte b2 = 16; byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   e6(ChatColor paramChatColor) {
/* 11 */     this.a = paramChatColor;
/*    */   }
/*    */   
/*    */   public void a(BaseComponent paramBaseComponent, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/e6.c : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w -7927978848438009797
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore #4
/*    */     //   17: iload #4
/*    */     //   19: ifeq -> 91
/*    */     //   22: getstatic me/konsolas/aac/be.a : [I
/*    */     //   25: aload_0
/*    */     //   26: invokevirtual ordinal : ()I
/*    */     //   29: iaload
/*    */     //   30: tableswitch default -> 172, 1 -> 70, 2 -> 102, 3 -> 127, 4 -> 152
/*    */     //   60: ldc2_w -8030665974171588523
/*    */     //   63: lload_2
/*    */     //   64: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   69: athrow
/*    */     //   70: aload_1
/*    */     //   71: iconst_1
/*    */     //   72: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   75: invokevirtual setStrikethrough : (Ljava/lang/Boolean;)V
/*    */     //   78: goto -> 91
/*    */     //   81: ldc2_w -8030665974171588523
/*    */     //   84: lload_2
/*    */     //   85: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   90: athrow
/*    */     //   91: iload #4
/*    */     //   93: lload_2
/*    */     //   94: lconst_0
/*    */     //   95: lcmp
/*    */     //   96: ifle -> 111
/*    */     //   99: ifne -> 172
/*    */     //   102: aload_1
/*    */     //   103: getstatic net/md_5/bungee/api/ChatColor.GRAY : Lnet/md_5/bungee/api/ChatColor;
/*    */     //   106: invokevirtual setColor : (Lnet/md_5/bungee/api/ChatColor;)V
/*    */     //   109: iload #4
/*    */     //   111: ifne -> 172
/*    */     //   114: goto -> 127
/*    */     //   117: ldc2_w -8030665974171588523
/*    */     //   120: lload_2
/*    */     //   121: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   126: athrow
/*    */     //   127: aload_1
/*    */     //   128: getstatic net/md_5/bungee/api/ChatColor.GOLD : Lnet/md_5/bungee/api/ChatColor;
/*    */     //   131: invokevirtual setColor : (Lnet/md_5/bungee/api/ChatColor;)V
/*    */     //   134: iload #4
/*    */     //   136: ifne -> 172
/*    */     //   139: goto -> 152
/*    */     //   142: ldc2_w -8030665974171588523
/*    */     //   145: lload_2
/*    */     //   146: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   151: athrow
/*    */     //   152: aload_1
/*    */     //   153: getstatic net/md_5/bungee/api/ChatColor.RED : Lnet/md_5/bungee/api/ChatColor;
/*    */     //   156: invokevirtual setColor : (Lnet/md_5/bungee/api/ChatColor;)V
/*    */     //   159: goto -> 172
/*    */     //   162: ldc2_w -8030665974171588523
/*    */     //   165: lload_2
/*    */     //   166: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   171: athrow
/*    */     //   172: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 17
/*    */     //   #9	-> 70
/*    */     //   #2	-> 91
/*    */     //   #15	-> 102
/*    */     //   #8	-> 109
/*    */     //   #5	-> 127
/*    */     //   #6	-> 134
/*    */     //   #16	-> 152
/*    */     //   #10	-> 172
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	60	60	aacinternal/v
/*    */     //   22	78	81	aacinternal/v
/*    */     //   91	114	117	aacinternal/v
/*    */     //   102	139	142	aacinternal/v
/*    */     //   127	159	162	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\e6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */