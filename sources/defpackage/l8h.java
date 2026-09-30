package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l8h extends l0h {
    private static final l8h zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        l8h l8hVar = new l8h();
        zzb = l8hVar;
        l0h.f(l8h.class, l8hVar);
    }

    public static g8h p() {
        return (g8h) zzb.k();
    }

    public static /* synthetic */ void q(l8h l8hVar, boolean z) {
        l8hVar.zzd |= 8;
        l8hVar.zzh = z;
    }

    public static /* synthetic */ void r(l8h l8hVar) {
        l8hVar.zzd |= 16;
        l8hVar.zzi = 0;
    }

    public static /* synthetic */ void s(l8h l8hVar, long j) {
        l8hVar.zzd |= 4;
        l8hVar.zzg = j;
    }

    public static /* synthetic */ void t(l8h l8hVar, int i) {
        l8hVar.zzd |= 32;
        l8hVar.zzj = i;
    }

    public static /* synthetic */ void u(l8h l8hVar) {
        l8hVar.zzd |= 2;
        l8hVar.zzf = true;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new l8h();
        }
        if (i2 == 4) {
            return new g8h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
