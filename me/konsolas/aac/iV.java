/*    */ package me.konsolas.aac;
/*    */ 
/*    */ 
/*    */ public class iv implements cA {
/*    */   protected final cA a;
/*    */   
/*  7 */   public iv(cA paramcA) { this.a = paramcA; }
/*  8 */   public int nextInt() { return this.a.nextInt(); } @Deprecated public void forEachRemaining(Consumer paramConsumer) { this.a.forEachRemaining(paramConsumer); }
/*    */   public boolean hasNext() { return this.a.hasNext(); }
/* 10 */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } public void forEachRemaining(IntConsumer paramIntConsumer) { this.a.forEachRemaining(paramIntConsumer); }
/*    */ 
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\iv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */