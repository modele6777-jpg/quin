package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class by5 extends ewf {
    public static final hu3 v = new hu3(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public by5(boolean z) {
        this.e = z;
    }

    @Override // defpackage.ewf
    public final void e() {
        if (zx5.I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || by5.class != obj.getClass()) {
            return false;
        }
        by5 by5Var = (by5) obj;
        return this.b.equals(by5Var.b) && this.c.equals(by5Var.c) && this.d.equals(by5Var.d);
    }

    public final void f(kx5 kx5Var, boolean z) {
        if (zx5.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + kx5Var);
        }
        h(kx5Var.e, z);
    }

    public final void g(String str, boolean z) {
        if (zx5.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z);
    }

    public final void h(String str, boolean z) {
        HashMap map = this.c;
        by5 by5Var = (by5) map.get(str);
        if (by5Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(by5Var.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    by5Var.g((String) it.next(), true);
                }
            }
            by5Var.e();
            map.remove(str);
        }
        HashMap map2 = this.d;
        owf owfVar = (owf) map2.get(str);
        if (owfVar != null) {
            owfVar.a();
            map2.remove(str);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final void i(kx5 kx5Var) {
        if (this.g) {
            if (zx5.I(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(kx5Var.e) == null || !zx5.I(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + kx5Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
