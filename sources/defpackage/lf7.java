package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class lf7 extends yxa implements vd7 {
    public final boolean Q0;
    public final iy9 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf7(bm3 bm3Var, h10 h10Var, e09 e09Var, rz3 rz3Var, boolean z, t99 t99Var, ntd ntdVar, wxa wxaVar, int i, boolean z2, iy9 iy9Var) {
        super(bm3Var, wxaVar, h10Var, e09Var, rz3Var, z, t99Var, i, ntdVar, false, false, false, false, false);
        if (bm3Var == null) {
            k0(0);
            throw null;
        }
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
        if (t99Var == null) {
            k0(4);
            throw null;
        }
        if (ntdVar == null) {
            k0(5);
            throw null;
        }
        if (i == 0) {
            k0(6);
            throw null;
        }
        this.Q0 = z2;
        this.R0 = iy9Var;
    }

    public static lf7 L0(bm3 bm3Var, px7 px7Var, rz3 rz3Var, boolean z, t99 t99Var, l8c l8cVar, boolean z2) {
        if (bm3Var == null) {
            k0(7);
            throw null;
        }
        if (t99Var != null) {
            return new lf7(bm3Var, px7Var, e09.b, rz3Var, z, t99Var, l8cVar, null, 1, z2, null);
        }
        k0(11);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "visibility";
                break;
            case 4:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "name";
                break;
            case 5:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "create";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.yxa
    public final yxa F0(bm3 bm3Var, e09 e09Var, rz3 rz3Var, wxa wxaVar, int i, t99 t99Var) {
        if (bm3Var == null) {
            k0(13);
            throw null;
        }
        if (e09Var == null) {
            k0(14);
            throw null;
        }
        if (rz3Var == null) {
            k0(15);
            throw null;
        }
        if (i == 0) {
            k0(16);
            throw null;
        }
        if (t99Var == null) {
            k0(17);
            throw null;
        }
        return new lf7(bm3Var, getAnnotations(), e09Var, rz3Var, this.g, t99Var, ntd.T, wxaVar, i, this.Q0, this.R0);
    }

    @Override // defpackage.vd7
    public final vd7 g0(tt7 tt7Var, ArrayList arrayList, tt7 tt7Var2, iy9 iy9Var) {
        tt7 tt7Var3;
        zxa zxaVar;
        dya dyaVar;
        wxa wxaVarA = a() == this ? null : a();
        lf7 lf7Var = new lf7(k(), getAnnotations(), i(), getVisibility(), this.g, getName(), e(), wxaVarA, g(), this.Q0, iy9Var);
        zxa zxaVar2 = this.M0;
        if (zxaVar2 != null) {
            zxa zxaVar3 = new zxa(lf7Var, zxaVar2.getAnnotations(), zxaVar2.i(), zxaVar2.getVisibility(), zxaVar2.f, zxaVar2.g, zxaVar2.x, g(), wxaVarA == null ? null : wxaVarA.b(), zxaVar2.e());
            zxaVar3.X = zxaVar2.X;
            tt7Var3 = tt7Var2;
            zxaVar3.Y = tt7Var3;
            zxaVar = zxaVar3;
        } else {
            tt7Var3 = tt7Var2;
            zxaVar = null;
        }
        dya dyaVar2 = this.N0;
        if (dyaVar2 != null) {
            dyaVar = new dya(lf7Var, dyaVar2.getAnnotations(), dyaVar2.i(), dyaVar2.getVisibility(), dyaVar2.f, dyaVar2.g, dyaVar2.x, g(), wxaVarA == null ? null : wxaVarA.c(), dyaVar2.e());
            dyaVar.X = dyaVar.X;
            xrf xrfVar = (xrf) dyaVar2.G().get(0);
            if (xrfVar == null) {
                dya.k0(6);
                throw null;
            }
            dyaVar.Y = xrfVar;
        } else {
            dyaVar = null;
        }
        lf7Var.H0(zxaVar, dyaVar, this.O0, this.P0);
        x16 x16Var = this.w;
        if (x16Var != null) {
            lf7Var.I0(this.v, x16Var);
        }
        lf7Var.Y(l());
        lf7Var.K0(tt7Var3, getTypeParameters(), this.J0, tt7Var != null ? af1.L(this, tt7Var, hj6.c) : null, pu4.a);
        return lf7Var;
    }

    @Override // defpackage.yxa, defpackage.ca1
    public final Object o(g04 g04Var) {
        iy9 iy9Var = this.R0;
        if (iy9Var == null || !((g04) iy9Var.d()).equals(g04Var)) {
            return null;
        }
        return iy9Var.e();
    }

    @Override // defpackage.yxa, defpackage.bsf
    public final boolean q() {
        tt7 type = getType();
        if (!this.Q0) {
            return false;
        }
        type.getClass();
        if (((!xr7.G(type) && !egf.a(type)) || w8f.e(type)) && !xr7.H(type)) {
            return false;
        }
        j10 j10Var = s7f.a;
        dx5 dx5Var = pj7.q;
        dx5Var.getClass();
        return !db6.X(type, dx5Var) || xr7.H(type);
    }

    @Override // defpackage.csf, defpackage.ca1
    public final boolean t() {
        return false;
    }

    @Override // defpackage.yxa
    public final void J0(tt7 tt7Var) {
    }
}
