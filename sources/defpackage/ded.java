package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ded {
    public static final ydd a;

    static {
        b21.P(0.0f, 400.0f, 1, qyf.a);
        a = new ydd();
        new w79();
    }

    public static final void a(j09 j09Var, n26 n26Var, l46 l46Var, int i, int i2) {
        int i3;
        l46Var.h0(646379026);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(n26Var) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            b(af1.b0(1948801580, new zdd(j09Var, n26Var), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new aed(j09Var, n26Var, i, i2);
        }
    }

    public static final void b(o26 o26Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1908320054);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(o26Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            eb3.v(af1.b0(2062852661, new bed(o26Var), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ced(o26Var, i);
        }
    }
}
