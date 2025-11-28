/*    */ package me.konsolas.aac;final class b8 extends bS implements kl { final ip b;
/*  2 */   public Spliterator spliterator() { return a(); }
/*    */   public void forEach(Consumer<h2> paramConsumer) { 
/*  4 */     try { if (this.b.k) paramConsumer.accept(new h2(this.b.t[this.b.o], this.b.q[this.b.o]));  } catch (v v) { throw b(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     int i = this.b.o; while (true) { try { while (i-- != 0) { if (this.b.t[i] != 0) paramConsumer.accept(new h2(this.b.t[i], this.b.q[i]));  }  } catch (v v) { throw b(null); }  break; }  }
/* 55 */   b8(ip paramip, bu parambu) { this(paramip); } public ea b() { return new dL(this.b, null); } public int size() { return this.b.r; } public void a(Consumer<h2> paramConsumer) { h2 h2 = new h2(); try { if (this.b.k) { h2.b = this.b.t[this.b.o]; h2.a = this.b.q[this.b.o]; paramConsumer.accept(h2); }  } catch (v v) { throw b(null); }  int i = this.b.o; while (true) { try { while (i-- != 0) { if (this.b.t[i] != 0) { h2.b = this.b.t[i]; h2.a = this.b.q[i]; paramConsumer.accept(h2); }  }  } catch (v v) { throw b(null); }  break; }  } public boolean contains(Object paramObject) { try { if (!(paramObject instanceof Map.Entry)) return false;  } catch (v v) { throw b(null); }  Map.Entry entry = (Map.Entry)paramObject; try { if (entry.getKey() != null) try { if (entry.getKey() instanceof Integer) { int j, k, i = ((Integer)entry.getKey()).intValue(); Object object = entry.getValue(); try { if (i == 0) { try { if (this.b.k) try { if (Objects.equals(this.b.q[this.b.o], object)); } catch (v v) { throw b(null); }   } catch (v v) { throw b(null); }  return false; }  } catch (v v) { throw b(null); }  int[] arrayOfInt = this.b.t; try { if ((j = arrayOfInt[k = i3.c(i) & this.b.v]) == 0) return false;  } catch (v v) { throw b(null); }  try { if (i == j) return Objects.equals(this.b.q[k], object);  } catch (v v) { throw b(null); }  while (true) { if ((j = arrayOfInt[k = k + 1 & this.b.v]) == 0) return false;  if (i == j) return Objects.equals(this.b.q[k], object);  }  }  return false; } catch (v v) { throw b(null); }   } catch (v v) { throw b(null); }  return false; }
/*    */   public ea a() { return new d3(this.b, null); } public boolean remove(Object paramObject) { try { if (!(paramObject instanceof Map.Entry)) return false;  } catch (v v) { throw b(null); }  Map.Entry entry = (Map.Entry)paramObject; try { if (entry.getKey() != null)
/* 57 */         try { if (entry.getKey() instanceof Integer) { int j, k, i = ((Integer)entry.getKey()).intValue(); Object object = entry.getValue(); try { if (i == 0) { try { if (this.b.k) try { if (Objects.equals(this.b.q[this.b.o], object)) { ip.a(this.b); return true; }  } catch (v v) { throw b(null); }   } catch (v v) { throw b(null); }  return false; }  } catch (v v) { throw b(null); }  int[] arrayOfInt = this.b.t; try { if ((j = arrayOfInt[k = i3.c(i) & this.b.v]) == 0) return false;  } catch (v v) { throw b(null); }  try { if (j == i) { try { if (Objects.equals(this.b.q[k], object)) { ip.a(this.b, k); return true; }  } catch (v v) { throw b(null); }  return false; }  } catch (v v) { throw b(null); }  while (true) { if ((j = arrayOfInt[k = k + 1 & this.b.v]) == 0) return false;  if (j == i) if (Objects.equals(this.b.q[k], object)) break;   }  ip.a(this.b, k); return true; }  return false; } catch (v v) { throw b(null); }   } catch (v v) { throw b(null); }  return false; } public void clear() { this.b.clear(); } private b8(ip paramip) {} public ae a() { return new gy(this.b); }
/* 58 */   public Iterator iterator() { return b(); }
/*    */ 
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */