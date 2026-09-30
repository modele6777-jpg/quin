package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mx implements sx {
    public final ArrayList a;

    public mx(int i, boolean z) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a(sr5 sr5Var) {
        boolean z = sr5Var instanceof gg9;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(sr5Var);
        } else {
            if (!(sr5Var instanceof fh2)) {
                ap.c();
                return;
            }
            Iterator it = ((fh2) sr5Var).a.iterator();
            while (it.hasNext()) {
                arrayList.add((gg9) it.next());
            }
        }
    }

    public void b(Object obj) {
        this.a.add(obj);
    }

    public void c(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    @Override // defpackage.sx
    public du0 c0() {
        ArrayList arrayList = this.a;
        return ((bp7) arrayList.get(0)).c() ? new xc6(arrayList, 1) : new j1a(arrayList);
    }

    public void d(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k5f k5fVar = (k5f) arrayList.get(size);
            Matrix matrix = xqf.a;
            if (k5fVar != null && !k5fVar.a) {
                xqf.a(path, k5fVar.d.i() / 100.0f, k5fVar.e.i() / 100.0f, k5fVar.f.i() / 360.0f);
            }
        }
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return sb.toString();
            }
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((std) arrayList.get(i)).a);
            i++;
        }
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vtd vtdVar = ((std) it.next()).b;
            if (vtdVar != null) {
                arrayList.add(vtdVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.sx
    public List i0() {
        return this.a;
    }

    @Override // defpackage.sx
    public boolean j0() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((bp7) arrayList.get(0)).c();
    }

    public mx(ArrayList arrayList) {
        this.a = arrayList;
    }

    public mx(int i) {
        this.a = new ArrayList(i);
    }
}
