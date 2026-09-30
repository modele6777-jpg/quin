package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zxa extends uxa {
    public tt7 Y;
    public final zxa Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxa(wxa wxaVar, h10 h10Var, e09 e09Var, rz3 rz3Var, boolean z, boolean z2, boolean z3, int i, zxa zxaVar, ntd ntdVar) {
        super(e09Var, rz3Var, wxaVar, h10Var, t99.g("<get-" + wxaVar.getName() + ">"), z, z2, z3, i, ntdVar);
        if (h10Var == null) {
            k0(1);
            throw null;
        }
        if (e09Var == null) {
            k0(2);
            throw null;
        }
        if (rz3Var == null) {
            k0(3);
            throw null;
        }
        if (i == 0) {
            k0(4);
            throw null;
        }
        if (ntdVar == null) {
            k0(5);
            throw null;
        }
        this.Z = zxaVar != null ? zxaVar : this;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.c(this, obj);
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final zxa a() {
        zxa zxaVar = this.Z;
        if (zxaVar != null) {
            return zxaVar;
        }
        k0(8);
        throw null;
    }

    public final void F0(tt7 tt7Var) {
        if (tt7Var == null) {
            tt7Var = this.w.getType();
        }
        this.Y = tt7Var;
    }

    @Override // defpackage.ca1
    public final List G() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(7);
        throw null;
    }

    @Override // defpackage.ca1
    public final tt7 getReturnType() {
        return this.Y;
    }

    @Override // defpackage.ea1, defpackage.ca1
    public final Collection l() {
        return D0(true);
    }
}
