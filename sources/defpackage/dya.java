package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dya extends uxa {
    public xrf Y;
    public final dya Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(wxa wxaVar, h10 h10Var, e09 e09Var, rz3 rz3Var, boolean z, boolean z2, boolean z3, int i, dya dyaVar, ntd ntdVar) {
        super(e09Var, rz3Var, wxaVar, h10Var, t99.g("<set-" + wxaVar.getName() + ">"), z, z2, z3, i, ntdVar);
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
        this.Z = dyaVar != null ? dyaVar : this;
    }

    public static xrf E0(dya dyaVar, tt7 tt7Var, h10 h10Var) {
        if (tt7Var == null) {
            k0(8);
            throw null;
        }
        if (h10Var != null) {
            return new xrf(dyaVar, null, 0, h10Var, sud.g, tt7Var, false, false, false, null, ntd.T);
        }
        k0(9);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getValueParameters";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.m(this, obj);
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final dya a() {
        dya dyaVar = this.Z;
        if (dyaVar != null) {
            return dyaVar;
        }
        k0(13);
        throw null;
    }

    @Override // defpackage.ca1
    public final List G() {
        xrf xrfVar = this.Y;
        if (xrfVar == null) {
            r3.l();
            return null;
        }
        List listSingletonList = Collections.singletonList(xrfVar);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        k0(11);
        throw null;
    }

    @Override // defpackage.ca1
    public final tt7 getReturnType() {
        return qz3.e(this).x();
    }

    @Override // defpackage.ea1, defpackage.ca1
    public final Collection l() {
        return D0(false);
    }
}
