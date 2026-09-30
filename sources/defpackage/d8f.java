package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d8f extends p5 {
    public boolean X;
    public final ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8f(int i, h10 h10Var, bm3 bm3Var, ge8 ge8Var, t99 t99Var, dsf dsfVar, boolean z) {
        super(i, h10Var, bm3Var, ge8Var, t99Var, dsfVar, z);
        if (bm3Var == null) {
            k0(19);
            throw null;
        }
        if (h10Var == null) {
            k0(20);
            throw null;
        }
        if (dsfVar == null) {
            k0(21);
            throw null;
        }
        if (t99Var == null) {
            k0(22);
            throw null;
        }
        if (ge8Var == null) {
            k0(25);
            throw null;
        }
        this.z = new ArrayList(1);
        this.X = false;
    }

    public static d8f F0(int i, h10 h10Var, bm3 bm3Var, ge8 ge8Var, t99 t99Var, dsf dsfVar, boolean z) {
        if (bm3Var == null) {
            k0(6);
            throw null;
        }
        if (h10Var == null) {
            k0(7);
            throw null;
        }
        if (dsfVar == null) {
            k0(8);
            throw null;
        }
        if (t99Var == null) {
            k0(9);
            throw null;
        }
        if (ge8Var != null) {
            return new d8f(i, h10Var, bm3Var, ge8Var, t99Var, dsfVar, z);
        }
        k0(11);
        throw null;
    }

    public static d8f G0(i0 i0Var, dsf dsfVar, t99 t99Var, int i, ge8 ge8Var) {
        g10 g10Var = hj6.c;
        if (ge8Var == null) {
            k0(4);
            throw null;
        }
        d8f d8fVarF0 = F0(i, g10Var, i0Var, ge8Var, t99Var, dsfVar, false);
        tjd tjdVarN = qz3.e(i0Var).n();
        if (d8fVarF0.X) {
            qc0.p("Type parameter descriptor is already initialized: ".concat(d8fVarF0.H0()));
            return null;
        }
        if (!i7h.x(tjdVarN)) {
            d8fVarF0.z.add(tjdVarN);
        }
        if (d8fVarF0.X) {
            qc0.p("Type parameter descriptor is already initialized: ".concat(d8fVarF0.H0()));
            return null;
        }
        d8fVarF0.X = true;
        return d8fVarF0;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.p5
    public final List E0() {
        if (!this.X) {
            qc0.p("Type parameter descriptor is not initialized: ".concat(H0()));
            return null;
        }
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            return arrayList;
        }
        k0(28);
        throw null;
    }

    public final String H0() {
        return getName() + " declared in " + oz3.f(k());
    }
}
