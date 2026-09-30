package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nw7 extends cm3 implements zy9 {
    public final /* synthetic */ int d = 1;
    public final bm3 e;
    public final ejb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw7(bm3 bm3Var, m4 m4Var, h10 h10Var, t99 t99Var) {
        super(h10Var, t99Var);
        if (bm3Var == null) {
            k0(3);
            throw null;
        }
        if (h10Var == null) {
            k0(5);
            throw null;
        }
        if (t99Var == null) {
            k0(6);
            throw null;
        }
        this.e = bm3Var;
        this.f = m4Var;
    }

    public static /* synthetic */ void C0(int i) {
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
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
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
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getOriginal";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
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
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.g(this, obj);
    }

    public final ejb D0() {
        int i = this.d;
        ejb ejbVar = this.f;
        switch (i) {
            case 0:
                return (xy6) ejbVar;
            default:
                m4 m4Var = (m4) ejbVar;
                if (m4Var != null) {
                    return m4Var;
                }
                k0(7);
                throw null;
        }
    }

    @Override // defpackage.v7e
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final nw7 d(q8f q8fVar) {
        if (q8fVar == null) {
            C0(3);
            throw null;
        }
        if (!q8fVar.a.e()) {
            tt7 tt7VarH = k() instanceof u09 ? q8fVar.h(getType(), dsf.OUT_VARIANCE) : q8fVar.h(getType(), dsf.INVARIANT);
            if (tt7VarH == null) {
                return null;
            }
            if (tt7VarH != getType()) {
                return new nw7(k(), new d3f(tt7VarH), getAnnotations());
            }
        }
        return this;
    }

    @Override // defpackage.ca1
    public final List G() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        C0(7);
        throw null;
    }

    @Override // defpackage.ca1
    public final nw7 O() {
        return null;
    }

    @Override // defpackage.dm3
    public final ntd e() {
        return ntd.T;
    }

    @Override // defpackage.ca1
    public final tt7 getReturnType() {
        return getType();
    }

    @Override // defpackage.m4, defpackage.ejb, defpackage.prf
    public final tt7 getType() {
        tt7 type = D0().getType();
        if (type != null) {
            return type;
        }
        C0(6);
        throw null;
    }

    @Override // defpackage.ca1
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        C0(5);
        throw null;
    }

    @Override // defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = sz3.f;
        if (rz3Var != null) {
            return rz3Var;
        }
        C0(9);
        throw null;
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        int i = this.d;
        bm3 bm3Var = this.e;
        switch (i) {
            case 0:
                return (u09) bm3Var;
            default:
                if (bm3Var != null) {
                    return bm3Var;
                }
                k0(8);
                throw null;
        }
    }

    @Override // defpackage.ca1
    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        C0(8);
        throw null;
    }

    @Override // defpackage.ca1
    public final boolean t() {
        return false;
    }

    @Override // defpackage.cm3, defpackage.m4
    public String toString() {
        switch (this.d) {
            case 0:
                return "class " + ((u09) this.e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.cm3, defpackage.bm3
    public final bm3 a() {
        return this;
    }

    @Override // defpackage.cm3, defpackage.bm3
    public final ca1 a() {
        return this;
    }

    public nw7(u09 u09Var) {
        super(hj6.c, sud.d);
        this.e = u09Var;
        this.f = new xy6(u09Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nw7(bm3 bm3Var, m4 m4Var, h10 h10Var) {
        this(bm3Var, m4Var, h10Var, sud.d);
        if (bm3Var == null) {
            k0(0);
            throw null;
        }
        if (h10Var != null) {
        } else {
            k0(2);
            throw null;
        }
    }
}
