/*    */ package aacinternal;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public enum an {
/*    */   public static final an LEGACY;
/*    */   public static final an R_1;
/*    */   public static final an R_2;
/*    */   public static final an R_3;
/*    */   public static final an R_4;
/*    */   public static final an R_5;
/*    */   public static final an R_6;
/*    */   
/*    */   public double a(double[] paramArrayOfdouble, byte paramByte, double paramDouble, int paramInt1, int paramInt2, af paramaf) {
/* 14 */     long l1 = (paramByte << 56L | paramInt1 << 32L >>> 8L | paramInt2 << 40L >>> 40L) ^ c, l2 = l1 ^ 0x3D0EB0D632FDL; return a(paramArrayOfdouble, null, l2, paramDouble, paramaf);
/*    */   } public static final an R_7; public static final an R_8; public static final an R_9; private final String a; private static final an[] b; private static final long c; protected double a(double[] paramArrayOfdouble, int[] paramArrayOfint, long paramLong, double paramDouble, af paramaf) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/an.c : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 33394440016464
/*    */     //   11: lxor
/*    */     //   12: lstore #8
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 110950449089612
/*    */     //   18: lxor
/*    */     //   19: lstore #10
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 126798253476114
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #12
/*    */     //   33: dup2
/*    */     //   34: bipush #16
/*    */     //   36: lshl
/*    */     //   37: bipush #32
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #13
/*    */     //   43: dup2
/*    */     //   44: bipush #48
/*    */     //   46: lshl
/*    */     //   47: bipush #48
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: istore #14
/*    */     //   53: pop2
/*    */     //   54: dup2
/*    */     //   55: ldc2_w 11356128445091
/*    */     //   58: lxor
/*    */     //   59: dup2
/*    */     //   60: bipush #48
/*    */     //   62: lushr
/*    */     //   63: l2i
/*    */     //   64: istore #15
/*    */     //   66: dup2
/*    */     //   67: bipush #16
/*    */     //   69: lshl
/*    */     //   70: bipush #32
/*    */     //   72: lushr
/*    */     //   73: l2i
/*    */     //   74: istore #16
/*    */     //   76: dup2
/*    */     //   77: bipush #48
/*    */     //   79: lshl
/*    */     //   80: bipush #48
/*    */     //   82: lushr
/*    */     //   83: l2i
/*    */     //   84: istore #17
/*    */     //   86: pop2
/*    */     //   87: pop2
/*    */     //   88: ldc2_w -8508072596396898143
/*    */     //   91: lload_3
/*    */     //   92: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   97: lload #8
/*    */     //   99: aload_1
/*    */     //   100: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   103: astore #18
/*    */     //   105: dload #5
/*    */     //   107: ldc2_w 100.0
/*    */     //   110: dcmpl
/*    */     //   111: aload #18
/*    */     //   113: ifnull -> 167
/*    */     //   116: ifgt -> 170
/*    */     //   119: goto -> 132
/*    */     //   122: ldc2_w -8557847670125883502
/*    */     //   125: lload_3
/*    */     //   126: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   131: athrow
/*    */     //   132: dload #5
/*    */     //   134: aload #18
/*    */     //   136: ifnull -> 262
/*    */     //   139: goto -> 152
/*    */     //   142: ldc2_w -8557847670125883502
/*    */     //   145: lload_3
/*    */     //   146: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   151: athrow
/*    */     //   152: dconst_0
/*    */     //   153: dcmpg
/*    */     //   154: goto -> 167
/*    */     //   157: ldc2_w -8557847670125883502
/*    */     //   160: lload_3
/*    */     //   161: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   166: athrow
/*    */     //   167: ifgt -> 226
/*    */     //   170: new aacinternal/v
/*    */     //   173: dup
/*    */     //   174: getstatic aacinternal/A.OUT_OF_BOUNDS_QUANTILE_VALUE : Laacinternal/A;
/*    */     //   177: iconst_3
/*    */     //   178: anewarray java/lang/Object
/*    */     //   181: dup
/*    */     //   182: iconst_0
/*    */     //   183: dload #5
/*    */     //   185: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   188: aastore
/*    */     //   189: dup
/*    */     //   190: iconst_1
/*    */     //   191: iconst_0
/*    */     //   192: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   195: aastore
/*    */     //   196: dup
/*    */     //   197: iconst_2
/*    */     //   198: bipush #100
/*    */     //   200: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   203: aastore
/*    */     //   204: iload #15
/*    */     //   206: i2s
/*    */     //   207: iload #16
/*    */     //   209: iload #17
/*    */     //   211: i2s
/*    */     //   212: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   215: athrow
/*    */     //   216: ldc2_w -8557847670125883502
/*    */     //   219: lload_3
/*    */     //   220: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   225: athrow
/*    */     //   226: aload_0
/*    */     //   227: aload_1
/*    */     //   228: iload #12
/*    */     //   230: i2s
/*    */     //   231: aload_2
/*    */     //   232: aload_0
/*    */     //   233: dload #5
/*    */     //   235: ldc2_w 100.0
/*    */     //   238: ddiv
/*    */     //   239: aload_1
/*    */     //   240: arraylength
/*    */     //   241: lload #10
/*    */     //   243: dup2_x1
/*    */     //   244: pop2
/*    */     //   245: invokevirtual a : (DJI)D
/*    */     //   248: aload_1
/*    */     //   249: arraylength
/*    */     //   250: iload #13
/*    */     //   252: swap
/*    */     //   253: iload #14
/*    */     //   255: i2s
/*    */     //   256: swap
/*    */     //   257: aload #7
/*    */     //   259: invokevirtual a : ([DS[IDISILaacinternal/af;)D
/*    */     //   262: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 97
/*    */     //   #23	-> 105
/*    */     //   #11	-> 170
/*    */     //   #2	-> 185
/*    */     //   #3	-> 226
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   105	119	122	aacinternal/v
/*    */     //   116	139	142	aacinternal/v
/*    */     //   132	154	157	aacinternal/v
/*    */     //   167	216	216	aacinternal/v
/*    */   }
/*    */   static {
/*    */     byte b1;
/*    */     long l;
/* 21 */     for (c = nc.a(-4095214695919613218L, 3029692368360060572L, MethodHandles.lookup().lookupClass()).a(71308477450144L), l = c ^ 0x436933F92343L, "ꊽ穰롫냙ඟ荛汽蛤᭄埒夥⫒⡟닡วꖈꗍ?ビ".toCharArray()[3] = (char)("ꊽ穰롫냙ඟ荛汽蛤᭄埒夥⫒⡟닡วꖈꗍ?ビ".toCharArray()[3] ^ 0x4CD1), "؝딑浃㸚".toCharArray()[2] = (char)("؝딑浃㸚".toCharArray()[2] ^ 0x552D), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(D$X.L("ꊽ穰롫냙ඟ荛汽蛤᭄埒夥⫒⡟닡วꖈꗍ?ビ".toCharArray(), (short)21621, (byte)4, false))).init(2, SecretKeyFactory.getInstance(D$X.L("؝딑浃㸚".toCharArray(), (short)9804, (byte)1, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[20]; boolean bool = false; "縋ፇ㩙֛脂❵泐橿矠㮾뀕緻恒晴含邑?ࡿ革斨䡀첑ฌ齌熶⢂͆몝푂绒䖿緲렴침㭂딣࠘犢껸䃓磺婈?덶荠㱬鹓婃噐ꦮꦡ忉Ꟃ쇾攕ļ젹⣆ⅇᬎ끨Վ膣橨㿧ᓣ뭛厉紁썞␬嘋餴䝤짒⛎ҵፃ䛄㇀씒㬞쬩⨊⸜䡷粐获撕淓뜵?痍氂ࢩ㭑੯ၰᦒ娔ꇽ붕飹睖버똽옷휁嘰䰔ᄒ೫ᡜ脫쳖튬ꁺ㐊旻軹중䃵场粘꣞။즧뀨誇⯖閑ᴮ᧲莂땞﬽蓴맘〕㧉쾗뜈醉譈Տة".toCharArray()[77] = (char)("縋ፇ㩙֛脂❵泐橿矠㮾뀕緻恒晴含邑?ࡿ革斨䡀첑ฌ齌熶⢂͆몝푂绒䖿緲렴침㭂딣࠘犢껸䃓磺婈?덶荠㱬鹓婃噐ꦮꦡ忉Ꟃ쇾攕ļ젹⣆ⅇᬎ끨Վ膣橨㿧ᓣ뭛厉紁썞␬嘋餴䝤짒⛎ҵፃ䛄㇀씒㬞쬩⨊⸜䡷粐获撕淓뜵?痍氂ࢩ㭑੯ၰᦒ娔ꇽ붕飹睖버똽옷휁嘰䰔ᄒ೫ᡜ脫쳖튬ꁺ㐊旻軹중䃵场粘꣞။즧뀨誇⯖閑ᴮ᧲莂땞﬽蓴맘〕㧉쾗뜈醉譈Տة".toCharArray()[77] ^ 0x48B5); String str; int i = (str = D$X.L("縋ፇ㩙֛脂❵泐橿矠㮾뀕緻恒晴含邑?ࡿ革斨䡀첑ฌ齌熶⢂͆몝푂绒䖿緲렴침㭂딣࠘犢껸䃓磺婈?덶荠㱬鹓婃噐ꦮꦡ忉Ꟃ쇾攕ļ젹⣆ⅇᬎ끨Վ膣橨㿧ᓣ뭛厉紁썞␬嘋餴䝤짒⛎ҵፃ䛄㇀씒㬞쬩⨊⸜䡷粐获撕淓뜵?痍氂ࢩ㭑੯ၰᦒ娔ꇽ붕飹睖버똽옷휁嘰䰔ᄒ೫ᡜ脫쳖튬ꁺ㐊旻軹중䃵场粘꣞။즧뀨誇⯖閑ᴮ᧲莂땞﬽蓴맘〕㧉쾗뜈醉譈Տة".toCharArray(), (short)12359, (byte)5, false)).length(); byte b2 = 8; byte b = -1;
/*    */     while (true);
/*    */   }
/*    */ 
/*    */   
/*    */   String a() {
/* 27 */     return this.a;
/*    */   }
/*    */   
/*    */   an(String paramString1) {
/*    */     this.a = paramString1;
/*    */   }
/*    */   
/*    */   protected double a(double[] paramArrayOfdouble, short paramShort1, int[] paramArrayOfint, double paramDouble, int paramInt1, short paramShort2, int paramInt2, af paramaf) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload #6
/*    */     //   7: i2l
/*    */     //   8: bipush #32
/*    */     //   10: lshl
/*    */     //   11: bipush #16
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: iload #7
/*    */     //   17: i2l
/*    */     //   18: bipush #48
/*    */     //   20: lshl
/*    */     //   21: bipush #48
/*    */     //   23: lushr
/*    */     //   24: lor
/*    */     //   25: lstore #10
/*    */     //   27: lload #10
/*    */     //   29: dup2
/*    */     //   30: ldc2_w 139777018454327
/*    */     //   33: lxor
/*    */     //   34: lstore #12
/*    */     //   36: dup2
/*    */     //   37: ldc2_w 121276043428016
/*    */     //   40: lxor
/*    */     //   41: lstore #14
/*    */     //   43: pop2
/*    */     //   44: ldc2_w -4539854513005379149
/*    */     //   47: lload #10
/*    */     //   49: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   54: lload #14
/*    */     //   56: dload #4
/*    */     //   58: invokestatic t : (JD)D
/*    */     //   61: dstore #17
/*    */     //   63: dload #17
/*    */     //   65: d2i
/*    */     //   66: istore #19
/*    */     //   68: astore #16
/*    */     //   70: dload #4
/*    */     //   72: dload #17
/*    */     //   74: dsub
/*    */     //   75: dstore #20
/*    */     //   77: dload #4
/*    */     //   79: dconst_1
/*    */     //   80: dcmpg
/*    */     //   81: aload #16
/*    */     //   83: ifnull -> 150
/*    */     //   86: ifge -> 125
/*    */     //   89: goto -> 103
/*    */     //   92: ldc2_w -4598709925107644800
/*    */     //   95: lload #10
/*    */     //   97: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   102: athrow
/*    */     //   103: aload #9
/*    */     //   105: lload #12
/*    */     //   107: aload_1
/*    */     //   108: aload_3
/*    */     //   109: iconst_0
/*    */     //   110: invokevirtual a : (J[D[II)D
/*    */     //   113: dreturn
/*    */     //   114: ldc2_w -4598709925107644800
/*    */     //   117: lload #10
/*    */     //   119: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   124: athrow
/*    */     //   125: dload #4
/*    */     //   127: aload #16
/*    */     //   129: ifnull -> 191
/*    */     //   132: iload #8
/*    */     //   134: i2d
/*    */     //   135: dcmpl
/*    */     //   136: goto -> 150
/*    */     //   139: ldc2_w -4598709925107644800
/*    */     //   142: lload #10
/*    */     //   144: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   149: athrow
/*    */     //   150: iflt -> 178
/*    */     //   153: aload #9
/*    */     //   155: lload #12
/*    */     //   157: aload_1
/*    */     //   158: aload_3
/*    */     //   159: iload #8
/*    */     //   161: iconst_1
/*    */     //   162: isub
/*    */     //   163: invokevirtual a : (J[D[II)D
/*    */     //   166: dreturn
/*    */     //   167: ldc2_w -4598709925107644800
/*    */     //   170: lload #10
/*    */     //   172: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   177: athrow
/*    */     //   178: aload #9
/*    */     //   180: lload #12
/*    */     //   182: aload_1
/*    */     //   183: aload_3
/*    */     //   184: iload #19
/*    */     //   186: iconst_1
/*    */     //   187: isub
/*    */     //   188: invokevirtual a : (J[D[II)D
/*    */     //   191: dstore #22
/*    */     //   193: aload #9
/*    */     //   195: lload #12
/*    */     //   197: aload_1
/*    */     //   198: aload_3
/*    */     //   199: iload #19
/*    */     //   201: invokevirtual a : (J[D[II)D
/*    */     //   204: dstore #24
/*    */     //   206: dload #22
/*    */     //   208: dload #20
/*    */     //   210: dload #24
/*    */     //   212: dload #22
/*    */     //   214: dsub
/*    */     //   215: dmul
/*    */     //   216: dadd
/*    */     //   217: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 54
/*    */     //   #19	-> 63
/*    */     //   #18	-> 70
/*    */     //   #34	-> 77
/*    */     //   #22	-> 103
/*    */     //   #26	-> 125
/*    */     //   #24	-> 153
/*    */     //   #30	-> 178
/*    */     //   #25	-> 193
/*    */     //   #33	-> 206
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   77	89	92	aacinternal/v
/*    */     //   86	114	114	aacinternal/v
/*    */     //   125	136	139	aacinternal/v
/*    */     //   150	167	167	aacinternal/v
/*    */   }
/*    */   
/*    */   protected abstract double a(double paramDouble, long paramLong, int paramInt);
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
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */