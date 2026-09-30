package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qod {
    public static final qod a;
    public static final qod b;
    public static final /* synthetic */ qod[] c;

    static {
        qod qodVar = new qod("THUMB", 0);
        a = qodVar;
        qod qodVar2 = new qod("TRACK", 1);
        b = qodVar2;
        c = new qod[]{qodVar, qodVar2};
    }

    public static qod valueOf(String str) {
        return (qod) Enum.valueOf(qod.class, str);
    }

    public static qod[] values() {
        return (qod[]) c.clone();
    }
}
