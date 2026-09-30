package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g52 extends ms5 {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public g52(gye gyeVar, long j, long j2) throws h52 {
        super(gyeVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new h52(j, 2, j2);
        }
        boolean z = false;
        if (gyeVar.h() != 1) {
            throw new h52(0);
        }
        fye fyeVarM = gyeVar.m(0, new fye(), 0L);
        long jMax = Math.max(0L, j);
        if (!fyeVarM.i && jMax != 0 && !fyeVarM.f) {
            throw new h52(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? fyeVarM.k : Math.max(0L, j2);
        long j3 = fyeVarM.k;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.c = jMax;
        this.d = jMax2;
        this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (fyeVarM.g && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.ms5, defpackage.gye
    public final eye f(int i, eye eyeVar, boolean z) {
        this.b.f(0, eyeVar, z);
        long j = eyeVar.e - this.c;
        long j2 = this.e;
        long j3 = j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L;
        Object obj = eyeVar.a;
        Object obj2 = eyeVar.b;
        qf qfVar = qf.c;
        eyeVar.h(obj, obj2, 0, j3, j, eyeVar.f);
        return eyeVar;
    }

    @Override // defpackage.ms5, defpackage.gye
    public final fye m(int i, fye fyeVar, long j) {
        this.b.m(0, fyeVar, 0L);
        long j2 = fyeVar.n;
        long j3 = this.c;
        fyeVar.n = j2 + j3;
        fyeVar.k = this.e;
        fyeVar.g = this.f;
        long j4 = fyeVar.j;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            fyeVar.j = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            fyeVar.j = jMax - j3;
        }
        long jR = pqf.R(j3);
        long j6 = fyeVar.c;
        if (j6 != -9223372036854775807L) {
            fyeVar.c = j6 + jR;
        }
        long j7 = fyeVar.d;
        if (j7 != -9223372036854775807L) {
            fyeVar.d = j7 + jR;
        }
        return fyeVar;
    }
}
