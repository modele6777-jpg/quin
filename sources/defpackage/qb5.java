package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.ui.node.LayoutNode;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb5 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ qb5(x16 x16Var, n26 n26Var, use useVar, s69 s69Var, h0e h0eVar, h0e h0eVar2, jsd jsdVar, aw2 aw2Var, h0e h0eVar3, h0e h0eVar4) {
        this.b = x16Var;
        this.c = n26Var;
        this.d = useVar;
        this.e = s69Var;
        this.f = h0eVar;
        this.g = h0eVar2;
        this.x = jsdVar;
        this.y = aw2Var;
        this.v = h0eVar3;
        this.w = h0eVar4;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i;
        boolean z;
        int i2 = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (i2) {
            case 0:
                x16 x16Var = (x16) obj12;
                n26 n26Var = (n26) obj11;
                use useVar = (use) obj10;
                s69 s69Var = (s69) obj9;
                h0e h0eVar = (h0e) obj8;
                h0e h0eVar2 = (h0e) obj7;
                jsd jsdVar = (jsd) obj4;
                aw2 aw2Var = (aw2) obj3;
                h0e h0eVar3 = (h0e) obj6;
                h0e h0eVar4 = (h0e) obj5;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    y6c y6cVar = ((s5d) l46Var.k(u5d.a)).c;
                    g09 g09Var = g09.a;
                    j09 j09VarO = tm7.o(oa7.E(g09Var, y6cVar), ((m82) l46Var.k(o82.a)).p, g21.f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z2 = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z2) {
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
                    c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var, l46Var, 0, 30);
                    j09 j09VarD0 = mh3.d0(ynb.d0(0.0f, 40.0f, 0.0f, 0.0f, 13, ynb.Z(g09Var, 24.0f)), mh3.T(l46Var), false, 14);
                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
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
                    nte.b(afc.q(R.string.common_feedback, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(r9f.a)).c, l46Var, 0, 0, 131070);
                    int iJ = ((sz9) s69Var).j();
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = new pr1(s69Var, 4);
                        l46Var.p0(objR);
                    }
                    af1.v(iJ, (a26) objR, ynb.Z(g09Var, 16.0f), l46Var, 432);
                    nte.b(afc.q(((Number) h0eVar.getValue()).intValue(), l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                    if (((List) h0eVar2.getValue()).isEmpty()) {
                        i = 0;
                        z = true;
                        l46Var.f0(851914605);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(850797923);
                        z = true;
                        ynb.j(g09Var, new uc0(8.0f, true, new qc0(0)), new uc0(0.0f, true, new qc0(0)), null, 0, 0, af1.b0(1596103605, new j41(h0eVar2, jsdVar, aw2Var, 7), l46Var), l46Var, 1573302, 56);
                        i = 0;
                        l46Var.r(false);
                    }
                    m93.b(e92.a, ((Boolean) h0eVar3.getValue()).booleanValue(), null, rw4.e(null, null, 15), rw4.l(null, null, 15), null, af1.b0(-901703667, new rb5(useVar, i), l46Var), l46Var, 1600518, 18);
                    String strQ = afc.q(R.string.common_submit, l46Var);
                    boolean zBooleanValue = ((Boolean) h0eVar4.getValue()).booleanValue();
                    boolean zG = l46Var.g(n26Var) | l46Var.g(useVar);
                    Object objR2 = l46Var.R();
                    if (zG || objR2 == i8cVar) {
                        jr jrVar = new jr(n26Var, jsdVar, useVar, s69Var, 14);
                        l46Var.p0(jrVar);
                        objR2 = jrVar;
                    }
                    ym8.h(null, zBooleanValue, strQ, false, (x16) objR2, l46Var, 0, 9);
                    l46Var.r(z);
                    l46Var.r(z);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qk2.n((j09) obj12, (LocalDate) obj11, (List) obj10, (List) obj9, (LocalDate) obj8, (LocalDate) obj7, (t91) obj6, (a26) obj5, (TarotSkinIdentify) obj4, (a26) obj3, (l46) obj, k99.P(12582913));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ qb5(j09 j09Var, LocalDate localDate, List list, List list2, LocalDate localDate2, LocalDate localDate3, t91 t91Var, a26 a26Var, TarotSkinIdentify tarotSkinIdentify, a26 a26Var2, int i) {
        this.b = j09Var;
        this.c = localDate;
        this.d = list;
        this.e = list2;
        this.f = localDate2;
        this.g = localDate3;
        this.v = t91Var;
        this.w = a26Var;
        this.x = tarotSkinIdentify;
        this.y = a26Var2;
    }
}
