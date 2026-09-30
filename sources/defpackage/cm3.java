package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cm3 extends m4 implements bm3 {
    public final t99 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm3(h10 h10Var, t99 t99Var) {
        super(h10Var);
        if (h10Var == null) {
            k0(0);
            throw null;
        }
        if (t99Var == null) {
            k0(1);
            throw null;
        }
        this.c = t99Var;
    }

    public static String B0(bm3 bm3Var) {
        try {
            return jz3.e.n(bm3Var) + "[" + bm3Var.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(bm3Var)) + "]";
        } catch (Throwable unused) {
            return bm3Var.getClass().getSimpleName() + " " + bm3Var.getName();
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bm3
    public final t99 getName() {
        t99 t99Var = this.c;
        if (t99Var != null) {
            return t99Var;
        }
        k0(2);
        throw null;
    }

    @Override // defpackage.m4
    public String toString() {
        return B0(this);
    }

    public bm3 a() {
        return this;
    }
}
