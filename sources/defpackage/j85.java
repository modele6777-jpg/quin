package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j85 extends m4 {
    public final ca1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j85(ca1 ca1Var, tt7 tt7Var) {
        super(tt7Var);
        if (tt7Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.c = ca1Var;
    }

    @Override // defpackage.m4
    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
