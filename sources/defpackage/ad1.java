package defpackage;

import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.dailycard.o;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import ai.askquin.ui.router.AppRoute;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.credits.GuestPassGrantReason;
import tech.chatmind.api.credits.GuestPassPendingGrant;
import tech.chatmind.api.events.model.PopupTracking;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ad1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0498  */
    /* JADX WARN: Code duplicated, block: B:185:0x04b6  */
    @Override // defpackage.x16
    public final Object invoke() {
        Object value;
        List listQ0;
        kpd kpdVarG;
        da9 da9VarC;
        ycc yccVarA;
        SceneTarot sceneTarot;
        r0c r0cVar;
        int i = 0;
        sk9 sk9Var = null;
        zleVar = null;
        Object zleVar = null;
        switch (this.a) {
            case 0:
                ((CameraManager) this.b).unregisterAvailabilityCallback((oc1) this.c);
                return wef.a;
            case 1:
                pi1 pi1Var = (pi1) this.b;
                x48 x48Var = (x48) this.c;
                x48Var.getClass();
                if (!((Boolean) pi1Var.X.getValue()).booleanValue()) {
                    s0e s0eVar = pi1Var.f;
                    aee aeeVar = new aee(null);
                    s0eVar.getClass();
                    s0eVar.n(null, aeeVar);
                    s0e s0eVar2 = pi1Var.v;
                    do {
                        value = s0eVar2.getValue();
                        ((Boolean) value).getClass();
                    } while (!s0eVar2.l(value, Boolean.FALSE));
                    pi1Var.d.m(null);
                    pi1Var.f(x48Var, ((Boolean) pi1Var.x.getValue()).booleanValue());
                }
                return wef.a;
            case 2:
                yag yagVar = (yag) this.b;
                UUID uuid = (UUID) this.c;
                WorkDatabase workDatabase = yagVar.c;
                workDatabase.getClass();
                workDatabase.p(new hla(11, new fe(21, yagVar, uuid)));
                efc.b(yagVar.b, yagVar.c, yagVar.e);
                return wef.a;
            case 3:
                ((a26) this.b).d((List) ((xp1) this.c).c.getValue());
                return wef.a;
            case 4:
                x16 x16Var = (x16) this.b;
                nu1 nu1Var = (nu1) this.c;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new au1(nu1Var, i), 2);
                x16Var.invoke();
                return wef.a;
            case 5:
                l26 l26Var = (l26) this.b;
                u12 u12Var = (u12) this.c;
                l26Var.z(u12Var.a, Integer.valueOf(u12Var.b));
                return wef.a;
            case 6:
                return t72.H(new iy9((oc5) this.b, (em7) this.c));
            case 7:
                og2 og2Var = (og2) this.b;
                Object obj = this.c;
                l46 l46Var = og2Var.a;
                lpd lpdVar = l46Var.c;
                kpd kpdVarG2 = lpdVar.g();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < lpdVar.b) {
                            if (kpdVarG2.l(i2)) {
                                Object objN = kpdVarG2.n(i2);
                                if (objN != obj) {
                                    p46 p46Var = objN instanceof p46 ? (p46) objN : null;
                                    if ((p46Var != null ? p46Var.a : null) == obj) {
                                    }
                                }
                                sk9 sk9Var2 = new sk9(i2, null);
                                kpdVarG2.c();
                                sk9Var = sk9Var2;
                                if (sk9Var != null) {
                                    int i3 = sk9Var.a;
                                    Integer num = sk9Var.b;
                                    kpdVarG = lpdVar.g();
                                    try {
                                        ArrayList arrayListW = cn1.W(kpdVarG, i3, num);
                                        kpdVarG.c();
                                        listQ0 = s72.Q0(arrayListW, l46Var.K());
                                    } catch (Throwable th) {
                                        kpdVarG.c();
                                        throw th;
                                    }
                                } else {
                                    listQ0 = pu4.a;
                                }
                                return new if2(listQ0, l46Var.C);
                            }
                            int[] iArr = kpdVarG2.b;
                            int i4 = i2 + 1;
                            int iD = (i4 < kpdVarG2.c ? iArr[(i4 * 5) + 4] : kpdVarG2.e) - npd.d(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iD) {
                                    i2 = i4;
                                } else {
                                    Object objH = kpdVarG2.h(i2, i5);
                                    if (objH != obj) {
                                        p46 p46Var2 = objH instanceof p46 ? (p46) objH : null;
                                        if ((p46Var2 != null ? p46Var2.a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    sk9Var = new sk9(i2, Integer.valueOf(i5));
                                }
                            }
                        }
                        kpdVarG2.c();
                        if (sk9Var != null) {
                            int i6 = sk9Var.a;
                            Integer num2 = sk9Var.b;
                            kpdVarG = lpdVar.g();
                            ArrayList arrayListW2 = cn1.W(kpdVarG, i6, num2);
                            kpdVarG.c();
                            listQ0 = s72.Q0(arrayListW2, l46Var.K());
                        } else {
                            listQ0 = pu4.a;
                        }
                        return new if2(listQ0, l46Var.C);
                    } catch (Throwable th2) {
                        kpdVarG2.c();
                        throw th2;
                    }
                }
            case 8:
                ((e89) this.c).setValue((String) this.b);
                return wef.a;
            case 9:
                ((a26) this.b).d(((gd4) this.c).d);
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                wef wefVar = wef.a;
                g86 g86Var = (g86) this.b;
                q7b q7bVar = (q7b) this.c;
                if (!g86Var.c) {
                    g86Var.c = true;
                    g86Var.a.d("send_gift_card");
                    g86Var.b.invoke();
                    ka9.e(q7bVar.a, AppRoute.GiftCardPurchase.INSTANCE, null, 6);
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ka0 ka0Var = (ka0) this.b;
                mma mmaVar = (mma) this.c;
                ka0Var.getClass();
                a62 a62VarA = hwf.a(ka0Var);
                js3 js3Var = ga4.a;
                ynb.V(a62VarA, hr3.c, null, new fa0(ka0Var, null), 2);
                mmaVar.G();
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Context context = (Context) this.b;
                mma mmaVar2 = (mma) this.c;
                db6.y0(context);
                mmaVar2.G();
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                mma mmaVar3 = (mma) this.b;
                q7b q7bVar2 = (q7b) this.c;
                ynb.V(lw2.a, null, null, new na0(xqa.N0.a, Boolean.TRUE, null), 3);
                mmaVar3.G();
                jr2.a(q7bVar2.b);
                return wef.a;
            case 14:
                mma mmaVar4 = (mma) this.b;
                ynb.V(hwf.a(mmaVar4), null, null, new fma((mj9) this.c, mmaVar4, null), 3);
                return wef.a;
            case 15:
                mma mmaVar5 = (mma) this.b;
                GuestPassPendingGrant guestPassPendingGrant = ((pua) this.c).b;
                guestPassPendingGrant.getClass();
                String strD = jrb.d(mmaVar5.v);
                if (strD != null) {
                    Object value2 = mmaVar5.F0.getValue();
                    pua puaVar = value2 instanceof pua ? (pua) value2 : null;
                    if (puaVar != null && pa7.t(puaVar.b, guestPassPendingGrant) && pa7.t(puaVar.a, strD)) {
                        synchronized (mmaVar5.S0) {
                            h06 h06Var = mmaVar5.s1;
                            if (h06Var == null || !pa7.t(h06Var.a, guestPassPendingGrant) || !h06Var.b.equals(strD)) {
                                mmaVar5.t1.add(strD);
                                if (guestPassPendingGrant.getReason() == GuestPassGrantReason.Purchase) {
                                    mmaVar5.X0 = null;
                                }
                                h06 h06Var2 = new h06(guestPassPendingGrant, strD);
                                mmaVar5.s1 = h06Var2;
                                a62 a62VarA2 = hwf.a(mmaVar5);
                                js3 js3Var2 = ga4.a;
                                ynb.V(a62VarA2, hr3.c, null, new cma(mmaVar5, strD, h06Var2, puaVar, guestPassPendingGrant, null), 2);
                                r05 r05Var = new r05("popup_view");
                                m16 m16Var = new m16(r05Var, bm8.G(new iy9("popup", "friend_coupon_grant")));
                                x1f x1fVar2 = x1f.a;
                                x1f.g(r05Var, m1f.a, new ot1(15, m16Var));
                            }
                        }
                    }
                }
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                wef wefVar2 = wef.a;
                a06 a06Var = (a06) this.b;
                q7b q7bVar3 = (q7b) this.c;
                if (!a06Var.b) {
                    a06Var.b = true;
                    zp2.a.d("go_gift");
                    a06Var.a.invoke();
                    q7bVar3.a.d(new cz1(17), AppRoute.FriendCoupon.INSTANCE);
                }
                return wefVar2;
            case 17:
                wua wuaVar = (wua) this.b;
                e89 e89Var = (e89) this.c;
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    PopupTracking tracking = wuaVar.b.getPopup().getTracking();
                    rfc.q(rfc.m(tracking != null ? tracking.getView() : null, "popup_view", bm8.G(new iy9("popup", "weekend_free_credit"))));
                    e89Var.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 18:
                z27 z27Var = (z27) this.b;
                cb9 cb9Var = (cb9) this.c;
                if ((z27Var instanceof w27) && (da9VarC = cb9Var.c()) != null && (yccVarA = da9VarC.a()) != null) {
                    yccVarA.d("follow_up_child_returned", Boolean.TRUE);
                }
                cb9Var.g();
                return wef.a;
            case 19:
                tr2 tr2Var = (tr2) this.b;
                x16 x16Var2 = (x16) this.c;
                az1 az1VarC = tr2Var.c.C();
                if (az1VarC != null) {
                    cgg.x(new rp5("button_click", bm8.H((iy9[]) Arrays.copyOf(new iy9[]{new iy9("btn", "new_reading_back"), new iy9("pathway", "new_reading"), new iy9("session_id", az1VarC.b), new iy9("parent_session_id", az1VarC.a.b)}, 4))));
                }
                x16Var2.invoke();
                return wef.a;
            case 20:
                ir2 ir2Var = (ir2) this.b;
                z27 z27Var2 = (z27) ((mmb) this.c).element;
                z27Var2.getClass();
                if (ir2Var instanceof hr2) {
                    hr2 hr2Var = (hr2) ir2Var;
                    zleVar = new ame(hr2Var.b, hr2Var.e);
                } else {
                    v27 v27Var = z27Var2 instanceof v27 ? (v27) z27Var2 : null;
                    if (v27Var != null && (sceneTarot = v27Var.a.h) != null) {
                        zleVar = new zle(sceneTarot.getSceneId());
                    }
                }
                return db6.A0(zleVar);
            case 21:
                p3c p3cVar = (p3c) this.b;
                u8 u8Var = new u8((Context) this.c, 5);
                p3cVar.getClass();
                p3cVar.f();
                r0c r0cVar2 = p3cVar.x;
                if (r0cVar2 != null && ((d3c) p3cVar.d.getValue()).b && p3cVar.m(r0cVar2) && ((r0cVar = p3cVar.G0) == null || !p3cVar.m(r0cVar))) {
                    p3cVar.G0 = r0cVar2;
                    x1f x1fVar3 = x1f.a;
                    x1f.g(p05.a, m1f.a, new z8b(28));
                    ynb.V(hwf.a(p3cVar), null, null, new m3c(p3cVar, r0cVar2, u8Var, null), 3);
                }
                return wef.a;
            case 22:
                r0 r0Var = (r0) this.b;
                use useVar = (use) this.c;
                if (pa7.t(r0Var.a0(), hd4.a) && r0Var.R0.isEmpty()) {
                    return useVar.d().c.toString();
                }
                return null;
            case 23:
                l26 l26Var2 = (l26) this.b;
                d63 d63Var = (d63) this.c;
                l26Var2.z(new DailyCardBasicInfo(d63Var.a, d63Var.b, d63Var.c, d63Var.d, d63Var.e, d63Var.h, d63Var.i, d63Var.g.b()), xad.DailyCardScreenshot);
                return wef.a;
            case 24:
                a26 a26Var = (a26) this.b;
                d63 d63Var2 = (d63) ((e63) this.c);
                d63Var2.getClass();
                a26Var.d(new o33(new DailyCardBasicInfo(d63Var2.a, d63Var2.b, d63Var2.c, d63Var2.d, d63Var2.e, d63Var2.h, d63Var2.i, d63Var2.g.b())));
                return wef.a;
            case 25:
                ((a26) this.b).d(((cod) this.c).a);
                return wef.a;
            case 26:
                DailyCardEntry dailyCardEntry = (DailyCardEntry) this.b;
                e3b e3bVar = (e3b) this.c;
                String targetDate = dailyCardEntry.getTargetDate();
                LocalDate localDate = e3b.a(e3bVar).toLocalDate();
                localDate.getClass();
                return Boolean.valueOf(o.b(targetDate, localDate).equals("tomorrow"));
            case 27:
                r0 r0Var2 = (r0) this.b;
                x16 x16Var3 = (x16) this.c;
                if (r0Var2 != null && !((Boolean) r0Var2.J0.getValue()).booleanValue()) {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    String str = r0Var2.I0;
                    str.getClass();
                    xfb.a.remove(str);
                    xfb.b.remove(str);
                }
                x1f x1fVar4 = x1f.a;
                x1f.k(p05.a, new i73(25), 2);
                x16Var3.invoke();
                return wef.a;
            case 28:
                ((a26) this.b).d(Float.valueOf(zsf.b(((ctf) this.c).a(q7c.j(Float.MAX_VALUE, Float.MAX_VALUE)))));
                return wef.a;
            default:
                return new w67(qn4.R(((ume) this.b).j((bv7) ((x16) this.c).invoke())));
        }
    }
}
