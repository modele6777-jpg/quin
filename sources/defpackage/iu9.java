package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.replay.capture.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iu9 {
    public static final List b = s72.j1(ServiceLoader.load(z85.class, z85.class.getClassLoader()));
    public static final iu9 c;
    public static final yx4 d;
    public final ut7 a;

    static {
        yx4 yx4Var = new yx4(16);
        d = yx4Var;
        c = new iu9(yx4Var);
    }

    public iu9(ut7 ut7Var) {
        if (ut7Var != null) {
            this.a = ut7Var;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
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
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "transformFirst";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case z7c.f /* 48 */:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "filterOverrides";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case z7c.f /* 48 */:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    public static boolean b(tt7 tt7Var, tt7 tt7Var2, h7f h7fVar) {
        if (tt7Var == null) {
            a(44);
            throw null;
        }
        if (tt7Var2 == null) {
            a(45);
            throw null;
        }
        if (i7h.x(tt7Var) && i7h.x(tt7Var2)) {
            return true;
        }
        return hj6.s(h7fVar, tt7Var.k0(), tt7Var2.k0());
    }

    public static void c(ea1 ea1Var, LinkedHashSet linkedHashSet) {
        if (ea1Var == null) {
            a(17);
            throw null;
        }
        if (ea1Var.g() != 2) {
            linkedHashSet.add(ea1Var);
        } else {
            if (ea1Var.l().isEmpty()) {
                yg5.r(ea1Var, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = ea1Var.l().iterator();
            while (it.hasNext()) {
                c((ea1) it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(ca1 ca1Var) {
        nw7 nw7VarO = ca1Var.O();
        ArrayList arrayList = new ArrayList();
        if (nw7VarO != null) {
            arrayList.add(nw7VarO.getType());
        }
        Iterator it = ca1Var.G().iterator();
        while (it.hasNext()) {
            arrayList.add(((xrf) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static void e(Collection collection, u09 u09Var, x57 x57Var) {
        e09 e09VarI;
        e09 e09Var;
        boolean z;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (u09Var == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        boolean zW = u09Var.w();
                        e09 e09Var2 = e09.e;
                        if (zW && u09Var.i() != e09Var2 && u09Var.i() != e09.c) {
                            z2 = true;
                        }
                        if (z3 && !z4) {
                            e09Var = e09.d;
                            break;
                        }
                        if (z3 || !z4) {
                            HashSet<ea1> hashSet = new HashSet();
                            for (ea1 ea1Var : collection) {
                                if (ea1Var == null) {
                                    a(15);
                                    throw null;
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                c(ea1Var, linkedHashSet);
                                hashSet.addAll(linkedHashSet);
                            }
                            if (!hashSet.isEmpty()) {
                                bm3 bm3Var = (bm3) hashSet.iterator().next();
                                int i = qz3.a;
                                bm3Var.getClass();
                                w09 w09VarC = oz3.c(bm3Var);
                                w09VarC.getClass();
                                if (w09VarC.f0(au7.a) != null) {
                                    r3.f();
                                    return;
                                }
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                for (Object obj : hashSet) {
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            linkedHashSet2.add(obj);
                                            break;
                                        }
                                        iy9 iy9Var = new iy9((ca1) obj, (ca1) it3.next());
                                        ca1 ca1Var = (ca1) iy9Var.a();
                                        ca1 ca1Var2 = (ca1) iy9Var.b();
                                        if (!q(ca1Var, ca1Var2)) {
                                            if (q(ca1Var2, ca1Var)) {
                                                break;
                                            }
                                        } else {
                                            it3.remove();
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            e09 e09VarI2 = u09Var.i();
                            if (e09VarI2 == null) {
                                a(92);
                                throw null;
                            }
                            e09VarI = e09Var2;
                            for (ea1 ea1Var2 : hashSet) {
                                e09 e09VarI3 = (z2 && ea1Var2.i() == e09Var2) ? e09VarI2 : ea1Var2.i();
                                if (e09VarI3.compareTo(e09VarI) < 0) {
                                    e09VarI = e09VarI3;
                                }
                            }
                        } else {
                            e09VarI = z2 ? u09Var.i() : e09Var2;
                            if (e09VarI == null) {
                                a(90);
                                throw null;
                            }
                        }
                        e09Var = e09VarI;
                        break;
                    }
                    ea1 ea1Var3 = (ea1) it2.next();
                    int iOrdinal = ea1Var3.i().ordinal();
                    if (iOrdinal == 0) {
                        e09Var = e09.b;
                        break;
                    } else if (iOrdinal == 1) {
                        yg5.r(ea1Var3, "Member cannot have SEALED modality: ");
                        return;
                    } else if (iOrdinal == 2) {
                        z3 = true;
                    } else if (iOrdinal == 3) {
                        z4 = true;
                    }
                }
                ea1 ea1VarC = ((ea1) s(collection, new qqf(7))).C(u09Var, e09Var, zIsEmpty ? sz3.h : sz3.g);
                x57Var.e0(ea1VarC, collection);
                x57Var.C(ea1VarC);
                return;
            }
            Object next = it.next();
            ea1 ea1Var4 = (ea1) next;
            if (!sz3.e(ea1Var4.getVisibility())) {
                if (u09Var == null) {
                    sz3.a(3);
                    throw null;
                }
                z = sz3.c(sz3.l, ea1Var4, u09Var) == null;
            }
            if (z) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, a26 a26Var, a26 a26Var2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        ca1 ca1Var = (ca1) a26Var.d(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ca1 ca1Var2 = (ca1) a26Var.d(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(ca1Var, ca1Var2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    a26Var2.d(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static hu9 i(ca1 ca1Var, ca1 ca1Var2) {
        boolean z;
        hu9 hu9VarC;
        if (ca1Var == null) {
            a(38);
            throw null;
        }
        if (ca1Var2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = ca1Var instanceof c36;
        if ((z2 && !(ca1Var2 instanceof c36)) || (((z = ca1Var instanceof wxa)) && !(ca1Var2 instanceof wxa))) {
            return hu9.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            yg5.l(ca1Var, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!ca1Var.getName().equals(ca1Var2.getName())) {
            return hu9.c("Name mismatch");
        }
        if ((ca1Var.O() == null) != (ca1Var2.O() == null)) {
            hu9VarC = hu9.c("Receiver presence mismatch");
        } else {
            hu9VarC = ca1Var.G().size() != ca1Var2.G().size() ? hu9.c("Value parameter number mismatch") : null;
        }
        if (hu9VarC != null) {
            return hu9VarC;
        }
        return null;
    }

    public static int j(ca1 ca1Var, ca1 ca1Var2) {
        iu9 iu9Var = c;
        int iB = iu9Var.l(ca1Var2, ca1Var, null).b();
        int iB2 = iu9Var.m(ca1Var, ca1Var2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(ca1 ca1Var, ca1 ca1Var2) {
        if (ca1Var == null) {
            a(65);
            throw null;
        }
        if (ca1Var2 == null) {
            a(66);
            throw null;
        }
        tt7 returnType = ca1Var.getReturnType();
        tt7 returnType2 = ca1Var2.getReturnType();
        if (p(ca1Var, ca1Var2)) {
            h7f h7fVarF = c.f(ca1Var.getTypeParameters(), ca1Var2.getTypeParameters());
            if (ca1Var instanceof c36) {
                return o(ca1Var, returnType, ca1Var2, returnType2, h7fVarF);
            }
            if (!(ca1Var instanceof wxa)) {
                v.a(ca1Var.getClass(), "Unexpected callable: ");
                return false;
            }
            wxa wxaVar = (wxa) ca1Var;
            wxa wxaVar2 = (wxa) ca1Var2;
            dya dyaVarC = wxaVar.c();
            dya dyaVarC2 = wxaVar2.c();
            if ((dyaVarC == null || dyaVarC2 == null) ? true : p(dyaVarC, dyaVarC2)) {
                if (wxaVar.N() && wxaVar2.N()) {
                    return hj6.s(h7fVarF, returnType.k0(), returnType2.k0());
                }
                if ((wxaVar.N() || !wxaVar2.N()) && o(ca1Var, returnType, ca1Var2, returnType2, h7fVarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(ca1 ca1Var, tt7 tt7Var, ca1 ca1Var2, tt7 tt7Var2, h7f h7fVar) {
        if (ca1Var == null) {
            a(71);
            throw null;
        }
        if (tt7Var == null) {
            a(72);
            throw null;
        }
        if (ca1Var2 == null) {
            a(73);
            throw null;
        }
        if (tt7Var2 == null) {
            a(74);
            throw null;
        }
        jgf jgfVarK0 = tt7Var.k0();
        jgf jgfVarK1 = tt7Var2.k0();
        r8f r8fVar = h7fVar.c;
        if (jgfVarK0 == jgfVarK1) {
            return true;
        }
        l26 l26VarO = r8fVar.O();
        Boolean bool = l26VarO != null ? (Boolean) l26VarO.z(jgfVarK0, jgfVarK1) : null;
        return bool != null ? bool.booleanValue() : hj6.b.p(h7fVar, r8fVar, jgfVarK0, jgfVarK1);
    }

    public static boolean p(ca1 ca1Var, ca1 ca1Var2) {
        Integer numB = sz3.b(ca1Var.getVisibility(), ca1Var2.getVisibility());
        return numB == null || numB.intValue() >= 0;
    }

    public static boolean q(ca1 ca1Var, ca1 ca1Var2) {
        hj6 hj6Var = hj6.F0;
        if (ca1Var == null) {
            a(13);
            throw null;
        }
        if (ca1Var2 == null) {
            a(14);
            throw null;
        }
        if (!ca1Var.equals(ca1Var2) && hj6Var.g(ca1Var.a(), ca1Var2.a(), false)) {
            return true;
        }
        ca1 ca1VarA = ca1Var2.a();
        int i = oz3.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oz3.b(ca1Var.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (hj6Var.g(ca1VarA, (ca1) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(ea1 ea1Var, a26 a26Var) {
        rz3 rz3Var;
        rz3 rz3VarF;
        rz3 rz3Var2;
        if (ea1Var == null) {
            a(105);
            throw null;
        }
        for (ea1 ea1Var2 : ea1Var.l()) {
            if (ea1Var2.getVisibility() == sz3.g) {
                r(ea1Var2, a26Var);
            }
        }
        if (ea1Var.getVisibility() != sz3.g) {
            return;
        }
        Collection<ea1> collectionL = ea1Var.l();
        if (collectionL == null) {
            a(107);
            throw null;
        }
        if (!collectionL.isEmpty()) {
            Iterator it = collectionL.iterator();
            loop3: while (true) {
                rz3Var = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    rz3 visibility = ((ea1) it.next()).getVisibility();
                    if (rz3Var != null) {
                        Integer numB = sz3.b(visibility, rz3Var);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    rz3Var = visibility;
                }
            }
            if (rz3Var == null) {
                rz3VarF = null;
                break;
            }
            Iterator it2 = collectionL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rz3VarF = rz3Var;
                    break;
                }
                Integer numB2 = sz3.b(rz3Var, ((ea1) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    rz3VarF = null;
                    break;
                }
            }
        } else {
            rz3VarF = sz3.j;
        }
        if (rz3VarF == null) {
            rz3VarF = null;
            break;
        }
        if (ea1Var.g() == 2) {
            for (ea1 ea1Var3 : collectionL) {
                if (ea1Var3.i() != e09.e && !ea1Var3.getVisibility().equals(rz3VarF)) {
                    rz3VarF = null;
                    break;
                }
            }
        } else {
            rz3VarF = sz3.f(rz3VarF.a.l());
        }
        if (rz3VarF == null) {
            if (a26Var != null) {
                a26Var.d(ea1Var);
            }
            rz3Var2 = sz3.e;
        } else {
            rz3Var2 = rz3VarF;
        }
        if (ea1Var instanceof yxa) {
            yxa yxaVar = (yxa) ea1Var;
            if (rz3Var2 == null) {
                yxa.k0(20);
                throw null;
            }
            yxaVar.y = rz3Var2;
            Iterator it3 = ((wxa) ea1Var).n().iterator();
            while (it3.hasNext()) {
                r((uxa) it3.next(), rz3VarF == null ? null : a26Var);
            }
            return;
        }
        if (ea1Var instanceof e36) {
            e36 e36Var = (e36) ea1Var;
            if (rz3Var2 != null) {
                e36Var.X = rz3Var2;
                return;
            } else {
                e36.k0(10);
                throw null;
            }
        }
        uxa uxaVar = (uxa) ea1Var;
        uxaVar.z = rz3Var2;
        if (rz3Var2 != uxaVar.w.getVisibility()) {
            uxaVar.f = false;
        }
    }

    public static Object s(Collection collection, a26 a26Var) {
        Object next;
        tt7 returnType;
        if (collection.size() == 1) {
            Object objU0 = s72.u0(collection);
            if (objU0 != null) {
                return objU0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(t72.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(a26Var.d(it.next()));
        }
        Object objU1 = s72.u0(collection);
        ca1 ca1Var = (ca1) a26Var.d(objU1);
        for (Object obj : collection) {
            ca1 ca1Var2 = (ca1) a26Var.d(obj);
            if (ca1Var2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(ca1Var2, (ca1) it2.next()));
            if (k(ca1Var2, ca1Var) && !k(ca1Var, ca1Var2)) {
                objU1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objU1 != null) {
                return objU1;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objU2 = s72.u0(arrayList);
            if (objU2 != null) {
                return objU2;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            returnType = ((ca1) a26Var.d(next)).getReturnType();
            returnType.getClass();
        } while (returnType.k0() instanceof bj5);
        if (next != null) {
            return next;
        }
        Object objU3 = s72.u0(arrayList);
        if (objU3 != null) {
            return objU3;
        }
        a(82);
        throw null;
    }

    public final h7f f(List list, List list2) {
        zt7 zt7Var = zt7.p;
        yt7 yt7Var = yt7.q;
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        ut7 ut7Var = this.a;
        if (zIsEmpty) {
            return new h7f(true, true, true, new w84((HashMap) null, ut7Var), yt7Var, zt7Var);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((c8f) list.get(i)).h(), ((c8f) list2.get(i)).h());
        }
        return new h7f(true, true, true, new w84(map, ut7Var), yt7Var, zt7Var);
    }

    public final void h(t99 t99Var, Collection collection, Collection collection2, u09 u09Var, x57 x57Var) {
        Integer numB;
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (u09Var == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            ea1 ea1Var = (ea1) it.next();
            if (ea1Var == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            dqd dqdVar = new dqd();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                ea1 ea1Var2 = (ea1) it2.next();
                int iB = l(ea1Var2, ea1Var, u09Var).b();
                boolean z = !sz3.e(ea1Var2.getVisibility()) && sz3.c(sz3.l, ea1Var2, ea1Var) == null;
                int iB2 = kv2.B(iB);
                if (iB2 == 0) {
                    if (z) {
                        dqdVar.add(ea1Var2);
                    }
                    arrayList.add(ea1Var2);
                } else if (iB2 == 2) {
                    if (z) {
                        x57Var.I(ea1Var2, ea1Var);
                    }
                    arrayList.add(ea1Var2);
                }
            }
            x57Var.e0(ea1Var, dqdVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            bm3 bm3VarK = ((ea1) linkedHashSet.iterator().next()).k();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((ea1) it3.next()).k() != bm3VarK) {
                        LinkedList<ea1> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            ea1 ea1Var3 = null;
                            for (ea1 ea1Var4 : linkedList) {
                                if (ea1Var3 == null || ((numB = sz3.b(ea1Var3.getVisibility(), ea1Var4.getVisibility())) != null && numB.intValue() < 0)) {
                                    ea1Var3 = ea1Var4;
                                }
                            }
                            ea1Var3.getClass();
                            e(g(ea1Var3, linkedList, new qqf(8), new d5(25, x57Var, ea1Var3)), u09Var, x57Var);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((ea1) it4.next()), u09Var, x57Var);
        }
    }

    public final hu9 l(ca1 ca1Var, ca1 ca1Var2, u09 u09Var) {
        if (ca1Var == null) {
            a(19);
            throw null;
        }
        if (ca1Var2 != null) {
            return m(ca1Var, ca1Var2, u09Var, false);
        }
        a(20);
        throw null;
    }

    public final hu9 m(ca1 ca1Var, ca1 ca1Var2, u09 u09Var, boolean z) {
        if (ca1Var == null) {
            a(22);
            throw null;
        }
        if (ca1Var2 == null) {
            a(23);
            throw null;
        }
        hu9 hu9VarN = n(ca1Var, ca1Var2, z);
        boolean z2 = hu9VarN.b() == 1;
        List<z85> list = b;
        for (z85 z85Var : list) {
            if (z85Var.a() != 1 && (!z2 || z85Var.a() != 2)) {
                int iB = kv2.B(z85Var.b(ca1Var, ca1Var2, u09Var));
                if (iB == 0) {
                    z2 = true;
                } else if (iB == 1) {
                    return hu9.c("External condition");
                }
            }
        }
        if (!z2) {
            return hu9VarN;
        }
        for (z85 z85Var2 : list) {
            if (z85Var2.a() == 1) {
                int iB2 = kv2.B(z85Var2.b(ca1Var, ca1Var2, u09Var));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + z85Var2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return hu9.c("External condition");
                }
            }
        }
        hu9 hu9Var = hu9.c;
        if (hu9Var != null) {
            return hu9Var;
        }
        hu9.a(0);
        throw null;
    }

    public final hu9 n(ca1 ca1Var, ca1 ca1Var2, boolean z) {
        boolean zBooleanValue;
        if (ca1Var == null) {
            a(28);
            throw null;
        }
        if (ca1Var2 == null) {
            a(29);
            throw null;
        }
        hu9 hu9VarI = i(ca1Var, ca1Var2);
        if (hu9VarI != null) {
            return hu9VarI;
        }
        ArrayList arrayListD = d(ca1Var);
        ArrayList arrayListD2 = d(ca1Var2);
        List typeParameters = ca1Var.getTypeParameters();
        List typeParameters2 = ca1Var2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!vt7.a.a((tt7) arrayListD.get(i), (tt7) arrayListD2.get(i))) {
                    return hu9.c("Type parameter number mismatch");
                }
            }
            return new hu9(3, "Type parameter number mismatch");
        }
        h7f h7fVarF = f(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            c8f c8fVar = (c8f) typeParameters.get(i2);
            c8f c8fVar2 = (c8f) typeParameters2.get(i2);
            if (c8fVar == null) {
                a(47);
                throw null;
            }
            if (c8fVar2 == null) {
                a(48);
                throw null;
            }
            List<tt7> upperBounds = c8fVar.getUpperBounds();
            ArrayList arrayList = new ArrayList(c8fVar2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (tt7 tt7Var : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(tt7Var, (tt7) listIterator.next(), h7fVarF));
                    listIterator.remove();
                }
            }
            return hu9.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((tt7) arrayListD.get(i3), (tt7) arrayListD2.get(i3), h7fVarF)) {
                return hu9.c("Value parameter type mismatch");
            }
        }
        if ((ca1Var instanceof c36) && (ca1Var2 instanceof c36) && ((c36) ca1Var).isSuspend() != ((c36) ca1Var2).isSuspend()) {
            return new hu9(3, "Incompatible suspendability");
        }
        if (z) {
            tt7 returnType = ca1Var.getReturnType();
            tt7 returnType2 = ca1Var2.getReturnType();
            if (returnType != null && returnType2 != null && (!i7h.x(returnType2) || !i7h.x(returnType))) {
                jgf jgfVarK0 = returnType2.k0();
                jgf jgfVarK1 = returnType.k0();
                r8f r8fVar = h7fVarF.c;
                if (jgfVarK0 == jgfVarK1) {
                    zBooleanValue = true;
                } else {
                    l26 l26VarO = r8fVar.O();
                    Boolean bool = l26VarO != null ? (Boolean) l26VarO.z(jgfVarK0, jgfVarK1) : null;
                    zBooleanValue = bool != null ? bool.booleanValue() : hj6.b.p(h7fVarF, r8fVar, jgfVarK0, jgfVarK1);
                }
                if (!zBooleanValue) {
                    return new hu9(3, "Return type mismatch");
                }
            }
        }
        hu9 hu9Var = hu9.c;
        if (hu9Var != null) {
            return hu9Var;
        }
        hu9.a(0);
        throw null;
    }
}
