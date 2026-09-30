package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qah extends omg {
    private static final qah zzg;
    private static volatile tng zzh;
    private int zzb;
    private jah zze;
    private kah zzf;

    static {
        qah qahVar = new qah();
        zzg = qahVar;
        omg.m(qah.class, qahVar);
    }

    public static qah t(byte[] bArr, hmg hmgVar) {
        return (qah) omg.c(zzg, bArr, hmgVar);
    }

    public static pah u() {
        return (pah) zzg.h();
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new qah();
        }
        if (i2 == 4) {
            return new pah(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzh;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (qah.class) {
            try {
                nmgVar = zzh;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzg);
                    zzh = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final jah r() {
        jah jahVar = this.zze;
        return jahVar == null ? jah.F() : jahVar;
    }

    public final kah s() {
        kah kahVar = this.zzf;
        return kahVar == null ? kah.r() : kahVar;
    }

    public final /* synthetic */ void v(jah jahVar) {
        this.zze = jahVar;
        this.zzb |= 1;
    }
}
