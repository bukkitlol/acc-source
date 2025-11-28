/*  1 */ package me.konsolas.aac;public class bl implements i0 { public Object next() { return this.a.next(); } protected final i0 a; public int previousIndex() {
/*  2 */     return this.a.previousIndex(); }
/*  3 */   public boolean hasPrevious() { return this.a.hasPrevious(); } public boolean hasNext() {
/*  4 */     return this.a.hasNext();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public bl(i0 parami0) {
/* 10 */     this.a = parami0;
/*    */   }
/*    */   
/*    */   public Object previous() {
/*    */     return this.a.previous();
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Consumer<? super E> paramConsumer) {
/*    */     this.a.forEachRemaining(paramConsumer);
/*    */   }
/*    */   
/*    */   public int nextIndex() {
/*    */     return this.a.nextIndex();
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */