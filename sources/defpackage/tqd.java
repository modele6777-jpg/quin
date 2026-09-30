package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tqd {
    public static final tqd a;
    public static final /* synthetic */ tqd[] b;

    static {
        tqd tqdVar = new tqd("Dismissed", 0);
        a = tqdVar;
        b = new tqd[]{tqdVar, new tqd("ActionPerformed", 1)};
    }

    public static tqd valueOf(String str) {
        return (tqd) Enum.valueOf(tqd.class, str);
    }

    public static tqd[] values() {
        return (tqd[]) b.clone();
    }
}
