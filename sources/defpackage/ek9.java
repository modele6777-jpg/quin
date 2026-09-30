package defpackage;

import ai.askquin.R;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.draw.photo.homepage.DrawnCardsConfirmRoute;
import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadPreviewRoute;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.onboard.OnboardAuthRoute;
import ai.askquin.ui.onboard.OnboardHearFromRoute;
import ai.askquin.ui.onboard.OnboardRealTarotRoute;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.router.AppRoute;
import android.content.Context;
import android.webkit.WebView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import tech.chatmind.api.RecommendQuestion;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek9 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ek9(Object obj, String str, vd9 vd9Var) {
        this.a = 7;
        this.b = obj;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[LOOP:0: B:11:0x0041->B:21:0x0074, LOOP_END] */
    @Override // defpackage.x16
    public final Object invoke() {
        Object onboardAuthRoute;
        ycc yccVarA;
        ycc yccVarA2;
        int i = this.a;
        p05 p05Var = p05.a;
        int i2 = 8;
        int i3 = 0;
        wef wefVar = wef.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return "Only found " + ((kmb) obj2).element + " digits in a row, but need to parse " + ((fk9) obj).b();
            case 1:
                return eec.p((String) obj2, g5e.f, new nyc[0], new p59(i2, (wn2) obj));
            case 2:
                cb9 cb9Var = (cb9) obj2;
                e89 e89Var = (e89) obj;
                tj7 tj7Var = tj7.L0;
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("onboarding_welcome_tap"), tj7Var, 2);
                }
                boolean z = ca2.c;
                if (z) {
                    onboardAuthRoute = OnboardHearFromRoute.INSTANCE;
                } else if (z) {
                    onboardAuthRoute = new OnboardAuthRoute(false, false, false, 7, (rp3) null);
                } else {
                    e89Var.setValue(Boolean.TRUE);
                    onboardAuthRoute = OnboardRealTarotRoute.INSTANCE;
                }
                ka9.e(cb9Var, onboardAuthRoute, null, 6);
                return wefVar;
            case 3:
                mfc mfcVar = (mfc) ((x08) obj2).invoke();
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new xn9(9), 2);
                ((wg) obj).d(mfcVar);
                return wefVar;
            case 4:
                ((ru9) obj2).a.setValue(Boolean.TRUE);
                da9 da9VarH = ((tr2) obj).b.b.h();
                if (da9VarH != null && (yccVarA = da9VarH.a()) != null) {
                }
                return wefVar;
            case 5:
                ((a26) obj2).d((OverviewItem.NewReadingItem) obj);
                return wefVar;
            case 6:
                Boolean bool = (Boolean) ((h0e) obj2).getValue();
                bool.booleanValue();
                Boolean bool2 = (Boolean) ((h0e) obj).getValue();
                bool2.getClass();
                return new iy9(bool, bool2);
            case 7:
                return "Attempting to assign conflicting values '" + obj2 + "' and '" + obj + "' to field 'monthName'";
            case 8:
                o3a o3aVar = (o3a) obj;
                vb2 vb2VarH = kn2.H((Context) obj2);
                if (vb2VarH != null) {
                    y41.N(o3aVar.P0, vb2VarH, new p59(11, o3aVar), 2);
                }
                return wefVar;
            case 9:
                cb9 cb9Var2 = (cb9) obj2;
                PaywallRoute.AddonPaywall addonPaywall = (PaywallRoute.AddonPaywall) obj;
                da9 da9VarC = cb9Var2.c();
                if (da9VarC != null && (yccVarA2 = da9VarC.a()) != null) {
                    yccVarA2.d(addonPaywall.getResultKey(), Boolean.TRUE);
                }
                cb9Var2.g();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ka9.e((cb9) obj2, new PaywallRoute.UpgradeWaring(((AppRoute.Paywall) obj).getForSpread()), null, 6);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                String str = (String) obj2;
                x1f x1fVar3 = x1f.a;
                int i4 = 18;
                x1f.k(new r05("popup_view"), new kz8(i4, str, (p5a) obj), 2);
                if (pa7.t(str, "onboarding_finish")) {
                    bt5 bt5Var = new bt5("limited-monthly", i4);
                    ca2.a.getClass();
                    if (ca2.c) {
                        x1f.k(new r05("paywall_view"), bt5Var, 2);
                    }
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                jx4 jx4Var = (jx4) obj2;
                a26 a26Var = (a26) obj;
                a26Var.getClass();
                ynb.V(hwf.a(jx4Var), null, null, new ix4(jx4Var, a26Var, null), 3);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return db6.A0((List) obj2, (List) obj);
            case 14:
                ((sz9) ((s69) obj2)).k(-1);
                ((e89) obj).setValue(Boolean.TRUE);
                return wefVar;
            case 15:
                DrawnCardsConfirmRoute drawnCardsConfirmRoute = (DrawnCardsConfirmRoute) obj;
                ka9.e((ka9) obj2, new QuestionInputRoute(drawnCardsConfirmRoute.getCards(), drawnCardsConfirmRoute.getMeanings()), null, 6);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                SpreadPreviewRoute spreadPreviewRoute = (SpreadPreviewRoute) obj;
                ka9.e((ka9) obj2, new DrawnCardsConfirmRoute(spreadPreviewRoute.getCards(), spreadPreviewRoute.getMeanings()), null, 6);
                return wefVar;
            case 17:
                kn2.z((Context) obj2, ((vma) obj).b);
                return wefVar;
            case 18:
                fla flaVar = (fla) obj2;
                String str2 = ((uma) obj).a;
                str2.getClass();
                a62 a62VarA = hwf.a(flaVar);
                js3 js3Var = ga4.a;
                ynb.V(a62VarA, hr3.c, null, new uka(flaVar, str2, null), 2);
                return wefVar;
            case 19:
                x1f x1fVar4 = x1f.a;
                x1f.k(p05Var, new xna((az1) obj, 1), 2);
                ((l26) obj2).z(null, null);
                return wefVar;
            case 20:
                ((af2) obj2).d = (l26) obj;
                return wefVar;
            case 21:
                return bzd.p((Context) obj2, ((dqa) obj).a.concat(".preferences_pb"));
            case 22:
                ka9.e((cb9) obj2, (FourSeasonsEntry) obj, null, 6);
                return wefVar;
            case 23:
                ((cb9) obj2).g();
                jr2.a(((q7b) obj).b);
                return wefVar;
            case 24:
                WebView webView = (WebView) obj2;
                x16 x16Var = (x16) obj;
                if (webView.canGoBack()) {
                    webView.goBack();
                } else if (x16Var != null) {
                    x16Var.invoke();
                }
                return wefVar;
            case 25:
                fcb fcbVar = ((edb) obj2).b;
                Context context = (Context) obj;
                context.getClass();
                if (!kn2.T(context)) {
                    jcc.k(0, Integer.valueOf(R.string.rating_not_store_found));
                }
                ynb.V(fcbVar.b, null, null, new dcb(fcbVar, null), 3);
                fcbVar.c.n(null, o0c.c);
                return wefVar;
            case 26:
                ((a26) obj2).d((RecommendQuestion) obj);
                return wefVar;
            case 27:
                x79 x79Var = (x79) obj2;
                rg2 rg2Var = (rg2) obj;
                Object[] objArr = x79Var.b;
                long[] jArr = x79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    rg2Var.A(objArr[(i5 << 3) + i7]);
                                }
                                j >>= 8;
                            }
                            if (i6 == 8) {
                                if (i5 != length) {
                                    i5++;
                                }
                            }
                        } else if (i5 != length) {
                            i5++;
                        }
                    }
                }
                return wefVar;
            case 28:
                return eec.p((String) obj2, zia.d, new nyc[0], new jic((kic) obj, i3));
            default:
                ((a26) obj2).d(s72.j1(((jkc) obj).f));
                return wefVar;
        }
    }

    public /* synthetic */ ek9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
