package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w9h {
    public static final w9h b;
    public final vy6 a;

    static {
        int i = vy6.f;
        b = new w9h(gpb.v);
    }

    public w9h(vy6 vy6Var) {
        this.a = vy6Var;
    }

    public static w9h a(amg amgVar) throws bng {
        String strW;
        long j;
        v9h v9hVar;
        int iG = amgVar.G();
        if (iG < 0) {
            s8f.q("Negative number of flags");
            return null;
        }
        int i = vy6.f;
        ty6 ty6Var = new ty6(ba9.a);
        long j2 = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            long jH = amgVar.H();
            int i3 = (int) jH;
            long j3 = jH >>> 3;
            if (j3 == 0) {
                j = 0;
                strW = amgVar.w();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    s8f.q("Flag name larger than max size");
                    return null;
                }
                strW = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                v9hVar = new v9h(j, strW, i4, 0L, null);
            } else if (i4 == 2) {
                v9hVar = new v9h(j, strW, i4, amgVar.H(), null);
            } else if (i4 == 3) {
                v9hVar = new v9h(j, strW, i4, Double.doubleToRawLongBits(amgVar.o()), null);
            } else if (i4 == 4) {
                v9hVar = new v9h(j, strW, i4, 0L, amgVar.w());
            } else {
                if (i4 != 5) {
                    s8f.q(ub3.h(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                v9hVar = new v9h(j, strW, i4, 0L, amgVar.z());
            }
            long j5 = v9hVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            ty6Var.b(v9hVar);
        }
        return new w9h(ty6Var.i());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w9h)) {
            return false;
        }
        return this.a.equals(((w9h) obj).a);
    }

    public final int hashCode() {
        vy6 vy6Var = this.a;
        vy6Var.getClass();
        return aic.l(vy6Var);
    }
}
