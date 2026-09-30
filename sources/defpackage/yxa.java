package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class yxa extends csf implements wxa {
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public List I0;
    public nw7 J0;
    public nw7 K0;
    public ArrayList L0;
    public zxa M0;
    public dya N0;
    public sc5 O0;
    public sc5 P0;
    public final wxa X;
    public final int Y;
    public final boolean Z;
    public final boolean g;
    public de8 v;
    public x16 w;
    public final e09 x;
    public rz3 y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(bm3 bm3Var, wxa wxaVar, h10 h10Var, e09 e09Var, rz3 rz3Var, boolean z, t99 t99Var, int i, ntd ntdVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(bm3Var, h10Var, t99Var, null, ntdVar);
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
        if (i == 0) {
            k0(5);
            throw null;
        }
        if (ntdVar == null) {
            k0(6);
            throw null;
        }
        this.g = z;
        this.z = null;
        this.I0 = Collections.EMPTY_LIST;
        this.x = e09Var;
        this.y = rz3Var;
        this.X = wxaVar == null ? this : wxaVar;
        this.Y = i;
        this.Z = z2;
        this.E0 = z3;
        this.F0 = z4;
        this.G0 = z5;
        this.H0 = z6;
    }

    public static yxa E0(bm3 bm3Var, e09 e09Var, rz3 rz3Var, boolean z, t99 t99Var, int i, ntd ntdVar) {
        g10 g10Var = hj6.c;
        if (bm3Var == null) {
            k0(7);
            throw null;
        }
        if (rz3Var == null) {
            k0(10);
            throw null;
        }
        if (t99Var == null) {
            k0(11);
            throw null;
        }
        if (i == 0) {
            k0(12);
            throw null;
        }
        if (ntdVar != null) {
            return new yxa(bm3Var, null, g10Var, e09Var, rz3Var, z, t99Var, i, ntdVar, false, false, false, false, false);
        }
        k0(13);
        throw null;
    }

    public static c36 G0(q8f q8fVar, uxa uxaVar) {
        if (uxaVar == null) {
            k0(31);
            throw null;
        }
        c36 c36Var = uxaVar.X;
        if (c36Var != null) {
            return c36Var.d(q8fVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "name";
                break;
            case 5:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bsf
    public final bl2 B() {
        de8 de8Var = this.v;
        if (de8Var != null) {
            return (bl2) de8Var.invoke();
        }
        return null;
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.s(this, obj);
    }

    @Override // defpackage.ea1
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final yxa C(bm3 bm3Var, e09 e09Var, rz3 rz3Var) {
        xxa xxaVar = new xxa(this);
        xxaVar.a = bm3Var;
        xxaVar.d = null;
        xxaVar.b = e09Var;
        if (rz3Var != null) {
            xxaVar.c = rz3Var;
            xxaVar.e = 2;
            xxaVar.g = false;
            yxa yxaVarA = xxaVar.a();
            if (yxaVarA != null) {
                return yxaVarA;
            }
            k0(42);
            throw null;
        }
        Object[] objArr = new Object[3];
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "kind";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "setKind";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public yxa F0(bm3 bm3Var, e09 e09Var, rz3 rz3Var, wxa wxaVar, int i, t99 t99Var) {
        if (bm3Var == null) {
            k0(32);
            throw null;
        }
        if (e09Var == null) {
            k0(33);
            throw null;
        }
        if (rz3Var == null) {
            k0(34);
            throw null;
        }
        if (i == 0) {
            k0(35);
            throw null;
        }
        if (t99Var == null) {
            k0(36);
            throw null;
        }
        return new yxa(bm3Var, wxaVar, getAnnotations(), e09Var, rz3Var, this.g, t99Var, i, ntd.T, this.Z, q(), this.F0, isExternal(), this.H0);
    }

    public final void H0(zxa zxaVar, dya dyaVar, sc5 sc5Var, sc5 sc5Var2) {
        this.M0 = zxaVar;
        this.N0 = dyaVar;
        this.O0 = sc5Var;
        this.P0 = sc5Var2;
    }

    public final void I0(de8 de8Var, x16 x16Var) {
        if (x16Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.w = x16Var;
        if (de8Var == null) {
            de8Var = (de8) x16Var.invoke();
        }
        this.v = de8Var;
    }

    @Override // defpackage.ca1
    public final nw7 K() {
        return this.J0;
    }

    public final void K0(tt7 tt7Var, List list, nw7 nw7Var, nw7 nw7Var2, List list2) {
        if (tt7Var == null) {
            k0(17);
            throw null;
        }
        if (list == null) {
            k0(18);
            throw null;
        }
        if (list2 == null) {
            k0(19);
            throw null;
        }
        this.f = tt7Var;
        this.L0 = new ArrayList(list);
        this.K0 = nw7Var2;
        this.J0 = nw7Var;
        this.I0 = list2;
    }

    @Override // defpackage.bsf
    public final boolean N() {
        return this.g;
    }

    @Override // defpackage.csf, defpackage.ca1
    public final nw7 O() {
        return this.K0;
    }

    @Override // defpackage.wxa
    public final sc5 P() {
        return this.P0;
    }

    @Override // defpackage.wxa
    public final sc5 R() {
        return this.O0;
    }

    @Override // defpackage.csf, defpackage.ca1
    public final List T() {
        List list = this.I0;
        if (list != null) {
            return list;
        }
        k0(22);
        throw null;
    }

    @Override // defpackage.bsf
    public final boolean U() {
        return this.Z;
    }

    @Override // defpackage.ea1
    public final void Y(Collection collection) {
        if (collection != null) {
            this.z = collection;
        } else {
            k0(40);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [wxa] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final wxa a() {
        wxa wxaVarA;
        wxa wxaVar = this.X;
        ?? r1 = this;
        if (wxaVar != this) {
            wxaVarA = wxaVar.a();
        }
        if (r1 != 0) {
            r1 = wxaVarA;
            return r1;
        }
        r1 = wxaVarA;
        k0(38);
        throw null;
    }

    @Override // defpackage.wxa
    public final zxa b() {
        return this.M0;
    }

    @Override // defpackage.wxa
    public final dya c() {
        return this.N0;
    }

    @Override // defpackage.v7e
    public final wxa d(q8f q8fVar) {
        if (q8fVar == null) {
            k0(27);
            throw null;
        }
        o8f o8fVar = q8fVar.a;
        if (o8fVar.e()) {
            return this;
        }
        xxa xxaVar = new xxa(this);
        xxaVar.f = o8fVar;
        xxaVar.d = a();
        return xxaVar.a();
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.ea1
    public final int g() {
        int i = this.Y;
        if (i != 0) {
            return i;
        }
        k0(39);
        throw null;
    }

    @Override // defpackage.csf, defpackage.ca1
    public final tt7 getReturnType() {
        tt7 type = getType();
        if (type != null) {
            return type;
        }
        k0(23);
        throw null;
    }

    @Override // defpackage.csf, defpackage.ca1
    public final List getTypeParameters() {
        ArrayList arrayList = this.L0;
        if (arrayList != null) {
            return arrayList;
        }
        yg5.r(this, "typeParameters == null for ");
        return null;
    }

    @Override // defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = this.y;
        if (rz3Var != null) {
            return rz3Var;
        }
        k0(25);
        throw null;
    }

    @Override // defpackage.tq8
    public final e09 i() {
        e09 e09Var = this.x;
        if (e09Var != null) {
            return e09Var;
        }
        k0(24);
        throw null;
    }

    public boolean isExternal() {
        return this.G0;
    }

    @Override // defpackage.ca1
    public final Collection l() {
        Collection collection = this.z;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        k0(41);
        throw null;
    }

    @Override // defpackage.wxa
    public final ArrayList n() {
        ArrayList arrayList = new ArrayList(2);
        zxa zxaVar = this.M0;
        if (zxaVar != null) {
            arrayList.add(zxaVar);
        }
        dya dyaVar = this.N0;
        if (dyaVar != null) {
            arrayList.add(dyaVar);
        }
        return arrayList;
    }

    public Object o(g04 g04Var) {
        return null;
    }

    public boolean q() {
        return this.E0;
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return this.F0;
    }

    @Override // defpackage.wxa
    public final boolean y() {
        return this.H0;
    }

    public void J0(tt7 tt7Var) {
    }
}
