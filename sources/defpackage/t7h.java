package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t7h extends l0h {
    private static final t7h zzb;
    private int zzd;
    private int zze;

    static {
        t7h t7hVar = new t7h();
        zzb = t7hVar;
        l0h.f(t7h.class, t7hVar);
    }

    public static p7h p() {
        return (p7h) zzb.k();
    }

    public static /* synthetic */ void q(t7h t7hVar, int i) {
        t7hVar.zze = i - 1;
        t7hVar.zzd |= 1;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", uxg.i});
        }
        if (i2 == 3) {
            return new t7h();
        }
        if (i2 == 4) {
            return new p7h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
