package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qx4 extends d22 {
    public final r22 g;
    public final px4 v;
    public final xg9 w;
    public final h10 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx4(ge8 ge8Var, u09 u09Var, tjd tjdVar, t99 t99Var, xg9 xg9Var, h10 h10Var, ntd ntdVar) {
        super(ge8Var, u09Var, t99Var, ntdVar);
        if (ge8Var == null) {
            s0(6);
            throw null;
        }
        if (u09Var == null) {
            s0(7);
            throw null;
        }
        if (tjdVar == null) {
            s0(8);
            throw null;
        }
        if (xg9Var == null) {
            s0(10);
            throw null;
        }
        this.x = h10Var;
        this.g = new r22(this, Collections.EMPTY_LIST, Collections.singleton(tjdVar), ge8Var);
        this.v = new px4(this, ge8Var);
        this.w = xg9Var;
    }

    public static /* synthetic */ void s0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "annotations";
                break;
            case 5:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "<init>";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static qx4 u0(ge8 ge8Var, u09 u09Var, t99 t99Var, ee8 ee8Var, h10 h10Var, ntd ntdVar) {
        if (ge8Var == null) {
            s0(0);
            throw null;
        }
        if (u09Var == null) {
            s0(1);
            throw null;
        }
        if (ee8Var != null) {
            return new qx4(ge8Var, u09Var, u09Var.S(), t99Var, ee8Var, h10Var, ntdVar);
        }
        s0(3);
        throw null;
    }

    @Override // defpackage.u09
    public final l22 E() {
        return l22.ENUM_ENTRY;
    }

    @Override // defpackage.u09
    public final dr8 c0() {
        return cr8.b;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        h10 h10Var = this.x;
        if (h10Var != null) {
            return h10Var;
        }
        s0(21);
        throw null;
    }

    @Override // defpackage.u09, defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = sz3.e;
        if (rz3Var != null) {
            return rz3Var;
        }
        s0(20);
        throw null;
    }

    @Override // defpackage.y22
    public final j7f h() {
        r22 r22Var = this.g;
        if (r22Var != null) {
            return r22Var;
        }
        s0(17);
        throw null;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(22);
        throw null;
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        return e09.b;
    }

    @Override // defpackage.u09
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.z22
    public final boolean j() {
        return false;
    }

    @Override // defpackage.u09
    public final dr8 l0(zt7 zt7Var) {
        px4 px4Var = this.v;
        if (px4Var != null) {
            return px4Var;
        }
        s0(14);
        throw null;
    }

    @Override // defpackage.u09
    public final z12 m0() {
        return null;
    }

    @Override // defpackage.u09
    public final orf n0() {
        return null;
    }

    @Override // defpackage.u09
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.u09
    public final Collection p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(16);
        throw null;
    }

    @Override // defpackage.u09
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }
}
