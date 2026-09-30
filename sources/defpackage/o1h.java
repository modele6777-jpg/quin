package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1h extends omg {
    private static final o1h zzp;
    private static volatile tng zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private hng zzm;
    private hng zzn;
    private String zzo;

    static {
        o1h o1hVar = new o1h();
        zzp = o1hVar;
        omg.m(o1h.class, o1hVar);
    }

    public o1h() {
        hng hngVar = hng.a;
        this.zzm = hngVar;
        this.zzn = hngVar;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static c1h W() {
        return (c1h) zzp.h();
    }

    public static o1h X() {
        return zzp;
    }

    public final /* synthetic */ hng A() {
        if (!this.zzm.d()) {
            this.zzm = this.zzm.b();
        }
        return this.zzm;
    }

    public final /* synthetic */ hng B() {
        if (!this.zzn.d()) {
            this.zzn = this.zzn.b();
        }
        return this.zzn;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void D() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final long L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final String N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zzb & 32) != 0;
    }

    public final String P() {
        return this.zzj;
    }

    public final boolean Q() {
        return (this.zzb & 64) != 0;
    }

    public final String R() {
        return this.zzk;
    }

    public final boolean S() {
        return (this.zzb & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
    }

    public final long T() {
        return this.zzl;
    }

    public final boolean U() {
        return (this.zzb & 256) != 0;
    }

    public final String V() {
        return this.zzo;
    }

    public final /* synthetic */ void Y(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void Z() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", f1h.a, "zzn", h1h.a, "zzo"});
        }
        if (i2 == 3) {
            return new o1h();
        }
        if (i2 == 4) {
            return new c1h(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzq;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (o1h.class) {
            try {
                nmgVar = zzq;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzp);
                    zzq = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final /* synthetic */ void r() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void s(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        this.zzl = j;
    }
}
