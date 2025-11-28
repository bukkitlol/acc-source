/*   */ package me.konsolas.aac;public class ev implements ea { public boolean hasNext() {
/* 2 */     return this.a.hasNext();
/*   */   }
/*   */   protected final ea a;
/*   */   
/*   */   public ev(ea paramea) {
/* 7 */     this.a = paramea;
/*   */   }
/*   */   
/*   */   public Object next() {
/*   */     return this.a.next();
/*   */   }
/*   */   
/*   */   public void forEachRemaining(Consumer<? super E> paramConsumer) {
/*   */     this.a.forEachRemaining(paramConsumer);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */