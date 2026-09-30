package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6f implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ w6f b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ x16 f;

    public /* synthetic */ u6f(w6f w6fVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4) {
        this.b = w6fVar;
        this.c = x16Var;
        this.d = x16Var2;
        this.e = x16Var3;
        this.f = x16Var4;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v6f.a(this.b, this.c, this.d, this.e, this.f, g09.a, (l46) obj, k99.P(1));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    g09 g09Var = g09.a;
                    j09 j09VarJ = m93.J(l46Var, g09Var);
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
                    dec.l(he2Var, l46Var, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    w6f w6fVar = this.b;
                    if (w6fVar.b == d6f.c) {
                        l46Var.f0(1178074024);
                        q3c.d(oa7.F(d31.a.b(g09Var)), l46Var, 0);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1178216252);
                        l46Var.r(false);
                    }
                    j09 j09VarB0 = ynb.b0(4.0f, 0.0f, g09Var, 2);
                    t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
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
                    if (w6fVar.b == d6f.b) {
                        l46Var.f0(-427875127);
                        j09 j09VarL = b.l(ynb.d0(16.0f, 0.0f, 12.0f, 0.0f, 10, g09Var), 20.0f);
                        long j = y72.e;
                        axa.a(2.0f, 0.0f, 0, 438, 56, j, 0L, l46Var, j09VarL);
                        String strQ = afc.q(R.string.tts_loading_reading, l46Var);
                        j09 j09VarB1 = ynb.b0(0.0f, 12.0f, new jw7(1.0f, false), 1);
                        Object objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = new ule(29);
                            l46Var.p0(objR);
                        }
                        nte.b(strQ, vwc.b(j09VarB1, false, (a26) objR), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(r9f.a)).k, l46Var, 384, 0, 131064);
                        l46Var = l46Var;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-427225429);
                        bm8.h(this.c, null, false, null, null, af1.b0(672709056, new z8d(12, w6fVar), l46Var), l46Var, 1572864, 62);
                        bm8.h(this.d, null, false, null, null, tm7.w, l46Var, 1572864, 62);
                        bm8.h(this.e, null, false, null, null, tm7.x, l46Var, 1572864, 62);
                        l46Var.r(false);
                    }
                    bm8.h(this.f, null, false, null, null, tm7.y, l46Var, 1572864, 62);
                    l46Var.r(true);
                    l46Var.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ u6f(w6f w6fVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i) {
        this.b = w6fVar;
        this.c = x16Var;
        this.d = x16Var2;
        this.e = x16Var3;
        this.f = x16Var4;
    }
}
