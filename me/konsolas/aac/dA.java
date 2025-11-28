/* 1 */ package me.konsolas.aac;public class da implements m4 { public Object next() { return this.a.next(); }
/*   */    protected final m4 a; public Object previous() {
/* 3 */     return this.a.previous(); } public boolean hasPrevious() {
/* 4 */     return this.a.hasPrevious();
/*   */   }
/* 6 */   public da(m4 paramm4) { this.a = paramm4; }
/* 7 */   public boolean hasNext() { return this.a.hasNext(); } public void forEachRemaining(Consumer<? super E> paramConsumer) {
/* 8 */     this.a.forEachRemaining(paramConsumer);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\da.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */