package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w59 {
    public final w79 a;

    public /* synthetic */ w59(w79 w79Var) {
        this.a = w79Var;
    }

    public static final void a(w79 w79Var, Object obj, Object obj2) {
        int iF = w79Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : w79Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof i79) {
                i79 i79Var = (i79) obj3;
                i79Var.h(obj2);
                obj2 = i79Var;
            } else {
                Object[] objArr = rk9.a;
                i79 i79Var2 = new i79(2);
                i79Var2.h(obj3);
                i79Var2.h(obj2);
                obj2 = i79Var2;
            }
        }
        if (!z) {
            w79Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        w79Var.b[i] = obj;
        w79Var.c[i] = obj2;
    }

    public static final Object b(w79 w79Var, e49 e49Var) {
        Object objG = w79Var.g(e49Var);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof i79)) {
            w79Var.k(e49Var);
            return objG;
        }
        i79 i79Var = (i79) objG;
        if (i79Var.d()) {
            r3.n("List is empty.");
            return null;
        }
        int i = i79Var.b - 1;
        Object objB = i79Var.b(i);
        i79Var.m(i);
        objB.getClass();
        if (i79Var.d()) {
            w79Var.k(e49Var);
        }
        if (i79Var.b == 1) {
            w79Var.m(e49Var, i79Var.a());
        }
        return objB;
    }

    public static final void c(w79 w79Var, e49 e49Var, a26 a26Var) {
        Object objG = w79Var.g(e49Var);
        if (objG != null) {
            if (!(objG instanceof i79)) {
                if (((Boolean) a26Var.d(objG)).booleanValue()) {
                    w79Var.k(e49Var);
                    return;
                }
                return;
            }
            i79 i79Var = (i79) objG;
            int i = i79Var.b;
            Object[] objArr = i79Var.a;
            int i2 = 0;
            z67 z67VarC0 = mh3.c0(0, i);
            int i3 = z67VarC0.a;
            int i4 = z67VarC0.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) a26Var.d(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            qd0.h0(i - i2, i, null, objArr);
            i79Var.b -= i2;
            if (i79Var.d()) {
                w79Var.k(e49Var);
            }
            if (i79Var.b == 1) {
                w79Var.m(e49Var, i79Var.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final i79 d(w79 w79Var) {
        if (w79Var.i()) {
            i79 i79Var = rk9.b;
            i79Var.getClass();
            return i79Var;
        }
        i79 i79Var2 = new i79();
        Object[] objArr = w79Var.c;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof i79) {
                                i79Var2.i((i79) obj);
                            } else {
                                obj.getClass();
                                i79Var2.h(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return i79Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w59) {
            return this.a.equals(((w59) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
