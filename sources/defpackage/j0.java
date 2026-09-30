package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends m5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ge8 ge8Var) {
        super(ge8Var);
        if (ge8Var != null) {
        } else {
            i(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void i(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.m5
    public final tt7 b() {
        u09 u09VarM = m();
        if (u09VarM == null) {
            xr7.a(107);
            throw null;
        }
        t99 t99Var = xr7.e;
        if (xr7.b(u09VarM, syd.a) || xr7.b(u09VarM, syd.b)) {
            return null;
        }
        return f().e();
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        xr7 xr7VarE = qz3.e(m());
        if (xr7VarE != null) {
            return xr7VarE;
        }
        i(1);
        throw null;
    }

    @Override // defpackage.m5
    public final boolean g(y22 y22Var) {
        boolean z;
        if (y22Var instanceof u09) {
            u09 u09VarM = m();
            u09VarM.getClass();
            if (!pa7.t(u09VarM.getName(), y22Var.getName())) {
                z = false;
                break;
            }
            bm3 bm3VarK = u09VarM.k();
            bm3 bm3VarK2 = y22Var.k();
            while (true) {
                if (bm3VarK != null && bm3VarK2 != null) {
                    if (!(bm3VarK instanceof w09)) {
                        if (!(bm3VarK2 instanceof w09)) {
                            if (bm3VarK instanceof kw9) {
                                if (!(bm3VarK2 instanceof kw9) || !pa7.t(((lw9) ((kw9) bm3VarK)).f, ((lw9) ((kw9) bm3VarK2)).f)) {
                                    break;
                                }
                            } else if (!(bm3VarK2 instanceof kw9) && pa7.t(bm3VarK.getName(), bm3VarK2.getName())) {
                                bm3VarK = bm3VarK.k();
                                bm3VarK2 = bm3VarK2.k();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = bm3VarK2 instanceof w09;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.j7f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract u09 m();
}
