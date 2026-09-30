package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wag {
    public final UUID a;
    public final vag b;
    public final HashSet c;
    public final bb3 d;
    public final bb3 e;
    public final int f;
    public final int g;
    public final jl2 h;
    public final long i;
    public final uag j;
    public final long k;
    public final int l;

    public wag(UUID uuid, vag vagVar, HashSet hashSet, bb3 bb3Var, bb3 bb3Var2, int i, int i2, jl2 jl2Var, long j, uag uagVar, long j2, int i3) {
        bb3Var.getClass();
        bb3Var2.getClass();
        this.a = uuid;
        this.b = vagVar;
        this.c = hashSet;
        this.d = bb3Var;
        this.e = bb3Var2;
        this.f = i;
        this.g = i2;
        this.h = jl2Var;
        this.i = j;
        this.j = uagVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !wag.class.equals(obj.getClass())) {
            return false;
        }
        wag wagVar = (wag) obj;
        if (this.f == wagVar.f && this.g == wagVar.g && this.a.equals(wagVar.a) && this.b == wagVar.b && pa7.t(this.d, wagVar.d) && this.h.equals(wagVar.h) && this.i == wagVar.i && pa7.t(this.j, wagVar.j) && this.k == wagVar.k && this.l == wagVar.l && this.c.equals(wagVar.c)) {
            return pa7.t(this.e, wagVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int iB = ib8.b((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        uag uagVar = this.j;
        return Integer.hashCode(this.l) + ib8.b((iB + (uagVar != null ? uagVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
