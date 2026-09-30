package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class f22 extends d22 {
    public final e09 g;
    public final l22 v;
    public final r22 w;
    public dr8 x;
    public Set y;
    public z12 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f22(bm3 bm3Var, t99 t99Var, e09 e09Var, l22 l22Var, Collection collection, ge8 ge8Var) {
        super(ge8Var, bm3Var, t99Var, ntd.T);
        if (bm3Var == null) {
            s0(0);
            throw null;
        }
        if (t99Var == null) {
            s0(1);
            throw null;
        }
        if (ge8Var == null) {
            s0(6);
            throw null;
        }
        this.g = e09Var;
        this.v = l22Var;
        this.w = new r22(this, Collections.EMPTY_LIST, collection, ge8Var);
    }

    public static /* synthetic */ void s0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getTypeConstructor";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getConstructors";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.u09
    public final l22 E() {
        l22 l22Var = this.v;
        if (l22Var != null) {
            return l22Var;
        }
        s0(15);
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
        rz3 rz3Var = sz3.e;
        if (rz3Var != null) {
            return rz3Var;
        }
        s0(17);
        throw null;
    }

    @Override // defpackage.y22
    public final j7f h() {
        r22 r22Var = this.w;
        if (r22Var != null) {
            return r22Var;
        }
        s0(10);
        throw null;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(18);
        throw null;
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        e09 e09Var = this.g;
        if (e09Var != null) {
            return e09Var;
        }
        s0(16);
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
        dr8 dr8Var = this.x;
        if (dr8Var != null) {
            return dr8Var;
        }
        s0(13);
        throw null;
    }

    @Override // defpackage.u09
    public final z12 m0() {
        return this.z;
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
        Set set = this.y;
        if (set != null) {
            return set;
        }
        s0(11);
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

    public String toString() {
        return "class " + getName();
    }

    public final void u0(dr8 dr8Var, Set set, z12 z12Var) {
        this.x = dr8Var;
        this.y = set;
        this.z = z12Var;
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }
}
