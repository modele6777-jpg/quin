package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wd7 extends z12 implements vd7 {
    public Boolean U0;
    public Boolean V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd7(u09 u09Var, wd7 wd7Var, h10 h10Var, boolean z, int i, ntd ntdVar) {
        super(u09Var, wd7Var, h10Var, z, i, ntdVar);
        if (u09Var == null) {
            k0(0);
            throw null;
        }
        if (h10Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (ntdVar == null) {
            k0(3);
            throw null;
        }
        this.U0 = null;
        this.V0 = null;
    }

    public static wd7 U0(u09 u09Var, h10 h10Var, boolean z, l8c l8cVar) {
        if (u09Var != null) {
            return new wd7(u09Var, null, h10Var, z, 1, l8cVar);
        }
        k0(4);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "newOwner";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 18:
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.z12, defpackage.e36
    public final /* bridge */ /* synthetic */ e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        return V0(bm3Var, c36Var, i, h10Var, ntdVar);
    }

    @Override // defpackage.e36
    public final void K0(boolean z) {
        this.U0 = Boolean.valueOf(z);
    }

    @Override // defpackage.e36
    public final void L0(boolean z) {
        this.V0 = Boolean.valueOf(z);
    }

    @Override // defpackage.z12
    /* JADX INFO: renamed from: N0 */
    public final /* bridge */ /* synthetic */ z12 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        return V0(bm3Var, c36Var, i, h10Var, ntdVar);
    }

    public final wd7 V0(bm3 bm3Var, c36 c36Var, int i, h10 h10Var, ntd ntdVar) {
        if (bm3Var == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (h10Var == null) {
            k0(9);
            throw null;
        }
        if (ntdVar == null) {
            k0(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(bm3Var);
            String strZ = ks0.z(i);
            sb.append("\nkind: ");
            sb.append(strZ);
            throw new IllegalStateException(sb.toString());
        }
        u09 u09Var = (u09) bm3Var;
        wd7 wd7Var = (wd7) c36Var;
        if (i == 0) {
            k0(13);
            throw null;
        }
        wd7 wd7Var2 = new wd7(u09Var, wd7Var, h10Var, this.T0, i, ntdVar);
        Boolean bool = this.U0;
        bool.getClass();
        wd7Var2.U0 = bool;
        Boolean bool2 = this.V0;
        bool2.getClass();
        wd7Var2.V0 = bool2;
        return wd7Var2;
    }

    @Override // defpackage.vd7
    public final vd7 g0(tt7 tt7Var, ArrayList arrayList, tt7 tt7Var2, iy9 iy9Var) {
        wd7 wd7VarV0 = V0(k(), null, g(), getAnnotations(), e());
        wd7VarV0.I0(tt7Var == null ? null : af1.L(wd7VarV0, tt7Var, hj6.c), this.y, pu4.a, getTypeParameters(), xxb.o(arrayList, G(), wd7VarV0), tt7Var2, i(), getVisibility());
        if (iy9Var != null) {
            g04 g04Var = (g04) iy9Var.d();
            Object objE = iy9Var.e();
            Map linkedHashMap = wd7VarV0.S0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                wd7VarV0.S0 = linkedHashMap;
            }
            linkedHashMap.put(g04Var, objE);
        }
        return wd7VarV0;
    }

    @Override // defpackage.e36, defpackage.ca1
    public final boolean t() {
        return this.V0.booleanValue();
    }
}
