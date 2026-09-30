package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fxa {
    public static final fxa a;
    public static final fxa b;
    public static final fxa c;
    public static final /* synthetic */ fxa[] d;

    static {
        fxa fxaVar = new fxa("PASS_THROUGH", 0);
        a = fxaVar;
        fxa fxaVar2 = new fxa("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = fxaVar2;
        fxa fxaVar3 = new fxa("DISCARDING", 2);
        c = fxaVar3;
        d = new fxa[]{fxaVar, fxaVar2, fxaVar3};
    }

    public static fxa valueOf(String str) {
        return (fxa) Enum.valueOf(fxa.class, str);
    }

    public static fxa[] values() {
        return (fxa[]) d.clone();
    }
}
