package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v6h extends l0h {
    private static final v6h zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        v6h v6hVar = new v6h();
        zzb = v6hVar;
        l0h.f(v6h.class, v6hVar);
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new v6h();
        }
        if (i2 == 4) {
            return new kxg(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
