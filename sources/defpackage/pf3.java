package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pf3 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public pf3(x16 x16Var, x16 x16Var2, boolean z, boolean z2) {
        this.d = x16Var;
        this.b = z;
        this.e = x16Var2;
        this.c = z2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        ov7 ov7Var = LayoutNode.h1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        g09 g09Var = g09.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    x16 x16Var = (x16) obj4;
                    x16 x16Var2 = (x16) obj3;
                    t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var, 0);
                    int iW = an1.w(l46Var);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, g09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, t7cVarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    he2 he2Var = hj6.X;
                    if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                        tec.r(iW, l46Var, iW, he2Var);
                    }
                    dec.l(hj6.x, l46Var, j09VarJ);
                    gx6 gx6VarB = bzd.m;
                    if (gx6VarB == null) {
                        fx6 fx6Var = new fx6("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i2 = msf.a;
                        dtd dtdVar = new dtd(y72.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new p1a(15.41f, 16.59f));
                        arrayList.add(new o1a(10.83f, 12.0f));
                        arrayList.add(new w1a(4.58f, -4.59f));
                        arrayList.add(new o1a(14.0f, 6.0f));
                        arrayList.add(new w1a(-6.0f, 6.0f));
                        arrayList.add(new w1a(6.0f, 6.0f));
                        arrayList.add(new w1a(1.41f, -1.41f));
                        arrayList.add(l1a.c);
                        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var.b();
                        bzd.m = gx6VarB;
                    }
                    vf3.h(x16Var, gx6VarB, tgc.h(R.string.m3c_date_picker_switch_to_previous_month, l46Var), null, this.b, l46Var, 0, 8);
                    gx6 gx6VarB2 = bzd.n;
                    if (gx6VarB2 == null) {
                        fx6 fx6Var2 = new fx6("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = msf.a;
                        dtd dtdVar2 = new dtd(y72.b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new p1a(8.59f, 16.59f));
                        arrayList2.add(new o1a(13.17f, 12.0f));
                        arrayList2.add(new o1a(8.59f, 7.41f));
                        arrayList2.add(new o1a(10.0f, 6.0f));
                        arrayList2.add(new w1a(6.0f, 6.0f));
                        arrayList2.add(new w1a(-6.0f, 6.0f));
                        arrayList2.add(new w1a(-1.41f, -1.41f));
                        arrayList2.add(l1a.c);
                        fx6.a(fx6Var2, arrayList2, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB2 = fx6Var2.b();
                        bzd.n = gx6VarB2;
                    }
                    vf3.h(x16Var2, gx6VarB2, tgc.h(R.string.m3c_date_picker_switch_to_next_month, l46Var), null, this.c, l46Var, 0, 8);
                    l46Var.r(true);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    String str = (String) obj4;
                    ke3 ke3Var = (ke3) obj3;
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iW2 = an1.w(l46Var2);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM2);
                    he2 he2Var2 = hj6.X;
                    if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW2))) {
                        tec.r(iW2, l46Var2, iW2, he2Var2);
                    }
                    dec.l(hj6.x, l46Var2, j09VarJ2);
                    Object objR = l46Var2.R();
                    if (objR == sf2.a) {
                        objR = new i73(15);
                        l46Var2.p0(objR);
                    }
                    nte.b(str, vwc.a(g09Var, (a26) objR), ((y72) qkd.a(this.c ? ke3Var.j : this.b ? ke3Var.i : ke3Var.g, vpf.Z(t39.c, l46Var2), null, l46Var2, 0, 12).getValue()).a, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 261112);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public pf3(String str, ke3 ke3Var, boolean z, boolean z2) {
        this.d = str;
        this.e = ke3Var;
        this.b = z;
        this.c = z2;
    }
}
