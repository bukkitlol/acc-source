/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.entity.Entity;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cs
/*    */   implements mJ
/*    */ {
/*    */   private final MethodHandle d;
/*    */   private final Object c;
/*    */   private final MethodHandle g;
/*    */   private final MethodHandle k;
/*    */   private final MethodHandle f;
/*    */   private final MethodHandle j;
/*    */   private final MethodHandle b;
/*    */   private final MethodHandle i;
/*    */   private final MethodHandle e;
/*    */   
/*    */   public Collection a(Player paramPlayer) {
/* 40 */     return Arrays.asList(new ItemStack[] { paramPlayer.getInventory().getItemInMainHand(), paramPlayer.getInventory().getItemInOffHand() });
/*    */   }
/*    */   private final MethodHandle a;
/*    */   private final MethodHandle h; private static final long l = nc.a(847696584797732840L, -2154942088673907160L, MethodHandles.lookup().lookupClass()).a(57204417855206L); private static final String[] m; private static final String[] n; private static final Map o = new HashMap<>(13); public cs(long paramLong, kP paramkP) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cs.l : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 98026953618238
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 97664625387021
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 20581336758659
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #32
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: dup2
/*    */     //   34: bipush #32
/*    */     //   36: lshl
/*    */     //   37: bipush #56
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #9
/*    */     //   43: dup2
/*    */     //   44: bipush #40
/*    */     //   46: lshl
/*    */     //   47: bipush #40
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: istore #10
/*    */     //   53: pop2
/*    */     //   54: pop2
/*    */     //   55: aload_0
/*    */     //   56: invokespecial <init> : ()V
/*    */     //   59: aload_3
/*    */     //   60: getstatic me/konsolas/aac/kP.V1_11 : Lme/konsolas/aac/kP;
/*    */     //   63: if_acmpeq -> 121
/*    */     //   66: aload_3
/*    */     //   67: getstatic me/konsolas/aac/kP.V1_12 : Lme/konsolas/aac/kP;
/*    */     //   70: if_acmpeq -> 121
/*    */     //   73: new java/lang/IllegalArgumentException
/*    */     //   76: dup
/*    */     //   77: new java/lang/StringBuilder
/*    */     //   80: dup
/*    */     //   81: invokespecial <init> : ()V
/*    */     //   84: sipush #21501
/*    */     //   87: ldc2_w 1516680290991232376
/*    */     //   90: lload_1
/*    */     //   91: lxor
/*    */     //   92: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   100: aload_3
/*    */     //   101: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   104: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   110: athrow
/*    */     //   111: ldc2_w -4113102923159649044
/*    */     //   114: lload_1
/*    */     //   115: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   120: athrow
/*    */     //   121: invokestatic getServer : ()Lorg/bukkit/Server;
/*    */     //   124: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   127: invokevirtual getPackage : ()Ljava/lang/Package;
/*    */     //   130: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   133: astore #11
/*    */     //   135: aload #11
/*    */     //   137: sipush #3540
/*    */     //   140: ldc2_w 3463261487262141256
/*    */     //   143: lload_1
/*    */     //   144: lxor
/*    */     //   145: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   150: sipush #26675
/*    */     //   153: ldc2_w 118533429030743715
/*    */     //   156: lload_1
/*    */     //   157: lxor
/*    */     //   158: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   163: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   166: astore #12
/*    */     //   168: new java/lang/StringBuilder
/*    */     //   171: dup
/*    */     //   172: invokespecial <init> : ()V
/*    */     //   175: aload #11
/*    */     //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   180: sipush #22160
/*    */     //   183: ldc2_w 6988586744854269970
/*    */     //   186: lload_1
/*    */     //   187: lxor
/*    */     //   188: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   196: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   199: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   202: astore #13
/*    */     //   204: new java/lang/StringBuilder
/*    */     //   207: dup
/*    */     //   208: invokespecial <init> : ()V
/*    */     //   211: aload #11
/*    */     //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   216: sipush #26450
/*    */     //   219: ldc2_w 1024081923672138207
/*    */     //   222: lload_1
/*    */     //   223: lxor
/*    */     //   224: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   232: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   235: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   238: astore #14
/*    */     //   240: new java/lang/StringBuilder
/*    */     //   243: dup
/*    */     //   244: invokespecial <init> : ()V
/*    */     //   247: aload #11
/*    */     //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   252: sipush #11055
/*    */     //   255: ldc2_w 6373487098465299887
/*    */     //   258: lload_1
/*    */     //   259: lxor
/*    */     //   260: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   268: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   271: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   274: astore #15
/*    */     //   276: new java/lang/StringBuilder
/*    */     //   279: dup
/*    */     //   280: invokespecial <init> : ()V
/*    */     //   283: aload #12
/*    */     //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   288: sipush #5261
/*    */     //   291: ldc2_w 5026102539623895572
/*    */     //   294: lload_1
/*    */     //   295: lxor
/*    */     //   296: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   304: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   307: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   310: astore #16
/*    */     //   312: new java/lang/StringBuilder
/*    */     //   315: dup
/*    */     //   316: invokespecial <init> : ()V
/*    */     //   319: aload #12
/*    */     //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   324: sipush #6357
/*    */     //   327: ldc2_w 6521395853276192350
/*    */     //   330: lload_1
/*    */     //   331: lxor
/*    */     //   332: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   340: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   343: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   346: astore #17
/*    */     //   348: new java/lang/StringBuilder
/*    */     //   351: dup
/*    */     //   352: invokespecial <init> : ()V
/*    */     //   355: aload #12
/*    */     //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   360: sipush #21268
/*    */     //   363: ldc2_w 8042166959391430030
/*    */     //   366: lload_1
/*    */     //   367: lxor
/*    */     //   368: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   376: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   379: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   382: astore #18
/*    */     //   384: new java/lang/StringBuilder
/*    */     //   387: dup
/*    */     //   388: invokespecial <init> : ()V
/*    */     //   391: aload #12
/*    */     //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   396: sipush #956
/*    */     //   399: ldc2_w 5789474570027599152
/*    */     //   402: lload_1
/*    */     //   403: lxor
/*    */     //   404: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   412: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   415: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   418: astore #19
/*    */     //   420: new java/lang/StringBuilder
/*    */     //   423: dup
/*    */     //   424: invokespecial <init> : ()V
/*    */     //   427: aload #12
/*    */     //   429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   432: sipush #12426
/*    */     //   435: ldc2_w 4746895908931941897
/*    */     //   438: lload_1
/*    */     //   439: lxor
/*    */     //   440: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   448: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   451: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   454: astore #20
/*    */     //   456: new java/lang/StringBuilder
/*    */     //   459: dup
/*    */     //   460: invokespecial <init> : ()V
/*    */     //   463: aload #12
/*    */     //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   468: sipush #20538
/*    */     //   471: ldc2_w 6259683042207979169
/*    */     //   474: lload_1
/*    */     //   475: lxor
/*    */     //   476: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   484: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   487: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   490: astore #21
/*    */     //   492: new java/lang/StringBuilder
/*    */     //   495: dup
/*    */     //   496: invokespecial <init> : ()V
/*    */     //   499: aload #12
/*    */     //   501: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   504: sipush #24061
/*    */     //   507: ldc2_w 6622943561778125676
/*    */     //   510: lload_1
/*    */     //   511: lxor
/*    */     //   512: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   517: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   520: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   523: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   526: astore #22
/*    */     //   528: aload_0
/*    */     //   529: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   532: aload #18
/*    */     //   534: invokevirtual getSuperclass : ()Ljava/lang/Class;
/*    */     //   537: invokevirtual getSuperclass : ()Ljava/lang/Class;
/*    */     //   540: sipush #11751
/*    */     //   543: ldc2_w 6745731525961493357
/*    */     //   546: lload_1
/*    */     //   547: lxor
/*    */     //   548: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   553: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*    */     //   556: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   559: checkcast java/lang/reflect/Field
/*    */     //   562: invokevirtual unreflectGetter : (Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;
/*    */     //   565: putfield d : Ljava/lang/invoke/MethodHandle;
/*    */     //   568: aload_0
/*    */     //   569: aload #19
/*    */     //   571: ldc '失⏔'
/*    */     //   573: invokevirtual toCharArray : ()[C
/*    */     //   576: dup
/*    */     //   577: dup
/*    */     //   578: iconst_0
/*    */     //   579: dup_x1
/*    */     //   580: caload
/*    */     //   581: sipush #27047
/*    */     //   584: ixor
/*    */     //   585: i2c
/*    */     //   586: castore
/*    */     //   587: sipush #21384
/*    */     //   590: iconst_0
/*    */     //   591: iconst_5
/*    */     //   592: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   595: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*    */     //   598: aconst_null
/*    */     //   599: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   602: putfield c : Ljava/lang/Object;
/*    */     //   605: aload_0
/*    */     //   606: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   609: aload #15
/*    */     //   611: sipush #4849
/*    */     //   614: ldc2_w 9028520721537668207
/*    */     //   617: lload_1
/*    */     //   618: lxor
/*    */     //   619: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   624: iconst_1
/*    */     //   625: anewarray java/lang/Class
/*    */     //   628: dup
/*    */     //   629: iconst_0
/*    */     //   630: aload #19
/*    */     //   632: aastore
/*    */     //   633: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   636: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   639: checkcast java/lang/reflect/Method
/*    */     //   642: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   645: putfield g : Ljava/lang/invoke/MethodHandle;
/*    */     //   648: aload_0
/*    */     //   649: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   652: lload #6
/*    */     //   654: invokestatic g : (J)Ljava/lang/Class;
/*    */     //   657: sipush #4901
/*    */     //   660: ldc2_w 9106790121243973050
/*    */     //   663: lload_1
/*    */     //   664: lxor
/*    */     //   665: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   670: iconst_0
/*    */     //   671: anewarray java/lang/Class
/*    */     //   674: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   677: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   680: checkcast java/lang/reflect/Method
/*    */     //   683: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   686: putfield k : Ljava/lang/invoke/MethodHandle;
/*    */     //   689: aload_0
/*    */     //   690: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   693: iload #8
/*    */     //   695: iload #9
/*    */     //   697: i2b
/*    */     //   698: iload #10
/*    */     //   700: invokestatic p : (IBI)Ljava/lang/Class;
/*    */     //   703: sipush #11938
/*    */     //   706: ldc2_w 5109828083831875627
/*    */     //   709: lload_1
/*    */     //   710: lxor
/*    */     //   711: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   716: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*    */     //   719: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   722: checkcast java/lang/reflect/Field
/*    */     //   725: invokevirtual unreflectGetter : (Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;
/*    */     //   728: putfield f : Ljava/lang/invoke/MethodHandle;
/*    */     //   731: aload_0
/*    */     //   732: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   735: aload #13
/*    */     //   737: sipush #811
/*    */     //   740: ldc2_w 4707220934619268525
/*    */     //   743: lload_1
/*    */     //   744: lxor
/*    */     //   745: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   750: iconst_0
/*    */     //   751: anewarray java/lang/Class
/*    */     //   754: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   757: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   760: putfield j : Ljava/lang/invoke/MethodHandle;
/*    */     //   763: aload_0
/*    */     //   764: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   767: aload #14
/*    */     //   769: sipush #8566
/*    */     //   772: ldc2_w 271981021188204530
/*    */     //   775: lload_1
/*    */     //   776: lxor
/*    */     //   777: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   782: iconst_0
/*    */     //   783: anewarray java/lang/Class
/*    */     //   786: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   789: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   792: putfield b : Ljava/lang/invoke/MethodHandle;
/*    */     //   795: aload_0
/*    */     //   796: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   799: lload #4
/*    */     //   801: invokestatic d : (J)Ljava/lang/Class;
/*    */     //   804: sipush #31433
/*    */     //   807: ldc2_w 77764564616543304
/*    */     //   810: lload_1
/*    */     //   811: lxor
/*    */     //   812: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   817: iconst_0
/*    */     //   818: anewarray java/lang/Class
/*    */     //   821: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   824: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   827: checkcast java/lang/reflect/Method
/*    */     //   830: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   833: putfield i : Ljava/lang/invoke/MethodHandle;
/*    */     //   836: aload_0
/*    */     //   837: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   840: aload #21
/*    */     //   842: iconst_3
/*    */     //   843: anewarray java/lang/Class
/*    */     //   846: dup
/*    */     //   847: iconst_0
/*    */     //   848: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   851: aastore
/*    */     //   852: dup
/*    */     //   853: iconst_1
/*    */     //   854: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   857: aastore
/*    */     //   858: dup
/*    */     //   859: iconst_2
/*    */     //   860: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   863: aastore
/*    */     //   864: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/*    */     //   867: invokevirtual unreflectConstructor : (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
/*    */     //   870: putfield e : Ljava/lang/invoke/MethodHandle;
/*    */     //   873: aload_0
/*    */     //   874: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   877: aload #16
/*    */     //   879: sipush #9455
/*    */     //   882: ldc2_w 5408703575964000887
/*    */     //   885: lload_1
/*    */     //   886: lxor
/*    */     //   887: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   892: iconst_1
/*    */     //   893: anewarray java/lang/Class
/*    */     //   896: dup
/*    */     //   897: iconst_0
/*    */     //   898: aload #21
/*    */     //   900: aastore
/*    */     //   901: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   904: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   907: checkcast java/lang/reflect/Method
/*    */     //   910: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   913: putfield a : Ljava/lang/invoke/MethodHandle;
/*    */     //   916: aload_0
/*    */     //   917: getstatic me/konsolas/aac/x.a : Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   920: aload #22
/*    */     //   922: ldc_w 'ᵬ▊'
/*    */     //   925: invokevirtual toCharArray : ()[C
/*    */     //   928: dup
/*    */     //   929: dup
/*    */     //   930: iconst_0
/*    */     //   931: dup_x1
/*    */     //   932: caload
/*    */     //   933: sipush #30841
/*    */     //   936: ixor
/*    */     //   937: i2c
/*    */     //   938: castore
/*    */     //   939: sipush #10936
/*    */     //   942: iconst_1
/*    */     //   943: iconst_5
/*    */     //   944: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   947: bipush #6
/*    */     //   949: anewarray java/lang/Class
/*    */     //   952: dup
/*    */     //   953: iconst_0
/*    */     //   954: aload #16
/*    */     //   956: aastore
/*    */     //   957: dup
/*    */     //   958: iconst_1
/*    */     //   959: aload #21
/*    */     //   961: aastore
/*    */     //   962: dup
/*    */     //   963: iconst_2
/*    */     //   964: aload #20
/*    */     //   966: aastore
/*    */     //   967: dup
/*    */     //   968: iconst_3
/*    */     //   969: ldc_w java/util/List
/*    */     //   972: aastore
/*    */     //   973: dup
/*    */     //   974: iconst_4
/*    */     //   975: aload #17
/*    */     //   977: aastore
/*    */     //   978: dup
/*    */     //   979: iconst_5
/*    */     //   980: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
/*    */     //   983: aastore
/*    */     //   984: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   987: invokestatic a : (Ljava/lang/reflect/AccessibleObject;)Ljava/lang/reflect/AccessibleObject;
/*    */     //   990: checkcast java/lang/reflect/Method
/*    */     //   993: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
/*    */     //   996: putfield h : Ljava/lang/invoke/MethodHandle;
/*    */     //   999: goto -> 1027
/*    */     //   1002: astore #11
/*    */     //   1004: new java/lang/RuntimeException
/*    */     //   1007: dup
/*    */     //   1008: sipush #30896
/*    */     //   1011: ldc2_w 6114016283705048638
/*    */     //   1014: lload_1
/*    */     //   1015: lxor
/*    */     //   1016: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   1021: aload #11
/*    */     //   1023: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   1026: athrow
/*    */     //   1027: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 55
/*    */     //   #13	-> 59
/*    */     //   #39	-> 73
/*    */     //   #10	-> 121
/*    */     //   #43	-> 135
/*    */     //   #28	-> 168
/*    */     //   #47	-> 204
/*    */     //   #1	-> 240
/*    */     //   #9	-> 276
/*    */     //   #30	-> 312
/*    */     //   #16	-> 348
/*    */     //   #19	-> 384
/*    */     //   #36	-> 420
/*    */     //   #62	-> 456
/*    */     //   #27	-> 492
/*    */     //   #53	-> 528
/*    */     //   #12	-> 553
/*    */     //   #31	-> 556
/*    */     //   #15	-> 568
/*    */     //   #8	-> 605
/*    */     //   #55	-> 648
/*    */     //   #6	-> 689
/*    */     //   #18	-> 731
/*    */     //   #49	-> 763
/*    */     //   #42	-> 795
/*    */     //   #11	-> 836
/*    */     //   #22	-> 873
/*    */     //   #5	-> 916
/*    */     //   #57	-> 984
/*    */     //   #32	-> 987
/*    */     //   #38	-> 999
/*    */     //   #21	-> 1002
/*    */     //   #23	-> 1004
/*    */     //   #45	-> 1027
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   66	111	111	java/lang/IllegalAccessException
/*    */     //   121	999	1002	java/lang/IllegalAccessException
/*    */     //   121	999	1002	java/lang/NoSuchMethodException
/*    */     //   121	999	1002	java/lang/NoSuchFieldException
/*    */     //   121	999	1002	java/lang/ClassNotFoundException } public List a(Block paramBlock, char paramChar, long paramLong, Entity paramEntity) { // Byte code:
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
/*    */     //   45: getfield b : Ljava/lang/invoke/MethodHandle;
/*    */     //   48: aload_1
/*    */     //   49: invokeinterface getWorld : ()Lorg/bukkit/World;
/*    */     //   54: invokevirtual invoke : (Lorg/bukkit/World;)Ljava/lang/Object;
/*    */     //   57: astore #13
/*    */     //   59: aload_0
/*    */     //   60: getfield e : Ljava/lang/invoke/MethodHandle;
/*    */     //   63: aload_1
/*    */     //   64: invokeinterface getX : ()I
/*    */     //   69: aload_1
/*    */     //   70: invokeinterface getY : ()I
/*    */     //   75: aload_1
/*    */     //   76: invokeinterface getZ : ()I
/*    */     //   81: invokevirtual invoke : (III)Ljava/lang/Object;
/*    */     //   84: astore #14
/*    */     //   86: aload_1
/*    */     //   87: invokeinterface getX : ()I
/*    */     //   92: i2d
/*    */     //   93: aload_1
/*    */     //   94: invokeinterface getY : ()I
/*    */     //   99: i2d
/*    */     //   100: lload #8
/*    */     //   102: dup2_x2
/*    */     //   103: pop2
/*    */     //   104: aload_1
/*    */     //   105: invokeinterface getZ : ()I
/*    */     //   110: i2d
/*    */     //   111: aload_1
/*    */     //   112: invokeinterface getX : ()I
/*    */     //   117: i2d
/*    */     //   118: dconst_1
/*    */     //   119: dadd
/*    */     //   120: aload_1
/*    */     //   121: invokeinterface getY : ()I
/*    */     //   126: i2d
/*    */     //   127: dconst_1
/*    */     //   128: dadd
/*    */     //   129: aload_1
/*    */     //   130: invokeinterface getZ : ()I
/*    */     //   135: i2d
/*    */     //   136: dconst_1
/*    */     //   137: dadd
/*    */     //   138: invokestatic a : (DJDDDDD)Ljava/lang/Object;
/*    */     //   141: astore #15
/*    */     //   143: new java/util/ArrayList
/*    */     //   146: dup
/*    */     //   147: invokespecial <init> : ()V
/*    */     //   150: astore #16
/*    */     //   152: aload_0
/*    */     //   153: getfield h : Ljava/lang/invoke/MethodHandle;
/*    */     //   156: aload_0
/*    */     //   157: getfield a : Ljava/lang/invoke/MethodHandle;
/*    */     //   160: aload #13
/*    */     //   162: aload #14
/*    */     //   164: invokevirtual invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   167: aload #13
/*    */     //   169: aload #14
/*    */     //   171: aload #15
/*    */     //   173: aload #16
/*    */     //   175: aload_0
/*    */     //   176: getfield j : Ljava/lang/invoke/MethodHandle;
/*    */     //   179: aload #5
/*    */     //   181: invokevirtual invoke : (Lorg/bukkit/entity/Entity;)Ljava/lang/Object;
/*    */     //   184: iconst_0
/*    */     //   185: invokevirtual invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Z)V
/*    */     //   188: new java/util/ArrayList
/*    */     //   191: dup
/*    */     //   192: aload #16
/*    */     //   194: invokeinterface size : ()I
/*    */     //   199: invokespecial <init> : (I)V
/*    */     //   202: astore #17
/*    */     //   204: aload #16
/*    */     //   206: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   211: astore #18
/*    */     //   213: aload #18
/*    */     //   215: invokeinterface hasNext : ()Z
/*    */     //   220: ifeq -> 307
/*    */     //   223: aload #18
/*    */     //   225: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   230: astore #19
/*    */     //   232: aload #17
/*    */     //   234: aload #12
/*    */     //   236: lload_3
/*    */     //   237: lconst_0
/*    */     //   238: lcmp
/*    */     //   239: ifle -> 319
/*    */     //   242: ifnull -> 309
/*    */     //   245: aload #19
/*    */     //   247: aload_1
/*    */     //   248: invokeinterface getX : ()I
/*    */     //   253: ineg
/*    */     //   254: i2d
/*    */     //   255: lload #10
/*    */     //   257: dup2_x2
/*    */     //   258: pop2
/*    */     //   259: aload_1
/*    */     //   260: invokeinterface getY : ()I
/*    */     //   265: ineg
/*    */     //   266: i2d
/*    */     //   267: aload_1
/*    */     //   268: invokeinterface getZ : ()I
/*    */     //   273: ineg
/*    */     //   274: i2d
/*    */     //   275: invokestatic a : (Ljava/lang/Object;JDDD)Lme/konsolas/aac/lq;
/*    */     //   278: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   283: pop
/*    */     //   284: aload #12
/*    */     //   286: ifnonnull -> 213
/*    */     //   289: iload_2
/*    */     //   290: iflt -> 232
/*    */     //   293: goto -> 307
/*    */     //   296: ldc2_w -4088296185074629308
/*    */     //   299: lload #6
/*    */     //   301: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   306: athrow
/*    */     //   307: aload #17
/*    */     //   309: ldc2_w -4113147812877925816
/*    */     //   312: lload #6
/*    */     //   314: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   319: lload_3
/*    */     //   320: lconst_0
/*    */     //   321: lcmp
/*    */     //   322: iflt -> 332
/*    */     //   325: ifnull -> 356
/*    */     //   328: iconst_1
/*    */     //   329: anewarray me/konsolas/aac/aN
/*    */     //   332: ldc2_w -4073257441382455537
/*    */     //   335: lload #6
/*    */     //   337: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   342: goto -> 356
/*    */     //   345: ldc2_w -4088296185074629308
/*    */     //   348: lload #6
/*    */     //   350: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   355: athrow
/*    */     //   356: areturn
/*    */     //   357: astore #13
/*    */     //   359: new java/lang/RuntimeException
/*    */     //   362: dup
/*    */     //   363: sipush #1753
/*    */     //   366: ldc2_w 2517337537307279865
/*    */     //   369: lload #6
/*    */     //   371: lxor
/*    */     //   372: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   377: aload #13
/*    */     //   379: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   382: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 44
/*    */     //   #61	-> 59
/*    */     //   #3	-> 86
/*    */     //   #26	-> 112
/*    */     //   #24	-> 138
/*    */     //   #35	-> 143
/*    */     //   #17	-> 152
/*    */     //   #41	-> 181
/*    */     //   #7	-> 185
/*    */     //   #25	-> 188
/*    */     //   #59	-> 204
/*    */     //   #33	-> 307
/*    */     //   #54	-> 357
/*    */     //   #58	-> 359
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   44	309	357	java/lang/Throwable
/*    */     //   232	289	296	java/lang/Throwable
/*    */     //   309	342	345	java/lang/Throwable } public ItemStack a(Player paramPlayer, long paramLong) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield d : Ljava/lang/invoke/MethodHandle;
/*    */     //   4: aload_0
/*    */     //   5: getfield j : Ljava/lang/invoke/MethodHandle;
/*    */     //   8: aload_1
/*    */     //   9: invokevirtual invoke : (Lorg/bukkit/entity/Player;)Ljava/lang/Object;
/*    */     //   12: invokevirtual invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   15: astore #4
/*    */     //   17: aload #4
/*    */     //   19: aload_0
/*    */     //   20: getfield c : Ljava/lang/Object;
/*    */     //   23: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 43
/*    */     //   29: aconst_null
/*    */     //   30: goto -> 52
/*    */     //   33: ldc2_w 7180475411692216737
/*    */     //   36: lload_2
/*    */     //   37: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   42: athrow
/*    */     //   43: aload_0
/*    */     //   44: getfield g : Ljava/lang/invoke/MethodHandle;
/*    */     //   47: aload #4
/*    */     //   49: invokevirtual invoke : (Ljava/lang/Object;)Lorg/bukkit/inventory/ItemStack;
/*    */     //   52: areturn
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: sipush #1062
/*    */     //   62: ldc2_w 5183355173497415670
/*    */     //   65: lload_2
/*    */     //   66: lxor
/*    */     //   67: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   72: aload #4
/*    */     //   74: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   77: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #63	-> 17
/*    */     //   #4	-> 53
/*    */     //   #2	-> 55
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	52	53	java/lang/Throwable
/*    */     //   17	33	33	java/lang/Throwable } public float a(short paramShort1, Player paramPlayer, Block paramBlock, short paramShort2, int paramInt) {
/* 44 */     long l = paramShort1 << 48L | paramShort2 << 48L >>> 16L | paramInt << 32L >>> 32L; int i = (int)((l ^ 0x18425AE8BFB6L) >>> 32L), j = (int)((l ^ 0x18425AE8BFB6L) << 32L >>> 48L), k = (int)((l ^ 0x18425AE8BFB6L) << 48L >>> 48L); l ^ 0x18425AE8BFB6L; return g4.a(i, paramBlock, (char)j, paramPlayer, (short)k);
/*    */   } public lq a(Entity paramEntity, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 137378456965913
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: pop2
/*    */     //   9: aload_0
/*    */     //   10: getfield i : Ljava/lang/invoke/MethodHandle;
/*    */     //   13: aload_0
/*    */     //   14: getfield j : Ljava/lang/invoke/MethodHandle;
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
/*    */     //   40: sipush #15909
/*    */     //   43: ldc2_w 8975739331221677018
/*    */     //   46: lload_2
/*    */     //   47: lxor
/*    */     //   48: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   53: aload #6
/*    */     //   55: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   58: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #46	-> 9
/*    */     //   #29	-> 26
/*    */     //   #60	-> 34
/*    */     //   #50	-> 36
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	33	34	java/lang/Throwable
/*    */   } public d7 a(Entity paramEntity, Vector paramVector1, long paramLong, Vector paramVector2, double paramDouble) {
/* 48 */     long l = paramLong ^ 0x6B5E3364487DL; return a6.a(paramEntity, l, paramVector1, paramVector2, paramDouble);
/*    */   }
/*    */   public boolean a(Player paramPlayer) {
/* 51 */     return paramPlayer.isGliding();
/*    */   }
/*    */   
/*    */   public float a(long paramLong, Block paramBlock) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield f : Ljava/lang/invoke/MethodHandle;
/*    */     //   4: aload_0
/*    */     //   5: getfield k : Ljava/lang/invoke/MethodHandle;
/*    */     //   8: aload_3
/*    */     //   9: invokevirtual invoke : (Lorg/bukkit/block/Block;)Ljava/lang/Object;
/*    */     //   12: invokevirtual invoke : (Ljava/lang/Object;)F
/*    */     //   15: freturn
/*    */     //   16: astore #4
/*    */     //   18: new java/lang/RuntimeException
/*    */     //   21: dup
/*    */     //   22: sipush #5419
/*    */     //   25: ldc2_w 254416845362706312
/*    */     //   28: lload_1
/*    */     //   29: lxor
/*    */     //   30: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   35: aload #4
/*    */     //   37: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   40: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     //   #37	-> 16
/*    */     //   #52	-> 18
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	15	16	java/lang/Throwable
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = l ^ 0x67FCAAFFBCC1L;
/*    */     "薺槣儭廾咄頻賒蘀뻣ᖐ␏仱슕㑈룣䥫춦ᔹ".toCharArray()[10] = (char)("薺槣儭廾咄頻賒蘀뻣ᖐ␏仱슕㑈룣䥫춦ᔹ".toCharArray()[10] ^ 0x6260);
/*    */     "䀼賓䡇".toCharArray()[1] = (char)("䀼賓䡇".toCharArray()[1] ^ 0x6141);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("薺槣儭廾咄頻賒蘀뻣ᖐ␏仱슕㑈룣䥫춦ᔹ".toCharArray(), (short)19947, (byte)4, (byte)5))).init(2, SecretKeyFactory.getInstance(hY$g6.H("䀼賓䡇".toCharArray(), (short)22483, (byte)0, (byte)3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[26];
/*    */     boolean bool = false;
/*    */     "와᙭⑪ာ紫뀇쥹厝✅혚鯀㬗ث䡢쥅優凔琍祑䕹⎫࣫㥟絯ڦൺ깴쏶凞謷뚾賐戄椹ꁻ㄁ளﻓ㧯䞲窡㐡闸唐닝鱆츝깴춦ᰖ?㳺ই꺚䷕嚰ꗐᗨ⸊陓톂襷蟊漫쵦얓﵀唞ℎ䃦핬奨監|㔐뚋╦釯ﺒ塯㑷?ȁꃊ챦ꠘ칽ꓽ?潳앬퓩Ꝭㄼ䬹ߋ빧鵖麤볎罋퀧⭠ﱂ䯍䋄锿ᴧ썧ᙡ覉섉玁珜?救닼⪤凣얠儀ꢷ馛療둉똞鰛粷栗䨤檕聸䨲⪧ユ堳趔꣑㿸ꞷ䐇埧裡瘴麢鬐敥?害ߠ⑝맧믜ꡠ̙솴ⷀꑒ찌⥌몶櫔୉혒⑸⁐窣툸擙㢭֓撪⭛騟ݮ鐺躣Է?캐↢⿄翤渫缼씔䈱䬂?췵㞲踷젯報ￍ죘먍蒄ꉙ픔裷脹킳?曦䔇㢴檽?㼁쵮խۋ檗줙獞툹ﲘБǖ娚⩾⻤惻卞僯␻멅羌⍮ᬩ꫈ꮷ頴璞蔸ぶ橇枺㮜护৾癏繛뭩䷘郀㧴ߨ엦䧵蝭芬莖綝䌲㭡꿸횰验拔??䳺䆿ા槕頴퍿뛙兴쁪㢸瀷㸦黀ꤴ瀁ᖿꝙ꜓㑜ᨅ蝀컈휡ꝉᇥ튴㞄ᔱ誮㽐Ⴙᗍ璏ቚ뾉쏹⩛丮ஸ勢엿栮۸荙녊鷏螮͈뮈ે鈭瀐ᣃ?ᯕ鴼俰춱뎠룷₨䠞찇쉹ᘑᶛⱒ搦ᖞ?㱊袱䟑㮛엄✵﮾눗ꟛﻊリ絈趔?蘶깊्퍯쭃〶䣝ﱆ?퇈칸芄뾳櫞癪ퟓ䪰㒒팬ജꋄߔ凄춪螘鐇쪃萋ﾫƹ뒧訙瓠値﹪윒￲헽ရ枰懄粱幝䆂⵾햎ᾐ䬴꯵䪜潯㴿䏃绬䨭⩪춬쐲?媑姁ᵖ桇벭痬엨魜᥸꽲愎੤⢙ꝥ誮곬Å䰜ﴋ罈⩊ᨠ팥㿌䁛评砇䲋ᚎ帛婺朙㌴Ⅵᝀ኎瑳莠鵈痷㔭⛽㘗⊆뇁닆ꝍḷ햐娖哚ᡏᵶ醋ᄟ곢䋾跿泷ͳ汨팷㣉⦍⯹芺脄軺⹤価鍙雘鷭畃?ᶇ佣잯驤Ꜽ떘ꐎ粎Ꙇ䖬㫥닁᧬?ઁ藎濝륫缥괋瓞栽粒㎎쇏褄㤆州쿂ᒸ?ꕈ䔁ᜲ⾌匁๾ꔩ솴猘にퟻ䅖맣跈완貐╍⣼↑삆?ﭝ캙䪟Ᲊ⤾ಊ㪳䭀斧雋컆㞡뛺欖런﫷ꅠ뎤訴ࡆ?鑶髤঄곐ꥊ꿼豝࿹๭⌰띄⍉児窣썩푍ᖡ邏ꚤ〉뻷ː䫢짣ᏯꟌ鿲냅䣥夙疺緑?埱堘઺勍貈䛇煺Ⴈ乸찾ﯶ챈듬벘♌Ꜯ⚀⎩ꩃ?缕䴒㎛㌒趖葌⢽ᢪ㼵ⶡ㡪ۘ亇Ĺ⛹䞋항屍껟▝ࡸ?䟿噇ꢷ๮꤂년싉俶㱌쉾â燇윥◉龷훦筙ਨ狏䏿໪䥵웦탙鮬灳⎲శꪬ爺藢㰎ꀪ䄥윓߈썾ÿꗄ㘓䭹臋?഑ඈ䣧ꨞ伺麹䆍≔蛲穓맪㊶萶?￮嵽፣娐뿣獮悃봎൉䟖苟᧋诮倉謽쑑ꁭ썩굏?䑏?僆赨あ뜉케迓誷᲍亯躖敁꬀甞ী끖槸껪셔?﹫縳᧓律➱ㅴ₾ᢨ쑣硧᧕勇㶉藾얝罎蚠褯☕囌ꕁ펥ཱིꄵ蘃「ꄺᚙꉞ䭽ዼﾏ㍺윭燮ό食?絘놿龀᦯ᤪ?ﷺ콸됞ᓿ烈꘡Ժ쾓䢫Ꝗ덛叇籋쌫ឪ趙㋆좛鐦넙儈剃폶宆徫ⷶꍘ먧乇㬑縣킻腚죫ᢟ䴄暌".toCharArray()[437] = (char)("와᙭⑪ာ紫뀇쥹厝✅혚鯀㬗ث䡢쥅優凔琍祑䕹⎫࣫㥟絯ڦൺ깴쏶凞謷뚾賐戄椹ꁻ㄁ளﻓ㧯䞲窡㐡闸唐닝鱆츝깴춦ᰖ?㳺ই꺚䷕嚰ꗐᗨ⸊陓톂襷蟊漫쵦얓﵀唞ℎ䃦핬奨監|㔐뚋╦釯ﺒ塯㑷?ȁꃊ챦ꠘ칽ꓽ?潳앬퓩Ꝭㄼ䬹ߋ빧鵖麤볎罋퀧⭠ﱂ䯍䋄锿ᴧ썧ᙡ覉섉玁珜?救닼⪤凣얠儀ꢷ馛療둉똞鰛粷栗䨤檕聸䨲⪧ユ堳趔꣑㿸ꞷ䐇埧裡瘴麢鬐敥?害ߠ⑝맧믜ꡠ̙솴ⷀꑒ찌⥌몶櫔୉혒⑸⁐窣툸擙㢭֓撪⭛騟ݮ鐺躣Է?캐↢⿄翤渫缼씔䈱䬂?췵㞲踷젯報ￍ죘먍蒄ꉙ픔裷脹킳?曦䔇㢴檽?㼁쵮խۋ檗줙獞툹ﲘБǖ娚⩾⻤惻卞僯␻멅羌⍮ᬩ꫈ꮷ頴璞蔸ぶ橇枺㮜护৾癏繛뭩䷘郀㧴ߨ엦䧵蝭芬莖綝䌲㭡꿸횰验拔??䳺䆿ા槕頴퍿뛙兴쁪㢸瀷㸦黀ꤴ瀁ᖿꝙ꜓㑜ᨅ蝀컈휡ꝉᇥ튴㞄ᔱ誮㽐Ⴙᗍ璏ቚ뾉쏹⩛丮ஸ勢엿栮۸荙녊鷏螮͈뮈ે鈭瀐ᣃ?ᯕ鴼俰춱뎠룷₨䠞찇쉹ᘑᶛⱒ搦ᖞ?㱊袱䟑㮛엄✵﮾눗ꟛﻊリ絈趔?蘶깊्퍯쭃〶䣝ﱆ?퇈칸芄뾳櫞癪ퟓ䪰㒒팬ജꋄߔ凄춪螘鐇쪃萋ﾫƹ뒧訙瓠値﹪윒￲헽ရ枰懄粱幝䆂⵾햎ᾐ䬴꯵䪜潯㴿䏃绬䨭⩪춬쐲?媑姁ᵖ桇벭痬엨魜᥸꽲愎੤⢙ꝥ誮곬Å䰜ﴋ罈⩊ᨠ팥㿌䁛评砇䲋ᚎ帛婺朙㌴Ⅵᝀ኎瑳莠鵈痷㔭⛽㘗⊆뇁닆ꝍḷ햐娖哚ᡏᵶ醋ᄟ곢䋾跿泷ͳ汨팷㣉⦍⯹芺脄軺⹤価鍙雘鷭畃?ᶇ佣잯驤Ꜽ떘ꐎ粎Ꙇ䖬㫥닁᧬?ઁ藎濝륫缥괋瓞栽粒㎎쇏褄㤆州쿂ᒸ?ꕈ䔁ᜲ⾌匁๾ꔩ솴猘にퟻ䅖맣跈완貐╍⣼↑삆?ﭝ캙䪟Ᲊ⤾ಊ㪳䭀斧雋컆㞡뛺欖런﫷ꅠ뎤訴ࡆ?鑶髤঄곐ꥊ꿼豝࿹๭⌰띄⍉児窣썩푍ᖡ邏ꚤ〉뻷ː䫢짣ᏯꟌ鿲냅䣥夙疺緑?埱堘઺勍貈䛇煺Ⴈ乸찾ﯶ챈듬벘♌Ꜯ⚀⎩ꩃ?缕䴒㎛㌒趖葌⢽ᢪ㼵ⶡ㡪ۘ亇Ĺ⛹䞋항屍껟▝ࡸ?䟿噇ꢷ๮꤂년싉俶㱌쉾â燇윥◉龷훦筙ਨ狏䏿໪䥵웦탙鮬灳⎲శꪬ爺藢㰎ꀪ䄥윓߈썾ÿꗄ㘓䭹臋?഑ඈ䣧ꨞ伺麹䆍≔蛲穓맪㊶萶?￮嵽፣娐뿣獮悃봎൉䟖苟᧋诮倉謽쑑ꁭ썩굏?䑏?僆赨あ뜉케迓誷᲍亯躖敁꬀甞ী끖槸껪셔?﹫縳᧓律➱ㅴ₾ᢨ쑣硧᧕勇㶉藾얝罎蚠褯☕囌ꕁ펥ཱིꄵ蘃「ꄺᚙꉞ䭽ዼﾏ㍺윭燮ό食?絘놿龀᦯ᤪ?ﷺ콸됞ᓿ烈꘡Ժ쾓䢫Ꝗ덛叇籋쌫ឪ趙㋆좛鐦넙儈剃폶宆徫ⷶꍘ먧乇㬑縣킻腚죫ᢟ䴄暌".toCharArray()[437] ^ 0x6247);
/*    */     String str;
/*    */     int i = (str = hY$g6.H("와᙭⑪ာ紫뀇쥹厝✅혚鯀㬗ث䡢쥅優凔琍祑䕹⎫࣫㥟絯ڦൺ깴쏶凞謷뚾賐戄椹ꁻ㄁ளﻓ㧯䞲窡㐡闸唐닝鱆츝깴춦ᰖ?㳺ই꺚䷕嚰ꗐᗨ⸊陓톂襷蟊漫쵦얓﵀唞ℎ䃦핬奨監|㔐뚋╦釯ﺒ塯㑷?ȁꃊ챦ꠘ칽ꓽ?潳앬퓩Ꝭㄼ䬹ߋ빧鵖麤볎罋퀧⭠ﱂ䯍䋄锿ᴧ썧ᙡ覉섉玁珜?救닼⪤凣얠儀ꢷ馛療둉똞鰛粷栗䨤檕聸䨲⪧ユ堳趔꣑㿸ꞷ䐇埧裡瘴麢鬐敥?害ߠ⑝맧믜ꡠ̙솴ⷀꑒ찌⥌몶櫔୉혒⑸⁐窣툸擙㢭֓撪⭛騟ݮ鐺躣Է?캐↢⿄翤渫缼씔䈱䬂?췵㞲踷젯報ￍ죘먍蒄ꉙ픔裷脹킳?曦䔇㢴檽?㼁쵮խۋ檗줙獞툹ﲘБǖ娚⩾⻤惻卞僯␻멅羌⍮ᬩ꫈ꮷ頴璞蔸ぶ橇枺㮜护৾癏繛뭩䷘郀㧴ߨ엦䧵蝭芬莖綝䌲㭡꿸횰验拔??䳺䆿ા槕頴퍿뛙兴쁪㢸瀷㸦黀ꤴ瀁ᖿꝙ꜓㑜ᨅ蝀컈휡ꝉᇥ튴㞄ᔱ誮㽐Ⴙᗍ璏ቚ뾉쏹⩛丮ஸ勢엿栮۸荙녊鷏螮͈뮈ે鈭瀐ᣃ?ᯕ鴼俰춱뎠룷₨䠞찇쉹ᘑᶛⱒ搦ᖞ?㱊袱䟑㮛엄✵﮾눗ꟛﻊリ絈趔?蘶깊्퍯쭃〶䣝ﱆ?퇈칸芄뾳櫞癪ퟓ䪰㒒팬ജꋄߔ凄춪螘鐇쪃萋ﾫƹ뒧訙瓠値﹪윒￲헽ရ枰懄粱幝䆂⵾햎ᾐ䬴꯵䪜潯㴿䏃绬䨭⩪춬쐲?媑姁ᵖ桇벭痬엨魜᥸꽲愎੤⢙ꝥ誮곬Å䰜ﴋ罈⩊ᨠ팥㿌䁛评砇䲋ᚎ帛婺朙㌴Ⅵᝀ኎瑳莠鵈痷㔭⛽㘗⊆뇁닆ꝍḷ햐娖哚ᡏᵶ醋ᄟ곢䋾跿泷ͳ汨팷㣉⦍⯹芺脄軺⹤価鍙雘鷭畃?ᶇ佣잯驤Ꜽ떘ꐎ粎Ꙇ䖬㫥닁᧬?ઁ藎濝륫缥괋瓞栽粒㎎쇏褄㤆州쿂ᒸ?ꕈ䔁ᜲ⾌匁๾ꔩ솴猘にퟻ䅖맣跈완貐╍⣼↑삆?ﭝ캙䪟Ᲊ⤾ಊ㪳䭀斧雋컆㞡뛺欖런﫷ꅠ뎤訴ࡆ?鑶髤঄곐ꥊ꿼豝࿹๭⌰띄⍉児窣썩푍ᖡ邏ꚤ〉뻷ː䫢짣ᏯꟌ鿲냅䣥夙疺緑?埱堘઺勍貈䛇煺Ⴈ乸찾ﯶ챈듬벘♌Ꜯ⚀⎩ꩃ?缕䴒㎛㌒趖葌⢽ᢪ㼵ⶡ㡪ۘ亇Ĺ⛹䞋항屍껟▝ࡸ?䟿噇ꢷ๮꤂년싉俶㱌쉾â燇윥◉龷훦筙ਨ狏䏿໪䥵웦탙鮬灳⎲శꪬ爺藢㰎ꀪ䄥윓߈썾ÿꗄ㘓䭹臋?഑ඈ䣧ꨞ伺麹䆍≔蛲穓맪㊶萶?￮嵽፣娐뿣獮悃봎൉䟖苟᧋诮倉謽쑑ꁭ썩굏?䑏?僆赨あ뜉케迓誷᲍亯躖敁꬀甞ী끖槸껪셔?﹫縳᧓律➱ㅴ₾ᢨ쑣硧᧕勇㶉藾얝罎蚠褯☕囌ꕁ펥ཱིꄵ蘃「ꄺᚙꉞ䭽ዼﾏ㍺윭燮ό食?絘놿龀᦯ᤪ?ﷺ콸됞ᓿ烈꘡Ժ쾓䢫Ꝗ덛叇籋쌫ឪ趙㋆좛鐦넙儈剃폶宆徫ⷶꍘ먧乇㬑縣킻腚죫ᢟ䴄暌".toCharArray(), (short)1945, (byte)4, (byte)0)).length();
/*    */     byte b2 = 24;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x40A1;
/*    */     if (n[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])o.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "絜旓ﹶጻ뽄쉑ﰦ꧅搙࿂滨覚磓鿥䦯䘤?㐔".toCharArray()[9] = (char)("絜旓ﹶጻ뽄쉑ﰦ꧅搙࿂滨覚磓鿥䦯䘤?㐔".toCharArray()[9] ^ 0xBBC);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("絜旓ﹶጻ뽄쉑ﰦ꧅搙࿂滨覚磓鿥䦯䘤?㐔".toCharArray(), (short)13714, true, 0));
/*    */           "䔒㆑Ό".toCharArray()[2] = (char)("䔒㆑Ό".toCharArray()[2] ^ 0xC18);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("䔒㆑Ό".toCharArray(), (short)3402, true, 3));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           o.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "䀹꣈끒賻幹㘖?⯿㮝姻ឫ㮬쫼䷅蝕ʸ㙔".toCharArray()[14] = (char)("䀹꣈끒賻幹㘖?⯿㮝姻ឫ㮬쫼䷅蝕ʸ㙔".toCharArray()[14] ^ 0x82E);
/*    */         throw new RuntimeException(fW$gy.A("䀹꣈끒賻幹㘖?⯿㮝姻ឫ㮬쫼䷅蝕ʸ㙔".toCharArray(), (short)10131, false, 0), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "䑀䎥퓥⊖睤푫浾镉읙၂㚿".toCharArray()[5] = (char)("䑀䎥퓥⊖睤푫浾镉읙၂㚿".toCharArray()[5] ^ 0x11E);
/*    */       byte[] arrayOfByte2 = m[i].getBytes(fW$gy.A("䑀䎥퓥⊖睤푫浾镉읙၂㚿".toCharArray(), (short)10324, false, 1));
/*    */       n[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return n[i];
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
/*    */     //   66: ldc_w '䁡伕槬ƽꂩ䵚ℭ밉瑇趄솂逇癈傦춖漎줄䗞'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #8
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #9401
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #9344
/*    */     //   87: iconst_0
/*    */     //   88: iconst_1
/*    */     //   89: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w 'ⶍ豿齕ต'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #22435
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #8262
/*    */     //   115: iconst_1
/*    */     //   116: iconst_2
/*    */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '콆綦ᲃ㪽'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #17239
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #16458
/*    */     //   147: iconst_0
/*    */     //   148: iconst_2
/*    */     //   149: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */