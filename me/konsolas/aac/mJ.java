/* 1 */ package me.konsolas.aac;public class mj extends mT implements RandomAccess, Serializable { protected mj(f8 paramf8) { super(paramf8); } private static final long serialVersionUID = 0L; public f8 b(int paramInt1, int paramInt2) {
/* 2 */     synchronized (this.b) { return new mj(this.c.b(paramInt1, paramInt2), this.b); }
/* 3 */      } protected mj(f8 paramf8, Object paramObject) { super(paramf8, paramObject); }
/*   */    public List subList(int paramInt1, int paramInt2) {
/* 5 */     return b(paramInt1, paramInt2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */