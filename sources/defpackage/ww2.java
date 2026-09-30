package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Method;
import java.time.Instant;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww2 implements Comparator {
    public static final ww2 b = new ww2(0);
    public static final ww2 c = new ww2(1);
    public static final ww2 d = new ww2(3);
    public static final ww2 e = new ww2(4);
    public static final ww2 f = new ww2(5);
    public static final ww2 g = new ww2(6);
    public static final ww2 v = new ww2(7);
    public final /* synthetic */ int a;

    public /* synthetic */ ww2(int i) {
        this.a = i;
    }

    public static float a(icd icdVar) {
        if (icdVar.b.j() == 0.0f && (icdVar instanceof icd) && icdVar.z == null) {
            return -1.0f;
        }
        return icdVar.b.j();
    }

    public static int b(bm3 bm3Var) {
        if (bm3Var == null) {
            oz3.a(36);
            throw null;
        }
        if (oz3.l(bm3Var, l22.ENUM_ENTRY)) {
            return 8;
        }
        if (bm3Var instanceof ul2) {
            return 7;
        }
        if (bm3Var instanceof wxa) {
            return ((wxa) bm3Var).O() == null ? 6 : 5;
        }
        if (bm3Var instanceof c36) {
            return ((c36) bm3Var).O() == null ? 4 : 3;
        }
        if (bm3Var instanceof u09) {
            return 2;
        }
        return bm3Var instanceof s04 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0439  */
    /* JADX WARN: Code duplicated, block: B:223:0x044f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ?? r7;
        ?? r8;
        Integer numValueOf = null;
        switch (this.a) {
            case 0:
                wnb wnbVar = (wnb) obj;
                wnb wnbVar2 = (wnb) obj2;
                wnbVar.getClass();
                wnbVar2.getClass();
                fo7 fo7VarG = ia5.g(wnbVar.getTypeParameters(), wnbVar2.getTypeParameters());
                if (fo7VarG != null) {
                    yn7 returnType = wnbVar.getReturnType();
                    fo7 fo7Var = fo7.c;
                    yn7 yn7Var = fo7VarG.b(returnType, io7.a).b;
                    if (yn7Var == null) {
                        ia5.f(wnbVar.getName());
                        throw null;
                    }
                    yn7 returnType2 = wnbVar2.getReturnType();
                    boolean zU = oa7.U(yn7Var, returnType2);
                    boolean zU2 = oa7.U(returnType2, yn7Var);
                    if (!zU || zU2) {
                        if (zU2 && !zU) {
                            return 1;
                        }
                        j2 j2Var = yn7Var instanceof j2 ? (j2) yn7Var : null;
                        if (j2Var == null) {
                            r7 = false;
                        } else {
                            if (j2Var.y() == null) {
                                j2Var = null;
                            }
                            if (j2Var != null) {
                                r7 = true;
                            } else {
                                r7 = false;
                            }
                        }
                        j2 j2Var2 = returnType2 instanceof j2 ? (j2) returnType2 : null;
                        if (j2Var2 == null) {
                            r8 = false;
                        } else if ((j2Var2.y() != null ? j2Var2 : null) != null) {
                            r8 = true;
                        } else {
                            r8 = false;
                        }
                        if (r8 == false || r7 != false) {
                            if (r7 != false && r8 == false) {
                                return 1;
                            }
                        }
                    }
                    return -1;
                }
                yg5.n("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '", wnbVar, "' '", wnbVar2);
                return 0;
            case 1:
                oo5 oo5Var = (oo5) obj;
                oo5 oo5Var2 = (oo5) obj2;
                if (vpf.I(oo5Var) && vpf.I(oo5Var2)) {
                    LayoutNode layoutNodeS0 = vd0.s0(oo5Var);
                    LayoutNode layoutNodeS1 = vd0.s0(oo5Var2);
                    if (!pa7.t(layoutNodeS0, layoutNodeS1)) {
                        Object[] objArr = new LayoutNode[16];
                        int i = 0;
                        while (layoutNodeS0 != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = layoutNodeS0;
                            i++;
                            layoutNodeS0 = layoutNodeS0.F();
                        }
                        Object[] objArr3 = new LayoutNode[16];
                        int i3 = 0;
                        while (layoutNodeS1 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = layoutNodeS1;
                            i3++;
                            layoutNodeS1 = layoutNodeS1.F();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (pa7.t(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return pa7.L(((LayoutNode) objArr[i5]).G(), ((LayoutNode) objArr3[i5]).G());
                        }
                        qc0.p("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (vpf.I(oo5Var)) {
                        return -1;
                    }
                    if (vpf.I(oo5Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 2:
                return Float.compare(a((icd) obj), a((icd) obj2));
            case 3:
                hkb hkbVarH = ((ywc) obj).h();
                hkb hkbVarH2 = ((ywc) obj2).h();
                int iCompare = Float.compare(hkbVarH.a, hkbVarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(hkbVarH.b, hkbVarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(hkbVarH.d, hkbVarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(hkbVarH.c, hkbVarH2.c);
            case 4:
                bm3 bm3Var = (bm3) obj;
                bm3 bm3Var2 = (bm3) obj2;
                int iB = b(bm3Var2) - b(bm3Var);
                if (iB != 0) {
                    numValueOf = Integer.valueOf(iB);
                } else {
                    l22 l22Var = l22.ENUM_ENTRY;
                    if (oz3.l(bm3Var, l22Var) && oz3.l(bm3Var2, l22Var)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = bm3Var.getName().a.compareTo(bm3Var2.getName().a);
                        if (iCompareTo != 0) {
                            numValueOf = Integer.valueOf(iCompareTo);
                        }
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 5:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                int iL = pa7.L(layoutNode2.F0, layoutNode.F0);
                return iL != 0 ? iL : pa7.L(layoutNode.hashCode(), layoutNode2.hashCode());
            case 6:
                hkb hkbVarH3 = ((ywc) obj).h();
                hkb hkbVarH4 = ((ywc) obj2).h();
                int iCompare4 = Float.compare(hkbVarH4.c, hkbVarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(hkbVarH3.b, hkbVarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(hkbVarH3.d, hkbVarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(hkbVarH4.a, hkbVarH3.a);
            case 7:
                iy9 iy9Var = (iy9) obj;
                iy9 iy9Var2 = (iy9) obj2;
                int iCompare7 = Float.compare(((hkb) iy9Var.d()).b, ((hkb) iy9Var2.d()).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((hkb) iy9Var.d()).d, ((hkb) iy9Var2.d()).d);
            case 8:
                Instant instant = ((gb) obj).e;
                if (instant == null) {
                    instant = Instant.MAX;
                }
                Instant instant2 = ((gb) obj2).e;
                if (instant2 == null) {
                    instant2 = Instant.MAX;
                }
                return i7h.m(instant, instant2);
            case 9:
                Instant instant3 = ((gb) obj).e;
                if (instant3 == null) {
                    instant3 = Instant.MAX;
                }
                Instant instant4 = ((gb) obj2).e;
                if (instant4 == null) {
                    instant4 = Instant.MAX;
                }
                return i7h.m(instant3, instant4);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ((jaa) obj2).d.compareTo(((jaa) obj).d);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(((j00) obj).b).compareTo(Integer.valueOf(((j00) obj2).b));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Integer.valueOf(((j00) obj).b).compareTo(Integer.valueOf(((j00) obj2).b));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(uq1.q(((bod) obj).b)).compareTo(Integer.valueOf(uq1.q(((bod) obj2).b)));
            case 14:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (pa7.L(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                        return -1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 >= length4) {
                    return 1;
                }
                return -1;
            case 15:
                return Float.valueOf(((vs1) obj2).g).compareTo(Float.valueOf(((vs1) obj).g));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return i7h.m(qz3.g((u09) obj).a.a, qz3.g((u09) obj2).a.a);
            case 17:
                return ((z72) obj2).b() - ((z72) obj).b();
            case 18:
                return i7h.m((String) ((iy9) obj).d(), (String) ((iy9) obj2).d());
            case 19:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                LayoutNode layoutNode4 = (LayoutNode) obj2;
                int iL2 = pa7.L(layoutNode3.F0, layoutNode4.F0);
                return iL2 != 0 ? iL2 : pa7.L(layoutNode3.hashCode(), layoutNode4.hashCode());
            case 20:
                return i7h.m(((aob) obj).getName(), ((aob) obj2).getName());
            case 21:
                return Integer.valueOf(((sle) obj).b.ordinal()).compareTo(Integer.valueOf(((sle) obj2).b.ordinal()));
            case 22:
                return Long.valueOf(((e95) obj).f).compareTo(Long.valueOf(((e95) obj2).f));
            case 23:
                q46 q46Var = (q46) obj;
                q46 q46Var2 = (q46) obj2;
                RecyclerView recyclerView = q46Var.d;
                if ((recyclerView == null) == (q46Var2.d == null)) {
                    boolean z = q46Var.a;
                    if (z == q46Var2.a) {
                        int i7 = q46Var2.b - q46Var.b;
                        if (i7 != 0) {
                            return i7;
                        }
                        int i8 = q46Var.c - q46Var2.c;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 24:
                return Float.valueOf(((sh6) obj).c.j()).compareTo(Float.valueOf(((sh6) obj2).c.j()));
            case 25:
                return i7h.m(((bc4) obj2).c(), ((bc4) obj).c());
            case 26:
                return i7h.m(((bc4) obj2).c(), ((bc4) obj).c());
            case 27:
                return i7h.m(((Method) obj).getName(), ((Method) obj2).getName());
            case 28:
                return i7h.m(((Method) obj).getName(), ((Method) obj2).getName());
            default:
                rob robVar = xm7.a;
                Integer numB = sz3.b((rz3) obj, (rz3) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}
