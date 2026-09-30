package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc7 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dc7(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.a;
        wef wefVar = wef.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        int i2 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                oc7 oc7Var = (oc7) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xw9) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                    return wefVar;
                }
                FillElement fillElement = b.c;
                j09 j09VarD0 = mh3.d0(fillElement, mh3.T(l46Var), false, 14);
                jx0 jx0Var = ndb.Z;
                c92 c92VarA = a92.a(new uc0(20.0f, true, new qc0(0)), jx0Var, l46Var, 54);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarD0);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var, c92VarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf);
                dec.k(l46Var);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ);
                j09 j09VarC = b.c(b.r(g09Var), 1.0f);
                lx0 lx0Var = ndb.b;
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                feg.j(od4.A(R.drawable.bg_invite, 0, l46Var), null, fillElement, null, an2.g, 0.0f, null, l46Var, 25016, 104);
                j09 j09VarC2 = b.c(g09Var, 1.0f);
                c92 c92VarA2 = a92.a(xc0.c, jx0Var, l46Var, 48);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarC2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA2);
                dec.l(he2Var2, l46Var, u8aVarM3);
                ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ3);
                WeakHashMap weakHashMap = m8g.w;
                o5c.f(l46Var, od4.J(q7c.k(l46Var).f));
                o5c.f(l46Var, b.d(g09Var, 64.0f));
                j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09VarB0);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC2);
                dec.l(he2Var2, l46Var, u8aVarM4);
                ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ4);
                j09 j09VarC3 = b.c(g09Var, 1.0f);
                String strQ = afc.q(R.string.invitation_root_title, l46Var);
                mue mueVar = pue.a;
                mue mueVarL = pue.l(l46Var);
                b68 b68Var = g21.S(l46Var) ? new b68(t72.I(new y72(abg.d(4284895419L)), new y72(abg.d(4278191720L))), null, 0L, 9187343241974906880L) : new b68(t72.I(new y72(abg.d(4294967295L)), new y72(abg.d(4294961061L))), null, 0L, 9187343241974906880L);
                xtd xtdVar = mueVarL.a;
                float fA = xtdVar.a.a();
                long j2 = xtdVar.b;
                ar5 ar5Var = xtdVar.c;
                wq5 wq5Var = xtdVar.d;
                xq5 xq5Var = xtdVar.e;
                yp5 yp5Var = xtdVar.f;
                String str = xtdVar.g;
                long j3 = xtdVar.h;
                ou0 ou0Var = xtdVar.i;
                cte cteVar = xtdVar.j;
                sd8 sd8Var = xtdVar.k;
                long j4 = xtdVar.l;
                mne mneVar = xtdVar.m;
                o4d o4dVar = xtdVar.n;
                un4 un4Var = xtdVar.p;
                ty9 ty9Var = mueVarL.b;
                int i3 = ty9Var.a;
                int i4 = ty9Var.b;
                long j5 = ty9Var.c;
                ete eteVar = ty9Var.d;
                iga igaVar = mueVarL.c;
                y58 y58Var = ty9Var.f;
                int i5 = ty9Var.g;
                int i6 = ty9Var.h;
                cue cueVar = ty9Var.i;
                aga agaVar = igaVar != null ? igaVar.a : null;
                if (!(b68Var instanceof l4d)) {
                    ap.c();
                    throw null;
                }
                mue mueVar2 = new mue(new xtd(new d41(b68Var, fA), j2, ar5Var, wq5Var, xq5Var, yp5Var, str, j3, ou0Var, cteVar, sd8Var, j4, mneVar, o4dVar, agaVar, un4Var), new ty9(i3, i4, j5, eteVar, igaVar != null ? igaVar.b : null, y58Var, i5, i6, cueVar), igaVar);
                cq5 cq5Var = cr5.c;
                long jL = w6c.l(44);
                ar5 ar5Var2 = new ar5(600);
                pr4 pr4Var = o82.a;
                nte.b(strQ, j09VarC3, y72.b(((m82) l46Var.k(pr4Var)).o, 0.88f), 0L, ar5Var2, cq5Var, 0L, null, new jme(3), jL, 0, false, 0, 0, null, mueVar2, l46Var, 1572912, 48, 127800);
                j09 j09VarA0 = ynb.a0(tm7.n(oa7.E(rrb.q(q6c.i(d31.a.a(b.s(g09Var, null, 3), ndb.d), 18.0f), 20.0f, a7c.a(), 0L, y72.h, 12), a7c.a()), g21.S(l46Var) ? new b68(t72.I(new y72(abg.d(4288781311L)), new y72(abg.d(4285820151L))), null, 0L, 9187343241974906880L) : new b68(t72.I(new y72(abg.d(4294967295L)), new y72(abg.d(4294961061L))), null, 0L, 9187343241974906880L), null, 6), 12.0f, 4.0f);
                String strQ2 = afc.q(R.string.invitation_invite_activity_title, l46Var);
                mue mueVarI = pue.i(l46Var);
                if (g21.S(l46Var)) {
                    l46Var.f0(-1494475109);
                    l46Var.r(false);
                    j = y72.e;
                } else {
                    l46Var.f0(-1494473923);
                    j = ((m82) l46Var.k(pr4Var)).a;
                    l46Var.r(false);
                }
                nte.b(strQ2, j09VarA0, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarI, l46Var, 0, 0, 131064);
                l46Var.r(true);
                feg.j(od4.A(R.drawable.ic_new_invitation_logo, 0, l46Var), null, b.c(g09Var, 1.0f), null, an2.d, 0.0f, null, l46Var, 25016, 104);
                l46Var.r(true);
                l46Var.r(true);
                pa7.g(0, l46Var, null, afc.q(R.string.invitation_active_guide, l46Var));
                kj0.x(6, l46Var, ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), (String) oc7Var.g.getValue());
                pa7.g(0, l46Var, null, afc.q(R.string.invitation_friend_gift_label, l46Var));
                j09 j09VarB1 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                String strQ3 = afc.q(R.string.invitation_register_success, l46Var);
                mue mueVarF = pue.f(l46Var);
                pr4 pr4Var2 = l8b.a;
                q3c.a(j09VarB1, strQ3, t72.H(af1.z(R.string.invitation_friends_getting_reading_reaward, l46Var, mue.a(mueVarF, ((e8b) l46Var.k(pr4Var2)).i, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214).a)), od4.A(R.drawable.invitation_reward_register, 0, l46Var), l46Var, 4102);
                pa7.g(0, l46Var, null, afc.q(R.string.invitation_reward_for_yourself, l46Var));
                q3c.a(ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2), afc.q(R.string.invitation_friend_monthly_reward_for_you, l46Var), t72.H(af1.z(R.string.invitation_friend_monthly_you_will_get, l46Var, mue.a(pue.f(l46Var), ((e8b) l46Var.k(pr4Var2)).i, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214).a)), od4.A(R.drawable.invitation_reward_monthly, 0, l46Var), l46Var, 4102);
                q3c.a(ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2), afc.q(R.string.invitation_friend_yearly_reward_for_you, l46Var), t72.H(af1.z(R.string.invitation_friend_yearly_you_will_get, l46Var, mue.a(pue.f(l46Var), ((e8b) l46Var.k(pr4Var2)).i, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214).a)), od4.A(R.drawable.invitation_reward_yearly, 0, l46Var), l46Var, 4102);
                pa7.g(0, l46Var, null, afc.q(R.string.invitation_achievement_label, l46Var));
                qk2.c(i2, 6, l46Var, ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2));
                pa7.g(0, l46Var, null, afc.q(R.string.invitation_tips_label, l46Var));
                vfh.d(ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2), qd0.G0(afc.p(R.array.tips_items, l46Var)), l46Var, 6);
                o5c.f(l46Var, b.d(mh3.N(g09Var), 64.0f));
                l46Var.r(true);
                return wefVar;
            default:
                n26 n26Var = (n26) obj4;
                dd2 dd2Var = g21.d;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
                    int iHashCode5 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM5 = l46Var2.m();
                    j09 j09VarJ5 = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM5);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode5));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ5);
                    nte.b((String) n26Var.m(Integer.valueOf(i2), l46Var2, 0), null, 0L, w6c.l(15), ar5.c, null, 0L, null, null, w6c.l(22), 0, false, 1, 0, null, null, l46Var2, 1597440, 24624, 243630);
                    dd2Var.m(Integer.valueOf(i2), l46Var2, 0);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
        }
    }
}
