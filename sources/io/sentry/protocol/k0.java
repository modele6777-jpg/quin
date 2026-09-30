package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements k2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public Double e;
    public Double f;
    public Double g;
    public Double v;
    public String w;
    public Double x;
    public List y;
    public HashMap z;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("rendering_system");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("type");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("identifier");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("tag");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("width");
            cVar.y(this.e);
        }
        if (this.f != null) {
            cVar.q("height");
            cVar.y(this.f);
        }
        if (this.g != null) {
            cVar.q("x");
            cVar.y(this.g);
        }
        if (this.v != null) {
            cVar.q("y");
            cVar.y(this.v);
        }
        if (this.w != null) {
            cVar.q("visibility");
            cVar.z(this.w);
        }
        if (this.x != null) {
            cVar.q("alpha");
            cVar.y(this.x);
        }
        List list = this.y;
        if (list != null && !list.isEmpty()) {
            cVar.q("children");
            cVar.w(z0Var, this.y);
        }
        HashMap map = this.z;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.z, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
