package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import ai.askquin.model.reviewreward.ReviewRewardState;
import ai.askquin.ui.seasonal.SeasonalLoadingRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.seasonal.SeasonalSummaryRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.events.model.PopupTrackingEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ckb implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ckb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        TarotCardChoice tarotCardChoiceCopy$default;
        int i = this.a;
        Object objV = null;
        s2cVar = null;
        s2c s2cVar = null;
        wef wefVar = wef.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ekb) obj2).a((vs4) obj);
                return wefVar;
            case 1:
                odc odcVar = (odc) obj2;
                e89 e89Var = (e89) obj;
                if (!(e89Var instanceof wrd)) {
                    qc0.j("Failed requirement.");
                    return null;
                }
                wrd wrdVar = (wrd) e89Var;
                if (wrdVar.getValue() != null) {
                    Object value = wrdVar.getValue();
                    value.getClass();
                    objV = odcVar.v(value);
                }
                yrd yrdVarE = wrdVar.e();
                yrdVarE.getClass();
                return new vz9(objV, yrdVarE);
            case 2:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                i7h.r(sn4Var, (ke6) obj2);
                return wefVar;
            case 3:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                i7h.r(sn4Var2, ((zqb) obj2).g);
                return wefVar;
            case 4:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                for (Map.Entry entry : ((l1f) obj2).a.entrySet()) {
                    l1fVar.a(entry.getValue(), (String) entry.getKey());
                }
                return wefVar;
            case 5:
                ReviewRewardState reviewRewardState = (ReviewRewardState) obj;
                reviewRewardState.getClass();
                return reviewRewardState.recordDismissal((w57) obj2);
            case 6:
                n2c n2cVar = (n2c) obj2;
                ReviewRewardState reviewRewardState2 = (ReviewRewardState) obj;
                int i2 = p2c.b;
                reviewRewardState2.getClass();
                n2cVar.getClass();
                if (n2cVar.a) {
                    u0c u0cVar = n2cVar.b;
                    if (u0cVar == u0c.a) {
                        s2cVar = s2c.b;
                    } else if (u0cVar == u0c.c) {
                        s2cVar = s2c.c;
                    } else if (reviewRewardState2.getRatingRequested()) {
                        s2cVar = s2c.d;
                    } else if (reviewRewardState2.getPromptImpressionCount() >= 3) {
                        s2cVar = s2c.e;
                    } else {
                        w57 lastDismissedAt = reviewRewardState2.getLastDismissedAt();
                        if (lastDismissedAt != null && ar4.c(n2cVar.c.c(lastDismissedAt), p2c.a) < 0) {
                            s2cVar = s2c.f;
                        }
                    }
                } else {
                    s2cVar = s2c.a;
                }
                l2c l2cVar = l2c.a;
                return Boolean.valueOf((s2cVar != null ? new m2c(s2cVar) : l2cVar).equals(l2cVar));
            case 7:
                f9e f9eVar = (f9e) obj;
                f9eVar.getClass();
                ((ld5) obj2).i = f9eVar;
                return wefVar;
            case 8:
                ucc uccVar = ((rcc) obj2).c;
                return Boolean.valueOf(uccVar != null ? uccVar.c(obj) : true);
            case 9:
                ghc ghcVar = (ghc) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                sz9 sz9Var = ghcVar.a;
                float fJ = sz9Var.j() + fFloatValue + ghcVar.g;
                float fN = mh3.n(fJ, 0.0f, ghcVar.f.j());
                boolean z = fJ == fN;
                float fJ2 = fN - sz9Var.j();
                int iRound = Math.round(fJ2);
                sz9Var.k(sz9Var.j() + iRound);
                ghcVar.g = fJ2 - iRound;
                if (!z) {
                    fFloatValue = fJ2;
                }
                return Float.valueOf(fFloatValue);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                gic gicVar = (gic) obj2;
                return new hl9(gicVar.d(gicVar.k, ((hl9) obj).a, gicVar.j));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return SeasonalDraftStore$Draft.copy$default((SeasonalDraftStore$Draft) obj, null, null, null, null, s72.j1(((jkc) obj2).f), pu4.a, 15, null);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.h = (SeasonalLoadingRoute) obj2;
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                SeasonalSummaryRoute seasonalSummaryRoute = (SeasonalSummaryRoute) obj2;
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.h = new SeasonalReadingRoute(seasonalSummaryRoute.getYear(), seasonalSummaryRoute.getSolarTerm(), seasonalSummaryRoute.isRevisit(), seasonalSummaryRoute.getAnalyticsEnabled());
                qb9Var2.e = false;
                qb9Var2.a(-1);
                qb9Var2.e = true;
                qb9Var2.f = false;
                return wefVar;
            case 14:
                ((ra4) obj).getClass();
                return new lf(19, (bjc) obj2);
            case 15:
                return SeasonalDraftStore$Draft.copy$default((SeasonalDraftStore$Draft) obj, null, null, null, null, pu4.a, z5c.z(((jnc) obj2).e).c, 15, null);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                oia oiaVar = (oia) obj;
                if (((v39) obj2).a(oiaVar.c)) {
                    oiaVar.a();
                }
                return wefVar;
            case 17:
                exc.m((hxc) obj, ((i5c) obj2).a);
                return wefVar;
            case 18:
                ((List) obj).add((Float) ((p08) obj2).invoke());
                return true;
            case 19:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                ((PopupTrackingEvent) obj2).getProperties().forEach(new al(new v5c(2, l1fVar2, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 4), 12));
                return wefVar;
            case 20:
                ((t7) obj).getClass();
                ((l8) obj2).invoke();
                return wefVar;
            case 21:
                p4d p4dVar = (p4d) obj2;
                g0c g0cVar = (g0c) obj;
                g0cVar.v(g0cVar.I0.getDensity() * p4dVar.a);
                g0cVar.w(p4dVar.b);
                g0cVar.g(p4dVar.c);
                g0cVar.c(p4dVar.d);
                g0cVar.C(p4dVar.e);
                return wefVar;
            case 22:
                ((ra4) obj).getClass();
                return new lf(21, (dg7[]) obj2);
            case 23:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                String str = ((t12) obj2).a.b;
                String str2 = !v4e.Q(str) ? str : null;
                return (str2 == null || (tarotCardChoiceCopy$default = TarotCardChoice.copy$default(tarotCardChoice, null, false, str2, 3, null)) == null) ? tarotCardChoice : tarotCardChoiceCopy$default;
            case 24:
                ijd ijdVar = (ijd) obj2;
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.q(ijdVar.Z);
                g0cVar2.r(ijdVar.E0);
                g0cVar2.b(ijdVar.F0);
                g0cVar2.E(ijdVar.G0);
                g0cVar2.G(ijdVar.H0);
                g0cVar2.v(ijdVar.I0);
                g0cVar2.l(ijdVar.J0);
                g0cVar2.n(ijdVar.K0);
                g0cVar2.p(ijdVar.L0);
                g0cVar2.e(ijdVar.M0);
                g0cVar2.D(ijdVar.N0);
                g0cVar2.w(ijdVar.O0);
                g0cVar2.g(ijdVar.P0);
                g0cVar2.k(ijdVar.Q0);
                g0cVar2.c(ijdVar.R0);
                g0cVar2.C(ijdVar.S0);
                g0cVar2.j(ijdVar.T0);
                g0cVar2.d(ijdVar.U0);
                g0cVar2.h(ijdVar.V0);
                uu7 uu7Var = ijdVar.W0;
                if (!pa7.t(g0cVar2.H0, uu7Var)) {
                    g0cVar2.a |= 1048576;
                    g0cVar2.H0 = uu7Var;
                }
                return wefVar;
            case 25:
                dr1 dr1Var = (dr1) obj2;
                sn4 sn4Var3 = (sn4) obj;
                sn4Var3.getClass();
                List listI = t72.I(new y72(y72.b(y72.e, dr1Var.b * 0.22f)), new y72(y72.j));
                long j = dr1Var.a;
                sn4.O0(sn4Var3, new ibb(listI, null, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.f() >> 32)) * Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.f() & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L), ald.c(sn4Var3.f()) * 0.62f), 0L, 0L, 0.0f, null, null, 0, 126);
                return wefVar;
            case 26:
                nkd nkdVar = (nkd) obj2;
                qxc qxcVar = nkdVar.g;
                qxcVar.getClass();
                if (!pa7.t(nkdVar.g, qxcVar)) {
                    epa.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                x79 x79Var = nkdVar.f;
                Object obj3 = nkdVar.d;
                if (x79Var != null) {
                    if (obj3 != null) {
                        epa.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    x79Var.e(obj);
                } else if (obj3 == null) {
                    nkdVar.d = obj;
                } else {
                    x79 x79Var2 = mec.a;
                    x79 x79Var3 = new x79();
                    x79Var3.e(obj3);
                    x79Var3.e(obj);
                    nkdVar.f = x79Var3;
                    nkdVar.d = null;
                }
                return wefVar;
            case 27:
                return Integer.valueOf(((lpd) obj2).c(nk8.l(((g49) obj).e)));
            case 28:
                return Boolean.valueOf(pa7.t(((y95) obj).a, (fqd) obj2));
            default:
                ((qz9) obj2).k(((Float) obj).floatValue());
                return wefVar;
        }
    }
}
