package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c7h extends l0h {
    private static final c7h zzb;
    private int zzd;
    private v0h zze = l3h.e;
    private String zzf = "";
    private boolean zzg;

    static {
        c7h c7hVar = new c7h();
        zzb = c7hVar;
        l0h.f(c7h.class, c7hVar);
    }

    public static c7h p() {
        return zzb;
    }

    public static /* synthetic */ void q(c7h c7hVar, boolean z) {
        c7hVar.zzd |= 2;
        c7hVar.zzg = z;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", b7h.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new c7h();
        }
        if (i2 == 4) {
            return new z6h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
