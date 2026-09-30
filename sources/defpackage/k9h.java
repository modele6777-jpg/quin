package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k9h extends omg {
    private static final k9h zzl;
    private static volatile tng zzm;
    private int zzb;
    private String zze = "";
    private xlg zzf = xlg.a;
    private String zzg = "";
    private zmg zzh;
    private zmg zzi;
    private boolean zzj;
    private long zzk;

    static {
        k9h k9hVar = new k9h();
        zzl = k9hVar;
        omg.m(k9h.class, k9hVar);
    }

    public k9h() {
        wng wngVar = wng.e;
        this.zzh = wngVar;
        this.zzi = wngVar;
    }

    public static j9h x() {
        return (j9h) zzl.h();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void B(m9h m9hVar) {
        zmg zmgVarE = this.zzh;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzh = zmgVarE;
        }
        zmgVarE.add(m9hVar);
    }

    public final void C(String str) {
        str.getClass();
        zmg zmgVarE = this.zzi;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzi = zmgVarE;
        }
        zmgVarE.add(str);
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", m9h.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new k9h();
        }
        if (i2 == 4) {
            return new j9h(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzm;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (k9h.class) {
            try {
                nmgVar = zzm;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzl);
                    zzm = nmgVar;
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

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final xlg t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final zmg v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzk;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void z(wlg wlgVar) {
        wlgVar.getClass();
        this.zzb |= 2;
        this.zzf = wlgVar;
    }
}
