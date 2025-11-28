/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import com.google.common.cache.Cache;
/*     */ import java.lang.invoke.CallSite;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import me.konsolas.aac.api.AACCustomFeature;
/*     */ import me.konsolas.aac.api.AACCustomFeatureProvider;
/*     */ import org.bukkit.OfflinePlayer;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.plugin.messaging.PluginMessageListener;
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
/*     */ public class fv
/*     */   implements PluginMessageListener
/*     */ {
/*     */   private static final String a;
/*     */   private final ExecutorService c;
/*     */   private CompletableFuture l;
/*     */   private final AAC b;
/*     */   private final long j;
/*     */   private final int g;
/*     */   private final int k;
/*     */   private final Map i;
/*     */   private final fU f;
/*     */   private final List m;
/*     */   private final Set d;
/*     */   private final Map h;
/*     */   private final Cache e;
/*     */   private static final long n = nc.a(5482308897115703014L, 2336210355372244992L, MethodHandles.lookup().lookupClass()).a(18376394517821L);
/*     */   private static final String[] o;
/*     */   private static final String[] p;
/*     */   private static final Map q = new HashMap<>(13);
/*     */   
/*     */   public jX a(OfflinePlayer paramOfflinePlayer, short paramShort, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: lload_3
/*     */     //   6: bipush #16
/*     */     //   8: lshl
/*     */     //   9: bipush #16
/*     */     //   11: lushr
/*     */     //   12: lor
/*     */     //   13: getstatic me/konsolas/aac/fv.n : J
/*     */     //   16: lxor
/*     */     //   17: lstore #5
/*     */     //   19: ldc2_w 5958355735930442068
/*     */     //   22: lload #5
/*     */     //   24: <illegal opcode> w : (JJ)I
/*     */     //   29: istore #7
/*     */     //   31: aload_1
/*     */     //   32: iload #7
/*     */     //   34: ifne -> 104
/*     */     //   37: invokeinterface isOnline : ()Z
/*     */     //   42: ifeq -> 89
/*     */     //   45: goto -> 59
/*     */     //   48: ldc2_w 6022677319486921148
/*     */     //   51: lload #5
/*     */     //   53: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   58: athrow
/*     */     //   59: aload_0
/*     */     //   60: getfield h : Ljava/util/Map;
/*     */     //   63: aload_1
/*     */     //   64: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   69: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   74: checkcast me/konsolas/aac/jX
/*     */     //   77: areturn
/*     */     //   78: ldc2_w 6022677319486921148
/*     */     //   81: lload #5
/*     */     //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   88: athrow
/*     */     //   89: aload_0
/*     */     //   90: getfield e : Lcom/google/common/cache/Cache;
/*     */     //   93: aload_1
/*     */     //   94: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   99: invokeinterface getIfPresent : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   104: checkcast me/konsolas/aac/jX
/*     */     //   107: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 31
/*     */     //   #4	-> 59
/*     */     //   #157	-> 89
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   31	45	48	java/lang/IllegalArgumentException
/*     */     //   37	78	78	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private jX a(OfflinePlayer paramOfflinePlayer, ef paramef, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fv.n : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 115494229004067
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 12541367048245
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 6446638050397980854
/*     */     //   25: lload_3
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: invokestatic now : ()Ljava/time/Instant;
/*     */     //   34: astore #10
/*     */     //   36: aload_0
/*     */     //   37: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   40: invokevirtual a : ()Lme/konsolas/aac/jI;
/*     */     //   43: invokestatic currentTimeMillis : ()J
/*     */     //   46: aload_0
/*     */     //   47: getfield j : J
/*     */     //   50: lsub
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   57: lload #5
/*     */     //   59: dup2_x1
/*     */     //   60: pop2
/*     */     //   61: invokevirtual a : (JJLjava/util/UUID;)Ljava/util/List;
/*     */     //   64: astore #11
/*     */     //   66: istore #9
/*     */     //   68: aload #11
/*     */     //   70: iload #9
/*     */     //   72: ifeq -> 141
/*     */     //   75: invokeinterface isEmpty : ()Z
/*     */     //   80: ifeq -> 116
/*     */     //   83: goto -> 96
/*     */     //   86: ldc2_w 6445675772460061531
/*     */     //   89: lload_3
/*     */     //   90: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   95: athrow
/*     */     //   96: new java/util/ArrayList
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: lload_3
/*     */     //   104: lconst_0
/*     */     //   105: lcmp
/*     */     //   106: ifle -> 128
/*     */     //   109: astore #12
/*     */     //   111: iload #9
/*     */     //   113: ifne -> 143
/*     */     //   116: aload_0
/*     */     //   117: getfield f : Lme/konsolas/aac/fU;
/*     */     //   120: aload #11
/*     */     //   122: aload_2
/*     */     //   123: lload #7
/*     */     //   125: invokevirtual a : (Ljava/util/List;Lme/konsolas/aac/ef;J)Ljava/util/List;
/*     */     //   128: goto -> 141
/*     */     //   131: ldc2_w 6445675772460061531
/*     */     //   134: lload_3
/*     */     //   135: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   140: athrow
/*     */     //   141: astore #12
/*     */     //   143: aload_0
/*     */     //   144: getfield m : Ljava/util/List;
/*     */     //   147: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   152: astore #13
/*     */     //   154: aload #13
/*     */     //   156: invokeinterface hasNext : ()Z
/*     */     //   161: ifeq -> 277
/*     */     //   164: aload #13
/*     */     //   166: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   171: checkcast me/konsolas/aac/api/AACCustomFeatureProvider
/*     */     //   174: astore #14
/*     */     //   176: aload #14
/*     */     //   178: aload_1
/*     */     //   179: invokeinterface getFeaturesAsync : (Lorg/bukkit/OfflinePlayer;)Ljava/util/Collection;
/*     */     //   184: astore #15
/*     */     //   186: aload #15
/*     */     //   188: iload #9
/*     */     //   190: ifeq -> 230
/*     */     //   193: ifnull -> 272
/*     */     //   196: goto -> 209
/*     */     //   199: ldc2_w 6445675772460061531
/*     */     //   202: lload_3
/*     */     //   203: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   208: athrow
/*     */     //   209: aload #14
/*     */     //   211: aload_1
/*     */     //   212: invokeinterface getFeaturesAsync : (Lorg/bukkit/OfflinePlayer;)Ljava/util/Collection;
/*     */     //   217: goto -> 230
/*     */     //   220: ldc2_w 6445675772460061531
/*     */     //   223: lload_3
/*     */     //   224: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   229: athrow
/*     */     //   230: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   235: <illegal opcode> apply : ()Ljava/util/function/Function;
/*     */     //   240: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
/*     */     //   245: <illegal opcode> test : ()Ljava/util/function/Predicate;
/*     */     //   250: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
/*     */     //   255: aload #12
/*     */     //   257: dup
/*     */     //   258: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   261: pop
/*     */     //   262: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
/*     */     //   267: invokeinterface forEach : (Ljava/util/function/Consumer;)V
/*     */     //   272: iload #9
/*     */     //   274: ifne -> 154
/*     */     //   277: aload #12
/*     */     //   279: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   284: <illegal opcode> applyAsDouble : ()Ljava/util/function/ToDoubleFunction;
/*     */     //   289: invokeinterface mapToDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
/*     */     //   294: lload_3
/*     */     //   295: lconst_0
/*     */     //   296: lcmp
/*     */     //   297: ifle -> 171
/*     */     //   300: invokeinterface sum : ()D
/*     */     //   305: dstore #13
/*     */     //   307: dload #13
/*     */     //   309: aload_0
/*     */     //   310: getfield k : I
/*     */     //   313: i2d
/*     */     //   314: dcmpl
/*     */     //   315: lload_3
/*     */     //   316: lconst_0
/*     */     //   317: lcmp
/*     */     //   318: iflt -> 366
/*     */     //   321: iload #9
/*     */     //   323: ifeq -> 366
/*     */     //   326: ifle -> 358
/*     */     //   329: goto -> 342
/*     */     //   332: ldc2_w 6445675772460061531
/*     */     //   335: lload_3
/*     */     //   336: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   341: athrow
/*     */     //   342: getstatic me/konsolas/aac/e6.HIGH : Lme/konsolas/aac/e6;
/*     */     //   345: goto -> 388
/*     */     //   348: ldc2_w 6445675772460061531
/*     */     //   351: lload_3
/*     */     //   352: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   357: athrow
/*     */     //   358: dload #13
/*     */     //   360: aload_0
/*     */     //   361: getfield g : I
/*     */     //   364: i2d
/*     */     //   365: dcmpl
/*     */     //   366: ifle -> 385
/*     */     //   369: getstatic me/konsolas/aac/e6.SUSPICIOUS : Lme/konsolas/aac/e6;
/*     */     //   372: goto -> 388
/*     */     //   375: ldc2_w 6445675772460061531
/*     */     //   378: lload_3
/*     */     //   379: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   384: athrow
/*     */     //   385: getstatic me/konsolas/aac/e6.NEUTRAL : Lme/konsolas/aac/e6;
/*     */     //   388: astore #15
/*     */     //   390: new me/konsolas/aac/jX
/*     */     //   393: dup
/*     */     //   394: aload_1
/*     */     //   395: aload #15
/*     */     //   397: aload #10
/*     */     //   399: dload #13
/*     */     //   401: aload #12
/*     */     //   403: invokespecial <init> : (Lorg/bukkit/OfflinePlayer;Lme/konsolas/aac/e6;Ljava/time/Instant;DLjava/util/List;)V
/*     */     //   406: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #9	-> 31
/*     */     //   #66	-> 36
/*     */     //   #24	-> 68
/*     */     //   #133	-> 96
/*     */     //   #36	-> 116
/*     */     //   #75	-> 143
/*     */     //   #90	-> 176
/*     */     //   #115	-> 186
/*     */     //   #106	-> 209
/*     */     //   #17	-> 240
/*     */     //   #71	-> 250
/*     */     //   #153	-> 258
/*     */     //   #159	-> 272
/*     */     //   #33	-> 277
/*     */     //   #22	-> 307
/*     */     //   #58	-> 390
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   68	83	86	java/sql/SQLException
/*     */     //   111	128	131	java/sql/SQLException
/*     */     //   186	196	199	java/sql/SQLException
/*     */     //   193	217	220	java/sql/SQLException
/*     */     //   307	329	332	java/sql/SQLException
/*     */     //   326	348	348	java/sql/SQLException
/*     */     //   366	375	375	java/sql/SQLException
/*     */   }
/*     */   
/*     */   public void a(long paramLong, Player paramPlayer) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fv.n : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 5522920666648776513
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore #4
/*     */     //   17: aload_0
/*     */     //   18: getfield h : Ljava/util/Map;
/*     */     //   21: aload_3
/*     */     //   22: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   27: invokeinterface containsKey : (Ljava/lang/Object;)Z
/*     */     //   32: iload #4
/*     */     //   34: ifne -> 109
/*     */     //   37: ifeq -> 99
/*     */     //   40: goto -> 53
/*     */     //   43: ldc2_w 5584981340926363561
/*     */     //   46: lload_1
/*     */     //   47: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   52: athrow
/*     */     //   53: aload_0
/*     */     //   54: getfield e : Lcom/google/common/cache/Cache;
/*     */     //   57: aload_3
/*     */     //   58: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   63: aload_0
/*     */     //   64: getfield h : Ljava/util/Map;
/*     */     //   67: aload_3
/*     */     //   68: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   73: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   78: checkcast me/konsolas/aac/jX
/*     */     //   81: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   86: goto -> 99
/*     */     //   89: ldc2_w 5584981340926363561
/*     */     //   92: lload_1
/*     */     //   93: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   98: athrow
/*     */     //   99: aload_0
/*     */     //   100: getfield d : Ljava/util/Set;
/*     */     //   103: aload_3
/*     */     //   104: invokeinterface remove : (Ljava/lang/Object;)Z
/*     */     //   109: pop
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #15	-> 17
/*     */     //   #89	-> 53
/*     */     //   #149	-> 99
/*     */     //   #154	-> 110
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	40	43	java/lang/IllegalArgumentException
/*     */     //   37	86	89	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void onPluginMessageReceived(String paramString, Player paramPlayer, byte[] paramArrayOfbyte) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fv.n : J
/*     */     //   3: ldc2_w 39095121638860
/*     */     //   6: lxor
/*     */     //   7: lstore #4
/*     */     //   9: lload #4
/*     */     //   11: dup2
/*     */     //   12: ldc2_w 102929591052225
/*     */     //   15: lxor
/*     */     //   16: dup2
/*     */     //   17: bipush #48
/*     */     //   19: lushr
/*     */     //   20: l2i
/*     */     //   21: istore #6
/*     */     //   23: dup2
/*     */     //   24: bipush #16
/*     */     //   26: lshl
/*     */     //   27: bipush #16
/*     */     //   29: lushr
/*     */     //   30: lstore #7
/*     */     //   32: pop2
/*     */     //   33: pop2
/*     */     //   34: ldc2_w -7620627587120183297
/*     */     //   37: lload #4
/*     */     //   39: <illegal opcode> w : (JJ)I
/*     */     //   44: istore #9
/*     */     //   46: aload_1
/*     */     //   47: sipush #3862
/*     */     //   50: ldc2_w 80199660812997377
/*     */     //   53: lload #4
/*     */     //   55: lxor
/*     */     //   56: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   61: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   64: ifne -> 79
/*     */     //   67: return
/*     */     //   68: ldc2_w -7621573511801791470
/*     */     //   71: lload #4
/*     */     //   73: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   78: athrow
/*     */     //   79: aload_3
/*     */     //   80: invokestatic newDataInput : ([B)Lcom/google/common/io/ByteArrayDataInput;
/*     */     //   83: astore #10
/*     */     //   85: aload #10
/*     */     //   87: invokeinterface readUTF : ()Ljava/lang/String;
/*     */     //   92: astore #11
/*     */     //   94: aload #11
/*     */     //   96: sipush #10551
/*     */     //   99: ldc2_w 4306613922414638383
/*     */     //   102: lload #4
/*     */     //   104: lxor
/*     */     //   105: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   110: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   113: iload #9
/*     */     //   115: ifeq -> 156
/*     */     //   118: ifeq -> 514
/*     */     //   121: goto -> 135
/*     */     //   124: ldc2_w -7621573511801791470
/*     */     //   127: lload #4
/*     */     //   129: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   134: athrow
/*     */     //   135: aload #10
/*     */     //   137: invokeinterface readShort : ()S
/*     */     //   142: goto -> 156
/*     */     //   145: ldc2_w -7621573511801791470
/*     */     //   148: lload #4
/*     */     //   150: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   155: athrow
/*     */     //   156: istore #12
/*     */     //   158: iload #9
/*     */     //   160: ifeq -> 240
/*     */     //   163: iload #12
/*     */     //   165: bipush #16
/*     */     //   167: if_icmpeq -> 241
/*     */     //   170: goto -> 184
/*     */     //   173: ldc2_w -7621573511801791470
/*     */     //   176: lload #4
/*     */     //   178: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   183: athrow
/*     */     //   184: aload_0
/*     */     //   185: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   188: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   191: new java/lang/StringBuilder
/*     */     //   194: dup
/*     */     //   195: invokespecial <init> : ()V
/*     */     //   198: sipush #23347
/*     */     //   201: ldc2_w 9038715504187459380
/*     */     //   204: lload #4
/*     */     //   206: lxor
/*     */     //   207: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   215: iload #12
/*     */     //   217: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   220: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   223: invokevirtual warning : (Ljava/lang/String;)V
/*     */     //   226: goto -> 240
/*     */     //   229: ldc2_w -7621573511801791470
/*     */     //   232: lload #4
/*     */     //   234: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   239: athrow
/*     */     //   240: return
/*     */     //   241: aload #10
/*     */     //   243: invokeinterface readLong : ()J
/*     */     //   248: lstore #13
/*     */     //   250: aload #10
/*     */     //   252: invokeinterface readLong : ()J
/*     */     //   257: lstore #15
/*     */     //   259: new java/util/UUID
/*     */     //   262: dup
/*     */     //   263: lload #13
/*     */     //   265: lload #15
/*     */     //   267: invokespecial <init> : (JJ)V
/*     */     //   270: astore #17
/*     */     //   272: aload #17
/*     */     //   274: invokestatic getOfflinePlayer : (Ljava/util/UUID;)Lorg/bukkit/OfflinePlayer;
/*     */     //   277: astore #18
/*     */     //   279: iload #9
/*     */     //   281: ifeq -> 405
/*     */     //   284: aload #18
/*     */     //   286: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   291: ifnull -> 349
/*     */     //   294: goto -> 308
/*     */     //   297: ldc2_w -7621573511801791470
/*     */     //   300: lload #4
/*     */     //   302: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   307: athrow
/*     */     //   308: aload #18
/*     */     //   310: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   315: sipush #24206
/*     */     //   318: ldc2_w 7137224777823470214
/*     */     //   321: lload #4
/*     */     //   323: lxor
/*     */     //   324: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   329: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   332: ifeq -> 406
/*     */     //   335: goto -> 349
/*     */     //   338: ldc2_w -7621573511801791470
/*     */     //   341: lload #4
/*     */     //   343: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   348: athrow
/*     */     //   349: aload_0
/*     */     //   350: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   353: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   356: new java/lang/StringBuilder
/*     */     //   359: dup
/*     */     //   360: invokespecial <init> : ()V
/*     */     //   363: sipush #1171
/*     */     //   366: ldc2_w 2623262541150230685
/*     */     //   369: lload #4
/*     */     //   371: lxor
/*     */     //   372: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   380: aload #17
/*     */     //   382: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   385: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   388: invokevirtual warning : (Ljava/lang/String;)V
/*     */     //   391: goto -> 405
/*     */     //   394: ldc2_w -7621573511801791470
/*     */     //   397: lload #4
/*     */     //   399: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   404: athrow
/*     */     //   405: return
/*     */     //   406: aload_0
/*     */     //   407: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   410: invokevirtual a : ()Lme/konsolas/aac/fv;
/*     */     //   413: aload #18
/*     */     //   415: iload #6
/*     */     //   417: i2s
/*     */     //   418: lload #7
/*     */     //   420: invokevirtual a : (Lorg/bukkit/OfflinePlayer;SJ)Lme/konsolas/aac/jX;
/*     */     //   423: iload #9
/*     */     //   425: ifeq -> 495
/*     */     //   428: ifnonnull -> 464
/*     */     //   431: goto -> 445
/*     */     //   434: ldc2_w -7621573511801791470
/*     */     //   437: lload #4
/*     */     //   439: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   444: athrow
/*     */     //   445: aload_0
/*     */     //   446: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   449: invokevirtual a : ()Lme/konsolas/aac/fv;
/*     */     //   452: aload #18
/*     */     //   454: invokevirtual a : (Lorg/bukkit/OfflinePlayer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   457: astore #19
/*     */     //   459: iload #9
/*     */     //   461: ifne -> 500
/*     */     //   464: aload_0
/*     */     //   465: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   468: invokevirtual a : ()Lme/konsolas/aac/fv;
/*     */     //   471: aload #18
/*     */     //   473: iload #6
/*     */     //   475: i2s
/*     */     //   476: lload #7
/*     */     //   478: invokevirtual a : (Lorg/bukkit/OfflinePlayer;SJ)Lme/konsolas/aac/jX;
/*     */     //   481: goto -> 495
/*     */     //   484: ldc2_w -7621573511801791470
/*     */     //   487: lload #4
/*     */     //   489: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   494: athrow
/*     */     //   495: invokestatic completedFuture : (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   498: astore #19
/*     */     //   500: aload #19
/*     */     //   502: aload_0
/*     */     //   503: aload #18
/*     */     //   505: <illegal opcode> accept : (Lme/konsolas/aac/fv;Lorg/bukkit/OfflinePlayer;)Ljava/util/function/BiConsumer;
/*     */     //   510: invokevirtual whenComplete : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   513: pop
/*     */     //   514: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 46
/*     */     //   #62	-> 67
/*     */     //   #51	-> 79
/*     */     //   #143	-> 85
/*     */     //   #13	-> 94
/*     */     //   #30	-> 135
/*     */     //   #80	-> 158
/*     */     //   #49	-> 184
/*     */     //   #100	-> 240
/*     */     //   #101	-> 241
/*     */     //   #113	-> 250
/*     */     //   #116	-> 259
/*     */     //   #41	-> 272
/*     */     //   #111	-> 279
/*     */     //   #109	-> 349
/*     */     //   #141	-> 405
/*     */     //   #73	-> 406
/*     */     //   #95	-> 445
/*     */     //   #61	-> 464
/*     */     //   #151	-> 500
/*     */     //   #87	-> 514
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   46	68	68	java/lang/IllegalArgumentException
/*     */     //   94	121	124	java/lang/IllegalArgumentException
/*     */     //   118	142	145	java/lang/IllegalArgumentException
/*     */     //   158	170	173	java/lang/IllegalArgumentException
/*     */     //   163	226	229	java/lang/IllegalArgumentException
/*     */     //   279	294	297	java/lang/IllegalArgumentException
/*     */     //   284	335	338	java/lang/IllegalArgumentException
/*     */     //   308	391	394	java/lang/IllegalArgumentException
/*     */     //   406	431	434	java/lang/IllegalArgumentException
/*     */     //   459	481	484	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public fv(int paramInt, AAC paramAAC, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: lload_3
/*     */     //   6: bipush #32
/*     */     //   8: lshl
/*     */     //   9: bipush #32
/*     */     //   11: lushr
/*     */     //   12: lor
/*     */     //   13: getstatic me/konsolas/aac/fv.n : J
/*     */     //   16: lxor
/*     */     //   17: lstore #5
/*     */     //   19: lload #5
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 57869915349868
/*     */     //   25: lxor
/*     */     //   26: lstore #7
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 14708190317144
/*     */     //   32: lxor
/*     */     //   33: lstore #9
/*     */     //   35: dup2
/*     */     //   36: ldc2_w 86749153583993
/*     */     //   39: lxor
/*     */     //   40: lstore #11
/*     */     //   42: pop2
/*     */     //   43: aload_0
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: ldc2_w -6361021157640964488
/*     */     //   50: lload #5
/*     */     //   52: <illegal opcode> w : (JJ)I
/*     */     //   57: aload_0
/*     */     //   58: <illegal opcode> newThread : ()Ljava/util/concurrent/ThreadFactory;
/*     */     //   63: invokestatic newSingleThreadExecutor : (Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
/*     */     //   66: putfield c : Ljava/util/concurrent/ExecutorService;
/*     */     //   69: aload_0
/*     */     //   70: new java/util/HashMap
/*     */     //   73: dup
/*     */     //   74: invokespecial <init> : ()V
/*     */     //   77: putfield i : Ljava/util/Map;
/*     */     //   80: aload_0
/*     */     //   81: new java/util/ArrayList
/*     */     //   84: dup
/*     */     //   85: invokespecial <init> : ()V
/*     */     //   88: putfield m : Ljava/util/List;
/*     */     //   91: aload_0
/*     */     //   92: new java/util/LinkedHashSet
/*     */     //   95: dup
/*     */     //   96: invokespecial <init> : ()V
/*     */     //   99: invokestatic synchronizedSet : (Ljava/util/Set;)Ljava/util/Set;
/*     */     //   102: putfield d : Ljava/util/Set;
/*     */     //   105: aload_0
/*     */     //   106: new java/util/concurrent/ConcurrentHashMap
/*     */     //   109: dup
/*     */     //   110: invokespecial <init> : ()V
/*     */     //   113: putfield h : Ljava/util/Map;
/*     */     //   116: aload_0
/*     */     //   117: aload_2
/*     */     //   118: putfield b : Lme/konsolas/aac/AAC;
/*     */     //   121: aload_0
/*     */     //   122: new me/konsolas/aac/fU
/*     */     //   125: dup
/*     */     //   126: lload #9
/*     */     //   128: aload_2
/*     */     //   129: invokespecial <init> : (JLme/konsolas/aac/AAC;)V
/*     */     //   132: putfield f : Lme/konsolas/aac/fU;
/*     */     //   135: istore #13
/*     */     //   137: aload_2
/*     */     //   138: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   141: sipush #29253
/*     */     //   144: ldc2_w 379803095138557917
/*     */     //   147: lload #5
/*     */     //   149: lxor
/*     */     //   150: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   155: invokevirtual getDouble : (Ljava/lang/String;)D
/*     */     //   158: dstore #14
/*     */     //   160: aload_2
/*     */     //   161: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   164: sipush #4003
/*     */     //   167: ldc2_w 4321885516432417300
/*     */     //   170: lload #5
/*     */     //   172: lxor
/*     */     //   173: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   178: invokevirtual getLong : (Ljava/lang/String;)J
/*     */     //   181: lstore #16
/*     */     //   183: aload_2
/*     */     //   184: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   187: sipush #24468
/*     */     //   190: ldc2_w 7547227914520621594
/*     */     //   193: lload #5
/*     */     //   195: lxor
/*     */     //   196: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   201: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   204: astore #18
/*     */     //   206: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   209: lload #16
/*     */     //   211: aload #18
/*     */     //   213: invokestatic valueOf : (Ljava/lang/String;)Ljava/util/concurrent/TimeUnit;
/*     */     //   216: invokevirtual convert : (JLjava/util/concurrent/TimeUnit;)J
/*     */     //   219: lstore #19
/*     */     //   221: goto -> 301
/*     */     //   224: astore #21
/*     */     //   226: aload_2
/*     */     //   227: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   230: new java/lang/StringBuilder
/*     */     //   233: dup
/*     */     //   234: invokespecial <init> : ()V
/*     */     //   237: sipush #8634
/*     */     //   240: ldc2_w 1788502110958128166
/*     */     //   243: lload #5
/*     */     //   245: lxor
/*     */     //   246: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   254: aload #21
/*     */     //   256: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   262: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   265: invokevirtual severe : (Ljava/lang/String;)V
/*     */     //   268: aload_2
/*     */     //   269: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   272: sipush #11072
/*     */     //   275: ldc2_w 1109719818827466451
/*     */     //   278: lload #5
/*     */     //   280: lxor
/*     */     //   281: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   286: invokevirtual severe : (Ljava/lang/String;)V
/*     */     //   289: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   292: lconst_1
/*     */     //   293: getstatic java/util/concurrent/TimeUnit.DAYS : Ljava/util/concurrent/TimeUnit;
/*     */     //   296: invokevirtual convert : (JLjava/util/concurrent/TimeUnit;)J
/*     */     //   299: lstore #19
/*     */     //   301: aload_0
/*     */     //   302: lload #19
/*     */     //   304: putfield j : J
/*     */     //   307: aload_0
/*     */     //   308: aload_2
/*     */     //   309: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   312: sipush #15110
/*     */     //   315: ldc2_w 2656082056141870733
/*     */     //   318: lload #5
/*     */     //   320: lxor
/*     */     //   321: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   326: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   329: putfield g : I
/*     */     //   332: aload_0
/*     */     //   333: aload_2
/*     */     //   334: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   337: sipush #13272
/*     */     //   340: ldc2_w 2403402482356952653
/*     */     //   343: lload #5
/*     */     //   345: lxor
/*     */     //   346: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   351: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   354: putfield k : I
/*     */     //   357: aload_2
/*     */     //   358: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   361: lload_3
/*     */     //   362: lconst_0
/*     */     //   363: lcmp
/*     */     //   364: ifle -> 681
/*     */     //   367: sipush #26743
/*     */     //   370: ldc2_w 7893215625300002282
/*     */     //   373: lload #5
/*     */     //   375: lxor
/*     */     //   376: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   381: iload #13
/*     */     //   383: ifeq -> 678
/*     */     //   386: invokevirtual getBoolean : (Ljava/lang/String;)Z
/*     */     //   389: ifeq -> 660
/*     */     //   392: goto -> 406
/*     */     //   395: ldc2_w -6359733422096700011
/*     */     //   398: lload #5
/*     */     //   400: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   405: athrow
/*     */     //   406: aload_2
/*     */     //   407: invokevirtual a : ()Lme/konsolas/aac/jI;
/*     */     //   410: invokestatic currentTimeMillis : ()J
/*     */     //   413: aload_0
/*     */     //   414: getfield j : J
/*     */     //   417: lsub
/*     */     //   418: lload #7
/*     */     //   420: invokevirtual a : (JJ)I
/*     */     //   423: istore #21
/*     */     //   425: iload #21
/*     */     //   427: iload #13
/*     */     //   429: iload_1
/*     */     //   430: ifle -> 516
/*     */     //   433: ifeq -> 509
/*     */     //   436: ifne -> 493
/*     */     //   439: goto -> 453
/*     */     //   442: ldc2_w -6359733422096700011
/*     */     //   445: lload #5
/*     */     //   447: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   452: athrow
/*     */     //   453: aload_2
/*     */     //   454: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   457: sipush #5191
/*     */     //   460: ldc2_w 7703057892852021709
/*     */     //   463: lload #5
/*     */     //   465: lxor
/*     */     //   466: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   471: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   474: iload #13
/*     */     //   476: ifne -> 629
/*     */     //   479: goto -> 493
/*     */     //   482: ldc2_w -6359733422096700011
/*     */     //   485: lload #5
/*     */     //   487: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   492: athrow
/*     */     //   493: iload #21
/*     */     //   495: goto -> 509
/*     */     //   498: ldc2_w -6359733422096700011
/*     */     //   501: lload #5
/*     */     //   503: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   508: athrow
/*     */     //   509: lload_3
/*     */     //   510: lconst_0
/*     */     //   511: lcmp
/*     */     //   512: ifle -> 542
/*     */     //   515: iconst_1
/*     */     //   516: if_icmpne -> 559
/*     */     //   519: aload_2
/*     */     //   520: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   523: sipush #24980
/*     */     //   526: ldc2_w 8991309272896162819
/*     */     //   529: lload #5
/*     */     //   531: lxor
/*     */     //   532: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   537: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   540: iload #13
/*     */     //   542: ifne -> 629
/*     */     //   545: goto -> 559
/*     */     //   548: ldc2_w -6359733422096700011
/*     */     //   551: lload #5
/*     */     //   553: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   558: athrow
/*     */     //   559: aload_2
/*     */     //   560: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   563: new java/lang/StringBuilder
/*     */     //   566: dup
/*     */     //   567: invokespecial <init> : ()V
/*     */     //   570: sipush #13035
/*     */     //   573: ldc2_w 3473624435840753533
/*     */     //   576: lload #5
/*     */     //   578: lxor
/*     */     //   579: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   584: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   587: iload #21
/*     */     //   589: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   592: sipush #31233
/*     */     //   595: ldc2_w 36272150533986202
/*     */     //   598: lload #5
/*     */     //   600: lxor
/*     */     //   601: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   609: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   612: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   615: goto -> 629
/*     */     //   618: ldc2_w -6359733422096700011
/*     */     //   621: lload #5
/*     */     //   623: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   628: athrow
/*     */     //   629: goto -> 660
/*     */     //   632: astore #21
/*     */     //   634: aload_2
/*     */     //   635: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   638: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
/*     */     //   641: sipush #10275
/*     */     //   644: ldc2_w 2471834688995067296
/*     */     //   647: lload #5
/*     */     //   649: lxor
/*     */     //   650: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   655: aload #21
/*     */     //   657: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   660: aload_2
/*     */     //   661: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*     */     //   664: sipush #28936
/*     */     //   667: ldc2_w 3893148345807559833
/*     */     //   670: lload #5
/*     */     //   672: lxor
/*     */     //   673: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   678: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
/*     */     //   681: astore #21
/*     */     //   683: aload #21
/*     */     //   685: iload #13
/*     */     //   687: lload_3
/*     */     //   688: lconst_0
/*     */     //   689: lcmp
/*     */     //   690: ifle -> 716
/*     */     //   693: ifeq -> 715
/*     */     //   696: ifnull -> 950
/*     */     //   699: goto -> 713
/*     */     //   702: ldc2_w -6359733422096700011
/*     */     //   705: lload #5
/*     */     //   707: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   712: athrow
/*     */     //   713: aload #21
/*     */     //   715: iconst_0
/*     */     //   716: invokeinterface getKeys : (Z)Ljava/util/Set;
/*     */     //   721: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   726: astore #22
/*     */     //   728: aload #22
/*     */     //   730: invokeinterface hasNext : ()Z
/*     */     //   735: ifeq -> 935
/*     */     //   738: aload #22
/*     */     //   740: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   745: checkcast java/lang/String
/*     */     //   748: astore #23
/*     */     //   750: aload #21
/*     */     //   752: aload #23
/*     */     //   754: invokeinterface getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
/*     */     //   759: astore #24
/*     */     //   761: iload_1
/*     */     //   762: ifle -> 1042
/*     */     //   765: iload #13
/*     */     //   767: ifeq -> 1042
/*     */     //   770: aload #24
/*     */     //   772: iload_1
/*     */     //   773: ifle -> 848
/*     */     //   776: iload #13
/*     */     //   778: ifeq -> 848
/*     */     //   781: goto -> 795
/*     */     //   784: ldc2_w -6359733422096700011
/*     */     //   787: lload #5
/*     */     //   789: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   794: athrow
/*     */     //   795: ifnull -> 860
/*     */     //   798: goto -> 812
/*     */     //   801: ldc2_w -6359733422096700011
/*     */     //   804: lload #5
/*     */     //   806: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   811: athrow
/*     */     //   812: aload_0
/*     */     //   813: getfield i : Ljava/util/Map;
/*     */     //   816: aload #23
/*     */     //   818: new me/konsolas/aac/df
/*     */     //   821: dup
/*     */     //   822: aload #24
/*     */     //   824: lload #11
/*     */     //   826: invokespecial <init> : (Lorg/bukkit/configuration/ConfigurationSection;J)V
/*     */     //   829: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   834: goto -> 848
/*     */     //   837: ldc2_w -6359733422096700011
/*     */     //   840: lload #5
/*     */     //   842: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   847: athrow
/*     */     //   848: pop
/*     */     //   849: iload #13
/*     */     //   851: lload_3
/*     */     //   852: lconst_0
/*     */     //   853: lcmp
/*     */     //   854: ifle -> 932
/*     */     //   857: ifne -> 930
/*     */     //   860: aload_2
/*     */     //   861: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   864: new java/lang/StringBuilder
/*     */     //   867: dup
/*     */     //   868: invokespecial <init> : ()V
/*     */     //   871: sipush #29203
/*     */     //   874: ldc2_w 5150201197657677709
/*     */     //   877: lload #5
/*     */     //   879: lxor
/*     */     //   880: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   885: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   888: aload #23
/*     */     //   890: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   893: sipush #27114
/*     */     //   896: ldc2_w 3251099330372027504
/*     */     //   899: lload #5
/*     */     //   901: lxor
/*     */     //   902: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   907: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   910: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   913: invokevirtual warning : (Ljava/lang/String;)V
/*     */     //   916: goto -> 930
/*     */     //   919: ldc2_w -6359733422096700011
/*     */     //   922: lload #5
/*     */     //   924: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   929: athrow
/*     */     //   930: iload #13
/*     */     //   932: ifne -> 728
/*     */     //   935: lload_3
/*     */     //   936: lconst_0
/*     */     //   937: lcmp
/*     */     //   938: ifle -> 1042
/*     */     //   941: iload #13
/*     */     //   943: iload_1
/*     */     //   944: ifle -> 1064
/*     */     //   947: ifne -> 985
/*     */     //   950: aload_2
/*     */     //   951: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   954: sipush #142
/*     */     //   957: ldc2_w 1129955845253180683
/*     */     //   960: lload #5
/*     */     //   962: lxor
/*     */     //   963: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   968: invokevirtual warning : (Ljava/lang/String;)V
/*     */     //   971: goto -> 985
/*     */     //   974: ldc2_w -6359733422096700011
/*     */     //   977: lload #5
/*     */     //   979: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   984: athrow
/*     */     //   985: aload_0
/*     */     //   986: invokestatic newBuilder : ()Lcom/google/common/cache/CacheBuilder;
/*     */     //   989: ldc2_w 100
/*     */     //   992: invokevirtual maximumSize : (J)Lcom/google/common/cache/CacheBuilder;
/*     */     //   995: ldc2_w 10
/*     */     //   998: getstatic java/util/concurrent/TimeUnit.MINUTES : Ljava/util/concurrent/TimeUnit;
/*     */     //   1001: invokevirtual expireAfterAccess : (JLjava/util/concurrent/TimeUnit;)Lcom/google/common/cache/CacheBuilder;
/*     */     //   1004: invokevirtual build : ()Lcom/google/common/cache/Cache;
/*     */     //   1007: putfield e : Lcom/google/common/cache/Cache;
/*     */     //   1010: aload_2
/*     */     //   1011: invokevirtual getServer : ()Lorg/bukkit/Server;
/*     */     //   1014: invokeinterface getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
/*     */     //   1019: aload_2
/*     */     //   1020: aload_0
/*     */     //   1021: <illegal opcode> run : (Lme/konsolas/aac/fv;)Ljava/lang/Runnable;
/*     */     //   1026: ldc2_w 100
/*     */     //   1029: dload #14
/*     */     //   1031: ldc2_w 20.0
/*     */     //   1034: dmul
/*     */     //   1035: d2l
/*     */     //   1036: invokeinterface runTaskTimerAsynchronously : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;JJ)Lorg/bukkit/scheduler/BukkitTask;
/*     */     //   1041: pop
/*     */     //   1042: iload_1
/*     */     //   1043: iflt -> 1074
/*     */     //   1046: ldc2_w -6390817055519415316
/*     */     //   1049: lload #5
/*     */     //   1051: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   1056: ifnull -> 1088
/*     */     //   1059: iinc #13, 1
/*     */     //   1062: iload #13
/*     */     //   1064: ldc2_w -6386260949765333950
/*     */     //   1067: lload #5
/*     */     //   1069: <illegal opcode> w : (IJJ)V
/*     */     //   1074: goto -> 1088
/*     */     //   1077: ldc2_w -6359733422096700011
/*     */     //   1080: lload #5
/*     */     //   1082: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1087: athrow
/*     */     //   1088: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 43
/*     */     //   #39	-> 57
/*     */     //   #156	-> 69
/*     */     //   #97	-> 80
/*     */     //   #118	-> 91
/*     */     //   #69	-> 105
/*     */     //   #8	-> 116
/*     */     //   #125	-> 121
/*     */     //   #53	-> 137
/*     */     //   #78	-> 160
/*     */     //   #40	-> 183
/*     */     //   #54	-> 206
/*     */     //   #28	-> 221
/*     */     //   #124	-> 224
/*     */     //   #142	-> 226
/*     */     //   #112	-> 268
/*     */     //   #136	-> 289
/*     */     //   #6	-> 301
/*     */     //   #2	-> 307
/*     */     //   #26	-> 332
/*     */     //   #50	-> 357
/*     */     //   #145	-> 406
/*     */     //   #3	-> 425
/*     */     //   #68	-> 453
/*     */     //   #67	-> 493
/*     */     //   #85	-> 519
/*     */     //   #35	-> 559
/*     */     //   #21	-> 629
/*     */     //   #93	-> 632
/*     */     //   #29	-> 634
/*     */     //   #70	-> 660
/*     */     //   #108	-> 683
/*     */     //   #56	-> 713
/*     */     //   #11	-> 750
/*     */     //   #12	-> 761
/*     */     //   #27	-> 812
/*     */     //   #45	-> 860
/*     */     //   #25	-> 930
/*     */     //   #107	-> 950
/*     */     //   #96	-> 985
/*     */     //   #77	-> 992
/*     */     //   #117	-> 1001
/*     */     //   #110	-> 1004
/*     */     //   #128	-> 1010
/*     */     //   #137	-> 1042
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   206	221	224	java/lang/IllegalArgumentException
/*     */     //   301	392	395	java/lang/IllegalArgumentException
/*     */     //   406	629	632	java/sql/SQLException
/*     */     //   425	439	442	java/lang/IllegalArgumentException
/*     */     //   436	479	482	java/lang/IllegalArgumentException
/*     */     //   453	495	498	java/lang/IllegalArgumentException
/*     */     //   509	545	548	java/lang/IllegalArgumentException
/*     */     //   519	615	618	java/lang/IllegalArgumentException
/*     */     //   683	699	702	java/lang/IllegalArgumentException
/*     */     //   761	781	784	java/lang/IllegalArgumentException
/*     */     //   770	798	801	java/lang/IllegalArgumentException
/*     */     //   795	834	837	java/lang/IllegalArgumentException
/*     */     //   848	916	919	java/lang/IllegalArgumentException
/*     */     //   935	971	974	java/lang/IllegalArgumentException
/*     */     //   1042	1074	1077	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void d(Player paramPlayer) {
/*  81 */     a((OfflinePlayer)paramPlayer);
/*     */   }
/*     */   public void c(Player paramPlayer) {
/*  84 */     this.d.add(paramPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture a(OfflinePlayer paramOfflinePlayer) {
/*  92 */     CompletableFuture completableFuture = new CompletableFuture();
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
/* 144 */     this.c.execute(() -> {
/*     */           // Byte code:
/*     */           //   0: getstatic me/konsolas/aac/fv.n : J
/*     */           //   3: ldc2_w 80972355359943
/*     */           //   6: lxor
/*     */           //   7: lstore_3
/*     */           //   8: lload_3
/*     */           //   9: dup2
/*     */           //   10: ldc2_w 75865926393147
/*     */           //   13: lxor
/*     */           //   14: lstore #5
/*     */           //   16: dup2
/*     */           //   17: ldc2_w 85063053675565
/*     */           //   20: lxor
/*     */           //   21: lstore #7
/*     */           //   23: dup2
/*     */           //   24: ldc2_w 86652780233329
/*     */           //   27: lxor
/*     */           //   28: lstore #9
/*     */           //   30: pop2
/*     */           //   31: ldc2_w -5326249236378847759
/*     */           //   34: lload_3
/*     */           //   35: <illegal opcode> w : (JJ)I
/*     */           //   40: istore #11
/*     */           //   42: aload_0
/*     */           //   43: getfield b : Lme/konsolas/aac/AAC;
/*     */           //   46: aload_1
/*     */           //   47: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */           //   52: lload #9
/*     */           //   54: invokevirtual a : (Ljava/util/UUID;J)Lme/konsolas/aac/ef;
/*     */           //   57: astore #12
/*     */           //   59: iload #11
/*     */           //   61: ifne -> 118
/*     */           //   64: aload #12
/*     */           //   66: ifnonnull -> 104
/*     */           //   69: goto -> 82
/*     */           //   72: ldc2_w -5246181812930396903
/*     */           //   75: lload_3
/*     */           //   76: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */           //   81: athrow
/*     */           //   82: aload_0
/*     */           //   83: getfield b : Lme/konsolas/aac/AAC;
/*     */           //   86: invokevirtual a : ()Lme/konsolas/aac/jI;
/*     */           //   89: aload_1
/*     */           //   90: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */           //   95: lload #5
/*     */           //   97: dup2_x1
/*     */           //   98: pop2
/*     */           //   99: invokevirtual a : (JLjava/util/UUID;)Lme/konsolas/aac/ef;
/*     */           //   102: astore #12
/*     */           //   104: aload_2
/*     */           //   105: aload_0
/*     */           //   106: aload_1
/*     */           //   107: aload #12
/*     */           //   109: lload #7
/*     */           //   111: invokespecial a : (Lorg/bukkit/OfflinePlayer;Lme/konsolas/aac/ef;J)Lme/konsolas/aac/jX;
/*     */           //   114: invokevirtual complete : (Ljava/lang/Object;)Z
/*     */           //   117: pop
/*     */           //   118: goto -> 180
/*     */           //   121: astore #12
/*     */           //   123: aload_0
/*     */           //   124: getfield b : Lme/konsolas/aac/AAC;
/*     */           //   127: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */           //   130: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */           //   133: new java/lang/StringBuilder
/*     */           //   136: dup
/*     */           //   137: invokespecial <init> : ()V
/*     */           //   140: sipush #5830
/*     */           //   143: ldc2_w 6100076145151421382
/*     */           //   146: lload_3
/*     */           //   147: lxor
/*     */           //   148: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */           //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */           //   156: aload_1
/*     */           //   157: invokeinterface getName : ()Ljava/lang/String;
/*     */           //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */           //   165: invokevirtual toString : ()Ljava/lang/String;
/*     */           //   168: aload #12
/*     */           //   170: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */           //   173: aload_2
/*     */           //   174: aload #12
/*     */           //   176: invokevirtual completeExceptionally : (Ljava/lang/Throwable;)Z
/*     */           //   179: pop
/*     */           //   180: return
/*     */           // Line number table:
/*     */           //   Java source line number -> byte code offset
/*     */           //   #82	-> 42
/*     */           //   #103	-> 59
/*     */           //   #34	-> 104
/*     */           //   #32	-> 118
/*     */           //   #134	-> 121
/*     */           //   #23	-> 123
/*     */           //   #72	-> 173
/*     */           //   #79	-> 180
/*     */           // Exception table:
/*     */           //   from	to	target	type
/*     */           //   42	118	121	java/sql/SQLException
/*     */           //   59	69	72	java/sql/SQLException
/*     */         });
/*     */     return completableFuture.whenComplete((paramjX, paramThrowable) -> {
/*     */           // Byte code:
/*     */           //   0: getstatic me/konsolas/aac/fv.n : J
/*     */           //   3: ldc2_w 82442836558267
/*     */           //   6: lxor
/*     */           //   7: lstore #4
/*     */           //   9: ldc2_w 2470645372821861256
/*     */           //   12: lload #4
/*     */           //   14: <illegal opcode> w : (JJ)I
/*     */           //   19: istore #6
/*     */           //   21: aload_2
/*     */           //   22: ifnull -> 133
/*     */           //   25: aload_1
/*     */           //   26: iload #6
/*     */           //   28: ifeq -> 97
/*     */           //   31: goto -> 45
/*     */           //   34: ldc2_w 2471862874812557413
/*     */           //   37: lload #4
/*     */           //   39: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */           //   44: athrow
/*     */           //   45: invokeinterface isOnline : ()Z
/*     */           //   50: ifeq -> 103
/*     */           //   53: goto -> 67
/*     */           //   56: ldc2_w 2471862874812557413
/*     */           //   59: lload #4
/*     */           //   61: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */           //   66: athrow
/*     */           //   67: aload_0
/*     */           //   68: getfield h : Ljava/util/Map;
/*     */           //   71: aload_1
/*     */           //   72: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */           //   77: aload_2
/*     */           //   78: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */           //   83: goto -> 97
/*     */           //   86: ldc2_w 2471862874812557413
/*     */           //   89: lload #4
/*     */           //   91: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */           //   96: athrow
/*     */           //   97: pop
/*     */           //   98: iload #6
/*     */           //   100: ifne -> 133
/*     */           //   103: aload_0
/*     */           //   104: getfield e : Lcom/google/common/cache/Cache;
/*     */           //   107: aload_1
/*     */           //   108: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */           //   113: aload_2
/*     */           //   114: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */           //   119: goto -> 133
/*     */           //   122: ldc2_w 2471862874812557413
/*     */           //   125: lload #4
/*     */           //   127: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */           //   132: athrow
/*     */           //   133: return
/*     */           // Line number table:
/*     */           //   Java source line number -> byte code offset
/*     */           //   #102	-> 21
/*     */           //   #63	-> 25
/*     */           //   #31	-> 67
/*     */           //   #16	-> 103
/*     */           //   #52	-> 133
/*     */           // Exception table:
/*     */           //   from	to	target	type
/*     */           //   21	31	34	java/lang/IllegalArgumentException
/*     */           //   25	53	56	java/lang/IllegalArgumentException
/*     */           //   45	83	86	java/lang/IllegalArgumentException
/*     */           //   97	119	122	java/lang/IllegalArgumentException
/*     */         });
/*     */   }
/*     */   
/*     */   public void a(AACCustomFeatureProvider paramAACCustomFeatureProvider) {
/*     */     this.m.add(paramAACCustomFeatureProvider);
/*     */   }
/*     */   
/*     */   private void b(Player paramPlayer, int paramInt, short paramShort1, short paramShort2) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/fv.n : J
/*     */     //   27: lxor
/*     */     //   28: lstore #5
/*     */     //   30: invokestatic newDataOutput : ()Lcom/google/common/io/ByteArrayDataOutput;
/*     */     //   33: astore #7
/*     */     //   35: aload #7
/*     */     //   37: sipush #5880
/*     */     //   40: ldc2_w 6733425220559315322
/*     */     //   43: lload #5
/*     */     //   45: lxor
/*     */     //   46: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   51: invokeinterface writeUTF : (Ljava/lang/String;)V
/*     */     //   56: aload #7
/*     */     //   58: sipush #17437
/*     */     //   61: ldc2_w 6268558855137850251
/*     */     //   64: lload #5
/*     */     //   66: lxor
/*     */     //   67: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   72: invokeinterface writeUTF : (Ljava/lang/String;)V
/*     */     //   77: aload #7
/*     */     //   79: sipush #24482
/*     */     //   82: ldc2_w 8038617651337750587
/*     */     //   85: lload #5
/*     */     //   87: lxor
/*     */     //   88: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   93: invokeinterface writeUTF : (Ljava/lang/String;)V
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface getUniqueId : ()Ljava/util/UUID;
/*     */     //   104: astore #8
/*     */     //   106: aload_0
/*     */     //   107: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   110: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*     */     //   113: new java/lang/StringBuilder
/*     */     //   116: dup
/*     */     //   117: invokespecial <init> : ()V
/*     */     //   120: sipush #8827
/*     */     //   123: ldc2_w 633968195450082804
/*     */     //   126: lload #5
/*     */     //   128: lxor
/*     */     //   129: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   137: aload #8
/*     */     //   139: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   142: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   145: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   148: aload #7
/*     */     //   150: bipush #16
/*     */     //   152: invokeinterface writeShort : (I)V
/*     */     //   157: aload #7
/*     */     //   159: aload #8
/*     */     //   161: invokevirtual getMostSignificantBits : ()J
/*     */     //   164: invokeinterface writeLong : (J)V
/*     */     //   169: aload #7
/*     */     //   171: aload #8
/*     */     //   173: invokevirtual getLeastSignificantBits : ()J
/*     */     //   176: invokeinterface writeLong : (J)V
/*     */     //   181: aload_1
/*     */     //   182: aload_0
/*     */     //   183: getfield b : Lme/konsolas/aac/AAC;
/*     */     //   186: sipush #32564
/*     */     //   189: ldc2_w 8195787182274857128
/*     */     //   192: lload #5
/*     */     //   194: lxor
/*     */     //   195: <illegal opcode> j : (IJ)Ljava/lang/String;
/*     */     //   200: aload #7
/*     */     //   202: invokeinterface toByteArray : ()[B
/*     */     //   207: invokeinterface sendPluginMessage : (Lorg/bukkit/plugin/Plugin;Ljava/lang/String;[B)V
/*     */     //   212: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 30
/*     */     //   #152	-> 35
/*     */     //   #18	-> 56
/*     */     //   #83	-> 77
/*     */     //   #88	-> 98
/*     */     //   #48	-> 106
/*     */     //   #98	-> 148
/*     */     //   #37	-> 157
/*     */     //   #138	-> 169
/*     */     //   #135	-> 181
/*     */     //   #55	-> 212
/*     */   }
/*     */   
/*     */   private void a() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fv.n : J
/*     */     //   3: ldc2_w 90282549893454
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: lload_1
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 48443610401603
/*     */     //   13: lxor
/*     */     //   14: dup2
/*     */     //   15: bipush #48
/*     */     //   17: lushr
/*     */     //   18: l2i
/*     */     //   19: istore_3
/*     */     //   20: dup2
/*     */     //   21: bipush #16
/*     */     //   23: lshl
/*     */     //   24: bipush #16
/*     */     //   26: lushr
/*     */     //   27: lstore #4
/*     */     //   29: pop2
/*     */     //   30: pop2
/*     */     //   31: ldc2_w 4232369933724314493
/*     */     //   34: lload_1
/*     */     //   35: <illegal opcode> w : (JJ)I
/*     */     //   40: aload_0
/*     */     //   41: getfield d : Ljava/util/Set;
/*     */     //   44: <illegal opcode> test : ()Ljava/util/function/Predicate;
/*     */     //   49: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
/*     */     //   54: pop
/*     */     //   55: istore #6
/*     */     //   57: aload_0
/*     */     //   58: iload #6
/*     */     //   60: ifeq -> 101
/*     */     //   63: getfield d : Ljava/util/Set;
/*     */     //   66: invokeinterface isEmpty : ()Z
/*     */     //   71: ifne -> 324
/*     */     //   74: goto -> 87
/*     */     //   77: ldc2_w 4231354877198053520
/*     */     //   80: lload_1
/*     */     //   81: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   86: athrow
/*     */     //   87: aload_0
/*     */     //   88: goto -> 101
/*     */     //   91: ldc2_w 4231354877198053520
/*     */     //   94: lload_1
/*     */     //   95: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   100: athrow
/*     */     //   101: iload #6
/*     */     //   103: ifeq -> 180
/*     */     //   106: getfield l : Ljava/util/concurrent/CompletableFuture;
/*     */     //   109: ifnull -> 166
/*     */     //   112: goto -> 125
/*     */     //   115: ldc2_w 4231354877198053520
/*     */     //   118: lload_1
/*     */     //   119: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   124: athrow
/*     */     //   125: aload_0
/*     */     //   126: iload #6
/*     */     //   128: ifeq -> 180
/*     */     //   131: goto -> 144
/*     */     //   134: ldc2_w 4231354877198053520
/*     */     //   137: lload_1
/*     */     //   138: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: getfield l : Ljava/util/concurrent/CompletableFuture;
/*     */     //   147: invokevirtual isDone : ()Z
/*     */     //   150: ifeq -> 324
/*     */     //   153: goto -> 166
/*     */     //   156: ldc2_w 4231354877198053520
/*     */     //   159: lload_1
/*     */     //   160: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   165: athrow
/*     */     //   166: aload_0
/*     */     //   167: goto -> 180
/*     */     //   170: ldc2_w 4231354877198053520
/*     */     //   173: lload_1
/*     */     //   174: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   179: athrow
/*     */     //   180: getfield d : Ljava/util/Set;
/*     */     //   183: dup
/*     */     //   184: astore #8
/*     */     //   186: monitorenter
/*     */     //   187: aload_0
/*     */     //   188: getfield d : Ljava/util/Set;
/*     */     //   191: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   196: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   201: checkcast org/bukkit/entity/Player
/*     */     //   204: astore #7
/*     */     //   206: aload_0
/*     */     //   207: getfield d : Ljava/util/Set;
/*     */     //   210: aload #7
/*     */     //   212: invokeinterface remove : (Ljava/lang/Object;)Z
/*     */     //   217: pop
/*     */     //   218: aload #8
/*     */     //   220: monitorexit
/*     */     //   221: goto -> 232
/*     */     //   224: astore #9
/*     */     //   226: aload #8
/*     */     //   228: monitorexit
/*     */     //   229: aload #9
/*     */     //   231: athrow
/*     */     //   232: aload_0
/*     */     //   233: aload #7
/*     */     //   235: iload_3
/*     */     //   236: i2s
/*     */     //   237: lload #4
/*     */     //   239: invokevirtual a : (Lorg/bukkit/OfflinePlayer;SJ)Lme/konsolas/aac/jX;
/*     */     //   242: astore #8
/*     */     //   244: aload #8
/*     */     //   246: iload #6
/*     */     //   248: ifeq -> 285
/*     */     //   251: ifnonnull -> 283
/*     */     //   254: goto -> 267
/*     */     //   257: ldc2_w 4231354877198053520
/*     */     //   260: lload_1
/*     */     //   261: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   266: athrow
/*     */     //   267: getstatic me/konsolas/aac/e6.NEUTRAL : Lme/konsolas/aac/e6;
/*     */     //   270: goto -> 288
/*     */     //   273: ldc2_w 4231354877198053520
/*     */     //   276: lload_1
/*     */     //   277: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   282: athrow
/*     */     //   283: aload #8
/*     */     //   285: invokevirtual a : ()Lme/konsolas/aac/e6;
/*     */     //   288: astore #9
/*     */     //   290: aload_0
/*     */     //   291: aload_0
/*     */     //   292: aload #7
/*     */     //   294: invokevirtual a : (Lorg/bukkit/OfflinePlayer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   297: aload_0
/*     */     //   298: aload #9
/*     */     //   300: aload #7
/*     */     //   302: <illegal opcode> accept : (Lme/konsolas/aac/fv;Lme/konsolas/aac/e6;Lorg/bukkit/entity/Player;)Ljava/util/function/BiConsumer;
/*     */     //   307: invokevirtual whenComplete : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   310: aload_0
/*     */     //   311: aload #7
/*     */     //   313: <illegal opcode> accept : (Lme/konsolas/aac/fv;Lorg/bukkit/entity/Player;)Ljava/util/function/BiConsumer;
/*     */     //   318: invokevirtual whenComplete : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   321: putfield l : Ljava/util/concurrent/CompletableFuture;
/*     */     //   324: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 40
/*     */     //   #130	-> 57
/*     */     //   #150	-> 166
/*     */     //   #7	-> 187
/*     */     //   #126	-> 206
/*     */     //   #46	-> 218
/*     */     //   #76	-> 232
/*     */     //   #122	-> 244
/*     */     //   #60	-> 290
/*     */     //   #155	-> 318
/*     */     //   #57	-> 324
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   57	74	77	java/lang/IllegalArgumentException
/*     */     //   63	88	91	java/lang/IllegalArgumentException
/*     */     //   101	112	115	java/lang/IllegalArgumentException
/*     */     //   106	131	134	java/lang/IllegalArgumentException
/*     */     //   125	153	156	java/lang/IllegalArgumentException
/*     */     //   144	167	170	java/lang/IllegalArgumentException
/*     */     //   187	221	224	finally
/*     */     //   224	229	224	finally
/*     */     //   244	254	257	java/lang/IllegalArgumentException
/*     */     //   251	273	273	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   static {
/*     */     long l = n ^ 0x5B25AA9CE8E6L;
/*     */     "?吙훫ȱ⚑?౼쐆⇤턳㞋Ꙉ䴸⃵ጡ∹".toCharArray()[2] = (char)("?吙훫ȱ⚑?౼쐆⇤턳㞋Ꙉ䴸⃵ጡ∹".toCharArray()[2] ^ 0x5BBB);
/*     */     "챊奰姻皴".toCharArray()[0] = (char)("챊奰姻皴".toCharArray()[0] ^ 0xDD6);
/*     */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*     */     for (byte b1 = 1; b1 < 8; b1++)
/*     */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*     */     Cipher cipher;
/*     */     (cipher = Cipher.getInstance(da$gx.U("?吙훫ȱ⚑?౼쐆⇤턳㞋Ꙉ䴸⃵ጡ∹".toCharArray(), (short)21361, false, false))).init(2, SecretKeyFactory.getInstance(da$gx.U("챊奰姻皴".toCharArray(), (short)29563, false, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*     */     String[] arrayOfString = new String[33];
/*     */     boolean bool = false;
/*     */     "㪇櫋骮졻⊞吴뭆ᎊ囷坠ﻦ퐟ﮏ﹝⩙ꪾ猘ີ玫?꛼蜴셒ᕹ爦?늜뗍로短Ꙇ⿂ꋥ௃ꞻ먉ષ怩꼨࿎?따덨菺຿?䋦⏧廉ꪥ㌉渣駷湹苞훻䂫쓟㞣㶧㪬頀뚮䯧턣⋆?똆?㖗挜Ᏺ膗崎늼鮅⟜栙횱࿏⼁ஜ뎷䍟?쐡ꢀ겨떐멫䑴㬣＃䐖㍙礣쏍ᶢ珞?펢歗橪ꯀ癵㪩㿵?㼘뇦?魊툎킽ﶚ꠩陃荆ଲ♠⡌ࡧ낏秼坉垡㲼튟䥏뿞嗯ꇶↃ貫聂ꊧ矨긺椻믥맺牒挻㯵諾廲㊝삖튫ଶ铷ﭶ馫젇ಃ㬅ᇄℹொ멧锿ळ㨫ȝ呼矦䖆ᇭ䄮鏮㌖?맏┼噪♐믿⛆￙욇⩺푣鎬髗楬愴⻏飵䙉ⲃ䅟䦲攚鋚닲됑ⓢ鍽㊺?㲲选钂௲㰰ﹿ᫦탛끡⠝䕒ꩴ寛踼뵽털ꔣꉎ殠酖鋂쑈抇௛型꣌࿎ꙫ磡⬗郋焎꩝Ⲱꗨ?钫삩ै쎍ꄗ嵑澱䵆⮀⌑칚褡?瀟㺥ᴰ⑒͡麏約穲叨ㅳᐺ?꫾撥甫鯝㔂鞣喦땐⟳Ġ氧쟈棘徠ዷ霫ꑮ甝ᕶ섿깨셀늊░?路싫싴Г㓙┧㹯ⱁ뇤讒㓷䨮ᛘ蟧皾ﳯ棘눈橂뎉昞筆邵넟췥?ᣡ啻ꮅ㍵罢绚벗?攓≦ᦟ࿦ጂن뺮텑消?钗躨□规ᗼ鰓缞䱬큛羅芻砕㘶㢴尛釴ꮺ鲈䜪쭬◢ϫ痨⛉᝱⤵?燋츅〴뾃⌅逿䦜푘槞鵔끾꽖ㄈﵔ瓩⠡兙涵볣泊十Ʌ頞﹢츗避⾍㐫橵㦏幖䥏徯区ꆈ운Ӳ뿘ꛠ䯙彌렘Ⱗ楇そ⛈⑐︀쓓뀦퀕␵⛠㒘ࠍ᪰懫⃦행䔰켶⯆憝脯퀶ℭ瓆鉋篠嗕⫬㛅釂奉潮삾蓔䛕敗蝶ⵓ㦰钺䌳⡥ᓹ⛡?延灼㒣䚸颐锤૾ल臨㫛䠰卲螲屸ྶ㮳㾌匾ᙸ㤱Ñ푇ﱶজ般࿺漃萣䘥㊈䆡韂줊핓⹑品셶㈽㲔즠ଂ琺ꚅ䋧石馟꠹鵱濙ꢬ重蝸ꮉ˨뷉뮉憣鍀ⶨ허뙖䈫葡펆蕌⾛挵丐ꖏ靛軼䨫鮾软蛺ܺ軦뿹夲?鹯笷寱㼂シ얻蜢됛鈐젙吿鮋蹾㙎ꚗ౯뢑ෂ?ࠅ吇괯芋嫂设ꢫ擙ᩳꁯ刘퍤０鈣낀뤥㑏粼䳃ꥮ檛豹儑괵ﴺ噿룸剦曦隲졳嬥ㅑ嚁䝹ꄦ嫦᜚?\037렯㳙䇃Ӡ앒댻驢?ᜎ鰷ᬾ䡏ɬ껕鸘딛俰퐆鼕?㎇ᄂ専떘鮫휕룯뤬쌦囷ྨ揶困鳼?畳顳঎답ᆷⴹ珨?碳崛뿱隸㾌ऑ㍃鴲匓?騞Ȱ﮸걷ꅜ季䡆┆Ү呅鰮땵鲉ퟔ璌륂潹ꯔ阰ꎵ♠ꦋ䕫ᑶꢦ爼۫ﲜ뇠嫔颹嘷❯洆㏲箆爣掩衛鮶ₔ鳑ፃᮠ砱喔꧐詟栗也谁㽜薟簱୛⩫裃䪖塃ﵫ㴌찣ꡋ䳼ၛ줫醱｝᤟䯤⠳딟찞攇駅첧ᖟ䑍᯲²⌝寔鮼홨ᛊ뱬膽䪃䈐螟쎅灘糳遯ꍋꎶ႗컓浙⸕ἶ쓇㘴Χ芉热㚷ꈃ䬷謝剀ыᦂ鮓됢蜱㍉纠?㫟䩫雖ᇄ?뻩⚖緒?⠙㑫ᑳ鏐ᴺꈯ령븬핻흳⣴颏떾뤏骯芶霡䜯┕Ꮩⵋ჏孀⨔宲뙃限㢗敜?ᜎ乎࿣땁ﲀස숳쭽軂䣨퉖ⳣꌣ㹤跪區ꪼ嶶㓞羈늶詇ﻬ﷉?ꝉ뱆΂㦁껳눊嚉㧷紷菺ዄ῏Ϧ鬳⾦竇᱀谄⸉撡ᛌ⫲噏쮱濵顉ꭅ欿曾⼸ퟚ㵖䅲믹蝹䦨퐕觵▪鲼霾媦碯命泌Ⴄ瞾ꫮ怎?ꐮᆺ菠頗婰蛪敓홳Ⱓ䵔悅뽍?ᶉ䙑瀰芫Ꞹ⁲뤙后ꄋ蟿⬅鉑鑃뼦⿍紖뤞㾕袱뎷紭罌曠謩ᾨ᥁➌摉쏨燩?඼ᆔ?숻ꡆ逘问躢䪒ﴭ젓娷￷峘㱫?ፐ眣栠ꥶ퓏벛⤡ี᜵㭒寱撏댣꧅붃ᒟﳮ⥂?促삯䑆￼䙵Ẉ慿讍즱톪댹븞륒ͱ蜅褳덚ݦ噺旍䖀庢?Ⰼ鞟?磯痏颲姖晷眮콶睲鳖→ꛄ䂚Ӗ?㠓㝊띟◛쾬緪嬢娜㯡뗹嶗뻤ꜳ袏⮅폄˕랑抮毹ᚖၪﱢ瓃噔䳬虜嬄þ䚵⮃ꇔ忺늁᭢눸Ɲ븊줾﷧洖ﺡ踼㌦땿⍸ꮃ缶듶㒜䇌嫅⏚ڭ㺼⻨ॎ廊熜⊮偘?琞䢦Ⓡ琦劆鈏䐜箭퀿쭖Γ뿧뵤樦泐醈ࡋ狢⠴巑衲ﲣ혖硨﮵楃꺮鳒?浸Ꙥ枱∖໏镅규劍ꑰ⍊쫤鳴Ꮈ䔌㊖쌱蹞ⳁ䏗憋ķ靅蠬읔䶡丒끈प饫Ⅽ氧よ튧솶閄딋᰻䮏䱓肙缮꼟郕믵ꉥ䬘ᵺ뮝몲兂䜴駨鋽䠌홂緔?媴澻岰燑縥᠀䑩ᗞ鸡䇃圉㼎鮠顎ꍴ闋ń奝ୢ磤៥亴".toCharArray()[694] = (char)("㪇櫋骮졻⊞吴뭆ᎊ囷坠ﻦ퐟ﮏ﹝⩙ꪾ猘ີ玫?꛼蜴셒ᕹ爦?늜뗍로短Ꙇ⿂ꋥ௃ꞻ먉ષ怩꼨࿎?따덨菺຿?䋦⏧廉ꪥ㌉渣駷湹苞훻䂫쓟㞣㶧㪬頀뚮䯧턣⋆?똆?㖗挜Ᏺ膗崎늼鮅⟜栙횱࿏⼁ஜ뎷䍟?쐡ꢀ겨떐멫䑴㬣＃䐖㍙礣쏍ᶢ珞?펢歗橪ꯀ癵㪩㿵?㼘뇦?魊툎킽ﶚ꠩陃荆ଲ♠⡌ࡧ낏秼坉垡㲼튟䥏뿞嗯ꇶↃ貫聂ꊧ矨긺椻믥맺牒挻㯵諾廲㊝삖튫ଶ铷ﭶ馫젇ಃ㬅ᇄℹொ멧锿ळ㨫ȝ呼矦䖆ᇭ䄮鏮㌖?맏┼噪♐믿⛆￙욇⩺푣鎬髗楬愴⻏飵䙉ⲃ䅟䦲攚鋚닲됑ⓢ鍽㊺?㲲选钂௲㰰ﹿ᫦탛끡⠝䕒ꩴ寛踼뵽털ꔣꉎ殠酖鋂쑈抇௛型꣌࿎ꙫ磡⬗郋焎꩝Ⲱꗨ?钫삩ै쎍ꄗ嵑澱䵆⮀⌑칚褡?瀟㺥ᴰ⑒͡麏約穲叨ㅳᐺ?꫾撥甫鯝㔂鞣喦땐⟳Ġ氧쟈棘徠ዷ霫ꑮ甝ᕶ섿깨셀늊░?路싫싴Г㓙┧㹯ⱁ뇤讒㓷䨮ᛘ蟧皾ﳯ棘눈橂뎉昞筆邵넟췥?ᣡ啻ꮅ㍵罢绚벗?攓≦ᦟ࿦ጂن뺮텑消?钗躨□规ᗼ鰓缞䱬큛羅芻砕㘶㢴尛釴ꮺ鲈䜪쭬◢ϫ痨⛉᝱⤵?燋츅〴뾃⌅逿䦜푘槞鵔끾꽖ㄈﵔ瓩⠡兙涵볣泊十Ʌ頞﹢츗避⾍㐫橵㦏幖䥏徯区ꆈ운Ӳ뿘ꛠ䯙彌렘Ⱗ楇そ⛈⑐︀쓓뀦퀕␵⛠㒘ࠍ᪰懫⃦행䔰켶⯆憝脯퀶ℭ瓆鉋篠嗕⫬㛅釂奉潮삾蓔䛕敗蝶ⵓ㦰钺䌳⡥ᓹ⛡?延灼㒣䚸颐锤૾ल臨㫛䠰卲螲屸ྶ㮳㾌匾ᙸ㤱Ñ푇ﱶজ般࿺漃萣䘥㊈䆡韂줊핓⹑品셶㈽㲔즠ଂ琺ꚅ䋧石馟꠹鵱濙ꢬ重蝸ꮉ˨뷉뮉憣鍀ⶨ허뙖䈫葡펆蕌⾛挵丐ꖏ靛軼䨫鮾软蛺ܺ軦뿹夲?鹯笷寱㼂シ얻蜢됛鈐젙吿鮋蹾㙎ꚗ౯뢑ෂ?ࠅ吇괯芋嫂设ꢫ擙ᩳꁯ刘퍤０鈣낀뤥㑏粼䳃ꥮ檛豹儑괵ﴺ噿룸剦曦隲졳嬥ㅑ嚁䝹ꄦ嫦᜚?\037렯㳙䇃Ӡ앒댻驢?ᜎ鰷ᬾ䡏ɬ껕鸘딛俰퐆鼕?㎇ᄂ専떘鮫휕룯뤬쌦囷ྨ揶困鳼?畳顳঎답ᆷⴹ珨?碳崛뿱隸㾌ऑ㍃鴲匓?騞Ȱ﮸걷ꅜ季䡆┆Ү呅鰮땵鲉ퟔ璌륂潹ꯔ阰ꎵ♠ꦋ䕫ᑶꢦ爼۫ﲜ뇠嫔颹嘷❯洆㏲箆爣掩衛鮶ₔ鳑ፃᮠ砱喔꧐詟栗也谁㽜薟簱୛⩫裃䪖塃ﵫ㴌찣ꡋ䳼ၛ줫醱｝᤟䯤⠳딟찞攇駅첧ᖟ䑍᯲²⌝寔鮼홨ᛊ뱬膽䪃䈐螟쎅灘糳遯ꍋꎶ႗컓浙⸕ἶ쓇㘴Χ芉热㚷ꈃ䬷謝剀ыᦂ鮓됢蜱㍉纠?㫟䩫雖ᇄ?뻩⚖緒?⠙㑫ᑳ鏐ᴺꈯ령븬핻흳⣴颏떾뤏骯芶霡䜯┕Ꮩⵋ჏孀⨔宲뙃限㢗敜?ᜎ乎࿣땁ﲀස숳쭽軂䣨퉖ⳣꌣ㹤跪區ꪼ嶶㓞羈늶詇ﻬ﷉?ꝉ뱆΂㦁껳눊嚉㧷紷菺ዄ῏Ϧ鬳⾦竇᱀谄⸉撡ᛌ⫲噏쮱濵顉ꭅ欿曾⼸ퟚ㵖䅲믹蝹䦨퐕觵▪鲼霾媦碯命泌Ⴄ瞾ꫮ怎?ꐮᆺ菠頗婰蛪敓홳Ⱓ䵔悅뽍?ᶉ䙑瀰芫Ꞹ⁲뤙后ꄋ蟿⬅鉑鑃뼦⿍紖뤞㾕袱뎷紭罌曠謩ᾨ᥁➌摉쏨燩?඼ᆔ?숻ꡆ逘问躢䪒ﴭ젓娷￷峘㱫?ፐ眣栠ꥶ퓏벛⤡ี᜵㭒寱撏댣꧅붃ᒟﳮ⥂?促삯䑆￼䙵Ẉ慿讍즱톪댹븞륒ͱ蜅褳덚ݦ噺旍䖀庢?Ⰼ鞟?磯痏颲姖晷眮콶睲鳖→ꛄ䂚Ӗ?㠓㝊띟◛쾬緪嬢娜㯡뗹嶗뻤ꜳ袏⮅폄˕랑抮毹ᚖၪﱢ瓃噔䳬虜嬄þ䚵⮃ꇔ忺늁᭢눸Ɲ븊줾﷧洖ﺡ踼㌦땿⍸ꮃ缶듶㒜䇌嫅⏚ڭ㺼⻨ॎ廊熜⊮偘?琞䢦Ⓡ琦劆鈏䐜箭퀿쭖Γ뿧뵤樦泐醈ࡋ狢⠴巑衲ﲣ혖硨﮵楃꺮鳒?浸Ꙥ枱∖໏镅규劍ꑰ⍊쫤鳴Ꮈ䔌㊖쌱蹞ⳁ䏗憋ķ靅蠬읔䶡丒끈प饫Ⅽ氧よ튧솶閄딋᰻䮏䱓肙缮꼟郕믵ꉥ䬘ᵺ뮝몲兂䜴駨鋽䠌홂緔?媴澻岰燑縥᠀䑩ᗞ鸡䇃圉㼎鮠顎ꍴ闋ń奝ୢ磤៥亴".toCharArray()[694] ^ 0x1713);
/*     */     String str;
/*     */     int i = (str = da$gx.U("㪇櫋骮졻⊞吴뭆ᎊ囷坠ﻦ퐟ﮏ﹝⩙ꪾ猘ີ玫?꛼蜴셒ᕹ爦?늜뗍로短Ꙇ⿂ꋥ௃ꞻ먉ષ怩꼨࿎?따덨菺຿?䋦⏧廉ꪥ㌉渣駷湹苞훻䂫쓟㞣㶧㪬頀뚮䯧턣⋆?똆?㖗挜Ᏺ膗崎늼鮅⟜栙횱࿏⼁ஜ뎷䍟?쐡ꢀ겨떐멫䑴㬣＃䐖㍙礣쏍ᶢ珞?펢歗橪ꯀ癵㪩㿵?㼘뇦?魊툎킽ﶚ꠩陃荆ଲ♠⡌ࡧ낏秼坉垡㲼튟䥏뿞嗯ꇶↃ貫聂ꊧ矨긺椻믥맺牒挻㯵諾廲㊝삖튫ଶ铷ﭶ馫젇ಃ㬅ᇄℹொ멧锿ळ㨫ȝ呼矦䖆ᇭ䄮鏮㌖?맏┼噪♐믿⛆￙욇⩺푣鎬髗楬愴⻏飵䙉ⲃ䅟䦲攚鋚닲됑ⓢ鍽㊺?㲲选钂௲㰰ﹿ᫦탛끡⠝䕒ꩴ寛踼뵽털ꔣꉎ殠酖鋂쑈抇௛型꣌࿎ꙫ磡⬗郋焎꩝Ⲱꗨ?钫삩ै쎍ꄗ嵑澱䵆⮀⌑칚褡?瀟㺥ᴰ⑒͡麏約穲叨ㅳᐺ?꫾撥甫鯝㔂鞣喦땐⟳Ġ氧쟈棘徠ዷ霫ꑮ甝ᕶ섿깨셀늊░?路싫싴Г㓙┧㹯ⱁ뇤讒㓷䨮ᛘ蟧皾ﳯ棘눈橂뎉昞筆邵넟췥?ᣡ啻ꮅ㍵罢绚벗?攓≦ᦟ࿦ጂن뺮텑消?钗躨□规ᗼ鰓缞䱬큛羅芻砕㘶㢴尛釴ꮺ鲈䜪쭬◢ϫ痨⛉᝱⤵?燋츅〴뾃⌅逿䦜푘槞鵔끾꽖ㄈﵔ瓩⠡兙涵볣泊十Ʌ頞﹢츗避⾍㐫橵㦏幖䥏徯区ꆈ운Ӳ뿘ꛠ䯙彌렘Ⱗ楇そ⛈⑐︀쓓뀦퀕␵⛠㒘ࠍ᪰懫⃦행䔰켶⯆憝脯퀶ℭ瓆鉋篠嗕⫬㛅釂奉潮삾蓔䛕敗蝶ⵓ㦰钺䌳⡥ᓹ⛡?延灼㒣䚸颐锤૾ल臨㫛䠰卲螲屸ྶ㮳㾌匾ᙸ㤱Ñ푇ﱶজ般࿺漃萣䘥㊈䆡韂줊핓⹑品셶㈽㲔즠ଂ琺ꚅ䋧石馟꠹鵱濙ꢬ重蝸ꮉ˨뷉뮉憣鍀ⶨ허뙖䈫葡펆蕌⾛挵丐ꖏ靛軼䨫鮾软蛺ܺ軦뿹夲?鹯笷寱㼂シ얻蜢됛鈐젙吿鮋蹾㙎ꚗ౯뢑ෂ?ࠅ吇괯芋嫂设ꢫ擙ᩳꁯ刘퍤０鈣낀뤥㑏粼䳃ꥮ檛豹儑괵ﴺ噿룸剦曦隲졳嬥ㅑ嚁䝹ꄦ嫦᜚?\037렯㳙䇃Ӡ앒댻驢?ᜎ鰷ᬾ䡏ɬ껕鸘딛俰퐆鼕?㎇ᄂ専떘鮫휕룯뤬쌦囷ྨ揶困鳼?畳顳঎답ᆷⴹ珨?碳崛뿱隸㾌ऑ㍃鴲匓?騞Ȱ﮸걷ꅜ季䡆┆Ү呅鰮땵鲉ퟔ璌륂潹ꯔ阰ꎵ♠ꦋ䕫ᑶꢦ爼۫ﲜ뇠嫔颹嘷❯洆㏲箆爣掩衛鮶ₔ鳑ፃᮠ砱喔꧐詟栗也谁㽜薟簱୛⩫裃䪖塃ﵫ㴌찣ꡋ䳼ၛ줫醱｝᤟䯤⠳딟찞攇駅첧ᖟ䑍᯲²⌝寔鮼홨ᛊ뱬膽䪃䈐螟쎅灘糳遯ꍋꎶ႗컓浙⸕ἶ쓇㘴Χ芉热㚷ꈃ䬷謝剀ыᦂ鮓됢蜱㍉纠?㫟䩫雖ᇄ?뻩⚖緒?⠙㑫ᑳ鏐ᴺꈯ령븬핻흳⣴颏떾뤏骯芶霡䜯┕Ꮩⵋ჏孀⨔宲뙃限㢗敜?ᜎ乎࿣땁ﲀස숳쭽軂䣨퉖ⳣꌣ㹤跪區ꪼ嶶㓞羈늶詇ﻬ﷉?ꝉ뱆΂㦁껳눊嚉㧷紷菺ዄ῏Ϧ鬳⾦竇᱀谄⸉撡ᛌ⫲噏쮱濵顉ꭅ欿曾⼸ퟚ㵖䅲믹蝹䦨퐕觵▪鲼霾媦碯命泌Ⴄ瞾ꫮ怎?ꐮᆺ菠頗婰蛪敓홳Ⱓ䵔悅뽍?ᶉ䙑瀰芫Ꞹ⁲뤙后ꄋ蟿⬅鉑鑃뼦⿍紖뤞㾕袱뎷紭罌曠謩ᾨ᥁➌摉쏨燩?඼ᆔ?숻ꡆ逘问躢䪒ﴭ젓娷￷峘㱫?ፐ眣栠ꥶ퓏벛⤡ี᜵㭒寱撏댣꧅붃ᒟﳮ⥂?促삯䑆￼䙵Ẉ慿讍즱톪댹븞륒ͱ蜅褳덚ݦ噺旍䖀庢?Ⰼ鞟?磯痏颲姖晷眮콶睲鳖→ꛄ䂚Ӗ?㠓㝊띟◛쾬緪嬢娜㯡뗹嶗뻤ꜳ袏⮅폄˕랑抮毹ᚖၪﱢ瓃噔䳬虜嬄þ䚵⮃ꇔ忺늁᭢눸Ɲ븊줾﷧洖ﺡ踼㌦땿⍸ꮃ缶듶㒜䇌嫅⏚ڭ㺼⻨ॎ廊熜⊮偘?琞䢦Ⓡ琦劆鈏䐜箭퀿쭖Γ뿧뵤樦泐醈ࡋ狢⠴巑衲ﲣ혖硨﮵楃꺮鳒?浸Ꙥ枱∖໏镅규劍ꑰ⍊쫤鳴Ꮈ䔌㊖쌱蹞ⳁ䏗憋ķ靅蠬읔䶡丒끈प饫Ⅽ氧よ튧솶閄딋᰻䮏䱓肙缮꼟郕믵ꉥ䬘ᵺ뮝몲兂䜴駨鋽䠌홂緔?媴澻岰燑縥᠀䑩ᗞ鸡䇃圉㼎鮠顎ꍴ闋ń奝ୢ磤៥亴".toCharArray(), (short)16376, false, false)).length();
/*     */     byte b2 = 64;
/*     */     byte b = -1;
/*     */     while (true);
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
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
/*     */   
/*     */   private static String a(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xBB3;
/*     */     if (p[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])q.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "ⷤ쬑﵄솇ෂ昘艶怯ꘋरদ뻿ຶ鉅࿬촍澭弔䙯".toCharArray()[19] = (char)("ⷤ쬑﵄솇ෂ昘艶怯ꘋरদ뻿ຶ鉅࿬촍澭弔䙯".toCharArray()[19] ^ 0x72FC);
/*     */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("ⷤ쬑﵄솇ෂ昘艶怯ꘋरদ뻿ຶ鉅࿬촍澭弔䙯".toCharArray(), (short)26440, false, true));
/*     */           "䰌ꅻ꧱᎞".toCharArray()[0] = (char)("䰌ꅻ꧱᎞".toCharArray()[0] ^ 0x10E0);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("䰌ꅻ꧱᎞".toCharArray(), (short)13461, false, false));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           q.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "寿凣ꔗ櫃溒菎䶥뜇ᰜ渴껖핢쪰孽鹂쿛⪊".toCharArray()[6] = (char)("寿凣ꔗ櫃溒菎䶥뜇ᰜ渴껖핢쪰孽鹂쿛⪊".toCharArray()[6] ^ 0x1E52);
/*     */         throw new RuntimeException(da$gx.U("寿凣ꔗ櫃溒菎䶥뜇ᰜ渴껖핢쪰孽鹂쿛⪊".toCharArray(), (short)26610, true, true), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "䲚皥詐ힽᨉཻ⺝앸?䭾ځ".toCharArray()[0] = (char)("䲚皥詐ힽᨉཻ⺝앸?䭾ځ".toCharArray()[0] ^ 0x1A4B);
/*     */       byte[] arrayOfByte2 = o[i].getBytes(da$gx.U("䲚皥詐ힽᨉཻ⺝앸?䭾ځ".toCharArray(), (short)16643, false, true));
/*     */       p[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return p[i];
/*     */   }
/*     */   
/*     */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = a(i, l);
/*     */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*     */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*     */     return str;
/*     */   }
/*     */   
/*     */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/invoke/MutableCallSite
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: ldc_w
/*     */     //   13: ldc_w [Ljava/lang/Object;
/*     */     //   16: aload_2
/*     */     //   17: invokevirtual parameterCount : ()I
/*     */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*     */     //   23: iconst_0
/*     */     //   24: iconst_3
/*     */     //   25: anewarray java/lang/Object
/*     */     //   28: dup
/*     */     //   29: iconst_0
/*     */     //   30: aload_0
/*     */     //   31: aastore
/*     */     //   32: dup
/*     */     //   33: iconst_1
/*     */     //   34: aload_3
/*     */     //   35: aastore
/*     */     //   36: dup
/*     */     //   37: iconst_2
/*     */     //   38: aload_1
/*     */     //   39: aastore
/*     */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*     */     //   43: aload_2
/*     */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*     */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*     */     //   50: goto -> 170
/*     */     //   53: astore #4
/*     */     //   55: new java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: new java/lang/StringBuilder
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: ldc_w '푎῍ㅵ䔩⺋셯ꍏ膲︃৵변輻햚ꃼ觃噎᧙㶌ࡦ'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: iconst_3
/*     */     //   75: dup_x1
/*     */     //   76: caload
/*     */     //   77: sipush #20715
/*     */     //   80: ixor
/*     */     //   81: i2c
/*     */     //   82: castore
/*     */     //   83: sipush #16900
/*     */     //   86: iconst_1
/*     */     //   87: iconst_0
/*     */     //   88: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   94: ldc_w '甾?띓ᒇ'
/*     */     //   97: invokevirtual toCharArray : ()[C
/*     */     //   100: dup
/*     */     //   101: dup
/*     */     //   102: iconst_1
/*     */     //   103: dup_x1
/*     */     //   104: caload
/*     */     //   105: sipush #31482
/*     */     //   108: ixor
/*     */     //   109: i2c
/*     */     //   110: castore
/*     */     //   111: sipush #9145
/*     */     //   114: iconst_1
/*     */     //   115: iconst_0
/*     */     //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   122: aload_1
/*     */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   126: ldc_w '缮ፊ綊Ⓜ'
/*     */     //   129: invokevirtual toCharArray : ()[C
/*     */     //   132: dup
/*     */     //   133: dup
/*     */     //   134: iconst_1
/*     */     //   135: dup_x1
/*     */     //   136: caload
/*     */     //   137: sipush #17275
/*     */     //   140: ixor
/*     */     //   141: i2c
/*     */     //   142: castore
/*     */     //   143: sipush #23706
/*     */     //   146: iconst_1
/*     */     //   147: iconst_1
/*     */     //   148: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   154: aload_2
/*     */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   164: aload #4
/*     */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   169: athrow
/*     */     //   170: aload_3
/*     */     //   171: areturn
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	50	53	java/lang/Exception
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */