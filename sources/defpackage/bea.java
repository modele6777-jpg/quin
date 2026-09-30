package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bea implements sw3 {
    public boolean a;

    public static void j(bea beaVar, cea ceaVar, long j) {
        beaVar.e(ceaVar);
        ceaVar.b0(w67.d(j, ceaVar.e), 0.0f, null);
    }

    public static void n(bea beaVar, cea ceaVar, int i, int i2) {
        q4a q4aVar = dea.a;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (beaVar.c() == cv7.a || beaVar.d() == 0) {
            beaVar.e(ceaVar);
            ceaVar.b0(w67.d(j, ceaVar.e), 0.0f, q4aVar);
        } else {
            int iD = (beaVar.d() - ceaVar.a) - ((int) (j >> 32));
            beaVar.e(ceaVar);
            ceaVar.b0(w67.d((((long) iD) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), ceaVar.e), 0.0f, q4aVar);
        }
    }

    public static void p(bea beaVar, cea ceaVar, long j) {
        q4a q4aVar = dea.a;
        if (beaVar.c() == cv7.a || beaVar.d() == 0) {
            beaVar.e(ceaVar);
            ceaVar.b0(w67.d(j, ceaVar.e), 0.0f, q4aVar);
        } else {
            int iD = (beaVar.d() - ceaVar.a) - ((int) (j >> 32));
            beaVar.e(ceaVar);
            ceaVar.b0(w67.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iD) << 32), ceaVar.e), 0.0f, q4aVar);
        }
    }

    public static void q(bea beaVar, cea ceaVar, int i, int i2, a26 a26Var, int i3) {
        if ((i3 & 8) != 0) {
            a26Var = dea.a;
        }
        beaVar.e(ceaVar);
        ceaVar.b0(w67.d((((long) i2) & 4294967295L) | (((long) i) << 32), ceaVar.e), 0.0f, a26Var);
    }

    public static void r(bea beaVar, cea ceaVar, long j) {
        q4a q4aVar = dea.a;
        beaVar.e(ceaVar);
        ceaVar.b0(w67.d(j, ceaVar.e), 0.0f, q4aVar);
    }

    public float a(rq6 rq6Var) {
        return Float.NaN;
    }

    public abstract bv7 b();

    public abstract cv7 c();

    public abstract int d();

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(cea ceaVar) {
        if (ceaVar instanceof r39) {
            ((r39) ceaVar).H(this.a);
        }
    }

    public final void g(cea ceaVar, int i, int i2, float f) {
        e(ceaVar);
        ceaVar.b0(w67.d((((long) i2) & 4294967295L) | (((long) i) << 32), ceaVar.e), f, null);
    }

    public final void k(cea ceaVar, int i, int i2, float f) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (c() == cv7.a || d() == 0) {
            e(ceaVar);
            ceaVar.b0(w67.d(j, ceaVar.e), f, null);
        } else {
            int iD = (d() - ceaVar.a) - ((int) (j >> 32));
            e(ceaVar);
            ceaVar.b0(w67.d((((long) iD) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), ceaVar.e), f, null);
        }
    }
}
