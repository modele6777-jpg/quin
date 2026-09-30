package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class em3 extends cm3 implements dm3 {
    public final bm3 d;
    public final ntd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em3(bm3 bm3Var, h10 h10Var, t99 t99Var, ntd ntdVar) {
        super(h10Var, t99Var);
        if (bm3Var == null) {
            k0(0);
            throw null;
        }
        if (h10Var == null) {
            k0(1);
            throw null;
        }
        if (t99Var == null) {
            k0(2);
            throw null;
        }
        if (ntdVar == null) {
            k0(3);
            throw null;
        }
        this.d = bm3Var;
        this.e = ntdVar;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.dm3
    public ntd e() {
        ntd ntdVar = this.e;
        if (ntdVar != null) {
            return ntdVar;
        }
        k0(6);
        throw null;
    }

    public bm3 k() {
        bm3 bm3Var = this.d;
        if (bm3Var != null) {
            return bm3Var;
        }
        k0(5);
        throw null;
    }

    @Override // defpackage.cm3, defpackage.bm3
    /* JADX INFO: renamed from: C0 */
    public dm3 a() {
        return this;
    }
}
