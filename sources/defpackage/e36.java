package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e36 extends em3 implements c36 {
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public Collection N0;
    public volatile n5 O0;
    public final c36 P0;
    public final int Q0;
    public c36 R0;
    public Map S0;
    public rz3 X;
    public boolean Y;
    public boolean Z;
    public List f;
    public List g;
    public tt7 v;
    public List w;
    public nw7 x;
    public nw7 y;
    public e09 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e36(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        super(bm3Var, h10Var, t99Var, ntdVar);
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
        if (ntdVar == null) {
            k0(4);
            throw null;
        }
        this.X = sz3.i;
        this.Y = false;
        this.Z = false;
        this.E0 = false;
        this.F0 = false;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.J0 = false;
        this.K0 = false;
        this.L0 = true;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.R0 = null;
        this.S0 = null;
        this.P0 = c36Var == null ? this : c36Var;
        this.Q0 = i;
    }

    public static ArrayList H0(c36 c36Var, List list, q8f q8fVar, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            k0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xrf xrfVar = (xrf) it.next();
            tt7 type = xrfVar.getType();
            dsf dsfVar = dsf.IN_VARIANCE;
            tt7 tt7VarH = q8fVar.h(type, dsfVar);
            tt7 tt7Var = xrfVar.y;
            tt7 tt7VarH2 = tt7Var == null ? null : q8fVar.h(tt7Var, dsfVar);
            if (tt7VarH == null) {
                return null;
            }
            if ((tt7VarH != xrfVar.getType() || tt7Var != tt7VarH2) && zArr != null) {
                zArr[0] = true;
            }
            e5 e5Var = xrfVar instanceof wrf ? new e5((List) ((wrf) xrfVar).X.getValue()) : null;
            xrf xrfVar2 = z ? null : xrfVar;
            int i = xrfVar.g;
            h10 annotations = xrfVar.getAnnotations();
            t99 name = xrfVar.getName();
            boolean zE0 = xrfVar.E0();
            boolean z3 = xrfVar.w;
            boolean z4 = xrfVar.x;
            ntd ntdVarE = z2 ? xrfVar.e() : ntd.T;
            annotations.getClass();
            name.getClass();
            ntdVarE.getClass();
            arrayList.add(e5Var == null ? new xrf(c36Var, xrfVar2, i, annotations, name, tt7VarH, zE0, z3, z4, tt7VarH2, ntdVarE) : new wrf(c36Var, xrfVar2, i, annotations, name, tt7VarH, zE0, z3, z4, tt7VarH2, ntdVarE, e5Var));
        }
        return arrayList;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "visibility";
                break;
            case 9:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "setVisibility";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "setReturnType";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.bm3
    public Object D(fm3 fm3Var, Object obj) {
        return fm3Var.t(this, obj);
    }

    public final c36 D0(bm3 bm3Var, e09 e09Var, rz3 rz3Var) {
        c36 c36VarBuild = d0().z(bm3Var).s(e09Var).q(rz3Var).d(2).r().build();
        if (c36VarBuild != null) {
            return c36VarBuild;
        }
        k0(26);
        throw null;
    }

    @Override // defpackage.ea1
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public hjd C(bm3 bm3Var, e09 e09Var, rz3 rz3Var) {
        return (hjd) D0(bm3Var, e09Var, rz3Var);
    }

    public abstract e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar);

    @Override // defpackage.ca1
    public final List G() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        k0(19);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0221  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:116:0x024b  */
    /* JADX WARN: Code duplicated, block: B:118:0x024e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0256  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    public e36 G0(d36 d36Var) {
        h10 annotations;
        char c;
        nw7 nw7Var;
        nw7 nw7Var2;
        nw7 nw7Var3;
        nw7 nw7Var4;
        ArrayList arrayListH0;
        tt7 tt7VarH;
        char c2;
        boolean z;
        Boolean bool;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        Map map;
        c36 c36Var;
        n5 n5Var;
        nw7 nw7VarE0;
        char c3;
        tt7 tt7VarH2;
        char c4;
        dsf dsfVar = dsf.IN_VARIANCE;
        boolean[] zArr = new boolean[1];
        char c5 = 0;
        if (d36Var.H0 != null) {
            annotations = getAnnotations();
            h10 h10Var = d36Var.H0;
            annotations.getClass();
            h10Var.getClass();
            if (annotations.isEmpty()) {
                annotations = h10Var;
            } else if (!h10Var.isEmpty()) {
                annotations = new j10(new h10[]{annotations, h10Var});
            }
        } else {
            annotations = getAnnotations();
        }
        h10 h10Var2 = annotations;
        bm3 bm3Var = d36Var.b;
        c36 c36Var2 = d36Var.e;
        int i = d36Var.f;
        t99 t99Var = d36Var.z;
        ntd ntdVarE = d36Var.Z ? ((em3) (c36Var2 != null ? c36Var2 : a())).e() : ntd.T;
        if (ntdVarE == null) {
            k0(27);
            throw null;
        }
        e36 e36VarF0 = F0(i, h10Var2, bm3Var, c36Var2, t99Var, ntdVarE);
        List typeParameters = d36Var.G0;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        q8f q8fVarN = xo1.N(typeParameters, d36Var.a, e36VarF0, arrayList, zArr);
        if (q8fVarN != null) {
            ArrayList arrayList2 = new ArrayList();
            if (d36Var.v.isEmpty()) {
                c = c5;
                nw7Var = d36Var.w;
                if (nw7Var != null) {
                    tt7VarH2 = q8fVarN.h(nw7Var.getType(), dsfVar);
                    if (tt7VarH2 != null) {
                        d36Var.w.D0();
                        nw7 nw7Var5 = new nw7(e36VarF0, new j85(e36VarF0, tt7VarH2), d36Var.w.getAnnotations());
                        boolean z2 = zArr[c];
                        if (tt7VarH2 != d36Var.w.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z2 ? 1 : 0);
                        nw7Var2 = nw7Var5;
                    }
                } else {
                    nw7Var2 = null;
                }
                nw7Var3 = d36Var.x;
                if (nw7Var3 != null) {
                    nw7VarE0 = nw7Var3.d(q8fVarN);
                    if (nw7VarE0 != null) {
                        boolean z3 = zArr[c];
                        if (nw7VarE0 != d36Var.x) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z3 ? 1 : 0) | c3;
                        nw7Var4 = nw7VarE0;
                    }
                } else {
                    nw7Var4 = null;
                }
                arrayListH0 = H0(e36VarF0, d36Var.g, q8fVarN, d36Var.E0, d36Var.Z, zArr);
                if (arrayListH0 != null) {
                    boolean z4 = zArr[c];
                    if (tt7VarH != d36Var.y) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z4 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0) {
                    }
                    e36VarF0.I0(nw7Var2, nw7Var4, arrayList2, arrayList, arrayListH0, tt7VarH, d36Var.c, d36Var.d);
                    e36VarF0.Y = this.Y;
                    e36VarF0.Z = this.Z;
                    e36VarF0.E0 = this.E0;
                    e36VarF0.F0 = this.F0;
                    e36VarF0.G0 = this.G0;
                    e36VarF0.K0 = this.K0;
                    e36VarF0.H0 = this.H0;
                    e36VarF0.K0(this.L0);
                    e36VarF0.I0 = d36Var.F0;
                    e36VarF0.J0 = d36Var.I0;
                    bool = d36Var.K0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.M0;
                    }
                    e36VarF0.L0(zBooleanValue);
                    if (d36Var.J0.isEmpty()) {
                        linkedHashMap = d36Var.J0;
                        map = this.S0;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            e36VarF0.S0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            e36VarF0.S0 = linkedHashMap;
                        }
                    } else {
                        linkedHashMap = d36Var.J0;
                        map = this.S0;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            e36VarF0.S0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            e36VarF0.S0 = linkedHashMap;
                        }
                    }
                    if (d36Var.Y) {
                        c36Var = this.R0;
                        if (c36Var == null) {
                            c36Var = this;
                        }
                        e36VarF0.R0 = c36Var.d(q8fVarN);
                    } else {
                        c36Var = this.R0;
                        if (c36Var == null) {
                            c36Var = this;
                        }
                        e36VarF0.R0 = c36Var.d(q8fVarN);
                    }
                    if (d36Var.X) {
                        if (d36Var.a.e()) {
                            n5Var = this.O0;
                            if (n5Var != null) {
                                e36VarF0.O0 = n5Var;
                                return e36VarF0;
                            }
                            e36VarF0.Y(l());
                            return e36VarF0;
                        }
                        e36VarF0.O0 = new n5(10, this, q8fVarN);
                    }
                    return e36VarF0;
                }
            } else {
                int i2 = 0;
                for (nw7 nw7Var6 : d36Var.v) {
                    tt7 tt7VarH3 = q8fVarN.h(nw7Var6.getType(), dsfVar);
                    if (tt7VarH3 != null) {
                        char c6 = c5;
                        int i3 = i2 + 1;
                        arrayList2.add(af1.F(e36VarF0, tt7VarH3, ((in2) nw7Var6.D0()).B0(), nw7Var6.getAnnotations(), i2));
                        zArr[c6] = (zArr[c6] ? 1 : 0) | (tt7VarH3 != nw7Var6.getType() ? (char) 1 : c6);
                        c5 = c6;
                        i2 = i3;
                    }
                }
                c = c5;
                nw7Var = d36Var.w;
                if (nw7Var != null) {
                    tt7VarH2 = q8fVarN.h(nw7Var.getType(), dsfVar);
                    if (tt7VarH2 != null) {
                        d36Var.w.D0();
                        nw7 nw7Var7 = new nw7(e36VarF0, new j85(e36VarF0, tt7VarH2), d36Var.w.getAnnotations());
                        boolean z5 = zArr[c];
                        if (tt7VarH2 != d36Var.w.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z5 ? 1 : 0);
                        nw7Var2 = nw7Var7;
                    }
                } else {
                    nw7Var2 = null;
                }
                nw7Var3 = d36Var.x;
                if (nw7Var3 != null) {
                    nw7VarE0 = nw7Var3.d(q8fVarN);
                    if (nw7VarE0 != null) {
                        boolean z6 = zArr[c];
                        if (nw7VarE0 != d36Var.x) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z6 ? 1 : 0) | c3;
                        nw7Var4 = nw7VarE0;
                    }
                } else {
                    nw7Var4 = null;
                }
                arrayListH0 = H0(e36VarF0, d36Var.g, q8fVarN, d36Var.E0, d36Var.Z, zArr);
                if (arrayListH0 != null && (tt7VarH = q8fVarN.h(d36Var.y, dsf.OUT_VARIANCE)) != null) {
                    boolean z7 = zArr[c];
                    if (tt7VarH != d36Var.y) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z7 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0 && d36Var.L0) {
                        return this;
                    }
                    e36VarF0.I0(nw7Var2, nw7Var4, arrayList2, arrayList, arrayListH0, tt7VarH, d36Var.c, d36Var.d);
                    e36VarF0.Y = this.Y;
                    e36VarF0.Z = this.Z;
                    e36VarF0.E0 = this.E0;
                    e36VarF0.F0 = this.F0;
                    e36VarF0.G0 = this.G0;
                    e36VarF0.K0 = this.K0;
                    e36VarF0.H0 = this.H0;
                    e36VarF0.K0(this.L0);
                    e36VarF0.I0 = d36Var.F0;
                    e36VarF0.J0 = d36Var.I0;
                    bool = d36Var.K0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.M0;
                    }
                    e36VarF0.L0(zBooleanValue);
                    if (d36Var.J0.isEmpty() || this.S0 != null) {
                        linkedHashMap = d36Var.J0;
                        map = this.S0;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            e36VarF0.S0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            e36VarF0.S0 = linkedHashMap;
                        }
                    }
                    if (d36Var.Y || this.R0 != null) {
                        c36Var = this.R0;
                        if (c36Var == null) {
                            c36Var = this;
                        }
                        e36VarF0.R0 = c36Var.d(q8fVarN);
                    }
                    if (d36Var.X && !a().l().isEmpty()) {
                        if (d36Var.a.e()) {
                            n5Var = this.O0;
                            if (n5Var != null) {
                                e36VarF0.O0 = n5Var;
                                return e36VarF0;
                            }
                            e36VarF0.Y(l());
                            return e36VarF0;
                        }
                        e36VarF0.O0 = new n5(10, this, q8fVarN);
                    }
                    return e36VarF0;
                }
            }
        }
        return null;
    }

    public void I0(nw7 nw7Var, nw7 nw7Var2, List list, List list2, List list3, tt7 tt7Var, e09 e09Var, rz3 rz3Var) {
        if (list == null) {
            k0(5);
            throw null;
        }
        if (list2 == null) {
            k0(6);
            throw null;
        }
        if (list3 == null) {
            k0(7);
            throw null;
        }
        if (rz3Var == null) {
            k0(8);
            throw null;
        }
        this.f = s72.j1(list2);
        this.g = s72.j1(list3);
        this.v = tt7Var;
        this.z = e09Var;
        this.X = rz3Var;
        this.x = nw7Var;
        this.y = nw7Var2;
        this.w = list;
        for (int i = 0; i < list2.size(); i++) {
            c8f c8fVar = (c8f) list2.get(i);
            if (c8fVar.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(c8fVar);
                int index = c8fVar.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            xrf xrfVar = (xrf) list3.get(i2);
            if (xrfVar.g != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xrfVar);
                int i3 = xrfVar.g;
                sb2.append("index is ");
                sb2.append(i3);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    @Override // defpackage.c36
    public final c36 J() {
        return this.R0;
    }

    public final d36 J0(q8f q8fVar) {
        if (q8fVar != null) {
            return new d36(this, q8fVar.a, k(), i(), getVisibility(), g(), G(), T(), this.x, getReturnType());
        }
        k0(24);
        throw null;
    }

    @Override // defpackage.ca1
    public final nw7 K() {
        return this.y;
    }

    public void K0(boolean z) {
        this.L0 = z;
    }

    public void L0(boolean z) {
        this.M0 = z;
    }

    public final void M0(tjd tjdVar) {
        if (tjdVar != null) {
            this.v = tjdVar;
        } else {
            k0(11);
            throw null;
        }
    }

    @Override // defpackage.ca1
    public final nw7 O() {
        return this.x;
    }

    @Override // defpackage.ca1
    public final List T() {
        List list = this.w;
        if (list != null) {
            return list;
        }
        k0(13);
        throw null;
    }

    @Override // defpackage.c36
    public final boolean X() {
        return this.I0;
    }

    @Override // defpackage.ea1
    public void Y(Collection collection) {
        if (collection == null) {
            k0(17);
            throw null;
        }
        this.N0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((c36) it.next()).b0()) {
                this.J0 = true;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [c36] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public c36 a() {
        c36 c36VarA;
        c36 c36Var = this.P0;
        ?? r1 = this;
        if (c36Var != this) {
            c36VarA = c36Var.a();
        }
        if (r1 != 0) {
            r1 = c36VarA;
            return r1;
        }
        r1 = c36VarA;
        k0(20);
        throw null;
    }

    @Override // defpackage.c36
    public final boolean b0() {
        return this.J0;
    }

    public c36 d(q8f q8fVar) {
        if (q8fVar == null) {
            k0(22);
            throw null;
        }
        if (q8fVar.a.e()) {
            return this;
        }
        d36 d36VarJ0 = J0(q8fVar);
        d36VarJ0.e = a();
        d36VarJ0.Z = true;
        d36VarJ0.L0 = true;
        return d36VarJ0.M0.G0(d36VarJ0);
    }

    @Override // defpackage.c36
    public b36 d0() {
        return J0(q8f.b);
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.ea1
    public final int g() {
        int i = this.Q0;
        if (i != 0) {
            return i;
        }
        k0(21);
        throw null;
    }

    public tt7 getReturnType() {
        return this.v;
    }

    @Override // defpackage.ca1
    public final List getTypeParameters() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        yg5.r(this, "typeParameters == null for ");
        return null;
    }

    @Override // defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = this.X;
        if (rz3Var != null) {
            return rz3Var;
        }
        k0(16);
        throw null;
    }

    @Override // defpackage.tq8
    public final e09 i() {
        e09 e09Var = this.z;
        if (e09Var != null) {
            return e09Var;
        }
        k0(15);
        throw null;
    }

    @Override // defpackage.tq8
    public boolean isExternal() {
        return this.E0;
    }

    @Override // defpackage.c36
    public final boolean isInfix() {
        if (this.Z) {
            return true;
        }
        Iterator it = a().l().iterator();
        while (it.hasNext()) {
            if (((c36) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.c36
    public boolean isInline() {
        return this.F0;
    }

    @Override // defpackage.c36
    public final boolean isOperator() {
        if (this.Y) {
            return true;
        }
        Iterator it = a().l().iterator();
        while (it.hasNext()) {
            if (((c36) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.c36
    public boolean isSuspend() {
        return this.K0;
    }

    @Override // defpackage.ea1, defpackage.ca1
    public Collection l() {
        n5 n5Var = this.O0;
        if (n5Var != null) {
            this.N0 = (Collection) n5Var.invoke();
            this.O0 = null;
        }
        Collection collection = this.N0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        k0(14);
        throw null;
    }

    @Override // defpackage.ca1
    public Object o(g04 g04Var) {
        Map map = this.S0;
        if (map == null) {
            return null;
        }
        return map.get(g04Var);
    }

    @Override // defpackage.ca1
    public boolean t() {
        return this.M0;
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return this.H0;
    }

    @Override // defpackage.c36
    public boolean z() {
        return this.G0;
    }
}
