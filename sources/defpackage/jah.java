package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jah extends omg {
    private static final vmg zzl = new pwg(20);
    private static final jah zzq;
    private static volatile tng zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private zmg zzi;
    private zmg zzj;
    private umg zzk;
    private nah zzm;
    private boolean zzn;
    private boolean zzo;
    private hah zzp;
    private xlg zze = xlg.a;
    private String zzg = "";

    static {
        jah jahVar = new jah();
        zzq = jahVar;
        omg.m(jah.class, jahVar);
    }

    public jah() {
        wng wngVar = wng.e;
        this.zzi = wngVar;
        this.zzj = wngVar;
        this.zzk = pmg.e;
    }

    public static iah E() {
        return (iah) zzq.h();
    }

    public static jah F() {
        return zzq;
    }

    public final nah A() {
        nah nahVar = this.zzm;
        return nahVar == null ? nah.t() : nahVar;
    }

    public final boolean B() {
        return this.zzn;
    }

    public final boolean C() {
        return this.zzo;
    }

    public final hah D() {
        hah hahVar = this.zzp;
        return hahVar == null ? hah.s() : hahVar;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", llg.b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new jah();
        }
        if (i2 == 4) {
            return new iah(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzr;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (jah.class) {
            try {
                nmgVar = zzr;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzq);
                    zzr = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final xlg s() {
        return this.zze;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final long v() {
        return this.zzh;
    }

    public final zmg w() {
        return this.zzi;
    }

    public final zmg x() {
        return this.zzj;
    }

    public final List y() {
        return new wmg(this.zzk, zzl);
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
