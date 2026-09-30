package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jl2 {
    public static final jl2 j = new jl2();
    public final qe9 a;
    public final be9 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public jl2(jl2 jl2Var) {
        jl2Var.getClass();
        this.c = jl2Var.c;
        this.d = jl2Var.d;
        this.b = jl2Var.b;
        this.a = jl2Var.a;
        this.e = jl2Var.e;
        this.f = jl2Var.f;
        this.i = jl2Var.i;
        this.g = jl2Var.g;
        this.h = jl2Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jl2.class.equals(obj.getClass())) {
            return false;
        }
        jl2 jl2Var = (jl2) obj;
        if (this.c == jl2Var.c && this.d == jl2Var.d && this.e == jl2Var.e && this.f == jl2Var.f && this.g == jl2Var.g && this.h == jl2Var.h && pa7.t(a(), jl2Var.a()) && this.a == jl2Var.a) {
            return this.i.equals(jl2Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public jl2(be9 be9Var, qe9 qe9Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = be9Var;
        this.a = qe9Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public jl2() {
        this.b = new be9(null);
        this.a = qe9.a;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = xu4.a;
    }
}
