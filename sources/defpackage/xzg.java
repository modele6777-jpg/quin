package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xzg extends fzg {
    public String E0;
    public String F0;
    public long G0;
    public String H0;
    public String X;
    public final String Y;
    public int Z;
    public String d;
    public String e;
    public int f;
    public String g;
    public String v;
    public long w;
    public final long x;
    public final long y;
    public List z;

    public xzg(w3h w3hVar, long j, long j2, String str) {
        super(w3hVar);
        this.G0 = 0L;
        this.H0 = null;
        this.x = j;
        this.y = j2;
        this.Y = str;
    }

    @Override // defpackage.fzg
    public final boolean D0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0271 A[Catch: NameNotFoundException -> 0x0279, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x0279, blocks: (B:98:0x026b, B:100:0x0271), top: B:124:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0274 A[PHI: r5 r37
  0x0274: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x0279, B:99:0x026f] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x0279, B:99:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02be  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x0304  */
    /* JADX WARN: Code duplicated, block: B:126:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:78:0x020b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0232  */
    /* JADX WARN: Code duplicated, block: B:91:0x023f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0241  */
    /* JADX WARN: Code duplicated, block: B:95:0x025c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final ndh E0(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zA;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jA;
        long jMin;
        Boolean boolN0;
        boolean z4;
        boolean z5;
        String strY1;
        boolean z6;
        String str4;
        Boolean boolN1;
        boolean zBooleanValue;
        w3h w3hVar;
        String strG0;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoA;
        azg azgVar;
        int iX0;
        long jY0;
        A0();
        String strG1 = G0();
        String strH0 = H0();
        B0();
        String str5 = this.e;
        B0();
        long j4 = this.f;
        B0();
        oa7.A(this.g);
        String str6 = this.g;
        w3h w3hVar2 = (w3h) this.b;
        qqg qqgVar = w3hVar2.d;
        w0h w0hVar = w3hVar2.f;
        qqg qqgVar2 = w3hVar2.d;
        Context context = w3hVar2.a;
        qch qchVar = w3hVar2.w;
        c2h c2hVar = w3hVar2.e;
        qqgVar.G0();
        B0();
        A0();
        long j5 = this.w;
        if (j5 == 0) {
            w3h.f(qchVar);
            w3h w3hVar3 = (w3h) qchVar.b;
            String packageName = context.getPackageName();
            qchVar.A0();
            oa7.x(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestT0 = qch.T0();
            long jU0 = -1;
            if (messageDigestT0 == null) {
                w0h w0hVar2 = w3hVar3.f;
                w3h.h(w0hVar2);
                w0hVar2.g.a("Could not get MD5 instance");
                str2 = str5;
                j = j4;
            } else {
                if (packageManager != null) {
                    try {
                        if (qchVar.j1(context, packageName)) {
                            str2 = str5;
                            j = j4;
                            jU0 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j4;
                                try {
                                    Signature[] signatureArr = rcg.a(context).b(64, w3hVar3.a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        w0h w0hVar3 = w3hVar3.f;
                                        w3h.h(w0hVar3);
                                        w0hVar3.x.a("Could not get signatures");
                                    } else {
                                        jU0 = qch.U0(messageDigestT0.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    w0h w0hVar4 = w3hVar3.f;
                                    w3h.h(w0hVar4);
                                    w0hVar4.g.b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j4;
                                w0h w0hVar5 = w3hVar3.f;
                                w3h.h(w0hVar5);
                                w0hVar5.g.b(e, "Package name not found");
                                j2 = 0;
                                this.w = j2;
                                zA = w3hVar2.a();
                                w3h.f(c2hVar);
                                z2 = !c2hVar.H0;
                                A0();
                                if (w3hVar2.a()) {
                                    ((lqg) kqg.b.a.get()).getClass();
                                    if (qqgVar2.L0(null, bzg.H0)) {
                                        w3h.h(w0hVar);
                                        w0hVar.Z.a("Disabled IID for tests.");
                                        z3 = zA;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zA;
                                            } else {
                                                z3 = zA;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            w3h.h(w0hVar);
                                                            w0hVar.z.a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    w3h.h(w0hVar);
                                                    w0hVar.y.a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zA;
                                    str3 = null;
                                }
                                w3h.f(c2hVar);
                                jA = c2hVar.g.a();
                                long j6 = j2;
                                jMin = w3hVar2.S0;
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                B0();
                                int i3 = this.Z;
                                boolN0 = qqgVar2.N0("google_analytics_adid_collection_enabled");
                                if (boolN0 != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                w3h.f(c2hVar);
                                c2hVar.A0();
                                long j7 = jMin;
                                boolean z8 = c2hVar.E0().getBoolean("deferred_analytics_collection", z);
                                if (qqgVar2.Q0("google_analytics_default_allow_ad_personalization_signals", true) != k5h.GRANTED) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.z;
                                String strG = c2hVar.H0().g();
                                strY1 = this.X;
                                if (strY1 == null) {
                                    w3h.f(qchVar);
                                    strY1 = qchVar.y1();
                                    this.X = strY1;
                                }
                                String str7 = strY1;
                                if (c2hVar.H0().i(o5h.ANALYTICS_STORAGE)) {
                                    A0();
                                    if (this.G0 == 0) {
                                        z6 = z2;
                                    } else {
                                        w3hVar2.y.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.G0;
                                        z6 = z2;
                                        if (this.F0 != null) {
                                            F0();
                                        }
                                    }
                                    if (this.F0 == null) {
                                        F0();
                                    }
                                    str4 = this.F0;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolN1 = qqgVar2.N0("google_analytics_sgtm_upload_enabled");
                                if (boolN1 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolN1.booleanValue();
                                }
                                w3h.f(qchVar);
                                w3hVar = (w3h) qchVar.b;
                                String str8 = str4;
                                strG0 = G0();
                                boolean z9 = zBooleanValue;
                                if (w3hVar.a.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfoA = rcg.a(w3hVar.a).a(0, strG0);
                                            if (applicationInfoA != null) {
                                                i2 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            w0h w0hVar6 = w3hVar.f;
                                            w3h.h(w0hVar6);
                                            w0hVar6.X.b(strG0, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                w3h.f(c2hVar);
                                int i4 = c2hVar.H0().b;
                                w3h.f(c2hVar);
                                c2hVar.A0();
                                String str9 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).b;
                                upg.a();
                                azgVar = bzg.P0;
                                if (qqgVar2.L0(null, azgVar)) {
                                    w3h.f(qchVar);
                                    iX0 = qch.X0();
                                } else {
                                    iX0 = 0;
                                }
                                upg.a();
                                if (qqgVar2.L0(null, azgVar)) {
                                    w3h.f(qchVar);
                                    jY0 = qchVar.Y0();
                                } else {
                                    jY0 = 0;
                                }
                                String str10 = qqgVar2.d;
                                String strValueOf = String.valueOf(q5h.h(qqgVar2.Q0("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j8 = j3;
                                long j9 = w3hVar2.S0;
                                w3h.e(w3hVar2.J0);
                                return new ndh(strG1, strH0, str2, j, str6, 161000L, j6, str, z3, z6, str3, j7, i3, z7, z8, boolValueOf, this.x, list, strG, str7, str8, z9, j8, i4, str9, iX0, jY0, str10, strValueOf, j9, w3hVar2.J0.F0().b(), qqgVar2.L0(null, bzg.e1) ? w3hVar2.T0 : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j4;
                }
                j2 = 0;
                this.w = j2;
            }
            j2 = jU0;
            this.w = j2;
        } else {
            str2 = str5;
            j = j4;
            z = false;
            j2 = j5;
        }
        zA = w3hVar2.a();
        w3h.f(c2hVar);
        z2 = !c2hVar.H0;
        A0();
        if (w3hVar2.a()) {
            z3 = zA;
            str3 = null;
        } else {
            ((lqg) kqg.b.a.get()).getClass();
            if (qqgVar2.L0(null, bzg.H0)) {
                w3h.h(w0hVar);
                w0hVar.Z.a("Disabled IID for tests.");
                z3 = zA;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zA;
                } else {
                    z3 = zA;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        w3h.f(c2hVar);
        jA = c2hVar.g.a();
        long j10 = j2;
        jMin = w3hVar2.S0;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        B0();
        int i5 = this.Z;
        boolN0 = qqgVar2.N0("google_analytics_adid_collection_enabled");
        if (boolN0 != null || boolN0.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        w3h.f(c2hVar);
        c2hVar.A0();
        long j11 = jMin;
        boolean z10 = c2hVar.E0().getBoolean("deferred_analytics_collection", z);
        if (qqgVar2.Q0("google_analytics_default_allow_ad_personalization_signals", true) != k5h.GRANTED) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.z;
        String strG2 = c2hVar.H0().g();
        strY1 = this.X;
        if (strY1 == null) {
            w3h.f(qchVar);
            strY1 = qchVar.y1();
            this.X = strY1;
        }
        String str11 = strY1;
        if (c2hVar.H0().i(o5h.ANALYTICS_STORAGE)) {
            z6 = z2;
            str4 = null;
        } else {
            A0();
            if (this.G0 == 0) {
                z6 = z2;
            } else {
                w3hVar2.y.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.G0;
                z6 = z2;
                if (this.F0 != null && jCurrentTimeMillis2 > 86400000 && this.H0 == null) {
                    F0();
                }
            }
            if (this.F0 == null) {
                F0();
            }
            str4 = this.F0;
        }
        boolN1 = qqgVar2.N0("google_analytics_sgtm_upload_enabled");
        if (boolN1 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolN1.booleanValue();
        }
        w3h.f(qchVar);
        w3hVar = (w3h) qchVar.b;
        String str12 = str4;
        strG0 = G0();
        boolean z11 = zBooleanValue;
        if (w3hVar.a.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfoA = rcg.a(w3hVar.a).a(0, strG0);
            if (applicationInfoA != null) {
                i2 = applicationInfoA.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        w3h.f(c2hVar);
        int i6 = c2hVar.H0().b;
        w3h.f(c2hVar);
        c2hVar.A0();
        String str13 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).b;
        upg.a();
        azgVar = bzg.P0;
        if (qqgVar2.L0(null, azgVar)) {
            w3h.f(qchVar);
            iX0 = qch.X0();
        } else {
            iX0 = 0;
        }
        upg.a();
        if (qqgVar2.L0(null, azgVar)) {
            w3h.f(qchVar);
            jY0 = qchVar.Y0();
        } else {
            jY0 = 0;
        }
        String str14 = qqgVar2.d;
        String strValueOf2 = String.valueOf(q5h.h(qqgVar2.Q0("google_analytics_default_allow_ad_personalization_signals", true)));
        long j12 = j3;
        long j13 = w3hVar2.S0;
        w3h.e(w3hVar2.J0);
        return new ndh(strG1, strH0, str2, j, str6, 161000L, j10, str, z3, z6, str3, j11, i5, z7, z10, boolValueOf2, this.x, list2, strG2, str11, str12, z11, j12, i6, str13, iX0, jY0, str14, strValueOf2, j13, w3hVar2.J0.F0().b(), qqgVar2.L0(null, bzg.e1) ? w3hVar2.T0 : 0L);
    }

    public final void F0() {
        String str;
        A0();
        w3h w3hVar = (w3h) this.b;
        c2h c2hVar = w3hVar.e;
        w0h w0hVar = w3hVar.f;
        w3h.f(c2hVar);
        if (c2hVar.H0().i(o5h.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            qch qchVar = w3hVar.w;
            w3h.f(qchVar);
            qchVar.A1().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            w3h.h(w0hVar);
            w0hVar.Y.a("Analytics Storage consent is not granted");
            str = null;
        }
        w3h.h(w0hVar);
        w0hVar.Y.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.F0 = str;
        w3hVar.y.getClass();
        this.G0 = System.currentTimeMillis();
    }

    public final String G0() {
        B0();
        oa7.A(this.d);
        return this.d;
    }

    public final String H0() {
        A0();
        B0();
        oa7.A(this.E0);
        return this.E0;
    }
}
