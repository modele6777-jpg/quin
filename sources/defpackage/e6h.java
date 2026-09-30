package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e6h extends nrg {
    public final /* synthetic */ int e;
    public final /* synthetic */ c8h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6h(c8h c8hVar, i5h i5hVar, int i) {
        super(i5hVar);
        this.e = i;
        switch (i) {
            case 2:
                Objects.requireNonNull(c8hVar);
                this.f = c8hVar;
                super(i5hVar);
                break;
            default:
                Objects.requireNonNull(c8hVar);
                this.f = c8hVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x028c A[Catch: IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, TryCatch #5 {IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, blocks: (B:80:0x0244, B:82:0x028c, B:87:0x0297, B:89:0x029d, B:91:0x02a5, B:92:0x02ab, B:93:0x02af), top: B:116:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x029d A[Catch: IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, TryCatch #5 {IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, blocks: (B:80:0x0244, B:82:0x028c, B:87:0x0297, B:89:0x029d, B:91:0x02a5, B:92:0x02ab, B:93:0x02af), top: B:116:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a5 A[Catch: IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, TryCatch #5 {IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, blocks: (B:80:0x0244, B:82:0x028c, B:87:0x0297, B:89:0x029d, B:91:0x02a5, B:92:0x02ab, B:93:0x02af), top: B:116:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c9  */
    @Override // defpackage.nrg
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        lah lahVarJ;
        w3h w3hVar;
        hzg hzgVar;
        wqg wqgVarQ;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        w3h w3hVar2;
        URL url;
        String strConcat;
        int i2 = this.e;
        int i3 = 0;
        c8h c8hVar = this.f;
        switch (i2) {
            case 0:
                c8h c8hVar2 = ((w3h) c8hVar.b).X;
                w3h.g(c8hVar2);
                new Thread(new c6h(c8hVar2, i3)).start();
                break;
            case 1:
                c8hVar.Z0();
                break;
            case 2:
                c8hVar.G0();
                break;
            default:
                w3h w3hVar3 = (w3h) c8hVar.b;
                c2h c2hVar = w3hVar3.e;
                w0h w0hVar = w3hVar3.f;
                m3h m3hVar = w3hVar3.g;
                w3h.h(m3hVar);
                m3hVar.A0();
                m8h m8hVar = w3hVar3.Z;
                w3h.h(m8hVar);
                w3h w3hVar4 = (w3h) m8hVar.b;
                w3h.h(m8hVar);
                String strG0 = w3hVar3.l().G0();
                Boolean boolN0 = w3hVar3.d.N0("google_analytics_adid_collection_enabled");
                if (boolN0 == null || boolN0.booleanValue()) {
                    w3h.f(c2hVar);
                    w3h w3hVar5 = (w3h) c2hVar.b;
                    c2hVar.A0();
                    if (c2hVar.H0().i(o5h.AD_STORAGE)) {
                        w3hVar5.y.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = c2hVar.w;
                        if (str3 == null || jElapsedRealtime >= c2hVar.y) {
                            c2hVar.y = w3hVar5.d.I0(strG0, bzg.b) + jElapsedRealtime;
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(w3hVar5.a);
                                c2hVar.w = "";
                                String id = advertisingIdInfo.getId();
                                if (id != null) {
                                    c2hVar.w = id;
                                }
                                c2hVar.x = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e) {
                                w0h w0hVar2 = w3hVar5.f;
                                w3h.h(w0hVar2);
                                w0hVar2.Y.b(e, "Unable to get advertising id");
                                c2hVar.w = "";
                            }
                            pair = new Pair(c2hVar.w, Boolean.valueOf(c2hVar.x));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(c2hVar.x));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        w3h.h(m8hVar);
                        m8hVar.C0();
                        ConnectivityManager connectivityManager = (ConnectivityManager) w3hVar4.a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            lah lahVarJ2 = w3hVar3.j();
                            lahVarJ2.A0();
                            lahVarJ2.B0();
                            if (!lahVarJ2.H0()) {
                                c8h c8hVar3 = w3hVar3.X;
                                w3h.g(c8hVar3);
                                w3h w3hVar6 = (w3h) c8hVar3.b;
                                c8hVar3.A0();
                                lahVarJ = w3hVar6.j();
                                w3hVar = (w3h) lahVarJ.b;
                                lahVarJ.A0();
                                lahVarJ.B0();
                                hzgVar = lahVarJ.e;
                                if (hzgVar == null) {
                                    lahVarJ.G0();
                                    w0h w0hVar3 = w3hVar.f;
                                    w3h.h(w0hVar3);
                                    w0hVar3.Y.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        wqgVarQ = hzgVar.q(lahVarJ.Q0(false));
                                        lahVarJ.N0();
                                    } catch (RemoteException e2) {
                                        w0h w0hVar4 = w3hVar.f;
                                        w3h.h(w0hVar4);
                                        w0hVar4.g.b(e2, "Failed to get consents; remote exception");
                                        wqgVarQ = null;
                                    }
                                    if (wqgVarQ != null) {
                                        bundle = wqgVarQ.a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = w3hVar3.Q0;
                                        w3hVar3.Q0 = i + 1;
                                        i3 = i < 10 ? 1 : 0;
                                        w3h.h(w0hVar);
                                        tz0 tz0Var = w0hVar.Y;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        tz0Var.b(Integer.valueOf(w3hVar3.Q0), ks0.l(sb2, str2, " retryCount"));
                                    } else {
                                        q5h q5hVarB = q5h.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(q5hVarB.f());
                                        xrg xrgVarC = xrg.c(100, bundle);
                                        str = xrgVarC.d;
                                        sb.append("&dma=");
                                        Boolean bool2 = xrgVarC.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = q5h.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        w3h.h(w0hVar);
                                        w0hVar.Z.b(sb, "Consent query parameters to Bow");
                                        qch qchVar = w3hVar3.w;
                                        w3h.f(qchVar);
                                        ((w3h) w3hVar3.l().b).d.G0();
                                        String str4 = (String) pair.first;
                                        long jA = c2hVar.K0.a() - 1;
                                        string = sb.toString();
                                        w3hVar2 = (w3h) qchVar.b;
                                        try {
                                            oa7.x(str4);
                                            oa7.x(strG0);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qchVar.m1()) + "&rdid=" + str4 + "&bundleid=" + strG0 + "&retry=" + jA;
                                            if (strG0.equals(w3hVar2.d.E0("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            w0h w0hVar5 = w3hVar2.f;
                                            w3h.h(w0hVar5);
                                            w0hVar5.g.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            w0h w0hVar6 = w3hVar2.f;
                                            w3h.h(w0hVar6);
                                            w0hVar6.g.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            w3h.h(m8hVar);
                                            g5b g5bVar = new g5b(21, w3hVar3);
                                            m8hVar.C0();
                                            m3h m3hVar2 = w3hVar4.g;
                                            w3h.h(m3hVar2);
                                            m3hVar2.M0(new e1h(m8hVar, strG0, url, (byte[]) null, (HashMap) null, g5bVar));
                                        }
                                    }
                                }
                                wqgVarQ = null;
                                if (wqgVarQ != null) {
                                    bundle = wqgVarQ.a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = w3hVar3.Q0;
                                    w3hVar3.Q0 = i + 1;
                                    if (i < 10) {
                                    }
                                    w3h.h(w0hVar);
                                    tz0 tz0Var2 = w0hVar.Y;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    tz0Var2.b(Integer.valueOf(w3hVar3.Q0), ks0.l(sb3, str2, " retryCount"));
                                } else {
                                    q5h q5hVarB2 = q5h.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(q5hVarB2.f());
                                    xrg xrgVarC2 = xrg.c(100, bundle);
                                    str = xrgVarC2.d;
                                    sb.append("&dma=");
                                    Boolean bool3 = xrgVarC2.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = q5h.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i5);
                                    w3h.h(w0hVar);
                                    w0hVar.Z.b(sb, "Consent query parameters to Bow");
                                    qch qchVar2 = w3hVar3.w;
                                    w3h.f(qchVar2);
                                    ((w3h) w3hVar3.l().b).d.G0();
                                    String str5 = (String) pair.first;
                                    long jA2 = c2hVar.K0.a() - 1;
                                    string = sb.toString();
                                    w3hVar2 = (w3h) qchVar2.b;
                                    oa7.x(str5);
                                    oa7.x(strG0);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qchVar2.m1()) + "&rdid=" + str5 + "&bundleid=" + strG0 + "&retry=" + jA2;
                                    if (strG0.equals(w3hVar2.d.E0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        w3h.h(m8hVar);
                                        g5b g5bVar2 = new g5b(21, w3hVar3);
                                        m8hVar.C0();
                                        m3h m3hVar3 = w3hVar4.g;
                                        w3h.h(m3hVar3);
                                        m3hVar3.M0(new e1h(m8hVar, strG0, url, (byte[]) null, (HashMap) null, g5bVar2));
                                    }
                                }
                                break;
                            } else {
                                qch qchVar3 = ((w3h) lahVarJ2.b).w;
                                w3h.f(qchVar3);
                                if (qchVar3.m1() >= 234200) {
                                    c8h c8hVar4 = w3hVar3.X;
                                    w3h.g(c8hVar4);
                                    w3h w3hVar7 = (w3h) c8hVar4.b;
                                    c8hVar4.A0();
                                    lahVarJ = w3hVar7.j();
                                    w3hVar = (w3h) lahVarJ.b;
                                    lahVarJ.A0();
                                    lahVarJ.B0();
                                    hzgVar = lahVarJ.e;
                                    if (hzgVar == null) {
                                        lahVarJ.G0();
                                        w0h w0hVar7 = w3hVar.f;
                                        w3h.h(w0hVar7);
                                        w0hVar7.Y.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        wqgVarQ = hzgVar.q(lahVarJ.Q0(false));
                                        lahVarJ.N0();
                                        if (wqgVarQ != null) {
                                            bundle = wqgVarQ.a;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = w3hVar3.Q0;
                                            w3hVar3.Q0 = i + 1;
                                            if (i < 10) {
                                            }
                                            w3h.h(w0hVar);
                                            tz0 tz0Var3 = w0hVar.Y;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            tz0Var3.b(Integer.valueOf(w3hVar3.Q0), ks0.l(sb4, str2, " retryCount"));
                                        } else {
                                            q5h q5hVarB3 = q5h.b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(q5hVarB3.f());
                                            xrg xrgVarC3 = xrg.c(100, bundle);
                                            str = xrgVarC3.d;
                                            sb.append("&dma=");
                                            Boolean bool4 = xrgVarC3.c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = q5h.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i6 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i6);
                                            w3h.h(w0hVar);
                                            w0hVar.Z.b(sb, "Consent query parameters to Bow");
                                            qch qchVar4 = w3hVar3.w;
                                            w3h.f(qchVar4);
                                            ((w3h) w3hVar3.l().b).d.G0();
                                            String str6 = (String) pair.first;
                                            long jA3 = c2hVar.K0.a() - 1;
                                            string = sb.toString();
                                            w3hVar2 = (w3h) qchVar4.b;
                                            oa7.x(str6);
                                            oa7.x(strG0);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qchVar4.m1()) + "&rdid=" + str6 + "&bundleid=" + strG0 + "&retry=" + jA3;
                                            if (strG0.equals(w3hVar2.d.E0("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                w3h.h(m8hVar);
                                                g5b g5bVar3 = new g5b(21, w3hVar3);
                                                m8hVar.C0();
                                                m3h m3hVar4 = w3hVar4.g;
                                                w3h.h(m3hVar4);
                                                m3hVar4.M0(new e1h(m8hVar, strG0, url, (byte[]) null, (HashMap) null, g5bVar3));
                                            }
                                        }
                                    }
                                    wqgVarQ = null;
                                    if (wqgVarQ != null) {
                                        bundle = wqgVarQ.a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = w3hVar3.Q0;
                                        w3hVar3.Q0 = i + 1;
                                        if (i < 10) {
                                        }
                                        w3h.h(w0hVar);
                                        tz0 tz0Var4 = w0hVar.Y;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        tz0Var4.b(Integer.valueOf(w3hVar3.Q0), ks0.l(sb5, str2, " retryCount"));
                                    } else {
                                        q5h q5hVarB4 = q5h.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(q5hVarB4.f());
                                        xrg xrgVarC4 = xrg.c(100, bundle);
                                        str = xrgVarC4.d;
                                        sb.append("&dma=");
                                        Boolean bool5 = xrgVarC4.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = q5h.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i7 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i7);
                                        w3h.h(w0hVar);
                                        w0hVar.Z.b(sb, "Consent query parameters to Bow");
                                        qch qchVar5 = w3hVar3.w;
                                        w3h.f(qchVar5);
                                        ((w3h) w3hVar3.l().b).d.G0();
                                        String str7 = (String) pair.first;
                                        long jA4 = c2hVar.K0.a() - 1;
                                        string = sb.toString();
                                        w3hVar2 = (w3h) qchVar5.b;
                                        oa7.x(str7);
                                        oa7.x(strG0);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qchVar5.m1()) + "&rdid=" + str7 + "&bundleid=" + strG0 + "&retry=" + jA4;
                                        if (strG0.equals(w3hVar2.d.E0("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            w3h.h(m8hVar);
                                            g5b g5bVar4 = new g5b(21, w3hVar3);
                                            m8hVar.C0();
                                            m3h m3hVar5 = w3hVar4.g;
                                            w3h.h(m3hVar5);
                                            m3hVar5.M0(new e1h(m8hVar, strG0, url, (byte[]) null, (HashMap) null, g5bVar4));
                                        }
                                    }
                                } else {
                                    qch qchVar6 = w3hVar3.w;
                                    w3h.f(qchVar6);
                                    ((w3h) w3hVar3.l().b).d.G0();
                                    String str8 = (String) pair.first;
                                    long jA5 = c2hVar.K0.a() - 1;
                                    string = sb.toString();
                                    w3hVar2 = (w3h) qchVar6.b;
                                    oa7.x(str8);
                                    oa7.x(strG0);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qchVar6.m1()) + "&rdid=" + str8 + "&bundleid=" + strG0 + "&retry=" + jA5;
                                    if (strG0.equals(w3hVar2.d.E0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        w3h.h(m8hVar);
                                        g5b g5bVar5 = new g5b(21, w3hVar3);
                                        m8hVar.C0();
                                        m3h m3hVar6 = w3hVar4.g;
                                        w3h.h(m3hVar6);
                                        m3hVar6.M0(new e1h(m8hVar, strG0, url, (byte[]) null, (HashMap) null, g5bVar5));
                                    }
                                }
                            }
                        } else {
                            w3h.h(w0hVar);
                            w0hVar.x.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        w3h.h(w0hVar);
                        w0hVar.Z.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    w3h.h(w0hVar);
                    w0hVar.Z.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (i3 != 0) {
                    c8hVar.I0.b(2000L);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6h(c8h c8hVar, i5h i5hVar, int i, boolean z) {
        super(i5hVar);
        this.e = i;
        this.f = c8hVar;
    }
}
