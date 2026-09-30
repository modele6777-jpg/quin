package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oz8 implements l26 {
    public final /* synthetic */ dd2 E0;
    public final /* synthetic */ long X;
    public final /* synthetic */ l26 Y;
    public final /* synthetic */ l26 Z;
    public final /* synthetic */ long a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ ted c;
    public final /* synthetic */ a09 d;
    public final /* synthetic */ jx e;
    public final /* synthetic */ aw2 f;
    public final /* synthetic */ a26 g;
    public final /* synthetic */ j09 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ x4d y;
    public final /* synthetic */ long z;

    public oz8(long j, x16 x16Var, ted tedVar, a09 a09Var, jx jxVar, aw2 aw2Var, a26 a26Var, j09 j09Var, float f, boolean z, x4d x4dVar, long j2, long j3, l26 l26Var, l26 l26Var2, dd2 dd2Var) {
        this.a = j;
        this.b = x16Var;
        this.c = tedVar;
        this.d = a09Var;
        this.e = jxVar;
        this.f = aw2Var;
        this.g = a26Var;
        this.v = j09Var;
        this.w = f;
        this.x = z;
        this.y = x4dVar;
        this.z = j2;
        this.X = j3;
        this.Y = l26Var;
        this.Z = l26Var2;
        this.E0 = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            j09 j09VarL = mh3.L(b.c);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new nd8(24);
                l46Var.p0(objR);
            }
            j09 j09VarB = vwc.b(j09VarL, false, (a26) objR);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            ted tedVar = this.c;
            boolean z = ((ued) tedVar.d.h.getValue()) != ued.a;
            boolean z2 = this.d.c;
            long j = this.a;
            x16 x16Var = this.b;
            zz8.c(j, x16Var, z, z2, l46Var, 0);
            zz8.b(this.e, this.f, x16Var, this.g, this.v, tedVar, this.w, this.x, this.y, this.z, this.X, 0.0f, this.Y, this.Z, this.E0, l46Var, 70);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
