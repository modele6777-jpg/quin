package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class pud {
    public static final pud a;
    public static final pud b;
    public static final pud c;
    public static final oud d;
    public static final /* synthetic */ pud[] e;
    private final Object defaultValue;

    static {
        pud pudVar = new pud(0, null, "NULL");
        a = pudVar;
        pud pudVar2 = new pud(1, -1, "INDEX");
        b = pudVar2;
        pud pudVar3 = new pud(2, Boolean.FALSE, "FALSE");
        c = pudVar3;
        oud oudVar = new oud(3, null, "MAP_GET_OR_DEFAULT");
        d = oudVar;
        e = new pud[]{pudVar, pudVar2, pudVar3, oudVar};
    }

    public pud(int i, Object obj, String str) {
        super(str, i);
        this.defaultValue = obj;
    }

    public static pud valueOf(String str) {
        return (pud) Enum.valueOf(pud.class, str);
    }

    public static pud[] values() {
        return (pud[]) e.clone();
    }
}
