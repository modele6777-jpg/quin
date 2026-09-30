package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class if7 extends hjd implements vd7 {
    public static final g04 V0 = new g04();
    public static final g04 W0 = new g04();
    public hf7 T0;
    public final boolean U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if7(bm3 bm3Var, hjd hjdVar, h10 h10Var, t99 t99Var, int i, ntd ntdVar, boolean z) {
        super(bm3Var, hjdVar, h10Var, t99Var, i, ntdVar);
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
        this.T0 = null;
        this.U0 = z;
    }

    public static if7 R0(bm3 bm3Var, px7 px7Var, t99 t99Var, l8c l8cVar, boolean z) {
        if (bm3Var == null) {
            k0(5);
            throw null;
        }
        if (t99Var != null) {
            return new if7(bm3Var, null, px7Var, t99Var, 1, l8cVar, z);
        }
        k0(7);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "typeParameters";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "visibility";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "initialize";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.hjd, defpackage.e36
    public final e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        if (bm3Var == null) {
            k0(14);
            throw null;
        }
        if (i == 0) {
            k0(15);
            throw null;
        }
        if (h10Var == null) {
            k0(16);
            throw null;
        }
        hjd hjdVar = (hjd) c36Var;
        if (t99Var == null) {
            t99Var = getName();
        }
        if7 if7Var = new if7(bm3Var, hjdVar, h10Var, t99Var, i, ntdVar, this.U0);
        hf7 hf7Var = this.T0;
        if7Var.S0(hf7Var.isStable, hf7Var.isSynthesized);
        return if7Var;
    }

    @Override // defpackage.hjd
    public final hjd Q0(nw7 nw7Var, nw7 nw7Var2, List list, List list2, List list3, tt7 tt7Var, e09 e09Var, rz3 rz3Var, Map map) {
        ny1 ny1Var;
        if (list == null) {
            k0(9);
            throw null;
        }
        if (list2 == null) {
            k0(10);
            throw null;
        }
        if (list3 == null) {
            k0(11);
            throw null;
        }
        if (rz3Var == null) {
            k0(12);
            throw null;
        }
        super.Q0(nw7Var, nw7Var2, list, list2, list3, tt7Var, e09Var, rz3Var, map);
        for (uy1 uy1Var : sr9.a) {
            rob robVar = uy1Var.b;
            t99 t99Var = uy1Var.a;
            if (t99Var == null || pa7.t(getName(), t99Var)) {
                if (robVar != null) {
                    String strB = getName().b();
                    strB.getClass();
                    if (!robVar.g(strB)) {
                        continue;
                    }
                }
                Collection collection = uy1Var.c;
                if (collection == null || collection.contains(getName())) {
                    for (ly1 ly1Var : uy1Var.e) {
                        if (ly1Var.b(this) != null) {
                            ny1Var = new ny1(false);
                            this.Y = ny1Var.a;
                            return this;
                        }
                    }
                    ny1Var = ((String) uy1Var.d.d(this)) != null ? new ny1(false) : ny1.c;
                    this.Y = ny1Var.a;
                    return this;
                }
            }
        }
        ny1Var = ny1.b;
        this.Y = ny1Var.a;
        return this;
    }

    public final void S0(boolean z, boolean z2) {
        hf7 hf7Var;
        if (z) {
            hf7Var = z2 ? hf7.d : hf7.b;
        } else {
            hf7Var = z2 ? hf7.c : hf7.a;
        }
        this.T0 = hf7Var;
    }

    @Override // defpackage.vd7
    public final vd7 g0(tt7 tt7Var, ArrayList arrayList, tt7 tt7Var2, iy9 iy9Var) {
        ArrayList arrayListO = xxb.o(arrayList, G(), this);
        nw7 nw7VarL = tt7Var == null ? null : af1.L(this, tt7Var, hj6.c);
        d36 d36VarJ0 = J0(q8f.b);
        d36VarJ0.g = arrayListO;
        d36VarJ0.y = tt7Var2;
        d36VarJ0.w = nw7VarL;
        d36VarJ0.E0 = true;
        d36VarJ0.Z = true;
        if7 if7Var = (if7) d36VarJ0.M0.G0(d36VarJ0);
        if (iy9Var != null) {
            g04 g04Var = (g04) iy9Var.d();
            Object objE = iy9Var.e();
            Map linkedHashMap = if7Var.S0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                if7Var.S0 = linkedHashMap;
            }
            linkedHashMap.put(g04Var, objE);
        }
        if (if7Var != null) {
            return if7Var;
        }
        k0(21);
        throw null;
    }

    @Override // defpackage.e36, defpackage.ca1
    public final boolean t() {
        return this.T0.isSynthesized;
    }
}
