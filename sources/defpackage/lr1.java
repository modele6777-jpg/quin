package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lr1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ lr1(int i, int i2, int i3, a26 a26Var) {
        this.b = i;
        this.c = i2;
        this.d = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        j09 j09VarO;
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarZ = ynb.Z(g09Var, 16.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    nte.b(tec.e(i3 + 1, "Current Card: "), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(r9f.a)).i, l46Var, 0, 0, 131070);
                    float f = 1.0f;
                    j09 j09VarE = kv2.e(g09Var, 8.0f, l46Var, g09Var, 1.0f);
                    float f2 = 4.0f;
                    boolean z2 = true;
                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.y, l46Var, 6);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarE);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    l46Var.f0(-1199490350);
                    final int i4 = 0;
                    while (i4 < i2) {
                        final boolean z3 = i4 == i3 ? z2 : false;
                        boolean zG = l46Var.g(a26Var) | l46Var.e(i4);
                        Object objR = l46Var.R();
                        if (zG || objR == sf2.a) {
                            objR = new rr1(i4, 0, a26Var);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        jw7 jw7Var = new jw7(f, z2);
                        if (z3) {
                            l46Var.f0(1389194465);
                            j09VarO = tm7.o(g09Var, y72.b(((m82) l46Var.k(o82.a)).a, 0.2f), a7c.b(f2));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1389391160);
                            l46Var.r(false);
                            j09VarO = g09Var;
                        }
                        cgg.m(x16Var, jw7Var.D(j09VarO), false, null, null, null, af1.b0(-1125758721, new n26() { // from class: sr1
                            @Override // defpackage.n26
                            public final Object m(Object obj3, Object obj4, Object obj5) {
                                long j;
                                l46 l46Var2 = (l46) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((u7c) obj3).getClass();
                                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    String strValueOf = String.valueOf(i4 + 1);
                                    if (z3) {
                                        l46Var2.f0(477631590);
                                        j = ((m82) l46Var2.k(o82.a)).a;
                                    } else {
                                        l46Var2.f0(477632840);
                                        j = ((m82) l46Var2.k(o82.a)).q;
                                    }
                                    l46Var2.r(false);
                                    nte.b(strValueOf, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262138);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 805306368, 508);
                        i4++;
                        z2 = z2;
                        f = 1.0f;
                        i3 = i3;
                        f2 = f2;
                    }
                    boolean z4 = z2;
                    tec.s(l46Var, false, z4, z4);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gs1.e(i3, i2, a26Var, (l46) obj, k99.P(385));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ lr1(int i, int i2, a26 a26Var) {
        this.b = i;
        this.c = i2;
        this.d = a26Var;
    }
}
