package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    public static final /* synthetic */ zzb[] a;
    public static final /* synthetic */ mx4 b;

    /* JADX INFO: Fake field, exist only in values array */
    zzb EF5;

    static {
        zzb[] zzbVarArr = {new zzb("UNSPECIFIED", 0), new zzb("MUST_USE", 1), new zzb("EXPLICITLY_IGNORABLE", 2)};
        a = zzbVarArr;
        b = new mx4(zzbVarArr);
    }

    public static zzb valueOf(String str) {
        return (zzb) Enum.valueOf(zzb.class, str);
    }

    public static zzb[] values() {
        return (zzb[]) a.clone();
    }
}
