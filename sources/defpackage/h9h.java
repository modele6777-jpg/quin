package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h9h extends omg {
    private static final h9h zzh;
    private static volatile tng zzi;
    private int zzb;
    private f9h zzf;
    private String zze = "";
    private String zzg = "";

    static {
        h9h h9hVar = new h9h();
        zzh = h9hVar;
        omg.m(h9h.class, h9hVar);
    }

    public static c9h s() {
        return (c9h) zzh.h();
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h9h();
        }
        if (i2 == 4) {
            return new c9h(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzi;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (h9h.class) {
            try {
                nmgVar = zzi;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzh);
                    zzi = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final String r() {
        return this.zze;
    }

    public final /* synthetic */ void t(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void u(f9h f9hVar) {
        this.zzf = f9hVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
