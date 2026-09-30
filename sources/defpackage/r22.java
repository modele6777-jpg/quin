package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r22 extends j0 {
    public final u09 c;
    public final List d;
    public final Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r22(u09 u09Var, List list, Collection collection, ge8 ge8Var) {
        super(ge8Var);
        if (list == null) {
            i(1);
            throw null;
        }
        if (collection == null) {
            i(2);
            throw null;
        }
        if (ge8Var == null) {
            i(3);
            throw null;
        }
        this.c = u09Var;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void i(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.m5
    public final Collection a() {
        Collection collection = this.e;
        if (collection != null) {
            return collection;
        }
        i(6);
        throw null;
    }

    @Override // defpackage.m5
    public final m8c c() {
        return m8c.e;
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        i(4);
        throw null;
    }

    @Override // defpackage.j0
    /* JADX INFO: renamed from: j */
    public final u09 m() {
        u09 u09Var = this.c;
        if (u09Var != null) {
            return u09Var;
        }
        i(5);
        throw null;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return oz3.f(this.c).a;
    }
}
