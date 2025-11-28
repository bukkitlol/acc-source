/*    */ package me.konsolas.aac;public class iw implements ik { public void forEachRemaining(Object paramObject) {
/*  2 */     forEachRemaining((IntConsumer)paramObject);
/*    */   } protected final ik a; @Deprecated
/*    */   public void forEachRemaining(Consumer paramConsumer) {
/*  5 */     this.a.forEachRemaining(paramConsumer); } public boolean hasPrevious() {
/*  6 */     return this.a.hasPrevious();
/*    */   }
/*  8 */   public int nextInt() { return this.a.nextInt(); }
/*  9 */   public void forEachRemaining(IntConsumer paramIntConsumer) { this.a.forEachRemaining(paramIntConsumer); }
/*    */   public iw(ik paramik) { this.a = paramik; }
/* 11 */   public boolean hasNext() { return this.a.hasNext(); } public int a() {
/* 12 */     return this.a.a();
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\iw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */