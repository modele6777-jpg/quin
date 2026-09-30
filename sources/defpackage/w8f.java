package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w8f {
    public static final oy4 a = sy4.c(qy4.x, new String[0]);
    public static final oy4 b = sy4.c(qy4.g, new String[0]);
    public static final v8f c = new v8f("NO_EXPECTED_TYPE");
    public static final v8f d = new v8f("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case z7c.f /* 48 */:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "typeConstructor";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case z7c.f /* 48 */:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "canHaveSubtypes";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(tt7 tt7Var) {
        if (tt7Var == null) {
            a(28);
            throw null;
        }
        if (tt7Var.i0()) {
            return true;
        }
        return (tt7Var.k0() instanceof bj5) && b(((bj5) tt7Var.k0()).c);
    }

    public static boolean c(tt7 tt7Var, a26 a26Var, dqd dqdVar) {
        if (tt7Var == null) {
            return false;
        }
        jgf jgfVarK0 = tt7Var.k0();
        if (m(tt7Var)) {
            return ((Boolean) a26Var.d(jgfVarK0)).booleanValue();
        }
        if (dqdVar != null && dqdVar.contains(tt7Var)) {
            return false;
        }
        if (((Boolean) a26Var.d(jgfVarK0)).booleanValue()) {
            return true;
        }
        if (dqdVar == null) {
            dqdVar = new dqd();
        }
        dqdVar.add(tt7Var);
        bj5 bj5Var = jgfVarK0 instanceof bj5 ? (bj5) jgfVarK0 : null;
        if (bj5Var != null && (c(bj5Var.b, a26Var, dqdVar) || c(bj5Var.c, a26Var, dqdVar))) {
            return true;
        }
        if ((jgfVarK0 instanceof kv3) && c(((kv3) jgfVarK0).b, a26Var, dqdVar)) {
            return true;
        }
        j7f j7fVarC0 = tt7Var.c0();
        if (j7fVarC0 instanceof ca7) {
            Iterator it = ((ca7) j7fVarC0).b.iterator();
            while (it.hasNext()) {
                if (c((tt7) it.next(), a26Var, dqdVar)) {
                    return true;
                }
            }
            return false;
        }
        for (i8f i8fVar : tt7Var.Z()) {
            if (!i8fVar.c() && c(i8fVar.b(), a26Var, dqdVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new dzd(((c8f) it.next()).S()));
        }
        return s72.j1(arrayList);
    }

    public static boolean e(tt7 tt7Var) {
        if (tt7Var == null) {
            a(27);
            throw null;
        }
        if (!tt7Var.i0() && (!(tt7Var.k0() instanceof bj5) || !e(((bj5) tt7Var.k0()).c))) {
            if (!(tt7Var.k0() instanceof kv3)) {
                if (f(tt7Var)) {
                    if (!(tt7Var.c0().m() instanceof u09)) {
                        q8f q8fVarD = q8f.d(tt7Var);
                        Collection<tt7> collectionE = tt7Var.c0().e();
                        ArrayList arrayList = new ArrayList(collectionE.size());
                        for (tt7 tt7Var2 : collectionE) {
                            if (tt7Var2 == null) {
                                a(21);
                                throw null;
                            }
                            tt7 tt7VarH = q8fVarD.h(tt7Var2, dsf.INVARIANT);
                            tt7 tt7VarI = tt7VarH != null ? i(tt7VarH, tt7Var.i0()) : null;
                            if (tt7VarI != null) {
                                arrayList.add(tt7VarI);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((tt7) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                j7f j7fVarC0 = tt7Var.c0();
                if (j7fVarC0 instanceof ca7) {
                    Iterator it2 = ((ca7) j7fVarC0).b.iterator();
                    while (it2.hasNext()) {
                        if (e((tt7) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(tt7 tt7Var) {
        if (tt7Var == null) {
            a(60);
            throw null;
        }
        if ((tt7Var.c0().m() instanceof c8f ? (c8f) tt7Var.c0().m() : null) != null) {
            return true;
        }
        tt7Var.c0();
        return false;
    }

    public static jgf g(tt7 tt7Var) {
        if (tt7Var != null) {
            return h(tt7Var, true);
        }
        a(1);
        throw null;
    }

    public static jgf h(tt7 tt7Var, boolean z) {
        if (tt7Var == null) {
            a(3);
            throw null;
        }
        jgf jgfVarL0 = tt7Var.k0().l0(z);
        if (jgfVarL0 != null) {
            return jgfVarL0;
        }
        a(4);
        throw null;
    }

    public static tt7 i(tt7 tt7Var, boolean z) {
        if (tt7Var != null) {
            return z ? h(tt7Var, true) : tt7Var;
        }
        a(8);
        throw null;
    }

    public static tjd j(tjd tjdVar, boolean z) {
        if (tjdVar == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return tjdVar;
        }
        tjd tjdVarO0 = tjdVar.l0(true);
        if (tjdVarO0 != null) {
            return tjdVarO0;
        }
        a(6);
        throw null;
    }

    public static dzd k(c8f c8fVar) {
        if (c8fVar != null) {
            return new dzd(c8fVar);
        }
        a(45);
        throw null;
    }

    public static i8f l(c8f c8fVar, tf7 tf7Var) {
        if (c8fVar != null) {
            return tf7Var.a == t8f.a ? new dzd(fbc.k(c8fVar)) : new dzd(c8fVar);
        }
        a(46);
        throw null;
    }

    public static boolean m(tt7 tt7Var) {
        if (tt7Var != null) {
            return tt7Var == c || tt7Var == d;
        }
        a(0);
        throw null;
    }
}
