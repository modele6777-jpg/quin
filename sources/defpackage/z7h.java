package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z7h extends l0h {
    private static final z7h zzb;
    private int zzd;
    private d6h zze;
    private long zzf;

    static {
        z7h z7hVar = new z7h();
        zzb = z7hVar;
        l0h.f(z7h.class, z7hVar);
    }

    public static v7h p() {
        return (v7h) zzb.k();
    }

    public static /* synthetic */ void q(z7h z7hVar, d6h d6hVar) {
        z7hVar.zze = d6hVar;
        z7hVar.zzd |= 1;
    }

    public static /* synthetic */ void r(z7h z7hVar, long j) {
        z7hVar.zzd |= 2;
        z7hVar.zzf = j;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new z7h();
        }
        if (i2 == 4) {
            return new v7h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
