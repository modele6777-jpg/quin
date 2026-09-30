package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i69 extends d22 {
    public final ge8 X;
    public final l22 g;
    public e09 v;
    public rz3 w;
    public r22 x;
    public ArrayList y;
    public final ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i69(su4 su4Var, t99 t99Var, ge8 ge8Var) {
        super(ge8Var, su4Var, t99Var, ntd.T);
        if (ge8Var == null) {
            s0(4);
            throw null;
        }
        this.z = new ArrayList();
        this.X = ge8Var;
        this.g = l22.INTERFACE;
    }

    public static /* synthetic */ void s0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getVisibility";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getTypeConstructor";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.u09
    public final l22 E() {
        l22 l22Var = this.g;
        if (l22Var != null) {
            return l22Var;
        }
        s0(8);
        throw null;
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
        return hj6.c;
    }

    @Override // defpackage.u09, defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = this.w;
        if (rz3Var != null) {
            return rz3Var;
        }
        s0(10);
        throw null;
    }

    @Override // defpackage.y22
    public final j7f h() {
        r22 r22Var = this.x;
        if (r22Var != null) {
            return r22Var;
        }
        s0(11);
        throw null;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            return arrayList;
        }
        s0(15);
        throw null;
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        e09 e09Var = this.v;
        if (e09Var != null) {
            return e09Var;
        }
        s0(7);
        throw null;
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
        return cr8.b;
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
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        s0(13);
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
        return cm3.B0(this);
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }
}
