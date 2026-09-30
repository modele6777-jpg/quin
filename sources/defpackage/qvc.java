package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qvc {
    public static final qvc a;
    public static final qvc b;
    public static final qvc c;
    public static final /* synthetic */ qvc[] d;

    static {
        qvc qvcVar = new qvc("Left", 0);
        a = qvcVar;
        qvc qvcVar2 = new qvc("Middle", 1);
        b = qvcVar2;
        qvc qvcVar3 = new qvc("Right", 2);
        c = qvcVar3;
        d = new qvc[]{qvcVar, qvcVar2, qvcVar3};
    }

    public static qvc valueOf(String str) {
        return (qvc) Enum.valueOf(qvc.class, str);
    }

    public static qvc[] values() {
        return (qvc[]) d.clone();
    }
}
