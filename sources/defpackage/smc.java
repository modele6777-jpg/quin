package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.seasonal.SeasonalFollowUpRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.seasonal.SeasonalSummaryRoute;
import ai.askquin.ui.web.WebViewActivity;
import android.content.Context;
import android.content.Intent;
import android.util.Patterns;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class smc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ smc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:37:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0297  */
    @Override // defpackage.x16
    public final Object invoke() {
        int i;
        WebView webView;
        String url;
        String str;
        int i2 = this.a;
        int i3 = 3;
        int i4 = 1;
        p05 p05Var = p05.a;
        int i5 = 2;
        wef wefVar = wef.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                ((orc) obj3).i(((SeasonalReadingRoute) obj2).getYear(), (SolarTerm) obj);
                return wefVar;
            case 1:
                ((orc) obj3).i(((SeasonalSummaryRoute) obj2).getYear(), (SolarTerm) obj);
                return wefVar;
            case 2:
                ((orc) obj3).i(((SeasonalFollowUpRoute) obj2).getYear(), (SolarTerm) obj);
                return wefVar;
            case 3:
                Context context = (Context) obj3;
                t7 t7Var = (t7) obj2;
                l8 l8Var = new l8((dc9) obj, 16);
                context.getClass();
                t7Var.getClass();
                x1f x1fVar = x1f.a;
                x1f.g(p05Var, m1f.a, new e2d(8));
                y41.N(t7Var, context, new ckb(20, l8Var), 2);
                return wefVar;
            case 4:
                TarotSkinIdentify tarotSkinIdentifyE = r8c.e((mfc) ((h0e) obj2).getValue());
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new ij3((TarotSkinIdentify) obj, tarotSkinIdentifyE, i4), 2);
                ((a26) obj3).d(tarotSkinIdentifyE);
                return wefVar;
            case 5:
                fme fmeVar = (fme) obj2;
                List listM1 = s72.m1((ArrayList) obj3);
                Collections.shuffle(listM1);
                ((e89) obj).setValue(listM1);
                fmeVar.getClass();
                fmeVar.f(new eme(fmeVar, null));
                return wefVar;
            case 6:
                r0 r0Var = (r0) obj3;
                a26 a26Var = (a26) obj2;
                rcf rcfVar = (rcf) obj;
                if (r0Var != null) {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.i(r0Var.I0, "extra_info");
                }
                a26Var.d(rcfVar.o());
                return wefVar;
            case 7:
                c0d c0dVar = (c0d) obj3;
                ag1 ag1Var = (ag1) obj2;
                fe6 fe6Var = (fe6) obj;
                zzc zzcVar = ((yzc) c0dVar.e.getValue()).c() ? (zzc) c0dVar.f.getValue() : null;
                if (zzcVar != null) {
                    int i6 = zzcVar.h;
                    if (i6 == 1) {
                        i = 1;
                    } else if (i6 == 0) {
                        i = 0;
                    } else {
                        if (i6 == 0 || i6 == 1) {
                            b1.d("CXCP", "Custom operating mode " + i6 + " conflicts with standard modes");
                            qc0.j("kotlin.Unit");
                            return null;
                        }
                        i = i6;
                    }
                } else {
                    i = 0;
                }
                return ag1Var.a(i, zzcVar, false, fe6Var, null, (Map) c0dVar.c.getValue(), (Map) c0dVar.d.getValue());
            case 8:
                a26 a26Var2 = (a26) obj3;
                qmf qmfVar = (qmf) obj2;
                String str2 = (String) obj;
                if (a26Var2 != null) {
                    a26Var2.d(feg.K(qmfVar.g()));
                }
                if (!v4e.Q(str2) && !((Boolean) qmfVar.w.getValue()).booleanValue()) {
                    int i7 = elf.a[qmfVar.g().ordinal()];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            if (new rob("^1(3\\d|4[5-9]|5[0-35-9]|6[2567]|7[0-8]|8\\d|9[0-35-9])\\d{8}$").g(str2)) {
                                qmfVar.k(true);
                                a62 a62VarA = hwf.a(qmfVar);
                                js3 js3Var = ga4.a;
                                ynb.V(a62VarA, hr3.c, null, new klf(qmfVar, str2, null), 2).E(new ykf(qmfVar, i5));
                            } else {
                                jcc.k(1, Integer.valueOf(R.string.auth_login_invalid_phone_number));
                            }
                        }
                    } else if (v4e.Q(str2) || !Patterns.EMAIL_ADDRESS.matcher(str2).matches()) {
                        jcc.k(1, Integer.valueOf(R.string.auth_login_invalid_email));
                    } else {
                        qmfVar.k(true);
                        a62 a62VarA2 = hwf.a(qmfVar);
                        js3 js3Var2 = ga4.a;
                        ynb.V(a62VarA2, hr3.c, null, new jlf(qmfVar, str2, null), 2).E(new ykf(qmfVar, i3));
                    }
                }
                return wefVar;
            case 9:
                k1 k1Var = (k1) obj3;
                k1Var.removeOnAttachStateChangeListener((hs) obj2);
                od4.u(k1Var).a.remove((pvf) obj);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                xzf xzfVar = (xzf) obj3;
                h0e h0eVar = (h0e) obj2;
                a26 a26Var3 = (a26) obj;
                x1f x1fVar3 = x1f.a;
                int i8 = 15;
                x1f.k(p05Var, new wh1(i8, h0eVar), 2);
                bt5 bt5Var = new bt5(s72.D0((Set) h0eVar.getValue(), ",", null, null, new ksf(i8), 30), 13);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f.k(new r05("onboarding_purpose_select"), bt5Var, 2);
                }
                fhf fhfVar = new fhf(i3, a26Var3, xzfVar);
                Iterable iterable = (Iterable) xzfVar.d.getValue();
                ArrayList arrayList = new ArrayList(t72.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rzf) it.next()).getId());
                }
                ynb.V(hwf.a(xzfVar), null, null, new wzf(xzfVar, arrayList, fhfVar, null), 3);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                WebViewActivity webViewActivity = (WebViewActivity) obj3;
                e89 e89Var = (e89) obj2;
                e89 e89Var2 = (e89) obj;
                int i9 = WebViewActivity.T0;
                if (((x0g) webViewActivity.M0.getValue()) == x0g.a) {
                    ca2.a.getClass();
                    if (ca2.c) {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        webView = webViewActivity.N0;
                        if (webView != null || (url = webView.getUrl()) == null) {
                            url = (String) webViewActivity.K0.getValue();
                        }
                        intent.putExtra("android.intent.extra.TEXT", url);
                        intent.setType("text/plain");
                        str = (String) e89Var2.getValue();
                        if (str == null) {
                            str = "";
                        }
                        webViewActivity.startActivity(Intent.createChooser(intent, str));
                    } else {
                        x1f x1fVar4 = x1f.a;
                        x1f.k(p05Var, new ksf(17), 2);
                        e89Var.setValue(Boolean.TRUE);
                    }
                } else {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.SEND");
                    webView = webViewActivity.N0;
                    if (webView != null) {
                        url = (String) webViewActivity.K0.getValue();
                    } else {
                        url = (String) webViewActivity.K0.getValue();
                    }
                    intent2.putExtra("android.intent.extra.TEXT", url);
                    intent2.setType("text/plain");
                    str = (String) e89Var2.getValue();
                    if (str == null) {
                        str = "";
                    }
                    webViewActivity.startActivity(Intent.createChooser(intent2, str));
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ksf ksfVar = new ksf(23);
                x1f x1fVar5 = x1f.a;
                x1f.k(p05Var, new b92("how_to_add", (String) obj3, 1, (String) obj2, ksfVar, 5), 2);
                ((x16) obj).invoke();
                return wefVar;
            default:
                gbg gbgVar = (gbg) obj3;
                UUID uuid = (UUID) obj2;
                bb3 bb3Var = (bb3) obj;
                gbgVar.getClass();
                String string = uuid.toString();
                ff8 ff8VarH = ff8.h();
                String str3 = gbg.c;
                ff8VarH.e(str3, "Updating progress for " + uuid + " (" + bb3Var + ")");
                WorkDatabase workDatabase = gbgVar.a;
                workDatabase.b();
                try {
                    lbg lbgVarD = workDatabase.x().d(string);
                    if (lbgVarD == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (lbgVarD.b == vag.b) {
                        ebg ebgVar = new ebg(string, bb3Var);
                        fbg fbgVarW = workDatabase.w();
                        fbgVarW.getClass();
                        urg.I(fbgVarW.a, false, true, new p0g(6, fbgVarW, ebgVar));
                    } else {
                        ff8.h().o(str3, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.q();
                    workDatabase.m();
                    return null;
                } catch (Throwable th) {
                    try {
                        ff8.h().g(str3, "Error updating Worker progress", th);
                        throw th;
                    } catch (Throwable th2) {
                        workDatabase.m();
                        throw th2;
                    }
                }
        }
    }
}
