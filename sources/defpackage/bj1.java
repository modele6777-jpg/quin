package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 extends yi1 {
    public final String a;
    public final d62 b;
    public final Integer c;
    public final er4 d;
    public final Throwable e;
    public final er4 f;
    public final er4 g;
    public final er4 h;
    public final nf1 i;

    public bj1(String str, d62 d62Var, Integer num, er4 er4Var, Throwable th, er4 er4Var2, er4 er4Var3, er4 er4Var4, nf1 nf1Var) {
        str.getClass();
        this.a = str;
        this.b = d62Var;
        this.c = num;
        this.d = er4Var;
        this.e = th;
        this.f = er4Var2;
        this.g = er4Var3;
        this.h = er4Var4;
        this.i = nf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return pa7.t(this.a, bj1Var.a) && this.b == bj1Var.b && pa7.t(this.c, bj1Var.c) && pa7.t(this.d, bj1Var.d) && pa7.t(this.e, bj1Var.e) && pa7.t(this.f, bj1Var.f) && pa7.t(this.g, bj1Var.g) && pa7.t(this.h, bj1Var.h) && pa7.t(this.i, bj1Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        er4 er4Var = this.d;
        int iHashCode3 = (iHashCode2 + (er4Var == null ? 0 : Long.hashCode(er4Var.a))) * 31;
        Throwable th = this.e;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        er4 er4Var2 = this.f;
        int iHashCode5 = (iHashCode4 + (er4Var2 == null ? 0 : Long.hashCode(er4Var2.a))) * 31;
        er4 er4Var3 = this.g;
        int iHashCode6 = (iHashCode5 + (er4Var3 == null ? 0 : Long.hashCode(er4Var3.a))) * 31;
        er4 er4Var4 = this.h;
        int iHashCode7 = (iHashCode6 + (er4Var4 == null ? 0 : Long.hashCode(er4Var4.a))) * 31;
        nf1 nf1Var = this.i;
        return iHashCode7 + (nf1Var != null ? Integer.hashCode(nf1Var.a) : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) ig1.b(this.a)) + ", cameraClosedReason=" + this.b + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}
