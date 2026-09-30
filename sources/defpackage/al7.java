package defpackage;

import com.adjust.sdk.Constants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum al7 {
    BOOLEAN(jua.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(jua.CHAR, "char", "C", "java.lang.Character"),
    BYTE(jua.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(jua.SHORT, "short", "S", "java.lang.Short"),
    INT(jua.INT, "int", "I", "java.lang.Integer"),
    FLOAT(jua.FLOAT, "float", "F", "java.lang.Float"),
    LONG(jua.LONG, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(jua.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final jua primitiveType;
    private final dx5 wrapperFqName;
    public static final HashMap w = new HashMap();
    public static final EnumMap x = new EnumMap(jua.class);
    public static final HashMap y = new HashMap();
    public static final HashSet z = new HashSet();
    public static final HashMap X = new HashMap();

    static {
        for (al7 al7Var : values()) {
            w.put(al7Var.d(), al7Var);
            x.put(al7Var.e(), al7Var);
            y.put(al7Var.c(), al7Var);
            String strReplace = al7Var.wrapperFqName.a.a.replace('.', '/');
            z.add(strReplace);
            X.put(strReplace, ks0.m(new StringBuilder("("), al7Var.desc, ")L", strReplace, ";"));
        }
    }

    al7(jua juaVar, String str, String str2, String str3) {
        if (juaVar == null) {
            a(8);
            throw null;
        }
        this.primitiveType = juaVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new dx5(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 15:
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
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[1] = "getPrimitiveType";
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static al7 b(String str) {
        al7 al7Var = (al7) w.get(str);
        if (al7Var != null) {
            return al7Var;
        }
        qc0.i("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final String c() {
        String str = this.desc;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final String d() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        a(13);
        throw null;
    }

    public final jua e() {
        jua juaVar = this.primitiveType;
        if (juaVar != null) {
            return juaVar;
        }
        a(12);
        throw null;
    }

    public final dx5 g() {
        dx5 dx5Var = this.wrapperFqName;
        if (dx5Var != null) {
            return dx5Var;
        }
        a(15);
        throw null;
    }
}
