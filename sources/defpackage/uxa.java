package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uxa extends em3 implements c36 {
    public c36 X;
    public boolean f;
    public final boolean g;
    public final e09 v;
    public final wxa w;
    public final boolean x;
    public final int y;
    public rz3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxa(e09 e09Var, rz3 rz3Var, wxa wxaVar, h10 h10Var, t99 t99Var, boolean z, boolean z2, boolean z3, int i, ntd ntdVar) {
        super(wxaVar.k(), h10Var, t99Var, ntdVar);
        if (e09Var == null) {
            k0(0);
            throw null;
        }
        if (rz3Var == null) {
            k0(1);
            throw null;
        }
        if (h10Var == null) {
            k0(3);
            throw null;
        }
        if (ntdVar == null) {
            k0(5);
            throw null;
        }
        this.X = null;
        this.v = e09Var;
        this.z = rz3Var;
        this.w = wxaVar;
        this.f = z;
        this.g = z2;
        this.x = z3;
        this.y = i;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getModality";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getVisibility";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.ea1
    public final ea1 C(bm3 bm3Var, e09 e09Var, rz3 rz3Var) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public final ArrayList D0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (wxa wxaVar : this.w.l()) {
            v7e v7eVarB = z ? wxaVar.b() : wxaVar.c();
            if (v7eVarB != null) {
                arrayList.add(v7eVarB);
            }
        }
        return arrayList;
    }

    @Override // defpackage.c36
    public final c36 J() {
        return this.X;
    }

    @Override // defpackage.ca1
    public final nw7 K() {
        return this.w.K();
    }

    @Override // defpackage.ca1
    public final nw7 O() {
        return this.w.O();
    }

    @Override // defpackage.ca1
    public final List T() {
        List listT = this.w.T();
        if (listT != null) {
            return listT;
        }
        k0(14);
        throw null;
    }

    @Override // defpackage.c36
    public final boolean X() {
        return false;
    }

    @Override // defpackage.ea1
    public final void Y(Collection collection) {
        if (collection != null) {
            return;
        }
        k0(16);
        throw null;
    }

    @Override // defpackage.c36
    public final boolean b0() {
        return false;
    }

    @Override // defpackage.c36, defpackage.v7e
    public final c36 d(q8f q8fVar) {
        if (q8fVar != null) {
            return this;
        }
        k0(7);
        throw null;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.ea1
    public final int g() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        k0(6);
        throw null;
    }

    @Override // defpackage.ca1
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(9);
        throw null;
    }

    @Override // defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = this.z;
        if (rz3Var != null) {
            return rz3Var;
        }
        k0(11);
        throw null;
    }

    @Override // defpackage.tq8
    public final e09 i() {
        e09 e09Var = this.v;
        if (e09Var != null) {
            return e09Var;
        }
        k0(10);
        throw null;
    }

    @Override // defpackage.tq8
    public final boolean isExternal() {
        return this.g;
    }

    @Override // defpackage.c36
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.c36
    public final boolean isInline() {
        return this.x;
    }

    @Override // defpackage.c36
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.c36
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.ca1
    public final Object o(g04 g04Var) {
        return null;
    }

    @Override // defpackage.ca1
    public final boolean t() {
        return false;
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }

    @Override // defpackage.c36
    public final boolean z() {
        return false;
    }

    @Override // defpackage.v7e
    public final /* bridge */ /* synthetic */ dm3 d(q8f q8fVar) {
        d(q8fVar);
        return this;
    }
}
