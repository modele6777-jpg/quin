package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr1 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ l26 d;

    public /* synthetic */ kr1(float f, float f2, l26 l26Var) {
        this.b = f;
        this.c = f2;
        this.d = l26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        final l26 l26Var = this.d;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i2 = 1;
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
                    pr4 pr4Var = r9f.a;
                    nte.b("Container Settings", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).i, l46Var, 6, 0, 131070);
                    final float f = this.b;
                    final float f2 = this.c;
                    nte.b(String.format("Aspect Ratio: %.3f", Arrays.copyOf(new Object[]{Float.valueOf(f / f2)}, 1)), null, y72.b(((m82) l46Var.k(o82.a)).q, 0.7f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).l, l46Var, 0, 0, 131066);
                    j09 j09VarE = kv2.e(g09Var, 12.0f, l46Var, g09Var, 1.0f);
                    final int i3 = 0;
                    t7c t7cVarA = s7c.a(new uc0(16.0f, true, new qc0(0)), ndb.y, l46Var, 6);
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
                    boolean zG = l46Var.g(l26Var) | l46Var.d(f2);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        objR = new a26() { // from class: tr1
                            @Override // defpackage.a26
                            public final Object d(Object obj3) {
                                int i4 = i3;
                                wef wefVar2 = wef.a;
                                float f3 = f2;
                                l26 l26Var2 = l26Var;
                                Float f4 = (Float) obj3;
                                f4.floatValue();
                                switch (i4) {
                                    case 0:
                                        l26Var2.z(f4, Float.valueOf(f3));
                                        break;
                                    default:
                                        l26Var2.z(Float.valueOf(f3), f4);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    gs1.f("Width", f, a26Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), l46Var, 6);
                    boolean zG2 = l46Var.g(l26Var) | l46Var.d(f);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new a26() { // from class: tr1
                            @Override // defpackage.a26
                            public final Object d(Object obj3) {
                                int i4 = i2;
                                wef wefVar2 = wef.a;
                                float f3 = f;
                                l26 l26Var2 = l26Var;
                                Float f4 = (Float) obj3;
                                f4.floatValue();
                                switch (i4) {
                                    case 0:
                                        l26Var2.z(f4, Float.valueOf(f3));
                                        break;
                                    default:
                                        l26Var2.z(Float.valueOf(f3), f4);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR2);
                    }
                    a26 a26Var2 = (a26) objR2;
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    gs1.f("Height", f2, a26Var2, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), l46Var, 6);
                    l46Var.r(true);
                    l46Var.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gs1.d(this.b, this.c, l26Var, (l46) obj, k99.P(385));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ kr1(float f, float f2, l26 l26Var, int i) {
        this.b = f;
        this.c = f2;
        this.d = l26Var;
    }
}
