package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mi5 extends ni5 {
    public final j87[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public mi5(int i, j87[] j87VarArr) {
        if (j87VarArr == null) {
            qc0.j("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = j87VarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            s8f.h(j87VarArr.getClass(), "Empty enum: ");
            throw null;
        }
        super(i, i2, 0, (byte) 0);
        this.d = j87VarArr;
    }

    @Override // defpackage.ni5
    public final Object e(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (j87 j87Var : this.d) {
            if (j87Var.a() == i4) {
                return j87Var;
            }
        }
        return null;
    }
}
