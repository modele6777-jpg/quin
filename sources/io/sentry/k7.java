package io.sentry;

import com.google.firebase.crashlytics.BuildConfig;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k7 implements k2 {
    public final io.sentry.protocol.w a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String v;
    public final String w;
    public final io.sentry.protocol.w x;
    public ConcurrentHashMap y;

    public k7(io.sentry.protocol.w wVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.w wVar2, String str8) {
        this.a = wVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.w = str7;
        this.x = wVar2;
        this.v = str8;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("trace_id");
        cVar.w(z0Var, this.a);
        cVar.q("public_key");
        cVar.z(this.b);
        String str = this.c;
        if (str != null) {
            cVar.q(BuildConfig.BUILD_TYPE);
            cVar.z(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            cVar.q("environment");
            cVar.z(str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            cVar.q("user_id");
            cVar.z(str3);
        }
        String str4 = this.f;
        if (str4 != null) {
            cVar.q("transaction");
            cVar.z(str4);
        }
        String str5 = this.g;
        if (str5 != null) {
            cVar.q("sample_rate");
            cVar.z(str5);
        }
        String str6 = this.v;
        if (str6 != null) {
            cVar.q("sample_rand");
            cVar.z(str6);
        }
        String str7 = this.w;
        if (str7 != null) {
            cVar.q("sampled");
            cVar.z(str7);
        }
        io.sentry.protocol.w wVar = this.x;
        if (wVar != null) {
            cVar.q("replay_id");
            cVar.w(z0Var, wVar);
        }
        ConcurrentHashMap concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                e.b(this.y, str8, cVar, str8, z0Var);
            }
        }
        cVar.m();
    }
}
