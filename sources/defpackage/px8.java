package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ij c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ x16 f;
    public final /* synthetic */ x16 g;

    public /* synthetic */ px8(x16 x16Var, String str, ij ijVar, boolean z, x16 x16Var2, x16 x16Var3) {
        this.a = 2;
        this.e = x16Var;
        this.b = str;
        this.c = ijVar;
        this.d = z;
        this.f = x16Var2;
        this.g = x16Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mue mueVarA;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    qx8.b(this.b, this.c, this.d, this.e, this.f, this.g, l46Var, 64);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                qx8.a(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, k99.P(196673));
                break;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarC);
                    lf2.q.getClass();
                    l46Var2.j0();
                    boolean z = l46Var2.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    j09 j09VarZ = ynb.Z(mh3.d0(b.c(g09Var, 1.0f), mh3.T(l46Var2), false, 14), 32.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA);
                    dec.l(he2Var2, l46Var2, u8aVarM2);
                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ2);
                    pr4 pr4Var = l8b.a;
                    boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
                    j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    String strQ = afc.q(R.string.mixed_unlock_title, l46Var2);
                    if (zF) {
                        l46Var2.f0(811695486);
                        mue mueVar = pue.a;
                        mueVarA = pue.n(l46Var2);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(811751317);
                        mue mueVar2 = pue.a;
                        mueVarA = mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
                        l46Var2.r(false);
                    }
                    nte.b(strQ, j09VarB0, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var2, 48, 0, 130040);
                    j09 j09VarB1 = ynb.b0(16.0f, 0.0f, kv2.e(g09Var, 8.0f, l46Var2, g09Var, 1.0f), 2);
                    String strQ2 = afc.q(R.string.mixed_unlock_deck_count_hint, l46Var2);
                    mue mueVar3 = oue.a;
                    nte.b(strQ2, j09VarB1, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 48, 0, 130040);
                    j09 j09VarW = dj6.w(kv2.e(g09Var, 16.0f, l46Var2, g09Var, 1.0f), 1.0f);
                    y6c y6cVar = qx8.b;
                    feg.j(od4.A(R.drawable.random_mix_unlock_art, 0, l46Var2), null, androidx.compose.ui.platform.b.a(db6.w(oa7.E(j09VarW, y6cVar), 0.5f, ((e8b) l46Var2.k(pr4Var)).A, y6cVar), "mixedUnlockArt"), null, an2.a, 0.0f, null, l46Var2, 24632, 104);
                    o5c.f(l46Var2, b.d(g09Var, 24.0f));
                    qx8.c(this.b, this.c, this.d, this.f, this.g, l46Var2, 64);
                    l46Var2.r(true);
                    c8b.h(androidx.compose.ui.platform.b.a(ynb.d0(0.0f, 8.0f, 8.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), "mixedUnlockClose"), false, 0L, 0L, null, this.e, l46Var2, 0, 30);
                    l46Var2.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qx8.b(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, k99.P(65));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ px8(String str, ij ijVar, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3) {
        this.a = 0;
        this.b = str;
        this.c = ijVar;
        this.d = z;
        this.e = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
    }

    public /* synthetic */ px8(String str, ij ijVar, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = ijVar;
        this.d = z;
        this.e = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
    }
}
