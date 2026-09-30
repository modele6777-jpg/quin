package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m4h extends omg {
    private static final m4h zzh;
    private static volatile tng zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        m4h m4hVar = new m4h();
        zzh = m4hVar;
        omg.m(m4h.class, m4hVar);
    }

    public static i4h s() {
        return (i4h) zzh.h();
    }

    public static m4h t() {
        return zzh;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", llg.o, "zzf", llg.m, "zzg", llg.n});
        }
        if (i2 == 3) {
            return new m4h();
        }
        if (i2 == 4) {
            return new i4h(zzh);
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
        synchronized (m4h.class) {
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

    public final j4h r() {
        j4h j4hVarA = j4h.a(this.zzf);
        return j4hVarA == null ? j4h.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : j4hVarA;
    }

    public final /* synthetic */ void u(j4h j4hVar) {
        this.zzf = j4hVar.b();
        this.zzb |= 2;
    }

    public final int v() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
  0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int w() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void x(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void y(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }
}
