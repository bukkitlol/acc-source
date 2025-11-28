/*    */ package me.konsolas.aac.timings;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import com.google.common.cache.LoadingCache;
/*    */ import java.util.List;
/*    */ import me.konsolas.aac.AAC;
/*    */ import me.konsolas.aac.a4;
/*    */ import me.konsolas.aac.c5;
/*    */ import me.konsolas.aac.fa;
/*    */ import org.bukkit.entity.LivingEntity;
/*    */ 
/*    */ public class EntityTracker implements Runnable {
/*    */   private void b(LivingEntity paramLivingEntity) {
/* 14 */     fa fa = (fa)this.d.a(paramLivingEntity.getEntityId(), paramInt -> new fa(this.c));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     fa.add(paramLivingEntity.getLocation().toVector());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     this.e.a(paramLivingEntity.getEntityId());
/*    */   }
/*    */   
/*    */   private final LoadingCache a;
/*    */   private final a4 e;
/*    */   private final c5 d;
/*    */   private final int c;
/*    */   private static String[] b;
/*    */   private static final long f;
/*    */   private static final String g;
/*    */   
/*    */   public List a(int paramInt, LivingEntity paramLivingEntity, char paramChar, short paramShort) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/timings/EntityTracker.f : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 92476044258535
/*    */     //   36: lxor
/*    */     //   37: lstore #7
/*    */     //   39: pop2
/*    */     //   40: ldc2_w -982793565912820859
/*    */     //   43: lload #5
/*    */     //   45: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   50: aload_0
/*    */     //   51: getfield d : Lme/konsolas/aac/c5;
/*    */     //   54: aload_2
/*    */     //   55: invokeinterface getEntityId : ()I
/*    */     //   60: invokeinterface a : (I)Ljava/lang/Object;
/*    */     //   65: checkcast me/konsolas/aac/fa
/*    */     //   68: astore #10
/*    */     //   70: astore #9
/*    */     //   72: aload #10
/*    */     //   74: ifnull -> 164
/*    */     //   77: lload #7
/*    */     //   79: aload_2
/*    */     //   80: invokestatic a : (JLorg/bukkit/entity/Entity;)Lme/konsolas/aac/eo;
/*    */     //   83: astore #11
/*    */     //   85: new java/util/ArrayList
/*    */     //   88: dup
/*    */     //   89: invokespecial <init> : ()V
/*    */     //   92: astore #12
/*    */     //   94: aload #10
/*    */     //   96: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   99: astore #13
/*    */     //   101: aload #13
/*    */     //   103: invokeinterface hasNext : ()Z
/*    */     //   108: ifeq -> 156
/*    */     //   111: aload #13
/*    */     //   113: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   118: checkcast org/bukkit/util/Vector
/*    */     //   121: astore #14
/*    */     //   123: aload #14
/*    */     //   125: ifnull -> 151
/*    */     //   128: new me/konsolas/aac/lq
/*    */     //   131: dup
/*    */     //   132: aload #14
/*    */     //   134: aload #11
/*    */     //   136: invokespecial <init> : (Lorg/bukkit/util/Vector;Lme/konsolas/aac/eo;)V
/*    */     //   139: astore #15
/*    */     //   141: aload #12
/*    */     //   143: aload #15
/*    */     //   145: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   150: pop
/*    */     //   151: aload #9
/*    */     //   153: ifnull -> 101
/*    */     //   156: aload #12
/*    */     //   158: iload #4
/*    */     //   160: iflt -> 118
/*    */     //   163: areturn
/*    */     //   164: aconst_null
/*    */     //   165: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 50
/*    */     //   #35	-> 72
/*    */     //   #9	-> 77
/*    */     //   #28	-> 85
/*    */     //   #17	-> 94
/*    */     //   #11	-> 123
/*    */     //   #38	-> 128
/*    */     //   #15	-> 141
/*    */     //   #31	-> 151
/*    */     //   #25	-> 156
/*    */     //   #33	-> 164
/*    */   }
/*    */   
/*    */   public void run() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/EntityTracker.f : J
/*    */     //   3: ldc2_w 133421667479484
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w -7503814818632534524
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   17: aload_0
/*    */     //   18: getfield e : Lme/konsolas/aac/a4;
/*    */     //   21: invokevirtual clear : ()V
/*    */     //   24: astore_3
/*    */     //   25: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
/*    */     //   28: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   33: astore #4
/*    */     //   35: aload #4
/*    */     //   37: invokeinterface hasNext : ()Z
/*    */     //   42: ifeq -> 84
/*    */     //   45: aload #4
/*    */     //   47: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   52: checkcast org/bukkit/entity/Player
/*    */     //   55: astore #5
/*    */     //   57: aload_0
/*    */     //   58: aload #5
/*    */     //   60: invokespecial b : (Lorg/bukkit/entity/LivingEntity;)V
/*    */     //   63: aload_3
/*    */     //   64: ifnonnull -> 105
/*    */     //   67: aload_3
/*    */     //   68: ifnull -> 35
/*    */     //   71: goto -> 84
/*    */     //   74: ldc2_w -7500405716213823920
/*    */     //   77: lload_1
/*    */     //   78: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   83: athrow
/*    */     //   84: aload_0
/*    */     //   85: getfield a : Lcom/google/common/cache/LoadingCache;
/*    */     //   88: invokeinterface asMap : ()Ljava/util/concurrent/ConcurrentMap;
/*    */     //   93: invokeinterface keySet : ()Ljava/util/Set;
/*    */     //   98: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   103: astore #4
/*    */     //   105: aload #4
/*    */     //   107: invokeinterface hasNext : ()Z
/*    */     //   112: ifeq -> 154
/*    */     //   115: aload #4
/*    */     //   117: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   122: checkcast org/bukkit/entity/LivingEntity
/*    */     //   125: astore #5
/*    */     //   127: aload_0
/*    */     //   128: aload #5
/*    */     //   130: invokespecial b : (Lorg/bukkit/entity/LivingEntity;)V
/*    */     //   133: aload_3
/*    */     //   134: ifnonnull -> 173
/*    */     //   137: aload_3
/*    */     //   138: ifnull -> 105
/*    */     //   141: goto -> 154
/*    */     //   144: ldc2_w -7500405716213823920
/*    */     //   147: lload_1
/*    */     //   148: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   153: athrow
/*    */     //   154: aload_0
/*    */     //   155: getfield d : Lme/konsolas/aac/c5;
/*    */     //   158: invokeinterface a : ()Lme/konsolas/aac/kQ;
/*    */     //   163: aload_0
/*    */     //   164: getfield e : Lme/konsolas/aac/a4;
/*    */     //   167: invokeinterface c : (Lme/konsolas/aac/n;)Z
/*    */     //   172: pop
/*    */     //   173: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 17
/*    */     //   #30	-> 25
/*    */     //   #5	-> 57
/*    */     //   #1	-> 63
/*    */     //   #4	-> 84
/*    */     //   #13	-> 127
/*    */     //   #7	-> 133
/*    */     //   #34	-> 154
/*    */     //   #8	-> 173
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   57	71	74	aacinternal/v
/*    */     //   127	141	144	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(long paramLong, LivingEntity paramLivingEntity) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/EntityTracker.f : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 4880879450241016421
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: astore #4
/*    */     //   17: aload #4
/*    */     //   19: ifnonnull -> 68
/*    */     //   22: aload_3
/*    */     //   23: instanceof org/bukkit/entity/Player
/*    */     //   26: ifne -> 78
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w 4866264120971940401
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   41: athrow
/*    */     //   42: aload_0
/*    */     //   43: getfield a : Lcom/google/common/cache/LoadingCache;
/*    */     //   46: aload_3
/*    */     //   47: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
/*    */     //   50: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   55: goto -> 68
/*    */     //   58: ldc2_w 4866264120971940401
/*    */     //   61: lload_1
/*    */     //   62: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   67: athrow
/*    */     //   68: aload_0
/*    */     //   69: getfield a : Lcom/google/common/cache/LoadingCache;
/*    */     //   72: aload_3
/*    */     //   73: invokeinterface refresh : (Ljava/lang/Object;)V
/*    */     //   78: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 17
/*    */     //   #24	-> 42
/*    */     //   #6	-> 68
/*    */     //   #26	-> 78
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	29	32	aacinternal/v
/*    */     //   22	55	58	aacinternal/v
/*    */   }
/*    */   
/*    */   public EntityTracker(AAC paramAAC, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/EntityTracker.f : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 5851937199365206255
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: aload_0
/*    */     //   16: invokespecial <init> : ()V
/*    */     //   19: astore #4
/*    */     //   21: aload_0
/*    */     //   22: invokestatic newBuilder : ()Lcom/google/common/cache/CacheBuilder;
/*    */     //   25: ldc2_w 5000
/*    */     //   28: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
/*    */     //   31: invokevirtual expireAfterWrite : (JLjava/util/concurrent/TimeUnit;)Lcom/google/common/cache/CacheBuilder;
/*    */     //   34: new me/konsolas/aac/timings/EntityTracker$1
/*    */     //   37: dup
/*    */     //   38: aload_0
/*    */     //   39: invokespecial <init> : (Lme/konsolas/aac/timings/EntityTracker;)V
/*    */     //   42: invokevirtual build : (Lcom/google/common/cache/CacheLoader;)Lcom/google/common/cache/LoadingCache;
/*    */     //   45: putfield a : Lcom/google/common/cache/LoadingCache;
/*    */     //   48: aload_0
/*    */     //   49: new me/konsolas/aac/a4
/*    */     //   52: dup
/*    */     //   53: invokespecial <init> : ()V
/*    */     //   56: putfield e : Lme/konsolas/aac/a4;
/*    */     //   59: aload_0
/*    */     //   60: new me/konsolas/aac/ip
/*    */     //   63: dup
/*    */     //   64: invokespecial <init> : ()V
/*    */     //   67: putfield d : Lme/konsolas/aac/c5;
/*    */     //   70: aload_1
/*    */     //   71: invokevirtual getServer : ()Lorg/bukkit/Server;
/*    */     //   74: invokeinterface getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
/*    */     //   79: aload_1
/*    */     //   80: aload_0
/*    */     //   81: lconst_1
/*    */     //   82: lconst_1
/*    */     //   83: invokeinterface scheduleSyncRepeatingTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;JJ)I
/*    */     //   88: pop
/*    */     //   89: aload_0
/*    */     //   90: aload_1
/*    */     //   91: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   94: getstatic me/konsolas/aac/timings/EntityTracker.g : Ljava/lang/String;
/*    */     //   97: invokevirtual getInt : (Ljava/lang/String;)I
/*    */     //   100: putfield c : I
/*    */     //   103: aload #4
/*    */     //   105: ifnull -> 134
/*    */     //   108: iconst_5
/*    */     //   109: anewarray me/konsolas/aac/aN
/*    */     //   112: ldc2_w 5818566712662919530
/*    */     //   115: lload_2
/*    */     //   116: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   121: goto -> 134
/*    */     //   124: ldc2_w 5837348396017565883
/*    */     //   127: lload_2
/*    */     //   128: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   133: athrow
/*    */     //   134: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 15
/*    */     //   #32	-> 21
/*    */     //   #36	-> 31
/*    */     //   #3	-> 42
/*    */     //   #12	-> 48
/*    */     //   #16	-> 59
/*    */     //   #22	-> 70
/*    */     //   #19	-> 89
/*    */     //   #2	-> 103
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   21	121	124	aacinternal/v
/*    */   }
/*    */   
/*    */   public static void b(String[] paramArrayOfString) {
/*    */     b = paramArrayOfString;
/*    */   }
/*    */   
/*    */   public static String[] b() {
/*    */     return b;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 3157129330155400452
/*    */     //   3: ldc2_w -2580944017223956560
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 213074909968431
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/timings/EntityTracker.f : J
/*    */     //   26: getstatic me/konsolas/aac/timings/EntityTracker.f : J
/*    */     //   29: ldc2_w 24879051812208
/*    */     //   32: lxor
/*    */     //   33: lstore_3
/*    */     //   34: ldc2_w 6129812328147563720
/*    */     //   37: lload_3
/*    */     //   38: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   43: ifnull -> 59
/*    */     //   46: iconst_5
/*    */     //   47: anewarray java/lang/String
/*    */     //   50: ldc2_w 6117569168262704873
/*    */     //   53: lload_3
/*    */     //   54: <illegal opcode> w : ([Ljava/lang/String;JJ)V
/*    */     //   59: ldc_w '⾮⟨ヱ䚣㵈젓䎀⽋ꟙಏ?绔蕗ㅎ鱜錁沍倃'
/*    */     //   62: invokevirtual toCharArray : ()[C
/*    */     //   65: dup
/*    */     //   66: dup
/*    */     //   67: bipush #11
/*    */     //   69: dup_x1
/*    */     //   70: caload
/*    */     //   71: sipush #31978
/*    */     //   74: ixor
/*    */     //   75: i2c
/*    */     //   76: castore
/*    */     //   77: sipush #15237
/*    */     //   80: iconst_5
/*    */     //   81: iconst_3
/*    */     //   82: invokestatic H : (Ljava/lang/Object;SSI)Ljava/lang/String;
/*    */     //   85: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   88: dup
/*    */     //   89: astore_0
/*    */     //   90: iconst_2
/*    */     //   91: ldc_w '⪖瓰쫣஽'
/*    */     //   94: invokevirtual toCharArray : ()[C
/*    */     //   97: dup
/*    */     //   98: dup
/*    */     //   99: iconst_2
/*    */     //   100: dup_x1
/*    */     //   101: caload
/*    */     //   102: sipush #27118
/*    */     //   105: ixor
/*    */     //   106: i2c
/*    */     //   107: castore
/*    */     //   108: sipush #15722
/*    */     //   111: iconst_0
/*    */     //   112: iconst_3
/*    */     //   113: invokestatic H : (Ljava/lang/Object;SSI)Ljava/lang/String;
/*    */     //   116: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*    */     //   119: bipush #8
/*    */     //   121: newarray byte
/*    */     //   123: dup
/*    */     //   124: iconst_0
/*    */     //   125: lload_3
/*    */     //   126: bipush #56
/*    */     //   128: lushr
/*    */     //   129: l2i
/*    */     //   130: i2b
/*    */     //   131: bastore
/*    */     //   132: iconst_1
/*    */     //   133: istore_1
/*    */     //   134: iload_1
/*    */     //   135: bipush #8
/*    */     //   137: if_icmpge -> 160
/*    */     //   140: dup
/*    */     //   141: iload_1
/*    */     //   142: lload_3
/*    */     //   143: iload_1
/*    */     //   144: bipush #8
/*    */     //   146: imul
/*    */     //   147: lshl
/*    */     //   148: bipush #56
/*    */     //   150: lushr
/*    */     //   151: l2i
/*    */     //   152: i2b
/*    */     //   153: bastore
/*    */     //   154: iinc #1, 1
/*    */     //   157: goto -> 134
/*    */     //   160: new javax/crypto/spec/DESKeySpec
/*    */     //   163: dup_x1
/*    */     //   164: swap
/*    */     //   165: invokespecial <init> : ([B)V
/*    */     //   168: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*    */     //   171: new javax/crypto/spec/IvParameterSpec
/*    */     //   174: dup
/*    */     //   175: bipush #8
/*    */     //   177: newarray byte
/*    */     //   179: invokespecial <init> : ([B)V
/*    */     //   182: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*    */     //   185: ldc_w '糺䷒᫫틡癧ﴻ?⁈툜跿㔶?傳ㅵ䛉耏䋷뮻릫궏ﲏ糰즁韰썬墏浥?䴈駠푰ⶌ騊띔⦟?㇝'
/*    */     //   188: invokevirtual toCharArray : ()[C
/*    */     //   191: dup
/*    */     //   192: dup
/*    */     //   193: bipush #18
/*    */     //   195: dup_x1
/*    */     //   196: caload
/*    */     //   197: sipush #30379
/*    */     //   200: ixor
/*    */     //   201: i2c
/*    */     //   202: castore
/*    */     //   203: sipush #23109
/*    */     //   206: iconst_0
/*    */     //   207: iconst_2
/*    */     //   208: invokestatic H : (Ljava/lang/Object;SSI)Ljava/lang/String;
/*    */     //   211: iconst_m1
/*    */     //   212: goto -> 221
/*    */     //   215: putstatic me/konsolas/aac/timings/EntityTracker.g : Ljava/lang/String;
/*    */     //   218: goto -> 268
/*    */     //   221: swap
/*    */     //   222: ldc_w '愺穟뵥⺗ᬔࣶ䈦梮'
/*    */     //   225: invokevirtual toCharArray : ()[C
/*    */     //   228: dup
/*    */     //   229: dup
/*    */     //   230: iconst_5
/*    */     //   231: dup_x1
/*    */     //   232: caload
/*    */     //   233: sipush #9772
/*    */     //   236: ixor
/*    */     //   237: i2c
/*    */     //   238: castore
/*    */     //   239: sipush #19965
/*    */     //   242: iconst_0
/*    */     //   243: iconst_0
/*    */     //   244: invokestatic H : (Ljava/lang/Object;SSI)Ljava/lang/String;
/*    */     //   247: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   250: aload_0
/*    */     //   251: swap
/*    */     //   252: invokevirtual doFinal : ([B)[B
/*    */     //   255: astore_2
/*    */     //   256: aload_2
/*    */     //   257: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   260: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   263: swap
/*    */     //   264: pop
/*    */     //   265: goto -> 215
/*    */     //   268: return
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
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\timings\EntityTracker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */