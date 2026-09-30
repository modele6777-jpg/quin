package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jzg extends omg {
    private static final jzg zzg;
    private static volatile tng zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        jzg jzgVar = new jzg();
        zzg = jzgVar;
        omg.m(jzg.class, jzgVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new jzg();
        }
        if (i2 == 4) {
            return new oyg(zzg);
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
        synchronized (jzg.class) {
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

    public final String r() {
        return this.zze;
    }
}
