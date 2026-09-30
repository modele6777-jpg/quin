package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pid {
    public static final pid a;
    public static final pid b;
    public static final pid c;
    public static final /* synthetic */ pid[] d;

    static {
        pid pidVar = new pid("FUNCTION", 0);
        a = pidVar;
        pid pidVar2 = new pid("PROPERTY", 1);
        b = pidVar2;
        pid pidVar3 = new pid("FIELD_IN_JAVA_CLASS", 2);
        c = pidVar3;
        d = new pid[]{pidVar, pidVar2, pidVar3};
    }

    public static pid valueOf(String str) {
        return (pid) Enum.valueOf(pid.class, str);
    }

    public static pid[] values() {
        return (pid[]) d.clone();
    }
}
