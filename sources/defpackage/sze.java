package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sze {
    public static final sze a;
    public static final sze b;
    public static final sze c;
    public static final /* synthetic */ sze[] d;

    static {
        sze szeVar = new sze("Uninitialized", 0);
        a = szeVar;
        sze szeVar2 = new sze("Detached", 1);
        b = szeVar2;
        sze szeVar3 = new sze("Attached", 2);
        c = szeVar3;
        d = new sze[]{szeVar, szeVar2, szeVar3};
    }

    public static sze valueOf(String str) {
        return (sze) Enum.valueOf(sze.class, str);
    }

    public static sze[] values() {
        return (sze[]) d.clone();
    }
}
