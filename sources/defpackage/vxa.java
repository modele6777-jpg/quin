package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vxa {
    public static final vxa a;
    public static final vxa b;
    public static final /* synthetic */ vxa[] c;

    /* JADX INFO: Fake field, exist only in values array */
    vxa EF0;

    static {
        vxa vxaVar = new vxa("PRETTY", 0);
        vxa vxaVar2 = new vxa("DEBUG", 1);
        a = vxaVar2;
        vxa vxaVar3 = new vxa("NONE", 2);
        b = vxaVar3;
        c = new vxa[]{vxaVar, vxaVar2, vxaVar3};
    }

    public static vxa valueOf(String str) {
        return (vxa) Enum.valueOf(vxa.class, str);
    }

    public static vxa[] values() {
        return (vxa[]) c.clone();
    }
}
