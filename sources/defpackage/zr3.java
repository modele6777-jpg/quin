package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zr3 implements xsc {
    public final /* synthetic */ as3 a;

    public zr3(as3 as3Var) {
        this.a = as3Var;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        as3 as3Var = this.a;
        long j2 = (((long) as3Var.d.i) * j) / 1000000;
        long j3 = as3Var.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = as3Var.c;
        zsc zscVar = new zsc(j, pqf.i((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(as3Var.f)).longValue() + j3) - 30000, as3Var.b, j4 - 1));
        return new wsc(zscVar, zscVar);
    }

    @Override // defpackage.xsc
    public final long h() {
        as3 as3Var = this.a;
        return (as3Var.f * 1000000) / ((long) as3Var.d.i);
    }
}
