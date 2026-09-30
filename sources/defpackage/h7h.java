package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h7h extends l0h {
    private static final h7h zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private u6h zzg;
    private v6h zzh;

    static {
        h7h h7hVar = new h7h();
        zzb = h7hVar;
        l0h.f(h7h.class, h7hVar);
    }

    public static /* synthetic */ void p(h7h h7hVar, z7h z7hVar) {
        h7hVar.zzf = z7hVar;
        h7hVar.zze = 8;
    }

    public static /* synthetic */ void q(h7h h7hVar, d8h d8hVar) {
        h7hVar.zzf = d8hVar;
        h7hVar.zze = 4;
    }

    public static e7h r() {
        return (e7h) zzb.k();
    }

    public static /* synthetic */ void s(h7h h7hVar, p5h p5hVar) {
        h7hVar.zzf = p5hVar;
        h7hVar.zze = 2;
    }

    public static /* synthetic */ void t(h7h h7hVar, v5h v5hVar) {
        h7hVar.zzf = v5hVar;
        h7hVar.zze = 3;
    }

    public static /* synthetic */ void u(h7h h7hVar, g6h g6hVar) {
        g6hVar.getClass();
        h7hVar.zzf = g6hVar;
        h7hVar.zze = 7;
    }

    public static /* synthetic */ void v(h7h h7hVar, r6h r6hVar) {
        h7hVar.zzf = r6hVar;
        h7hVar.zze = 5;
    }

    public static /* synthetic */ void w(h7h h7hVar, u6h u6hVar) {
        u6hVar.getClass();
        h7hVar.zzg = u6hVar;
        h7hVar.zzd |= 1;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p5h.class, v5h.class, d8h.class, r6h.class, "zzh", g6h.class, z7h.class});
        }
        if (i2 == 3) {
            return new h7h();
        }
        if (i2 == 4) {
            return new e7h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
