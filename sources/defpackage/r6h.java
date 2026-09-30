package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r6h extends l0h {
    private static final r6h zzb;
    private int zzd;
    private int zzf;
    private d6h zzi;
    private boolean zzj;
    private boolean zzk;
    private t7h zzl;
    private String zze = "";
    private s0h zzg = n0h.e;
    private v0h zzh = l3h.e;

    static {
        r6h r6hVar = new r6h();
        zzb = r6hVar;
        l0h.f(r6h.class, r6hVar);
    }

    public static o6h p() {
        return (o6h) zzb.k();
    }

    public static void q(r6h r6hVar, j6h j6hVar) {
        RandomAccess randomAccess = r6hVar.zzg;
        boolean z = ((fyg) randomAccess).a;
        RandomAccess randomAccess2 = randomAccess;
        if (!z) {
            n0h n0hVar = (n0h) randomAccess;
            int i = n0hVar.c;
            n0h n0hVarD = n0hVar.u(i + i);
            r6hVar.zzg = n0hVarD;
            randomAccess2 = n0hVarD;
        }
        ((n0h) randomAccess2).e(j6hVar.a());
    }

    public static /* synthetic */ void r(r6h r6hVar, d6h d6hVar) {
        r6hVar.zzi = d6hVar;
        r6hVar.zzd |= 4;
    }

    public static /* synthetic */ void s(r6h r6hVar) {
        r6hVar.zzd |= 1;
        r6hVar.zze = "ProxyBillingBroadcastReceiver";
    }

    public static /* synthetic */ void t(r6h r6hVar, t7h t7hVar) {
        r6hVar.zzl = t7hVar;
        r6hVar.zzd |= 32;
    }

    public static /* synthetic */ void u(r6h r6hVar, int i) {
        r6hVar.zzf = i - 1;
        r6hVar.zzd |= 2;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", uxg.f, "zzg", uxg.e, "zzh", j7h.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new r6h();
        }
        if (i2 == 4) {
            return new o6h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
