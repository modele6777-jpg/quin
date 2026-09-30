package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d6h extends l0h {
    private static final d6h zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        d6h d6hVar = new d6h();
        zzb = d6hVar;
        l0h.f(d6h.class, d6hVar);
    }

    public static /* synthetic */ void p(d6h d6hVar, int i) {
        d6hVar.zzd |= 1;
        d6hVar.zze = i;
    }

    public static w5h q() {
        return (w5h) zzb.k();
    }

    public static /* synthetic */ void r(d6h d6hVar, String str) {
        d6hVar.zzd |= 8;
        d6hVar.zzh = str;
    }

    public static /* synthetic */ void s(d6h d6hVar, String str) {
        str.getClass();
        d6hVar.zzd |= 2;
        d6hVar.zzf = str;
    }

    public static /* synthetic */ void t(d6h d6hVar, int i) {
        d6hVar.zzd |= 32;
        d6hVar.zzj = i;
    }

    public static /* synthetic */ void u(d6h d6hVar, int i) {
        d6hVar.zzd |= 16;
        d6hVar.zzi = i;
    }

    public static /* synthetic */ void v(d6h d6hVar, z5h z5hVar) {
        d6hVar.zzg = z5hVar.a();
        d6hVar.zzd |= 4;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", uxg.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new d6h();
        }
        if (i2 == 4) {
            return new w5h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
