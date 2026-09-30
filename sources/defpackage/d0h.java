package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0h extends omg {
    private static final d0h zzw;
    private static volatile tng zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zmg zzh;
    private zmg zzi;
    private zmg zzj;
    private String zzk;
    private boolean zzl;
    private zmg zzm;
    private zmg zzn;
    private String zzo;
    private String zzp;
    private szg zzq;
    private m0h zzr;
    private a1h zzs;
    private o0h zzt;
    private h0h zzu;
    private umg zzv;

    static {
        d0h d0hVar = new d0h();
        zzw = d0hVar;
        omg.m(d0h.class, d0hVar);
    }

    public d0h() {
        wng wngVar = wng.e;
        this.zzh = wngVar;
        this.zzi = wngVar;
        this.zzj = wngVar;
        this.zzk = "";
        this.zzm = wngVar;
        this.zzn = wngVar;
        this.zzo = "";
        this.zzp = "";
        this.zzv = pmg.e;
    }

    public static a0h I() {
        return (a0h) zzw.h();
    }

    public static d0h J() {
        return zzw;
    }

    public final int A() {
        return this.zzm.size();
    }

    public final zmg B() {
        return this.zzn;
    }

    public final String C() {
        return this.zzo;
    }

    public final boolean D() {
        return (this.zzb & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
    }

    public final szg E() {
        szg szgVar = this.zzq;
        return szgVar == null ? szg.x() : szgVar;
    }

    public final boolean F() {
        return (this.zzb & 512) != 0;
    }

    public final a1h G() {
        a1h a1hVar = this.zzs;
        return a1hVar == null ? a1h.t() : a1hVar;
    }

    public final umg H() {
        return this.zzv;
    }

    public final void K(int i, zzg zzgVar) {
        zmg zmgVarE = this.zzi;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzi = zmgVarE;
        }
        zmgVarE.set(i, zzgVar);
    }

    public final void L() {
        this.zzj = wng.e;
    }

    public final void M() {
        this.zzm = wng.e;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", u0h.class, "zzi", zzg.class, "zzj", jyg.class, "zzk", "zzl", "zzm", b5h.class, "zzn", uzg.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new d0h();
        }
        if (i2 == 4) {
            return new a0h(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzx;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (d0h.class) {
            try {
                nmgVar = zzx;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzw);
                    zzx = nmgVar;
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

    public final long s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final String u() {
        return this.zzf;
    }

    public final zmg v() {
        return this.zzh;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final zzg x(int i) {
        return (zzg) this.zzi.get(i);
    }

    public final List y() {
        return this.zzj;
    }

    public final zmg z() {
        return this.zzm;
    }
}
