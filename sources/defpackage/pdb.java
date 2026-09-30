package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pdb extends jf2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ kd9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdb(kd9 kd9Var, int i) {
        super(1);
        this.b = i;
        this.c = kd9Var;
    }

    @Override // defpackage.jf2
    public final void g(String[] strArr) {
        int i = this.b;
        kd9 kd9Var = this.c;
        switch (i) {
            case 0:
                if (strArr == null) {
                    qc0.j("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((rdb) kd9Var.b).d = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    qc0.j("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((rdb) kd9Var.b).e = strArr;
                }
                break;
        }
    }
}
