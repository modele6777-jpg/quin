package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j6d implements l26 {
    public final /* synthetic */ ShareSummaryContent E0;
    public final /* synthetic */ String X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ TarotSkinIdentify Z;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ z3g f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ a26 w;
    public final /* synthetic */ s69 x;
    public final /* synthetic */ e89 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ j6d(j09 j09Var, boolean z, boolean z2, boolean z3, z3g z3gVar, int i, boolean z4, a26 a26Var, s69 s69Var, e89 e89Var, boolean z5, String str, List list, TarotSkinIdentify tarotSkinIdentify, ShareSummaryContent shareSummaryContent) {
        this.b = j09Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z3gVar;
        this.g = i;
        this.v = z4;
        this.w = a26Var;
        this.x = s69Var;
        this.y = e89Var;
        this.z = z5;
        this.X = str;
        this.Y = list;
        this.Z = tarotSkinIdentify;
        this.E0 = shareSummaryContent;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    pr4 pr4Var = o10.a;
                    s69 s69Var = this.x;
                    boolean zG = l46Var.g(s69Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new q50(s69Var, 9);
                        l46Var.p0(objR);
                    }
                    mh3.a(pr4Var.a((x16) objR), af1.b0(-660945408, new j6d(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, s69Var, this.y, this.z, this.X, this.Y, this.Z, this.E0), l46Var), l46Var, 56);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarE = oa7.E(urg.F(this.b, ia7.a), g21.f);
                    int iJ = ((sz9) this.x).j();
                    boolean zS = g21.S(l46Var2);
                    boolean z = this.c;
                    z3g z3gVar = this.f;
                    e89 e89Var = this.y;
                    boolean z2 = z && this.d && this.e && (z3gVar == null || ((cv6) e89Var.getValue()) != null);
                    Integer numValueOf = Integer.valueOf(iJ);
                    a26 a26Var = this.w;
                    boolean zG2 = l46Var2.g(a26Var);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new k50(a26Var, 14);
                        l46Var2.p0(objR2);
                    }
                    j09 j09VarA = d8d.a(this.g, (l26) objR2, j09VarE, numValueOf, "card", zS, z2, this.v);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarA);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    boolean z3 = this.z;
                    String str = this.X;
                    List list = this.Y;
                    TarotSkinIdentify tarotSkinIdentify = this.Z;
                    ShareSummaryContent shareSummaryContent = this.E0;
                    if (z3) {
                        l46Var2.f0(750118847);
                        p6d.d(str, list, tarotSkinIdentify, shareSummaryContent, l46Var2, 6 | (ShareSummaryContent.$stable << 12));
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(750327384);
                        p6d.c(str, list, tarotSkinIdentify, (cv6) e89Var.getValue(), z3gVar != null ? Float.valueOf(z3gVar.c) : null, shareSummaryContent, l46Var2, 6 | (ShareSummaryContent.$stable << 18));
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ j6d(s69 s69Var, j09 j09Var, boolean z, boolean z2, boolean z3, z3g z3gVar, int i, boolean z4, a26 a26Var, e89 e89Var, boolean z5, String str, List list, TarotSkinIdentify tarotSkinIdentify, ShareSummaryContent shareSummaryContent) {
        this.x = s69Var;
        this.b = j09Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z3gVar;
        this.g = i;
        this.v = z4;
        this.w = a26Var;
        this.y = e89Var;
        this.z = z5;
        this.X = str;
        this.Y = list;
        this.Z = tarotSkinIdentify;
        this.E0 = shareSummaryContent;
    }
}
