package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class csf extends em3 implements bsf {
    public tt7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csf(bm3 bm3Var, h10 h10Var, t99 t99Var, tt7 tt7Var, ntd ntdVar) {
        super(bm3Var, h10Var, t99Var, ntdVar);
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
        this.f = tt7Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.ca1
    public final List G() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(6);
        throw null;
    }

    @Override // defpackage.ca1
    public nw7 O() {
        return null;
    }

    @Override // defpackage.ca1
    public List T() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(9);
        throw null;
    }

    @Override // defpackage.ca1
    public tt7 getReturnType() {
        tt7 type = getType();
        if (type != null) {
            return type;
        }
        k0(10);
        throw null;
    }

    @Override // defpackage.m4, defpackage.ejb, defpackage.prf
    public final tt7 getType() {
        tt7 tt7Var = this.f;
        if (tt7Var != null) {
            return tt7Var;
        }
        k0(4);
        throw null;
    }

    @Override // defpackage.ca1
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(8);
        throw null;
    }

    @Override // defpackage.ca1
    public boolean t() {
        return false;
    }
}
