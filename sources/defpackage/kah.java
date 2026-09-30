package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kah extends omg {
    private static final kah zzo;
    private static volatile tng zzp;
    private int zzb;
    private boolean zzf;
    private zmg zzh;
    private zmg zzi;
    private umg zzj;
    private nah zzk;
    private boolean zzl;
    private boolean zzm;
    private hah zzn;
    private xlg zze = xlg.a;
    private String zzg = "";

    static {
        kah kahVar = new kah();
        zzo = kahVar;
        omg.m(kah.class, kahVar);
    }

    public kah() {
        wng wngVar = wng.e;
        this.zzh = wngVar;
        this.zzi = wngVar;
        this.zzj = pmg.e;
    }

    public static kah r() {
        return zzo;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", llg.b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new kah();
        }
        if (i2 == 4) {
            return new oyg(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzp;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (kah.class) {
            try {
                nmgVar = zzp;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzo);
                    zzp = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }
}
