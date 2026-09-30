package io.sentry.protocol;

import com.adjust.sdk.Constants;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements k2 {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public AbstractMap e;
    public ConcurrentHashMap f;
    public Boolean g;
    public Integer v;
    public Integer w;
    public Boolean x;
    public HashMap y;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("type");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("description");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("help_link");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("handled");
            cVar.x(this.d);
        }
        if (this.e != null) {
            cVar.q(Constants.REFERRER_API_META);
            cVar.w(z0Var, this.e);
        }
        if (this.f != null) {
            cVar.q("data");
            cVar.w(z0Var, this.f);
        }
        if (this.g != null) {
            cVar.q("synthetic");
            cVar.x(this.g);
        }
        if (this.v != null) {
            cVar.q("exception_id");
            cVar.w(z0Var, this.v);
        }
        if (this.w != null) {
            cVar.q("parent_id");
            cVar.w(z0Var, this.w);
        }
        if (this.x != null) {
            cVar.q("is_exception_group");
            cVar.x(this.x);
        }
        HashMap map = this.y;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
