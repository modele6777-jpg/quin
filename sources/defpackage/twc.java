package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class twc implements hxc, Iterable, zm7 {
    public final w79 a;
    public yl8 b;
    public boolean c;
    public boolean d;

    public twc() {
        long[] jArr = jec.a;
        this.a = new w79();
    }

    @Override // defpackage.hxc
    public final void c(gxc gxcVar, Object obj) {
        boolean z = obj instanceof f6;
        w79 w79Var = this.a;
        if (z && w79Var.c(gxcVar)) {
            Object objG = w79Var.g(gxcVar);
            objG.getClass();
            f6 f6Var = (f6) objG;
            f6 f6Var2 = (f6) obj;
            String str = f6Var2.a;
            if (str == null) {
                str = f6Var.a;
            }
            m26 m26Var = f6Var2.b;
            if (m26Var == null) {
                m26Var = f6Var.b;
            }
            w79Var.m(gxcVar, new f6(str, m26Var));
        } else {
            w79Var.m(gxcVar, obj);
        }
        gxcVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    public final twc d() {
        twc twcVar = new twc();
        twcVar.c = this.c;
        twcVar.d = this.d;
        w79 w79Var = this.a;
        Object[] objArr = w79Var.b;
        Object[] objArr2 = w79Var.c;
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
                            int i4 = (i << 3) + i3;
                            twcVar.a.m(objArr[i4], objArr2[i4]);
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
        return twcVar;
    }

    public final Object e(gxc gxcVar) {
        Object objG = this.a.g(gxcVar);
        if (objG != null) {
            return objG;
        }
        yg5.k(gxcVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twc)) {
            return false;
        }
        twc twcVar = (twc) obj;
        return this.a.equals(twcVar.a) && this.c == twcVar.c && this.d == twcVar.d;
    }

    public final void f(twc twcVar) {
        w79 w79Var = twcVar.a;
        Object[] objArr = w79Var.b;
        Object[] objArr2 = w79Var.c;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        gxc gxcVar = (gxc) obj;
                        w79 w79Var2 = this.a;
                        Object objG = w79Var2.g(gxcVar);
                        gxcVar.getClass();
                        Object objZ = gxcVar.b.z(objG, obj2);
                        if (objZ != null) {
                            w79Var2.m(gxcVar, objZ);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.d(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        yl8 yl8Var = this.b;
        if (yl8Var == null) {
            yl8Var = new yl8(this.a);
            this.b = yl8Var;
        }
        return ((gx4) yl8Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        w79 w79Var = this.a;
        Object[] objArr = w79Var.b;
        Object[] objArr2 = w79Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((gxc) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return y41.S(this) + "{ " + ((Object) sb) + " }";
    }
}
