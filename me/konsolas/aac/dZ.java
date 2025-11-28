/* 1 */ package me.konsolas.aac;final class dz extends dd implements ea { public void forEachRemaining(Consumer paramConsumer) { forEachRemaining(paramConsumer); } final ip g; final void a(Consumer<Object> paramConsumer, int paramInt) {
/* 2 */     paramConsumer.accept(this.g.q[paramInt]); }
/* 3 */   void a(Object paramObject, int paramInt) { a((Consumer)paramObject, paramInt); }
/* 4 */   public Object next() { return this.g.q[a()]; } public dz(ip paramip) {
/* 5 */     super(paramip, null);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */