package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.ReadingFeedbackTag;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffb implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ a26 e;

    public /* synthetic */ ffb(boolean z, List list, List list2, a26 a26Var) {
        this.a = 1;
        this.b = z;
        this.c = list;
        this.d = list2;
        this.e = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((en5) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (ReadingFeedbackTag readingFeedbackTag : this.c) {
                        boolean zContains = this.d.contains(readingFeedbackTag.getKey());
                        a26 a26Var = this.e;
                        boolean zG = l46Var.g(a26Var) | l46Var.i(readingFeedbackTag);
                        Object objR = l46Var.R();
                        if (zG || objR == sf2.a) {
                            objR = new efb(a26Var, readingFeedbackTag, 1);
                            l46Var.p0(objR);
                        }
                        jfb.a(readingFeedbackTag, zContains, this.b, (x16) objR, null, l46Var, ReadingFeedbackTag.$stable, 16);
                    }
                } else {
                    l46Var.Z();
                }
                break;
            case 1:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    jgb.l(0, l46Var2);
                    j09 j09VarY = ynb.Y(b.c, xw9Var);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarY);
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
                    o5c.f(l46Var2, b.d(g09Var, 24.0f));
                    boolean z = this.b;
                    jgb.q(0, 1, l46Var2, null, afc.q(z ? R.string.physical_deck_the_card_you_drawn : R.string.spread_preview_title, l46Var2));
                    o5c.f(l46Var2, b.d(g09Var, 8.0f));
                    if (z) {
                        l46Var2.f0(138753371);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(138673608);
                        jgb.s(0, 0, 5, l46Var2, null, afc.q(R.string.spread_preview_subtitle, l46Var2));
                        l46Var2.r(false);
                    }
                    nk8.d(b.c(g09Var, 1.0f).D(new jw7(1.0f, true)), null, af1.b0(-1082343695, new ffb(this.c, this.d, z, this.e, 2), l46Var2), l46Var2, 3072, 6);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                break;
            default:
                e31 e31Var = (e31) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(e31Var) ? 4 : 2;
                }
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    final List list = this.c;
                    boolean z2 = list.size() >= 3;
                    final float f = z2 ? 80.0f : 109.0f;
                    final float aspectRatio = ((die) l46Var3.k(snd.a)).a.getAspectRatio();
                    j09 j09VarB0 = ynb.b0(0.0f, 24.0f, mh3.d0(b.b(0.0f, e31Var.c(), b.c(g09Var, 1.0f), 1), mh3.T(l46Var3), false, 14), 1);
                    jx0 jx0Var = ndb.Z;
                    c92 c92VarA2 = a92.a(xc0.e, jx0Var, l46Var3, 54);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarB0);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, c92VarA2);
                    dec.l(hj6.y, l46Var3, u8aVarM2);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ2);
                    j09 j09VarB1 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    int size = z2 ? 3 : list.size();
                    uc0 uc0Var = new uc0(8.0f, true, new jv2(3, jx0Var));
                    uc0 uc0Var2 = new uc0(8.0f, true, new qc0(0));
                    final List list2 = this.d;
                    final boolean z3 = this.b;
                    final a26 a26Var2 = this.e;
                    ynb.j(j09VarB1, uc0Var, uc0Var2, null, size, 0, af1.b0(2032365366, new n26() { // from class: twd
                        /* JADX WARN: Code duplicated, block: B:18:0x0045  */
                        @Override // defpackage.n26
                        public final Object m(Object obj4, Object obj5, Object obj6) {
                            Object obj7;
                            l46 l46Var4 = (l46) obj5;
                            int iIntValue4 = ((Integer) obj6).intValue();
                            ((en5) obj4).getClass();
                            int i2 = 0;
                            if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                for (Object obj8 : list) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    TarotCardChoice tarotCardChoice = (TarotCardChoice) obj8;
                                    if (i2 >= 0) {
                                        List list3 = list2;
                                        if (i2 < list3.size()) {
                                            obj7 = list3.get(i2);
                                        } else {
                                            obj7 = "";
                                        }
                                    } else {
                                        obj7 = "";
                                    }
                                    String str = (String) obj7;
                                    boolean z4 = z3;
                                    boolean z5 = !z4;
                                    boolean zE = l46Var4.e(i2);
                                    a26 a26Var3 = a26Var2;
                                    boolean zG2 = zE | l46Var4.g(a26Var3);
                                    Object objR2 = l46Var4.R();
                                    if (zG2 || objR2 == sf2.a) {
                                        objR2 = new rr1(i2, 11, a26Var3);
                                        l46Var4.p0(objR2);
                                    }
                                    p8c.d(tarotCardChoice, i3, str, f, aspectRatio, z4, z5, (x16) objR2, null, l46Var4, 0);
                                    i2 = i3;
                                }
                            } else {
                                l46Var4.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var3), l46Var3, 1573302, 40);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ffb(List list, List list2, boolean z, a26 a26Var, int i) {
        this.a = i;
        this.c = list;
        this.d = list2;
        this.b = z;
        this.e = a26Var;
    }
}
