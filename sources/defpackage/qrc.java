package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qrc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ s69 d;
    public final /* synthetic */ wrc e;
    public final /* synthetic */ fpc f;

    public /* synthetic */ qrc(boolean z, a26 a26Var, s69 s69Var, wrc wrcVar, fpc fpcVar, int i) {
        this.a = i;
        this.b = z;
        this.c = a26Var;
        this.d = s69Var;
        this.e = wrcVar;
        this.f = fpcVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y02 y02Var = g21.f;
                    g09 g09Var = g09.a;
                    j09 j09VarM = g21.M(l46Var, oa7.E(g09Var, y02Var));
                    Integer numValueOf = Integer.valueOf(((sz9) this.d).j());
                    a26 a26Var = this.c;
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new k50(a26Var, 12);
                        l46Var.p0(objR);
                    }
                    j09 j09VarZ = dj6.z(56, (l26) objR, j09VarM, numValueOf, "seasonal-result-share", this.b, false, false);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    j09 j09VarD0 = ynb.d0(0.0f, 48.0f, 0.0f, 20.0f, 5, ynb.b0(20.0f, 0.0f, g09Var, 2));
                    vrc vrcVar = vrc.a;
                    wrc wrcVar = this.e;
                    boolean zT = pa7.t(wrcVar, vrcVar);
                    fpc fpcVar = this.f;
                    if (zT) {
                        l46Var.f0(-187458618);
                        o7c.h(fpcVar, j09VarD0, l46Var, 48);
                        l46Var.r(false);
                    } else {
                        if (!(wrcVar instanceof urc)) {
                            throw tec.d(-187460076, l46Var, false);
                        }
                        l46Var.f0(-1516070680);
                        z67 z67VarB = t72.B(fpcVar.b);
                        int i2 = ((urc) wrcVar).a;
                        if (z67VarB.e(i2)) {
                            l46Var.f0(-1516007533);
                            o7c.e(i2, 384, l46Var, j09VarD0, fpcVar.b);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1515780055);
                            o7c.h(fpcVar, j09VarD0, l46Var, 48);
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            default:
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g21.s(392.0f, af1.b0(-190244686, new qrc(this.b, this.c, this.d, this.e, this.f, 0), l46Var), l46Var, 54);
                } else {
                    l46Var.Z();
                }
                return wefVar;
        }
    }
}
