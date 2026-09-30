package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rz {
    public static final rz a;
    public static final rz b;
    public static final /* synthetic */ rz[] c;

    static {
        rz rzVar = new rz("BoundReached", 0);
        a = rzVar;
        rz rzVar2 = new rz("Finished", 1);
        b = rzVar2;
        c = new rz[]{rzVar, rzVar2};
    }

    public static rz valueOf(String str) {
        return (rz) Enum.valueOf(rz.class, str);
    }

    public static rz[] values() {
        return (rz[]) c.clone();
    }
}
