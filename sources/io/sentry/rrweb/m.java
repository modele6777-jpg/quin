package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends b implements k2 {
    public HashMap E0;
    public ConcurrentHashMap F0;
    public ConcurrentHashMap G0;
    public int X;
    public int Y;
    public int Z;
    public String c;
    public int d;
    public long e;
    public long f;
    public String g;
    public String v;
    public int w;
    public int x;
    public int y;
    public String z;

    public m() {
        super(c.Custom);
        this.g = "h264";
        this.v = "mp4";
        this.z = "constant";
        this.c = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.d == mVar.d && this.e == mVar.e && this.f == mVar.f && this.w == mVar.w && this.x == mVar.x && this.y == mVar.y && this.X == mVar.X && this.Y == mVar.Y && this.Z == mVar.Z && io.sentry.util.b.i(this.c, mVar.c) && io.sentry.util.b.i(this.g, mVar.g) && io.sentry.util.b.i(this.v, mVar.v) && io.sentry.util.b.i(this.z, mVar.z);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), this.g, this.v, Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), this.z, Integer.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z)});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("type");
        cVar.w(z0Var, this.a);
        cVar.q("timestamp");
        cVar.v(this.b);
        cVar.q("data");
        cVar.j();
        cVar.q("tag");
        cVar.z(this.c);
        cVar.q("payload");
        cVar.j();
        cVar.q("segmentId");
        cVar.v(this.d);
        cVar.q("size");
        cVar.v(this.e);
        cVar.q("duration");
        cVar.v(this.f);
        cVar.q("encoding");
        cVar.z(this.g);
        cVar.q("container");
        cVar.z(this.v);
        cVar.q("height");
        cVar.v(this.w);
        cVar.q("width");
        cVar.v(this.x);
        cVar.q("frameCount");
        cVar.v(this.y);
        cVar.q("frameRate");
        cVar.v(this.X);
        cVar.q("frameRateType");
        cVar.z(this.z);
        cVar.q("left");
        cVar.v(this.Y);
        cVar.q("top");
        cVar.v(this.Z);
        ConcurrentHashMap concurrentHashMap = this.F0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.F0, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.G0;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.G0, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
        HashMap map = this.E0;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.E0, str3, cVar, str3, z0Var);
            }
        }
        cVar.m();
    }
}
