package defpackage;

import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u6h extends l0h {
    private static final u6h zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        u6h u6hVar = new u6h();
        zzb = u6hVar;
        l0h.f(u6h.class, u6hVar);
    }

    public static /* synthetic */ void A(u6h u6hVar, int i) {
        u6hVar.zzd |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        u6hVar.zzl = i;
    }

    public static /* synthetic */ void B(u6h u6hVar, int i) {
        u6hVar.zzd |= 256;
        u6hVar.zzm = i;
    }

    public static /* synthetic */ void C(u6h u6hVar, int i) {
        u6hVar.zzd |= 8;
        u6hVar.zzh = i;
    }

    public static /* synthetic */ void D(u6h u6hVar, long j) {
        u6hVar.zzd |= 16;
        u6hVar.zzi = j;
    }

    public static /* synthetic */ void E(u6h u6hVar, long j) {
        u6hVar.zzd |= 32;
        u6hVar.zzj = j;
    }

    public static /* synthetic */ void p(u6h u6hVar) {
        u6hVar.zzd |= 512;
        u6hVar.zzn = 926300087L;
    }

    public static /* synthetic */ void q(u6h u6hVar, String str) {
        str.getClass();
        u6hVar.zzd |= 4;
        u6hVar.zzg = str;
    }

    public static /* synthetic */ void r(u6h u6hVar) {
        String str = Build.BRAND;
        str.getClass();
        u6hVar.zzd |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        u6hVar.zzo = str;
    }

    public static /* synthetic */ void s(u6h u6hVar) {
        String str = Build.FINGERPRINT;
        str.getClass();
        u6hVar.zzd |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        u6hVar.zzr = str;
    }

    public static /* synthetic */ void t(u6h u6hVar) {
        String str = Build.MANUFACTURER;
        str.getClass();
        u6hVar.zzd |= 4096;
        u6hVar.zzq = str;
    }

    public static /* synthetic */ void u(u6h u6hVar) {
        String str = Build.MODEL;
        str.getClass();
        u6hVar.zzd |= 2048;
        u6hVar.zzp = str;
    }

    public static /* synthetic */ void v(u6h u6hVar, int i) {
        u6hVar.zzd |= 16384;
        u6hVar.zzs = i;
    }

    public static /* synthetic */ void w(u6h u6hVar) {
        u6hVar.zzd |= 64;
        u6hVar.zzk = false;
    }

    public static /* synthetic */ void x(u6h u6hVar) {
        u6hVar.zzd |= 1;
        u6hVar.zze = "9.1.0";
    }

    public static /* synthetic */ void y(u6h u6hVar, String str) {
        u6hVar.zzd |= 2;
        u6hVar.zzf = str;
    }

    public static s6h z() {
        return (s6h) zzb.k();
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new u6h();
        }
        if (i2 == 4) {
            return new s6h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
