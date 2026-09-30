package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jwe {
    public static final /* synthetic */ long b = ud0.a.objectFieldOffset(jwe.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public yz4[] a;

    public final void a(yz4 yz4Var) {
        yz4Var.d((zz4) this);
        yz4[] yz4VarArr = this.a;
        if (yz4VarArr == null) {
            yz4VarArr = new yz4[4];
            this.a = yz4VarArr;
        } else if (b() >= yz4VarArr.length) {
            yz4VarArr = (yz4[]) Arrays.copyOf(yz4VarArr, b() * 2);
            this.a = yz4VarArr;
        }
        int iB = b();
        ud0.a.putIntVolatile(this, b, iB + 1);
        yz4VarArr[iB] = yz4Var;
        yz4Var.b = iB;
        d(iB);
    }

    public final int b() {
        return ud0.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final yz4 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        ud0.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                yz4 yz4Var = objArr2[i];
                yz4Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (yz4Var.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        yz4 yz4Var2 = objArr2[b()];
        yz4Var2.getClass();
        yz4Var2.d(null);
        yz4Var2.b = -1;
        objArr2[b()] = null;
        return yz4Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            yz4[] yz4VarArr = this.a;
            yz4VarArr.getClass();
            int i2 = (i - 1) / 2;
            yz4 yz4Var = yz4VarArr[i2];
            yz4Var.getClass();
            yz4 yz4Var2 = yz4VarArr[i];
            yz4Var2.getClass();
            if (yz4Var.compareTo(yz4Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        yz4[] yz4VarArr = this.a;
        yz4VarArr.getClass();
        yz4 yz4Var = yz4VarArr[i2];
        yz4Var.getClass();
        yz4 yz4Var2 = yz4VarArr[i];
        yz4Var2.getClass();
        yz4VarArr[i] = yz4Var;
        yz4VarArr[i2] = yz4Var2;
        yz4Var.b = i;
        yz4Var2.b = i2;
    }
}
