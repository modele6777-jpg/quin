package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gyg extends omg {
    private static final gyg zzi;
    private static volatile tng zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        gyg gygVar = new gyg();
        zzi = gygVar;
        omg.m(gyg.class, gygVar);
    }

    public static eyg r() {
        return (eyg) zzi.h();
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new gyg();
        }
        if (i2 == 4) {
            return new eyg(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzj;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (gyg.class) {
            try {
                nmgVar = zzj;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzi);
                    zzj = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final /* synthetic */ void s(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void t() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void u(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
