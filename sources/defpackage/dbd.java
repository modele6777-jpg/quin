package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dbd {
    public static final dbd a;
    public static final dbd b;
    public static final /* synthetic */ dbd[] c;

    static {
        dbd dbdVar = new dbd("Local", 0);
        a = dbdVar;
        dbd dbdVar2 = new dbd("External", 1);
        b = dbdVar2;
        c = new dbd[]{dbdVar, dbdVar2};
    }

    public static dbd valueOf(String str) {
        return (dbd) Enum.valueOf(dbd.class, str);
    }

    public static dbd[] values() {
        return (dbd[]) c.clone();
    }
}
