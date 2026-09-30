package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ av(long j, boolean z, j09 j09Var, ul9 ul9Var) {
        this.c = j;
        this.d = z;
        this.b = j09Var;
        this.e = ul9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        final int i2 = 1;
        final int i3 = 0;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                j09 j09Var = (j09) obj4;
                final ul9 ul9Var = (ul9) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    long j = this.c;
                    boolean z = this.d;
                    if (j == 9205357640488583168L) {
                        l46Var.f0(4389176);
                        boolean zI = l46Var.i(ul9Var);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new x16() { // from class: bv
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i4 = i2;
                                    ul9 ul9Var2 = ul9Var;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & ul9Var2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & ul9Var2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            l46Var.p0(objR);
                        }
                        i7h.i(0, (x16) objR, l46Var, j09Var, z);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(3458246);
                        rc0 rc0Var = z ? db6.b : db6.a;
                        j09 j09VarJ = b.j(bj4.b(j), bj4.a(j), 0.0f, 0.0f, 12, j09Var);
                        t7c t7cVarA = s7c.a(rc0Var, ndb.y, l46Var, 0);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarJ);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, t7cVarA);
                        dec.l(hj6.y, l46Var, u8aVarM);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ2);
                        boolean zI2 = l46Var.i(ul9Var);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new x16() { // from class: bv
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i4 = i3;
                                    ul9 ul9Var2 = ul9Var;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & ul9Var2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & ul9Var2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            l46Var.p0(objR2);
                        }
                        i7h.i(6, (x16) objR2, l46Var, g09Var, z);
                        l46Var.r(true);
                        l46Var.r(false);
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                z5c.a((j09) obj4, (gx6) obj3, this.c, this.d, (l46) obj, k99.P(3073));
                break;
            default:
                x16 x16Var = (x16) obj4;
                String str = (String) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    Object objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new e2d(26);
                        l46Var2.p0(objR3);
                    }
                    j09 j09VarB = vwc.b(g09Var, false, (a26) objR3);
                    x4d x4dVar = xld.a;
                    x4dVar.getClass();
                    if (we6.e(l46Var2)) {
                        x4dVar = g21.f;
                    }
                    long j2 = y72.j;
                    long j3 = this.c;
                    nae.c(x16Var, j09VarB, this.d, x4dVar, j2, j3, 0.0f, 0.0f, null, null, af1.b0(253654280, new sb(str, j3), l46Var2), l46Var2, 24576, 960);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ av(x16 x16Var, boolean z, long j, String str) {
        this.b = x16Var;
        this.d = z;
        this.c = j;
        this.e = str;
    }

    public /* synthetic */ av(j09 j09Var, gx6 gx6Var, long j, boolean z, int i) {
        this.b = j09Var;
        this.e = gx6Var;
        this.c = j;
        this.d = z;
    }
}
