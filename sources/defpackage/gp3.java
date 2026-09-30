package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gp3 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public gp3(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public void a(flb flbVar, boolean z) {
        RecyclerView.g(flbVar);
        View view = flbVar.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        hlb hlbVar = recyclerView.z1;
        if (hlbVar != null) {
            glb glbVar = hlbVar.e;
            nvf.j(view, glbVar != null ? (i6) glbVar.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.F0;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                r3.f();
                return;
            } else if (recyclerView.s1 != null) {
                recyclerView.g.v(flbVar);
            }
        }
        flbVar.r = null;
        flbVar.q = null;
        ykb ykbVarD = d();
        ykbVarD.getClass();
        int i = flbVar.e;
        ArrayList arrayList2 = ykbVarD.a(i).a;
        ((xkb) ykbVarD.a.get(i)).getClass();
        if (5 <= arrayList2.size()) {
            od4.j(view);
        } else {
            flbVar.l();
            arrayList2.add(flbVar);
        }
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        blb blbVar = recyclerView.s1;
        if (i >= 0 && i < blbVar.b()) {
            return !blbVar.f ? i : recyclerView.e.A(i, 0);
        }
        StringBuilder sbN = ub3.n(i, "invalid position ", ". State item count is ");
        sbN.append(blbVar.b());
        sbN.append(recyclerView.w());
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public gp3 c(tj0 tj0Var) {
        return new gp3((rr5) this.c, (rr5) this.d, this.a, this.b, tj0Var, (vj0) this.f, (gye) this.g, this.h);
    }

    public ykb d() {
        if (((ykb) this.g) == null) {
            ykb ykbVar = new ykb();
            ykbVar.a = new SparseArray();
            ykbVar.b = 0;
            ykbVar.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = ykbVar;
            h();
        }
        return (ykb) this.g;
    }

    public hed e() {
        return (hed) ((vz9) this.d).getValue();
    }

    public void f() {
        Object obj;
        List listC = ((hcd) this.c).c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i);
            if (((icd) obj).i()) {
                break;
            } else {
                i++;
            }
        }
        icd icdVar = (icd) obj;
        if (icdVar == null && ((tbd) this.g) == null) {
            return;
        }
        if (pa7.t(icdVar != null ? icdVar.X : null, (tbd) this.g)) {
            return;
        }
        ((sz9) this.h).k(this.b + 1);
    }

    public boolean g() {
        return Objects.equals(((rr5) this.c).p, "audio/raw");
    }

    public void h() {
        RecyclerView recyclerView;
        nkb nkbVar;
        ykb ykbVar = (ykb) this.g;
        if (ykbVar == null || (nkbVar = (recyclerView = (RecyclerView) this.h).z) == null || !recyclerView.J0) {
            return;
        }
        ykbVar.c.add(nkbVar);
    }

    public void i(nkb nkbVar, boolean z) {
        ykb ykbVar = (ykb) this.g;
        if (ykbVar != null) {
            SparseArray sparseArray = ykbVar.a;
            Set set = ykbVar.c;
            set.remove(nkbVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((xkb) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    od4.j(((flb) arrayList.get(i2)).a);
                }
            }
        }
    }

    public void j() {
        Object obj;
        Object obj2;
        hed hedVarE;
        sz9 sz9Var = (sz9) this.h;
        hcd hcdVar = (hcd) this.c;
        sz9 sz9Var2 = (sz9) this.e;
        int i = 0;
        if (sz9Var2.j() != this.a) {
            this.a = sz9Var2.j();
            int iOrdinal = ((p0e) this.f).ordinal();
            if (iOrdinal == 0) {
                hedVarE = e();
            } else if (iOrdinal != 1) {
                hedVarE = mf9.a;
                if (iOrdinal == 2) {
                    List listC = hcdVar.c();
                    int size = listC.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            hedVarE = e().h();
                            break;
                        } else if (pa7.t(((icd) listC.get(i2)).X, (tbd) this.g)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else if (iOrdinal != 3) {
                    ap.c();
                    return;
                }
            } else {
                hedVarE = e().g((tbd) this.g);
            }
            ((vz9) this.d).setValue(hedVarE);
            this.f = p0e.a;
        }
        if (sz9Var.j() != this.b) {
            tbd tbdVar = null;
            if (hcdVar.b.e()) {
                List listC2 = hcdVar.c();
                int size2 = listC2.size();
                while (true) {
                    if (i >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listC2.get(i);
                    if (((icd) obj2).i()) {
                        break;
                    } else {
                        i++;
                    }
                }
                icd icdVar = (icd) obj2;
                if (icdVar != null) {
                    tbdVar = icdVar.X;
                }
            } else {
                List listB = hcdVar.b();
                int size3 = listB.size();
                while (true) {
                    if (i >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (((icd) obj).i()) {
                        break;
                    } else {
                        i++;
                    }
                }
                icd icdVar2 = (icd) obj;
                if (icdVar2 != null) {
                    tbdVar = icdVar2.X;
                }
            }
            if (!pa7.t(tbdVar, (tbd) this.g)) {
                this.g = tbdVar;
            }
            this.b = sz9Var.j();
        }
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l(size);
        }
        arrayList.clear();
        if (RecyclerView.O1) {
            i12 i12Var = ((RecyclerView) this.h).r1;
            int[] iArr = i12Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            i12Var.d = 0;
        }
    }

    public void l(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((flb) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void m(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        flb flbVarF = RecyclerView.F(view);
        if (flbVarF.i()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (flbVarF.h()) {
            flbVarF.m.q(flbVarF);
        } else if (flbVarF.o()) {
            flbVarF.i &= -33;
        }
        n(flbVarF);
        if (recyclerView.b1 == null || flbVarF.f()) {
            return;
        }
        recyclerView.b1.d(flbVarF);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[LOOP:2: B:44:0x008b->B:48:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0099 A[EDGE_INSN: B:75:0x0099->B:49:0x0099 BREAK  A[LOOP:1: B:40:0x0078->B:47:0x0093], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0099 A[EDGE_INSN: B:76:0x0099->B:49:0x0099 BREAK  A[LOOP:1: B:40:0x0078->B:47:0x0093, LOOP_LABEL: LOOP:1: B:40:0x0078->B:47:0x0093], SYNTHETIC] */
    public void n(flb flbVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        i12 i12Var = recyclerView.r1;
        boolean zH = flbVar.h();
        View view = flbVar.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zH || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(flbVar.h());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.w());
            throw new IllegalArgumentException(sb.toString());
        }
        if (flbVar.i()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(flbVar);
            qc0.l(sb2, recyclerView.w());
            return;
        }
        if (flbVar.n()) {
            qc0.j("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.w()));
            return;
        }
        if ((flbVar.i & 16) == 0) {
            WeakHashMap weakHashMap = nvf.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (flbVar.f()) {
            if (this.b <= 0 || (flbVar.i & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.b && size > 0) {
                    l(0);
                    size--;
                }
                if (RecyclerView.O1 && size > 0) {
                    int i5 = flbVar.c;
                    if (i12Var.c != null) {
                        int i6 = i12Var.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((flb) arrayList.get(i)).c;
                                    if (i12Var.c != null) {
                                        break;
                                    }
                                    i3 = i12Var.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (i12Var.c[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (i12Var.c[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((flb) arrayList.get(i)).c;
                            if (i12Var.c != null) {
                                break;
                                break;
                            }
                            i3 = i12Var.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (i12Var.c[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, flbVar);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(flbVar, true);
            }
            z3 = z2;
        } else {
            z4 = false;
        }
        recyclerView.g.v(flbVar);
        if (z3 || z4 || !z) {
            return;
        }
        od4.j(view);
        flbVar.r = null;
        flbVar.q = null;
    }

    public void o(View view) {
        rkb rkbVar;
        RecyclerView recyclerView = (RecyclerView) this.h;
        flb flbVarF = RecyclerView.F(view);
        if ((flbVarF.i & 12) == 0 && flbVarF.j() && (rkbVar = recyclerView.b1) != null) {
            nr3 nr3Var = (nr3) rkbVar;
            if (flbVarF.c().isEmpty() && nr3Var.g && !flbVarF.e()) {
                ArrayList arrayList = (ArrayList) this.d;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.d = arrayList;
                }
                flbVarF.m = this;
                flbVarF.n = true;
                arrayList.add(flbVarF);
                return;
            }
        }
        if (flbVarF.e() && !flbVarF.g()) {
            recyclerView.z.getClass();
            qc0.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.w()));
        } else {
            flbVarF.m = this;
            flbVarF.n = false;
            ((ArrayList) this.c).add(flbVarF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:132:0x024d  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0303  */
    /* JADX WARN: Code duplicated, block: B:174:0x030d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0315  */
    /* JADX WARN: Code duplicated, block: B:179:0x0330  */
    /* JADX WARN: Code duplicated, block: B:182:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x033f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0364  */
    /* JADX WARN: Code duplicated, block: B:195:0x0374  */
    /* JADX WARN: Code duplicated, block: B:199:0x037f  */
    /* JADX WARN: Code duplicated, block: B:202:0x038a  */
    /* JADX WARN: Code duplicated, block: B:203:0x038d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0390  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:210:0x03af  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:221:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:242:0x042d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0432  */
    /* JADX WARN: Code duplicated, block: B:249:0x043b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0445  */
    /* JADX WARN: Code duplicated, block: B:252:0x044b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0455  */
    /* JADX WARN: Code duplicated, block: B:256:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x045e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109 A[EDGE_INSN: B:66:0x0109->B:87:0x0177 BREAK  A[LOOP:1: B:29:0x0063->B:41:0x008d]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x012a, please report this as an issue */
    public flb p(int i, long j) {
        flb flbVar;
        boolean z;
        long j2;
        long j3;
        View view;
        int iA;
        int i2;
        boolean z2;
        boolean z3;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z4;
        i6 i6Var;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j5;
        ViewGroup.LayoutParams layoutParams2;
        ukb ukbVar;
        int i3;
        int iA2;
        RecyclerView recyclerViewB;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i4;
        ArrayList arrayList4;
        int size2;
        int i5;
        View view2;
        int size3;
        int i6;
        flb flbVar2;
        flb flbVarF;
        ta0 ta0Var;
        zy1 zy1Var;
        int iIndexOfChild;
        zy1 zy1Var2;
        int iIndexOfChild2;
        int iS;
        flb flbVarF2;
        int i7;
        boolean z5;
        flb flbVar3;
        int size4;
        RecyclerView recyclerView = (RecyclerView) this.h;
        blb blbVar = recyclerView.s1;
        if (i < 0 || i >= blbVar.b()) {
            StringBuilder sbN = ib8.n(i, i, "Invalid item position ", "(", "). Item count:");
            sbN.append(blbVar.b());
            sbN.append(recyclerView.w());
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        boolean z6 = true;
        byte b = 0;
        if (blbVar.f) {
            ArrayList arrayList5 = (ArrayList) this.d;
            if (arrayList5 != null && (size4 = arrayList5.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 >= size4) {
                        recyclerView.z.getClass();
                        flbVar = null;
                        break;
                    }
                    flbVar = (flb) ((ArrayList) this.d).get(i8);
                    if (!flbVar.o() && flbVar.b() == i) {
                        flbVar.a(32);
                        break;
                    }
                    i8++;
                }
            } else {
                flbVar = null;
                break;
            }
            if (flbVar != null) {
                z = true;
            }
            if (flbVar == null) {
                arrayList2 = (ArrayList) this.e;
                arrayList3 = (ArrayList) this.c;
                size = arrayList3.size();
                i4 = 0;
                while (true) {
                    if (i4 < size) {
                        arrayList4 = (ArrayList) recyclerView.f.b;
                        size2 = arrayList4.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList4.get(i5);
                            flbVarF2 = RecyclerView.F(view2);
                            if (flbVarF2.b() != i && !flbVarF2.e() && !flbVarF2.g()) {
                                break;
                            }
                            i5++;
                        }
                        if (view2 != null) {
                            size3 = arrayList2.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size3) {
                                    flbVar = null;
                                    break;
                                }
                                flbVar2 = (flb) arrayList2.get(i6);
                                if (flbVar2.e() && flbVar2.b() == i) {
                                    View view3 = flbVar2.a;
                                    if (view3.getParent() == null || view3.getParent() == flbVar2.q) {
                                        arrayList2.remove(i6);
                                        flbVar = flbVar2;
                                        break;
                                    }
                                }
                                i6++;
                            }
                        } else {
                            flbVarF = RecyclerView.F(view2);
                            ta0Var = recyclerView.f;
                            zy1Var = (zy1) ta0Var.d;
                            iIndexOfChild = ((RecyclerView) ((g5b) ta0Var.c).b).indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                yg5.l(view2, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (zy1Var.u(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            zy1Var.p(iIndexOfChild);
                            ta0Var.U(view2);
                            ta0 ta0Var2 = recyclerView.f;
                            zy1Var2 = (zy1) ta0Var2.d;
                            iIndexOfChild2 = ((RecyclerView) ((g5b) ta0Var2.c).b).indexOfChild(view2);
                            if (iIndexOfChild2 == -1 && !zy1Var2.u(iIndexOfChild2)) {
                                iS = iIndexOfChild2 - zy1Var2.s(iIndexOfChild2);
                            } else {
                                iS = -1;
                            }
                            if (iS != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(flbVarF);
                                r3.k(sb, recyclerView.w());
                                return null;
                            }
                            recyclerView.f.l(iS);
                            o(view2);
                            flbVarF.a(8224);
                            flbVar = flbVarF;
                            break;
                        }
                    } else {
                        flbVar3 = (flb) arrayList3.get(i4);
                        if (flbVar3.o() && flbVar3.b() == i && !flbVar3.e() && (blbVar.f || !flbVar3.g())) {
                            flbVar3.a(32);
                            flbVar = flbVar3;
                            break;
                        }
                        i4++;
                    }
                }
                if (flbVar != null) {
                    if (!flbVar.g()) {
                        z5 = blbVar.f;
                    } else {
                        i7 = flbVar.c;
                        if (i7 >= 0 || i7 >= recyclerView.z.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + flbVar + recyclerView.w());
                        }
                        if (blbVar.f) {
                            recyclerView.z.getClass();
                            z5 = true;
                        } else {
                            recyclerView.z.getClass();
                            if (flbVar.e != 0) {
                                z5 = false;
                            } else {
                                recyclerView.z.getClass();
                                z5 = true;
                            }
                        }
                    }
                    if (z5) {
                        z = true;
                    } else {
                        flbVar.a(4);
                        if (flbVar.h()) {
                            recyclerView.removeDetachedView(flbVar.a, false);
                            flbVar.m.q(flbVar);
                        } else if (flbVar.o()) {
                            flbVar.i &= -33;
                        }
                        n(flbVar);
                        flbVar = null;
                    }
                }
            }
            if (flbVar == null) {
                iA2 = recyclerView.e.A(i, 0);
                if (iA2 >= 0 || iA2 >= recyclerView.z.a()) {
                    StringBuilder sbN2 = ib8.n(i, iA2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                    sbN2.append(blbVar.b());
                    sbN2.append(recyclerView.w());
                    throw new IndexOutOfBoundsException(sbN2.toString());
                }
                recyclerView.z.getClass();
                recyclerView.z.getClass();
                if (flbVar == null) {
                    xkb xkbVar = (xkb) d().a.get(0);
                    if (xkbVar != null) {
                        ArrayList arrayList6 = xkbVar.a;
                        if (arrayList6.isEmpty()) {
                            j2 = 3;
                            flbVar = null;
                        } else {
                            int size5 = arrayList6.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    flb flbVar4 = (flb) arrayList6.get(size5);
                                    j2 = 3;
                                    View view4 = flbVar4.a;
                                    if (view4.getParent() == null || view4.getParent() == flbVar4.q) {
                                        flbVar = (flb) arrayList6.remove(size5);
                                    } else {
                                        size5--;
                                    }
                                } else {
                                    j2 = 3;
                                    flbVar = null;
                                }
                            }
                        }
                    } else {
                        j2 = 3;
                        flbVar = null;
                    }
                    if (flbVar != null) {
                        flbVar.l();
                        int[] iArr = RecyclerView.L1;
                    }
                } else {
                    j2 = 3;
                }
                if (flbVar == null) {
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j6 = ((ykb) this.g).a(0).b;
                        if (j6 != 0 && j6 + nanoTime2 >= j) {
                            return null;
                        }
                    }
                    nkb nkbVar = recyclerView.z;
                    nkbVar.getClass();
                    try {
                        int i9 = x0f.a;
                        Trace.beginSection("RV CreateView");
                        flb flbVarC = nkbVar.c(recyclerView);
                        View view5 = flbVarC.a;
                        if (view5.getParent() != null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        flbVarC.e = 0;
                        Trace.endSection();
                        if (RecyclerView.O1 && (recyclerViewB = RecyclerView.B(view5)) != null) {
                            flbVarC.b = new WeakReference(recyclerViewB);
                        }
                        j3 = 4;
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        xkb xkbVarA = ((ykb) this.g).a(0);
                        long j7 = xkbVarA.b;
                        if (j7 != 0) {
                            nanoTime3 = (nanoTime3 / 4) + ((j7 / 4) * j2);
                        }
                        xkbVarA.b = nanoTime3;
                        flbVar = flbVarC;
                    } catch (Throwable th) {
                        int i10 = x0f.a;
                        Trace.endSection();
                        throw th;
                    }
                }
                view = flbVar.a;
                if (z && !blbVar.f) {
                    i3 = flbVar.i;
                    if ((i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                        flbVar.i = i3 & (-8193);
                        if (blbVar.i) {
                            rkb.b(flbVar);
                            rkb rkbVar = recyclerView.b1;
                            flbVar.c();
                            rkbVar.getClass();
                            h71 h71Var = new h71(5, b);
                            h71Var.b(flbVar);
                            recyclerView.Q(flbVar, h71Var);
                        }
                    }
                }
                if (blbVar.f || !flbVar.d()) {
                    if (flbVar.d() || (flbVar.i & 2) != 0 || flbVar.e()) {
                        iA = recyclerView.e.A(i, 0);
                        flbVar.r = null;
                        flbVar.q = recyclerView;
                        i2 = flbVar.e;
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            z2 = true;
                            j5 = ((ykb) this.g).a(i2).c;
                            if (j5 == 0 && j5 + nanoTime4 >= j) {
                                z4 = false;
                                z6 = true;
                            }
                        } else {
                            z2 = true;
                        }
                        nkb nkbVar2 = recyclerView.z;
                        nkbVar2.getClass();
                        if (flbVar.r == null) {
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            flbVar.c = iA;
                            flbVar.i = (flbVar.i & (-520)) | 1;
                            int i11 = x0f.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        flbVar.r = nkbVar2;
                        flbVar.c();
                        nkbVar2.b(flbVar, iA);
                        if (z3) {
                            arrayList = flbVar.j;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            flbVar.i &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof ukb) {
                                ((ukb) layoutParams).c = z2;
                            }
                            int i12 = x0f.a;
                            Trace.endSection();
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        xkb xkbVarA2 = ((ykb) this.g).a(flbVar.e);
                        j4 = xkbVarA2.c;
                        if (j4 != 0) {
                            nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                        }
                        xkbVarA2.c = nanoTime;
                        accessibilityManager = recyclerView.R0;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            WeakHashMap weakHashMap = nvf.a;
                            z6 = true;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            hlb hlbVar = recyclerView.z1;
                            if (hlbVar != null) {
                                glb glbVar = hlbVar.e;
                                if (glbVar != null) {
                                    View.AccessibilityDelegate accessibilityDelegateE = nvf.e(view);
                                    if (accessibilityDelegateE == null) {
                                        i6Var = null;
                                    } else {
                                        i6Var = accessibilityDelegateE instanceof h6 ? ((h6) accessibilityDelegateE).a : new i6(accessibilityDelegateE);
                                    }
                                    if (i6Var != null && i6Var != glbVar) {
                                        glbVar.e.put(view, i6Var);
                                    }
                                }
                                nvf.j(view, glbVar);
                            }
                        } else {
                            z6 = true;
                        }
                        if (blbVar.f) {
                            flbVar.f = i;
                        }
                        z4 = z6;
                    }
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        ukbVar = (ukb) recyclerView.generateDefaultLayoutParams();
                        view.setLayoutParams(ukbVar);
                    } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                        ukbVar = (ukb) layoutParams2;
                    } else {
                        ukbVar = (ukb) recyclerView.generateLayoutParams(layoutParams2);
                        view.setLayoutParams(ukbVar);
                    }
                    ukbVar.a = flbVar;
                    if (z || !z4) {
                        z6 = false;
                    }
                    ukbVar.d = z6;
                    return flbVar;
                }
                flbVar.f = i;
                z4 = false;
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    ukbVar = (ukb) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(ukbVar);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    ukbVar = (ukb) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(ukbVar);
                } else {
                    ukbVar = (ukb) layoutParams2;
                }
                ukbVar.a = flbVar;
                if (z) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                ukbVar.d = z6;
                return flbVar;
            }
            j2 = 3;
            j3 = 4;
            view = flbVar.a;
            if (z) {
                i3 = flbVar.i;
                if ((i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                    flbVar.i = i3 & (-8193);
                    if (blbVar.i) {
                        rkb.b(flbVar);
                        rkb rkbVar2 = recyclerView.b1;
                        flbVar.c();
                        rkbVar2.getClass();
                        h71 h71Var2 = new h71(5, b);
                        h71Var2.b(flbVar);
                        recyclerView.Q(flbVar, h71Var2);
                    }
                }
            }
            if (blbVar.f) {
                if (flbVar.d()) {
                }
                iA = recyclerView.e.A(i, 0);
                flbVar.r = null;
                flbVar.q = recyclerView;
                i2 = flbVar.e;
                long nanoTime5 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    z2 = true;
                    j5 = ((ykb) this.g).a(i2).c;
                    if (j5 == 0) {
                    }
                } else {
                    z2 = true;
                }
                nkb nkbVar3 = recyclerView.z;
                nkbVar3.getClass();
                if (flbVar.r == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    flbVar.c = iA;
                    flbVar.i = (flbVar.i & (-520)) | 1;
                    int i13 = x0f.a;
                    Trace.beginSection("RV OnBindView");
                }
                flbVar.r = nkbVar3;
                flbVar.c();
                nkbVar3.b(flbVar, iA);
                if (z3) {
                    arrayList = flbVar.j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    flbVar.i &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ukb) {
                        ((ukb) layoutParams).c = z2;
                    }
                    int i14 = x0f.a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                xkb xkbVarA3 = ((ykb) this.g).a(flbVar.e);
                j4 = xkbVarA3.c;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                xkbVarA3.c = nanoTime;
                accessibilityManager = recyclerView.R0;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (blbVar.f) {
                    flbVar.f = i;
                }
                z4 = z6;
            } else {
                if (flbVar.d()) {
                }
                iA = recyclerView.e.A(i, 0);
                flbVar.r = null;
                flbVar.q = recyclerView;
                i2 = flbVar.e;
                long nanoTime6 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    z2 = true;
                    j5 = ((ykb) this.g).a(i2).c;
                    if (j5 == 0) {
                    }
                } else {
                    z2 = true;
                }
                nkb nkbVar4 = recyclerView.z;
                nkbVar4.getClass();
                if (flbVar.r == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    flbVar.c = iA;
                    flbVar.i = (flbVar.i & (-520)) | 1;
                    int i15 = x0f.a;
                    Trace.beginSection("RV OnBindView");
                }
                flbVar.r = nkbVar4;
                flbVar.c();
                nkbVar4.b(flbVar, iA);
                if (z3) {
                    arrayList = flbVar.j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    flbVar.i &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ukb) {
                        ((ukb) layoutParams).c = z2;
                    }
                    int i16 = x0f.a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                xkb xkbVarA4 = ((ykb) this.g).a(flbVar.e);
                j4 = xkbVarA4.c;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                xkbVarA4.c = nanoTime;
                accessibilityManager = recyclerView.R0;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (blbVar.f) {
                    flbVar.f = i;
                }
                z4 = z6;
            }
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                ukbVar = (ukb) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(ukbVar);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                ukbVar = (ukb) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(ukbVar);
            } else {
                ukbVar = (ukb) layoutParams2;
            }
            ukbVar.a = flbVar;
            if (z) {
                z6 = false;
            } else {
                z6 = false;
            }
            ukbVar.d = z6;
            return flbVar;
        }
        flbVar = null;
        z = false;
        if (flbVar == null) {
            arrayList2 = (ArrayList) this.e;
            arrayList3 = (ArrayList) this.c;
            size = arrayList3.size();
            i4 = 0;
            while (true) {
                if (i4 < size) {
                    arrayList4 = (ArrayList) recyclerView.f.b;
                    size2 = arrayList4.size();
                    i5 = 0;
                    while (true) {
                        if (i5 < size2) {
                            view2 = null;
                            break;
                        }
                        view2 = (View) arrayList4.get(i5);
                        flbVarF2 = RecyclerView.F(view2);
                        if (flbVarF2.b() != i) {
                        }
                        i5++;
                    }
                    if (view2 != null) {
                        size3 = arrayList2.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size3) {
                                flbVar = null;
                                break;
                            }
                            flbVar2 = (flb) arrayList2.get(i6);
                            if (flbVar2.e()) {
                            }
                            i6++;
                        }
                    } else {
                        flbVarF = RecyclerView.F(view2);
                        ta0Var = recyclerView.f;
                        zy1Var = (zy1) ta0Var.d;
                        iIndexOfChild = ((RecyclerView) ((g5b) ta0Var.c).b).indexOfChild(view2);
                        if (iIndexOfChild >= 0) {
                            yg5.l(view2, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (zy1Var.u(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        zy1Var.p(iIndexOfChild);
                        ta0Var.U(view2);
                        ta0 ta0Var3 = recyclerView.f;
                        zy1Var2 = (zy1) ta0Var3.d;
                        iIndexOfChild2 = ((RecyclerView) ((g5b) ta0Var3.c).b).indexOfChild(view2);
                        if (iIndexOfChild2 == -1) {
                            iS = -1;
                        } else {
                            iS = iIndexOfChild2 - zy1Var2.s(iIndexOfChild2);
                        }
                        if (iS != -1) {
                            StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb2.append(flbVarF);
                            r3.k(sb2, recyclerView.w());
                            return null;
                        }
                        recyclerView.f.l(iS);
                        o(view2);
                        flbVarF.a(8224);
                        flbVar = flbVarF;
                        break;
                    }
                } else {
                    flbVar3 = (flb) arrayList3.get(i4);
                    if (flbVar3.o()) {
                    }
                    i4++;
                }
            }
            if (flbVar != null) {
                if (!flbVar.g()) {
                    i7 = flbVar.c;
                    if (i7 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + flbVar + recyclerView.w());
                }
                z5 = blbVar.f;
                if (z5) {
                    flbVar.a(4);
                    if (flbVar.h()) {
                        recyclerView.removeDetachedView(flbVar.a, false);
                        flbVar.m.q(flbVar);
                    } else if (flbVar.o()) {
                        flbVar.i &= -33;
                    }
                    n(flbVar);
                    flbVar = null;
                } else {
                    z = true;
                }
            }
        }
        if (flbVar == null) {
            iA2 = recyclerView.e.A(i, 0);
            if (iA2 >= 0) {
            }
            StringBuilder sbN3 = ib8.n(i, iA2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbN3.append(blbVar.b());
            sbN3.append(recyclerView.w());
            throw new IndexOutOfBoundsException(sbN3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = flbVar.a;
        if (z) {
            i3 = flbVar.i;
            if ((i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                flbVar.i = i3 & (-8193);
                if (blbVar.i) {
                    rkb.b(flbVar);
                    rkb rkbVar3 = recyclerView.b1;
                    flbVar.c();
                    rkbVar3.getClass();
                    h71 h71Var3 = new h71(5, b);
                    h71Var3.b(flbVar);
                    recyclerView.Q(flbVar, h71Var3);
                }
            }
        }
        if (blbVar.f) {
            if (flbVar.d()) {
            }
            iA = recyclerView.e.A(i, 0);
            flbVar.r = null;
            flbVar.q = recyclerView;
            i2 = flbVar.e;
            long nanoTime7 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                z2 = true;
                j5 = ((ykb) this.g).a(i2).c;
                if (j5 == 0) {
                }
            } else {
                z2 = true;
            }
            nkb nkbVar5 = recyclerView.z;
            nkbVar5.getClass();
            if (flbVar.r == null) {
                z3 = z2;
            } else {
                z3 = false;
            }
            if (z3) {
                flbVar.c = iA;
                flbVar.i = (flbVar.i & (-520)) | 1;
                int i17 = x0f.a;
                Trace.beginSection("RV OnBindView");
            }
            flbVar.r = nkbVar5;
            flbVar.c();
            nkbVar5.b(flbVar, iA);
            if (z3) {
                arrayList = flbVar.j;
                if (arrayList != null) {
                    arrayList.clear();
                }
                flbVar.i &= -1025;
                layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ukb) {
                    ((ukb) layoutParams).c = z2;
                }
                int i18 = x0f.a;
                Trace.endSection();
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime7;
            xkb xkbVarA5 = ((ykb) this.g).a(flbVar.e);
            j4 = xkbVarA5.c;
            if (j4 != 0) {
                nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
            }
            xkbVarA5.c = nanoTime;
            accessibilityManager = recyclerView.R0;
            if (accessibilityManager == null) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (blbVar.f) {
                flbVar.f = i;
            }
            z4 = z6;
        } else {
            if (flbVar.d()) {
            }
            iA = recyclerView.e.A(i, 0);
            flbVar.r = null;
            flbVar.q = recyclerView;
            i2 = flbVar.e;
            long nanoTime8 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                z2 = true;
                j5 = ((ykb) this.g).a(i2).c;
                if (j5 == 0) {
                }
            } else {
                z2 = true;
            }
            nkb nkbVar6 = recyclerView.z;
            nkbVar6.getClass();
            if (flbVar.r == null) {
                z3 = z2;
            } else {
                z3 = false;
            }
            if (z3) {
                flbVar.c = iA;
                flbVar.i = (flbVar.i & (-520)) | 1;
                int i19 = x0f.a;
                Trace.beginSection("RV OnBindView");
            }
            flbVar.r = nkbVar6;
            flbVar.c();
            nkbVar6.b(flbVar, iA);
            if (z3) {
                arrayList = flbVar.j;
                if (arrayList != null) {
                    arrayList.clear();
                }
                flbVar.i &= -1025;
                layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ukb) {
                    ((ukb) layoutParams).c = z2;
                }
                int i110 = x0f.a;
                Trace.endSection();
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime8;
            xkb xkbVarA6 = ((ykb) this.g).a(flbVar.e);
            j4 = xkbVarA6.c;
            if (j4 != 0) {
                nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
            }
            xkbVarA6.c = nanoTime;
            accessibilityManager = recyclerView.R0;
            if (accessibilityManager == null) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (blbVar.f) {
                flbVar.f = i;
            }
            z4 = z6;
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            ukbVar = (ukb) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(ukbVar);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            ukbVar = (ukb) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(ukbVar);
        } else {
            ukbVar = (ukb) layoutParams2;
        }
        ukbVar.a = flbVar;
        if (z) {
            z6 = false;
        } else {
            z6 = false;
        }
        ukbVar.d = z6;
        return flbVar;
    }

    public void q(flb flbVar) {
        if (flbVar.n) {
            ((ArrayList) this.d).remove(flbVar);
        } else {
            ((ArrayList) this.c).remove(flbVar);
        }
        flbVar.m = null;
        flbVar.n = false;
        flbVar.i &= -33;
    }

    public void r() {
        ArrayList arrayList = (ArrayList) this.e;
        tkb tkbVar = ((RecyclerView) this.h).E0;
        this.b = this.a + (tkbVar != null ? tkbVar.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            l(size);
        }
    }

    public gp3(rr5 rr5Var, rr5 rr5Var2, int i, int i2, tj0 tj0Var, vj0 vj0Var, gye gyeVar, Object obj) {
        this.c = rr5Var;
        this.d = rr5Var2;
        this.a = i;
        this.b = i2;
        this.e = tj0Var;
        this.f = vj0Var;
        this.g = gyeVar;
        this.h = obj;
    }

    public gp3(hcd hcdVar) {
        this.c = hcdVar;
        this.d = q1c.f(mf9.a);
        this.e = new sz9(0);
        this.f = p0e.a;
        this.h = new sz9(0);
    }
}
