package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sue {
    public static final sue a;
    public static final sue b;
    public static final sue c;
    public static final /* synthetic */ sue[] d;

    static {
        sue sueVar = new sue("None", 0);
        a = sueVar;
        sue sueVar2 = new sue("Cursor", 1);
        b = sueVar2;
        sue sueVar3 = new sue("Selection", 2);
        c = sueVar3;
        d = new sue[]{sueVar, sueVar2, sueVar3};
    }

    public static sue valueOf(String str) {
        return (sue) Enum.valueOf(sue.class, str);
    }

    public static sue[] values() {
        return (sue[]) d.clone();
    }
}
