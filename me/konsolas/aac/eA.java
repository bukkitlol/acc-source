package me.konsolas.aac;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public interface ea extends Iterator {
  public static final long i = nc.a(1102258288210049558L, 4291151508341838920L, MethodHandles.lookup().lookupClass()).a(76600347256509L);
  
  default int b(int paramInt) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/ea.i : J
    //   3: ldc2_w 90358400200044
    //   6: lxor
    //   7: lstore_2
    //   8: iload_1
    //   9: ifge -> 72
    //   12: new java/lang/IllegalArgumentException
    //   15: dup
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: ldc 'ᾡ퍔贛훨诬꿯泛햷ऋ饋υ헃뻀峙暫敍聫ꇹ♍蟏맟㽔何꠽ⱐ菷咚'
    //   25: invokevirtual toCharArray : ()[C
    //   28: dup
    //   29: dup
    //   30: bipush #18
    //   32: dup_x1
    //   33: caload
    //   34: sipush #24056
    //   37: ixor
    //   38: i2c
    //   39: castore
    //   40: sipush #29540
    //   43: iconst_1
    //   44: iconst_2
    //   45: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: iload_1
    //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   55: invokevirtual toString : ()Ljava/lang/String;
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: athrow
    //   62: ldc2_w 6758966584894696051
    //   65: lload_2
    //   66: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   71: athrow
    //   72: iload_1
    //   73: istore #4
    //   75: iload #4
    //   77: iinc #4, -1
    //   80: ifeq -> 125
    //   83: aload_0
    //   84: invokeinterface hasNext : ()Z
    //   89: ifeq -> 125
    //   92: goto -> 105
    //   95: ldc2_w 6758966584894696051
    //   98: lload_2
    //   99: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: aload_0
    //   106: invokeinterface next : ()Ljava/lang/Object;
    //   111: pop
    //   112: goto -> 75
    //   115: ldc2_w 6758966584894696051
    //   118: lload_2
    //   119: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   124: athrow
    //   125: iload_1
    //   126: iload #4
    //   128: isub
    //   129: iconst_1
    //   130: isub
    //   131: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #3	-> 8
    //   #2	-> 72
    //   #1	-> 75
    //   #4	-> 125
    // Exception table:
    //   from	to	target	type
    //   8	62	62	java/lang/IllegalArgumentException
    //   75	92	95	java/lang/IllegalArgumentException
    //   83	115	115	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */