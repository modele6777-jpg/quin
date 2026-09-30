package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d36 implements b36 {
    public boolean E0;
    public boolean F0;
    public List G0;
    public h10 H0;
    public boolean I0;
    public final LinkedHashMap J0;
    public Boolean K0;
    public boolean L0;
    public final /* synthetic */ e36 M0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public o8f a;
    public bm3 b;
    public e09 c;
    public rz3 d;
    public c36 e;
    public int f;
    public List g;
    public final List v;
    public nw7 w;
    public nw7 x;
    public tt7 y;
    public t99 z;

    public d36(e36 e36Var, o8f o8fVar, bm3 bm3Var, e09 e09Var, rz3 rz3Var, int i, List list, List list2, nw7 nw7Var, tt7 tt7Var) {
        if (o8fVar == null) {
            a(0);
            throw null;
        }
        if (bm3Var == null) {
            a(1);
            throw null;
        }
        if (e09Var == null) {
            a(2);
            throw null;
        }
        if (rz3Var == null) {
            a(3);
            throw null;
        }
        if (i == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (tt7Var == null) {
            a(7);
            throw null;
        }
        this.M0 = e36Var;
        this.e = null;
        this.x = e36Var.y;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.E0 = false;
        this.F0 = e36Var.I0;
        this.G0 = null;
        this.H0 = null;
        this.I0 = e36Var.J0;
        this.J0 = new LinkedHashMap();
        this.K0 = null;
        this.L0 = false;
        this.a = o8fVar;
        this.b = bm3Var;
        this.c = e09Var;
        this.d = rz3Var;
        this.f = i;
        this.g = list;
        this.v = list2;
        this.w = nw7Var;
        this.y = tt7Var;
        this.z = null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "modality";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "setModality";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "setModality";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.b36
    public final b36 A(t99 t99Var) {
        this.z = t99Var;
        return this;
    }

    @Override // defpackage.b36
    public final b36 C() {
        this.Y = true;
        return this;
    }

    @Override // defpackage.b36
    public final b36 b(List list) {
        this.g = list;
        return this;
    }

    @Override // defpackage.b36
    public final c36 build() {
        return this.M0.G0(this);
    }

    @Override // defpackage.b36
    public final b36 d(int i) {
        if (i != 0) {
            this.f = i;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // defpackage.b36
    public final b36 f(nw7 nw7Var) {
        this.x = nw7Var;
        return this;
    }

    @Override // defpackage.b36
    public final b36 g() {
        this.Z = true;
        return this;
    }

    @Override // defpackage.b36
    public final b36 m() {
        this.J0.put(if7.W0, Boolean.TRUE);
        return this;
    }

    @Override // defpackage.b36
    public final b36 n() {
        this.I0 = true;
        return this;
    }

    @Override // defpackage.b36
    public final b36 p(h10 h10Var) {
        if (h10Var != null) {
            this.H0 = h10Var;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // defpackage.b36
    public final b36 q(rz3 rz3Var) {
        if (rz3Var != null) {
            this.d = rz3Var;
            return this;
        }
        a(12);
        throw null;
    }

    @Override // defpackage.b36
    public final b36 r() {
        this.X = false;
        return this;
    }

    @Override // defpackage.b36
    public final b36 s(e09 e09Var) {
        if (e09Var != null) {
            this.c = e09Var;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // defpackage.b36
    public final b36 t() {
        this.G0 = pu4.a;
        return this;
    }

    @Override // defpackage.b36
    public final b36 u(tt7 tt7Var) {
        if (tt7Var != null) {
            this.y = tt7Var;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // defpackage.b36
    public final b36 y() {
        this.F0 = true;
        return this;
    }

    @Override // defpackage.b36
    public final b36 z(bm3 bm3Var) {
        this.b = bm3Var;
        return this;
    }
}
