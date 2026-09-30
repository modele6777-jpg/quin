package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sxg extends l0h {
    private static final sxg zzb;
    private int zzd;
    private String zze = "";

    static {
        sxg sxgVar = new sxg();
        zzb = sxgVar;
        l0h.f(sxg.class, sxgVar);
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new sxg();
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
