package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rne {
    public static final rne a;
    public static final rne b;
    public static final rne c;
    public static final /* synthetic */ rne[] d;

    static {
        rne rneVar = new rne("Insert", 0);
        a = rneVar;
        rne rneVar2 = new rne("Delete", 1);
        b = rneVar2;
        rne rneVar3 = new rne("Replace", 2);
        c = rneVar3;
        d = new rne[]{rneVar, rneVar2, rneVar3};
    }

    public static rne valueOf(String str) {
        return (rne) Enum.valueOf(rne.class, str);
    }

    public static rne[] values() {
        return (rne[]) d.clone();
    }
}
