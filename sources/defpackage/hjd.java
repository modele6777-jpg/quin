package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class hjd extends e36 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjd(bm3 bm3Var, hjd hjdVar, h10 h10Var, t99 t99Var, int i, ntd ntdVar) {
        super(i, h10Var, bm3Var, hjdVar, t99Var, ntdVar);
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
        if (i == 0) {
            k0(3);
            throw null;
        }
        if (ntdVar != null) {
        } else {
            k0(4);
            throw null;
        }
    }

    public static hjd N0(bm3 bm3Var, t99 t99Var, int i, ntd ntdVar) {
        g10 g10Var = hj6.c;
        if (t99Var == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (ntdVar != null) {
            return new hjd(bm3Var, null, g10Var, t99Var, i, ntdVar);
        }
        k0(9);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.e36
    public e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        if (bm3Var == null) {
            k0(25);
            throw null;
        }
        if (i == 0) {
            k0(26);
            throw null;
        }
        if (h10Var == null) {
            k0(27);
            throw null;
        }
        hjd hjdVar = (hjd) c36Var;
        if (t99Var == null) {
            t99Var = getName();
        }
        return new hjd(bm3Var, hjdVar, h10Var, t99Var, i, ntdVar);
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final hjd a() {
        hjd hjdVar = (hjd) super.a();
        if (hjdVar != null) {
            return hjdVar;
        }
        k0(24);
        throw null;
    }

    @Override // defpackage.e36
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final hjd I0(nw7 nw7Var, nw7 nw7Var2, List list, List list2, List list3, tt7 tt7Var, e09 e09Var, rz3 rz3Var) {
        if (list == null) {
            k0(14);
            throw null;
        }
        if (list2 == null) {
            k0(15);
            throw null;
        }
        if (list3 == null) {
            k0(16);
            throw null;
        }
        if (rz3Var != null) {
            return Q0(nw7Var, nw7Var2, list, list2, list3, tt7Var, e09Var, rz3Var, null);
        }
        k0(17);
        throw null;
    }

    public hjd Q0(nw7 nw7Var, nw7 nw7Var2, List list, List list2, List list3, tt7 tt7Var, e09 e09Var, rz3 rz3Var, Map map) {
        if (list == null) {
            k0(19);
            throw null;
        }
        if (list2 == null) {
            k0(20);
            throw null;
        }
        if (list3 == null) {
            k0(21);
            throw null;
        }
        if (rz3Var == null) {
            k0(22);
            throw null;
        }
        super.I0(nw7Var, nw7Var2, list, list2, list3, tt7Var, e09Var, rz3Var);
        if (map != null && !map.isEmpty()) {
            this.S0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // defpackage.e36, defpackage.c36
    public b36 d0() {
        return J0(q8f.b);
    }
}
