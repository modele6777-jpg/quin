package defpackage;

import android.util.Log;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yr0 extends qm9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(a26 a26Var) {
        super(true);
        this.d = 3;
        this.e = a26Var;
    }

    @Override // defpackage.qm9
    public void a() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((j6) obj).n();
                break;
            case 1:
                zx5 zx5Var = (zx5) obj;
                if (zx5.I(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + zx5Var);
                }
                if (zx5.I(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + zx5Var.h);
                }
                hs0 hs0Var = zx5Var.h;
                if (hs0Var != null) {
                    hs0Var.r = false;
                    hs0Var.d();
                    hs0 hs0Var2 = zx5Var.h;
                    m45 m45Var = new m45(4, zx5Var);
                    ArrayList arrayList = hs0Var2.p;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hs0Var2.p = arrayList;
                    }
                    arrayList.add(m45Var);
                    zx5Var.h.e(false, true);
                    zx5Var.i = true;
                    zx5Var.z(true);
                    zx5Var.C();
                    zx5Var.i = false;
                    zx5Var.h = null;
                }
                break;
        }
    }

    @Override // defpackage.qm9
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((j6) obj).o();
                return;
            case 1:
                zx5 zx5Var = (zx5) obj;
                if (zx5.I(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + zx5Var);
                }
                yr0 yr0Var = zx5Var.j;
                ArrayList arrayList = zx5Var.n;
                zx5Var.i = true;
                zx5Var.z(true);
                zx5Var.i = false;
                if (zx5Var.h == null) {
                    if (yr0Var.b) {
                        if (zx5.I(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        zx5Var.P();
                        return;
                    } else {
                        if (zx5.I(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        zx5Var.g.b().a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(zx5.D(zx5Var.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            r3.f();
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = zx5Var.h.a.iterator();
                while (it3.hasNext()) {
                    kx5 kx5Var = ((ky5) it3.next()).b;
                    if (kx5Var != null) {
                        kx5Var.X = false;
                    }
                }
                for (bt3 bt3Var : zx5Var.f(new ArrayList(Collections.singletonList(zx5Var.h)), 0, 1)) {
                    ArrayList arrayList2 = bt3Var.c;
                    if (zx5.I(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    bt3Var.d(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ((lud) it4.next()).getClass();
                        x72.g0(arrayList3, null);
                    }
                    List listJ1 = s72.j1(s72.o1(arrayList3));
                    int size = listJ1.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((kud) listJ1.get(i2)).a(bt3Var.a);
                    }
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((lud) arrayList2.get(i3)).getClass();
                    }
                    List listJ2 = s72.j1(arrayList2);
                    if (listJ2.size() > 0) {
                        ((lud) listJ2.get(0)).getClass();
                        throw null;
                    }
                }
                Iterator it5 = zx5Var.h.a.iterator();
                while (it5.hasNext()) {
                    kx5 kx5Var2 = ((ky5) it5.next()).b;
                    if (kx5Var2 != null && kx5Var2.U0 == null) {
                        zx5Var.g(kx5Var2).j();
                    }
                }
                zx5Var.h = null;
                zx5Var.d0();
                if (zx5.I(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + yr0Var.b + " for  FragmentManager " + zx5Var);
                    return;
                }
                return;
            case 2:
                ((ka9) obj).g();
                return;
            default:
                ((a26) obj).d(this);
                return;
        }
    }

    @Override // defpackage.qm9
    public void c(wr0 wr0Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((j6) obj).p(wr0Var);
                return;
            case 1:
                zx5 zx5Var = (zx5) obj;
                if (zx5.I(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + zx5Var);
                }
                if (zx5Var.h != null) {
                    for (bt3 bt3Var : zx5Var.f(new ArrayList(Collections.singletonList(zx5Var.h)), 0, 1)) {
                        bt3Var.getClass();
                        if (zx5.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + wr0Var.c);
                        }
                        ArrayList arrayList = bt3Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((lud) it.next()).getClass();
                            x72.g0(arrayList2, null);
                        }
                        List listJ1 = s72.j1(s72.o1(arrayList2));
                        int size = listJ1.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((kud) listJ1.get(i2)).b(wr0Var, bt3Var.a);
                        }
                    }
                    Iterator it2 = zx5Var.n.iterator();
                    if (it2.hasNext()) {
                        throw kv2.g(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.qm9
    public void d(wr0 wr0Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((j6) obj).q();
                break;
            case 1:
                zx5 zx5Var = (zx5) obj;
                if (zx5.I(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + zx5Var);
                }
                zx5Var.w();
                zx5Var.x(new yx5(zx5Var), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr0(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
