package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kae implements l26 {
    public final /* synthetic */ j09 a;
    public final /* synthetic */ x4d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ q11 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ dd2 g;

    public kae(j09 j09Var, x4d x4dVar, long j, float f, q11 q11Var, float f2, dd2 dd2Var) {
        this.a = j09Var;
        this.b = x4dVar;
        this.c = j;
        this.d = f;
        this.e = q11Var;
        this.f = f2;
        this.g = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zW = l46Var.W(iIntValue & 1, (iIntValue & 3) != 2);
        wef wefVar = wef.a;
        if (!zW) {
            l46Var.Z();
            return wefVar;
        }
        j09 j09VarD = nae.d(this.a, this.b, nae.e(this.c, this.d, l46Var), this.e, ((sw3) l46Var.k(zg2.h)).p0(this.f));
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new znd(17);
            l46Var.p0(objR);
        }
        j09 j09VarB = vwc.b(j09VarD, false, (a26) objR);
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = rs3.c;
            l46Var.p0(objR2);
        }
        j09 j09VarA = ibe.a(j09VarB, wefVar, (PointerInputEventHandler) objR2);
        xn8 xn8VarC = s21.c(ndb.b, true);
        int iW = an1.w(l46Var);
        u8a u8aVarM = l46Var.m();
        j09 j09VarJ = m93.J(l46Var, j09VarA);
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
        tec.q(0, this.g, l46Var, true);
        return wefVar;
    }
}
