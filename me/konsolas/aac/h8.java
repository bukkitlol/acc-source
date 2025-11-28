/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.util.NumberConversions;
/*     */ 
/*     */ public class h8 {
/*     */   private static final Set b;
/*     */   private final kP c;
/*     */   private final lq f;
/*     */   private final int g;
/*     */   private final int i;
/*     */   private final int a;
/*     */   
/*  19 */   private mt a(double paramDouble1, long paramLong, double paramDouble2, double paramDouble3) { paramLong = k ^ paramLong; long l = paramLong ^ 0x6B624F3DD29DL; return a(NumberConversions.floor(paramDouble1), NumberConversions.floor(paramDouble2), l, NumberConversions.floor(paramDouble3)); }
/*     */   private final int h;
/*     */   private final int d; private final int j; private final ej e; private static final long k; public void a(int paramInt1, int paramInt2, long paramLong, int paramInt3) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 131649211811303
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: pop2
/*     */     //   15: ldc2_w 1378483102755400785
/*     */     //   18: lload_3
/*     */     //   19: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   24: astore #8
/*     */     //   26: aload_0
/*     */     //   27: aload #8
/*     */     //   29: ifnull -> 71
/*     */     //   32: lload #6
/*     */     //   34: iload_1
/*     */     //   35: iload_2
/*     */     //   36: iload #5
/*     */     //   38: invokevirtual a : (JIII)Z
/*     */     //   41: ifeq -> 99
/*     */     //   44: goto -> 57
/*     */     //   47: ldc2_w 1374706842151763037
/*     */     //   50: lload_3
/*     */     //   51: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   56: athrow
/*     */     //   57: aload_0
/*     */     //   58: goto -> 71
/*     */     //   61: ldc2_w 1374706842151763037
/*     */     //   64: lload_3
/*     */     //   65: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   70: athrow
/*     */     //   71: getfield e : Lme/konsolas/aac/ej;
/*     */     //   74: iload_1
/*     */     //   75: aload_0
/*     */     //   76: getfield g : I
/*     */     //   79: isub
/*     */     //   80: iload_2
/*     */     //   81: aload_0
/*     */     //   82: getfield i : I
/*     */     //   85: isub
/*     */     //   86: iload #5
/*     */     //   88: aload_0
/*     */     //   89: getfield a : I
/*     */     //   92: isub
/*     */     //   93: getstatic me/konsolas/aac/ks.b : Lme/konsolas/aac/mt;
/*     */     //   96: invokevirtual a : (IIILjava/lang/Object;)V
/*     */     //   99: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #10	-> 26
/*     */     //   #115	-> 99
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	44	47	java/lang/IllegalArgumentException
/*     */     //   32	58	61	java/lang/IllegalArgumentException } public h8(Player paramPlayer, long paramLong, lq paramlq, kP paramkP, h8 paramh8) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 16877121148027
/*     */     //   11: lxor
/*     */     //   12: lstore #7
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 46508639404061
/*     */     //   18: lxor
/*     */     //   19: lstore #9
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 69859790901499
/*     */     //   25: lxor
/*     */     //   26: lstore #11
/*     */     //   28: pop2
/*     */     //   29: aload_0
/*     */     //   30: invokespecial <init> : ()V
/*     */     //   33: aload_0
/*     */     //   34: aload #5
/*     */     //   36: putfield c : Lme/konsolas/aac/kP;
/*     */     //   39: aload_0
/*     */     //   40: aload #4
/*     */     //   42: invokevirtual a : ()Lme/konsolas/aac/lq;
/*     */     //   45: putfield f : Lme/konsolas/aac/lq;
/*     */     //   48: aload_1
/*     */     //   49: invokeinterface getWorld : ()Lorg/bukkit/World;
/*     */     //   54: astore #17
/*     */     //   56: aload_0
/*     */     //   57: aload #4
/*     */     //   59: invokevirtual c : ()D
/*     */     //   62: invokestatic floor : (D)I
/*     */     //   65: putfield g : I
/*     */     //   68: aload_0
/*     */     //   69: aload #4
/*     */     //   71: invokevirtual e : ()D
/*     */     //   74: invokestatic floor : (D)I
/*     */     //   77: putfield i : I
/*     */     //   80: ldc2_w 1646917662085884331
/*     */     //   83: lload_2
/*     */     //   84: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   89: aload_0
/*     */     //   90: aload #4
/*     */     //   92: invokevirtual d : ()D
/*     */     //   95: invokestatic floor : (D)I
/*     */     //   98: putfield a : I
/*     */     //   101: aload_0
/*     */     //   102: aload #4
/*     */     //   104: invokevirtual b : ()D
/*     */     //   107: invokestatic ceil : (D)I
/*     */     //   110: putfield h : I
/*     */     //   113: aload_0
/*     */     //   114: aload #4
/*     */     //   116: invokevirtual a : ()D
/*     */     //   119: invokestatic ceil : (D)I
/*     */     //   122: putfield d : I
/*     */     //   125: aload_0
/*     */     //   126: aload #4
/*     */     //   128: invokevirtual f : ()D
/*     */     //   131: invokestatic ceil : (D)I
/*     */     //   134: putfield j : I
/*     */     //   137: aload_0
/*     */     //   138: new me/konsolas/aac/ej
/*     */     //   141: dup
/*     */     //   142: aload_0
/*     */     //   143: getfield h : I
/*     */     //   146: aload_0
/*     */     //   147: getfield g : I
/*     */     //   150: isub
/*     */     //   151: aload_0
/*     */     //   152: getfield d : I
/*     */     //   155: aload_0
/*     */     //   156: getfield i : I
/*     */     //   159: isub
/*     */     //   160: aload_0
/*     */     //   161: getfield j : I
/*     */     //   164: aload_0
/*     */     //   165: getfield a : I
/*     */     //   168: isub
/*     */     //   169: invokespecial <init> : (III)V
/*     */     //   172: putfield e : Lme/konsolas/aac/ej;
/*     */     //   175: aload_0
/*     */     //   176: getfield g : I
/*     */     //   179: istore #18
/*     */     //   181: astore #16
/*     */     //   183: iload #18
/*     */     //   185: aload_0
/*     */     //   186: getfield h : I
/*     */     //   189: if_icmpge -> 456
/*     */     //   192: aload_0
/*     */     //   193: getfield i : I
/*     */     //   196: istore #19
/*     */     //   198: iload #19
/*     */     //   200: aload_0
/*     */     //   201: getfield d : I
/*     */     //   204: if_icmpge -> 442
/*     */     //   207: aload_0
/*     */     //   208: getfield a : I
/*     */     //   211: aload #16
/*     */     //   213: ifnull -> 185
/*     */     //   216: istore #20
/*     */     //   218: iload #20
/*     */     //   220: aload_0
/*     */     //   221: getfield j : I
/*     */     //   224: if_icmpge -> 428
/*     */     //   227: aload #6
/*     */     //   229: aload #16
/*     */     //   231: ifnull -> 193
/*     */     //   234: aload #16
/*     */     //   236: lload_2
/*     */     //   237: lconst_0
/*     */     //   238: lcmp
/*     */     //   239: iflt -> 231
/*     */     //   242: ifnull -> 263
/*     */     //   245: ifnull -> 367
/*     */     //   248: goto -> 261
/*     */     //   251: ldc2_w 1651041373730519463
/*     */     //   254: lload_2
/*     */     //   255: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   260: athrow
/*     */     //   261: aload #6
/*     */     //   263: iload #18
/*     */     //   265: iload #19
/*     */     //   267: iload #20
/*     */     //   269: aload #16
/*     */     //   271: ifnull -> 321
/*     */     //   274: istore #13
/*     */     //   276: istore #14
/*     */     //   278: istore #15
/*     */     //   280: lload_2
/*     */     //   281: lconst_0
/*     */     //   282: lcmp
/*     */     //   283: ifle -> 302
/*     */     //   286: lload #9
/*     */     //   288: iload #15
/*     */     //   290: iload #14
/*     */     //   292: iload #13
/*     */     //   294: invokevirtual a : (JIII)Z
/*     */     //   297: ifeq -> 367
/*     */     //   300: aload #6
/*     */     //   302: iload #18
/*     */     //   304: iload #19
/*     */     //   306: iload #20
/*     */     //   308: goto -> 321
/*     */     //   311: ldc2_w 1651041373730519463
/*     */     //   314: lload_2
/*     */     //   315: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   320: athrow
/*     */     //   321: lload #7
/*     */     //   323: dup2_x1
/*     */     //   324: pop2
/*     */     //   325: invokespecial a : (IIJI)Lme/konsolas/aac/mt;
/*     */     //   328: astore #21
/*     */     //   330: aload #16
/*     */     //   332: lload_2
/*     */     //   333: lconst_0
/*     */     //   334: lcmp
/*     */     //   335: ifle -> 425
/*     */     //   338: ifnonnull -> 390
/*     */     //   341: iconst_2
/*     */     //   342: anewarray me/konsolas/aac/aN
/*     */     //   345: ldc2_w 1629953629375024971
/*     */     //   348: lload_2
/*     */     //   349: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*     */     //   354: goto -> 367
/*     */     //   357: ldc2_w 1651041373730519463
/*     */     //   360: lload_2
/*     */     //   361: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   366: athrow
/*     */     //   367: lload #11
/*     */     //   369: aload_1
/*     */     //   370: aload #17
/*     */     //   372: iload #18
/*     */     //   374: iload #19
/*     */     //   376: iload #20
/*     */     //   378: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
/*     */     //   383: aload #5
/*     */     //   385: invokestatic a : (JLorg/bukkit/entity/Player;Lorg/bukkit/block/Block;Lme/konsolas/aac/kP;)Lme/konsolas/aac/mt;
/*     */     //   388: astore #21
/*     */     //   390: aload_0
/*     */     //   391: getfield e : Lme/konsolas/aac/ej;
/*     */     //   394: iload #18
/*     */     //   396: aload_0
/*     */     //   397: getfield g : I
/*     */     //   400: isub
/*     */     //   401: iload #19
/*     */     //   403: aload_0
/*     */     //   404: getfield i : I
/*     */     //   407: isub
/*     */     //   408: iload #20
/*     */     //   410: aload_0
/*     */     //   411: getfield a : I
/*     */     //   414: isub
/*     */     //   415: aload #21
/*     */     //   417: invokevirtual a : (IIILjava/lang/Object;)V
/*     */     //   420: iinc #20, 1
/*     */     //   423: aload #16
/*     */     //   425: ifnonnull -> 218
/*     */     //   428: iinc #19, 1
/*     */     //   431: aload #16
/*     */     //   433: lload_2
/*     */     //   434: lconst_0
/*     */     //   435: lcmp
/*     */     //   436: ifle -> 453
/*     */     //   439: ifnonnull -> 198
/*     */     //   442: iinc #18, 1
/*     */     //   445: lload_2
/*     */     //   446: lconst_0
/*     */     //   447: lcmp
/*     */     //   448: iflt -> 462
/*     */     //   451: aload #16
/*     */     //   453: ifnonnull -> 183
/*     */     //   456: lload_2
/*     */     //   457: lconst_0
/*     */     //   458: lcmp
/*     */     //   459: iflt -> 192
/*     */     //   462: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #12	-> 29
/*     */     //   #161	-> 33
/*     */     //   #42	-> 39
/*     */     //   #175	-> 48
/*     */     //   #123	-> 56
/*     */     //   #80	-> 68
/*     */     //   #117	-> 89
/*     */     //   #126	-> 101
/*     */     //   #30	-> 113
/*     */     //   #97	-> 125
/*     */     //   #95	-> 137
/*     */     //   #82	-> 175
/*     */     //   #135	-> 192
/*     */     //   #1	-> 207
/*     */     //   #146	-> 227
/*     */     //   #176	-> 300
/*     */     //   #76	-> 367
/*     */     //   #134	-> 390
/*     */     //   #85	-> 420
/*     */     //   #138	-> 428
/*     */     //   #172	-> 442
/*     */     //   #78	-> 456
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   234	248	251	java/lang/IllegalArgumentException
/*     */     //   280	308	311	java/lang/IllegalArgumentException
/*     */     //   330	354	357	java/lang/IllegalArgumentException } static { byte b1; long l;
/*  22 */     for (k = nc.a(-4346708558611946642L, -6725372219525760810L, MethodHandles.lookup().lookupClass()).a(80382350448207L), l = k ^ 0x52EF033A5B56L, "㹼䗚ⅆ?ṳ㜭䱄뤫ꂬ杮窣휞鍏ѡ葐헫ㄍǒ嬒琇".toCharArray()[8] = (char)("㹼䗚ⅆ?ṳ㜭䱄뤫ꂬ杮窣휞鍏ѡ葐헫ㄍǒ嬒琇".toCharArray()[8] ^ 0x12AC), "楢ᇍ즋笿".toCharArray()[1] = (char)("楢ᇍ즋笿".toCharArray()[1] ^ 0x2A52), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(fW$gy.A("㹼䗚ⅆ?ṳ㜭䱄뤫ꂬ杮窣휞鍏ѡ葐헫ㄍǒ嬒琇".toCharArray(), (short)19165, false, 4))).init(2, SecretKeyFactory.getInstance(fW$gy.A("楢ᇍ즋笿".toCharArray(), (short)15205, false, 3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[6]; boolean bool = false; "畕啧䤣샨边㿋?ꨫ漷黒愙扒ય讴딲嵴꘸䜖㐞懗ᗝ⎲⿿ힹ䚧聍城菳䡦膜璮ねᶐ?⬛?⦊뇚ᩳ亓븋㧕ڎ䖷㙃点簥皾攂琠鼋駞淹ꤜ曢쨬?섛䐋뒋헞䀼楖寘윳☩툒啈".toCharArray()[71] = (char)("畕啧䤣샨边㿋?ꨫ漷黒愙扒ય讴딲嵴꘸䜖㐞懗ᗝ⎲⿿ힹ䚧聍城菳䡦膜璮ねᶐ?⬛?⦊뇚ᩳ亓븋㧕ڎ䖷㙃点簥皾攂琠鼋駞淹ꤜ曢쨬?섛䐋뒋헞䀼楖寘윳☩툒啈".toCharArray()[71] ^ 0x9C); String str; int i = (str = fW$gy.A("畕啧䤣샨边㿋?ꨫ漷黒愙扒ય讴딲嵴꘸䜖㐞懗ᗝ⎲⿿ힹ䚧聍城菳䡦膜璮ねᶐ?⬛?⦊뇚ᩳ亓븋㧕ڎ䖷㙃点簥皾攂琠鼋駞淹ꤜ曢쨬?섛䐋뒋헞䀼楖寘윳☩툒啈".toCharArray(), (short)16339, false, 2)).length(); byte b3 = 16; byte b2 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     byte b4 = -1;
/*     */     continue; }
/*     */    public lq a() {
/*     */     return this.f;
/*     */   }
/*     */   public dg a(lq paramlq, k5 paramk5, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 89226399921623
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 35494313552491
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 138306932731604
/*     */     //   25: lxor
/*     */     //   26: lstore #9
/*     */     //   28: pop2
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual c : ()D
/*     */     //   33: invokestatic floor : (D)I
/*     */     //   36: istore #12
/*     */     //   38: ldc2_w -1408372755389885692
/*     */     //   41: lload_3
/*     */     //   42: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   47: aload_1
/*     */     //   48: invokevirtual e : ()D
/*     */     //   51: invokestatic floor : (D)I
/*     */     //   54: istore #13
/*     */     //   56: aload_1
/*     */     //   57: invokevirtual d : ()D
/*     */     //   60: invokestatic floor : (D)I
/*     */     //   63: istore #14
/*     */     //   65: astore #11
/*     */     //   67: aload_1
/*     */     //   68: invokevirtual b : ()D
/*     */     //   71: dconst_1
/*     */     //   72: dadd
/*     */     //   73: invokestatic floor : (D)I
/*     */     //   76: istore #15
/*     */     //   78: aload_1
/*     */     //   79: invokevirtual a : ()D
/*     */     //   82: dconst_1
/*     */     //   83: dadd
/*     */     //   84: invokestatic floor : (D)I
/*     */     //   87: istore #16
/*     */     //   89: aload_1
/*     */     //   90: invokevirtual f : ()D
/*     */     //   93: dconst_1
/*     */     //   94: dadd
/*     */     //   95: invokestatic floor : (D)I
/*     */     //   98: istore #17
/*     */     //   100: iconst_0
/*     */     //   101: istore #18
/*     */     //   103: dconst_0
/*     */     //   104: dstore #19
/*     */     //   106: iconst_0
/*     */     //   107: istore #21
/*     */     //   109: aload_0
/*     */     //   110: getfield c : Lme/konsolas/aac/kP;
/*     */     //   113: lload #7
/*     */     //   115: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   118: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   121: aload #11
/*     */     //   123: ifnull -> 476
/*     */     //   126: ifeq -> 461
/*     */     //   129: goto -> 142
/*     */     //   132: ldc2_w -1421202401175944440
/*     */     //   135: lload_3
/*     */     //   136: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   141: athrow
/*     */     //   142: iload #12
/*     */     //   144: istore #22
/*     */     //   146: iload #22
/*     */     //   148: iload #15
/*     */     //   150: if_icmpge -> 450
/*     */     //   153: aload #11
/*     */     //   155: ifnull -> 762
/*     */     //   158: iload #13
/*     */     //   160: istore #23
/*     */     //   162: iload #23
/*     */     //   164: iload #16
/*     */     //   166: if_icmpge -> 436
/*     */     //   169: iload #14
/*     */     //   171: aload #11
/*     */     //   173: ifnull -> 148
/*     */     //   176: istore #24
/*     */     //   178: iload #24
/*     */     //   180: iload #17
/*     */     //   182: if_icmpge -> 422
/*     */     //   185: aload_0
/*     */     //   186: iload #22
/*     */     //   188: iload #23
/*     */     //   190: lload #9
/*     */     //   192: iload #24
/*     */     //   194: invokespecial a : (IIJI)Lme/konsolas/aac/mt;
/*     */     //   197: astore #25
/*     */     //   199: aload #11
/*     */     //   201: lload_3
/*     */     //   202: lconst_0
/*     */     //   203: lcmp
/*     */     //   204: ifle -> 433
/*     */     //   207: ifnull -> 431
/*     */     //   210: aload #25
/*     */     //   212: lload_3
/*     */     //   213: lconst_0
/*     */     //   214: lcmp
/*     */     //   215: iflt -> 271
/*     */     //   218: aload #11
/*     */     //   220: ifnull -> 271
/*     */     //   223: goto -> 236
/*     */     //   226: ldc2_w -1421202401175944440
/*     */     //   229: lload_3
/*     */     //   230: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   235: athrow
/*     */     //   236: invokevirtual a : ()Lme/konsolas/aac/k5;
/*     */     //   239: aload_2
/*     */     //   240: if_acmpeq -> 269
/*     */     //   243: goto -> 256
/*     */     //   246: ldc2_w -1421202401175944440
/*     */     //   249: lload_3
/*     */     //   250: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   255: athrow
/*     */     //   256: goto -> 414
/*     */     //   259: ldc2_w -1421202401175944440
/*     */     //   262: lload_3
/*     */     //   263: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   268: athrow
/*     */     //   269: aload #25
/*     */     //   271: invokevirtual a : ()I
/*     */     //   274: lload_3
/*     */     //   275: lconst_0
/*     */     //   276: lcmp
/*     */     //   277: iflt -> 319
/*     */     //   280: iconst_m1
/*     */     //   281: aload #11
/*     */     //   283: ifnull -> 318
/*     */     //   286: if_icmpeq -> 414
/*     */     //   289: goto -> 302
/*     */     //   292: ldc2_w -1421202401175944440
/*     */     //   295: lload_3
/*     */     //   296: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   301: athrow
/*     */     //   302: iload #23
/*     */     //   304: iconst_1
/*     */     //   305: goto -> 318
/*     */     //   308: ldc2_w -1421202401175944440
/*     */     //   311: lload_3
/*     */     //   312: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   317: athrow
/*     */     //   318: iadd
/*     */     //   319: i2f
/*     */     //   320: aload #25
/*     */     //   322: invokevirtual a : ()I
/*     */     //   325: lload #5
/*     */     //   327: invokestatic a : (IJ)F
/*     */     //   330: fsub
/*     */     //   331: f2d
/*     */     //   332: dstore #26
/*     */     //   334: aload #11
/*     */     //   336: ifnull -> 417
/*     */     //   339: dload #26
/*     */     //   341: aload_1
/*     */     //   342: invokevirtual e : ()D
/*     */     //   345: dcmpl
/*     */     //   346: iflt -> 414
/*     */     //   349: goto -> 362
/*     */     //   352: ldc2_w -1421202401175944440
/*     */     //   355: lload_3
/*     */     //   356: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   361: athrow
/*     */     //   362: iconst_1
/*     */     //   363: istore #18
/*     */     //   365: dload #26
/*     */     //   367: aload_1
/*     */     //   368: invokevirtual e : ()D
/*     */     //   371: dsub
/*     */     //   372: dload #19
/*     */     //   374: invokestatic max : (DD)D
/*     */     //   377: dstore #19
/*     */     //   379: aload #11
/*     */     //   381: lload_3
/*     */     //   382: lconst_0
/*     */     //   383: lcmp
/*     */     //   384: ifle -> 419
/*     */     //   387: ifnull -> 417
/*     */     //   390: aload #25
/*     */     //   392: invokevirtual a : ()I
/*     */     //   395: ifeq -> 414
/*     */     //   398: goto -> 411
/*     */     //   401: ldc2_w -1421202401175944440
/*     */     //   404: lload_3
/*     */     //   405: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   410: athrow
/*     */     //   411: iconst_1
/*     */     //   412: istore #21
/*     */     //   414: iinc #24, 1
/*     */     //   417: aload #11
/*     */     //   419: ifnonnull -> 178
/*     */     //   422: lload_3
/*     */     //   423: lconst_0
/*     */     //   424: lcmp
/*     */     //   425: ifle -> 431
/*     */     //   428: iinc #23, 1
/*     */     //   431: aload #11
/*     */     //   433: ifnonnull -> 162
/*     */     //   436: iinc #22, 1
/*     */     //   439: aload #11
/*     */     //   441: lload_3
/*     */     //   442: lconst_0
/*     */     //   443: lcmp
/*     */     //   444: iflt -> 458
/*     */     //   447: ifnonnull -> 146
/*     */     //   450: aload #11
/*     */     //   452: lload_3
/*     */     //   453: lconst_0
/*     */     //   454: lcmp
/*     */     //   455: iflt -> 155
/*     */     //   458: ifnonnull -> 762
/*     */     //   461: iload #12
/*     */     //   463: goto -> 476
/*     */     //   466: ldc2_w -1421202401175944440
/*     */     //   469: lload_3
/*     */     //   470: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   475: athrow
/*     */     //   476: istore #22
/*     */     //   478: iload #22
/*     */     //   480: iload #15
/*     */     //   482: if_icmpge -> 762
/*     */     //   485: iload #13
/*     */     //   487: istore #23
/*     */     //   489: iload #23
/*     */     //   491: iload #16
/*     */     //   493: if_icmpge -> 748
/*     */     //   496: iload #14
/*     */     //   498: aload #11
/*     */     //   500: ifnull -> 480
/*     */     //   503: istore #24
/*     */     //   505: iload #24
/*     */     //   507: iload #17
/*     */     //   509: if_icmpge -> 734
/*     */     //   512: aload_0
/*     */     //   513: iload #22
/*     */     //   515: iload #23
/*     */     //   517: lload #9
/*     */     //   519: iload #24
/*     */     //   521: invokespecial a : (IIJI)Lme/konsolas/aac/mt;
/*     */     //   524: astore #25
/*     */     //   526: aload #11
/*     */     //   528: lload_3
/*     */     //   529: lconst_0
/*     */     //   530: lcmp
/*     */     //   531: ifle -> 745
/*     */     //   534: ifnull -> 743
/*     */     //   537: aload #25
/*     */     //   539: lload_3
/*     */     //   540: lconst_0
/*     */     //   541: lcmp
/*     */     //   542: iflt -> 598
/*     */     //   545: aload #11
/*     */     //   547: ifnull -> 598
/*     */     //   550: goto -> 563
/*     */     //   553: ldc2_w -1421202401175944440
/*     */     //   556: lload_3
/*     */     //   557: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   562: athrow
/*     */     //   563: invokevirtual a : ()Lme/konsolas/aac/k5;
/*     */     //   566: aload_2
/*     */     //   567: if_acmpeq -> 596
/*     */     //   570: goto -> 583
/*     */     //   573: ldc2_w -1421202401175944440
/*     */     //   576: lload_3
/*     */     //   577: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   582: athrow
/*     */     //   583: goto -> 726
/*     */     //   586: ldc2_w -1421202401175944440
/*     */     //   589: lload_3
/*     */     //   590: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   595: athrow
/*     */     //   596: aload #25
/*     */     //   598: invokevirtual a : ()I
/*     */     //   601: lload_3
/*     */     //   602: lconst_0
/*     */     //   603: lcmp
/*     */     //   604: ifle -> 646
/*     */     //   607: iconst_m1
/*     */     //   608: aload #11
/*     */     //   610: ifnull -> 645
/*     */     //   613: if_icmpeq -> 726
/*     */     //   616: goto -> 629
/*     */     //   619: ldc2_w -1421202401175944440
/*     */     //   622: lload_3
/*     */     //   623: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   628: athrow
/*     */     //   629: iload #23
/*     */     //   631: iconst_1
/*     */     //   632: goto -> 645
/*     */     //   635: ldc2_w -1421202401175944440
/*     */     //   638: lload_3
/*     */     //   639: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   644: athrow
/*     */     //   645: iadd
/*     */     //   646: i2f
/*     */     //   647: aload #25
/*     */     //   649: invokevirtual a : ()I
/*     */     //   652: lload #5
/*     */     //   654: invokestatic a : (IJ)F
/*     */     //   657: fsub
/*     */     //   658: f2d
/*     */     //   659: dstore #26
/*     */     //   661: aload #11
/*     */     //   663: ifnull -> 729
/*     */     //   666: iload #16
/*     */     //   668: i2d
/*     */     //   669: dload #26
/*     */     //   671: dcmpl
/*     */     //   672: iflt -> 726
/*     */     //   675: goto -> 688
/*     */     //   678: ldc2_w -1421202401175944440
/*     */     //   681: lload_3
/*     */     //   682: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   687: athrow
/*     */     //   688: iconst_1
/*     */     //   689: istore #18
/*     */     //   691: aload #11
/*     */     //   693: lload_3
/*     */     //   694: lconst_0
/*     */     //   695: lcmp
/*     */     //   696: ifle -> 731
/*     */     //   699: ifnull -> 729
/*     */     //   702: aload #25
/*     */     //   704: invokevirtual a : ()I
/*     */     //   707: ifeq -> 726
/*     */     //   710: goto -> 723
/*     */     //   713: ldc2_w -1421202401175944440
/*     */     //   716: lload_3
/*     */     //   717: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   722: athrow
/*     */     //   723: iconst_1
/*     */     //   724: istore #21
/*     */     //   726: iinc #24, 1
/*     */     //   729: aload #11
/*     */     //   731: ifnonnull -> 505
/*     */     //   734: lload_3
/*     */     //   735: lconst_0
/*     */     //   736: lcmp
/*     */     //   737: ifle -> 743
/*     */     //   740: iinc #23, 1
/*     */     //   743: aload #11
/*     */     //   745: ifnonnull -> 489
/*     */     //   748: iinc #22, 1
/*     */     //   751: lload_3
/*     */     //   752: lconst_0
/*     */     //   753: lcmp
/*     */     //   754: ifle -> 762
/*     */     //   757: aload #11
/*     */     //   759: ifnonnull -> 478
/*     */     //   762: new me/konsolas/aac/dg
/*     */     //   765: dup
/*     */     //   766: iload #18
/*     */     //   768: iload #21
/*     */     //   770: dload #19
/*     */     //   772: invokespecial <init> : (ZZD)V
/*     */     //   775: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 29
/*     */     //   #153	-> 47
/*     */     //   #94	-> 56
/*     */     //   #36	-> 67
/*     */     //   #31	-> 78
/*     */     //   #152	-> 89
/*     */     //   #141	-> 100
/*     */     //   #143	-> 103
/*     */     //   #87	-> 106
/*     */     //   #89	-> 109
/*     */     //   #8	-> 142
/*     */     //   #45	-> 153
/*     */     //   #144	-> 169
/*     */     //   #16	-> 185
/*     */     //   #159	-> 199
/*     */     //   #157	-> 269
/*     */     //   #128	-> 302
/*     */     //   #162	-> 334
/*     */     //   #23	-> 362
/*     */     //   #88	-> 365
/*     */     //   #9	-> 379
/*     */     //   #39	-> 414
/*     */     //   #166	-> 422
/*     */     //   #86	-> 436
/*     */     //   #111	-> 461
/*     */     //   #116	-> 485
/*     */     //   #108	-> 496
/*     */     //   #49	-> 512
/*     */     //   #93	-> 526
/*     */     //   #106	-> 596
/*     */     //   #100	-> 629
/*     */     //   #118	-> 661
/*     */     //   #105	-> 688
/*     */     //   #14	-> 691
/*     */     //   #57	-> 726
/*     */     //   #156	-> 734
/*     */     //   #110	-> 748
/*     */     //   #113	-> 762
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   109	129	132	java/lang/IllegalArgumentException
/*     */     //   199	223	226	java/lang/IllegalArgumentException
/*     */     //   210	243	246	java/lang/IllegalArgumentException
/*     */     //   236	259	259	java/lang/IllegalArgumentException
/*     */     //   271	289	292	java/lang/IllegalArgumentException
/*     */     //   286	305	308	java/lang/IllegalArgumentException
/*     */     //   334	349	352	java/lang/IllegalArgumentException
/*     */     //   379	398	401	java/lang/IllegalArgumentException
/*     */     //   450	463	466	java/lang/IllegalArgumentException
/*     */     //   526	550	553	java/lang/IllegalArgumentException
/*     */     //   537	570	573	java/lang/IllegalArgumentException
/*     */     //   563	586	586	java/lang/IllegalArgumentException
/*     */     //   598	616	619	java/lang/IllegalArgumentException
/*     */     //   613	632	635	java/lang/IllegalArgumentException
/*     */     //   661	675	678	java/lang/IllegalArgumentException
/*     */     //   691	710	713	java/lang/IllegalArgumentException
/*     */   }
/*     */   public Material a(double paramDouble1, int paramInt1, double paramDouble2, byte paramByte, int paramInt2, double paramDouble3) {
/*     */     long l1 = (paramInt1 << 32L | paramByte << 56L >>> 32L | paramInt2 << 40L >>> 40L) ^ k, l2 = l1 ^ 0x7E59B0E45FE2L;
/*     */     return a(paramDouble1, l2, paramDouble2, paramDouble3).a();
/*     */   }
/*     */   public int a(long paramLong, lq paramlq, Predicate paramPredicate) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 44173430852051
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: ldc2_w 825040085431497731
/*     */     //   18: lload_1
/*     */     //   19: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual c : ()D
/*     */     //   28: invokestatic floor : (D)I
/*     */     //   31: istore #8
/*     */     //   33: astore #7
/*     */     //   35: aload_3
/*     */     //   36: invokevirtual e : ()D
/*     */     //   39: invokestatic floor : (D)I
/*     */     //   42: istore #9
/*     */     //   44: aload_3
/*     */     //   45: invokevirtual d : ()D
/*     */     //   48: invokestatic floor : (D)I
/*     */     //   51: istore #10
/*     */     //   53: aload_3
/*     */     //   54: invokevirtual b : ()D
/*     */     //   57: invokestatic ceil : (D)I
/*     */     //   60: istore #11
/*     */     //   62: aload_3
/*     */     //   63: invokevirtual a : ()D
/*     */     //   66: invokestatic ceil : (D)I
/*     */     //   69: istore #12
/*     */     //   71: aload_3
/*     */     //   72: invokevirtual f : ()D
/*     */     //   75: invokestatic ceil : (D)I
/*     */     //   78: istore #13
/*     */     //   80: iconst_0
/*     */     //   81: istore #14
/*     */     //   83: iload #8
/*     */     //   85: istore #15
/*     */     //   87: iload #15
/*     */     //   89: iload #11
/*     */     //   91: if_icmpge -> 195
/*     */     //   94: iload #9
/*     */     //   96: aload #7
/*     */     //   98: ifnull -> 203
/*     */     //   101: istore #16
/*     */     //   103: iload #16
/*     */     //   105: iload #12
/*     */     //   107: if_icmpge -> 181
/*     */     //   110: iload #10
/*     */     //   112: aload #7
/*     */     //   114: ifnull -> 89
/*     */     //   117: istore #17
/*     */     //   119: iload #17
/*     */     //   121: iload #13
/*     */     //   123: if_icmpge -> 167
/*     */     //   126: aload #4
/*     */     //   128: aload_0
/*     */     //   129: iload #15
/*     */     //   131: iload #16
/*     */     //   133: lload #5
/*     */     //   135: iload #17
/*     */     //   137: invokespecial a : (IIJI)Lme/konsolas/aac/mt;
/*     */     //   140: invokevirtual a : ()Lorg/bukkit/Material;
/*     */     //   143: invokeinterface test : (Ljava/lang/Object;)Z
/*     */     //   148: aload #7
/*     */     //   150: ifnull -> 105
/*     */     //   153: ifeq -> 159
/*     */     //   156: iinc #14, 1
/*     */     //   159: iinc #17, 1
/*     */     //   162: aload #7
/*     */     //   164: ifnonnull -> 119
/*     */     //   167: iinc #16, 1
/*     */     //   170: aload #7
/*     */     //   172: lload_1
/*     */     //   173: lconst_0
/*     */     //   174: lcmp
/*     */     //   175: iflt -> 192
/*     */     //   178: ifnonnull -> 103
/*     */     //   181: iinc #15, 1
/*     */     //   184: lload_1
/*     */     //   185: lconst_0
/*     */     //   186: lcmp
/*     */     //   187: iflt -> 110
/*     */     //   190: aload #7
/*     */     //   192: ifnonnull -> 87
/*     */     //   195: lload_1
/*     */     //   196: lconst_0
/*     */     //   197: lcmp
/*     */     //   198: iflt -> 94
/*     */     //   201: iload #14
/*     */     //   203: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #61	-> 24
/*     */     //   #174	-> 35
/*     */     //   #122	-> 44
/*     */     //   #60	-> 53
/*     */     //   #154	-> 62
/*     */     //   #84	-> 71
/*     */     //   #145	-> 80
/*     */     //   #160	-> 83
/*     */     //   #151	-> 94
/*     */     //   #64	-> 110
/*     */     //   #171	-> 126
/*     */     //   #129	-> 159
/*     */     //   #67	-> 167
/*     */     //   #99	-> 181
/*     */     //   #133	-> 195
/*     */   }
/*     */   public h8(kP paramkP) {
/*     */     this.c = paramkP;
/*     */     this.f = new lq(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 167 */     this.g = this.i = this.a = 0;
/*     */     this.h = this.d = this.j = 0;
/*     */     this.e = new ej(0, 0, 0);
/*     */   }
/*     */   
/*     */   public boolean c(lq paramlq, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 86629650663298
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -3255726247067652703
/*     */     //   18: lload_2
/*     */     //   19: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   24: astore #6
/*     */     //   26: aload_0
/*     */     //   27: aload_1
/*     */     //   28: dconst_0
/*     */     //   29: dconst_0
/*     */     //   30: lload #4
/*     */     //   32: dconst_0
/*     */     //   33: invokevirtual a : (Lme/konsolas/aac/lq;DDJD)Z
/*     */     //   36: aload #6
/*     */     //   38: ifnull -> 58
/*     */     //   41: ifne -> 61
/*     */     //   44: goto -> 57
/*     */     //   47: ldc2_w -3250475536534602323
/*     */     //   50: lload_2
/*     */     //   51: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   56: athrow
/*     */     //   57: iconst_1
/*     */     //   58: goto -> 62
/*     */     //   61: iconst_0
/*     */     //   62: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 26
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	44	47	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public boolean a(long paramLong, double paramDouble1, double paramDouble2, short paramShort, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: bipush #16
/*     */     //   3: lshl
/*     */     //   4: iload #7
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #48
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: getstatic me/konsolas/aac/h8.k : J
/*     */     //   17: lxor
/*     */     //   18: lstore #10
/*     */     //   20: lload #10
/*     */     //   22: dup2
/*     */     //   23: ldc2_w 41406370508830
/*     */     //   26: lxor
/*     */     //   27: lstore #12
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 66820082668924
/*     */     //   33: lxor
/*     */     //   34: lstore #14
/*     */     //   36: pop2
/*     */     //   37: ldc2_w -720169600530527887
/*     */     //   40: lload #10
/*     */     //   42: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   47: aload_0
/*     */     //   48: dload_3
/*     */     //   49: lload #14
/*     */     //   51: dload #5
/*     */     //   53: dload #8
/*     */     //   55: invokespecial a : (DJDD)Lme/konsolas/aac/mt;
/*     */     //   58: astore #17
/*     */     //   60: astore #16
/*     */     //   62: aload #17
/*     */     //   64: invokevirtual a : ()Lorg/bukkit/Material;
/*     */     //   67: astore #18
/*     */     //   69: getstatic me/konsolas/aac/h8.b : Ljava/util/Set;
/*     */     //   72: aload #18
/*     */     //   74: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   79: aload #16
/*     */     //   81: ifnull -> 191
/*     */     //   84: ifne -> 176
/*     */     //   87: goto -> 101
/*     */     //   90: ldc2_w -705980942802757251
/*     */     //   93: lload #10
/*     */     //   95: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   100: athrow
/*     */     //   101: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   104: lload #12
/*     */     //   106: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
/*     */     //   109: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   112: aload #16
/*     */     //   114: lload_1
/*     */     //   115: lconst_0
/*     */     //   116: lcmp
/*     */     //   117: ifle -> 206
/*     */     //   120: ifnull -> 204
/*     */     //   123: goto -> 137
/*     */     //   126: ldc2_w -705980942802757251
/*     */     //   129: lload #10
/*     */     //   131: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   136: athrow
/*     */     //   137: ifeq -> 192
/*     */     //   140: goto -> 154
/*     */     //   143: ldc2_w -705980942802757251
/*     */     //   146: lload #10
/*     */     //   148: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   153: athrow
/*     */     //   154: aload #18
/*     */     //   156: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
/*     */     //   159: if_acmpne -> 192
/*     */     //   162: goto -> 176
/*     */     //   165: ldc2_w -705980942802757251
/*     */     //   168: lload #10
/*     */     //   170: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   175: athrow
/*     */     //   176: iconst_1
/*     */     //   177: goto -> 191
/*     */     //   180: ldc2_w -705980942802757251
/*     */     //   183: lload #10
/*     */     //   185: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   190: athrow
/*     */     //   191: ireturn
/*     */     //   192: aload_0
/*     */     //   193: getfield c : Lme/konsolas/aac/kP;
/*     */     //   196: lload #12
/*     */     //   198: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   201: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   204: aload #16
/*     */     //   206: ifnull -> 411
/*     */     //   209: ifeq -> 410
/*     */     //   212: goto -> 226
/*     */     //   215: ldc2_w -705980942802757251
/*     */     //   218: lload #10
/*     */     //   220: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   225: athrow
/*     */     //   226: getstatic me/konsolas/aac/ei.TRAPDOORS : Ljava/util/Set;
/*     */     //   229: aload #18
/*     */     //   231: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   236: aload #16
/*     */     //   238: ifnull -> 411
/*     */     //   241: goto -> 255
/*     */     //   244: ldc2_w -705980942802757251
/*     */     //   247: lload #10
/*     */     //   249: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   254: athrow
/*     */     //   255: ifeq -> 410
/*     */     //   258: goto -> 272
/*     */     //   261: ldc2_w -705980942802757251
/*     */     //   264: lload #10
/*     */     //   266: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   271: athrow
/*     */     //   272: aload #17
/*     */     //   274: invokevirtual a : ()Z
/*     */     //   277: aload #16
/*     */     //   279: ifnull -> 411
/*     */     //   282: goto -> 296
/*     */     //   285: ldc2_w -705980942802757251
/*     */     //   288: lload #10
/*     */     //   290: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   295: athrow
/*     */     //   296: ifeq -> 410
/*     */     //   299: goto -> 313
/*     */     //   302: ldc2_w -705980942802757251
/*     */     //   305: lload #10
/*     */     //   307: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   312: athrow
/*     */     //   313: aload_0
/*     */     //   314: dload_3
/*     */     //   315: dload #5
/*     */     //   317: dconst_1
/*     */     //   318: dsub
/*     */     //   319: lload #14
/*     */     //   321: dup2_x2
/*     */     //   322: pop2
/*     */     //   323: dload #8
/*     */     //   325: invokespecial a : (DJDD)Lme/konsolas/aac/mt;
/*     */     //   328: astore #19
/*     */     //   330: aload #19
/*     */     //   332: lload_1
/*     */     //   333: lconst_0
/*     */     //   334: lcmp
/*     */     //   335: iflt -> 382
/*     */     //   338: aload #16
/*     */     //   340: ifnull -> 382
/*     */     //   343: invokevirtual a : ()Lorg/bukkit/Material;
/*     */     //   346: getstatic org/bukkit/Material.LADDER : Lorg/bukkit/Material;
/*     */     //   349: if_acmpne -> 408
/*     */     //   352: goto -> 366
/*     */     //   355: ldc2_w -705980942802757251
/*     */     //   358: lload #10
/*     */     //   360: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   365: athrow
/*     */     //   366: aload #19
/*     */     //   368: goto -> 382
/*     */     //   371: ldc2_w -705980942802757251
/*     */     //   374: lload #10
/*     */     //   376: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   381: athrow
/*     */     //   382: invokevirtual a : ()Lorg/bukkit/block/BlockFace;
/*     */     //   385: aload #17
/*     */     //   387: invokevirtual a : ()Lorg/bukkit/block/BlockFace;
/*     */     //   390: if_acmpne -> 408
/*     */     //   393: iconst_1
/*     */     //   394: goto -> 409
/*     */     //   397: ldc2_w -705980942802757251
/*     */     //   400: lload #10
/*     */     //   402: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   407: athrow
/*     */     //   408: iconst_0
/*     */     //   409: ireturn
/*     */     //   410: iconst_0
/*     */     //   411: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 47
/*     */     //   #40	-> 62
/*     */     //   #50	-> 69
/*     */     //   #27	-> 176
/*     */     //   #7	-> 192
/*     */     //   #173	-> 313
/*     */     //   #4	-> 330
/*     */     //   #17	-> 410
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   69	87	90	java/lang/IllegalArgumentException
/*     */     //   84	123	126	java/lang/IllegalArgumentException
/*     */     //   101	140	143	java/lang/IllegalArgumentException
/*     */     //   137	162	165	java/lang/IllegalArgumentException
/*     */     //   154	177	180	java/lang/IllegalArgumentException
/*     */     //   204	212	215	java/lang/IllegalArgumentException
/*     */     //   209	241	244	java/lang/IllegalArgumentException
/*     */     //   226	258	261	java/lang/IllegalArgumentException
/*     */     //   255	282	285	java/lang/IllegalArgumentException
/*     */     //   272	299	302	java/lang/IllegalArgumentException
/*     */     //   330	352	355	java/lang/IllegalArgumentException
/*     */     //   343	368	371	java/lang/IllegalArgumentException
/*     */     //   382	397	397	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public boolean a(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 7315538093333895926
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   15: astore #6
/*     */     //   17: iload_3
/*     */     //   18: aload_0
/*     */     //   19: getfield g : I
/*     */     //   22: aload #6
/*     */     //   24: ifnull -> 61
/*     */     //   27: if_icmplt -> 264
/*     */     //   30: goto -> 43
/*     */     //   33: ldc2_w 7328667898826541818
/*     */     //   36: lload_1
/*     */     //   37: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   42: athrow
/*     */     //   43: iload_3
/*     */     //   44: aload_0
/*     */     //   45: getfield h : I
/*     */     //   48: goto -> 61
/*     */     //   51: ldc2_w 7328667898826541818
/*     */     //   54: lload_1
/*     */     //   55: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   60: athrow
/*     */     //   61: aload #6
/*     */     //   63: lload_1
/*     */     //   64: lconst_0
/*     */     //   65: lcmp
/*     */     //   66: ifle -> 109
/*     */     //   69: ifnull -> 107
/*     */     //   72: if_icmpge -> 264
/*     */     //   75: goto -> 88
/*     */     //   78: ldc2_w 7328667898826541818
/*     */     //   81: lload_1
/*     */     //   82: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   87: athrow
/*     */     //   88: iload #4
/*     */     //   90: aload_0
/*     */     //   91: getfield i : I
/*     */     //   94: goto -> 107
/*     */     //   97: ldc2_w 7328667898826541818
/*     */     //   100: lload_1
/*     */     //   101: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   106: athrow
/*     */     //   107: aload #6
/*     */     //   109: lload_1
/*     */     //   110: lconst_0
/*     */     //   111: lcmp
/*     */     //   112: iflt -> 155
/*     */     //   115: ifnull -> 153
/*     */     //   118: if_icmplt -> 264
/*     */     //   121: goto -> 134
/*     */     //   124: ldc2_w 7328667898826541818
/*     */     //   127: lload_1
/*     */     //   128: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   133: athrow
/*     */     //   134: iload #4
/*     */     //   136: aload_0
/*     */     //   137: getfield d : I
/*     */     //   140: goto -> 153
/*     */     //   143: ldc2_w 7328667898826541818
/*     */     //   146: lload_1
/*     */     //   147: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   152: athrow
/*     */     //   153: aload #6
/*     */     //   155: lload_1
/*     */     //   156: lconst_0
/*     */     //   157: lcmp
/*     */     //   158: iflt -> 201
/*     */     //   161: ifnull -> 199
/*     */     //   164: if_icmpge -> 264
/*     */     //   167: goto -> 180
/*     */     //   170: ldc2_w 7328667898826541818
/*     */     //   173: lload_1
/*     */     //   174: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   179: athrow
/*     */     //   180: iload #5
/*     */     //   182: aload_0
/*     */     //   183: getfield a : I
/*     */     //   186: goto -> 199
/*     */     //   189: ldc2_w 7328667898826541818
/*     */     //   192: lload_1
/*     */     //   193: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   198: athrow
/*     */     //   199: aload #6
/*     */     //   201: ifnull -> 257
/*     */     //   204: if_icmplt -> 264
/*     */     //   207: goto -> 220
/*     */     //   210: ldc2_w 7328667898826541818
/*     */     //   213: lload_1
/*     */     //   214: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   219: athrow
/*     */     //   220: iload #5
/*     */     //   222: aload #6
/*     */     //   224: ifnull -> 261
/*     */     //   227: goto -> 240
/*     */     //   230: ldc2_w 7328667898826541818
/*     */     //   233: lload_1
/*     */     //   234: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   239: athrow
/*     */     //   240: aload_0
/*     */     //   241: getfield j : I
/*     */     //   244: goto -> 257
/*     */     //   247: ldc2_w 7328667898826541818
/*     */     //   250: lload_1
/*     */     //   251: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   256: athrow
/*     */     //   257: if_icmpge -> 264
/*     */     //   260: iconst_1
/*     */     //   261: goto -> 265
/*     */     //   264: iconst_0
/*     */     //   265: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #79	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	30	33	java/lang/IllegalArgumentException
/*     */     //   27	48	51	java/lang/IllegalArgumentException
/*     */     //   61	75	78	java/lang/IllegalArgumentException
/*     */     //   72	94	97	java/lang/IllegalArgumentException
/*     */     //   107	121	124	java/lang/IllegalArgumentException
/*     */     //   118	140	143	java/lang/IllegalArgumentException
/*     */     //   153	167	170	java/lang/IllegalArgumentException
/*     */     //   164	186	189	java/lang/IllegalArgumentException
/*     */     //   199	207	210	java/lang/IllegalArgumentException
/*     */     //   204	227	230	java/lang/IllegalArgumentException
/*     */     //   220	244	247	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public Collection a(lq paramlq, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 1296778331503
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 53163154595580
/*     */     //   18: lxor
/*     */     //   19: dup2
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: l2i
/*     */     //   24: istore #6
/*     */     //   26: dup2
/*     */     //   27: bipush #16
/*     */     //   29: lshl
/*     */     //   30: bipush #48
/*     */     //   32: lushr
/*     */     //   33: l2i
/*     */     //   34: istore #7
/*     */     //   36: dup2
/*     */     //   37: bipush #32
/*     */     //   39: lshl
/*     */     //   40: bipush #32
/*     */     //   42: lushr
/*     */     //   43: l2i
/*     */     //   44: istore #8
/*     */     //   46: pop2
/*     */     //   47: dup2
/*     */     //   48: ldc2_w 132297315229731
/*     */     //   51: lxor
/*     */     //   52: dup2
/*     */     //   53: bipush #8
/*     */     //   55: lushr
/*     */     //   56: lstore #9
/*     */     //   58: dup2
/*     */     //   59: bipush #56
/*     */     //   61: lshl
/*     */     //   62: bipush #56
/*     */     //   64: lushr
/*     */     //   65: l2i
/*     */     //   66: istore #11
/*     */     //   68: pop2
/*     */     //   69: pop2
/*     */     //   70: new java/util/ArrayList
/*     */     //   73: dup
/*     */     //   74: invokespecial <init> : ()V
/*     */     //   77: astore #13
/*     */     //   79: aload_0
/*     */     //   80: getfield g : I
/*     */     //   83: aload_1
/*     */     //   84: invokevirtual c : ()D
/*     */     //   87: invokestatic floor : (D)I
/*     */     //   90: invokestatic max : (II)I
/*     */     //   93: istore #14
/*     */     //   95: aload_0
/*     */     //   96: getfield i : I
/*     */     //   99: aload_1
/*     */     //   100: invokevirtual e : ()D
/*     */     //   103: dconst_1
/*     */     //   104: dsub
/*     */     //   105: invokestatic floor : (D)I
/*     */     //   108: invokestatic max : (II)I
/*     */     //   111: istore #15
/*     */     //   113: ldc2_w -8975580508191343616
/*     */     //   116: lload_2
/*     */     //   117: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   122: aload_0
/*     */     //   123: getfield a : I
/*     */     //   126: aload_1
/*     */     //   127: invokevirtual d : ()D
/*     */     //   130: invokestatic floor : (D)I
/*     */     //   133: invokestatic max : (II)I
/*     */     //   136: istore #16
/*     */     //   138: aload_0
/*     */     //   139: getfield h : I
/*     */     //   142: aload_1
/*     */     //   143: invokevirtual b : ()D
/*     */     //   146: invokestatic ceil : (D)I
/*     */     //   149: invokestatic min : (II)I
/*     */     //   152: istore #17
/*     */     //   154: aload_0
/*     */     //   155: getfield d : I
/*     */     //   158: aload_1
/*     */     //   159: invokevirtual a : ()D
/*     */     //   162: invokestatic ceil : (D)I
/*     */     //   165: invokestatic min : (II)I
/*     */     //   168: istore #18
/*     */     //   170: astore #12
/*     */     //   172: aload_0
/*     */     //   173: getfield j : I
/*     */     //   176: aload_1
/*     */     //   177: invokevirtual f : ()D
/*     */     //   180: invokestatic ceil : (D)I
/*     */     //   183: invokestatic min : (II)I
/*     */     //   186: istore #19
/*     */     //   188: iload #14
/*     */     //   190: istore #20
/*     */     //   192: iload #20
/*     */     //   194: iload #17
/*     */     //   196: if_icmpge -> 503
/*     */     //   199: iload #15
/*     */     //   201: istore #21
/*     */     //   203: iload #21
/*     */     //   205: iload #18
/*     */     //   207: if_icmpge -> 489
/*     */     //   210: iload #16
/*     */     //   212: aload #12
/*     */     //   214: ifnull -> 194
/*     */     //   217: istore #22
/*     */     //   219: iload #22
/*     */     //   221: iload #19
/*     */     //   223: if_icmpge -> 475
/*     */     //   226: aload_0
/*     */     //   227: getfield e : Lme/konsolas/aac/ej;
/*     */     //   230: iload #20
/*     */     //   232: aload_0
/*     */     //   233: getfield g : I
/*     */     //   236: isub
/*     */     //   237: iload #21
/*     */     //   239: aload_0
/*     */     //   240: getfield i : I
/*     */     //   243: isub
/*     */     //   244: iload #22
/*     */     //   246: aload_0
/*     */     //   247: getfield a : I
/*     */     //   250: isub
/*     */     //   251: invokevirtual a : (III)Ljava/lang/Object;
/*     */     //   254: checkcast me/konsolas/aac/mt
/*     */     //   257: astore #23
/*     */     //   259: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   262: lload #4
/*     */     //   264: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
/*     */     //   267: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   270: aload #12
/*     */     //   272: ifnull -> 205
/*     */     //   275: lload_2
/*     */     //   276: lconst_0
/*     */     //   277: lcmp
/*     */     //   278: iflt -> 212
/*     */     //   281: ifeq -> 339
/*     */     //   284: aload #23
/*     */     //   286: aload #12
/*     */     //   288: ifnull -> 341
/*     */     //   291: goto -> 304
/*     */     //   294: ldc2_w -8988341977824515060
/*     */     //   297: lload_2
/*     */     //   298: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   303: athrow
/*     */     //   304: invokevirtual a : ()Lorg/bukkit/Material;
/*     */     //   307: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
/*     */     //   310: if_acmpne -> 339
/*     */     //   313: goto -> 326
/*     */     //   316: ldc2_w -8988341977824515060
/*     */     //   319: lload_2
/*     */     //   320: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   325: athrow
/*     */     //   326: goto -> 461
/*     */     //   329: ldc2_w -8988341977824515060
/*     */     //   332: lload_2
/*     */     //   333: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   338: athrow
/*     */     //   339: aload #23
/*     */     //   341: invokevirtual a : ()Lme/konsolas/aac/hO;
/*     */     //   344: iload #20
/*     */     //   346: iload #6
/*     */     //   348: i2c
/*     */     //   349: iload #21
/*     */     //   351: iload #22
/*     */     //   353: iload #7
/*     */     //   355: i2s
/*     */     //   356: iload #8
/*     */     //   358: invokevirtual a : (ICIISI)Ljava/util/Collection;
/*     */     //   361: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   366: astore #24
/*     */     //   368: aload #24
/*     */     //   370: invokeinterface hasNext : ()Z
/*     */     //   375: ifeq -> 461
/*     */     //   378: aload #24
/*     */     //   380: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   385: checkcast me/konsolas/aac/lq
/*     */     //   388: astore #25
/*     */     //   390: aload #25
/*     */     //   392: lload #9
/*     */     //   394: iload #11
/*     */     //   396: i2b
/*     */     //   397: aload_1
/*     */     //   398: invokevirtual b : (JBLme/konsolas/aac/lq;)Z
/*     */     //   401: aload #12
/*     */     //   403: ifnull -> 221
/*     */     //   406: aload #12
/*     */     //   408: lload_2
/*     */     //   409: lconst_0
/*     */     //   410: lcmp
/*     */     //   411: ifle -> 272
/*     */     //   414: ifnull -> 455
/*     */     //   417: ifeq -> 456
/*     */     //   420: goto -> 433
/*     */     //   423: ldc2_w -8988341977824515060
/*     */     //   426: lload_2
/*     */     //   427: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   432: athrow
/*     */     //   433: aload #13
/*     */     //   435: aload #25
/*     */     //   437: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   442: goto -> 455
/*     */     //   445: ldc2_w -8988341977824515060
/*     */     //   448: lload_2
/*     */     //   449: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   454: athrow
/*     */     //   455: pop
/*     */     //   456: aload #12
/*     */     //   458: ifnonnull -> 368
/*     */     //   461: iinc #22, 1
/*     */     //   464: aload #12
/*     */     //   466: lload_2
/*     */     //   467: lconst_0
/*     */     //   468: lcmp
/*     */     //   469: ifle -> 486
/*     */     //   472: ifnonnull -> 219
/*     */     //   475: iinc #21, 1
/*     */     //   478: aload #12
/*     */     //   480: lload_2
/*     */     //   481: lconst_0
/*     */     //   482: lcmp
/*     */     //   483: ifle -> 254
/*     */     //   486: ifnonnull -> 203
/*     */     //   489: iinc #20, 1
/*     */     //   492: lload_2
/*     */     //   493: lconst_0
/*     */     //   494: lcmp
/*     */     //   495: iflt -> 210
/*     */     //   498: aload #12
/*     */     //   500: ifnonnull -> 192
/*     */     //   503: lload_2
/*     */     //   504: lconst_0
/*     */     //   505: lcmp
/*     */     //   506: iflt -> 199
/*     */     //   509: aload #13
/*     */     //   511: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 70
/*     */     //   #5	-> 79
/*     */     //   #73	-> 95
/*     */     //   #127	-> 122
/*     */     //   #46	-> 138
/*     */     //   #48	-> 154
/*     */     //   #3	-> 172
/*     */     //   #66	-> 188
/*     */     //   #81	-> 199
/*     */     //   #29	-> 210
/*     */     //   #43	-> 226
/*     */     //   #56	-> 259
/*     */     //   #74	-> 339
/*     */     //   #28	-> 390
/*     */     //   #165	-> 433
/*     */     //   #170	-> 456
/*     */     //   #136	-> 461
/*     */     //   #20	-> 475
/*     */     //   #65	-> 489
/*     */     //   #150	-> 503
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   275	291	294	java/lang/IllegalArgumentException
/*     */     //   284	313	316	java/lang/IllegalArgumentException
/*     */     //   304	329	329	java/lang/IllegalArgumentException
/*     */     //   406	420	423	java/lang/IllegalArgumentException
/*     */     //   417	442	445	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public boolean a(char paramChar, lq paramlq, short paramShort, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #32
/*     */     //   19: lshl
/*     */     //   20: bipush #32
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/h8.k : J
/*     */     //   27: lxor
/*     */     //   28: lstore #5
/*     */     //   30: lload #5
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 110924838213037
/*     */     //   36: lxor
/*     */     //   37: lstore #7
/*     */     //   39: dup2
/*     */     //   40: ldc2_w 56339031361230
/*     */     //   43: lxor
/*     */     //   44: dup2
/*     */     //   45: bipush #8
/*     */     //   47: lushr
/*     */     //   48: lstore #9
/*     */     //   50: dup2
/*     */     //   51: bipush #56
/*     */     //   53: lshl
/*     */     //   54: bipush #56
/*     */     //   56: lushr
/*     */     //   57: l2i
/*     */     //   58: istore #11
/*     */     //   60: pop2
/*     */     //   61: pop2
/*     */     //   62: ldc2_w -6513015973789000979
/*     */     //   65: lload #5
/*     */     //   67: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   72: aload_2
/*     */     //   73: ldc2_w 0.001
/*     */     //   76: dconst_0
/*     */     //   77: ldc2_w 0.001
/*     */     //   80: invokevirtual c : (DDD)Lme/konsolas/aac/lq;
/*     */     //   83: astore #13
/*     */     //   85: astore #12
/*     */     //   87: aload_0
/*     */     //   88: aload #13
/*     */     //   90: lload #7
/*     */     //   92: invokevirtual a : (Lme/konsolas/aac/lq;J)Ljava/util/Collection;
/*     */     //   95: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   100: astore #14
/*     */     //   102: aload #14
/*     */     //   104: invokeinterface hasNext : ()Z
/*     */     //   109: ifeq -> 376
/*     */     //   112: aload #14
/*     */     //   114: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   119: checkcast me/konsolas/aac/lq
/*     */     //   122: astore #15
/*     */     //   124: aload #15
/*     */     //   126: invokevirtual b : ()D
/*     */     //   129: aload_2
/*     */     //   130: invokevirtual c : ()D
/*     */     //   133: dcmpl
/*     */     //   134: aload #12
/*     */     //   136: iload_1
/*     */     //   137: iflt -> 145
/*     */     //   140: ifnull -> 377
/*     */     //   143: aload #12
/*     */     //   145: ifnull -> 370
/*     */     //   148: goto -> 162
/*     */     //   151: ldc2_w -6507782858671617311
/*     */     //   154: lload #5
/*     */     //   156: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   161: athrow
/*     */     //   162: ifeq -> 369
/*     */     //   165: goto -> 179
/*     */     //   168: ldc2_w -6507782858671617311
/*     */     //   171: lload #5
/*     */     //   173: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   178: athrow
/*     */     //   179: aload #15
/*     */     //   181: invokevirtual c : ()D
/*     */     //   184: aload_2
/*     */     //   185: invokevirtual b : ()D
/*     */     //   188: dcmpl
/*     */     //   189: aload #12
/*     */     //   191: ifnull -> 370
/*     */     //   194: goto -> 208
/*     */     //   197: ldc2_w -6507782858671617311
/*     */     //   200: lload #5
/*     */     //   202: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   207: athrow
/*     */     //   208: ifeq -> 369
/*     */     //   211: goto -> 225
/*     */     //   214: ldc2_w -6507782858671617311
/*     */     //   217: lload #5
/*     */     //   219: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   224: athrow
/*     */     //   225: aload #15
/*     */     //   227: invokevirtual f : ()D
/*     */     //   230: aload_2
/*     */     //   231: invokevirtual d : ()D
/*     */     //   234: dcmpl
/*     */     //   235: aload #12
/*     */     //   237: ifnull -> 370
/*     */     //   240: goto -> 254
/*     */     //   243: ldc2_w -6507782858671617311
/*     */     //   246: lload #5
/*     */     //   248: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   253: athrow
/*     */     //   254: ifeq -> 369
/*     */     //   257: goto -> 271
/*     */     //   260: ldc2_w -6507782858671617311
/*     */     //   263: lload #5
/*     */     //   265: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   270: athrow
/*     */     //   271: aload #15
/*     */     //   273: invokevirtual d : ()D
/*     */     //   276: aload_2
/*     */     //   277: invokevirtual f : ()D
/*     */     //   280: dcmpl
/*     */     //   281: aload #12
/*     */     //   283: iload_3
/*     */     //   284: iflt -> 349
/*     */     //   287: ifnull -> 347
/*     */     //   290: goto -> 304
/*     */     //   293: ldc2_w -6507782858671617311
/*     */     //   296: lload #5
/*     */     //   298: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   303: athrow
/*     */     //   304: ifne -> 371
/*     */     //   307: goto -> 321
/*     */     //   310: ldc2_w -6507782858671617311
/*     */     //   313: lload #5
/*     */     //   315: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   320: athrow
/*     */     //   321: aload #15
/*     */     //   323: lload #9
/*     */     //   325: iload #11
/*     */     //   327: i2b
/*     */     //   328: aload #13
/*     */     //   330: invokevirtual b : (JBLme/konsolas/aac/lq;)Z
/*     */     //   333: goto -> 347
/*     */     //   336: ldc2_w -6507782858671617311
/*     */     //   339: lload #5
/*     */     //   341: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   346: athrow
/*     */     //   347: aload #12
/*     */     //   349: ifnull -> 370
/*     */     //   352: ifeq -> 371
/*     */     //   355: goto -> 369
/*     */     //   358: ldc2_w -6507782858671617311
/*     */     //   361: lload #5
/*     */     //   363: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   368: athrow
/*     */     //   369: iconst_1
/*     */     //   370: ireturn
/*     */     //   371: aload #12
/*     */     //   373: ifnonnull -> 102
/*     */     //   376: iconst_0
/*     */     //   377: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #91	-> 72
/*     */     //   #102	-> 87
/*     */     //   #51	-> 124
/*     */     //   #124	-> 227
/*     */     //   #13	-> 330
/*     */     //   #44	-> 371
/*     */     //   #38	-> 376
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   124	148	151	java/lang/IllegalArgumentException
/*     */     //   143	165	168	java/lang/IllegalArgumentException
/*     */     //   162	194	197	java/lang/IllegalArgumentException
/*     */     //   179	211	214	java/lang/IllegalArgumentException
/*     */     //   208	240	243	java/lang/IllegalArgumentException
/*     */     //   225	257	260	java/lang/IllegalArgumentException
/*     */     //   254	290	293	java/lang/IllegalArgumentException
/*     */     //   271	307	310	java/lang/IllegalArgumentException
/*     */     //   304	333	336	java/lang/IllegalArgumentException
/*     */     //   347	355	358	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public k5 a(double paramDouble1, char paramChar1, double paramDouble2, int paramInt, double paramDouble3, char paramChar2) {
/*     */     long l1 = (paramChar1 << 48L | paramInt << 32L >>> 16L | paramChar2 << 48L >>> 48L) ^ k, l2 = l1 ^ 0x32A43AC80876L;
/*     */     return a(paramDouble1, l2, paramDouble2, paramDouble3).a();
/*     */   }
/*     */   
/*     */   public kP a() {
/*     */     return this.c;
/*     */   }
/*     */   
/*     */   private static float a(int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -1521360311688899181
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   15: astore_3
/*     */     //   16: iload_0
/*     */     //   17: bipush #8
/*     */     //   19: aload_3
/*     */     //   20: ifnull -> 43
/*     */     //   23: if_icmplt -> 41
/*     */     //   26: goto -> 39
/*     */     //   29: ldc2_w -1526261392557226593
/*     */     //   32: lload_1
/*     */     //   33: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   38: athrow
/*     */     //   39: iconst_0
/*     */     //   40: istore_0
/*     */     //   41: iload_0
/*     */     //   42: iconst_1
/*     */     //   43: iadd
/*     */     //   44: i2f
/*     */     //   45: ldc_w 9.0
/*     */     //   48: fdiv
/*     */     //   49: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 16
/*     */     //   #83	-> 41
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	26	29	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public float a(double paramDouble1, long paramLong, double paramDouble2, double paramDouble3) {
/*     */     paramLong = k ^ paramLong;
/*     */     long l = paramLong ^ 0x2FED80ABE63BL;
/*     */     return a(paramDouble1, l, paramDouble2 - 1.0D, paramDouble3).a();
/*     */   }
/*     */   
/*     */   public boolean b(lq paramlq, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 103114678884888
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 11096075913595
/*     */     //   18: lxor
/*     */     //   19: dup2
/*     */     //   20: bipush #8
/*     */     //   22: lushr
/*     */     //   23: lstore #6
/*     */     //   25: dup2
/*     */     //   26: bipush #56
/*     */     //   28: lshl
/*     */     //   29: bipush #56
/*     */     //   31: lushr
/*     */     //   32: l2i
/*     */     //   33: istore #8
/*     */     //   35: pop2
/*     */     //   36: pop2
/*     */     //   37: aload_1
/*     */     //   38: invokevirtual e : ()D
/*     */     //   41: dstore #10
/*     */     //   43: ldc2_w -1573964844082211496
/*     */     //   46: lload_2
/*     */     //   47: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   52: aload_1
/*     */     //   53: dconst_0
/*     */     //   54: ldc2_w -0.001
/*     */     //   57: dconst_0
/*     */     //   58: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   61: astore #12
/*     */     //   63: aload_0
/*     */     //   64: aload #12
/*     */     //   66: lload #4
/*     */     //   68: invokevirtual a : (Lme/konsolas/aac/lq;J)Ljava/util/Collection;
/*     */     //   71: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   76: astore #13
/*     */     //   78: astore #9
/*     */     //   80: aload #13
/*     */     //   82: invokeinterface hasNext : ()Z
/*     */     //   87: ifeq -> 214
/*     */     //   90: aload #13
/*     */     //   92: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   97: checkcast me/konsolas/aac/lq
/*     */     //   100: astore #14
/*     */     //   102: aload #14
/*     */     //   104: invokevirtual a : ()D
/*     */     //   107: dload #10
/*     */     //   109: dcmpl
/*     */     //   110: aload #9
/*     */     //   112: lload_2
/*     */     //   113: lconst_0
/*     */     //   114: lcmp
/*     */     //   115: iflt -> 123
/*     */     //   118: ifnull -> 215
/*     */     //   121: aload #9
/*     */     //   123: lload_2
/*     */     //   124: lconst_0
/*     */     //   125: lcmp
/*     */     //   126: ifle -> 188
/*     */     //   129: ifnull -> 186
/*     */     //   132: goto -> 145
/*     */     //   135: ldc2_w -1577793882851457708
/*     */     //   138: lload_2
/*     */     //   139: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   144: athrow
/*     */     //   145: ifne -> 209
/*     */     //   148: goto -> 161
/*     */     //   151: ldc2_w -1577793882851457708
/*     */     //   154: lload_2
/*     */     //   155: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   160: athrow
/*     */     //   161: aload #14
/*     */     //   163: lload #6
/*     */     //   165: iload #8
/*     */     //   167: i2b
/*     */     //   168: aload #12
/*     */     //   170: invokevirtual b : (JBLme/konsolas/aac/lq;)Z
/*     */     //   173: goto -> 186
/*     */     //   176: ldc2_w -1577793882851457708
/*     */     //   179: lload_2
/*     */     //   180: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   185: athrow
/*     */     //   186: aload #9
/*     */     //   188: ifnull -> 208
/*     */     //   191: ifeq -> 209
/*     */     //   194: goto -> 207
/*     */     //   197: ldc2_w -1577793882851457708
/*     */     //   200: lload_2
/*     */     //   201: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   206: athrow
/*     */     //   207: iconst_1
/*     */     //   208: ireturn
/*     */     //   209: aload #9
/*     */     //   211: ifnonnull -> 80
/*     */     //   214: iconst_0
/*     */     //   215: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 37
/*     */     //   #55	-> 52
/*     */     //   #75	-> 63
/*     */     //   #164	-> 102
/*     */     //   #6	-> 209
/*     */     //   #137	-> 214
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   102	132	135	java/lang/IllegalArgumentException
/*     */     //   121	148	151	java/lang/IllegalArgumentException
/*     */     //   145	173	176	java/lang/IllegalArgumentException
/*     */     //   186	194	197	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private mt a(int paramInt1, int paramInt2, long paramLong, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: ldc2_w -5629457513022714224
/*     */     //   9: lload_3
/*     */     //   10: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   15: astore #6
/*     */     //   17: iload_1
/*     */     //   18: aload_0
/*     */     //   19: getfield g : I
/*     */     //   22: aload #6
/*     */     //   24: ifnull -> 61
/*     */     //   27: if_icmplt -> 246
/*     */     //   30: goto -> 43
/*     */     //   33: ldc2_w -5633284374779879780
/*     */     //   36: lload_3
/*     */     //   37: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   42: athrow
/*     */     //   43: iload_1
/*     */     //   44: aload_0
/*     */     //   45: getfield h : I
/*     */     //   48: goto -> 61
/*     */     //   51: ldc2_w -5633284374779879780
/*     */     //   54: lload_3
/*     */     //   55: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   60: athrow
/*     */     //   61: aload #6
/*     */     //   63: lload_3
/*     */     //   64: lconst_0
/*     */     //   65: lcmp
/*     */     //   66: iflt -> 108
/*     */     //   69: ifnull -> 106
/*     */     //   72: if_icmpge -> 246
/*     */     //   75: goto -> 88
/*     */     //   78: ldc2_w -5633284374779879780
/*     */     //   81: lload_3
/*     */     //   82: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   87: athrow
/*     */     //   88: iload_2
/*     */     //   89: aload_0
/*     */     //   90: getfield i : I
/*     */     //   93: goto -> 106
/*     */     //   96: ldc2_w -5633284374779879780
/*     */     //   99: lload_3
/*     */     //   100: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   105: athrow
/*     */     //   106: aload #6
/*     */     //   108: lload_3
/*     */     //   109: lconst_0
/*     */     //   110: lcmp
/*     */     //   111: ifle -> 153
/*     */     //   114: ifnull -> 151
/*     */     //   117: if_icmplt -> 246
/*     */     //   120: goto -> 133
/*     */     //   123: ldc2_w -5633284374779879780
/*     */     //   126: lload_3
/*     */     //   127: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   132: athrow
/*     */     //   133: iload_2
/*     */     //   134: aload_0
/*     */     //   135: getfield d : I
/*     */     //   138: goto -> 151
/*     */     //   141: ldc2_w -5633284374779879780
/*     */     //   144: lload_3
/*     */     //   145: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   150: athrow
/*     */     //   151: aload #6
/*     */     //   153: lload_3
/*     */     //   154: lconst_0
/*     */     //   155: lcmp
/*     */     //   156: ifle -> 205
/*     */     //   159: ifnull -> 197
/*     */     //   162: if_icmpge -> 246
/*     */     //   165: goto -> 178
/*     */     //   168: ldc2_w -5633284374779879780
/*     */     //   171: lload_3
/*     */     //   172: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   177: athrow
/*     */     //   178: iload #5
/*     */     //   180: aload_0
/*     */     //   181: getfield a : I
/*     */     //   184: goto -> 197
/*     */     //   187: ldc2_w -5633284374779879780
/*     */     //   190: lload_3
/*     */     //   191: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   196: athrow
/*     */     //   197: lload_3
/*     */     //   198: lconst_0
/*     */     //   199: lcmp
/*     */     //   200: ifle -> 243
/*     */     //   203: aload #6
/*     */     //   205: ifnull -> 243
/*     */     //   208: if_icmplt -> 246
/*     */     //   211: goto -> 224
/*     */     //   214: ldc2_w -5633284374779879780
/*     */     //   217: lload_3
/*     */     //   218: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   223: athrow
/*     */     //   224: iload #5
/*     */     //   226: aload_0
/*     */     //   227: getfield j : I
/*     */     //   230: goto -> 243
/*     */     //   233: ldc2_w -5633284374779879780
/*     */     //   236: lload_3
/*     */     //   237: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   242: athrow
/*     */     //   243: if_icmplt -> 260
/*     */     //   246: getstatic me/konsolas/aac/ks.b : Lme/konsolas/aac/mt;
/*     */     //   249: areturn
/*     */     //   250: ldc2_w -5633284374779879780
/*     */     //   253: lload_3
/*     */     //   254: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   259: athrow
/*     */     //   260: aload_0
/*     */     //   261: getfield e : Lme/konsolas/aac/ej;
/*     */     //   264: iload_1
/*     */     //   265: aload_0
/*     */     //   266: getfield g : I
/*     */     //   269: isub
/*     */     //   270: iload_2
/*     */     //   271: aload_0
/*     */     //   272: getfield i : I
/*     */     //   275: isub
/*     */     //   276: iload #5
/*     */     //   278: aload_0
/*     */     //   279: getfield a : I
/*     */     //   282: isub
/*     */     //   283: invokevirtual a : (III)Ljava/lang/Object;
/*     */     //   286: checkcast me/konsolas/aac/mt
/*     */     //   289: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 17
/*     */     //   #148	-> 246
/*     */     //   #2	-> 260
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	30	33	java/lang/IllegalArgumentException
/*     */     //   27	48	51	java/lang/IllegalArgumentException
/*     */     //   61	75	78	java/lang/IllegalArgumentException
/*     */     //   72	93	96	java/lang/IllegalArgumentException
/*     */     //   106	120	123	java/lang/IllegalArgumentException
/*     */     //   117	138	141	java/lang/IllegalArgumentException
/*     */     //   151	165	168	java/lang/IllegalArgumentException
/*     */     //   162	184	187	java/lang/IllegalArgumentException
/*     */     //   197	211	214	java/lang/IllegalArgumentException
/*     */     //   208	230	233	java/lang/IllegalArgumentException
/*     */     //   243	250	250	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public boolean a(char paramChar, lq paramlq, int paramInt, Predicate paramPredicate, short paramShort) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #5
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/h8.k : J
/*     */     //   27: lxor
/*     */     //   28: lstore #6
/*     */     //   30: lload #6
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 92644553393150
/*     */     //   36: lxor
/*     */     //   37: lstore #8
/*     */     //   39: pop2
/*     */     //   40: aload_2
/*     */     //   41: invokevirtual c : ()D
/*     */     //   44: invokestatic floor : (D)I
/*     */     //   47: istore #11
/*     */     //   49: aload_2
/*     */     //   50: invokevirtual e : ()D
/*     */     //   53: invokestatic floor : (D)I
/*     */     //   56: istore #12
/*     */     //   58: aload_2
/*     */     //   59: invokevirtual d : ()D
/*     */     //   62: invokestatic floor : (D)I
/*     */     //   65: istore #13
/*     */     //   67: aload_2
/*     */     //   68: invokevirtual b : ()D
/*     */     //   71: invokestatic ceil : (D)I
/*     */     //   74: istore #14
/*     */     //   76: aload_2
/*     */     //   77: invokevirtual a : ()D
/*     */     //   80: invokestatic ceil : (D)I
/*     */     //   83: istore #15
/*     */     //   85: ldc2_w -9124752472293786066
/*     */     //   88: lload #6
/*     */     //   90: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   95: aload_2
/*     */     //   96: invokevirtual f : ()D
/*     */     //   99: invokestatic ceil : (D)I
/*     */     //   102: istore #16
/*     */     //   104: iload #11
/*     */     //   106: istore #17
/*     */     //   108: astore #10
/*     */     //   110: iload #17
/*     */     //   112: iload #14
/*     */     //   114: if_icmpge -> 236
/*     */     //   117: iload #12
/*     */     //   119: aload #10
/*     */     //   121: ifnull -> 241
/*     */     //   124: istore #18
/*     */     //   126: iload #18
/*     */     //   128: iload #15
/*     */     //   130: if_icmpge -> 224
/*     */     //   133: iload #13
/*     */     //   135: aload #10
/*     */     //   137: ifnull -> 112
/*     */     //   140: istore #19
/*     */     //   142: iload #19
/*     */     //   144: iload #16
/*     */     //   146: if_icmpge -> 212
/*     */     //   149: aload #4
/*     */     //   151: aload_0
/*     */     //   152: iload #17
/*     */     //   154: iload #18
/*     */     //   156: lload #8
/*     */     //   158: iload #19
/*     */     //   160: invokespecial a : (IIJI)Lme/konsolas/aac/mt;
/*     */     //   163: invokevirtual a : ()Lorg/bukkit/Material;
/*     */     //   166: invokeinterface test : (Ljava/lang/Object;)Z
/*     */     //   171: aload #10
/*     */     //   173: ifnull -> 128
/*     */     //   176: aload #10
/*     */     //   178: iload_1
/*     */     //   179: iflt -> 137
/*     */     //   182: ifnull -> 203
/*     */     //   185: ifeq -> 204
/*     */     //   188: goto -> 202
/*     */     //   191: ldc2_w -9120644140381262302
/*     */     //   194: lload #6
/*     */     //   196: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   201: athrow
/*     */     //   202: iconst_1
/*     */     //   203: ireturn
/*     */     //   204: iinc #19, 1
/*     */     //   207: aload #10
/*     */     //   209: ifnonnull -> 142
/*     */     //   212: iinc #18, 1
/*     */     //   215: aload #10
/*     */     //   217: iload_3
/*     */     //   218: ifle -> 233
/*     */     //   221: ifnonnull -> 126
/*     */     //   224: iinc #17, 1
/*     */     //   227: iload_3
/*     */     //   228: iflt -> 133
/*     */     //   231: aload #10
/*     */     //   233: ifnonnull -> 110
/*     */     //   236: iload_3
/*     */     //   237: ifle -> 117
/*     */     //   240: iconst_0
/*     */     //   241: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #125	-> 40
/*     */     //   #158	-> 49
/*     */     //   #37	-> 58
/*     */     //   #169	-> 67
/*     */     //   #15	-> 76
/*     */     //   #107	-> 95
/*     */     //   #59	-> 104
/*     */     //   #63	-> 117
/*     */     //   #96	-> 133
/*     */     //   #131	-> 149
/*     */     //   #70	-> 204
/*     */     //   #32	-> 212
/*     */     //   #26	-> 224
/*     */     //   #155	-> 236
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   176	188	191	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public boolean a(lq paramlq, double paramDouble1, double paramDouble2, long paramLong, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/h8.k : J
/*     */     //   3: lload #6
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: lload #6
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 81564355249986
/*     */     //   14: lxor
/*     */     //   15: lstore #10
/*     */     //   17: pop2
/*     */     //   18: aload_0
/*     */     //   19: getfield g : I
/*     */     //   22: aload_1
/*     */     //   23: invokevirtual c : ()D
/*     */     //   26: dload_2
/*     */     //   27: dadd
/*     */     //   28: invokestatic floor : (D)I
/*     */     //   31: invokestatic max : (II)I
/*     */     //   34: istore #13
/*     */     //   36: aload_0
/*     */     //   37: getfield i : I
/*     */     //   40: aload_1
/*     */     //   41: invokevirtual e : ()D
/*     */     //   44: dload #4
/*     */     //   46: dadd
/*     */     //   47: invokestatic floor : (D)I
/*     */     //   50: invokestatic max : (II)I
/*     */     //   53: istore #14
/*     */     //   55: ldc2_w -1868088409309914781
/*     */     //   58: lload #6
/*     */     //   60: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   65: aload_0
/*     */     //   66: getfield a : I
/*     */     //   69: aload_1
/*     */     //   70: invokevirtual d : ()D
/*     */     //   73: dload #8
/*     */     //   75: dadd
/*     */     //   76: invokestatic floor : (D)I
/*     */     //   79: invokestatic max : (II)I
/*     */     //   82: istore #15
/*     */     //   84: astore #12
/*     */     //   86: aload_0
/*     */     //   87: getfield h : I
/*     */     //   90: aload_1
/*     */     //   91: invokevirtual b : ()D
/*     */     //   94: dload_2
/*     */     //   95: dadd
/*     */     //   96: invokestatic ceil : (D)I
/*     */     //   99: invokestatic min : (II)I
/*     */     //   102: istore #16
/*     */     //   104: aload_0
/*     */     //   105: getfield d : I
/*     */     //   108: aload_1
/*     */     //   109: invokevirtual a : ()D
/*     */     //   112: dload #4
/*     */     //   114: dadd
/*     */     //   115: invokestatic ceil : (D)I
/*     */     //   118: invokestatic min : (II)I
/*     */     //   121: istore #17
/*     */     //   123: aload_0
/*     */     //   124: getfield j : I
/*     */     //   127: aload_1
/*     */     //   128: invokevirtual f : ()D
/*     */     //   131: dload #8
/*     */     //   133: dadd
/*     */     //   134: invokestatic ceil : (D)I
/*     */     //   137: invokestatic min : (II)I
/*     */     //   140: istore #18
/*     */     //   142: iload #13
/*     */     //   144: istore #19
/*     */     //   146: iload #19
/*     */     //   148: iload #16
/*     */     //   150: if_icmpge -> 381
/*     */     //   153: iload #14
/*     */     //   155: lload #6
/*     */     //   157: lconst_0
/*     */     //   158: lcmp
/*     */     //   159: ifle -> 389
/*     */     //   162: aload #12
/*     */     //   164: ifnull -> 389
/*     */     //   167: istore #20
/*     */     //   169: iload #20
/*     */     //   171: iload #17
/*     */     //   173: if_icmpge -> 366
/*     */     //   176: iload #15
/*     */     //   178: aload #12
/*     */     //   180: ifnull -> 148
/*     */     //   183: istore #21
/*     */     //   185: iload #21
/*     */     //   187: iload #18
/*     */     //   189: if_icmpge -> 351
/*     */     //   192: aload #12
/*     */     //   194: lload #6
/*     */     //   196: lconst_0
/*     */     //   197: lcmp
/*     */     //   198: ifle -> 363
/*     */     //   201: ifnull -> 361
/*     */     //   204: aload_0
/*     */     //   205: getfield e : Lme/konsolas/aac/ej;
/*     */     //   208: iload #19
/*     */     //   210: aload_0
/*     */     //   211: getfield g : I
/*     */     //   214: isub
/*     */     //   215: iload #20
/*     */     //   217: aload_0
/*     */     //   218: getfield i : I
/*     */     //   221: isub
/*     */     //   222: iload #21
/*     */     //   224: aload_0
/*     */     //   225: getfield a : I
/*     */     //   228: isub
/*     */     //   229: invokevirtual a : (III)Ljava/lang/Object;
/*     */     //   232: checkcast me/konsolas/aac/mt
/*     */     //   235: invokevirtual a : ()Lme/konsolas/aac/hO;
/*     */     //   238: invokevirtual a : ()Ljava/util/Collection;
/*     */     //   241: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   246: astore #22
/*     */     //   248: aload #22
/*     */     //   250: invokeinterface hasNext : ()Z
/*     */     //   255: ifeq -> 336
/*     */     //   258: aload #22
/*     */     //   260: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   265: checkcast me/konsolas/aac/lq
/*     */     //   268: astore #23
/*     */     //   270: aload #23
/*     */     //   272: aload_1
/*     */     //   273: dload_2
/*     */     //   274: iload #19
/*     */     //   276: i2d
/*     */     //   277: dsub
/*     */     //   278: dload #4
/*     */     //   280: iload #20
/*     */     //   282: i2d
/*     */     //   283: dsub
/*     */     //   284: dload #8
/*     */     //   286: iload #21
/*     */     //   288: i2d
/*     */     //   289: dsub
/*     */     //   290: lload #10
/*     */     //   292: invokevirtual a : (Lme/konsolas/aac/lq;DDDJ)Z
/*     */     //   295: aload #12
/*     */     //   297: ifnull -> 187
/*     */     //   300: aload #12
/*     */     //   302: lload #6
/*     */     //   304: lconst_0
/*     */     //   305: lcmp
/*     */     //   306: iflt -> 434
/*     */     //   309: ifnull -> 330
/*     */     //   312: ifeq -> 331
/*     */     //   315: goto -> 329
/*     */     //   318: ldc2_w -1864036148732311185
/*     */     //   321: lload #6
/*     */     //   323: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   328: athrow
/*     */     //   329: iconst_0
/*     */     //   330: ireturn
/*     */     //   331: aload #12
/*     */     //   333: ifnonnull -> 248
/*     */     //   336: iinc #21, 1
/*     */     //   339: aload #12
/*     */     //   341: lload #6
/*     */     //   343: lconst_0
/*     */     //   344: lcmp
/*     */     //   345: iflt -> 265
/*     */     //   348: ifnonnull -> 185
/*     */     //   351: lload #6
/*     */     //   353: lconst_0
/*     */     //   354: lcmp
/*     */     //   355: iflt -> 192
/*     */     //   358: iinc #20, 1
/*     */     //   361: aload #12
/*     */     //   363: ifnonnull -> 169
/*     */     //   366: iinc #19, 1
/*     */     //   369: lload #6
/*     */     //   371: lconst_0
/*     */     //   372: lcmp
/*     */     //   373: iflt -> 388
/*     */     //   376: aload #12
/*     */     //   378: ifnonnull -> 146
/*     */     //   381: lload #6
/*     */     //   383: lconst_0
/*     */     //   384: lcmp
/*     */     //   385: iflt -> 153
/*     */     //   388: iconst_1
/*     */     //   389: lload #6
/*     */     //   391: lconst_0
/*     */     //   392: lcmp
/*     */     //   393: iflt -> 444
/*     */     //   396: ldc2_w -1843337642709310776
/*     */     //   399: lload #6
/*     */     //   401: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   406: ifnull -> 458
/*     */     //   409: ldc_w '탟렵䣮퍃ʯ㲫'
/*     */     //   412: invokevirtual toCharArray : ()[C
/*     */     //   415: dup
/*     */     //   416: dup
/*     */     //   417: iconst_5
/*     */     //   418: dup_x1
/*     */     //   419: caload
/*     */     //   420: sipush #17443
/*     */     //   423: ixor
/*     */     //   424: i2c
/*     */     //   425: castore
/*     */     //   426: sipush #21303
/*     */     //   429: iconst_0
/*     */     //   430: iconst_0
/*     */     //   431: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   434: ldc2_w -1869655515850337080
/*     */     //   437: lload #6
/*     */     //   439: <illegal opcode> w : (Ljava/lang/String;JJ)V
/*     */     //   444: goto -> 458
/*     */     //   447: ldc2_w -1864036148732311185
/*     */     //   450: lload #6
/*     */     //   452: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   457: athrow
/*     */     //   458: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #132	-> 18
/*     */     //   #98	-> 36
/*     */     //   #11	-> 65
/*     */     //   #92	-> 86
/*     */     //   #139	-> 104
/*     */     //   #130	-> 123
/*     */     //   #41	-> 142
/*     */     //   #18	-> 153
/*     */     //   #168	-> 176
/*     */     //   #33	-> 192
/*     */     //   #72	-> 270
/*     */     //   #52	-> 329
/*     */     //   #120	-> 331
/*     */     //   #34	-> 336
/*     */     //   #163	-> 351
/*     */     //   #62	-> 366
/*     */     //   #109	-> 381
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   300	315	318	java/lang/IllegalArgumentException
/*     */     //   389	444	447	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   }
/*     */   
/*     */   private static String a(byte[] paramArrayOfbyte) {
/*     */     byte b1 = 0;
/*     */     int i;
/*     */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*     */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       int j;
/*     */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*     */         arrayOfChar[b1++] = (char)j;
/*     */       } else if (j < 224) {
/*     */         char c = (char)((char)(j & 0x1F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } else if (b2 < i - 2) {
/*     */         char c = (char)((char)(j & 0xF) << 12);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } 
/*     */     } 
/*     */     return new String(arrayOfChar, 0, b1);
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */