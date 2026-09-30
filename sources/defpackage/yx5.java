package defpackage;

import android.util.Log;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yx5 implements wx5 {
    public final /* synthetic */ zx5 a;

    public yx5(zx5 zx5Var) {
        this.a = zx5Var;
    }

    @Override // defpackage.wx5
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zQ;
        zx5 zx5Var = this.a;
        ArrayList arrayList3 = zx5Var.n;
        if (zx5.I(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + zx5Var.a);
        }
        if (zx5Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zQ = false;
        } else {
            hs0 hs0Var = (hs0) ks0.f(1, zx5Var.d);
            zx5Var.h = hs0Var;
            Iterator it = hs0Var.a.iterator();
            while (it.hasNext()) {
                kx5 kx5Var = ((ky5) it.next()).b;
                if (kx5Var != null) {
                    kx5Var.X = true;
                }
            }
            zQ = zx5Var.Q(-1, 0, arrayList, arrayList2);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(zx5.D((hs0) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    r3.f();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zQ;
    }
}
