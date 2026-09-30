package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.router.GiftCardPerspective;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import tech.chatmind.api.Gender;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w7 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w7(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        r0 r0Var = (r0) this.c;
        e89 e89Var = (e89) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            w6f w6fVar = (w6f) e89Var.getValue();
            boolean zI = l46Var.i(r0Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                hl hlVar = new hl(0, r0Var, r0.class, "onTtsSeekBack", "onTtsSeekBack()V", 0, 19);
                l46Var.p0(hlVar);
                objR = hlVar;
            }
            x16 x16Var = (x16) ((ym7) objR);
            boolean zI2 = l46Var.i(r0Var);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                hl hlVar2 = new hl(0, r0Var, r0.class, "onTtsTogglePlayPause", "onTtsTogglePlayPause()V", 0, 20);
                l46Var.p0(hlVar2);
                objR2 = hlVar2;
            }
            x16 x16Var2 = (x16) ((ym7) objR2);
            boolean zI3 = l46Var.i(r0Var);
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == i8cVar) {
                objR3 = new hl(0, r0Var, r0.class, "onTtsSeekForward", "onTtsSeekForward()V", 0, 21);
                l46Var.p0(objR3);
            }
            x16 x16Var3 = (x16) ((ym7) objR3);
            boolean zI4 = l46Var.i(r0Var);
            Object objR4 = l46Var.R();
            if (zI4 || objR4 == i8cVar) {
                hl hlVar3 = new hl(0, r0Var, r0.class, "onTtsClose", "onTtsClose()V", 0, 22);
                l46Var.p0(hlVar3);
                objR4 = hlVar3;
            }
            v6f.a(w6fVar, x16Var, x16Var2, x16Var3, (x16) ((ym7) objR4), null, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        e63 e63Var = (e63) this.c;
        a26 a26Var = (a26) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u7c) obj).getClass();
        if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            l46Var.Z();
        } else if (e63Var instanceof d63) {
            l46Var.f0(2105866854);
            boolean zG = l46Var.g(a26Var) | l46Var.i(e63Var);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new ad1(24, a26Var, e63Var);
                l46Var.p0(objR);
            }
            bm8.h((x16) objR, null, false, null, null, qn4.b, l46Var, 1572864, 62);
            l46Var.r(false);
        } else {
            l46Var.f0(2106208009);
            l46Var.r(false);
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        eh4 eh4Var = (eh4) this.c;
        s69 s69Var = (s69) this.b;
        j09 j09Var = (j09) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        j09Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(j09Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            if9.e(j09Var, eh4Var, false, ((sz9) s69Var).j(), null, l46Var, (iIntValue & 14) | 448, 16);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        eh4 eh4Var = (eh4) this.c;
        yx9 yx9Var = (yx9) this.b;
        c31 c31Var = (c31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c31Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(c31Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            m93.h(eh4Var.c, yx9Var, c31Var.b(g09.a), 0.0f, 0.0f, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        g09 g09Var;
        e89 e89Var;
        a26 a26Var = (a26) this.b;
        aw2 aw2Var = (aw2) this.c;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.TRUE);
                l46Var.p0(objR);
            }
            e89 e89Var2 = (e89) objR;
            g09 g09Var2 = g09.a;
            j09 j09VarZ = ynb.Z(tm7.o(oa7.E(k8b.g(b.c(g09Var2, 1.0f), new ie2(13), l46Var, 6), a7c.b(eze.a(l46Var).a.d)), ((e8b) l46Var.k(l8b.a)).c, g21.f), 16.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarZ);
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
            j09 j09VarD0 = ynb.d0(0.0f, 32.0f, 0.0f, 0.0f, 13, b.r(b.c(g09Var2, 1.0f)));
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
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
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new v74(19);
                l46Var.p0(objR2);
            }
            cs3 cs3VarB = ay9.b(0, 384, 3, (x16) objR2, l46Var);
            hzc hzcVar = cs3VarB.d;
            String strQ = afc.q(((sz9) hzcVar.c).j() == 0 ? R.string.draw_card_tips_message_1 : R.string.draw_card_tips_message_2, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var), l46Var, 0, 0, 131070);
            cn1.h(0.0f, 0, 48, 16380, null, if9.b, l46Var, b.d(g09Var2, 224.0f), null, null, null, null, cs3VarB, null, null, false);
            j09 j09VarZ2 = ynb.Z(g09Var2, 4.0f);
            int iL = cs3VarB.l();
            int iJ = ((sz9) hzcVar.c).j();
            pr4 pr4Var = o82.a;
            vpf.c(j09VarZ2, iJ, iL, ((m82) l46Var.k(pr4Var)).a, ((m82) l46Var.k(pr4Var)).s, l46Var, 6);
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var2, 1.0f), 1);
            String strQ2 = afc.q(((sz9) hzcVar.c).j() == 0 ? R.string.text_next_step : R.string.done, l46Var);
            boolean zG = l46Var.g(cs3VarB) | l46Var.i(aw2Var) | l46Var.g(a26Var);
            Object objR3 = l46Var.R();
            if (zG || objR3 == i8cVar) {
                g09Var = g09Var2;
                jr jrVar = new jr(cs3VarB, aw2Var, a26Var, e89Var2, 13);
                e89Var = e89Var2;
                l46Var.p0(jrVar);
                objR3 = jrVar;
            } else {
                e89Var = e89Var2;
                g09Var = g09Var2;
            }
            c8b.b(j09VarB, strQ2, false, null, 0L, (x16) objR3, l46Var, 6);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, g09Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new ok3(e89Var, 11);
                l46Var.p0(objR4);
            }
            m93.n(zBooleanValue, (x16) objR4, null, false, null, l46Var, 48);
            nte.b(afc.q(R.string.draw_card_don_t_show_tips_again, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
            l46Var.r(true);
            l46Var.r(true);
            j09 j09VarD1 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d));
            boolean zG2 = l46Var.g(a26Var);
            Object objR5 = l46Var.R();
            if (zG2 || objR5 == i8cVar) {
                objR5 = new rj2(a26Var, e89Var, 1);
                l46Var.p0(objR5);
            }
            c8b.h(j09VarD1, false, 0L, 0L, null, (x16) objR5, l46Var, 0, 30);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        e89 e89Var = (e89) this.c;
        mue mueVar = (mue) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            TarotCardChoice tarotCardChoice = (TarotCardChoice) e89Var.getValue();
            if (tarotCardChoice == null) {
                l46Var.f0(1923662249);
                l46Var.r(false);
            } else {
                l46Var.f0(1923662250);
                j09 j09VarC = b.c(g09.a, 1.0f);
                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarC);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, c92VarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                pr4 pr4Var = l8b.a;
                nte.b(afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var), null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var, 0, 0, 131066);
                int i = np4.a[tarotCardChoice.getCard().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4 || (i == 5 && !tarotCardChoice.isReversed())) {
                    z = false;
                    l46Var.f0(-100091453);
                    nte.b(afc.q(R.string.draw_bad_card_reminder, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 131066);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-99894975);
                    z = false;
                    l46Var.r(false);
                }
                l46Var.r(true);
                l46Var.r(z);
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        c4c c4cVar = (c4c) this.c;
        String[] strArr = (String[]) this.b;
        int iIntValue = ((Integer) obj).intValue();
        l46 l46Var = (l46) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= l46Var.e(iIntValue) ? 4 : 2;
        }
        if (l46Var.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            b4c.b(c4cVar, strArr[iIntValue % strArr.length], null, null, 0, false, 0, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        i8c i8cVar;
        cs3 cs3Var = (cs3) this.c;
        hzc hzcVar = cs3Var.d;
        aw2 aw2Var = (aw2) this.b;
        c31 c31Var = (c31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c31Var.getClass();
        int i = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(c31Var) ? 4 : 2;
        }
        int i2 = iIntValue;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int iJ = ((sz9) hzcVar.c).j();
            i8c i8cVar2 = sf2.a;
            if (iJ > 0) {
                l46Var.f0(1366534474);
                lx0 lx0Var = ndb.e;
                boolean zI = l46Var.i(aw2Var) | l46Var.g(cs3Var);
                Object objR = l46Var.R();
                if (zI || objR == i8cVar2) {
                    objR = new i20(aw2Var, cs3Var, i);
                    l46Var.p0(objR);
                }
                i8cVar = i8cVar2;
                kj0.A(c31Var, R.drawable.ic_arrow_left, "Previous", lx0Var, 5.0f, 0.0f, (x16) objR, l46Var, (i2 & 14) | 28032, 16);
                l46Var.r(false);
            } else {
                i8cVar = i8cVar2;
                l46Var.f0(1366895810);
                l46Var.r(false);
            }
            if (((sz9) hzcVar.c).j() < 2) {
                l46Var.f0(1366947890);
                lx0 lx0Var2 = ndb.g;
                boolean zI2 = l46Var.i(aw2Var) | l46Var.g(cs3Var);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == i8cVar) {
                    objR2 = new i20(aw2Var, cs3Var, 3);
                    l46Var.p0(objR2);
                }
                kj0.A(c31Var, R.drawable.ic_arrow_right, "Next", lx0Var2, 0.0f, 5.0f, (x16) objR2, l46Var, (i2 & 14) | 200064, 8);
                l46Var.r(false);
            } else {
                l46Var.f0(1367301538);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        List list = (List) this.c;
        List list2 = (List) this.b;
        int iIntValue = ((Integer) obj).intValue();
        l46 l46Var = (l46) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= l46Var.e(iIntValue) ? 4 : 2;
        }
        if (l46Var.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            kj0.G((esb) list.get(iIntValue), (kw5) list2.get(iIntValue), ynb.b0(20.0f, 0.0f, g09.a, 2), l46Var, 384);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ps5 ps5Var = (ps5) this.c;
        ju5 ju5Var = (ju5) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u7c) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String strQ = afc.q(ps5Var.a, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a(l46Var), l46Var, 0, 0, 130046);
            l46 l46Var2 = l46Var;
            z6e z6eVar = ju5Var.c;
            if (z6eVar == null) {
                l46Var2.f0(-1866745894);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1866745893);
                nte.b(afc.r(ps5Var.b, new Object[]{z6eVar.y()}, l46Var2), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.j(l46Var2), l46Var2, 0, 0, 130046);
                l46Var2 = l46Var2;
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        boolean z;
        final e89 e89Var = (e89) this.c;
        final gj6 gj6Var = (gj6) this.b;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            j09 j09VarY = ynb.Y(b.c, xw9Var);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            rs0.e(0, l46Var, null, ks0.h(24.0f, R.string.onboarding_where_you_know_quin, l46Var, l46Var, g09Var));
            String strH = ks0.h(8.0f, R.string.multi_selector_tips, l46Var, l46Var, g09Var);
            mue mueVar = pue.a;
            nte.b(strH, null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 131066);
            l46 l46Var2 = l46Var;
            o5c.f(l46Var2, b.d(g09Var, 24.0f));
            i8c i8cVar = sf2.a;
            if (zF) {
                l46Var2.f0(-1770379571);
                j09 j09VarC = b.c(g09Var, 1.0f);
                boolean zG = l46Var2.g(e89Var) | l46Var2.i(gj6Var);
                Object objR = l46Var2.R();
                if (zG || objR == i8cVar) {
                    final int i = 0;
                    objR = new a26() { // from class: vi6
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            int i2 = i;
                            wef wefVar = wef.a;
                            int i3 = 7;
                            e89 e89Var2 = e89Var;
                            gj6 gj6Var2 = gj6Var;
                            int i4 = 1;
                            int i5 = 0;
                            switch (i2) {
                                case 0:
                                    v08 v08Var = (v08) obj4;
                                    v08Var.getClass();
                                    List list = ppf.a;
                                    ca2.a.getClass();
                                    List list2 = ca2.c ? ppf.b : ppf.a;
                                    v08Var.X(list2.size(), new d5(13, new sz5(i3), list2), new gj(6, list2, false), new dd2(new zi6(list2, gj6Var2, e89Var2, i5), true, 2039820996));
                                    break;
                                default:
                                    sw7 sw7Var = (sw7) obj4;
                                    sw7Var.getClass();
                                    List list3 = ppf.a;
                                    ca2.a.getClass();
                                    List list4 = ca2.c ? ppf.b : ppf.a;
                                    sw7Var.W(list4.size(), new d5(14, new oz5(20), list4), new gj(7, list4, false), new dd2(new zi6(list4, gj6Var2, e89Var2, i4), true, -1117249557));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var2.p0(objR);
                }
                af1.s(j09VarC, null, null, null, null, null, false, null, (a26) objR, l46Var2, 6, 510);
                l46Var2.r(false);
                z = true;
            } else {
                l46Var2.f0(-1769662975);
                ye6 ye6Var = new ye6(2);
                final int i2 = 1;
                uc0 uc0Var = new uc0(8.0f, true, new qc0(0));
                uc0 uc0Var2 = new uc0(8.0f, true, new qc0(0));
                bx9 bx9Var = new bx9(24.0f, 24.0f, 24.0f, 24.0f);
                boolean zG2 = l46Var2.g(e89Var) | l46Var2.i(gj6Var);
                Object objR2 = l46Var2.R();
                if (zG2 || objR2 == i8cVar) {
                    objR2 = new a26() { // from class: vi6
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            int i3 = i2;
                            wef wefVar = wef.a;
                            int i4 = 7;
                            e89 e89Var2 = e89Var;
                            gj6 gj6Var2 = gj6Var;
                            int i5 = 1;
                            int i6 = 0;
                            switch (i3) {
                                case 0:
                                    v08 v08Var = (v08) obj4;
                                    v08Var.getClass();
                                    List list = ppf.a;
                                    ca2.a.getClass();
                                    List list2 = ca2.c ? ppf.b : ppf.a;
                                    v08Var.X(list2.size(), new d5(13, new sz5(i4), list2), new gj(6, list2, false), new dd2(new zi6(list2, gj6Var2, e89Var2, i6), true, 2039820996));
                                    break;
                                default:
                                    sw7 sw7Var = (sw7) obj4;
                                    sw7Var.getClass();
                                    List list3 = ppf.a;
                                    ca2.a.getClass();
                                    List list4 = ca2.c ? ppf.b : ppf.a;
                                    sw7Var.W(list4.size(), new d5(14, new oz5(20), list4), new gj(7, list4, false), new dd2(new zi6(list4, gj6Var2, e89Var2, i5), true, -1117249557));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var2.p0(objR2);
                }
                z = true;
                an1.e(ye6Var, null, null, bx9Var, uc0Var2, uc0Var, null, false, null, (a26) objR2, l46Var2, 1772544, 918);
                l46Var2 = l46Var2;
                l46Var2.r(false);
            }
            l46Var2.r(z);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        ma8 ma8Var = (ma8) this.c;
        Context context = (Context) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mx7) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            j09 j09VarC = b.c(g09.a, 1.0f);
            th5 th5Var = cye.b;
            cye cyeVarD = fbc.d();
            context.getClass();
            String strL = vpf.L(ma8Var.i(), context, cyeVarD);
            mue mueVar = pue.a;
            nte.b(strL, j09VarC, y72.b(((m82) l46Var.k(o82.a)).q, 0.2f), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 48, 0, 130040);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        mic micVar = (mic) this.c;
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.b;
        c31 c31Var = (c31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c31Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(c31Var) ? 4 : 2;
        }
        if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            l46Var.Z();
        } else if (micVar == null) {
            l46Var.f0(1805833374);
            x57.t(tarotSkinIdentify, b.c, l46Var, 0);
            l46Var.r(false);
        } else {
            l46Var.f0(1805983011);
            feg.j(od4.A(if9.w(micVar).b, 0, l46Var), null, b.c, null, an2.b, 0.0f, null, l46Var, 25016, 104);
            l46Var.r(false);
        }
        return wef.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        iwa iwaVar = (iwa) this.c;
        a26 a26Var = (a26) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 32.0f, 0.0f, 12.0f, 5, ynb.b0(24.0f, 0.0f, g09Var, 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String strQ = afc.q(R.string.personality_paywall_title, l46Var);
            mue mueVar = oue.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.g(l46Var), 0L, 0L, ar5.c, null, 0L, null, 0, 0L, null, null, 16777211), l46Var, 0, 0, 131070);
            String strH = ks0.h(4.0f, R.string.personality_paywall_desc, l46Var, l46Var, g09Var);
            mue mueVar2 = pue.a;
            nte.b(strH, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.j(l46Var), l46Var, 0, 0, 131070);
            o5c.f(l46Var, b.d(g09Var, 20.0f));
            cn1.f(iwaVar, null, null, null, af1.b0(-623572573, new yj4(a26Var, 1), l46Var), l46Var, 24584, 14);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    private final Object s(Object obj, Object obj2, Object obj3) {
        j09 j09VarL;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.c;
        String str = (String) this.b;
        e31 e31Var = (e31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        e31Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(e31Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            whb whbVar = asyncImagePainter.J0;
            fy9 painter = ((yg0) jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0).getValue()).getPainter();
            ald aldVar = painter != null ? new ald(painter.getE0()) : null;
            long j = e31Var.b;
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            g09 g09Var = g09.a;
            if (aldVar != null) {
                long j2 = aldVar.a;
                if (j2 != 9205357640488583168L) {
                    int i = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                        j09VarL = b.l(g09Var, 64.0f);
                    } else {
                        int i2 = (int) (j2 & 4294967295L);
                        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                            j09VarL = b.l(g09Var, 64.0f);
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat(i);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                            float fH = fIntBitsToFloat > ((float) kl2.h(j)) ? kl2.h(j) / fIntBitsToFloat : 1.0f;
                            j09VarL = b.m(g09Var, sw3Var.c0(fIntBitsToFloat * fH), sw3Var.c0(fIntBitsToFloat2 * fH));
                        }
                    }
                } else {
                    j09VarL = b.l(g09Var, 64.0f);
                }
            } else {
                j09VarL = b.l(g09Var, 64.0f);
            }
            feg.j(asyncImagePainter, str, j09VarL, null, an2.e, 0.0f, null, l46Var, 0, 104);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0705  */
    /* JADX WARN: Code duplicated, block: B:209:0x0714  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        Object dzbVar;
        Object objValueOf;
        Object obj4;
        ze6 xe6Var;
        int i = this.a;
        g09 g09Var = g09.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        int i2 = 2;
        wef wefVar = wef.a;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                use useVar = (use) obj6;
                a26 a26Var = (a26) obj5;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j09 j09VarY = eb3.Y(ynb.Y(b.c, xw9Var), m93.p(16.0f, 24.0f, 2));
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarY);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    String strQ = afc.q(R.string.onboarding_description, l46Var);
                    pr4 pr4Var = x8b.a;
                    nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(32), ar5.Y, null, ((y8b) l46Var.k(pr4Var)).c, 0L, 0L, 3, 0, w6c.k(44.8d), null, null, 16613337), l46Var, 0, 0, 131070);
                    nte.b(afc.q(R.string.account_profile_edit_bios_tips, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(17), ar5.w, null, ((y8b) l46Var.k(pr4Var)).b, 0L, 0L, 3, 0, w6c.l(24), null, null, 16613337), l46Var, 0, 0, 131070);
                    b21.j(useVar, b.d(b.c(g09Var, 1.0f), 144.0f), false, null, null, null, t72.b, null, null, null, null, a7c.b(24.0f), null, null, l46Var, 12582960, 0, 31457148);
                    o5c.f(l46Var, new jw7(1.0f, true));
                    j09 j09VarD = b.d(b.c(g09Var, 1.0f), 56.0f);
                    String strQ2 = afc.q(R.string.button_confirm, l46Var);
                    boolean zG = l46Var.g(useVar) | l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new y7(useVar, a26Var);
                        l46Var.p0(objR);
                    }
                    c8b.i(j09VarD, strQ2, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR, l46Var, 6, 0, 4092);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                String str = (String) obj6;
                a26 a26Var2 = (a26) obj5;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    th5 th5Var = cye.b;
                    ma8 ma8VarA = gcc.E(z57.a.a(), fbc.d()).a();
                    boolean zG2 = l46Var2.g(str);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        if (str != null) {
                            try {
                                th5 th5Var2 = cye.b;
                                th5Var2.getClass();
                                w57 w57Var = w57.a;
                                objValueOf = Long.valueOf(gcc.c(gcc.E(mh3.Q(str), th5Var2).a(), th5Var2).e());
                            } catch (Throwable th) {
                                dzbVar = new dzb(th);
                            }
                        } else {
                            objValueOf = null;
                        }
                        dzbVar = objValueOf;
                        if (dzbVar instanceof dzb) {
                            dzbVar = null;
                        }
                        Long l = (Long) dzbVar;
                        Long lValueOf = Long.valueOf(l != null ? l.longValue() : gcc.c(ma8VarA, cye.b).e());
                        l46Var2.p0(lValueOf);
                        obj4 = lValueOf;
                    }
                    xf3 xf3VarP = vf3.p(Long.valueOf(((Number) obj4).longValue()), new a8(ma8VarA, 0), l46Var2, 14);
                    j09 j09VarY2 = eb3.Y(ynb.Y(b.c, xw9Var2), m93.p(16.0f, 0.0f, 2));
                    jx0 jx0Var = ndb.Z;
                    sc0 sc0Var = xc0.c;
                    c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var2, 48);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarY2);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA2);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ2);
                    nte.b(afc.q(R.string.onboarding_birthday, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(32), ar5.Y, null, ((y8b) l46Var2.k(x8b.a)).c, 0L, 0L, 3, 0, w6c.k(44.8d), null, null, 16613337), l46Var2, 0, 0, 131070);
                    j09 j09VarD0 = mh3.d0(new jw7(1.0f, true), mh3.T(l46Var2), false, 14);
                    c92 c92VarA3 = a92.a(sc0Var, ndb.Y, l46Var2, 0);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarD0);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA3);
                    dec.l(he2Var2, l46Var2, u8aVarM3);
                    ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ3);
                    xdg.a(b.c(g09Var, 1.0f), null, xf3VarP, l46Var2, 6);
                    ib8.t(l46Var2, true, g09Var, 32.0f, l46Var2);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    boolean zG3 = l46Var2.g(xf3VarP) | l46Var2.g(a26Var2);
                    Object objR3 = l46Var2.R();
                    Object obj7 = objR3;
                    if (zG3 || objR3 == i8cVar) {
                        z7 z7Var = new z7(xf3VarP, a26Var2, 0);
                        l46Var2.p0(z7Var);
                        obj7 = z7Var;
                    }
                    ym8.h(j09VarC, false, null, false, (x16) obj7, l46Var2, 6, 14);
                    tec.u(g09Var, 24.0f, l46Var2, true);
                    break;
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                e89 e89Var = (e89) obj6;
                a26 a26Var3 = (a26) obj5;
                xw9 xw9Var3 = (xw9) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xw9Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(xw9Var3) ? 4 : 2;
                }
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    j09 j09VarY3 = eb3.Y(ynb.Y(b.c, xw9Var3), m93.p(16.0f, 24.0f, 2));
                    c92 c92VarA4 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                    int iHashCode4 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM4 = l46Var3.m();
                    j09 j09VarJ4 = m93.J(l46Var3, j09VarY3);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, c92VarA4);
                    dec.l(hj6.y, l46Var3, u8aVarM4);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode4));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ4);
                    nte.b(afc.q(R.string.onboarding_gender, l46Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(32), ar5.Y, null, ((y8b) l46Var3.k(x8b.a)).c, 0L, 0L, 3, 0, w6c.k(44.8d), null, null, 16613337), l46Var3, 0, 0, 131070);
                    o5c.f(l46Var3, new jw7(1.0f, true));
                    l46Var3.f0(14830198);
                    lx4 entries = Gender.getEntries();
                    int size = entries.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Gender gender = (Gender) ((mx4) entries).get(i3);
                        boolean z = ((Gender) e89Var.getValue()) == gender;
                        String strQ3 = afc.q(gender.getStringId(), l46Var3);
                        boolean zG4 = l46Var3.g(e89Var) | l46Var3.e(gender.ordinal()) | l46Var3.g(a26Var3);
                        Object objR4 = l46Var3.R();
                        if (zG4 || objR4 == i8cVar) {
                            objR4 = new w6((Object) gender, (Object) a26Var3, (Object) e89Var, (int) (true ? 1 : 0));
                            l46Var3.p0(objR4);
                        }
                        ym8.c(null, strQ3, false, z, (a26) objR4, l46Var3, 384);
                    }
                    l46Var3.r(false);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                List list = (List) obj6;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj5;
                xw9 xw9Var4 = (xw9) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                xw9Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var4.g(xw9Var4) ? 4 : 2;
                }
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    h9g h9gVarX = g21.x(l46Var4);
                    Configuration configuration = (Configuration) l46Var4.k(uq.a);
                    if (configuration.screenHeightDp > configuration.screenWidthDp) {
                        int i4 = h9gVarX.a;
                        Set set = i9g.b;
                        if (i4 == 0) {
                            xe6Var = new ye6(3);
                        } else {
                            xe6Var = new xe6();
                            if (yi4.a(108.0f, 0.0f) <= 0) {
                                l37.a("Provided min size should be larger than zero.");
                            }
                        }
                    } else {
                        xe6Var = new xe6();
                        if (yi4.a(108.0f, 0.0f) <= 0) {
                            l37.a("Provided min size should be larger than zero.");
                        }
                    }
                    ze6 ze6Var = xe6Var;
                    j09 j09VarY4 = ynb.Y(b.c, xw9Var4);
                    bx9 bx9Var = new bx9(24.0f, 24.0f, 24.0f, 24.0f);
                    WeakHashMap weakHashMap = m8g.w;
                    bx9 bx9VarW = g21.W(bx9Var, m93.q(q7c.k(l46Var4).e, l46Var4), l46Var4);
                    uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
                    uc0 uc0Var2 = new uc0(12.0f, true, new qc0(0));
                    boolean zI = l46Var4.i(list) | l46Var4.e(tarotSkinIdentify.ordinal());
                    Object objR5 = l46Var4.R();
                    if (zI || objR5 == i8cVar) {
                        objR5 = new l0(5, list, tarotSkinIdentify);
                        l46Var4.p0(objR5);
                    }
                    an1.e(ze6Var, j09VarY4, null, bx9VarW, uc0Var2, uc0Var, null, false, null, (a26) objR5, l46Var4, 1769472, 916);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    vd0.m(null, str2, str3, null, l46Var5, 0, 9);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                e89 e89Var2 = (e89) obj6;
                h0e h0eVar = (h0e) obj5;
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Object objR6 = l46Var6.R();
                    if (objR6 == i8cVar) {
                        objR6 = new i8(e89Var2, 9);
                        l46Var6.p0(objR6);
                    }
                    bm8.h((x16) objR6, null, ((l40) h0eVar.getValue()) instanceof k40, null, null, rxg.a, l46Var6, 1572870, 58);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                a26 a26Var4 = (a26) obj5;
                AuthOption authOption = (AuthOption) obj6;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    j09 j09VarD2 = b.d(b.c(g09Var, 1.0f), 56.0f);
                    bx9 bx9Var2 = v51.a;
                    u51 u51VarA = v51.a(eze.a(l46Var7).b.w(l46Var7), eze.a(l46Var7).b.y(l46Var7), 0L, 0L, l46Var7, 12);
                    q11 q11VarB = x57.b(eze.a(l46Var7).b.x(l46Var7), 1.0f);
                    y6c y6cVar = eze.a(l46Var7).a.j;
                    boolean zG5 = l46Var7.g(a26Var4) | l46Var7.e(authOption.ordinal());
                    Object objR7 = l46Var7.R();
                    if (zG5 || objR7 == i8cVar) {
                        objR7 = new v6(15, a26Var4, authOption);
                        l46Var7.p0(objR7);
                    }
                    c8b.k(j09VarD2, false, y6cVar, u51VarA, q11VarB, null, false, (x16) objR7, af1.b0(-140742259, new g20(true ? 1 : 0, authOption), l46Var7), l46Var7, 100663302, 98);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                dd2 dd2Var = (dd2) obj6;
                rf0 rf0Var = (rf0) obj5;
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c4c) obj).getClass();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    dd2Var.m(rf0Var, l46Var8, 0);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 8:
                j09 j09Var = (j09) obj6;
                n26 n26Var = (n26) obj5;
                c4c c4cVar = (c4c) obj;
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                c4cVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= l46Var9.g(c4cVar) ? 4 : 2;
                }
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    int i5 = iIntValue9 & 14;
                    o4c o4cVarC = q4c.c(q4c.b(c4cVar, l46Var9));
                    sw3 sw3Var = (sw3) l46Var9.k(zg2.h);
                    wue wueVar = o4cVarC.a;
                    wueVar.getClass();
                    c92 c92VarA5 = a92.a(new uc0(sw3Var.F(wueVar.a), true, new qc0(0)), ndb.Y, l46Var9, 0);
                    int iHashCode5 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM5 = l46Var9.m();
                    j09 j09VarJ5 = m93.J(l46Var9, j09Var);
                    lf2.q.getClass();
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(hj6.z, l46Var9, c92VarA5);
                    dec.l(hj6.y, l46Var9, u8aVarM5);
                    dec.l(hj6.X, l46Var9, Integer.valueOf(iHashCode5));
                    dec.k(l46Var9);
                    dec.l(hj6.x, l46Var9, j09VarJ5);
                    n26Var.m(c4cVar, l46Var9, Integer.valueOf(i5));
                    l46Var9.r(true);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 9:
                vpf.q((a26) obj5, obj6, (pv2) obj3);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                aee aeeVar = (aee) obj6;
                n69 n69Var = (n69) obj5;
                xw9 xw9Var5 = (xw9) obj;
                l46 l46Var10 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                xw9Var5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= l46Var10.g(xw9Var5) ? 4 : 2;
                }
                if (l46Var10.W(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    j09 j09VarD1 = mh3.d0(ynb.Y(b.c, xw9Var5), mh3.T(l46Var10), false, 14);
                    c92 c92VarA6 = a92.a(new uc0(16.0f, false, new jv2(i2, ndb.z)), ndb.Z, l46Var10, 54);
                    int iHashCode6 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM6 = l46Var10.m();
                    j09 j09VarJ6 = m93.J(l46Var10, j09VarD1);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(hj6.z, l46Var10, c92VarA6);
                    dec.l(hj6.y, l46Var10, u8aVarM6);
                    dec.l(hj6.X, l46Var10, Integer.valueOf(iHashCode6));
                    dec.k(l46Var10);
                    dec.l(hj6.x, l46Var10, j09VarJ6);
                    qn4.s(aeeVar.a, ((qz9) n69Var).j(), l46Var10, 6);
                    nte.b(afc.q(R.string.photo_confirm_tips, l46Var10), ynb.b0(32.0f, 0.0f, g09Var, 2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var10.k(nte.a), y72.e, w6c.l(13), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, 0L, null, 3, 0L, null, null, 16744440), l46Var10, 48, 0, 131068);
                    l46Var10.r(true);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj6;
                String str4 = (String) obj5;
                xw9 xw9Var6 = (xw9) obj;
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                xw9Var6.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= l46Var11.g(xw9Var6) ? 4 : 2;
                }
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode7 = Long.hashCode(l46Var11.T);
                    u8a u8aVarM7 = l46Var11.m();
                    j09 j09VarJ7 = m93.J(l46Var11, fillElement);
                    lf2.q.getClass();
                    l46Var11.j0();
                    if (l46Var11.S) {
                        l46Var11.l(ov7Var);
                    } else {
                        l46Var11.s0();
                    }
                    he2 he2Var5 = hj6.z;
                    dec.l(he2Var5, l46Var11, xn8VarC);
                    he2 he2Var6 = hj6.y;
                    dec.l(he2Var6, l46Var11, u8aVarM7);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    he2 he2Var7 = hj6.X;
                    dec.l(he2Var7, l46Var11, numValueOf2);
                    dec.k(l46Var11);
                    he2 he2Var8 = hj6.x;
                    dec.l(he2Var8, l46Var11, j09VarJ7);
                    jgb.l(0, l46Var11);
                    j09 j09VarA0 = ynb.a0(ynb.Y(fillElement, xw9Var6), 24.0f, 24.0f);
                    jx0 jx0Var2 = ndb.Z;
                    c92 c92VarA7 = a92.a(new uc0(24.0f, true, new qc0(0)), jx0Var2, l46Var11, 54);
                    int iHashCode8 = Long.hashCode(l46Var11.T);
                    u8a u8aVarM8 = l46Var11.m();
                    j09 j09VarJ8 = m93.J(l46Var11, j09VarA0);
                    l46Var11.j0();
                    if (l46Var11.S) {
                        l46Var11.l(ov7Var);
                    } else {
                        l46Var11.s0();
                    }
                    dec.l(he2Var5, l46Var11, c92VarA7);
                    dec.l(he2Var6, l46Var11, u8aVarM8);
                    ib8.s(iHashCode8, l46Var11, he2Var7, l46Var11);
                    dec.l(he2Var8, l46Var11, j09VarJ8);
                    g09 g09Var2 = g09.a;
                    j09 j09VarC2 = b.c(g09Var2, 1.0f);
                    String strQ4 = afc.q(R.string.follow_up_clarifying_result_title, l46Var11);
                    mue mueVar = pue.a;
                    mue mueVarA = mue.a(pue.n(l46Var11), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087);
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ4, j09VarC2, ((e8b) l46Var11.k(pr4Var2)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var11, 48, 0, 130040);
                    jw7 jw7Var = new jw7(1.0f, true);
                    c92 c92VarA8 = a92.a(xc0.e, jx0Var2, l46Var11, 54);
                    int iHashCode9 = Long.hashCode(l46Var11.T);
                    u8a u8aVarM9 = l46Var11.m();
                    j09 j09VarJ9 = m93.J(l46Var11, jw7Var);
                    l46Var11.j0();
                    if (l46Var11.S) {
                        l46Var11.l(ov7Var);
                    } else {
                        l46Var11.s0();
                    }
                    dec.l(he2Var5, l46Var11, c92VarA8);
                    dec.l(he2Var6, l46Var11, u8aVarM9);
                    ib8.s(iHashCode9, l46Var11, he2Var7, l46Var11);
                    dec.l(he2Var8, l46Var11, j09VarJ9);
                    o7c.d(b.p(g09Var2, 144.0f), q7c.r(tarotCardChoice), null, false, null, eze.a(l46Var11).a.f, null, false, l46Var11, 6, 220);
                    j09 j09VarD3 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var2);
                    c92 c92VarA9 = a92.a(new uc0(2.0f, true, new qc0(0)), jx0Var2, l46Var11, 54);
                    int iHashCode10 = Long.hashCode(l46Var11.T);
                    u8a u8aVarM10 = l46Var11.m();
                    j09 j09VarJ10 = m93.J(l46Var11, j09VarD3);
                    l46Var11.j0();
                    if (l46Var11.S) {
                        l46Var11.l(ov7Var);
                    } else {
                        l46Var11.s0();
                    }
                    dec.l(he2Var5, l46Var11, c92VarA9);
                    dec.l(he2Var6, l46Var11, u8aVarM10);
                    ib8.s(iHashCode10, l46Var11, he2Var7, l46Var11);
                    dec.l(he2Var8, l46Var11, j09VarJ10);
                    nte.b(str4, null, ((e8b) l46Var11.k(pr4Var2)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 2, 0, null, mue.a(pue.e(l46Var11), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087), l46Var11, 0, 24576, 113658);
                    cgg.c(null, tarotCardChoice, l46Var11, 0, 1);
                    l46Var11.r(true);
                    l46Var11.r(true);
                    l46Var11.r(true);
                    l46Var11.r(true);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                a26 a26Var5 = (a26) obj5;
                ln2 ln2Var = (ln2) obj6;
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    Object objR8 = l46Var12.R();
                    if (objR8 == i8cVar) {
                        objR8 = new mn2();
                        l46Var12.p0(objR8);
                    }
                    mn2 mn2Var = (mn2) objR8;
                    mn2Var.a.clear();
                    a26Var5.d(mn2Var);
                    mn2Var.a(ln2Var, l46Var12, 0);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return a(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case 15:
                return f(obj, obj2, obj3);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return j(obj, obj2, obj3);
            case 20:
                return k(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                GiftCardItem giftCardItem = (GiftCardItem) obj6;
                GiftCardPerspective giftCardPerspective = (GiftCardPerspective) obj5;
                l46 l46Var13 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var13.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    pa6.b(giftCardItem, giftCardPerspective, l46Var13, GiftCardItem.$stable);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 24:
                return o(obj, obj2, obj3);
            case 25:
                return p(obj, obj2, obj3);
            case 26:
                return q(obj, obj2, obj3);
            case 27:
                return r(obj, obj2, obj3);
            case 28:
                return s(obj, obj2, obj3);
            default:
                z19 z19Var = (z19) obj6;
                s69 s69Var = (s69) obj5;
                j09 j09Var2 = (j09) obj;
                l46 l46Var14 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                j09Var2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= l46Var14.g(j09Var2) ? 4 : 2;
                }
                if (l46Var14.W(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    k99.i(j09Var2, z19Var, false, ((sz9) s69Var).j(), null, l46Var14, (iIntValue14 & 14) | 448, 16);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ w7(a26 a26Var, Object obj, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = obj;
    }
}
