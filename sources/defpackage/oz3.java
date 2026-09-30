package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oz3 {
    public static final /* synthetic */ int a = 0;

    static {
        new dx5("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case z7c.f /* 48 */:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case z7c.f /* 48 */:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(ca1 ca1Var, LinkedHashSet linkedHashSet) {
        if (ca1Var == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(ca1Var)) {
            return;
        }
        Iterator it = ca1Var.a().l().iterator();
        while (it.hasNext()) {
            ca1 ca1VarA = ((ca1) it.next()).a();
            b(ca1VarA, linkedHashSet);
            linkedHashSet.add(ca1VarA);
        }
    }

    public static w09 c(bm3 bm3Var) {
        if (bm3Var == null) {
            a(21);
            throw null;
        }
        w09 w09VarD = d(bm3Var);
        if (w09VarD != null) {
            return w09VarD;
        }
        a(22);
        throw null;
    }

    public static w09 d(bm3 bm3Var) {
        if (bm3Var == null) {
            a(23);
            throw null;
        }
        while (bm3Var != null) {
            if (bm3Var instanceof w09) {
                return (w09) bm3Var;
            }
            if (bm3Var instanceof n18) {
                return ((n18) bm3Var).d;
            }
            bm3Var = bm3Var.k();
        }
        return null;
    }

    public static qfc e(bm3 bm3Var) {
        qfc qfcVar = qfc.e;
        if (bm3Var == null) {
            a(81);
            throw null;
        }
        if (bm3Var instanceof dya) {
            bm3Var = ((dya) bm3Var).w;
        }
        if (bm3Var instanceof dm3) {
            ((dm3) bm3Var).e().getClass();
        }
        return qfcVar;
    }

    public static ex5 f(bm3 bm3Var) {
        if (bm3Var != null) {
            dx5 dx5VarG = g(bm3Var);
            return dx5VarG != null ? dx5VarG.a : f(bm3Var.k()).a(bm3Var.getName());
        }
        a(2);
        throw null;
    }

    public static dx5 g(bm3 bm3Var) {
        if (bm3Var == null) {
            a(5);
            throw null;
        }
        if ((bm3Var instanceof w09) || sy4.f(bm3Var)) {
            return dx5.c;
        }
        if (bm3Var instanceof n18) {
            return ((n18) bm3Var).e;
        }
        if (bm3Var instanceof kw9) {
            return ((lw9) ((kw9) bm3Var)).f;
        }
        return null;
    }

    public static bm3 h(bm3 bm3Var, Class cls, boolean z) {
        if (bm3Var == null) {
            return null;
        }
        if (z) {
            bm3Var = bm3Var.k();
        }
        while (bm3Var != null) {
            if (cls.isInstance(bm3Var)) {
                return bm3Var;
            }
            bm3Var = bm3Var.k();
        }
        return null;
    }

    public static u09 i(u09 u09Var) {
        if (u09Var == null) {
            a(44);
            throw null;
        }
        for (tt7 tt7Var : u09Var.h().e()) {
            if (tt7Var == null) {
                a(45);
                throw null;
            }
            j7f j7fVarC0 = tt7Var.c0();
            if (j7fVarC0 == null) {
                a(46);
                throw null;
            }
            u09 u09Var2 = (u09) j7fVarC0.m();
            if (u09Var2 == null) {
                a(47);
                throw null;
            }
            if (u09Var2.E() != l22.INTERFACE) {
                return u09Var2;
            }
        }
        return null;
    }

    public static boolean j(bm3 bm3Var) {
        return l(bm3Var, l22.CLASS) && bm3Var.getName().equals(sud.a);
    }

    public static boolean k(bm3 bm3Var) {
        return l(bm3Var, l22.OBJECT) && ((u09) bm3Var).o0();
    }

    public static boolean l(bm3 bm3Var, l22 l22Var) {
        return (bm3Var instanceof u09) && ((u09) bm3Var).E() == l22Var;
    }

    public static boolean m(bm3 bm3Var) {
        if (bm3Var == null) {
            a(1);
            throw null;
        }
        while (bm3Var != null) {
            if (j(bm3Var) || ((bm3Var instanceof gm3) && ((gm3) bm3Var).getVisibility() == sz3.f)) {
                return true;
            }
            bm3Var = bm3Var.k();
        }
        return false;
    }

    public static boolean n(tt7 tt7Var, bm3 bm3Var) {
        if (tt7Var == null) {
            a(30);
            throw null;
        }
        if (bm3Var == null) {
            a(31);
            throw null;
        }
        y22 y22VarM = tt7Var.c0().m();
        if (y22VarM == null) {
            return false;
        }
        bm3 bm3VarA = y22VarM.a();
        return (bm3VarA instanceof y22) && (bm3Var instanceof y22) && ((y22) bm3Var).h().equals(((y22) bm3VarA).h());
    }

    public static boolean o(bm3 bm3Var) {
        return (l(bm3Var, l22.CLASS) || l(bm3Var, l22.INTERFACE)) && ((u09) bm3Var).i() == e09.c;
    }

    public static boolean p(tt7 tt7Var, bm3 bm3Var) {
        if (tt7Var == null) {
            a(32);
            throw null;
        }
        if (bm3Var == null) {
            a(33);
            throw null;
        }
        if (n(tt7Var, bm3Var)) {
            return true;
        }
        Iterator it = tt7Var.c0().e().iterator();
        while (it.hasNext()) {
            if (p((tt7) it.next(), bm3Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(bm3 bm3Var) {
        return bm3Var != null && (bm3Var.k() instanceof kw9);
    }

    public static ea1 r(ea1 ea1Var) {
        while (ea1Var.g() == 2) {
            Collection collectionL = ea1Var.l();
            if (collectionL.isEmpty()) {
                yg5.r(ea1Var, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            ea1Var = (ea1) collectionL.iterator().next();
        }
        return ea1Var;
    }
}
