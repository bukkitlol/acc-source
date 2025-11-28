/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import com.comphenix.protocol.events.PacketContainer;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jm
/*    */ {
/*    */   private final Vector a;
/*    */   
/*    */   private jm(Vector paramVector) {
/* 15 */     this.a = paramVector;
/*    */   }
/*    */   
/*    */   private static final long b = nc.a(5679872507064985270L, 448235354422790076L, MethodHandles.lookup().lookupClass()).a(99171361404401L);
/*    */   
/*    */   public static jm a(PacketContainer paramPacketContainer, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/jm.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 110413809428601
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   17: lload_3
/*    */     //   18: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
/*    */     //   21: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   24: ifeq -> 76
/*    */     //   27: aload_0
/*    */     //   28: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
/*    */     //   31: getstatic me/konsolas/aac/gV.e : Lcom/comphenix/protocol/PacketType;
/*    */     //   34: if_acmpne -> 275
/*    */     //   37: goto -> 50
/*    */     //   40: ldc2_w 3334360901080681986
/*    */     //   43: lload_1
/*    */     //   44: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   49: athrow
/*    */     //   50: aload_0
/*    */     //   51: invokevirtual getMovingBlockPositions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
/*    */     //   54: iconst_0
/*    */     //   55: invokevirtual read : (I)Ljava/lang/Object;
/*    */     //   58: checkcast com/comphenix/protocol/wrappers/MovingObjectPositionBlock
/*    */     //   61: astore #5
/*    */     //   63: new me/konsolas/aac/jm
/*    */     //   66: dup
/*    */     //   67: aload #5
/*    */     //   69: invokevirtual getPosVector : ()Lorg/bukkit/util/Vector;
/*    */     //   72: invokespecial <init> : (Lorg/bukkit/util/Vector;)V
/*    */     //   75: areturn
/*    */     //   76: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   79: lload_1
/*    */     //   80: lconst_0
/*    */     //   81: lcmp
/*    */     //   82: ifle -> 127
/*    */     //   85: lload_3
/*    */     //   86: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   89: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   92: ifeq -> 124
/*    */     //   95: aload_0
/*    */     //   96: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
/*    */     //   99: lload_1
/*    */     //   100: lconst_0
/*    */     //   101: lcmp
/*    */     //   102: iflt -> 177
/*    */     //   105: getstatic me/konsolas/aac/gV.e : Lcom/comphenix/protocol/PacketType;
/*    */     //   108: if_acmpeq -> 169
/*    */     //   111: goto -> 124
/*    */     //   114: ldc2_w 3334360901080681986
/*    */     //   117: lload_1
/*    */     //   118: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   123: athrow
/*    */     //   124: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   127: getstatic me/konsolas/aac/kP.V1_8 : Lme/konsolas/aac/kP;
/*    */     //   130: if_acmpne -> 275
/*    */     //   133: goto -> 146
/*    */     //   136: ldc2_w 3334360901080681986
/*    */     //   139: lload_1
/*    */     //   140: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   145: athrow
/*    */     //   146: aload_0
/*    */     //   147: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
/*    */     //   150: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_PLACE : Lcom/comphenix/protocol/PacketType;
/*    */     //   153: if_acmpne -> 275
/*    */     //   156: goto -> 169
/*    */     //   159: ldc2_w 3334360901080681986
/*    */     //   162: lload_1
/*    */     //   163: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   168: athrow
/*    */     //   169: aload_0
/*    */     //   170: invokevirtual getBlockPositionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
/*    */     //   173: iconst_0
/*    */     //   174: invokevirtual read : (I)Ljava/lang/Object;
/*    */     //   177: checkcast com/comphenix/protocol/wrappers/BlockPosition
/*    */     //   180: astore #5
/*    */     //   182: aload #5
/*    */     //   184: invokevirtual getX : ()I
/*    */     //   187: i2f
/*    */     //   188: aload_0
/*    */     //   189: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
/*    */     //   192: iconst_0
/*    */     //   193: invokevirtual read : (I)Ljava/lang/Object;
/*    */     //   196: checkcast java/lang/Float
/*    */     //   199: invokevirtual floatValue : ()F
/*    */     //   202: fadd
/*    */     //   203: f2d
/*    */     //   204: dstore #6
/*    */     //   206: aload #5
/*    */     //   208: invokevirtual getY : ()I
/*    */     //   211: i2f
/*    */     //   212: aload_0
/*    */     //   213: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
/*    */     //   216: iconst_1
/*    */     //   217: invokevirtual read : (I)Ljava/lang/Object;
/*    */     //   220: checkcast java/lang/Float
/*    */     //   223: invokevirtual floatValue : ()F
/*    */     //   226: fadd
/*    */     //   227: f2d
/*    */     //   228: dstore #8
/*    */     //   230: aload #5
/*    */     //   232: invokevirtual getZ : ()I
/*    */     //   235: i2f
/*    */     //   236: aload_0
/*    */     //   237: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
/*    */     //   240: iconst_2
/*    */     //   241: invokevirtual read : (I)Ljava/lang/Object;
/*    */     //   244: checkcast java/lang/Float
/*    */     //   247: invokevirtual floatValue : ()F
/*    */     //   250: fadd
/*    */     //   251: f2d
/*    */     //   252: dstore #10
/*    */     //   254: new me/konsolas/aac/jm
/*    */     //   257: dup
/*    */     //   258: new org/bukkit/util/Vector
/*    */     //   261: dup
/*    */     //   262: dload #6
/*    */     //   264: dload #8
/*    */     //   266: dload #10
/*    */     //   268: invokespecial <init> : (DDD)V
/*    */     //   271: invokespecial <init> : (Lorg/bukkit/util/Vector;)V
/*    */     //   274: areturn
/*    */     //   275: aconst_null
/*    */     //   276: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 14
/*    */     //   #13	-> 27
/*    */     //   #10	-> 50
/*    */     //   #1	-> 63
/*    */     //   #3	-> 76
/*    */     //   #9	-> 124
/*    */     //   #4	-> 169
/*    */     //   #16	-> 182
/*    */     //   #14	-> 206
/*    */     //   #5	-> 230
/*    */     //   #11	-> 254
/*    */     //   #6	-> 275
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   14	37	40	aacinternal/v
/*    */     //   76	111	114	aacinternal/v
/*    */     //   95	133	136	aacinternal/v
/*    */     //   124	156	159	aacinternal/v
/*    */   }
/*    */   
/*    */   public Vector a() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */