package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xr7 {
    public static final t99 e = t99.g("<built-ins module>");
    public x09 a;
    public final ee8 b;
    public final be8 c;
    public final ge8 d;

    public xr7(ge8 ge8Var) {
        this.d = ge8Var;
        ge8Var.a(new vr7(this, 0));
        int i = 1;
        this.b = new ee8(ge8Var, new vr7(this, i));
        this.c = ge8Var.b(new d10(this, i));
    }

    public static boolean A(bm3 bm3Var) {
        if (bm3Var != null) {
            return oz3.h(bm3Var, k51.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(tt7 tt7Var, ex5 ex5Var) {
        if (tt7Var == null) {
            a(97);
            throw null;
        }
        if (ex5Var != null) {
            return I(tt7Var.c0(), ex5Var);
        }
        a(98);
        throw null;
    }

    public static boolean C(tt7 tt7Var, ex5 ex5Var) {
        if (ex5Var != null) {
            return B(tt7Var, ex5Var) && !tt7Var.i0();
        }
        a(135);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(em3 em3Var) {
        if (em3Var.a().getAnnotations().E(syd.m)) {
            return true;
        }
        if (!(em3Var instanceof wxa)) {
            return false;
        }
        wxa wxaVar = (wxa) em3Var;
        boolean zN = wxaVar.N();
        zxa zxaVarB = wxaVar.b();
        dya dyaVarC = wxaVar.c();
        if (zxaVarB == null || !D(zxaVarB)) {
            return false;
        }
        if (zN) {
            return dyaVarC != null && D(dyaVarC);
        }
        return true;
    }

    public static boolean E(tt7 tt7Var, ex5 ex5Var) {
        if (tt7Var == null) {
            a(105);
            throw null;
        }
        if (ex5Var != null) {
            return !tt7Var.i0() && B(tt7Var, ex5Var);
        }
        a(106);
        throw null;
    }

    public static boolean F(tt7 tt7Var) {
        if (tt7Var != null) {
            return B(tt7Var, syd.b) && !w8f.e(tt7Var);
        }
        a(136);
        throw null;
    }

    public static boolean G(tt7 tt7Var) {
        if (tt7Var.i0()) {
            return false;
        }
        y22 y22VarM = tt7Var.c0().m();
        return (y22VarM instanceof u09) && u((u09) y22VarM) != null;
    }

    public static boolean H(tt7 tt7Var) {
        return E(tt7Var, syd.f);
    }

    public static boolean I(j7f j7fVar, ex5 ex5Var) {
        if (j7fVar == null) {
            a(101);
            throw null;
        }
        if (ex5Var != null) {
            y22 y22VarM = j7fVar.m();
            return (y22VarM instanceof u09) && b((u09) y22VarM, ex5Var);
        }
        a(102);
        throw null;
    }

    public static boolean J(bm3 bm3Var) {
        while (bm3Var != null) {
            if (bm3Var instanceof kw9) {
                dx5 dx5Var = ((lw9) ((kw9) bm3Var)).f;
                t99 t99Var = tyd.j;
                dx5Var.getClass();
                t99Var.getClass();
                return dx5Var.a.h(t99Var);
            }
            bm3Var = bm3Var.k();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case z7c.f /* 48 */:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case z7c.f /* 48 */:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case z7c.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case z7c.f /* 48 */:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case z7c.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case z7c.f /* 48 */:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(u09 u09Var, ex5 ex5Var) {
        if (u09Var == null) {
            a(103);
            throw null;
        }
        if (ex5Var != null) {
            return u09Var.getName().equals(ex5Var.g()) && ex5Var.equals(oz3.f(u09Var));
        }
        a(104);
        throw null;
    }

    public static jua s(y22 y22Var) {
        if (syd.e0.contains(y22Var.getName())) {
            return (jua) syd.g0.get(oz3.f(y22Var));
        }
        return null;
    }

    public static jua u(u09 u09Var) {
        if (syd.d0.contains(u09Var.getName())) {
            return (jua) syd.f0.get(oz3.f(u09Var));
        }
        return null;
    }

    public static boolean y(tt7 tt7Var) {
        if (tt7Var != null) {
            return B(tt7Var, syd.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(tt7 tt7Var) {
        if (tt7Var != null) {
            return B(tt7Var, syd.g);
        }
        a(88);
        throw null;
    }

    public final void c() {
        t99 t99Var = e;
        t99Var.getClass();
        ge8 ge8Var = this.d;
        x09 x09Var = new x09(t99Var, ge8Var, this, 48);
        this.a = x09Var;
        i51.a.getClass();
        i51 i51Var = (i51) h51.b.getValue();
        x09 x09Var2 = this.a;
        Iterable iterableM = m();
        wea weaVarQ = q();
        fg fgVarD = d();
        j51 j51Var = (j51) i51Var;
        j51Var.getClass();
        x09Var2.getClass();
        iterableM.getClass();
        weaVarQ.getClass();
        fgVarD.getClass();
        Set<dx5> set = tyd.q;
        w wVar = new w(1, j51Var.b, m51.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 10);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (dx5 dx5Var : set) {
            f51.m.getClass();
            InputStream inputStream = (InputStream) wVar.d(f51.a(dx5Var));
            k51 k51VarA = inputStream != null ? z7f.A(dx5Var, ge8Var, x09Var2, inputStream) : null;
            if (k51VarA != null) {
                arrayList.add(k51VarA);
            }
        }
        mw9 mw9Var = new mw9(arrayList);
        szc szcVar = new szc(ge8Var, x09Var2);
        kd9 kd9Var = new kd9(10, mw9Var);
        f51 f51Var = f51.m;
        tz3 tz3Var = new tz3(ge8Var, x09Var2, kd9Var, new k47(x09Var2, szcVar, f51Var), mw9Var, iterableM, szcVar, fgVarD, weaVarQ, f51Var.a, null, new y25(ge8Var), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k51) it.next()).E0(tz3Var);
        }
        x09Var.w = mw9Var;
        x09 x09Var3 = this.a;
        x09Var3.getClass();
        x09Var3.v = new bu3(qd0.G0(new x09[]{x09Var3}));
    }

    public fg d() {
        return af8.c;
    }

    public final tjd e() {
        tjd tjdVarS = k("Any").S();
        if (tjdVarS != null) {
            return tjdVarS;
        }
        a(51);
        throw null;
    }

    public final tt7 f(tt7 tt7Var) {
        if (tt7Var == null) {
            a(68);
            throw null;
        }
        tt7 tt7VarG = g(tt7Var);
        if (tt7VarG != null) {
            return tt7VarG;
        }
        yg5.r(tt7Var, "not array: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final tt7 g(tt7 tt7Var) {
        j22 j22VarF;
        j22 j22Var;
        u09 u09VarP;
        tjd tjdVarS;
        if (tt7Var == null) {
            a(70);
            throw null;
        }
        if (!z(tt7Var)) {
            jgf jgfVarH = w8f.h(tt7Var, false);
            tt7 tt7Var2 = (tt7) ((wr7) this.b.invoke()).b.get(jgfVarH);
            if (tt7Var2 != null) {
                return tt7Var2;
            }
            int i = oz3.a;
            y22 y22VarM = jgfVarH.c0().m();
            w09 w09VarD = y22VarM == null ? null : oz3.d(y22VarM);
            if (w09VarD != null) {
                y22 y22VarM2 = jgfVarH.c0().m();
                if (y22VarM2 == null) {
                    tjdVarS = null;
                } else {
                    Set set = egf.a;
                    t99 name = y22VarM2.getName();
                    name.getClass();
                    if (!egf.d.contains(name) || (j22VarF = qz3.f(y22VarM2)) == null || (j22Var = (j22) egf.b.get(j22VarF)) == null || (u09VarP = od4.p(w09VarD, j22Var)) == null) {
                        tjdVarS = null;
                    } else {
                        tjdVarS = u09VarP.S();
                    }
                }
                if (tjdVarS != null) {
                    return tjdVarS;
                }
            }
        } else if (tt7Var.Z().size() == 1) {
            return ((i8f) tt7Var.Z().get(0)).b();
        }
        return null;
    }

    public final tjd h(tt7 tt7Var) {
        if (tt7Var != null) {
            return i(dsf.INVARIANT, tt7Var, hj6.c);
        }
        a(83);
        throw null;
    }

    public final tjd i(dsf dsfVar, tt7 tt7Var, h10 h10Var) {
        if (tt7Var != null) {
            return rxg.S(jzb.r(h10Var), k("Array"), Collections.singletonList(new dzd(tt7Var, dsfVar)));
        }
        a(79);
        throw null;
    }

    public final u09 j(dx5 dx5Var) {
        if (dx5Var == null) {
            a(12);
            throw null;
        }
        u09 u09VarL = qk2.L(l(), dx5Var);
        if (u09VarL != null) {
            return u09VarL;
        }
        a(13);
        throw null;
    }

    public final u09 k(String str) {
        if (str != null) {
            return (u09) this.c.d(t99.e(str));
        }
        a(14);
        throw null;
    }

    public final x09 l() {
        this.a.getClass();
        x09 x09Var = this.a;
        if (x09Var != null) {
            return x09Var;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new d51(this.d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final tjd n() {
        tjd tjdVarP = p();
        if (tjdVarP != null) {
            return tjdVarP;
        }
        a(53);
        throw null;
    }

    public final tjd o() {
        tjd tjdVarS = k("Nothing").S();
        if (tjdVarS != null) {
            return tjdVarS;
        }
        a(49);
        throw null;
    }

    public final tjd p() {
        tjd tjdVarO0 = e().l0(true);
        if (tjdVarO0 != null) {
            return tjdVarO0;
        }
        a(52);
        throw null;
    }

    public wea q() {
        return qk6.Q0;
    }

    public final tjd r(jua juaVar) {
        if (juaVar == null) {
            a(73);
            throw null;
        }
        tjd tjdVar = (tjd) ((wr7) this.b.invoke()).a.get(juaVar);
        if (tjdVar != null) {
            return tjdVar;
        }
        a(74);
        throw null;
    }

    public final tjd t(jua juaVar) {
        if (juaVar == null) {
            a(54);
            throw null;
        }
        tjd tjdVarS = k(juaVar.e().b()).S();
        if (tjdVarS != null) {
            return tjdVarS;
        }
        a(55);
        throw null;
    }

    public final tjd v() {
        tjd tjdVarS = k("String").S();
        if (tjdVarS != null) {
            return tjdVarS;
        }
        a(66);
        throw null;
    }

    public final u09 w(int i) {
        return j(tyd.f.a(t99.e(l36.d.b + i)));
    }

    public final tjd x() {
        tjd tjdVarS = k("Unit").S();
        if (tjdVarS != null) {
            return tjdVarS;
        }
        a(65);
        throw null;
    }
}
