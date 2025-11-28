/*    */ package me.konsolas.aac;public class fy implements mJ { private final MethodHandle d; private final MethodHandle f; private final MethodHandle b; private final MethodHandle i; private final MethodHandle c; private final MethodHandle a; private final MethodHandle h; public Collection a(Player paramPlayer) {
/*  2 */     return Collections.singleton(paramPlayer.getItemInHand());
/*    */   }
/*    */   private final MethodHandle j; private final MethodHandle g; private final MethodHandle e; private static final long k = nc.a(-1960637425728029574L, -8561044143528981308L, MethodHandles.lookup().lookupClass()).a(162586765634647L); private static final String[] l; private static final String[] m; private static final Map n = new HashMap<>(13);
/*    */   public fy(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fy.k : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 37642204083218
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 39345100808481
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 116187871084207
/*    */     //   24: lxor
/*    */     //   25: dup2
/*    */     //   26: bipush #32
/*    */     //   28: lushr
/*    */     //   29: l2i
/*    */     //   30: istore #7
/*    */     //   32: dup2
/*    */     //   33: bipush #32
/*    */     //   35: lshl
/*    */     //   36: bipush #56
/*    */     //   38: lushr
/*    */     //   39: l2i
/*    */     //   40: istore #8
/*    */     //   42: dup2
/*    */     //   43: bipush #40
/*    */     //   45: lshl
/*    */     //   46: bipush #40
/*    */     //   48: lushr
/*    */     //   49: l2i
/*    */     //   50: istore #9
/*    */     //   52: pop2
/*    */     //   53: dup2
/*    */     //   54: ldc2_w 35059861874751
/*    */     //   57: lxor
/*    */     //   58: lstore #10
/*    */     //   60: pop2
/*    */     //   61: aload_0
/*    */     //   62: invokespecial <init> : ()V
/*    */     //   65: invokestatic getServer : ()Lorg/bukkit/Server;
/*    */     //   68: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   71: invokevirtual getPackage : ()Ljava/lang/Package;
/*    */     //   74: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   77: astore #12
/*    */     //   79: aload #12
/*    */     //   81: sipush #27853
/*    */     //   84: ldc2_w 7203090681628576622
/*    */     //   87: lload_1
/*    */     //   88: lxor
/*    */     //   89: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   94: sipush #10498
/*    */     //   97: ldc2_w 1513316399301562034
/*    */     //   100: lload_1
/*    */     //   101: lxor
/*    */     //   102: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   107: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   110: astore #13
/*    */     //   112: new java/lang/StringBuilder
/*    */     //   115: dup
/*    */     //   116: invokespecial <init> : ()V
/*    */     //   119: aload #12
/*    */     //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   124: bipush #41
/*    */     //   126: ldc2_w 3688638534717187984
/*    */     //   129: lload_1
/*    */     //   130: lxor
/*    */     //   131: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   139: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   142: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   145: astore #14
/*    */     //   147: new java/lang/StringBuilder
/*    */     //   150: dup
/*    */     //   151: invokespecial <init> : ()V
/*    */     //   154: aload #12
/*    */     //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   159: sipush #30370
/*    */     //   162: ldc2_w 8162069392234074370
/*    */     //   165: lload_1
/*    */     //   166: lxor
/*    */     //   167: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   175: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   178: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   181: astore #15
/*    */     //   183: new java/lang/StringBuilder
/*    */     //   186: dup
/*    */     //   187: invokespecial <init> : ()V
/*    */     //   190: aload #13
/*    */     //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   195: sipush #14016
/*    */     //   198: ldc2_w 639837370990367079
/*    */     //   201: lload_1
/*    */     //   202: lxor
/*    */     //   203: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   211: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   214: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   217: astore #16
/*    */     //   219: new java/lang/StringBuilder
/*    */     //   222: dup
/*    */     //   223: invokespecial <init> : ()V
/*    */     //   226: aload #13
/*    */     //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   231: sipush #2941
/*    */     //   234: ldc2_w 6236083804832148678
/*    */     //   237: lload_1
/*    */     //   238: lxor
/*    */     //   239: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   247: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   250: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   253: astore #17
/*    */     //   255: new java/lang/StringBuilder
/*    */     //   258: dup
/*    */     //   259: invokespecial <init> : ()V
/*    */     //   262: aload #13
/*    */     //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   267: sipush #7585
/*    */     //   270: ldc2_w 7606735616562936323
/*    */     //   273: lload_1
/*    */     //   274: lxor
/*    */     //   275: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   283: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   286: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   289: astore #18
/*    */     //   291: new java/lang/StringBuilder
/*    */     //   294: dup
/*    */     //   295: invokespecial <init> : ()V
/*    */     //   298: aload #13
/*    */     //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   303: sipush #7119
/*    */     //   306: ldc2_w 346804640035748979
/*    */     //   309: lload_1
/*    */     //   310: lxor
/*    */     //   311: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   319: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   322: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   325: astore #19
/*    */     //   327: new java/lang/StringBuilder
/*    */     //   330: dup
/*    */     //   331: invokespecial <init> : ()V
/*    */     //   334: aload #13
/*    */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   339: sipush #26994
/*    */     //   342: ldc2_w 973700300595384012
/*    */     //   345: lload_1
/*    */     //   346: lxor
/*    */     //   347: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   355: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   358: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   361: astore #20
/*    */     //   363: new java/lang/StringBuilder
/*    */     //   366: dup
/*    */     //   367: invokespecial <init> : ()V
/*    */     //   370: aload #13
/*    */     //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   375: sipush #14950
/*    */     //   378: ldc2_w 8249054355136323036
/*    */     //   381: lload_1
/*    */     //   382: lxor
/*    */     //   383: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   391: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   394: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   397: astore #21
/*    */     //   399: new java/lang/StringBuilder
/*    */     //   402: dup
/*    */     //   403: invokespecial <init> : ()V
/*    */     //   406: aload #13
/*    */     //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   411: sipush #11718
/*    */     //   414: ldc2_w 3026429968458320505
/*    */     //   417: lload_1
/*    */     //   418: lxor
/*    */     //   419: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   427: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   430: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   433: astore #22
/*    */     //   435: aload_0
/*    */     //   436: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   439: lload #10
/*    */     //   441: invokestatic k : (J)Ljava/lang/Class;
/*    */     //   444: invokevirtual getSuperclass : ()Ljava/lang/Class;
/*    */     //   447: sipush #28120
/*    */     //   450: ldc2_w 5566865615938538092
/*    */     //   453: lload_1
/*    */     //   454: lxor
/*    */     //   455: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   460: iconst_0
/*    */     //   461: anewarray java/lang/Class
/*    */     //   464: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   467: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   470: checkcast java/lang/reflect/Method
/*    */     //   473: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   476: putfield d : Ljava/lang/invoke/MethodHandle;
/*    */     //   479: aload_0
/*    */     //   480: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   483: lload #5
/*    */     //   485: invokestatic g : (J)Ljava/lang/Class;
/*    */     //   488: sipush #26200
/*    */     //   491: ldc2_w 4622093884683207147
/*    */     //   494: lload_1
/*    */     //   495: lxor
/*    */     //   496: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   501: iconst_0
/*    */     //   502: anewarray java/lang/Class
/*    */     //   505: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   508: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   511: checkcast java/lang/reflect/Method
/*    */     //   514: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   517: putfield f : Ljava/lang/invoke/MethodHandle;
/*    */     //   520: aload_0
/*    */     //   521: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   524: iload #7
/*    */     //   526: iload #8
/*    */     //   528: i2b
/*    */     //   529: iload #9
/*    */     //   531: invokestatic p : (IBI)Ljava/lang/Class;
/*    */     //   534: sipush #24813
/*    */     //   537: ldc2_w 5078189635165898588
/*    */     //   540: lload_1
/*    */     //   541: lxor
/*    */     //   542: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   547: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*    */     //   550: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   553: checkcast java/lang/reflect/Field
/*    */     //   556: invokevirtual unreflectGetter : (Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;
/*    */     //   559: putfield b : Ljava/lang/invoke/MethodHandle;
/*    */     //   562: aload_0
/*    */     //   563: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   566: aload #14
/*    */     //   568: sipush #11177
/*    */     //   571: ldc2_w 3575756676121398302
/*    */     //   574: lload_1
/*    */     //   575: lxor
/*    */     //   576: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   581: iconst_0
/*    */     //   582: anewarray java/lang/Class
/*    */     //   585: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   588: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   591: putfield i : Ljava/lang/invoke/MethodHandle;
/*    */     //   594: aload_0
/*    */     //   595: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   598: aload #15
/*    */     //   600: sipush #6886
/*    */     //   603: ldc2_w 1592564967529266503
/*    */     //   606: lload_1
/*    */     //   607: lxor
/*    */     //   608: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   613: iconst_0
/*    */     //   614: anewarray java/lang/Class
/*    */     //   617: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   620: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   623: putfield c : Ljava/lang/invoke/MethodHandle;
/*    */     //   626: aload_0
/*    */     //   627: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   630: lload_3
/*    */     //   631: invokestatic d : (J)Ljava/lang/Class;
/*    */     //   634: sipush #2000
/*    */     //   637: ldc2_w 3916166178513756276
/*    */     //   640: lload_1
/*    */     //   641: lxor
/*    */     //   642: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   647: iconst_0
/*    */     //   648: anewarray java/lang/Class
/*    */     //   651: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   654: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   657: checkcast java/lang/reflect/Method
/*    */     //   660: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   663: putfield a : Ljava/lang/invoke/MethodHandle;
/*    */     //   666: aload_0
/*    */     //   667: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   670: aload #21
/*    */     //   672: iconst_3
/*    */     //   673: anewarray java/lang/Class
/*    */     //   676: dup
/*    */     //   677: iconst_0
/*    */     //   678: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   681: aastore
/*    */     //   682: dup
/*    */     //   683: iconst_1
/*    */     //   684: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   687: aastore
/*    */     //   688: dup
/*    */     //   689: iconst_2
/*    */     //   690: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   693: aastore
/*    */     //   694: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/*    */     //   697: invokevirtual unreflectConstructor : (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
/*    */     //   700: putfield h : Ljava/lang/invoke/MethodHandle;
/*    */     //   703: aload_0
/*    */     //   704: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   707: aload #16
/*    */     //   709: sipush #19124
/*    */     //   712: ldc2_w 7438482102957305089
/*    */     //   715: lload_1
/*    */     //   716: lxor
/*    */     //   717: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   722: iconst_1
/*    */     //   723: anewarray java/lang/Class
/*    */     //   726: dup
/*    */     //   727: iconst_0
/*    */     //   728: aload #21
/*    */     //   730: aastore
/*    */     //   731: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   734: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   737: checkcast java/lang/reflect/Method
/*    */     //   740: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   743: putfield j : Ljava/lang/invoke/MethodHandle;
/*    */     //   746: aload_0
/*    */     //   747: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   750: aload #22
/*    */     //   752: sipush #31661
/*    */     //   755: ldc2_w 240935045913795615
/*    */     //   758: lload_1
/*    */     //   759: lxor
/*    */     //   760: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   765: iconst_0
/*    */     //   766: anewarray java/lang/Class
/*    */     //   769: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   772: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   775: checkcast java/lang/reflect/Method
/*    */     //   778: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   781: putfield g : Ljava/lang/invoke/MethodHandle;
/*    */     //   784: aload_0
/*    */     //   785: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   788: aload #19
/*    */     //   790: ldc '┆'
/*    */     //   792: invokevirtual toCharArray : ()[C
/*    */     //   795: dup
/*    */     //   796: dup
/*    */     //   797: iconst_0
/*    */     //   798: dup_x1
/*    */     //   799: caload
/*    */     //   800: sipush #2769
/*    */     //   803: ixor
/*    */     //   804: i2c
/*    */     //   805: castore
/*    */     //   806: sipush #11388
/*    */     //   809: iconst_0
/*    */     //   810: iconst_1
/*    */     //   811: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   814: bipush #6
/*    */     //   816: anewarray java/lang/Class
/*    */     //   819: dup
/*    */     //   820: iconst_0
/*    */     //   821: aload #16
/*    */     //   823: aastore
/*    */     //   824: dup
/*    */     //   825: iconst_1
/*    */     //   826: aload #21
/*    */     //   828: aastore
/*    */     //   829: dup
/*    */     //   830: iconst_2
/*    */     //   831: aload #22
/*    */     //   833: aastore
/*    */     //   834: dup
/*    */     //   835: iconst_3
/*    */     //   836: aload #20
/*    */     //   838: aastore
/*    */     //   839: dup
/*    */     //   840: iconst_4
/*    */     //   841: ldc java/util/List
/*    */     //   843: aastore
/*    */     //   844: dup
/*    */     //   845: iconst_5
/*    */     //   846: aload #17
/*    */     //   848: aastore
/*    */     //   849: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   852: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   855: checkcast java/lang/reflect/Method
/*    */     //   858: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   861: putfield e : Ljava/lang/invoke/MethodHandle;
/*    */     //   864: goto -> 892
/*    */     //   867: astore #12
/*    */     //   869: new java/lang/RuntimeException
/*    */     //   872: dup
/*    */     //   873: sipush #17411
/*    */     //   876: ldc2_w 3227308927417213877
/*    */     //   879: lload_1
/*    */     //   880: lxor
/*    */     //   881: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   886: aload #12
/*    */     //   888: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   891: athrow
/*    */     //   892: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 61
/*    */     //   #31	-> 65
/*    */     //   #33	-> 79
/*    */     //   #16	-> 112
/*    */     //   #53	-> 147
/*    */     //   #32	-> 183
/*    */     //   #43	-> 219
/*    */     //   #13	-> 255
/*    */     //   #11	-> 291
/*    */     //   #49	-> 327
/*    */     //   #54	-> 363
/*    */     //   #10	-> 399
/*    */     //   #57	-> 435
/*    */     //   #22	-> 479
/*    */     //   #25	-> 520
/*    */     //   #20	-> 562
/*    */     //   #15	-> 594
/*    */     //   #45	-> 626
/*    */     //   #38	-> 666
/*    */     //   #5	-> 703
/*    */     //   #51	-> 746
/*    */     //   #30	-> 784
/*    */     //   #3	-> 849
/*    */     //   #41	-> 852
/*    */     //   #14	-> 864
/*    */     //   #46	-> 867
/*    */     //   #24	-> 869
/*    */     //   #52	-> 892
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   65	864	867	java/lang/IllegalAccessException
/*    */     //   65	864	867	java/lang/NoSuchMethodException
/*    */     //   65	864	867	java/lang/NoSuchFieldException
/*    */     //   65	864	867	java/lang/ClassNotFoundException
/*    */   }
/*    */   public float a(long paramLong, Block paramBlock) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield b : Ljava/lang/invoke/MethodHandle;
/*    */     //   4: aload_0
/*    */     //   5: getfield f : Ljava/lang/invoke/MethodHandle;
/*    */     //   8: aload_3
/*    */     //   9: invokevirtual invoke : (Lorg/bukkit/block/Block;)Ljava/lang/Object;
/*    */     //   12: invokevirtual invoke : (Ljava/lang/Object;)F
/*    */     //   15: freturn
/*    */     //   16: astore #4
/*    */     //   18: new java/lang/RuntimeException
/*    */     //   21: dup
/*    */     //   22: sipush #32631
/*    */     //   25: ldc2_w 5316333719107714009
/*    */     //   28: lload_1
/*    */     //   29: lxor
/*    */     //   30: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   35: aload #4
/*    */     //   37: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   40: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 0
/*    */     //   #1	-> 16
/*    */     //   #9	-> 18
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	15	16	java/lang/Throwable
/*    */   }
/*    */   public float a(short paramShort1, Player paramPlayer, Block paramBlock, short paramShort2, int paramInt) {
/* 12 */     long l = paramShort1 << 48L | paramShort2 << 48L >>> 16L | paramInt << 32L >>> 32L; int i = (int)((l ^ 0x18425AE8BFB6L) >>> 32L), j = (int)((l ^ 0x18425AE8BFB6L) << 32L >>> 48L), k = (int)((l ^ 0x18425AE8BFB6L) << 48L >>> 48L); l ^ 0x18425AE8BFB6L; return g4.a(i, paramBlock, (char)j, paramPlayer, (short)k);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public d7 a(Entity paramEntity, Vector paramVector1, long paramLong, Vector paramVector2, double paramDouble) {
/* 19 */     long l = paramLong ^ 0x6B5E3364487DL; return a6.a(paramEntity, l, paramVector1, paramVector2, paramDouble);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack a(Player paramPlayer, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield d : Ljava/lang/invoke/MethodHandle;
/*    */     //   4: aload_0
/*    */     //   5: getfield i : Ljava/lang/invoke/MethodHandle;
/*    */     //   8: aload_1
/*    */     //   9: invokevirtual invoke : (Lorg/bukkit/entity/Player;)Ljava/lang/Object;
/*    */     //   12: invokevirtual invoke : (Ljava/lang/Object;)Z
/*    */     //   15: ifeq -> 25
/*    */     //   18: aload_1
/*    */     //   19: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
/*    */     //   24: areturn
/*    */     //   25: aconst_null
/*    */     //   26: areturn
/*    */     //   27: astore #4
/*    */     //   29: new java/lang/RuntimeException
/*    */     //   32: dup
/*    */     //   33: sipush #29755
/*    */     //   36: ldc2_w 4158376632336658914
/*    */     //   39: lload_2
/*    */     //   40: lxor
/*    */     //   41: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   51: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 0
/*    */     //   #36	-> 18
/*    */     //   #48	-> 25
/*    */     //   #44	-> 27
/*    */     //   #27	-> 29
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	24	27	java/lang/Throwable
/*    */     //   25	26	27	java/lang/Throwable
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public lq a(Entity paramEntity, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 137378456965913
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: pop2
/*    */     //   9: aload_0
/*    */     //   10: getfield a : Ljava/lang/invoke/MethodHandle;
/*    */     //   13: aload_0
/*    */     //   14: getfield i : Ljava/lang/invoke/MethodHandle;
/*    */     //   17: aload_1
/*    */     //   18: invokevirtual invoke : (Lorg/bukkit/entity/Entity;)Ljava/lang/Object;
/*    */     //   21: invokevirtual invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   24: astore #6
/*    */     //   26: lload #4
/*    */     //   28: aload #6
/*    */     //   30: invokestatic a : (JLjava/lang/Object;)Lme/konsolas/aac/lq;
/*    */     //   33: areturn
/*    */     //   34: astore #6
/*    */     //   36: new java/lang/RuntimeException
/*    */     //   39: dup
/*    */     //   40: sipush #1191
/*    */     //   43: ldc2_w 4803109785335480134
/*    */     //   46: lload_2
/*    */     //   47: lxor
/*    */     //   48: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   53: aload #6
/*    */     //   55: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   58: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 9
/*    */     //   #35	-> 26
/*    */     //   #37	-> 34
/*    */     //   #50	-> 36
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	33	34	java/lang/Throwable
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(Player paramPlayer) {
/* 39 */     return false;
/*    */   }
/*    */   
/*    */   public List a(Block paramBlock, char paramChar, long paramLong, Entity paramEntity) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: lload_3
/*    */     //   6: bipush #16
/*    */     //   8: lshl
/*    */     //   9: bipush #16
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: lstore #6
/*    */     //   15: lload #6
/*    */     //   17: dup2
/*    */     //   18: ldc2_w 54401507619045
/*    */     //   21: lxor
/*    */     //   22: lstore #8
/*    */     //   24: dup2
/*    */     //   25: ldc2_w 94991243778422
/*    */     //   28: lxor
/*    */     //   29: lstore #10
/*    */     //   31: pop2
/*    */     //   32: ldc2_w -4127385674211381296
/*    */     //   35: lload #6
/*    */     //   37: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   42: astore #12
/*    */     //   44: aload_0
/*    */     //   45: getfield c : Ljava/lang/invoke/MethodHandle;
/*    */     //   48: aload_1
/*    */     //   49: invokeinterface getWorld : ()Lorg/bukkit/World;
/*    */     //   54: invokevirtual invoke : (Lorg/bukkit/World;)Ljava/lang/Object;
/*    */     //   57: astore #13
/*    */     //   59: aload_0
/*    */     //   60: getfield h : Ljava/lang/invoke/MethodHandle;
/*    */     //   63: aload_1
/*    */     //   64: invokeinterface getX : ()I
/*    */     //   69: aload_1
/*    */     //   70: invokeinterface getY : ()I
/*    */     //   75: aload_1
/*    */     //   76: invokeinterface getZ : ()I
/*    */     //   81: invokevirtual invoke : (III)Ljava/lang/Object;
/*    */     //   84: astore #14
/*    */     //   86: aload_0
/*    */     //   87: getfield j : Ljava/lang/invoke/MethodHandle;
/*    */     //   90: aload #13
/*    */     //   92: aload #14
/*    */     //   94: invokevirtual invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   97: astore #15
/*    */     //   99: aload_1
/*    */     //   100: invokeinterface getX : ()I
/*    */     //   105: i2d
/*    */     //   106: aload_1
/*    */     //   107: invokeinterface getY : ()I
/*    */     //   112: i2d
/*    */     //   113: lload #8
/*    */     //   115: dup2_x2
/*    */     //   116: pop2
/*    */     //   117: aload_1
/*    */     //   118: invokeinterface getZ : ()I
/*    */     //   123: i2d
/*    */     //   124: aload_1
/*    */     //   125: invokeinterface getX : ()I
/*    */     //   130: i2d
/*    */     //   131: dconst_1
/*    */     //   132: dadd
/*    */     //   133: aload_1
/*    */     //   134: invokeinterface getY : ()I
/*    */     //   139: i2d
/*    */     //   140: dconst_1
/*    */     //   141: dadd
/*    */     //   142: aload_1
/*    */     //   143: invokeinterface getZ : ()I
/*    */     //   148: i2d
/*    */     //   149: dconst_1
/*    */     //   150: dadd
/*    */     //   151: invokestatic a : (DJDDDDD)Ljava/lang/Object;
/*    */     //   154: astore #16
/*    */     //   156: new java/util/ArrayList
/*    */     //   159: dup
/*    */     //   160: invokespecial <init> : ()V
/*    */     //   163: astore #17
/*    */     //   165: aload_0
/*    */     //   166: getfield g : Ljava/lang/invoke/MethodHandle;
/*    */     //   169: aload #15
/*    */     //   171: invokevirtual invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   174: astore #18
/*    */     //   176: aload_0
/*    */     //   177: getfield e : Ljava/lang/invoke/MethodHandle;
/*    */     //   180: aload #18
/*    */     //   182: aload #13
/*    */     //   184: aload #14
/*    */     //   186: aload #15
/*    */     //   188: aload #16
/*    */     //   190: aload #17
/*    */     //   192: aload_0
/*    */     //   193: getfield i : Ljava/lang/invoke/MethodHandle;
/*    */     //   196: aload #5
/*    */     //   198: invokevirtual invoke : (Lorg/bukkit/entity/Entity;)Ljava/lang/Object;
/*    */     //   201: invokevirtual invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;)V
/*    */     //   204: new java/util/ArrayList
/*    */     //   207: dup
/*    */     //   208: aload #17
/*    */     //   210: invokeinterface size : ()I
/*    */     //   215: invokespecial <init> : (I)V
/*    */     //   218: astore #19
/*    */     //   220: aload #17
/*    */     //   222: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   227: astore #20
/*    */     //   229: aload #20
/*    */     //   231: invokeinterface hasNext : ()Z
/*    */     //   236: ifeq -> 337
/*    */     //   239: aload #20
/*    */     //   241: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   246: astore #21
/*    */     //   248: aload #19
/*    */     //   250: aload #12
/*    */     //   252: iload_2
/*    */     //   253: iflt -> 261
/*    */     //   256: ifnull -> 339
/*    */     //   259: aload #21
/*    */     //   261: aload_1
/*    */     //   262: invokeinterface getX : ()I
/*    */     //   267: ineg
/*    */     //   268: i2d
/*    */     //   269: lload #10
/*    */     //   271: dup2_x2
/*    */     //   272: pop2
/*    */     //   273: aload_1
/*    */     //   274: invokeinterface getY : ()I
/*    */     //   279: ineg
/*    */     //   280: i2d
/*    */     //   281: aload_1
/*    */     //   282: invokeinterface getZ : ()I
/*    */     //   287: ineg
/*    */     //   288: i2d
/*    */     //   289: invokestatic a : (Ljava/lang/Object;JDDD)Lme/konsolas/aac/lq;
/*    */     //   292: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   297: pop
/*    */     //   298: aload #12
/*    */     //   300: ifnonnull -> 229
/*    */     //   303: lload_3
/*    */     //   304: lconst_0
/*    */     //   305: lcmp
/*    */     //   306: ifle -> 248
/*    */     //   309: goto -> 323
/*    */     //   312: ldc2_w -4073966988420977545
/*    */     //   315: lload #6
/*    */     //   317: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   322: athrow
/*    */     //   323: iconst_1
/*    */     //   324: anewarray me/konsolas/aac/aN
/*    */     //   327: ldc2_w -4118827337951928573
/*    */     //   330: lload #6
/*    */     //   332: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   337: aload #19
/*    */     //   339: areturn
/*    */     //   340: astore #13
/*    */     //   342: new java/lang/RuntimeException
/*    */     //   345: dup
/*    */     //   346: sipush #20510
/*    */     //   349: ldc2_w 179094618432942399
/*    */     //   352: lload #6
/*    */     //   354: lxor
/*    */     //   355: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   360: aload #13
/*    */     //   362: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   365: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #58	-> 44
/*    */     //   #59	-> 59
/*    */     //   #17	-> 86
/*    */     //   #34	-> 99
/*    */     //   #18	-> 125
/*    */     //   #55	-> 151
/*    */     //   #60	-> 156
/*    */     //   #4	-> 165
/*    */     //   #29	-> 176
/*    */     //   #47	-> 198
/*    */     //   #21	-> 201
/*    */     //   #56	-> 204
/*    */     //   #8	-> 220
/*    */     //   #23	-> 337
/*    */     //   #42	-> 340
/*    */     //   #40	-> 342
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   44	339	340	java/lang/Throwable
/*    */     //   248	303	312	java/lang/Throwable
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = k ^ 0xA25E802B27L;
/*    */     "௜㭽这ꅷꎍ댽玉뿷ई࿱敎姪₧﹑஠㌅䕅ǵ칈ྃ".toCharArray()[16] = (char)("௜㭽这ꅷꎍ댽玉뿷ई࿱敎姪₧﹑஠㌅䕅ǵ칈ྃ".toCharArray()[16] ^ 0x15CA);
/*    */     "媊鏟唧㣬".toCharArray()[1] = (char)("媊鏟唧㣬".toCharArray()[1] ^ 0x531F);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("௜㭽这ꅷꎍ댽玉뿷ई࿱敎姪₧﹑஠㌅䕅ǵ칈ྃ".toCharArray(), (short)7397, false, (byte)2))).init(2, SecretKeyFactory.getInstance(a0$cc.G("媊鏟唧㣬".toCharArray(), (short)943, true, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[24];
/*    */     boolean bool = false;
/*    */     "?亳猳䂩⎅䋯裏?固抧鿎䯚嶕窀椶ﴵ◕볒쐫⢙ꖬ揊旖௎ູ倃镆꽓론惼豩돭굔㋧鼡颟젔稓䜁ꃺ⛨⫸᠐⻇浓撇䦮勾䗎?觗㬬溭顡䒛뷯Ჲ鱤潠썐䗸ᤞᓂ㝢講늶﷌氱䣩⍨褸瘓檲?ẓ뼮듩ԣꏸ튢폣䂂ꆡஓ?錪ꯩ痱⨉⧝ԛ⃨逓럙考敛⟵퐨뮽㵧둁ಕ易誜댐邎䮐뽬ὼ呬ﯞ☤慼ⲥ諢吊ꁔ맍ﷹ丆䪮먁뷿눮록䫔?ꔶ䎃毎筴ᆲ㞣ﯤ悱齉腂ᜟ臏諐욝藖嵑쁄绽䕙丰?ᾤ岇眰㝓⬹ꪔ糎/㼞蘷讫␎䬾ྉ金駢ﺕ瀊泡頔裕뜌엽퀎䳓ᩮ엘躮꺈野ز蹷䣴?咜뗞淄ࣵꓷ闖᷃蔙批먚቞䋏肂솭⟧磤쨽ݲ齧?ᣖჳ鼌3尼뇕쯁䌀歴룥?惹Ⲧ뷋⩌晏픕㷊ᕭ?悬ᴑ찜⑻簢?㞵己줋旹뿊邏댠䭌챢ඞ锷䘄䏁?뢱쟼⽁踶裖虱쫚딠㴧쨨㚥鶜呉嫮䏭趐ӟⷭ簺㫔턃蟸桴ɖ௝䩱᭱뽷䙡뙎椑䯒覯捸薗颖鱇蔟閥뒋溴᧣꧳巳龵ᗚ솁弓륪㚎蚡ㄑớ୥ꘊŪ脓︕藭鉧?씻꣼䶷콰Ṩ脶㠐啂᷎呿歬ĸ蝉䒓澋᚝嗲⓹掝ꔑ₿㏹ⅱᝉ末⇿䉘쌱⺈恔౑౐谙짲۴蔳푸﹪䵆㺶ꗟ忍瑞쪝逘㏔࿦묉俩⹥⇊ᒪ㨜飾囆브᪋䕛䦆庢鎃䟱戞嗝椺᛽劇⹚䝑?␳揨ꑴ뇀௣橄揬㩞쐬୚츠緣詤喅榍錈셼겪䟇돡ᖿ﹝禺玃ﶬ힉￑懿ےᔆ?詮︸뚒랲ᝍٱ걘ᩙ㏇⬱胕뤎칞ᣬ衊ੈ穴랭붫飡뭥걦ᩬ⺼됲ڨ㦦釣慃ﯨ謫嫜钋藉 㕺Ẳ钚铍滽譀굫຺圯Ģ᷃꿫烉밁烴ͦ뻧û錊룰훏粑᧐挡俁紃衇確暰㐟䔯᫤䄈컛圕᳏ė輹緙柢옲㈭囩엨?蚘Ꞵ既᪌ൂꊻ蟭读㚼捸ຶႪ護ￒ烻쮒檠髰䣔鮮ꥁ䮆⻐?敖ꑨ?ｔ禫礩ู㩡퟉ᔉ縠㗑撳漍譄?礚鉳媯뽥ꑛ皉怸泘韜јɢ❊粰쟳쯹꨾酗蟍፷衮▒形양乇邘䞬窪ᒱ瞿랉礻㈹϶펪꘽ፀꨔ陗饺㝮둏Ϡ??㬇麹≚︓ڠ詢ꊉ?貪鯇쳗亘쬑펰첦하㥭꼧ﰊꞙ⿕෉⮇衅◃忏ꍾ२킶凒⼅޲郯ዠꞤ㺣攉퓕沉磌ꋌ镕㲢㙏璿暗☑?鍗쨓⎬Ⓛ蚚ﴬ눦鹁Ｕ훇ᦻ⚚뷲묃蔯䀽舣랻晘".toCharArray()[354] = (char)("?亳猳䂩⎅䋯裏?固抧鿎䯚嶕窀椶ﴵ◕볒쐫⢙ꖬ揊旖௎ູ倃镆꽓론惼豩돭굔㋧鼡颟젔稓䜁ꃺ⛨⫸᠐⻇浓撇䦮勾䗎?觗㬬溭顡䒛뷯Ჲ鱤潠썐䗸ᤞᓂ㝢講늶﷌氱䣩⍨褸瘓檲?ẓ뼮듩ԣꏸ튢폣䂂ꆡஓ?錪ꯩ痱⨉⧝ԛ⃨逓럙考敛⟵퐨뮽㵧둁ಕ易誜댐邎䮐뽬ὼ呬ﯞ☤慼ⲥ諢吊ꁔ맍ﷹ丆䪮먁뷿눮록䫔?ꔶ䎃毎筴ᆲ㞣ﯤ悱齉腂ᜟ臏諐욝藖嵑쁄绽䕙丰?ᾤ岇眰㝓⬹ꪔ糎/㼞蘷讫␎䬾ྉ金駢ﺕ瀊泡頔裕뜌엽퀎䳓ᩮ엘躮꺈野ز蹷䣴?咜뗞淄ࣵꓷ闖᷃蔙批먚቞䋏肂솭⟧磤쨽ݲ齧?ᣖჳ鼌3尼뇕쯁䌀歴룥?惹Ⲧ뷋⩌晏픕㷊ᕭ?悬ᴑ찜⑻簢?㞵己줋旹뿊邏댠䭌챢ඞ锷䘄䏁?뢱쟼⽁踶裖虱쫚딠㴧쨨㚥鶜呉嫮䏭趐ӟⷭ簺㫔턃蟸桴ɖ௝䩱᭱뽷䙡뙎椑䯒覯捸薗颖鱇蔟閥뒋溴᧣꧳巳龵ᗚ솁弓륪㚎蚡ㄑớ୥ꘊŪ脓︕藭鉧?씻꣼䶷콰Ṩ脶㠐啂᷎呿歬ĸ蝉䒓澋᚝嗲⓹掝ꔑ₿㏹ⅱᝉ末⇿䉘쌱⺈恔౑౐谙짲۴蔳푸﹪䵆㺶ꗟ忍瑞쪝逘㏔࿦묉俩⹥⇊ᒪ㨜飾囆브᪋䕛䦆庢鎃䟱戞嗝椺᛽劇⹚䝑?␳揨ꑴ뇀௣橄揬㩞쐬୚츠緣詤喅榍錈셼겪䟇돡ᖿ﹝禺玃ﶬ힉￑懿ےᔆ?詮︸뚒랲ᝍٱ걘ᩙ㏇⬱胕뤎칞ᣬ衊ੈ穴랭붫飡뭥걦ᩬ⺼됲ڨ㦦釣慃ﯨ謫嫜钋藉 㕺Ẳ钚铍滽譀굫຺圯Ģ᷃꿫烉밁烴ͦ뻧û錊룰훏粑᧐挡俁紃衇確暰㐟䔯᫤䄈컛圕᳏ė輹緙柢옲㈭囩엨?蚘Ꞵ既᪌ൂꊻ蟭读㚼捸ຶႪ護ￒ烻쮒檠髰䣔鮮ꥁ䮆⻐?敖ꑨ?ｔ禫礩ู㩡퟉ᔉ縠㗑撳漍譄?礚鉳媯뽥ꑛ皉怸泘韜јɢ❊粰쟳쯹꨾酗蟍፷衮▒形양乇邘䞬窪ᒱ瞿랉礻㈹϶펪꘽ፀꨔ陗饺㝮둏Ϡ??㬇麹≚︓ڠ詢ꊉ?貪鯇쳗亘쬑펰첦하㥭꼧ﰊꞙ⿕෉⮇衅◃忏ꍾ२킶凒⼅޲郯ዠꞤ㺣攉퓕沉磌ꋌ镕㲢㙏璿暗☑?鍗쨓⎬Ⓛ蚚ﴬ눦鹁Ｕ훇ᦻ⚚뷲묃蔯䀽舣랻晘".toCharArray()[354] ^ 0x2C57);
/*    */     String str;
/*    */     int i = (str = a0$cc.G("?亳猳䂩⎅䋯裏?固抧鿎䯚嶕窀椶ﴵ◕볒쐫⢙ꖬ揊旖௎ູ倃镆꽓론惼豩돭굔㋧鼡颟젔稓䜁ꃺ⛨⫸᠐⻇浓撇䦮勾䗎?觗㬬溭顡䒛뷯Ჲ鱤潠썐䗸ᤞᓂ㝢講늶﷌氱䣩⍨褸瘓檲?ẓ뼮듩ԣꏸ튢폣䂂ꆡஓ?錪ꯩ痱⨉⧝ԛ⃨逓럙考敛⟵퐨뮽㵧둁ಕ易誜댐邎䮐뽬ὼ呬ﯞ☤慼ⲥ諢吊ꁔ맍ﷹ丆䪮먁뷿눮록䫔?ꔶ䎃毎筴ᆲ㞣ﯤ悱齉腂ᜟ臏諐욝藖嵑쁄绽䕙丰?ᾤ岇眰㝓⬹ꪔ糎/㼞蘷讫␎䬾ྉ金駢ﺕ瀊泡頔裕뜌엽퀎䳓ᩮ엘躮꺈野ز蹷䣴?咜뗞淄ࣵꓷ闖᷃蔙批먚቞䋏肂솭⟧磤쨽ݲ齧?ᣖჳ鼌3尼뇕쯁䌀歴룥?惹Ⲧ뷋⩌晏픕㷊ᕭ?悬ᴑ찜⑻簢?㞵己줋旹뿊邏댠䭌챢ඞ锷䘄䏁?뢱쟼⽁踶裖虱쫚딠㴧쨨㚥鶜呉嫮䏭趐ӟⷭ簺㫔턃蟸桴ɖ௝䩱᭱뽷䙡뙎椑䯒覯捸薗颖鱇蔟閥뒋溴᧣꧳巳龵ᗚ솁弓륪㚎蚡ㄑớ୥ꘊŪ脓︕藭鉧?씻꣼䶷콰Ṩ脶㠐啂᷎呿歬ĸ蝉䒓澋᚝嗲⓹掝ꔑ₿㏹ⅱᝉ末⇿䉘쌱⺈恔౑౐谙짲۴蔳푸﹪䵆㺶ꗟ忍瑞쪝逘㏔࿦묉俩⹥⇊ᒪ㨜飾囆브᪋䕛䦆庢鎃䟱戞嗝椺᛽劇⹚䝑?␳揨ꑴ뇀௣橄揬㩞쐬୚츠緣詤喅榍錈셼겪䟇돡ᖿ﹝禺玃ﶬ힉￑懿ےᔆ?詮︸뚒랲ᝍٱ걘ᩙ㏇⬱胕뤎칞ᣬ衊ੈ穴랭붫飡뭥걦ᩬ⺼됲ڨ㦦釣慃ﯨ謫嫜钋藉 㕺Ẳ钚铍滽譀굫຺圯Ģ᷃꿫烉밁烴ͦ뻧û錊룰훏粑᧐挡俁紃衇確暰㐟䔯᫤䄈컛圕᳏ė輹緙柢옲㈭囩엨?蚘Ꞵ既᪌ൂꊻ蟭读㚼捸ຶႪ護ￒ烻쮒檠髰䣔鮮ꥁ䮆⻐?敖ꑨ?ｔ禫礩ู㩡퟉ᔉ縠㗑撳漍譄?礚鉳媯뽥ꑛ皉怸泘韜јɢ❊粰쟳쯹꨾酗蟍፷衮▒形양乇邘䞬窪ᒱ瞿랉礻㈹϶펪꘽ፀꨔ陗饺㝮둏Ϡ??㬇麹≚︓ڠ詢ꊉ?貪鯇쳗亘쬑펰첦하㥭꼧ﰊꞙ⿕෉⮇衅◃忏ꍾ२킶凒⼅޲郯ዠꞤ㺣攉퓕沉磌ꋌ镕㲢㙏璿暗☑?鍗쨓⎬Ⓛ蚚ﴬ눦鹁Ｕ훇ᦻ⚚뷲묃蔯䀽舣랻晘".toCharArray(), (short)26287, true, (byte)5)).length();
/*    */     byte b2 = 16;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Throwable a(Throwable paramThrowable) {
/*    */     return paramThrowable;
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
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x26B0;
/*    */     if (m[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])n.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "샣Ҟ萇沦ꡏꒄ⩟䝙?㘎磣◁鏚밉゜ᑧॄ끛՝貜䋭".toCharArray()[17] = (char)("샣Ҟ萇沦ꡏꒄ⩟䝙?㘎磣◁鏚밉゜ᑧॄ끛՝貜䋭".toCharArray()[17] ^ 0x62F1);
/*    */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("샣Ҟ萇沦ꡏꒄ⩟䝙?㘎磣◁鏚밉゜ᑧॄ끛՝貜䋭".toCharArray(), (short)28089, true, false));
/*    */           "羕??⟜".toCharArray()[2] = (char)("羕??⟜".toCharArray()[2] ^ 0x55FF);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("羕??⟜".toCharArray(), (short)27303, true, true));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           n.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "︽പޣԳ᠈❀헲쮶齹珢喨밋蚵ጲ䯉拠".toCharArray()[15] = (char)("︽പޣԳ᠈❀헲쮶齹珢喨밋蚵ጲ䯉拠".toCharArray()[15] ^ 0x7D0F);
/*    */         throw new RuntimeException(da$gx.U("︽പޣԳ᠈❀헲쮶齹珢喨밋蚵ጲ䯉拠".toCharArray(), (short)16899, false, true), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "✚冓孡䂧ઞ쑬旳镯坲똋㿅".toCharArray()[5] = (char)("✚冓孡䂧ઞ쑬旳镯坲똋㿅".toCharArray()[5] ^ 0x4274);
/*    */       byte[] arrayOfByte2 = l[i].getBytes(da$gx.U("✚冓孡䂧ઞ쑬旳镯坲똋㿅".toCharArray(), (short)528, false, false));
/*    */       m[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return m[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '䶞⨰壟籏寔繰诼㹙의䄎ꓝꎶ濷뿴ⷷ㼋藧㍓'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #13
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #26935
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #6969
/*    */     //   87: iconst_1
/*    */     //   88: iconst_5
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w 'ꖣ넗力㆚'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #18671
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #17245
/*    */     //   115: iconst_1
/*    */     //   116: iconst_2
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '棳헓쯗㋌'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_1
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #14088
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #9272
/*    */     //   147: iconst_0
/*    */     //   148: iconst_5
/*    */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */