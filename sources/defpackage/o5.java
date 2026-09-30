package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o5 extends m5 {
    public final m8c c;
    public final /* synthetic */ p5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, ge8 ge8Var) {
        super(ge8Var);
        m8c m8cVar = m8c.e;
        if (ge8Var == null) {
            i(0);
            throw null;
        }
        this.d = p5Var;
        this.c = m8cVar;
    }

    public static /* synthetic */ void i(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.m5
    public final Collection a() {
        List listE0 = this.d.E0();
        if (listE0 != null) {
            return listE0;
        }
        i(1);
        throw null;
    }

    @Override // defpackage.m5
    public final tt7 b() {
        return sy4.c(qy4.e, new String[0]);
    }

    @Override // defpackage.m5
    public final m8c c() {
        m8c m8cVar = this.c;
        if (m8cVar != null) {
            return m8cVar;
        }
        i(5);
        throw null;
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        xr7 xr7VarE = qz3.e(this.d);
        if (xr7VarE != null) {
            return xr7VarE;
        }
        i(4);
        throw null;
    }

    @Override // defpackage.m5
    public final boolean g(y22 y22Var) {
        if (!(y22Var instanceof c8f)) {
            return false;
        }
        return hj6.F0.h(this.d, (c8f) y22Var, true, y.F0);
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i(2);
        throw null;
    }

    @Override // defpackage.m5
    public final List h(List list) {
        List listD0 = this.d.D0(list);
        if (listD0 != null) {
            return listD0;
        }
        i(8);
        throw null;
    }

    @Override // defpackage.j7f
    public final y22 m() {
        return this.d;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return this.d.getName().a;
    }
}
