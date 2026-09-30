package io.sentry;

import com.adjust.sdk.Constants;
import defpackage.kw;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final kw i = new kw(11);
    public final ConcurrentHashMap a;
    public final io.sentry.util.a b;
    public Double c;
    public Double d;
    public final String e;
    public boolean f;
    public final boolean g;
    public final z0 h;

    public c(ConcurrentHashMap concurrentHashMap, Double d, Double d2, String str, boolean z, z0 z0Var) {
        this.b = new io.sentry.util.a();
        this.a = concurrentHashMap;
        this.c = d;
        this.d = d2;
        this.h = z0Var;
        this.e = str;
        this.f = true;
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    public static c a(z0 z0Var, String str, boolean z) {
        Double d;
        Double dValueOf;
        String strC;
        Double dValueOf2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        if (str != null) {
            try {
                boolean z3 = false;
                dValueOf2 = null;
                dValueOf = null;
                for (String str2 : str.split(",", -1)) {
                    try {
                        if (str2.trim().startsWith("sentry-")) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(i2, iIndexOf).trim();
                                String strDecode = URLDecoder.decode(strTrim, Constants.ENCODING);
                                String strDecode2 = URLDecoder.decode(str2.substring(iIndexOf + 1).trim(), Constants.ENCODING);
                                try {
                                    if ("sentry-sample_rate".equals(strDecode)) {
                                        if (strDecode2 != null) {
                                            try {
                                                double d2 = Double.parseDouble(strDecode2);
                                                if (io.sentry.util.b.m(Double.valueOf(d2), false)) {
                                                    dValueOf2 = Double.valueOf(d2);
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        i2 = 0;
                                    } else if (!"sentry-sample_rand".equals(strDecode)) {
                                        i2 = 0;
                                        concurrentHashMap.put(strDecode, strDecode2);
                                    } else if (strDecode2 != null) {
                                        try {
                                            double d3 = Double.parseDouble(strDecode2);
                                            i2 = 0;
                                            i2 = 0;
                                            i2 = 0;
                                            try {
                                                dValueOf = io.sentry.util.b.m(Double.valueOf(d3), false) ? Double.valueOf(d3) : null;
                                            } catch (NumberFormatException unused2) {
                                            }
                                        } catch (NumberFormatException unused3) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
                                        z3 = true;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    i2 = 0;
                                    z0Var.c(q5.ERROR, th, "Unable to decode baggage key value pair %s", str2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else if (z) {
                            arrayList.add(str2.trim());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = z3;
                        z0Var.c(q5.ERROR, th, "Unable to decode baggage header %s", str);
                        d = dValueOf2;
                        if (arrayList.isEmpty()) {
                            strC = null;
                        } else {
                            strC = io.sentry.util.p.c(arrayList);
                        }
                        return new c(concurrentHashMap, d, dValueOf, strC, z2, z0Var);
                    }
                }
                z2 = z3;
            } catch (Throwable th4) {
                th = th4;
                dValueOf2 = null;
                dValueOf = null;
            }
            d = dValueOf2;
        } else {
            d = null;
            dValueOf = null;
        }
        if (arrayList.isEmpty()) {
            strC = null;
        } else {
            strC = io.sentry.util.p.c(arrayList);
        }
        return new c(concurrentHashMap, d, dValueOf, strC, z2, z0Var);
    }

    public static String c(Double d) {
        if (io.sentry.util.b.m(d, false)) {
            return ((DecimalFormat) i.get()).format(d);
        }
        return null;
    }

    public final String b(String str) {
        return (String) this.a.get(str);
    }

    public final void d(String str, String str2) {
        if (this.f) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void e(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, q6 q6Var, w3 w3Var, String str, io.sentry.protocol.h0 h0Var) {
        d("sentry-trace_id", wVar.a());
        d("sentry-public_key", q6Var.retrieveParsedDsn().b);
        d("sentry-release", q6Var.getRelease());
        d("sentry-environment", q6Var.getEnvironment());
        if (h0Var == null || io.sentry.protocol.h0.URL.equals(h0Var)) {
            str = null;
        }
        d("sentry-transaction", str);
        if (wVar2 != null && !io.sentry.protocol.w.b.equals(wVar2)) {
            d("sentry-replay_id", wVar2.a());
        }
        d("sentry-org_id", q6Var.getEffectiveOrgId());
        Double d = w3Var == null ? null : (Double) w3Var.b;
        if (this.f) {
            this.c = d;
        }
        Boolean bool = w3Var == null ? null : (Boolean) w3Var.a;
        d("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = w3Var != null ? (Double) w3Var.c : null;
        if (this.f) {
            this.d = d2;
        }
    }

    public final k7 f() {
        String strB = b("sentry-trace_id");
        String strB2 = b("sentry-replay_id");
        String strB3 = b("sentry-public_key");
        if (strB == null || strB3 == null) {
            return null;
        }
        k7 k7Var = new k7(new io.sentry.protocol.w(strB), strB3, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-transaction"), c(this.c), b("sentry-sampled"), strB2 != null ? new io.sentry.protocol.w(strB2) : null, c(this.d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            aVar.close();
            k7Var.y = concurrentHashMap;
            return k7Var;
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public c(z0 z0Var) {
        this(new ConcurrentHashMap(), null, null, null, false, z0Var);
    }
}
