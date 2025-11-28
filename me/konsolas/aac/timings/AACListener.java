/*    */ package me.konsolas.aac.timings;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import com.comphenix.protocol.events.PacketEvent;
/*    */ import me.konsolas.aac.iS;
/*    */ import org.bukkit.block.BlockFace;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.block.BlockPistonExtendEvent;
/*    */ import org.bukkit.event.block.BlockPistonRetractEvent;
/*    */ import org.bukkit.event.player.PlayerRespawnEvent;
/*    */ import org.bukkit.event.player.PlayerTeleportEvent;
/*    */ 
/*    */ public class AACListener extends PacketAdapter implements Listener {
/*    */   private final Class a;
/*    */   private final iS b;
/*    */   private static final long c = nc.a(5866300278255770534L, 8655499694415763256L, MethodHandles.lookup().lookupClass()).a(248536919458470L);
/*    */   
/*    */   @EventHandler(priority = EventPriority.LOW)
/*    */   public void a(EntityShootBowEvent paramEntityShootBowEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 93631420192928
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 127143200853677
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: ldc2_w 6419058001583519948
/*    */     //   46: lload_2
/*    */     //   47: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   52: astore #7
/*    */     //   54: aload_1
/*    */     //   55: aload #7
/*    */     //   57: ifnonnull -> 96
/*    */     //   60: invokevirtual getEntity : ()Lorg/bukkit/entity/LivingEntity;
/*    */     //   63: instanceof org/bukkit/entity/Player
/*    */     //   66: ifeq -> 142
/*    */     //   69: goto -> 82
/*    */     //   72: ldc2_w 6419316923010915496
/*    */     //   75: lload_2
/*    */     //   76: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   81: athrow
/*    */     //   82: aload_1
/*    */     //   83: goto -> 96
/*    */     //   86: ldc2_w 6419316923010915496
/*    */     //   89: lload_2
/*    */     //   90: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   95: athrow
/*    */     //   96: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   99: ldc_w org/bukkit/event/entity/EntityShootBowEvent
/*    */     //   102: if_acmpne -> 142
/*    */     //   105: aload_0
/*    */     //   106: getfield b : Lme/konsolas/aac/iS;
/*    */     //   109: aload_1
/*    */     //   110: invokevirtual getEntity : ()Lorg/bukkit/entity/LivingEntity;
/*    */     //   113: iload #4
/*    */     //   115: swap
/*    */     //   116: checkcast org/bukkit/entity/Player
/*    */     //   119: aload_1
/*    */     //   120: iload #5
/*    */     //   122: i2s
/*    */     //   123: iload #6
/*    */     //   125: i2c
/*    */     //   126: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   129: goto -> 142
/*    */     //   132: ldc2_w 6419316923010915496
/*    */     //   135: lload_2
/*    */     //   136: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   141: athrow
/*    */     //   142: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #4	-> 54
/*    */     //   #66	-> 105
/*    */     //   #9	-> 142
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   54	69	72	aacinternal/v
/*    */     //   60	83	86	aacinternal/v
/*    */     //   96	129	132	aacinternal/v
/*    */   }
/*    */   
/*    */   @EventHandler(priority = EventPriority.MONITOR)
/* 25 */   public void a(PlayerRespawnEvent paramPlayerRespawnEvent) { long l = c ^ 0x48744DB7619AL; int i = (int)((l ^ 0x6EFEDB6FB797L) >>> 32L), j = (int)((l ^ 0x6EFEDB6FB797L) << 32L >>> 48L), k = (int)((l ^ 0x6EFEDB6FB797L) << 48L >>> 48L); l ^ 0x6EFEDB6FB797L; this.b.a(i, paramPlayerRespawnEvent.getPlayer(), (Event)paramPlayerRespawnEvent, (short)j, (char)k); }
/*    */   private void a(BlockFace paramBlockFace, List paramList, long paramLong, Block paramBlock) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: ldc2_w -7274646449793172782
/*    */     //   9: lload_3
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: new org/bukkit/util/Vector
/*    */     //   18: dup
/*    */     //   19: aload_1
/*    */     //   20: invokevirtual getModX : ()I
/*    */     //   23: aload_1
/*    */     //   24: invokevirtual getModY : ()I
/*    */     //   27: aload_1
/*    */     //   28: invokevirtual getModZ : ()I
/*    */     //   31: invokespecial <init> : (III)V
/*    */     //   34: astore #7
/*    */     //   36: astore #6
/*    */     //   38: aload_2
/*    */     //   39: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   44: astore #8
/*    */     //   46: aload #8
/*    */     //   48: invokeinterface hasNext : ()Z
/*    */     //   53: ifeq -> 250
/*    */     //   56: aload #8
/*    */     //   58: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   63: checkcast org/bukkit/block/Block
/*    */     //   66: astore #9
/*    */     //   68: aload #9
/*    */     //   70: invokeinterface getX : ()I
/*    */     //   75: aload_1
/*    */     //   76: invokevirtual getModX : ()I
/*    */     //   79: iadd
/*    */     //   80: aload #9
/*    */     //   82: invokeinterface getY : ()I
/*    */     //   87: aload_1
/*    */     //   88: invokevirtual getModY : ()I
/*    */     //   91: iadd
/*    */     //   92: aload #9
/*    */     //   94: invokeinterface getZ : ()I
/*    */     //   99: aload_1
/*    */     //   100: invokevirtual getModZ : ()I
/*    */     //   103: iadd
/*    */     //   104: invokestatic b : (III)Lme/konsolas/aac/lq;
/*    */     //   107: astore #10
/*    */     //   109: aload #6
/*    */     //   111: lload_3
/*    */     //   112: lconst_0
/*    */     //   113: lcmp
/*    */     //   114: ifle -> 122
/*    */     //   117: ifnonnull -> 309
/*    */     //   120: aload #6
/*    */     //   122: lload_3
/*    */     //   123: lconst_0
/*    */     //   124: lcmp
/*    */     //   125: iflt -> 207
/*    */     //   128: ifnonnull -> 205
/*    */     //   131: goto -> 144
/*    */     //   134: ldc2_w -7274529331022471498
/*    */     //   137: lload_3
/*    */     //   138: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   143: athrow
/*    */     //   144: lload_3
/*    */     //   145: lconst_0
/*    */     //   146: lcmp
/*    */     //   147: ifle -> 232
/*    */     //   150: aload #9
/*    */     //   152: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   157: getstatic org/bukkit/Material.SLIME_BLOCK : Lorg/bukkit/Material;
/*    */     //   160: if_acmpne -> 216
/*    */     //   163: goto -> 176
/*    */     //   166: ldc2_w -7274529331022471498
/*    */     //   169: lload_3
/*    */     //   170: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   175: athrow
/*    */     //   176: aload_0
/*    */     //   177: getfield b : Lme/konsolas/aac/iS;
/*    */     //   180: invokevirtual b : ()Lcom/google/common/cache/Cache;
/*    */     //   183: aload #10
/*    */     //   185: aload #7
/*    */     //   187: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   192: goto -> 205
/*    */     //   195: ldc2_w -7274529331022471498
/*    */     //   198: lload_3
/*    */     //   199: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   204: athrow
/*    */     //   205: aload #6
/*    */     //   207: lload_3
/*    */     //   208: lconst_0
/*    */     //   209: lcmp
/*    */     //   210: ifle -> 247
/*    */     //   213: ifnull -> 245
/*    */     //   216: aload_0
/*    */     //   217: getfield b : Lme/konsolas/aac/iS;
/*    */     //   220: invokevirtual a : ()Lcom/google/common/cache/Cache;
/*    */     //   223: aload #10
/*    */     //   225: aload #7
/*    */     //   227: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   232: goto -> 245
/*    */     //   235: ldc2_w -7274529331022471498
/*    */     //   238: lload_3
/*    */     //   239: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   244: athrow
/*    */     //   245: aload #6
/*    */     //   247: ifnull -> 46
/*    */     //   250: aload_0
/*    */     //   251: getfield b : Lme/konsolas/aac/iS;
/*    */     //   254: invokevirtual a : ()Lcom/google/common/cache/Cache;
/*    */     //   257: aload #5
/*    */     //   259: invokeinterface getX : ()I
/*    */     //   264: aload_1
/*    */     //   265: invokevirtual getModX : ()I
/*    */     //   268: iadd
/*    */     //   269: aload #5
/*    */     //   271: invokeinterface getY : ()I
/*    */     //   276: aload_1
/*    */     //   277: invokevirtual getModY : ()I
/*    */     //   280: iadd
/*    */     //   281: aload #5
/*    */     //   283: invokeinterface getZ : ()I
/*    */     //   288: aload_1
/*    */     //   289: invokevirtual getModZ : ()I
/*    */     //   292: iadd
/*    */     //   293: invokestatic b : (III)Lme/konsolas/aac/lq;
/*    */     //   296: aload #7
/*    */     //   298: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   303: lload_3
/*    */     //   304: lconst_0
/*    */     //   305: lcmp
/*    */     //   306: iflt -> 309
/*    */     //   309: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 15
/*    */     //   #48	-> 38
/*    */     //   #63	-> 68
/*    */     //   #16	-> 82
/*    */     //   #15	-> 94
/*    */     //   #11	-> 104
/*    */     //   #6	-> 109
/*    */     //   #52	-> 216
/*    */     //   #65	-> 245
/*    */     //   #27	-> 250
/*    */     //   #49	-> 271
/*    */     //   #46	-> 283
/*    */     //   #32	-> 293
/*    */     //   #42	-> 309
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   109	131	134	aacinternal/v
/*    */     //   120	163	166	aacinternal/v
/*    */     //   144	192	195	aacinternal/v
/*    */     //   205	232	235	aacinternal/v }
/*    */   private static List a(long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: lload_0
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 6280318963529
/*    */     //   11: lxor
/*    */     //   12: lstore_2
/*    */     //   13: pop2
/*    */     //   14: new java/util/ArrayList
/*    */     //   17: dup
/*    */     //   18: invokespecial <init> : ()V
/*    */     //   21: astore #5
/*    */     //   23: ldc2_w -3991764709993207485
/*    */     //   26: lload_0
/*    */     //   27: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   32: aload #5
/*    */     //   34: getstatic me/konsolas/aac/gV.f : Lcom/comphenix/protocol/PacketType;
/*    */     //   37: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   42: pop
/*    */     //   43: aload #5
/*    */     //   45: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
/*    */     //   48: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   53: pop
/*    */     //   54: astore #4
/*    */     //   56: aload #5
/*    */     //   58: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
/*    */     //   61: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   66: pop
/*    */     //   67: aload #5
/*    */     //   69: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
/*    */     //   72: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   77: pop
/*    */     //   78: aload #5
/*    */     //   80: getstatic com/comphenix/protocol/PacketType$Play$Server.POSITION : Lcom/comphenix/protocol/PacketType;
/*    */     //   83: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   88: pop
/*    */     //   89: aload #5
/*    */     //   91: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_VELOCITY : Lcom/comphenix/protocol/PacketType;
/*    */     //   94: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   99: pop
/*    */     //   100: aload #5
/*    */     //   102: getstatic com/comphenix/protocol/PacketType$Play$Server.BLOCK_CHANGE : Lcom/comphenix/protocol/PacketType;
/*    */     //   105: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   110: pop
/*    */     //   111: aload #5
/*    */     //   113: getstatic com/comphenix/protocol/PacketType$Play$Server.MULTI_BLOCK_CHANGE : Lcom/comphenix/protocol/PacketType;
/*    */     //   116: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   121: pop
/*    */     //   122: aload #5
/*    */     //   124: getstatic com/comphenix/protocol/PacketType$Play$Server.MAP_CHUNK : Lcom/comphenix/protocol/PacketType;
/*    */     //   127: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   132: pop
/*    */     //   133: aload #5
/*    */     //   135: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
/*    */     //   138: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   143: pop
/*    */     //   144: aload #5
/*    */     //   146: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
/*    */     //   149: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   154: pop
/*    */     //   155: aload #5
/*    */     //   157: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_PLACE : Lcom/comphenix/protocol/PacketType;
/*    */     //   160: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   165: pop
/*    */     //   166: aload #5
/*    */     //   168: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
/*    */     //   171: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   176: pop
/*    */     //   177: aload #5
/*    */     //   179: getstatic com/comphenix/protocol/PacketType$Play$Client.ARM_ANIMATION : Lcom/comphenix/protocol/PacketType;
/*    */     //   182: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   187: pop
/*    */     //   188: aload #5
/*    */     //   190: aload #4
/*    */     //   192: ifnonnull -> 278
/*    */     //   195: getstatic com/comphenix/protocol/PacketType$Play$Client.ABILITIES : Lcom/comphenix/protocol/PacketType;
/*    */     //   198: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   203: pop
/*    */     //   204: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   207: lload_2
/*    */     //   208: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   211: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   214: ifeq -> 276
/*    */     //   217: goto -> 230
/*    */     //   220: ldc2_w -3991725698160947929
/*    */     //   223: lload_0
/*    */     //   224: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   229: athrow
/*    */     //   230: aload #5
/*    */     //   232: getstatic com/comphenix/protocol/PacketType$Play$Client.VEHICLE_MOVE : Lcom/comphenix/protocol/PacketType;
/*    */     //   235: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   240: pop
/*    */     //   241: aload #5
/*    */     //   243: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ITEM : Lcom/comphenix/protocol/PacketType;
/*    */     //   246: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   251: pop
/*    */     //   252: aload #5
/*    */     //   254: getstatic com/comphenix/protocol/PacketType$Play$Client.TELEPORT_ACCEPT : Lcom/comphenix/protocol/PacketType;
/*    */     //   257: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   262: pop
/*    */     //   263: goto -> 276
/*    */     //   266: ldc2_w -3991725698160947929
/*    */     //   269: lload_0
/*    */     //   270: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   275: athrow
/*    */     //   276: aload #5
/*    */     //   278: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 14
/*    */     //   #18	-> 32
/*    */     //   #30	-> 43
/*    */     //   #5	-> 56
/*    */     //   #34	-> 67
/*    */     //   #67	-> 78
/*    */     //   #36	-> 89
/*    */     //   #60	-> 100
/*    */     //   #55	-> 111
/*    */     //   #19	-> 122
/*    */     //   #56	-> 133
/*    */     //   #14	-> 144
/*    */     //   #7	-> 155
/*    */     //   #44	-> 166
/*    */     //   #28	-> 177
/*    */     //   #62	-> 188
/*    */     //   #70	-> 204
/*    */     //   #2	-> 230
/*    */     //   #73	-> 241
/*    */     //   #26	-> 252
/*    */     //   #40	-> 276
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   56	217	220	aacinternal/v
/*    */     //   195	263	266	aacinternal/v }
/*    */   @EventHandler(priority = EventPriority.LOW)
/*    */   public void a(PlayerMoveEvent paramPlayerMoveEvent) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 2585849390690
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 40478027985007
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   47: ldc_w org/bukkit/event/player/PlayerMoveEvent
/*    */     //   50: if_acmpne -> 87
/*    */     //   53: aload_0
/*    */     //   54: getfield b : Lme/konsolas/aac/iS;
/*    */     //   57: aload_1
/*    */     //   58: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   61: iload #4
/*    */     //   63: swap
/*    */     //   64: aload_1
/*    */     //   65: iload #5
/*    */     //   67: i2s
/*    */     //   68: iload #6
/*    */     //   70: i2c
/*    */     //   71: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   74: goto -> 87
/*    */     //   77: ldc2_w 7482635988054844010
/*    */     //   80: lload_2
/*    */     //   81: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   86: athrow
/*    */     //   87: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 43
/*    */     //   #3	-> 87
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	74	77	aacinternal/v }
/*    */   @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
/*    */   public void a(BlockBreakEvent paramBlockBreakEvent) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 128904121489028
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 92042265346185
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   47: ldc org/bukkit/event/block/BlockBreakEvent
/*    */     //   49: if_acmpne -> 86
/*    */     //   52: aload_0
/*    */     //   53: getfield b : Lme/konsolas/aac/iS;
/*    */     //   56: aload_1
/*    */     //   57: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   60: iload #4
/*    */     //   62: swap
/*    */     //   63: aload_1
/*    */     //   64: iload #5
/*    */     //   66: i2s
/*    */     //   67: iload #6
/*    */     //   69: i2c
/*    */     //   70: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w 1671361782472331916
/*    */     //   79: lload_2
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 43
/*    */     //   #61	-> 86
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	73	76	aacinternal/v }
/*    */   @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
/*    */   public void a(BlockDamageEvent paramBlockDamageEvent) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 116564879805100
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 84153284025505
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   47: ldc org/bukkit/event/block/BlockDamageEvent
/*    */     //   49: if_acmpne -> 86
/*    */     //   52: aload_0
/*    */     //   53: getfield b : Lme/konsolas/aac/iS;
/*    */     //   56: aload_1
/*    */     //   57: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   60: iload #4
/*    */     //   62: swap
/*    */     //   63: aload_1
/*    */     //   64: iload #5
/*    */     //   66: i2s
/*    */     //   67: iload #6
/*    */     //   69: i2c
/*    */     //   70: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w 799883235796668068
/*    */     //   79: lload_2
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 43
/*    */     //   #8	-> 86
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	73	76	aacinternal/v }
/*    */   @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
/*    */   public void a(PlayerInteractEvent paramPlayerInteractEvent) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 89464777177153
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 131755413319244
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   47: ldc org/bukkit/event/player/PlayerInteractEvent
/*    */     //   49: if_acmpne -> 86
/*    */     //   52: aload_0
/*    */     //   53: getfield b : Lme/konsolas/aac/iS;
/*    */     //   56: aload_1
/*    */     //   57: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   60: iload #4
/*    */     //   62: swap
/*    */     //   63: aload_1
/*    */     //   64: iload #5
/*    */     //   66: i2s
/*    */     //   67: iload #6
/*    */     //   69: i2c
/*    */     //   70: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w 8787924533017394249
/*    */     //   79: lload_2
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 43
/*    */     //   #10	-> 86
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	73	76	aacinternal/v }
/*    */   public void onPacketReceiving(PacketEvent paramPacketEvent) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 112311052295279
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 112101165304167
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: pop2
/*    */     //   17: ldc2_w 6762753194384276483
/*    */     //   20: lload_2
/*    */     //   21: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   26: astore #6
/*    */     //   28: aload_0
/*    */     //   29: aload #6
/*    */     //   31: ifnonnull -> 72
/*    */     //   34: getfield a : Ljava/lang/Class;
/*    */     //   37: aload_1
/*    */     //   38: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   41: invokevirtual isInstance : (Ljava/lang/Object;)Z
/*    */     //   44: ifne -> 71
/*    */     //   47: goto -> 60
/*    */     //   50: ldc2_w 6762943972946090087
/*    */     //   53: lload_2
/*    */     //   54: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   59: athrow
/*    */     //   60: return
/*    */     //   61: ldc2_w 6762943972946090087
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: getfield b : Lme/konsolas/aac/iS;
/*    */     //   75: lload #4
/*    */     //   77: aload_1
/*    */     //   78: invokevirtual a : (JLcom/comphenix/protocol/events/PacketEvent;)V
/*    */     //   81: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 28
/*    */     //   #69	-> 71
/*    */     //   #38	-> 81
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   28	47	50	aacinternal/v
/*    */     //   34	61	61	aacinternal/v } @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
/* 37 */   public void a(BlockPistonExtendEvent paramBlockPistonExtendEvent) { long l1 = c ^ 0x6BB529839F6L, l2 = l1 ^ 0x344EA0FAA222L; BlockFace blockFace = paramBlockPistonExtendEvent.getDirection();
/*    */     a(blockFace, paramBlockPistonExtendEvent.getBlocks(), l2, paramBlockPistonExtendEvent.getBlock()); }
/*    */   
/*    */   public void onPacketSending(PacketEvent paramPacketEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 27908888770195
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 29360013042587
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: pop2
/*    */     //   17: ldc2_w -5249403362189814017
/*    */     //   20: lload_2
/*    */     //   21: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   26: astore #6
/*    */     //   28: aload_0
/*    */     //   29: aload #6
/*    */     //   31: ifnonnull -> 72
/*    */     //   34: getfield a : Ljava/lang/Class;
/*    */     //   37: aload_1
/*    */     //   38: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   41: invokevirtual isInstance : (Ljava/lang/Object;)Z
/*    */     //   44: ifne -> 71
/*    */     //   47: goto -> 60
/*    */     //   50: ldc2_w -5249311566283345253
/*    */     //   53: lload_2
/*    */     //   54: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   59: athrow
/*    */     //   60: return
/*    */     //   61: ldc2_w -5249311566283345253
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: getfield b : Lme/konsolas/aac/iS;
/*    */     //   75: lload #4
/*    */     //   77: aload_1
/*    */     //   78: invokevirtual a : (JLcom/comphenix/protocol/events/PacketEvent;)V
/*    */     //   81: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 28
/*    */     //   #53	-> 71
/*    */     //   #57	-> 81
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   28	47	50	aacinternal/v
/*    */     //   34	61	61	aacinternal/v
/*    */   }
/*    */   @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
/*    */   public void a(BlockPistonRetractEvent paramBlockPistonRetractEvent) {
/* 45 */     long l1 = c ^ 0x2BD101E8C888L, l2 = l1 ^ 0x1924F38A535CL; BlockFace blockFace = paramBlockPistonRetractEvent.getDirection().getOppositeFace();
/*    */     a(blockFace, paramBlockPistonRetractEvent.getBlocks(), l2, paramBlockPistonRetractEvent.getBlock());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AACListener(long paramLong, iS paramiS)
/*    */   {
/* 58 */     super((Plugin)paramiS.a(), ListenerPriority.LOW, a(l1), new ListenerOptions[] { ListenerOptions.ASYNC });
/*    */     this.a = aO.i(l2);
/*    */     this.b = paramiS; } @EventHandler(priority = EventPriority.LOW)
/*    */   public void a(EntityRegainHealthEvent paramEntityRegainHealthEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 68742564240674
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 26456843848495
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: ldc2_w 6671933945905855822
/*    */     //   46: lload_2
/*    */     //   47: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   52: astore #7
/*    */     //   54: aload_1
/*    */     //   55: aload #7
/*    */     //   57: ifnonnull -> 96
/*    */     //   60: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
/*    */     //   63: instanceof org/bukkit/entity/Player
/*    */     //   66: ifeq -> 142
/*    */     //   69: goto -> 82
/*    */     //   72: ldc2_w 6671965295284656426
/*    */     //   75: lload_2
/*    */     //   76: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   81: athrow
/*    */     //   82: aload_1
/*    */     //   83: goto -> 96
/*    */     //   86: ldc2_w 6671965295284656426
/*    */     //   89: lload_2
/*    */     //   90: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   95: athrow
/*    */     //   96: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   99: ldc_w org/bukkit/event/entity/EntityRegainHealthEvent
/*    */     //   102: if_acmpne -> 142
/*    */     //   105: aload_0
/*    */     //   106: getfield b : Lme/konsolas/aac/iS;
/*    */     //   109: aload_1
/*    */     //   110: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
/*    */     //   113: iload #4
/*    */     //   115: swap
/*    */     //   116: checkcast org/bukkit/entity/Player
/*    */     //   119: aload_1
/*    */     //   120: iload #5
/*    */     //   122: i2s
/*    */     //   123: iload #6
/*    */     //   125: i2c
/*    */     //   126: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   129: goto -> 142
/*    */     //   132: ldc2_w 6671965295284656426
/*    */     //   135: lload_2
/*    */     //   136: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   141: athrow
/*    */     //   142: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 54
/*    */     //   #43	-> 105
/*    */     //   #50	-> 142
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   54	69	72	aacinternal/v
/*    */     //   60	83	86	aacinternal/v
/*    */     //   96	129	132	aacinternal/v
/*    */   } @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
/*    */   public void a(BlockPlaceEvent paramBlockPlaceEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 36530116478218
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 8468639847175
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   47: ldc org/bukkit/event/block/BlockPlaceEvent
/*    */     //   49: if_acmpne -> 86
/*    */     //   52: aload_0
/*    */     //   53: getfield b : Lme/konsolas/aac/iS;
/*    */     //   56: aload_1
/*    */     //   57: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   60: iload #4
/*    */     //   62: swap
/*    */     //   63: aload_1
/*    */     //   64: iload #5
/*    */     //   66: i2s
/*    */     //   67: iload #6
/*    */     //   69: i2c
/*    */     //   70: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w -4269541458577489662
/*    */     //   79: lload_2
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #64	-> 43
/*    */     //   #24	-> 86
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	73	76	aacinternal/v
/*    */   } @EventHandler(priority = EventPriority.LOW)
/*    */   public void a(PlayerItemConsumeEvent paramPlayerItemConsumeEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/timings/AACListener.c : J
/*    */     //   3: ldc2_w 17095967157088
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 45109535341933
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: l2i
/*    */     //   19: istore #4
/*    */     //   21: dup2
/*    */     //   22: bipush #32
/*    */     //   24: lshl
/*    */     //   25: bipush #48
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #5
/*    */     //   31: dup2
/*    */     //   32: bipush #48
/*    */     //   34: lshl
/*    */     //   35: bipush #48
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #6
/*    */     //   41: pop2
/*    */     //   42: pop2
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   47: ldc_w org/bukkit/event/player/PlayerItemConsumeEvent
/*    */     //   50: if_acmpne -> 87
/*    */     //   53: aload_0
/*    */     //   54: getfield b : Lme/konsolas/aac/iS;
/*    */     //   57: aload_1
/*    */     //   58: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
/*    */     //   61: iload #4
/*    */     //   63: swap
/*    */     //   64: aload_1
/*    */     //   65: iload #5
/*    */     //   67: i2s
/*    */     //   68: iload #6
/*    */     //   70: i2c
/*    */     //   71: invokevirtual a : (ILorg/bukkit/entity/Player;Lorg/bukkit/event/Event;SC)V
/*    */     //   74: goto -> 87
/*    */     //   77: ldc2_w -6136818463294951576
/*    */     //   80: lload_2
/*    */     //   81: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   86: athrow
/*    */     //   87: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #68	-> 43
/*    */     //   #51	-> 87
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	74	77	aacinternal/v
/*    */   } @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
/*    */   public void a(PlayerTeleportEvent paramPlayerTeleportEvent) {
/* 71 */     long l = c ^ 0x20D505F69CEBL; int i = (int)((l ^ 0x65F932E4AE6L) >>> 32L), j = (int)((l ^ 0x65F932E4AE6L) << 32L >>> 48L), k = (int)((l ^ 0x65F932E4AE6L) << 48L >>> 48L); l ^ 0x65F932E4AE6L; this.b.a(i, paramPlayerTeleportEvent.getPlayer(), (Event)paramPlayerTeleportEvent, (short)j, (char)k);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\timings\AACListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */