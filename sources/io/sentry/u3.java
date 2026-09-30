package io.sentry;

import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements k2 {
    public final ArrayList E0;
    public String F0;
    public String G0;
    public String H0;
    public String I0;
    public String J0;
    public String K0;
    public String L0;
    public String M0;
    public String N0;
    public Date O0;
    public final HashMap P0;
    public ConcurrentHashMap R0;
    public String X;
    public String Y;
    public String Z;
    public final File a;
    public final Callable b;
    public int c;
    public String e;
    public String f;
    public String g;
    public String v;
    public String w;
    public boolean x;
    public String y;
    public List z = new ArrayList();
    public String Q0 = null;
    public String d = Locale.getDefault().toString();

    public u3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, HashMap map) {
        this.a = file;
        this.O0 = date;
        this.y = str5;
        this.b = callable;
        this.c = i;
        this.e = str6 == null ? "" : str6;
        this.f = str7 == null ? "" : str7;
        this.w = str8 != null ? str8 : "";
        this.x = bool != null ? bool.booleanValue() : false;
        this.X = str9 != null ? str9 : "0";
        this.g = "";
        this.v = "android";
        this.Y = "android";
        this.Z = str10 != null ? str10 : "";
        this.E0 = arrayList;
        this.F0 = str.isEmpty() ? "unknown" : str;
        this.G0 = str4;
        this.H0 = "";
        this.I0 = str11 != null ? str11 : "";
        this.J0 = str2;
        this.K0 = str3;
        this.L0 = io.sentry.config.a.j();
        this.M0 = str12 != null ? str12 : AdjustConfig.ENVIRONMENT_PRODUCTION;
        this.N0 = str13;
        if (!str13.equals(Constants.NORMAL) && !this.N0.equals("timeout") && !this.N0.equals("backgrounded")) {
            this.N0 = Constants.NORMAL;
        }
        this.P0 = map;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("android_api_level");
        cVar.w(z0Var, Integer.valueOf(this.c));
        cVar.q("device_locale");
        cVar.w(z0Var, this.d);
        cVar.q("device_manufacturer");
        cVar.z(this.e);
        cVar.q("device_model");
        cVar.z(this.f);
        cVar.q("device_os_build_number");
        cVar.z(this.g);
        cVar.q("device_os_name");
        cVar.z(this.v);
        cVar.q("device_os_version");
        cVar.z(this.w);
        cVar.q("device_is_emulator");
        cVar.A(this.x);
        cVar.q("architecture");
        cVar.w(z0Var, this.y);
        cVar.q("device_cpu_frequencies");
        cVar.w(z0Var, this.z);
        cVar.q("device_physical_memory_bytes");
        cVar.z(this.X);
        cVar.q("platform");
        cVar.z(this.Y);
        cVar.q("build_id");
        cVar.z(this.Z);
        cVar.q("transaction_name");
        cVar.z(this.F0);
        cVar.q("duration_ns");
        cVar.z(this.G0);
        cVar.q("version_name");
        cVar.z(this.I0);
        cVar.q("version_code");
        cVar.z(this.H0);
        ArrayList arrayList = this.E0;
        if (!arrayList.isEmpty()) {
            cVar.q("transactions");
            cVar.w(z0Var, arrayList);
        }
        cVar.q("transaction_id");
        cVar.z(this.J0);
        cVar.q("trace_id");
        cVar.z(this.K0);
        cVar.q("profile_id");
        cVar.z(this.L0);
        cVar.q("environment");
        cVar.z(this.M0);
        cVar.q("truncation_reason");
        cVar.z(this.N0);
        if (this.Q0 != null) {
            cVar.q("sampled_profile");
            cVar.z(this.Q0);
        }
        String str = ((io.sentry.vendor.gson.stream.c) cVar.b).d;
        cVar.t("");
        cVar.q("measurements");
        cVar.w(z0Var, this.P0);
        cVar.t(str);
        cVar.q("timestamp");
        cVar.w(z0Var, this.O0);
        ConcurrentHashMap concurrentHashMap = this.R0;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                e.b(this.R0, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
    }
}
