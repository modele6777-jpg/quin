package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hf3 implements n26 {
    public final /* synthetic */ long a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ aw2 c;
    public final /* synthetic */ j18 d;
    public final /* synthetic */ z67 e;
    public final /* synthetic */ n91 f;
    public final /* synthetic */ euc g;
    public final /* synthetic */ j91 v;
    public final /* synthetic */ ke3 w;

    public hf3(long j, e89 e89Var, aw2 aw2Var, j18 j18Var, z67 z67Var, n91 n91Var, euc eucVar, j91 j91Var, ke3 ke3Var) {
        this.a = j;
        this.b = e89Var;
        this.c = aw2Var;
        this.d = j18Var;
        this.e = z67Var;
        this.f = n91Var;
        this.g = eucVar;
        this.v = j91Var;
        this.w = ke3Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        z67 z67Var;
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        String strH = tgc.h(R.string.m3c_date_picker_year_picker_pane_title, l46Var);
        boolean zG = l46Var.g(strH);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zG || objR == i8cVar) {
            objR = new ia(strH, 9);
            l46Var.p0(objR);
        }
        g09 g09Var = g09.a;
        j09 j09VarB = vwc.b(g09Var, false, (a26) objR);
        c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
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
        dec.l(hj6.z, l46Var, c92VarA);
        dec.l(hj6.y, l46Var, u8aVarM);
        he2 he2Var = hj6.X;
        if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
            tec.r(iW, l46Var, iW, he2Var);
        }
        dec.l(hj6.x, l46Var, j09VarJ);
        bx9 bx9Var = vf3.a;
        j09 j09VarB0 = ynb.b0(12.0f, 0.0f, b.g(g09Var, 336.0f - cb4.a), 2);
        e89 e89Var = this.b;
        boolean zG2 = l46Var.g(e89Var);
        aw2 aw2Var = this.c;
        boolean zI = zG2 | l46Var.i(aw2Var);
        j18 j18Var = this.d;
        boolean zG3 = zI | l46Var.g(j18Var);
        z67 z67Var2 = this.e;
        boolean zI2 = zG3 | l46Var.i(z67Var2);
        n91 n91Var = this.f;
        boolean zG4 = zI2 | l46Var.g(n91Var);
        Object objR2 = l46Var.R();
        if (zG4 || objR2 == i8cVar) {
            z67Var = z67Var2;
            kf kfVar = new kf(7, e89Var, aw2Var, j18Var, z67Var, n91Var);
            l46Var.p0(kfVar);
            objR2 = kfVar;
        } else {
            z67Var = z67Var2;
        }
        long j = this.a;
        euc eucVar = this.g;
        j91 j91Var = this.v;
        ke3 ke3Var = this.w;
        vf3.n(j09VarB0, j, (a26) objR2, eucVar, j91Var, z67Var, ke3Var, l46Var, 6);
        oa7.d(null, 0.0f, ke3Var.x, l46Var, 0, 3);
        l46Var.r(true);
        return wef.a;
    }
}
