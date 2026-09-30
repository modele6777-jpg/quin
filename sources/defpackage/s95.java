package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s95 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ s95(x16 x16Var, e89 e89Var, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = e89Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        int i2 = 2;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    dd2 dd2Var = bzd.b;
                    x16 x16Var = this.b;
                    boolean zG = l46Var.g(x16Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new k8(x16Var, e89Var, 4);
                        l46Var.p0(objR);
                    }
                    pa7.a(null, 0L, 0L, null, dd2Var, null, false, false, (x16) objR, l46Var, 24576, 239);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y02 y02Var = g21.f;
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarF = urg.F(mh3.N(b.c(ynb.a0(g09.a, 24.0f, 16.0f), 1.0f)), ia7.a);
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var2, 6);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarF);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    Context context = (Context) l46Var2.k(uq.b);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    FillElement fillElement = b.b;
                    j09 j09VarD = jw7Var.D(fillElement);
                    bx9 bx9Var = v51.a;
                    u51 u51VarG = v51.g(0L, ((e8b) l46Var2.k(l8b.a)).q, l46Var2, 13);
                    pr4 pr4Var = u5d.a;
                    x4d x4dVar = ((s5d) l46Var2.k(pr4Var)).e;
                    x4dVar.getClass();
                    if (we6.e(l46Var2)) {
                        x4dVar = y02Var;
                    }
                    q11 q11VarF = v51.f(true, l46Var2);
                    boolean zI = l46Var2.i(context);
                    Object objR2 = l46Var2.R();
                    if (zI || objR2 == i8cVar) {
                        objR2 = new wr1(context, e89Var, i2);
                        l46Var2.p0(objR2);
                    }
                    c8b.k(j09VarD, false, x4dVar, u51VarG, q11VarF, null, false, (x16) objR2, bzd.c, l46Var2, 100663296, 98);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    j09 j09VarD2 = b.b(0.0f, 48.0f, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1).D(fillElement);
                    y6c y6cVar = ((s5d) l46Var2.k(pr4Var)).e;
                    y6cVar.getClass();
                    c8b.i(j09VarD2, afc.q(R.string.settings_feedback, l46Var2), null, null, 0L, 0.0f, false, we6.e(l46Var2) ? y02Var : y6cVar, null, false, null, null, this.b, l46Var2, 0, 0, 3964);
                    l46Var2.r(true);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, null, null, !((Boolean) e89Var.getValue()).booleanValue(), false, this.b, l46Var3, 0, 191);
                }
                break;
        }
        return wefVar;
    }
}
