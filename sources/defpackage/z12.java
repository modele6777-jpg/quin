package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class z12 extends e36 implements ul2 {
    public final boolean T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z12(u09 u09Var, ul2 ul2Var, h10 h10Var, boolean z, int i, ntd ntdVar) {
        super(i, h10Var, u09Var, ul2Var, sud.e, ntdVar);
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
        this.T0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 14:
                objArr[0] = "visibility";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.e36, defpackage.ea1
    public final ea1 C(bm3 bm3Var, e09 e09Var, rz3 rz3Var) {
        return (z12) D0(bm3Var, e09Var, rz3Var);
    }

    @Override // defpackage.e36, defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.z(this, obj);
    }

    @Override // defpackage.e36
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public z12 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        if (bm3Var == null) {
            k0(23);
            throw null;
        }
        if (i == 0) {
            k0(24);
            throw null;
        }
        if (h10Var == null) {
            k0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new z12((u09) bm3Var, this, h10Var, this.T0, 1, ntdVar);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(bm3Var);
        String strZ = ks0.z(i);
        sb.append("\nkind: ");
        sb.append(strZ);
        throw new IllegalStateException(sb.toString());
    }

    public final u09 O0() {
        u09 u09VarK = k();
        if (u09VarK != null) {
            return u09VarK;
        }
        k0(18);
        throw null;
    }

    @Override // defpackage.em3, defpackage.bm3
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final u09 k() {
        u09 u09Var = (u09) super.k();
        if (u09Var != null) {
            return u09Var;
        }
        k0(17);
        throw null;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final z12 a() {
        z12 z12Var = (z12) super.a();
        if (z12Var != null) {
            return z12Var;
        }
        k0(19);
        throw null;
    }

    public final void R0(List list, rz3 rz3Var) {
        if (list == null) {
            k0(13);
            throw null;
        }
        if (rz3Var != null) {
            S0(list, rz3Var, k().h0());
        } else {
            k0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void S0(List list, rz3 rz3Var, List list2) {
        nw7 nw7VarI0;
        List listV;
        if (list == null) {
            k0(10);
            throw null;
        }
        if (rz3Var == null) {
            k0(11);
            throw null;
        }
        if (list2 == null) {
            k0(12);
            throw null;
        }
        u09 u09VarK = k();
        if (u09VarK.j()) {
            bm3 bm3VarK = u09VarK.k();
            if (bm3VarK instanceof u09) {
                nw7VarI0 = ((u09) bm3VarK).i0();
            } else {
                nw7VarI0 = null;
            }
        } else {
            nw7VarI0 = null;
        }
        u09 u09VarK2 = k();
        if (u09VarK2.v().isEmpty()) {
            listV = Collections.EMPTY_LIST;
            if (listV == null) {
                k0(16);
                throw null;
            }
        } else {
            listV = u09VarK2.v();
            if (listV == null) {
                k0(15);
                throw null;
            }
        }
        I0(null, nw7VarI0, listV, list2, list, null, e09.b, rz3Var);
    }

    @Override // defpackage.e36, defpackage.v7e
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final z12 d(q8f q8fVar) {
        if (q8fVar != null) {
            return (z12) super.d(q8fVar);
        }
        k0(20);
        throw null;
    }

    @Override // defpackage.e36, defpackage.ea1
    public final void Y(Collection collection) {
        if (collection != null) {
            return;
        }
        k0(22);
        throw null;
    }

    @Override // defpackage.e36, defpackage.ea1, defpackage.ca1
    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        k0(21);
        throw null;
    }
}
