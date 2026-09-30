package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tuc {
    public static final tuc a;
    public static final tuc b;
    public static final /* synthetic */ tuc[] c;

    static {
        tuc tucVar = new tuc("EditableText", 0);
        a = tucVar;
        tuc tucVar2 = new tuc("StaticText", 1);
        b = tucVar2;
        c = new tuc[]{tucVar, tucVar2};
    }

    public static tuc valueOf(String str) {
        return (tuc) Enum.valueOf(tuc.class, str);
    }

    public static tuc[] values() {
        return (tuc[]) c.clone();
    }
}
