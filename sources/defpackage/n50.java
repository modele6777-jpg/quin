package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.credits.LevelAndKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n50 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n50(cv6 cv6Var, h0e h0eVar, String str, String str2, qhe qheVar) {
        this.a = 16;
        this.c = cv6Var;
        this.d = h0eVar;
        this.e = str;
        this.b = str2;
        this.f = qheVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        y6c y6cVarB;
        Object zlbVar;
        aw2 aw2Var = (aw2) this.c;
        ted tedVar = (ted) this.d;
        x16 x16Var = (x16) this.b;
        r55 r55Var = (r55) this.e;
        x16 x16Var2 = (x16) this.f;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            g09 g09Var = g09.a;
            j09 j09VarZ = ynb.Z(b.r(b.c(g09Var, 1.0f)), 16.0f);
            pr4 pr4Var = l8b.a;
            j09 j09VarO = tm7.o(j09VarZ, ((e8b) l46Var.k(pr4Var)).c, a7c.b(16.0f));
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
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
            d31 d31Var = d31.a;
            feg.j(od4.A(R.drawable.bg_card_cover, 0, l46Var), null, oa7.E(d31Var.b(g09Var), a7c.b(16.0f)), null, an2.a, 0.0f, null, l46Var, 24632, 104);
            j09 j09VarD0 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31Var.a(g09Var, ndb.d));
            long j = ((e8b) l46Var.k(pr4Var)).A;
            long j2 = ((e8b) l46Var.k(pr4Var)).t;
            boolean zI = l46Var.i(aw2Var) | l46Var.g(tedVar) | l46Var.g(x16Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                objR = new h7e(aw2Var, x16Var, tedVar);
                l46Var.p0(objR);
            }
            c8b.h(j09VarD0, false, j, j2, null, (x16) ((ym7) objR), l46Var, 0, 18);
            j09 j09VarB0 = ynb.b0(0.0f, 12.0f, ynb.b0(32.0f, 0.0f, g09Var, 2), 1);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            feg.j(od4.A(R.drawable.subscription_alert, 0, l46Var), null, b.l(g09Var, 164.0f), null, null, 0.0f, null, l46Var, 440, 120);
            String strQ = afc.q(R.string.expire_title, l46Var);
            pr4 pr4Var2 = r9f.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var2)).f, l46Var, 0, 0, 131070);
            LevelAndKind levelAndKind = r55Var.b.getLevelAndKind();
            c48 c48Var = LevelAndKind.Companion;
            nte.b(afc.r(R.string.expire_desc, new Object[]{lc.Q(levelAndKind, l46Var), Integer.valueOf(r55Var.a)}, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var2)).j, l46Var, 0, 0, 131070);
            o5c.f(l46Var, b.d(g09Var, 16.0f));
            if (k8b.f((e8b) l46Var.k(pr4Var))) {
                l46Var.f0(-63435730);
                y6cVarB = eze.a(l46Var).a.j;
                l46Var.r(false);
            } else {
                l46Var.f0(-63435327);
                l46Var.r(false);
                y6cVarB = a7c.b(20.0f);
            }
            y6c y6cVar = y6cVarB;
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
            bx9 bx9Var = v51.a;
            u51 u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
            boolean zI2 = l46Var.i(aw2Var) | l46Var.g(tedVar) | l46Var.g(x16Var) | l46Var.g(x16Var2);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                zlbVar = new zlb(1, x16Var2, aw2Var, tedVar, x16Var);
                l46Var.p0(zlbVar);
            } else {
                zlbVar = objR2;
            }
            cgg.a((x16) zlbVar, j09VarB, false, y6cVar, u51VarA, null, null, null, n16.e, l46Var, 805306416, 484);
            j09 j09VarB2 = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
            boolean zI3 = l46Var.i(aw2Var) | l46Var.g(tedVar) | l46Var.g(x16Var);
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == i8cVar) {
                objR3 = new i7e(aw2Var, x16Var, tedVar);
                l46Var.p0(objR3);
            }
            cgg.m((x16) ((ym7) objR3), j09VarB2, false, y6cVar, null, null, n16.f, l46Var, 805306416, 500);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i;
        tr2 tr2Var;
        yxd yxdVar;
        yxd xxdVar;
        int i2 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        int i3 = 18;
        i8c i8cVar = sf2.a;
        int i4 = 2;
        wef wefVar = wef.a;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        int i5 = 1;
        boolean z = false;
        switch (i2) {
            case 0:
                aw2 aw2Var = (aw2) obj8;
                ted tedVar = (ted) obj7;
                x16 x16Var = (x16) obj5;
                String str = (String) obj6;
                dd2 dd2Var = (dd2) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    long j = y72.j;
                    a7 a7Var = new a7(2);
                    boolean zI = l46Var.i(aw2Var) | l46Var.g(tedVar) | l46Var.g(x16Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new m50(aw2Var, tedVar, x16Var, 1);
                        l46Var.p0(objR);
                    }
                    t4c.c(null, null, null, 1, 0, j, 0.0f, a7Var, (x16) objR, af1.b0(-1779562962, new p50(0, str, dd2Var), l46Var), l46Var, 1797120, 135);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                x16 x16Var2 = (x16) obj5;
                yk8 yk8Var = (yk8) obj6;
                aw2 aw2Var2 = (aw2) obj8;
                ted tedVar2 = (ted) obj7;
                x16 x16Var3 = (x16) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    j09 j09VarC0 = ynb.c0(b.c(g09Var, 1.0f), we6.g(24.0f, l46Var2), we6.g(24.0f, l46Var2), we6.g(24.0f, l46Var2), 12.0f);
                    c92 c92VarA = a92.a(new uc0(we6.g(12.0f, l46Var2), true, new qc0(0)), ndb.Y, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarC0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    jgb.p(null, l46Var2, 0, 1);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    rp1 rp1VarP = z5c.p(abg.c(653651543), 0L, l46Var2, 24582, 14);
                    bzd.c(x16Var2, j09VarC, false, we6.f(a7c.b(r10), l46Var2), we6.e(l46Var2) ? rp1VarP.a(y72.j, rp1VarP.b, rp1VarP.c, rp1VarP.d) : rp1VarP, null, jgb.c, l46Var2, 100663344);
                    jgb.p(null, l46Var2, 0, 1);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    rp1 rp1VarP2 = z5c.p(abg.c(647332863), 0L, l46Var2, 24582, 14);
                    rp1 rp1VarA = we6.e(l46Var2) ? rp1VarP2.a(y72.j, rp1VarP2.b, rp1VarP2.c, rp1VarP2.d) : rp1VarP2;
                    x4d x4dVarF = we6.f(a7c.b(r10), l46Var2);
                    boolean zI2 = l46Var2.i(yk8Var);
                    Object objR2 = l46Var2.R();
                    if (zI2 || objR2 == i8cVar) {
                        i = 0;
                        objR2 = new u11(yk8Var, i);
                        l46Var2.p0(objR2);
                    } else {
                        i = 0;
                    }
                    bzd.c((x16) objR2, j09VarC2, false, x4dVarF, rp1VarA, null, jgb.d, l46Var2, 100663344);
                    jgb.p(null, l46Var2, i, 1);
                    j09 j09VarD = b.d(b.c(g09Var, 1.0f), we6.d(56.0f, 44.0f, l46Var2));
                    x4d x4dVarF2 = we6.f(a7c.b(12.0f), l46Var2);
                    boolean zI3 = l46Var2.i(aw2Var2) | l46Var2.g(tedVar2) | l46Var2.g(x16Var3);
                    Object objR3 = l46Var2.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new m50(aw2Var2, tedVar2, x16Var3, 2);
                        l46Var2.p0(objR3);
                    }
                    cgg.m((x16) objR3, j09VarD, false, x4dVarF2, null, null, jgb.e, l46Var2, 805306368, 500);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                xw9 xw9Var = (xw9) obj8;
                List list = (List) obj7;
                l26 l26Var = (l26) obj5;
                l26 l26Var2 = (l26) obj4;
                String str2 = (String) obj6;
                sdd sddVar = (sdd) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                sddVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(sddVar) ? 4 : 2;
                }
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, fillElement);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC);
                    dec.l(hj6.y, l46Var3, u8aVarM2);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ2);
                    jgb.l(0, l46Var3);
                    y8c.d(sddVar, fillElement, xw9Var, 0.0f, list, l26Var, l26Var2, af1.b0(2140662588, new o8(str2, 10), l46Var3), l46Var3, (iIntValue3 & 14) | 12582960, 4);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                aw2 aw2Var3 = (aw2) obj8;
                ht6 ht6Var = (ht6) obj7;
                p5a p5aVar = (p5a) obj5;
                fab fabVar = (fab) obj6;
                e89 e89Var = (e89) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((en5) obj).getClass();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.f0(-1283807718);
                    for (iy9 iy9Var : t72.I(new iy9("control", "G1 / control"), new iy9("experiment_1", "G2 / 月付涨价"), new iy9("experiment_2", "G3 / 次卡涨价"))) {
                        String str3 = (String) iy9Var.a();
                        String str4 = (String) iy9Var.b();
                        boolean z2 = !pa7.t((String) e89Var.getValue(), str3);
                        boolean zI4 = l46Var4.i(aw2Var3) | l46Var4.i(ht6Var) | l46Var4.i(p5aVar) | l46Var4.i(fabVar) | l46Var4.g(str3);
                        Object objR4 = l46Var4.R();
                        if (zI4 || objR4 == i8cVar) {
                            ht6 ht6Var2 = ht6Var;
                            aw2 aw2Var4 = aw2Var3;
                            fab fabVar2 = fabVar;
                            p5a p5aVar2 = p5aVar;
                            m8 m8Var = new m8(str3, aw2Var4, ht6Var2, p5aVar2, fabVar2, 9);
                            aw2Var3 = aw2Var4;
                            ht6Var = ht6Var2;
                            p5aVar = p5aVar2;
                            fabVar = fabVar2;
                            l46Var4.p0(m8Var);
                            objR4 = m8Var;
                        }
                        cgg.a((x16) objR4, null, z2, null, null, null, null, null, af1.b0(1185382477, new ob0(str4, 6), l46Var4), l46Var4, 805306368, 506);
                    }
                    l46Var4.r(false);
                    boolean z3 = !v4e.Q((String) e89Var.getValue());
                    boolean zI5 = l46Var4.i(aw2Var3) | l46Var4.i(ht6Var) | l46Var4.i(p5aVar) | l46Var4.i(fabVar);
                    Object objR5 = l46Var4.R();
                    if (zI5 || objR5 == i8cVar) {
                        jr jrVar = new jr(aw2Var3, ht6Var, p5aVar, fabVar, 11);
                        l46Var4.p0(jrVar);
                        objR5 = jrVar;
                    }
                    cgg.m((x16) objR5, null, z3, null, null, null, tm7.s, l46Var4, 805306368, 506);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                x16 x16Var4 = (x16) obj5;
                oh4 oh4Var = (oh4) obj8;
                x16 x16Var5 = (x16) obj7;
                x16 x16Var6 = (x16) obj6;
                x16 x16Var7 = (x16) obj4;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(244132204, new x6(x16Var4, oh4Var, x16Var5), l46Var5), af1.b0(-1990912595, new b20(x16Var6, x16Var7, false, 4), l46Var5), null, null, 0, y72.j, 0L, null, af1.b0(1316881655, new ih4(oh4Var, x16Var6), l46Var5), l46Var5, 806879670, 440);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                tr2 tr2Var2 = (tr2) obj8;
                xn5 xn5Var = (xn5) obj7;
                r0 r0Var = (r0) obj5;
                Context context = (Context) obj6;
                m25 m25Var = (m25) obj4;
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    j09 j09VarD2 = ynb.b0(12.0f, 0.0f, b.q(0.0f, 340.0f, ynb.b0(16.0f, 0.0f, g09Var, 2), 1), 2).D(new jw7(1.0f, true));
                    boolean zI6 = l46Var6.i(xn5Var) | l46Var6.i(r0Var) | l46Var6.i(context) | l46Var6.i(tr2Var2) | l46Var6.i(m25Var);
                    Object objR6 = l46Var6.R();
                    if (zI6 || objR6 == i8cVar) {
                        tr2Var = tr2Var2;
                        kf kfVar = new kf(xn5Var, r0Var, context, tr2Var, m25Var, 10);
                        l46Var6.p0(kfVar);
                        objR6 = kfVar;
                    } else {
                        tr2Var = tr2Var2;
                    }
                    a26 a26Var = (a26) objR6;
                    boolean zI7 = l46Var6.i(r0Var);
                    Object objR7 = l46Var6.R();
                    if (zI7 || objR7 == i8cVar) {
                        objR7 = new dl(r0Var, 6);
                        l46Var6.p0(objR7);
                    }
                    wle.c(tr2Var, j09VarD2, a26Var, (a26) objR7, l46Var6, 8);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                x16 x16Var8 = (x16) obj5;
                a56 a56Var = (a56) obj8;
                x16 x16Var9 = (x16) obj7;
                x16 x16Var10 = (x16) obj6;
                a26 a26Var2 = (a26) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(-1288712117, new fi4(2, x16Var8), l46Var7), af1.b0(-281789428, new m65(a56Var, x16Var9, x16Var10, 5), l46Var7), null, null, 0, y72.j, 0L, null, af1.b0(-195574186, new b56(0, a26Var2, a56Var), l46Var7), l46Var7, 806879670, 440);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                x16 x16Var11 = (x16) obj5;
                String str5 = (String) obj6;
                String str6 = (String) obj8;
                String str7 = (String) obj7;
                h0e h0eVar = (h0e) obj4;
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    xdc.a(null, af1.b0(1626946904, new fi4(3, x16Var11), l46Var8), null, null, null, 0, y72.j, 0L, null, af1.b0(1413529261, new sz7(str5, str6, str7, h0eVar, 7), l46Var8), l46Var8, 806879280, 445);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 8:
                t2g t2gVar = (t2g) obj8;
                LocalDate localDate = (LocalDate) obj7;
                Map map = (Map) obj5;
                a26 a26Var3 = (a26) obj6;
                a26 a26Var4 = (a26) obj4;
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    List listJ1 = s72.j1(map.keySet());
                    boolean zG = l46Var9.g(a26Var3);
                    Object objR8 = l46Var9.R();
                    if (zG || objR8 == i8cVar) {
                        objR8 = new zh1(a26Var3, 20);
                        l46Var9.p0(objR8);
                    }
                    x16 x16Var12 = (x16) objR8;
                    boolean zI8 = l46Var9.i(localDate) | l46Var9.g(a26Var4);
                    Object objR9 = l46Var9.R();
                    if (zI8 || objR9 == i8cVar) {
                        objR9 = new wj6(0, a26Var4, localDate);
                        l46Var9.p0(objR9);
                    }
                    n3d.c(null, t2gVar, localDate, listJ1, x16Var12, (a26) objR9, l46Var9, 0);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 9:
                j2a j2aVar = (j2a) obj8;
                final eda edaVar = (eda) obj7;
                h0e h0eVar2 = (h0e) obj5;
                s69 s69Var = (s69) obj6;
                e89 e89Var2 = (e89) obj4;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var10 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= l46Var10.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var10.W(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    jgb.l(0, l46Var10);
                    ghc ghcVarT = mh3.T(l46Var10);
                    Object objR10 = l46Var10.R();
                    if (objR10 == i8cVar) {
                        objR10 = q1c.f(Float.valueOf(0.0f));
                        l46Var10.p0(objR10);
                    }
                    e89 e89Var3 = (e89) objR10;
                    Object objR11 = l46Var10.R();
                    if (objR11 == i8cVar) {
                        objR11 = q1c.f(Float.valueOf(Float.MAX_VALUE));
                        l46Var10.p0(objR11);
                    }
                    e89 e89Var4 = (e89) objR11;
                    j09 j09VarY = ynb.Y(b.c, xw9Var2);
                    Object objR12 = l46Var10.R();
                    if (objR12 == i8cVar) {
                        objR12 = new ls2(e89Var3, e89Var4, 5);
                        l46Var10.p0(objR12);
                    }
                    j09 j09VarD0 = mh3.d0(nk8.w(j09VarY, (a26) objR12), ghcVarT, false, 14);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var10, 48);
                    int iHashCode3 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM3 = l46Var10.m();
                    j09 j09VarJ3 = m93.J(l46Var10, j09VarD0);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(hj6.z, l46Var10, c92VarA2);
                    dec.l(hj6.y, l46Var10, u8aVarM3);
                    dec.l(hj6.X, l46Var10, Integer.valueOf(iHashCode3));
                    dec.k(l46Var10);
                    dec.l(hj6.x, l46Var10, j09VarJ3);
                    vfh.j(j2aVar, ((dda) h0eVar2.getValue()).a.size(), l46Var10, 0);
                    o5c.f(l46Var10, b.d(g09Var, 24.0f));
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    o5c.f(l46Var10, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    List list2 = ((dda) h0eVar2.getValue()).b;
                    List list3 = ((dda) h0eVar2.getValue()).a;
                    boolean zI9 = l46Var10.i(edaVar);
                    Object objR13 = l46Var10.R();
                    if (zI9 || objR13 == i8cVar) {
                        final int i6 = 0;
                        objR13 = new a26() { // from class: vca
                            @Override // defpackage.a26
                            public final Object d(Object obj9) {
                                Object value;
                                dda ddaVarA;
                                Object value2;
                                dda ddaVar;
                                ArrayList arrayListL1;
                                int i7 = i6;
                                wef wefVar2 = wef.a;
                                eda edaVar2 = edaVar;
                                Integer num = (Integer) obj9;
                                switch (i7) {
                                    case 0:
                                        int iIntValue11 = num.intValue();
                                        s0e s0eVar = edaVar2.b;
                                        do {
                                            value = s0eVar.getValue();
                                            ddaVarA = (dda) value;
                                            TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.y0(iIntValue11, ddaVarA.b);
                                            if (tarotCardChoice != null) {
                                                ArrayList arrayListL2 = s72.l1(ddaVarA.b);
                                                arrayListL2.set(iIntValue11, TarotCardChoice.copy$default(tarotCardChoice, null, !tarotCardChoice.isReversed(), null, 5, null));
                                                ddaVarA = dda.a(ddaVarA, null, arrayListL2, false, 5);
                                            }
                                        } while (!s0eVar.l(value, ddaVarA));
                                        break;
                                    default:
                                        int iIntValue12 = num.intValue();
                                        s0e s0eVar2 = edaVar2.b;
                                        do {
                                            value2 = s0eVar2.getValue();
                                            ddaVar = (dda) value2;
                                            arrayListL1 = s72.l1(ddaVar.b);
                                            arrayListL1.set(iIntValue12, null);
                                        } while (!s0eVar2.l(value2, dda.a(ddaVar, null, arrayListL1, false, 5)));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var10.p0(objR13);
                    }
                    a26 a26Var5 = (a26) objR13;
                    boolean zI10 = l46Var10.i(edaVar);
                    Object objR14 = l46Var10.R();
                    if (zI10 || objR14 == i8cVar) {
                        objR14 = new wf8(8, edaVar);
                        l46Var10.p0(objR14);
                    }
                    l26 l26Var3 = (l26) objR14;
                    boolean zI11 = l46Var10.i(edaVar);
                    Object objR15 = l46Var10.R();
                    if (zI11 || objR15 == i8cVar) {
                        final int i7 = 1;
                        objR15 = new a26() { // from class: vca
                            @Override // defpackage.a26
                            public final Object d(Object obj9) {
                                Object value;
                                dda ddaVarA;
                                Object value2;
                                dda ddaVar;
                                ArrayList arrayListL1;
                                int i8 = i7;
                                wef wefVar2 = wef.a;
                                eda edaVar2 = edaVar;
                                Integer num = (Integer) obj9;
                                switch (i8) {
                                    case 0:
                                        int iIntValue11 = num.intValue();
                                        s0e s0eVar = edaVar2.b;
                                        do {
                                            value = s0eVar.getValue();
                                            ddaVarA = (dda) value;
                                            TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.y0(iIntValue11, ddaVarA.b);
                                            if (tarotCardChoice != null) {
                                                ArrayList arrayListL2 = s72.l1(ddaVarA.b);
                                                arrayListL2.set(iIntValue11, TarotCardChoice.copy$default(tarotCardChoice, null, !tarotCardChoice.isReversed(), null, 5, null));
                                                ddaVarA = dda.a(ddaVarA, null, arrayListL2, false, 5);
                                            }
                                        } while (!s0eVar.l(value, ddaVarA));
                                        break;
                                    default:
                                        int iIntValue12 = num.intValue();
                                        s0e s0eVar2 = edaVar2.b;
                                        do {
                                            value2 = s0eVar2.getValue();
                                            ddaVar = (dda) value2;
                                            arrayListL1 = s72.l1(ddaVar.b);
                                            arrayListL1.set(iIntValue12, null);
                                        } while (!s0eVar2.l(value2, dda.a(ddaVar, null, arrayListL1, false, 5)));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var10.p0(objR15);
                    }
                    a26 a26Var6 = (a26) objR15;
                    Object objR16 = l46Var10.R();
                    if (objR16 == i8cVar) {
                        objR16 = new sg4(s69Var, e89Var2, 4);
                        l46Var10.p0(objR16);
                    }
                    y7h.c(list2, list3, a26Var5, l26Var3, a26Var6, (a26) objR16, j2aVar != j2a.a, ghcVarT, ((Number) e89Var3.getValue()).floatValue(), ((Number) e89Var4.getValue()).floatValue(), l46Var10, 196608);
                    if (2.5f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    o5c.f(l46Var10, new jw7(2.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.5f, true));
                    o5c.f(l46Var10, b.d(g09Var, 16.0f));
                    l46Var10.r(true);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                x16 x16Var13 = (x16) obj5;
                kpb kpbVar = (kpb) obj8;
                x16 x16Var14 = (x16) obj7;
                x16 x16Var15 = (x16) obj6;
                a26 a26Var7 = (a26) obj4;
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(-1396441726, new fi4(29, x16Var13), l46Var11), af1.b0(-178162109, new o7b(kpbVar, x16Var14, x16Var15, 2), l46Var11), null, null, 0, y72.j, 0L, null, af1.b0(-1057144179, new ipb(z ? 1 : 0, a26Var7, kpbVar), l46Var11), l46Var11, 806879670, 440);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ghc ghcVar = (ghc) obj8;
                jkc jkcVar = (jkc) obj7;
                sdd sddVar2 = (sdd) obj5;
                ly lyVar = (ly) obj6;
                mic micVar = (mic) obj4;
                e31 e31Var = (e31) obj;
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= l46Var12.g(e31Var) ? 4 : 2;
                }
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    float fC = e31Var.c();
                    j09 j09VarD1 = mh3.d0(b.c, ghcVar, false, 14);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode4 = Long.hashCode(l46Var12.T);
                    u8a u8aVarM4 = l46Var12.m();
                    j09 j09VarJ4 = m93.J(l46Var12, j09VarD1);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(ov7Var);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, xn8VarC2);
                    dec.l(hj6.y, l46Var12, u8aVarM4);
                    dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode4));
                    dec.k(l46Var12);
                    dec.l(hj6.x, l46Var12, j09VarJ4);
                    j09 j09VarF = b.f(fC, 0.0f, g09Var, 2);
                    jsd jsdVar = jkcVar.f;
                    boolean zK = jkcVar.k();
                    boolean zI12 = l46Var12.i(jkcVar);
                    Object objR17 = l46Var12.R();
                    if (zI12 || objR17 == i8cVar) {
                        objR17 = new yv9(0, jkcVar, jkc.class, "onStartShuffle", "onStartShuffle()V", 0, 9);
                        l46Var12.p0(objR17);
                    }
                    zrc.c(sddVar2, lyVar, jsdVar, zK, (x16) ((ym7) objR17), j09VarF, null, af1.b0(947775807, new gkc(jkcVar, micVar), l46Var12), l46Var12, 12582912);
                    l46Var12.r(true);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                aw2 aw2Var5 = (aw2) obj8;
                ted tedVar3 = (ted) obj7;
                x16 x16Var16 = (x16) obj5;
                wrc wrcVar = (wrc) obj6;
                fpc fpcVar = (fpc) obj4;
                l46 l46Var13 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var13.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    long j2 = y72.j;
                    agb agbVar = new agb(i5);
                    boolean zI13 = l46Var13.i(aw2Var5) | l46Var13.g(tedVar3) | l46Var13.g(x16Var16);
                    Object objR18 = l46Var13.R();
                    if (zI13 || objR18 == i8cVar) {
                        objR18 = new m50(aw2Var5, tedVar3, x16Var16, 7);
                        l46Var13.p0(objR18);
                    }
                    t4c.c(null, null, null, 1, 0, j2, 0.0f, agbVar, (x16) objR18, af1.b0(1903515774, new p50(7, wrcVar, fpcVar), l46Var13), l46Var13, 1797120, 135);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                String str8 = (String) obj6;
                String str9 = (String) obj8;
                String str10 = (String) obj7;
                String str11 = (String) obj5;
                String str12 = (String) obj4;
                l46 l46Var14 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    l46Var14.Z();
                } else if (str8 == null || v4e.Q(str8)) {
                    l46Var14.f0(-73491000);
                    eec.d(null, af1.g, l46Var14, 48);
                    l46Var14.r(false);
                } else {
                    l46Var14.f0(-73878965);
                    String strQ = afc.q(R.string.overview_question, l46Var14);
                    if (str11 == null || v4e.Q(str11) || str12 == null || v4e.Q(str12)) {
                        if (str10 == null || v4e.Q(str10)) {
                            yxdVar = null;
                        } else {
                            xxdVar = new xxd(str10);
                        }
                        vd0.m(strQ, str8, str9, yxdVar, l46Var14, 0, 0);
                        l46Var14.r(false);
                    } else {
                        xxdVar = new wxd(str11, str12);
                    }
                    yxdVar = xxdVar;
                    vd0.m(strQ, str8, str9, yxdVar, l46Var14, 0, 0);
                    l46Var14.r(false);
                }
                return wefVar;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                x16 x16Var17 = (x16) obj5;
                pu1 pu1Var = (pu1) obj8;
                x16 x16Var18 = (x16) obj7;
                x16 x16Var19 = (x16) obj6;
                a26 a26Var8 = (a26) obj4;
                l46 l46Var15 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var15.W(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(1519754990, new fkc(9, x16Var17), l46Var15), af1.b0(-1265190481, new o7b(pu1Var, x16Var18, x16Var19, i3), l46Var15), null, null, 0, y72.j, 0L, null, af1.b0(-1504159239, new sqc(i5, pu1Var, a26Var8), l46Var15), l46Var15, 806879670, 440);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
            default:
                cv6 cv6Var = (cv6) obj8;
                h0e h0eVar3 = (h0e) obj7;
                String str13 = (String) obj6;
                String str14 = (String) obj5;
                qhe qheVar = (qhe) obj4;
                e31 e31Var2 = (e31) obj;
                l46 l46Var16 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                e31Var2.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= l46Var16.g(e31Var2) ? 4 : 2;
                }
                if (l46Var16.W(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    float fD = e31Var2.d() / 338.0f;
                    j09 j09VarB = e31Var2.b(g09Var);
                    boolean zI14 = l46Var16.i(cv6Var) | l46Var16.g(h0eVar3);
                    Object objR19 = l46Var16.R();
                    if (zI14 || objR19 == i8cVar) {
                        objR19 = new p0g(i4, cv6Var, h0eVar3);
                        l46Var16.p0(objR19);
                    }
                    nk8.e(0, (a26) objR19, l46Var16, j09VarB);
                    h4g.l(str13, str14, qheVar.b == 0, fD, e31Var2.a(g09Var, ndb.b), l46Var16, 0);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ n50(x16 x16Var, Object obj, x16 x16Var2, x16 x16Var3, m26 m26Var, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = obj;
        this.d = x16Var2;
        this.e = x16Var3;
        this.f = m26Var;
    }

    public /* synthetic */ n50(int i, x16 x16Var, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = x16Var;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n50(xw9 xw9Var, List list, l26 l26Var, l26 l26Var2, String str) {
        this.a = 2;
        this.c = xw9Var;
        this.d = list;
        this.b = l26Var;
        this.f = l26Var2;
        this.e = str;
    }

    public /* synthetic */ n50(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ n50(String str, String str2, String str3, String str4, String str5) {
        this.a = 13;
        this.e = str;
        this.c = str2;
        this.d = str3;
        this.b = str4;
        this.f = str5;
    }
}
