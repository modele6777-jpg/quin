package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z26 {

    /* JADX INFO: Fake field, exist only in values array */
    z26 EF5;
    public static final /* synthetic */ z26[] b = {new z26("Function", 0), new z26("SuspendFunction", 1), new z26("KFunction", 2), new z26("KSuspendFunction", 3), new z26("UNKNOWN", 4)};
    public static final yx4 a = new yx4(5);

    public static z26 valueOf(String str) {
        return (z26) Enum.valueOf(z26.class, str);
    }

    public static z26[] values() {
        return (z26[]) b.clone();
    }
}
