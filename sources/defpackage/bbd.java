package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bbd {
    public static final bbd a;
    public static final bbd b;
    public static final /* synthetic */ bbd[] c;

    static {
        bbd bbdVar = new bbd("None", 0);
        a = bbdVar;
        bbd bbdVar2 = new bbd("Failure", 1);
        b = bbdVar2;
        c = new bbd[]{bbdVar, bbdVar2};
    }

    public static bbd valueOf(String str) {
        return (bbd) Enum.valueOf(bbd.class, str);
    }

    public static bbd[] values() {
        return (bbd[]) c.clone();
    }
}
