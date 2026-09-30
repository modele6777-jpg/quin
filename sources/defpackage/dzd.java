package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dzd extends i8f {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public dzd(c8f c8fVar) {
        c8fVar.getClass();
        this.b = c8fVar;
        this.c = eb3.N(z18.b, new wj7(18, this));
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.i8f
    public final dsf a() {
        switch (this.a) {
            case 0:
                return dsf.OUT_VARIANCE;
            default:
                dsf dsfVar = (dsf) this.b;
                if (dsfVar != null) {
                    return dsfVar;
                }
                e(4);
                throw null;
        }
    }

    @Override // defpackage.i8f
    public final tt7 b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (tt7) ((lw7) obj).getValue();
            default:
                tt7 tt7Var = (tt7) obj;
                if (tt7Var != null) {
                    return tt7Var;
                }
                e(5);
                throw null;
        }
    }

    @Override // defpackage.i8f
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.i8f
    public final i8f d(zt7 zt7Var) {
        switch (this.a) {
            case 0:
                return this;
            default:
                dsf dsfVar = (dsf) this.b;
                tt7 tt7Var = (tt7) this.c;
                tt7Var.getClass();
                return new dzd(tt7Var, dsfVar);
        }
    }

    public dzd(tt7 tt7Var, dsf dsfVar) {
        if (dsfVar == null) {
            e(0);
            throw null;
        }
        if (tt7Var != null) {
            this.b = dsfVar;
            this.c = tt7Var;
        } else {
            e(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dzd(tt7 tt7Var) {
        this(tt7Var, dsf.INVARIANT);
        if (tt7Var != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
