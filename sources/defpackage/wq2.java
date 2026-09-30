package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.dailycard.ViewDailyCardRoute;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.quickdecision.QuickDecisionDetailRoute;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adjust.sdk.Constants;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.credits.GuestPassGrantPlan;
import tech.chatmind.api.credits.GuestPassPendingGrant;
import tech.chatmind.api.events.model.Popup;
import tech.chatmind.api.events.model.PopupAction;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wq2 {
    public static final void a(int i, l46 l46Var) {
        l46Var.h0(-469016344);
        if (l46Var.W(i & 1, i != 0)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            wt2 wt2Var = (wt2) z5c.G(kobVar.b(wt2.class), pwfVarA.g(), null, gy2VarR, nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB2.b(kobVar.b(m7.class), null, null);
                l46Var.p0(objR);
            }
            m7 m7Var = (m7) objR;
            Context context = (Context) l46Var.k(uq.b);
            boolean zI = l46Var.i(wt2Var) | l46Var.i(m7Var) | l46Var.i(context);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new hp2(wt2Var, m7Var, context, null);
                l46Var.p0(objR2);
            }
            wef wefVar = wef.a;
            af1.o((l26) objR2, l46Var, wefVar);
            x48 x48Var = (x48) l46Var.k(cb8.a);
            boolean zI2 = l46Var.i(x48Var) | l46Var.i(wt2Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                objR3 = new jp2(x48Var, wt2Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, wefVar);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new he2(i, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    public static final void b(q7b q7bVar, l46 l46Var, int i) {
        pwf pwfVarH;
        boolean z;
        ua9 ua9Var;
        l46Var.h0(2144302482);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            Object obj = null;
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                objR = nfcVarB.b(job.a.b(t7.class), null, null);
                l46Var.p0(objR);
            }
            t7 t7Var = (t7) objR;
            b1b b1bVar = uq.b;
            Context context = (Context) l46Var.k(b1bVar);
            a26 a26VarF = qka.f(hc9.c, q7bVar, l46Var);
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(b1bVar);
                Object objR2 = l46Var.R();
                if (objR2 == obj2) {
                    objR2 = zo1.w;
                    l46Var.p0(objR2);
                }
                for (Object obj3 : fyc.u((a26) objR2, objK)) {
                    if (((Context) obj3) instanceof pwf) {
                        obj = obj3;
                        break;
                    }
                }
                pwfVarH = (pwf) obj;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            mma mmaVar = (mma) z5c.G(kobVar.b(mma.class), pwfVarH.g(), null, gy2VarR, nfcVarB2, null);
            Object obj4 = (x48) l46Var.k(cb8.a);
            e89 e89VarH = y41.h(q7bVar.a, l46Var);
            da9 da9Var = (da9) e89VarH.getValue();
            if (da9Var != null && (ua9Var = da9Var.b) != null) {
                int i3 = ua9.e;
                z = kj0.k0(ua9Var, kobVar.b(AppRoute.Main.class));
            }
            e89 e89VarT = tm7.t(mmaVar.Q0, l46Var);
            Uri uriA = ua0.a();
            Object objR3 = l46Var.R();
            if (objR3 == obj2) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR3);
            }
            e89 e89Var = (e89) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj2) {
                objR4 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR4);
            }
            e89 e89Var2 = (e89) objR4;
            mo3 mo3Var = (mo3) t7Var;
            Boolean boolValueOf = Boolean.valueOf(mo3Var.b());
            boolean zI = l46Var.i(uriA) | l46Var.i(mmaVar) | l46Var.i(mo3Var) | l46Var.i(context) | l46Var.g(a26VarF);
            Object objR5 = l46Var.R();
            if (zI || objR5 == obj2) {
                objR5 = new kp2(uriA, mmaVar, mo3Var, context, a26VarF, e89Var, e89Var2, null);
                l46Var.p0(objR5);
            }
            af1.p(uriA, boolValueOf, (l26) objR5, l46Var);
            da9 da9Var2 = (da9) e89VarH.getValue();
            Boolean bool = (Boolean) e89VarT.getValue();
            bool.booleanValue();
            Boolean bool2 = (Boolean) e89Var.getValue();
            bool2.booleanValue();
            Boolean bool3 = (Boolean) e89Var2.getValue();
            bool3.booleanValue();
            Object[] objArr = {da9Var2, uriA, bool, bool2, bool3};
            boolean zG2 = l46Var.g(e89VarT) | l46Var.i(uriA) | l46Var.g(e89VarH) | l46Var.h(z) | l46Var.i(mmaVar);
            Object objR6 = l46Var.R();
            if (zG2 || objR6 == obj2) {
                objR6 = new lp2(uriA, z, mmaVar, e89VarT, e89VarH, e89Var, e89Var2, null);
                e89Var = e89Var;
                e89Var2 = e89Var2;
                l46Var.p0(objR6);
            }
            af1.r(objArr, (l26) objR6, l46Var);
            boolean zI2 = l46Var.i(mmaVar) | l46Var.i(obj4);
            Object objR7 = l46Var.R();
            if (zI2 || objR7 == obj2) {
                objR7 = new wg(obj4, mmaVar, e89Var, e89Var2, 3);
                l46Var.p0(objR7);
            }
            ZoneId zoneId = mma.u1;
            af1.h(obj4, mmaVar, (a26) objR7, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar, i, 6);
        }
    }

    public static final void c(hod hodVar, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1105436069);
        int i2 = (l46Var.i(hodVar) ? 4 : 2) | i;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            o7c.a(false, null, af1.b0(-1740732297, new mo2(i3, tm7.t(hodVar.b, l46Var)), l46Var), l46Var2, 384, 3);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(hodVar, i, 9);
        }
    }

    public static final void d(q7b q7bVar, l46 l46Var, int i) {
        q7b q7bVar2;
        l46Var.h0(1723166238);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            vb2 vb2VarH = kn2.H((Context) l46Var.k(uq.b));
            vb2 vb2Var = vb2VarH != null ? vb2VarH : null;
            if (vb2Var == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new oo2(q7bVar, i, 8);
                    return;
                }
                return;
            }
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(gd8.class), null, null);
                l46Var.p0(objR);
            }
            gd8 gd8Var = (gd8) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = nfcVarB2.b(job.a.b(e3b.class), null, null);
                l46Var.p0(objR2);
            }
            e3b e3bVar = (e3b) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            Object obj2 = (aw2) objR3;
            int i3 = i2 & 14;
            boolean zI = l46Var.i(vb2Var) | (i3 == 4) | l46Var.i(gd8Var) | l46Var.i(e3bVar);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj) {
                q7bVar2 = q7bVar;
                objR4 = new op2(vb2Var, q7bVar2, gd8Var, e3bVar, null);
                l46Var.p0(objR4);
            } else {
                q7bVar2 = q7bVar;
            }
            af1.o((l26) objR4, l46Var, wef.a);
            boolean zI2 = l46Var.i(vb2Var) | l46Var.i(obj2) | (i3 == 4) | l46Var.i(gd8Var) | l46Var.i(e3bVar);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == obj) {
                q7b q7bVar3 = q7bVar2;
                Object kfVar = new kf(vb2Var, obj2, q7bVar3, gd8Var, e3bVar, 5);
                q7bVar2 = q7bVar3;
                l46Var.p0(kfVar);
                objR5 = kfVar;
            }
            af1.g(vb2Var, (a26) objR5, l46Var);
        } else {
            q7bVar2 = q7bVar;
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new oo2(q7bVar2, i, 9);
        }
    }

    public static final void e(int i, l46 l46Var) {
        l46Var.h0(-1210474415);
        if (l46Var.W(i & 1, i != 0)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(t7.class), null, null);
                l46Var.p0(objR);
            }
            t7 t7Var = (t7) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            m25 m25Var = (m25) z5c.G(job.a.b(m25.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            mo3 mo3Var = (mo3) t7Var;
            Boolean boolValueOf = Boolean.valueOf(mo3Var.b());
            boolean zI = l46Var.i(mo3Var) | l46Var.i(m25Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new qp2(mo3Var, m25Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, boolValueOf);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new he2(i, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:341:0x091d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x0297  */
    public static final void f(q7b q7bVar, l46 l46Var, int i) {
        q7b q7bVar2;
        l46 l46Var2;
        Object next;
        pwf pwfVarH;
        Object next2;
        pwf pwfVarH2;
        boolean z;
        Object xp2Var;
        boolean z2;
        boolean z3;
        e89 e89Var;
        dc9 dc9Var;
        yua yuaVar;
        i8c i8cVar;
        mma mmaVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        mma mmaVar2;
        aw2 aw2Var;
        yua yuaVar2;
        g06 g06Var;
        ua9 ua9Var;
        l46 l46Var3 = l46Var;
        l46Var3.h0(596605884);
        int i2 = 4;
        int i3 = i | (l46Var3.g(q7bVar) ? 4 : 2);
        if (l46Var3.W(i3 & 1, (i3 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var3);
            boolean zBooleanValue = ((Boolean) l46Var3.k(h57.a)).booleanValue();
            i8c i8cVar2 = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var3, 1471494079, l46Var3, false);
            } else {
                l46Var3.f0(1471494731);
                Object objK = l46Var3.k(uq.b);
                Object objR = l46Var3.R();
                if (objR == i8cVar2) {
                    objR = zo1.x;
                    l46Var3.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var3.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            mma mmaVar3 = (mma) z5c.G(kobVar.b(mma.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
            pwf pwfVarA = qd8.a(l46Var3);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            qna qnaVar = (qna) z5c.G(kobVar.b(qna.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var3), null);
            nfc nfcVarB2 = kr7.b(l46Var3);
            if (((Boolean) l46Var3.k(h57.a)).booleanValue()) {
                pwfVarH2 = ib8.h(l46Var3, 1471494079, l46Var3, false);
            } else {
                l46Var3.f0(1471494731);
                Object objK2 = l46Var3.k(uq.b);
                Object objR2 = l46Var3.R();
                if (objR2 == i8cVar2) {
                    objR2 = zo1.y;
                    l46Var3.p0(objR2);
                }
                Iterator it2 = fyc.u((a26) objR2, objK2).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((Context) next2) instanceof pwf));
                pwfVarH2 = (pwf) next2;
                l46Var3.r(false);
            }
            if (pwfVarH2 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR2 = b21.r(pwfVarH2);
            kob kobVar2 = job.a;
            dc9 dc9Var2 = (dc9) z5c.G(kobVar2.b(dc9.class), pwfVarH2.g(), null, gy2VarR2, nfcVarB2, null);
            Object objR3 = l46Var3.R();
            if (objR3 == i8cVar2) {
                objR3 = af1.E(l46Var3);
                l46Var3.p0(objR3);
            }
            aw2 aw2Var2 = (aw2) objR3;
            a26 a26VarF = qka.f(hc9.a, q7bVar, l46Var3);
            boolean zI = l46Var3.i(mmaVar3);
            Object objR4 = l46Var3.R();
            if (zI || objR4 == i8cVar2) {
                objR4 = new ot1(i2, mmaVar3);
                l46Var3.p0(objR4);
            }
            ZoneId zoneId = mma.u1;
            af1.g(mmaVar3, (a26) objR4, l46Var3);
            Context context = (Context) l46Var3.k(uq.b);
            e89 e89VarH = y41.h(q7bVar.a, l46Var3);
            da9 da9Var = (da9) e89VarH.getValue();
            if (da9Var == null || (ua9Var = da9Var.b) == null) {
                z = false;
            } else {
                int i4 = ua9.e;
                if (kj0.k0(ua9Var, kobVar2.b(AppRoute.Main.class))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            vma vmaVarI = qnaVar.i();
            boolean zH = l46Var3.h(z) | l46Var3.i(qnaVar) | l46Var3.i(mmaVar3);
            Object objR5 = l46Var3.R();
            if (zH || objR5 == i8cVar2) {
                objR5 = new rp2(z, qnaVar, mmaVar3, null);
                l46Var3.p0(objR5);
            }
            af1.p(boolValueOf, vmaVarI, (l26) objR5, l46Var3);
            boolean z8 = ((Boolean) tm7.t(mmaVar3.Q0, l46Var3).getValue()).booleanValue() || ua0.a() != null;
            Boolean bool = (Boolean) dc9Var2.g.getValue();
            boolean zBooleanValue2 = bool.booleanValue();
            da9 da9Var2 = (da9) e89VarH.getValue();
            Boolean boolValueOf2 = Boolean.valueOf(z8);
            boolean zG = l46Var3.g(e89VarH) | l46Var3.h(zBooleanValue2) | l46Var3.h(z8) | l46Var3.i(dc9Var2) | l46Var3.i(mmaVar3);
            mma mmaVar4 = mmaVar3;
            Object objR6 = l46Var3.R();
            if (zG || objR6 == i8cVar2) {
                boolean z9 = z8;
                xp2Var = new xp2(zBooleanValue2, z9, e89VarH, dc9Var2, mmaVar4, null);
                z2 = zBooleanValue2;
                z3 = z9;
                e89Var = e89VarH;
                l46Var3.p0(xp2Var);
            } else {
                xp2Var = objR6;
                e89Var = e89VarH;
                z3 = z8;
                z2 = zBooleanValue2;
            }
            af1.q(da9Var2, bool, boolValueOf2, (l26) xp2Var, l46Var3);
            da9 da9Var3 = (da9) e89Var.getValue();
            boolean zG2 = l46Var3.g(e89Var) | l46Var3.i(mmaVar4) | l46Var3.h(z);
            Object objR7 = l46Var3.R();
            if (zG2 || objR7 == i8cVar2) {
                objR7 = new so2(e89Var, mmaVar4, z, 0);
                l46Var3.p0(objR7);
            }
            af1.g(da9Var3, (a26) objR7, l46Var3);
            yua yuaVar3 = (yua) tm7.t(mmaVar4.G0, l46Var3).getValue();
            if (z3 || z2) {
                dc9Var = dc9Var2;
                yuaVar = null;
            } else {
                if (!z) {
                    pua puaVar = yuaVar3 instanceof pua ? (pua) yuaVar3 : null;
                    if (puaVar == null || !puaVar.e) {
                        dc9Var = dc9Var2;
                        yuaVar = null;
                    }
                }
                yuaVar = yuaVar3;
                dc9Var = dc9Var2;
            }
            int i5 = 14;
            if (yuaVar instanceof vua) {
                l46Var3.f0(913800272);
                Boolean boolValueOf3 = Boolean.valueOf(qnaVar.h());
                vma vmaVarI2 = qnaVar.i();
                boolean zI2 = l46Var3.i(qnaVar) | l46Var3.i(mmaVar4) | ((i3 & 14) == 4) | l46Var3.i(yuaVar);
                Object objR8 = l46Var3.R();
                if (zI2 || objR8 == i8cVar2) {
                    yp2 yp2Var = new yp2(qnaVar, mmaVar4, q7bVar, yuaVar, null);
                    q7bVar2 = q7bVar;
                    l46Var3.p0(yp2Var);
                    objR8 = yp2Var;
                } else {
                    q7bVar2 = q7bVar;
                }
                int i6 = vua.b;
                af1.q(yuaVar, boolValueOf3, vmaVarI2, (l26) objR8, l46Var3);
                l46Var3.r(false);
                i8cVar = i8cVar2;
            } else {
                q7bVar2 = q7bVar;
                mmaVar4 = mmaVar4;
                yua yuaVar4 = yuaVar;
                if (yuaVar4 instanceof wua) {
                    l46Var3.f0(914700884);
                    wua wuaVar = (wua) yuaVar4;
                    UserPopupEvent userPopupEvent = wuaVar.b;
                    String str = wuaVar.c;
                    Object[] objArr = {str};
                    Object objR9 = l46Var3.R();
                    if (objR9 == i8cVar2) {
                        objR9 = new pg2(25);
                        l46Var3.p0(objR9);
                    }
                    e89 e89Var2 = (e89) vfh.I(objArr, (x16) objR9, l46Var3, 48);
                    Popup popup = userPopupEvent.getPopup();
                    List<PopupAction> actions = userPopupEvent.getPopup().getActions();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : actions) {
                        if (db6.h0((PopupAction) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    uma umaVar = new uma(str, null, Popup.copy$default(popup, arrayList, null, false, null, null, null, null, null, null, 510, null));
                    boolean zBooleanValue3 = ((Boolean) e89Var2.getValue()).booleanValue();
                    boolean zI3 = l46Var3.i(mmaVar4) | l46Var3.i(yuaVar4) | l46Var3.g(e89Var2);
                    Object objR10 = l46Var3.R();
                    if (zI3 || objR10 == i8cVar2) {
                        objR10 = new to2(mmaVar4, wuaVar, e89Var2);
                        l46Var3.p0(objR10);
                    }
                    x16 x16Var = (x16) objR10;
                    boolean zG3 = l46Var3.g(e89Var2) | l46Var3.i(mmaVar4) | l46Var3.g(a26VarF);
                    Object objR11 = l46Var3.R();
                    if (zG3 || objR11 == i8cVar2) {
                        objR11 = new w6(mmaVar4, a26VarF, e89Var2, 20);
                        l46Var3.p0(objR11);
                    }
                    a26 a26Var = (a26) objR11;
                    boolean zG4 = l46Var3.g(e89Var2) | l46Var3.i(yuaVar4) | l46Var3.i(mmaVar4);
                    Object objR12 = l46Var3.R();
                    if (zG4 || objR12 == i8cVar2) {
                        objR12 = new to2(wuaVar, mmaVar4, e89Var2);
                        l46Var3.p0(objR12);
                    }
                    qka.a(umaVar, x16Var, zBooleanValue3, a26Var, (x16) objR12, 0L, null, l46Var3, uma.d, 96);
                    l46Var2 = l46Var3;
                    l46Var2.r(false);
                    i8cVar = i8cVar2;
                    mmaVar = mmaVar4;
                } else {
                    i8cVar = i8cVar2;
                    if (yuaVar4 instanceof pua) {
                        l46Var3.f0(915926872);
                        pua puaVar2 = (pua) yuaVar4;
                        GuestPassPendingGrant guestPassPendingGrant = puaVar2.b;
                        boolean zG5 = l46Var3.g(puaVar2);
                        Object objR13 = l46Var3.R();
                        if (zG5 || objR13 == i8cVar) {
                            zp2 zp2Var = zp2.a;
                            hl hlVar = new hl(0, mmaVar4, mma.class, "onPopupHandled", "onPopupHandled()V", 0, 16);
                            mmaVar4 = mmaVar4;
                            objR13 = new a06(hlVar);
                            l46Var3.p0(objR13);
                        }
                        a06 a06Var = (a06) objR13;
                        int count = guestPassPendingGrant.getCount();
                        GuestPassGrantPlan plan = guestPassPendingGrant.getPlan();
                        int i7 = plan == null ? -1 : f06.a[plan.ordinal()];
                        if (i7 == -1) {
                            g06Var = g06.c;
                        } else if (i7 == 1) {
                            g06Var = g06.a;
                        } else {
                            if (i7 != 2) {
                                ap.c();
                                return;
                            }
                            g06Var = g06.b;
                        }
                        int i8 = puaVar2.c;
                        int i9 = puaVar2.d;
                        boolean zI4 = l46Var3.i(yuaVar4) | l46Var3.i(mmaVar4);
                        Object objR14 = l46Var3.R();
                        if (zI4 || objR14 == i8cVar) {
                            objR14 = new ad1(15, mmaVar4, puaVar2);
                            l46Var3.p0(objR14);
                        }
                        x16 x16Var2 = (x16) objR14;
                        boolean zI5 = l46Var3.i(a06Var) | ((i3 & 14) == 4);
                        Object objR15 = l46Var3.R();
                        if (zI5 || objR15 == i8cVar) {
                            objR15 = new ad1(16, a06Var, q7bVar2);
                            l46Var3.p0(objR15);
                        }
                        x16 x16Var3 = (x16) objR15;
                        boolean zI6 = l46Var3.i(a06Var);
                        Object objR16 = l46Var3.R();
                        if (zI6 || objR16 == i8cVar) {
                            objR16 = new uo2(0, a06Var);
                            l46Var3.p0(objR16);
                        }
                        x16 x16Var4 = (x16) objR16;
                        boolean zI7 = l46Var3.i(a06Var);
                        Object objR17 = l46Var3.R();
                        if (zI7 || objR17 == i8cVar) {
                            objR17 = new hl(0, a06Var, a06.class, "dismiss", "dismiss()V", 0, 15);
                            l46Var3.p0(objR17);
                        }
                        l46Var3 = l46Var3;
                        od4.e(count, g06Var, i8, i9, x16Var2, x16Var3, x16Var4, (x16) ((ym7) objR17), l46Var3, 0);
                        l46Var3.r(false);
                    } else if (pa7.t(yuaVar4, qua.a)) {
                        l46Var3.f0(916825965);
                        boolean zG6 = l46Var3.g(yuaVar4);
                        Object objR18 = l46Var3.R();
                        if (zG6 || objR18 == i8cVar) {
                            l46Var3 = l46Var3;
                            cz1 cz1Var = new cz1(14);
                            hl hlVar2 = new hl(0, mmaVar4, mma.class, "onPopupHandled", "onPopupHandled()V", 0, 17);
                            mmaVar4 = mmaVar4;
                            objR18 = new g86(cz1Var, hlVar2);
                            l46Var3.p0(objR18);
                        }
                        g86 g86Var = (g86) objR18;
                        boolean zI8 = l46Var3.i(mmaVar4);
                        Object objR19 = l46Var3.R();
                        if (zI8 || objR19 == i8cVar) {
                            objR19 = new qo2(mmaVar4, 0);
                            l46Var3.p0(objR19);
                        }
                        x16 x16Var5 = (x16) objR19;
                        boolean zI9 = l46Var3.i(g86Var) | ((i3 & 14) == 4);
                        Object objR20 = l46Var3.R();
                        if (zI9 || objR20 == i8cVar) {
                            objR20 = new ad1(10, g86Var, q7bVar2);
                            l46Var3.p0(objR20);
                        }
                        x16 x16Var6 = (x16) objR20;
                        boolean zI10 = l46Var3.i(g86Var);
                        Object objR21 = l46Var3.R();
                        if (zI10 || objR21 == i8cVar) {
                            objR21 = new p(29, g86Var);
                            l46Var3.p0(objR21);
                        }
                        z7f.d(x16Var5, x16Var6, (x16) objR21, l46Var3, 0);
                        l46Var3.r(false);
                    } else if (yuaVar4 instanceof nua) {
                        l46Var3.f0(917475012);
                        nua nuaVar = (nua) yuaVar4;
                        boolean zG7 = l46Var3.g(nuaVar);
                        Object objR22 = l46Var3.R();
                        if (zG7 || objR22 == i8cVar) {
                            l46Var3 = l46Var3;
                            objR22 = q1c.f(Boolean.FALSE);
                            l46Var3.p0(objR22);
                        }
                        e89 e89Var3 = (e89) objR22;
                        DailyFortuneGuideTrigger dailyFortuneGuideTrigger = nuaVar.a;
                        boolean zI11 = l46Var3.i(mmaVar4);
                        Object objR23 = l46Var3.R();
                        if (zI11 || objR23 == i8cVar) {
                            w wVar = new w(1, mmaVar4, mma.class, "onDailyFortuneGuideExposed", "onDailyFortuneGuideExposed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 19);
                            mmaVar2 = mmaVar4;
                            l46Var3.p0(wVar);
                            objR23 = wVar;
                        } else {
                            mmaVar2 = mmaVar4;
                        }
                        a26 a26Var2 = (a26) ((ym7) objR23);
                        boolean zG8 = l46Var3.g(e89Var3) | l46Var3.i(yuaVar4) | l46Var3.i(aw2Var2) | l46Var3.i(mmaVar2) | ((i3 & 14) == 4);
                        Object objR24 = l46Var3.R();
                        if (zG8 || objR24 == i8cVar) {
                            aw2Var = aw2Var2;
                            yuaVar2 = yuaVar4;
                            m8 m8Var = new m8(3, e89Var3, q7bVar2, nuaVar, aw2Var, mmaVar2);
                            l46Var3.p0(m8Var);
                            objR24 = m8Var;
                        } else {
                            aw2Var = aw2Var2;
                            yuaVar2 = yuaVar4;
                        }
                        x16 x16Var7 = (x16) objR24;
                        boolean zG9 = l46Var3.g(e89Var3) | l46Var3.i(yuaVar2) | l46Var3.i(aw2Var) | l46Var3.i(mmaVar2);
                        Object objR25 = l46Var3.R();
                        if (zG9 || objR25 == i8cVar) {
                            mma mmaVar5 = mmaVar2;
                            jr jrVar = new jr(nuaVar, aw2Var, e89Var3, mmaVar5, 7);
                            mmaVar = mmaVar5;
                            l46Var3.p0(jrVar);
                            objR25 = jrVar;
                        } else {
                            mmaVar = mmaVar2;
                        }
                        l46Var2 = l46Var3;
                        tm7.c(dailyFortuneGuideTrigger, a26Var2, x16Var7, (x16) objR25, l46Var2, 0);
                        l46Var2.r(false);
                    } else {
                        l46Var2 = l46Var3;
                        mmaVar = mmaVar4;
                        if (yuaVar4 instanceof oua) {
                            l46Var2.f0(918391217);
                            pwf pwfVarA2 = qd8.a(l46Var2);
                            if (pwfVarA2 == null) {
                                l46Var3 = l46Var3;
                                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            ka0 ka0Var = (ka0) z5c.G(kobVar2.b(ka0.class), pwfVarA2.g(), null, b21.r(pwfVarA2), kr7.b(l46Var2), null);
                            r55 r55Var = ((oua) yuaVar4).a;
                            if ((i3 & 14) == 4) {
                                l46Var3 = l46Var3;
                                z7 = true;
                            } else {
                                l46Var3 = l46Var3;
                                z7 = false;
                            }
                            Object objR26 = l46Var2.R();
                            if (z7 || objR26 == i8cVar) {
                                objR26 = new ro2(q7bVar2, 0);
                                l46Var2.p0(objR26);
                            }
                            x16 x16Var8 = (x16) objR26;
                            boolean zI12 = l46Var2.i(ka0Var) | l46Var2.i(mmaVar);
                            Object objR27 = l46Var2.R();
                            if (zI12 || objR27 == i8cVar) {
                                objR27 = new ad1(11, ka0Var, mmaVar);
                                l46Var2.p0(objR27);
                            }
                            arb.c(r55Var, x16Var8, (x16) objR27, l46Var2, r55.c);
                            l46Var2.r(false);
                        } else if (pa7.t(yuaVar4, uua.a)) {
                            l46Var2.f0(918805284);
                            if ((i3 & 14) == 4) {
                                l46Var3 = l46Var3;
                                z6 = true;
                            } else {
                                l46Var3 = l46Var3;
                                z6 = false;
                            }
                            boolean zI13 = l46Var2.i(mmaVar) | z6;
                            Object objR28 = l46Var2.R();
                            if (zI13 || objR28 == i8cVar) {
                                objR28 = new wp2(q7bVar2, mmaVar, null);
                                l46Var2.p0(objR28);
                            }
                            af1.o((l26) objR28, l46Var2, wef.a);
                            l46Var2.r(false);
                        } else if (pa7.t(yuaVar4, xua.a)) {
                            l46Var2.f0(919407025);
                            boolean zI14 = l46Var2.i(mmaVar);
                            Object objR29 = l46Var2.R();
                            if (zI14 || objR29 == i8cVar) {
                                l46Var3 = l46Var3;
                                objR29 = new qo2(mmaVar, 1);
                                l46Var2.p0(objR29);
                            }
                            x16 x16Var9 = (x16) objR29;
                            boolean zI15 = l46Var2.i(context) | l46Var2.i(mmaVar);
                            Object objR30 = l46Var2.R();
                            if (zI15 || objR30 == i8cVar) {
                                objR30 = new ad1(12, context, mmaVar);
                                l46Var2.p0(objR30);
                            }
                            t4c.h(x16Var9, (x16) objR30, l46Var2, 0);
                            l46Var2.r(false);
                        } else if (pa7.t(yuaVar4, sua.a)) {
                            l46Var2.f0(919656699);
                            boolean zI16 = l46Var2.i(dc9Var);
                            Object objR31 = l46Var2.R();
                            if (zI16 || objR31 == i8cVar) {
                                l46Var3 = l46Var3;
                                objR31 = new l8(dc9Var, 2);
                                l46Var2.p0(objR31);
                            }
                            x16 x16Var10 = (x16) objR31;
                            boolean zI17 = l46Var2.i(mmaVar);
                            Object objR32 = l46Var2.R();
                            if (zI17 || objR32 == i8cVar) {
                                objR32 = new qo2(mmaVar, 2);
                                l46Var2.p0(objR32);
                            }
                            qn4.r(x16Var10, (x16) objR32, l46Var2, 0);
                            l46Var2.r(false);
                        } else {
                            boolean zT = pa7.t(yuaVar4, rua.a);
                            int i10 = 3;
                            if (zT) {
                                l46Var2.f0(919961088);
                                boolean zI18 = l46Var2.i(mmaVar);
                                if ((i3 & 14) == 4) {
                                    l46Var3 = l46Var3;
                                    z5 = true;
                                } else {
                                    l46Var3 = l46Var3;
                                    z5 = false;
                                }
                                boolean z10 = zI18 | z5;
                                Object objR33 = l46Var2.R();
                                if (z10 || objR33 == i8cVar) {
                                    objR33 = new ad1(13, mmaVar, q7bVar2);
                                    l46Var2.p0(objR33);
                                }
                                x16 x16Var11 = (x16) objR33;
                                boolean zI19 = l46Var2.i(mmaVar);
                                Object objR34 = l46Var2.R();
                                if (zI19 || objR34 == i8cVar) {
                                    objR34 = new qo2(mmaVar, i10);
                                    l46Var2.p0(objR34);
                                }
                                urg.g(x16Var11, (x16) objR34, l46Var2, 0);
                                l46Var2.r(false);
                            } else if (yuaVar4 instanceof tua) {
                                l46Var2.f0(920344961);
                                mj9 mj9Var = ((tua) yuaVar4).a;
                                int i11 = mj9Var.a;
                                boolean zG10 = l46Var2.g(mmaVar) | l46Var2.g(mj9Var);
                                Object objR35 = l46Var2.R();
                                if (zG10 || objR35 == i8cVar) {
                                    l46Var3 = l46Var3;
                                    objR35 = new ad1(i5, mmaVar, mj9Var);
                                    l46Var2.p0(objR35);
                                }
                                x16 x16Var12 = (x16) objR35;
                                if (i11 == 1 || i11 == 3) {
                                    l46Var2.f0(920556071);
                                    boolean z11 = (i3 & 14) == 4;
                                    Object objR36 = l46Var2.R();
                                    if (z11 || objR36 == i8cVar) {
                                        objR36 = new ro2(q7bVar2, 1);
                                        l46Var2.p0(objR36);
                                    }
                                    z4 = false;
                                    pa7.j(i11, x16Var12, (x16) objR36, l46Var2, 0);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(920813743);
                                    d83 d83Var = mj9Var.b;
                                    if (d83Var == null) {
                                        qc0.p("Required value was null.");
                                        return;
                                    } else {
                                        z83.c(i11, d83Var, x16Var12, l46Var2, 0);
                                        l46Var2.r(false);
                                        z4 = false;
                                    }
                                }
                                l46Var2.r(z4);
                            } else {
                                if (yuaVar4 != null) {
                                    l46Var3 = l46Var3;
                                    throw tec.d(2107687625, l46Var2, false);
                                }
                                l46Var3 = l46Var3;
                                l46Var2.f0(921040260);
                                l46Var2.r(false);
                            }
                        }
                    }
                }
                e89 e89VarT = tm7.t(mmaVar.I0, l46Var2);
                e89 e89VarT2 = tm7.t(mmaVar.O0, l46Var2);
                if (z || z3 || z2 || !((Boolean) e89VarT.getValue()).booleanValue()) {
                    l46Var2.f0(921824870);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(921428938);
                    long jLongValue = ((Number) e89VarT2.getValue()).longValue();
                    boolean zI20 = l46Var2.i(mmaVar);
                    Object objR37 = l46Var2.R();
                    if (zI20 || objR37 == i8cVar) {
                        w wVar2 = new w(1, mmaVar, mma.class, "onEventPopupVisibilityChanged", "onEventPopupVisibilityChanged(Z)V", 0, 20);
                        l46Var2.p0(wVar2);
                        objR37 = wVar2;
                    }
                    qka.c(q7bVar2, jLongValue, (a26) ((ym7) objR37), l46Var2, i3 & 14);
                    jr2 jr2Var = q7bVar2.b;
                    long jLongValue2 = ((Number) e89VarT2.getValue()).longValue();
                    boolean zI21 = l46Var2.i(mmaVar);
                    Object objR38 = l46Var2.R();
                    if (zI21 || objR38 == i8cVar) {
                        w wVar3 = new w(1, mmaVar, mma.class, "onMonthlyEventPopupVisibilityChanged", "onMonthlyEventPopupVisibilityChanged(Z)V", 0, 21);
                        l46Var2.p0(wVar3);
                        objR38 = wVar3;
                    }
                    ym8.e(jr2Var, jLongValue2, (a26) ((ym7) objR38), l46Var2, 0);
                    l46Var2.r(false);
                }
            }
            l46Var2 = l46Var3;
            mmaVar = mmaVar4;
            e89 e89VarT3 = tm7.t(mmaVar.I0, l46Var2);
            e89 e89VarT4 = tm7.t(mmaVar.O0, l46Var2);
            if (z) {
                l46Var2.f0(921824870);
                l46Var2.r(false);
            } else {
                l46Var2.f0(921824870);
                l46Var2.r(false);
            }
        } else {
            q7bVar2 = q7bVar;
            l46Var2 = l46Var3;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar2, i, 4);
        }
    }

    public static final void g(nua nuaVar, aw2 aw2Var, e89 e89Var, mma mmaVar, String str, x16 x16Var) {
        if (((Boolean) e89Var.getValue()).booleanValue()) {
            return;
        }
        e89Var.setValue(Boolean.TRUE);
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger = nuaVar.a;
        dailyFortuneGuideTrigger.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new ks2(10, str, dailyFortuneGuideTrigger), 2);
        ynb.V(aw2Var, null, null, new aq2(mmaVar, x16Var, null), 3);
    }

    public static final void h(q7b q7bVar, l46 l46Var, int i) {
        Object next;
        pwf pwfVarH;
        Object next2;
        pwf pwfVarH2;
        Object no2Var;
        ProcessLifecycleOwner processLifecycleOwner;
        Intent intent;
        l46Var.h0(2033110933);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = zo1.z;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            mma mmaVar = (mma) z5c.G(job.a.b(mma.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH2 = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK2 = l46Var.k(uq.b);
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = zo1.X;
                    l46Var.p0(objR2);
                }
                Iterator it2 = fyc.u((a26) objR2, objK2).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((Context) next2) instanceof pwf));
                pwfVarH2 = (pwf) next2;
                l46Var.r(false);
            }
            if (pwfVarH2 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            dc9 dc9Var = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH2.g(), null, b21.r(pwfVarH2), nfcVarB2, null);
            ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.w;
            Context context = (Context) l46Var.k(uq.b);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                Activity activity = context instanceof Activity ? (Activity) context : null;
                objR3 = Boolean.valueOf((activity == null || (intent = activity.getIntent()) == null) ? false : intent.getBooleanExtra("isNewUser", false));
                l46Var.p0(objR3);
            }
            boolean zBooleanValue2 = ((Boolean) objR3).booleanValue();
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = q1c.f(Boolean.TRUE);
                l46Var.p0(objR4);
            }
            e89 e89Var = (e89) objR4;
            boolean zI = l46Var.i(dc9Var) | l46Var.i(mmaVar) | ((i2 & 14) == 4) | l46Var.i(processLifecycleOwner2);
            Object objR5 = l46Var.R();
            if (zI || objR5 == obj) {
                processLifecycleOwner = processLifecycleOwner2;
                no2Var = new no2(processLifecycleOwner, dc9Var, mmaVar, zBooleanValue2, q7bVar, e89Var);
                l46Var.p0(no2Var);
            } else {
                no2Var = objR5;
                processLifecycleOwner = processLifecycleOwner2;
            }
            af1.g(processLifecycleOwner, (a26) no2Var, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar, i, i3);
        }
    }

    public static final void i(q7b q7bVar, l46 l46Var, int i) {
        ojb ojbVarV;
        oo2 oo2Var;
        l46Var.h0(1299506223);
        int i2 = 2;
        int i3 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            vb2 vb2VarH = kn2.H((Context) l46Var.k(uq.b));
            if (vb2VarH == null) {
                vb2VarH = null;
            }
            if (vb2VarH == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    oo2Var = new oo2(q7bVar, i, i4);
                }
            } else {
                int i5 = i3 & 14;
                boolean zI = l46Var.i(vb2VarH) | (i5 == 4);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                Object obj2 = objR;
                if (zI || objR == obj) {
                    Object bq2Var = new bq2(vb2VarH, q7bVar, null);
                    l46Var.p0(bq2Var);
                    obj2 = bq2Var;
                }
                af1.o((l26) obj2, l46Var, wef.a);
                int i6 = (l46Var.i(vb2VarH) ? 1 : 0) | (i5 != 4 ? 0 : 1);
                Object objR2 = l46Var.R();
                Object obj3 = objR2;
                if (i6 != 0 || objR2 == obj) {
                    Object po2Var = new po2(vb2VarH, q7bVar, 0);
                    l46Var.p0(po2Var);
                    obj3 = po2Var;
                }
                af1.g(vb2VarH, (a26) obj3, l46Var);
            }
            ojbVarV.d = oo2Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            oo2Var = new oo2(q7bVar, i, i2);
            ojbVarV.d = oo2Var;
        }
    }

    public static final void j(q7b q7bVar, l46 l46Var, int i) {
        Object next;
        pwf pwfVarH;
        pwf pwfVarH2;
        l46Var.h0(763529753);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            Object obj = null;
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                objR = nfcVarB.b(job.a.b(t7.class), null, null);
                l46Var.p0(objR);
            }
            t7 t7Var = (t7) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR2 = l46Var.R();
                if (objR2 == obj2) {
                    objR2 = zo1.Y;
                    l46Var.p0(objR2);
                }
                Iterator it = fyc.u((a26) objR2, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            dc9 dc9Var = (dc9) z5c.G(kobVar.b(dc9.class), pwfVarH.g(), null, gy2VarR, nfcVarB2, null);
            b1b b1bVar = uq.b;
            Context context = (Context) l46Var.k(b1bVar);
            nfc nfcVarB3 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB3);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj2) {
                objR3 = nfcVarB3.b(kobVar.b(q9b.class), null, null);
                l46Var.p0(objR3);
            }
            q9b q9bVar = (q9b) objR3;
            nfc nfcVarB4 = kr7.b(l46Var);
            boolean zG3 = l46Var.g(null) | l46Var.g(nfcVarB4);
            Object objR4 = l46Var.R();
            if (zG3 || objR4 == obj2) {
                objR4 = nfcVarB4.b(kobVar.b(fab.class), null, null);
                l46Var.p0(objR4);
            }
            fab fabVar = (fab) objR4;
            nfc nfcVarB5 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH2 = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK2 = l46Var.k(b1bVar);
                Object objR5 = l46Var.R();
                if (objR5 == obj2) {
                    objR5 = zo1.Z;
                    l46Var.p0(objR5);
                }
                for (Object obj3 : fyc.u((a26) objR5, objK2)) {
                    if (((Context) obj3) instanceof pwf) {
                        obj = obj3;
                        break;
                    }
                }
                pwfVarH2 = (pwf) obj;
                l46Var.r(false);
            }
            if (pwfVarH2 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            mma mmaVar = (mma) z5c.G(job.a.b(mma.class), pwfVarH2.g(), null, b21.r(pwfVarH2), nfcVarB5, null);
            mo3 mo3Var = (mo3) t7Var;
            Boolean boolValueOf = Boolean.valueOf(mo3Var.b());
            boolean zI = l46Var.i(mo3Var) | l46Var.i(context) | l46Var.i(mmaVar) | l46Var.i(dc9Var) | l46Var.i(fabVar) | l46Var.i(q9bVar) | ((i2 & 14) == 4);
            Object objR6 = l46Var.R();
            if (zI || objR6 == obj2) {
                Object iq2Var = new iq2(mo3Var, context, mmaVar, dc9Var, fabVar, q9bVar, q7bVar, null);
                l46Var.p0(iq2Var);
                objR6 = iq2Var;
            }
            af1.o((l26) objR6, l46Var, boolValueOf);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    public static final void k(q7b q7bVar, l46 l46Var, int i) {
        Object next;
        pwf pwfVarH;
        boolean z;
        boolean z2;
        ?? r5;
        Object next2;
        pwf pwfVarH2;
        ua9 ua9Var;
        ua9 ua9Var2;
        l46Var.h0(902651252);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = zo1.E0;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            mma mmaVar = (mma) z5c.G(kobVar.b(mma.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
            e89 e89VarT = tm7.t(mmaVar.I0, l46Var);
            e89 e89VarT2 = tm7.t(mmaVar.d1, l46Var);
            e89 e89VarT3 = tm7.t(mmaVar.Q0, l46Var);
            e89 e89VarH = y41.h(q7bVar.a, l46Var);
            pr4 pr4Var = uq.b;
            vb2 vb2VarH = kn2.H((Context) l46Var.k(pr4Var));
            da9 da9Var = (da9) e89VarH.getValue();
            boolean zI = l46Var.i(vb2VarH) | l46Var.g(e89VarH);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new jq2(vb2VarH, e89VarH, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, da9Var);
            da9 da9Var2 = (da9) e89VarH.getValue();
            if (da9Var2 == null || (ua9Var2 = da9Var2.b) == null) {
                z = false;
            } else {
                int i3 = ua9.e;
                if (kj0.k0(ua9Var2, kobVar.b(AppRoute.Main.class))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            da9 da9Var3 = (da9) e89VarH.getValue();
            if (da9Var3 == null || (ua9Var = da9Var3.b) == null) {
                z2 = false;
            } else {
                int i4 = ua9.e;
                if (kj0.k0(ua9Var, kobVar.b(PaywallRoute.UpgradePaywall.class))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            boolean z3 = (((Boolean) e89VarT3.getValue()).booleanValue() || ((Boolean) e89VarT2.getValue()).booleanValue() || z2 || (z && !((Boolean) e89VarT.getValue()).booleanValue())) ? false : true;
            if (z3) {
                l46Var.f0(-135508894);
                r5 = 0;
                qn4.t(0, l46Var);
            } else {
                r5 = 0;
                l46Var.f0(94205038);
            }
            l46Var.r(r5);
            n16.q(r5, l46Var);
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH2 = ib8.h(l46Var, 1471494079, l46Var, r5);
            } else {
                l46Var.f0(1471494731);
                Object objK2 = l46Var.k(pr4Var);
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = zo1.F0;
                    l46Var.p0(objR3);
                }
                Iterator it2 = fyc.u((a26) objR3, objK2).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((Context) next2) instanceof pwf));
                pwfVarH2 = (pwf) next2;
                l46Var.r(false);
            }
            if (pwfVarH2 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            dc9 dc9Var = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH2.g(), null, b21.r(pwfVarH2), nfcVarB2, null);
            if (!z3 || dc9Var.f()) {
                l46Var.f0(94768494);
                l46Var.r(false);
            } else {
                l46Var.f0(94684887);
                boolean z4 = (i2 & 14) == 4;
                Object objR4 = l46Var.R();
                if (z4 || objR4 == obj) {
                    objR4 = new ro2(q7bVar, 2);
                    l46Var.p0(objR4);
                }
                z5c.c((x16) objR4, l46Var, 0);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar, i, 7);
        }
    }

    public static final void l(int i, l46 l46Var) {
        o9 o9Var;
        l46Var.h0(495536681);
        if (l46Var.W(i & 1, i != 0)) {
            Context context = (Context) l46Var.k(uq.b);
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(s7.class), null, null);
                l46Var.p0(objR);
            }
            s7 s7Var = (s7) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = nfcVarB2.b(job.a.b(o9.class), null, null);
                l46Var.p0(objR2);
            }
            o9 o9Var2 = (o9) objR2;
            nfc nfcVarB3 = kr7.b(l46Var);
            boolean zG3 = l46Var.g(null) | l46Var.g(nfcVarB3);
            Object objR3 = l46Var.R();
            if (zG3 || objR3 == obj) {
                objR3 = nfcVarB3.b(job.a.b(gpf.class), null, null);
                l46Var.p0(objR3);
            }
            gpf gpfVar = (gpf) objR3;
            boolean zI = l46Var.i(s7Var) | l46Var.i(context) | l46Var.i(gpfVar) | l46Var.i(o9Var2);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj) {
                o9Var = o9Var2;
                objR4 = new qq2(s7Var, context, gpfVar, o9Var, null);
                l46Var.p0(objR4);
            } else {
                o9Var = o9Var2;
            }
            int i2 = o9.z;
            af1.q(s7Var, o9Var, gpfVar, (l26) objR4, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new he2(i, 27);
        }
    }

    public static final void m(q7b q7bVar, l46 l46Var, int i) {
        ojb ojbVarV;
        oo2 oo2Var;
        l46Var.h0(767859917);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            vb2 vb2VarH = kn2.H((Context) l46Var.k(uq.b));
            if (vb2VarH == null) {
                vb2VarH = null;
            }
            if (vb2VarH == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    oo2Var = new oo2(q7bVar, i, 11);
                }
            } else {
                int i3 = i2 & 14;
                boolean zI = l46Var.i(vb2VarH) | (i3 == 4);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (zI || objR == obj) {
                    objR = new rq2(vb2VarH, q7bVar, null);
                    l46Var.p0(objR);
                }
                af1.o((l26) objR, l46Var, wef.a);
                boolean zI2 = l46Var.i(vb2VarH) | (i3 == 4);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == obj) {
                    objR2 = new po2(vb2VarH, q7bVar, 1);
                    l46Var.p0(objR2);
                }
                af1.g(vb2VarH, (a26) objR2, l46Var);
            }
            ojbVarV.d = oo2Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            oo2Var = new oo2(q7bVar, i, 12);
            ojbVarV.d = oo2Var;
        }
    }

    public static final void n(q7b q7bVar, l46 l46Var, int i) {
        q7b q7bVar2;
        l46Var.h0(1008356843);
        int i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            vb2 vb2VarH = kn2.H((Context) l46Var.k(uq.b));
            vb2 vb2Var = vb2VarH != null ? vb2VarH : null;
            if (vb2Var == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new oo2(q7bVar, i, 5);
                    return;
                }
                return;
            }
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(gd8.class), null, null);
                l46Var.p0(objR);
            }
            gd8 gd8Var = (gd8) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            Object obj2 = (aw2) objR2;
            int i3 = i2 & 14;
            boolean zI = l46Var.i(vb2Var) | (i3 == 4) | l46Var.i(gd8Var);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new sq2(vb2Var, q7bVar, gd8Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, wef.a);
            boolean zI2 = l46Var.i(vb2Var) | l46Var.i(obj2) | (i3 == 4) | l46Var.i(gd8Var);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                q7bVar2 = q7bVar;
                Object wgVar = new wg(vb2Var, obj2, q7bVar2, gd8Var, 4);
                l46Var.p0(wgVar);
                objR4 = wgVar;
            } else {
                q7bVar2 = q7bVar;
            }
            af1.g(vb2Var, (a26) objR4, l46Var);
        } else {
            q7bVar2 = q7bVar;
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new oo2(q7bVar2, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(Activity activity, q7b q7bVar, gd8 gd8Var, e3b e3bVar, zn2 zn2Var) {
        uq2 uq2Var;
        String str;
        Object dzbVar;
        Object viewDailyCardRoute;
        if (zn2Var instanceof uq2) {
            uq2Var = (uq2) zn2Var;
            int i = uq2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uq2Var.label = i - Integer.MIN_VALUE;
            } else {
                uq2Var = new uq2(zn2Var);
            }
        } else {
            uq2Var = new uq2(zn2Var);
        }
        Object objB = uq2Var.result;
        int i2 = uq2Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                Intent intent = activity.getIntent();
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("triggered_by");
                    List list = ua3.a;
                    if (pa7.t(stringExtra, "daily_push") || pa7.t(stringExtra, "tomorrow_fortune_push")) {
                        String stringExtra2 = intent.getStringExtra("daily_fortune_target_date");
                        intent.removeExtra("triggered_by");
                        intent.removeExtra("push_id");
                        intent.removeExtra("daily_reminder_kind");
                        intent.removeExtra("daily_fortune_target_date");
                        str = stringExtra2;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        wc8 wc8Var = gd8Var.d;
                        uq2Var.L$0 = null;
                        uq2Var.L$1 = q7bVar;
                        uq2Var.L$2 = null;
                        uq2Var.L$3 = e3bVar;
                        uq2Var.L$4 = str;
                        uq2Var.label = 1;
                        objB = tm7.B(wc8Var, uq2Var);
                        bw2 bw2Var = bw2.a;
                        if (objB == bw2Var) {
                            return bw2Var;
                        }
                    }
                }
                return wef.a;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) uq2Var.L$4;
            e3bVar = (e3b) uq2Var.L$3;
            q7bVar = (q7b) uq2Var.L$1;
            jzb.q(objB);
            dzbVar = LocalDate.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        lb8 lb8Var = (lb8) objB;
        List list2 = lb8Var.n;
        ma8 ma8Var = lb8Var.m;
        LocalDateTime localDateTimeA = e3b.a(e3bVar);
        str.getClass();
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        LocalDate localDate = (LocalDate) dzbVar;
        if (localDate == null) {
            viewDailyCardRoute = null;
        } else {
            String string = localDate.toString();
            string.getClass();
            b93 b93VarB = e73.b(localDateTimeA);
            if (localDate.compareTo((ChronoLocalDate) b93VarB.a()) > 0) {
                viewDailyCardRoute = null;
            } else if (list2.contains(string)) {
                viewDailyCardRoute = new ViewDailyCardRoute(string, "notification");
            } else {
                if (pa7.t(ma8Var != null ? ma8Var.toString() : null, string)) {
                    viewDailyCardRoute = new ViewDailyCardRoute(string, "notification");
                } else if (localDate.compareTo((ChronoLocalDate) b93VarB.a) >= 0) {
                    viewDailyCardRoute = new DailyCardEntry("notification", string);
                } else {
                    viewDailyCardRoute = null;
                }
            }
        }
        if (viewDailyCardRoute != null) {
            ka9.e(q7bVar.a, viewDailyCardRoute, null, 6);
        }
        return wef.a;
    }

    public static final void p(Activity activity, q7b q7bVar) {
        String stringExtra;
        Intent intent;
        Intent intent2;
        Intent intent3 = activity.getIntent();
        if (intent3 == null || (stringExtra = intent3.getStringExtra("triggered_by")) == null || !stringExtra.equals("four_seasons")) {
            return;
        }
        Intent intent4 = activity.getIntent();
        boolean z = intent4 != null && intent4.hasExtra("seasonal_year");
        Intent intent5 = activity.getIntent();
        boolean z2 = intent5 != null && intent5.hasExtra("seasonal_term");
        yic yicVar = yic.c;
        yic yicVarL = drb.l((!z2 || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("seasonal_term"), (!z || (intent2 = activity.getIntent()) == null) ? null : Integer.valueOf(intent2.getIntExtra("seasonal_year", 0)));
        if (yicVarL == null) {
            return;
        }
        Intent intent6 = activity.getIntent();
        if (intent6 != null) {
            intent6.removeExtra("triggered_by");
        }
        Intent intent7 = activity.getIntent();
        if (intent7 != null) {
            intent7.removeExtra("seasonal_year");
        }
        Intent intent8 = activity.getIntent();
        if (intent8 != null) {
            intent8.removeExtra("seasonal_term");
        }
        ka9.e(q7bVar.a, new FourSeasonsEntry(yicVarL.a, yicVarL.b.getWireValue(), Constants.PUSH), null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014f  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public static final void q(Activity activity, q7b q7bVar) {
        String stringExtra;
        Object exploreTarotRoute$GraphEntry;
        Intent intent = activity.getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("qa_nav_route")) == null) {
            return;
        }
        Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            intent2.removeExtra("qa_nav_route");
        }
        switch (stringExtra) {
            case "all-history":
                exploreTarotRoute$GraphEntry = AppRoute.AllHistory.INSTANCE;
                break;
            case "my-tarot":
                exploreTarotRoute$GraphEntry = new ExploreTarotRoute$GraphEntry(TarotSkinIdentify.Classic);
                break;
            case "auto-renew":
                exploreTarotRoute$GraphEntry = AppRoute.AutoRenew.INSTANCE;
                break;
            case "card-detail":
                exploreTarotRoute$GraphEntry = AppRoute.CardDetailQaRoute.INSTANCE;
                break;
            case "new-reading":
                exploreTarotRoute$GraphEntry = AppRoute.Conversation.INSTANCE;
                break;
            case "notification-settings":
                exploreTarotRoute$GraphEntry = AppRoute.NotificationSettingsRoute.INSTANCE;
                break;
            case "gift-card-purchase":
                exploreTarotRoute$GraphEntry = AppRoute.GiftCardPurchase.INSTANCE;
                break;
            case "input-invitation":
                exploreTarotRoute$GraphEntry = AppRoute.InputInvitationCode.INSTANCE;
                break;
            case "deck-carousel":
                exploreTarotRoute$GraphEntry = new ExploreTarotRoute$GraphEntry(TarotSkinIdentify.Classic);
                break;
            case "faq":
                exploreTarotRoute$GraphEntry = AppRoute.FAQ.INSTANCE;
                break;
            case "home":
            case "main":
                exploreTarotRoute$GraphEntry = AppRoute.Main.INSTANCE;
                break;
            case "about":
                exploreTarotRoute$GraphEntry = AppRoute.About.INSTANCE;
                break;
            case "my-account":
                exploreTarotRoute$GraphEntry = AppRoute.MyAccount.INSTANCE;
                break;
            case "gift-card-list":
                exploreTarotRoute$GraphEntry = AppRoute.GiftCardList.INSTANCE;
                break;
            case "play-tarot":
                exploreTarotRoute$GraphEntry = new ExploreTarotRoute$GraphEntry(TarotSkinIdentify.Classic);
                break;
            case "gift-card":
                exploreTarotRoute$GraphEntry = AppRoute.GiftCardPurchase.INSTANCE;
                break;
            case "theme-selection":
                exploreTarotRoute$GraphEntry = AppRoute.ThemeSelection.INSTANCE;
                break;
            case "my-gift-cards":
                exploreTarotRoute$GraphEntry = AppRoute.GiftCardList.INSTANCE;
                break;
            case "history":
                exploreTarotRoute$GraphEntry = AppRoute.AllHistory.INSTANCE;
                break;
            case "invitation":
                exploreTarotRoute$GraphEntry = AppRoute.Invitation.INSTANCE;
                break;
            case "settings":
                exploreTarotRoute$GraphEntry = AppRoute.MyAccount.INSTANCE;
                break;
            case "gift-card-guide":
                exploreTarotRoute$GraphEntry = AppRoute.GiftCardGuidePreview.INSTANCE;
                break;
            case "skin-mall":
                exploreTarotRoute$GraphEntry = new SkinNavigationRoute$SkinMallRoute(false, (TarotSkinIdentify) null, 3, (rp3) null);
                break;
            default:
                exploreTarotRoute$GraphEntry = null;
                break;
        }
        if (exploreTarotRoute$GraphEntry != null) {
            ka9.e(q7bVar.a, exploreTarotRoute$GraphEntry, null, 6);
            return;
        }
        m65 m65Var = u04.a;
        m65 m65Var2 = u04.a;
        if (m65Var2 != null) {
            m65Var2.z(stringExtra, "qa");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(Activity activity, q7b q7bVar, gd8 gd8Var, zn2 zn2Var) {
        vq2 vq2Var;
        String stringExtra;
        Activity activity2;
        String str;
        if (zn2Var instanceof vq2) {
            vq2Var = (vq2) zn2Var;
            int i = vq2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq2Var.label = i - Integer.MIN_VALUE;
            } else {
                vq2Var = new vq2(zn2Var);
            }
        } else {
            vq2Var = new vq2(zn2Var);
        }
        Object obj = vq2Var.result;
        int i2 = vq2Var.label;
        wef wefVar = wef.a;
        if (i2 == 0) {
            jzb.q(obj);
            Intent intent = activity.getIntent();
            if (intent != null && (stringExtra = intent.getStringExtra("source")) != null) {
                Intent intent2 = activity.getIntent();
                if (intent2 != null) {
                    intent2.removeExtra("source");
                }
                boolean zEquals = stringExtra.equals("quick_decision_widget");
                p05 p05Var = p05.a;
                if (zEquals) {
                    Intent intent3 = activity.getIntent();
                    long longExtra = intent3 != null ? intent3.getLongExtra("qd_id", -1L) : -1L;
                    Intent intent4 = activity.getIntent();
                    if (intent4 != null) {
                        intent4.removeExtra("qd_id");
                    }
                    if (longExtra > 0) {
                        x1f x1fVar = x1f.a;
                        x1f.k(p05Var, new cz1(15), 2);
                        ka9.e(q7bVar.a, new QuickDecisionDetailRoute(longExtra, "widget"), null, 6);
                        return wefVar;
                    }
                } else if (stringExtra.equals("widget")) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05Var, new cz1(16), 2);
                    String string = LocalDate.now().toString();
                    string.getClass();
                    wc8 wc8Var = gd8Var.d;
                    vq2Var.L$0 = activity;
                    vq2Var.L$1 = q7bVar;
                    vq2Var.L$2 = null;
                    vq2Var.L$3 = null;
                    vq2Var.L$4 = string;
                    vq2Var.label = 1;
                    Object objB = tm7.B(wc8Var, vq2Var);
                    bw2 bw2Var = bw2.a;
                    if (objB == bw2Var) {
                        return bw2Var;
                    }
                    activity2 = activity;
                    str = string;
                    obj = objB;
                }
            }
            return wefVar;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) vq2Var.L$4;
        q7bVar = (q7b) vq2Var.L$1;
        activity2 = (Activity) vq2Var.L$0;
        jzb.q(obj);
        List list = ((lb8) obj).n;
        List list2 = g6g.a;
        boolean zC = g6g.c(activity2);
        str.getClass();
        if (zC || list.contains(str)) {
            ka9.e(q7bVar.a, new ViewDailyCardRoute(str, "widget"), null, 6);
            return wefVar;
        }
        ka9.e(q7bVar.a, new DailyCardEntry("widget", str), null, 6);
        return wefVar;
    }

    public static final boolean s(mma mmaVar) {
        return ua0.a() != null || ((Boolean) mmaVar.Q0.a.getValue()).booleanValue();
    }
}
