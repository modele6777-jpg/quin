package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bt3 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public bt3(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList, boolean z) {
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            throw null;
        }
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        new ArrayList();
        new ArrayList();
        throw null;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            c();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<lud> arrayList = new ArrayList(this.c);
                this.c.clear();
                for (lud ludVar : arrayList) {
                    if (!this.b.isEmpty()) {
                        throw null;
                    }
                    ludVar.getClass();
                }
                for (lud ludVar2 : arrayList) {
                    if (this.d) {
                        if (zx5.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + ludVar2);
                        }
                        ludVar2.b();
                        throw null;
                    }
                    if (zx5.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + ludVar2);
                    }
                    ludVar2.a(this.a);
                    this.d = false;
                    this.c.add(ludVar2);
                }
                if (this.b.isEmpty()) {
                    return;
                }
                e();
                ArrayList arrayList2 = new ArrayList(this.b);
                if (arrayList2.isEmpty()) {
                    return;
                }
                this.b.clear();
                this.c.addAll(arrayList2);
                if (zx5.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                a(arrayList2, this.e);
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (zx5.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                e();
                d(this.b);
                ArrayList<lud> arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((lud) it.next()).getClass();
                }
                for (lud ludVar : arrayList) {
                    if (zx5.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + ludVar);
                    }
                    ludVar.a(this.a);
                }
                ArrayList<lud> arrayList2 = new ArrayList(this.b);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((lud) it2.next()).getClass();
                }
                for (lud ludVar2 : arrayList2) {
                    if (zx5.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + ludVar2);
                    }
                    ludVar2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lud) it.next()).getClass();
            x72.g0(arrayList2, null);
        }
        List listJ1 = s72.j1(s72.o1(arrayList2));
        int size = listJ1.size();
        for (int i = 0; i < size; i++) {
            kud kudVar = (kud) listJ1.get(i);
            kudVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!kudVar.a) {
                kudVar.c(viewGroup);
            }
            kudVar.a = true;
        }
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((lud) it.next()).getClass();
        }
    }
}
