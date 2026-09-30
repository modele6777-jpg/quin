package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class idh extends omg {
    private static final idh zzj;
    private static volatile tng zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private xlg zzf = xlg.a;
    private String zzg = "";
    private zmg zzi = wng.e;

    static {
        idh idhVar = new idh();
        zzj = idhVar;
        omg.m(idh.class, idhVar);
    }

    public static hdh x() {
        return (hdh) zzj.h();
    }

    public static idh y() {
        return zzj;
    }

    public final /* synthetic */ void A(xlg xlgVar) {
        xlgVar.getClass();
        this.zzb |= 2;
        this.zzf = xlgVar;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void D(kdh kdhVar) {
        zmg zmgVarE = this.zzi;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzi = zmgVarE;
        }
        zmgVarE.add(kdhVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", kdh.class});
        }
        if (i2 == 3) {
            return new idh();
        }
        if (i2 == 4) {
            return new hdh(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzk;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (idh.class) {
            try {
                nmgVar = zzk;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzj);
                    zzk = nmgVar;
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

    public final xlg s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        return this.zzh;
    }

    public final zmg v() {
        return this.zzi;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
