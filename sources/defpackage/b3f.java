package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b3f implements Iterator, zm7 {
    public final /* synthetic */ int a = 0;
    public Iterator b;
    public final Object c;

    public b3f(Iterator it) {
        it.getClass();
        this.c = new ArrayList();
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((c3f) obj).b.d(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                l2 l2Var = viewGroup != null ? new l2(8, viewGroup) : null;
                if (l2Var == null || !l2Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) s72.F0(arrayList);
                        x72.k0(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = l2Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b3f(c3f c3fVar) {
        this.c = c3fVar;
        this.b = c3fVar.a.iterator();
    }
}
