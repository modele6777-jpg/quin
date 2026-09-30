package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d22 extends i0 {
    public final bm3 e;
    public final ntd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d22(ge8 ge8Var, bm3 bm3Var, t99 t99Var, ntd ntdVar) {
        super(ge8Var, t99Var);
        if (ge8Var == null) {
            s0(0);
            throw null;
        }
        if (bm3Var == null) {
            s0(1);
            throw null;
        }
        if (t99Var == null) {
            s0(2);
            throw null;
        }
        this.e = bm3Var;
        this.f = ntdVar;
    }

    public static /* synthetic */ void s0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.dm3
    public final ntd e() {
        ntd ntdVar = this.f;
        if (ntdVar != null) {
            return ntdVar;
        }
        s0(5);
        throw null;
    }

    @Override // defpackage.tq8
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        bm3 bm3Var = this.e;
        if (bm3Var != null) {
            return bm3Var;
        }
        s0(4);
        throw null;
    }
}
