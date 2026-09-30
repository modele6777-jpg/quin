package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v5h extends l0h {
    private static final v5h zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        v5h v5hVar = new v5h();
        zzb = v5hVar;
        l0h.f(v5h.class, v5hVar);
    }

    public static /* synthetic */ void p(v5h v5hVar, int i) {
        v5hVar.zzg = i - 1;
        v5hVar.zzd |= 1;
    }

    public static t5h q() {
        return (t5h) zzb.k();
    }

    public static /* synthetic */ void s(v5h v5hVar, j6h j6hVar) {
        v5hVar.zzh = j6hVar.a();
        v5hVar.zzd |= 2;
    }

    public static /* synthetic */ void t(v5h v5hVar, c7h c7hVar) {
        v5hVar.zzf = c7hVar;
        v5hVar.zze = 4;
    }

    public static /* synthetic */ void u(v5h v5hVar, l8h l8hVar) {
        v5hVar.zzf = l8hVar;
        v5hVar.zze = 3;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", uxg.c, x6h.class, l8h.class, c7h.class, "zzh", uxg.e});
        }
        if (i2 == 3) {
            return new v5h();
        }
        if (i2 == 4) {
            return new t5h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final c7h r() {
        return this.zze == 4 ? (c7h) this.zzf : c7h.p();
    }
}
