package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m6h implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public m6h(c8h c8hVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        Objects.requireNonNull(c8hVar);
        this.f = c8hVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0165 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0180 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:19:0x006c, B:50:0x00fc, B:52:0x0107, B:55:0x0114, B:57:0x011a, B:59:0x0134, B:62:0x0141, B:64:0x0147, B:67:0x015e, B:69:0x016d, B:68:0x0165, B:70:0x0180, B:72:0x0186, B:74:0x018c, B:76:0x0192, B:78:0x019a, B:80:0x01a2, B:82:0x01aa, B:84:0x01b0, B:85:0x01c2, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00ad, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:44:0x00df, B:46:0x00ed), top: B:95:0x006c }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleC1;
        String str;
        tz0 tz0Var;
        int i = this.a;
        boolean z = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                lah lahVarJ = ((AppMeasurementDynamiteService) obj4).d.j();
                lahVarJ.A0();
                lahVarJ.B0();
                lahVarJ.O0(new d9h(lahVarJ, (String) obj2, (String) obj, lahVarJ.Q0(false), this.d, (tug) obj3));
                break;
            case 1:
                lah lahVarJ2 = ((w3h) ((c8h) obj4).b).j();
                lahVarJ2.A0();
                lahVarJ2.B0();
                lahVarJ2.O0(new d9h(lahVarJ2, (AtomicReference) obj3, (String) obj2, (String) obj, lahVarJ2.Q0(false), this.d));
                break;
            case 2:
                c8h c8hVar = (c8h) ((ya5) obj4).b;
                w3h w3hVar = (w3h) c8hVar.b;
                c8hVar.A0();
                fnb fnbVar = c8hVar.G0;
                String str2 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    qch qchVar = w3hVar.w;
                    w0h w0hVar = w3hVar.f;
                    w3h.f(qchVar);
                    String str3 = "utm_medium";
                    if (TextUtils.isEmpty(str2)) {
                        bundleC1 = null;
                    } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                        bundleC1 = qchVar.C1(Uri.parse("https://google.com/search?".concat(str2)));
                        if (bundleC1 != null) {
                            bundleC1.putString("_cis", Constants.REFERRER);
                        }
                    } else {
                        w0h w0hVar2 = ((w3h) qchVar.b).f;
                        w3h.h(w0hVar2);
                        w0hVar2.Y.a("Activity created with data 'referrer' without required params");
                        bundleC1 = null;
                    }
                    String str4 = (String) obj2;
                    if (z) {
                        str = "Activity created with data 'referrer' without required params";
                        qch qchVar2 = w3hVar.w;
                        w3h.f(qchVar2);
                        Bundle bundleC2 = qchVar2.C1(uri);
                        if (bundleC2 != null) {
                            bundleC2.putString("_cis", "intent");
                            if (!bundleC2.containsKey("gclid") && bundleC1 != null && bundleC1.containsKey("gclid")) {
                                bundleC2.putString("_cer", "gclid=" + bundleC1.getString("gclid"));
                            }
                            c8hVar.H0(str4, "_cmp", bundleC2);
                            fnbVar.d(str4, bundleC2);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            w3h.h(w0hVar);
                            tz0Var = w0hVar.Y;
                            tz0Var.b(str2, "Activity created with referrer");
                            if (!w3hVar.d.L0(null, bzg.G0)) {
                                if (bundleC1 != null) {
                                    c8hVar.H0(str4, "_cmp", bundleC1);
                                    fnbVar.d(str4, bundleC1);
                                } else {
                                    w3h.h(w0hVar);
                                    tz0Var.b(str2, "Referrer does not contain valid parameters");
                                }
                                w3hVar.y.getClass();
                                c8hVar.K0("auto", "_ldl", null, true, System.currentTimeMillis());
                            } else if (str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains(str3) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                w3h.h(w0hVar);
                                tz0Var.a(str);
                            } else if (!TextUtils.isEmpty(str2)) {
                                w3hVar.y.getClass();
                                c8hVar.K0("auto", "_ldl", str2, true, System.currentTimeMillis());
                            }
                        }
                    } else {
                        str = "Activity created with data 'referrer' without required params";
                    }
                    str3 = "utm_medium";
                    if (!TextUtils.isEmpty(str2)) {
                        w3h.h(w0hVar);
                        tz0Var = w0hVar.Y;
                        tz0Var.b(str2, "Activity created with referrer");
                        if (!w3hVar.d.L0(null, bzg.G0)) {
                            if (str2.contains("gclid")) {
                            }
                            w3h.h(w0hVar);
                            tz0Var.a(str);
                        } else {
                            if (bundleC1 != null) {
                                c8hVar.H0(str4, "_cmp", bundleC1);
                                fnbVar.d(str4, bundleC1);
                            } else {
                                w3h.h(w0hVar);
                                tz0Var.b(str2, "Referrer does not contain valid parameters");
                            }
                            w3hVar.y.getClass();
                            c8hVar.K0("auto", "_ldl", null, true, System.currentTimeMillis());
                        }
                    }
                } catch (RuntimeException e) {
                    w0h w0hVar3 = ((w3h) c8hVar.b).f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                lah lahVar = (lah) obj4;
                hzg hzgVar = lahVar.e;
                w3h w3hVar2 = (w3h) lahVar.b;
                if (hzgVar == null) {
                    w0h w0hVar4 = w3hVar2.f;
                    w3h.h(w0hVar4);
                    w0hVar4.g.a("Failed to send default event parameters to service");
                } else {
                    ndh ndhVar = (ndh) obj3;
                    if (w3hVar2.d.L0(null, bzg.W0)) {
                        lahVar.S0(hzgVar, z ? null : (esg) obj2, ndhVar);
                    } else {
                        try {
                            hzgVar.B((Bundle) obj, ndhVar);
                            lahVar.N0();
                        } catch (RemoteException e2) {
                            w0h w0hVar5 = w3hVar2.f;
                            w3h.h(w0hVar5);
                            w0hVar5.g.b(e2, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public m6h(AppMeasurementDynamiteService appMeasurementDynamiteService, tug tugVar, String str, String str2, boolean z) {
        this.e = tugVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.f = appMeasurementDynamiteService;
    }

    public m6h(ya5 ya5Var, boolean z, Uri uri, String str, String str2) {
        this.d = z;
        this.e = uri;
        this.b = str;
        this.c = str2;
        this.f = ya5Var;
    }

    public m6h(lah lahVar, ndh ndhVar, boolean z, esg esgVar, Bundle bundle) {
        this.e = ndhVar;
        this.d = z;
        this.b = esgVar;
        this.c = bundle;
        Objects.requireNonNull(lahVar);
        this.f = lahVar;
    }
}
